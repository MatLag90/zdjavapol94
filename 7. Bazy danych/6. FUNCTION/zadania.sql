DELIMITER $$
-- 1. Napisz funkcję factorial, która wyliczy silnię zadanego argumentu.
CREATE FUNCTION my_factorial(
    p_n INT
) RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE result INT DEFAULT 1;
    WHILE p_n > 1 DO
        SET result = result * p_n;
        SET p_n = p_n - 1;
    END WHILE;
    RETURN result;
END$$

SELECT my_factorial(5)$$

-- 2. Napisz dwuargumentową funkcję my_power, która podniesie pierwszy argument do potęgi równej drugiemu argumentowi. Zakładamy, że drugi argument jest liczbą dodatnią.
CREATE FUNCTION my_power(
    p_a INT, -- 4
    p_b INT -- 0
) RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE result INT DEFAULT 1; -- 64
    WHILE p_b > 0 DO
        SET result = result * p_a; 
        SET p_b = p_b - 1;
    END WHILE;
    RETURN result;
END$$

SELECT my_power(4, 3)$$

-- 3. Korzystając z algorytmu Euklidesa napisz funkcję gcd, zwracającą największy wspólny dzielnik dwóch argumentów (liczb całkowitych dodatnich). Przykład działania algorytmu:
-- GCD(32, 8) = GCD(32-8, 8) = GCD(24, 8) = 
-- = GCD(24 - 8, 8) = GCD(16, 8) = GCD(16 - 8, 8)
-- = GCD(8, 8)
-- GCD(24, 16) = GCD(24 - 16, 16) = GCD(8, 16) 
-- = GCD(8, 16 - 8) = GCD(8, 8)
-- 4. Napisz funkcję format_date, która będzie odpowiednikiem wbudowanej funkcji DATE_FORMAT. Funkcja powinna przyjąć dwa parametry - datę (typu DATE) oraz łańcuch znaków (format daty). Dostępne powinniśmy mieć:
-- YYYY - rok w postaci czterocyfrowej
-- YY - rok w postaci dwucyfrowej
-- M - miesiąc w postaci jedno/dwucyfrowej
-- MM - miesiąc w postaci dwucyfrowej
-- D - dzień w postaci jedno/dwucyfrowej
-- DD - dzień w postaci dwucyfrowej
-- Czyli funkcja dla parametrów: '2020-07-04', 'DD.MM.YYYY' zwróci 04.07.2020