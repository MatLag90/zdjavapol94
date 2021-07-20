-- W ciele funkcji znajdą się instrukcje, które będziemy kończyli średnikiem.
-- Jako że polecenie CREATE FUNCTION ... wraz z ciałem to tak naprawdę jedno polecenie, musimy określić inny "rozdzielacz" zapytań.
-- Wybierzemy znaki $$
DELIMITER $$
-- Tworzymy funkcję o nazwie my_add
CREATE FUNCTION my_add ( -- która przyjmie dwa parametry typu int
	p_a INT, -- pierwszy parametr nazywa się p_a i jest typu int
    p_b INT -- drugi parametr nazywa się p_b i jest typu int
) RETURNS INT -- która zwróci sumę argumentów (typu int)
DETERMINISTIC -- informacja, że funkcja działa deterministycznie (jej wynik zależy jedynie od argumentów i dla takich
-- samych argumentów zwróci tę samą wartość.
BEGIN
	RETURN p_a + p_b;
END$$

-- Po wywołaniu powyższego zapytania mamy utworzoną funkcję. Możemy jej użyć analogicznie do wbudowanych funkcji MYSQL:
SELECT my_add(3, 5)$$

-- Funkcja zwróci większy z dwóch argumentów
CREATE FUNCTION my_max(
	p_a INT,
    p_b INT
) RETURNS INT
DETERMINISTIC
BEGIN
	-- Do rozwiązania użyjemy instrukcji warunkowej:
	IF p_a > p_b THEN
		RETURN p_a;
	ELSE 
		RETURN p_b;
	END IF;
END$$

SELECT my_max(3, 5)$$

-- Funkcja zwróci sumę wszystkich liczb naturalnych niewiększych od zadanej
CREATE FUNCTION my_sum_up_to(
	p_n INT
) RETURNS INT
DETERMINISTIC
BEGIN
	-- Zmienne deklarujemy na starcie bloku kodu.
	DECLARE result INT DEFAULT 0; -- int result = 0;
    WHILE p_n > 0 DO
		-- Instrukcje przypisania rozpoczynamy od słówka SET:
		SET result = result + p_n;
        SET p_n = p_n - 1;
    END WHILE;
    RETURN result;
END$$
SELECT my_sum_up_to(5)