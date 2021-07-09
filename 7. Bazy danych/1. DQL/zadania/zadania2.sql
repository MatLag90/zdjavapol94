-- 2.1 Wybierz ilu jest pracowników o imieniu 'Adam'.
SELECT
    COUNT(*)
FROM
    employee
WHERE
    first_name = "Adam";
    
-- 2.2 Wypisz rok urodzenia najstarszego pracownika.
SELECT
    MIN(year_of_birth)
FROM
    employee;

-- 2.3 Wypisz wiek najstarszego pracownika.
SELECT
    YEAR(CURDATE()) - MIN(year_of_birth)
FROM
    employee;
    
-- 2.4 Wybierz średnią wieku pracowników płci męskiej (dla uproszczenia przyjmijmy, że imiona mężczyzn nie kończą się na literę 'a' - docelowo oczywiście byłaby dodatkowa kolumna mówiąca o płci pracownika).
SELECT
    YEAR(CURDATE()) - AVG(year_of_birth)
FROM
    employee
WHERE
    first_name NOT LIKE "%a"; -- NOT first_name LIKE "%a"
    
-- 2.5 Policz sumę lat wszystkich pracowników.
-- 2.6 Wypisz wszystkie dane najstarszego pracownika. (google: subquery)
SELECT
    *
FROM
    employee
WHERE
    year_of_birth = (
        SELECT MIN(year_of_birth)
        FROM employee
    );

-- 2.7 Wypisz dane pracowników, którzy żyją dłużej od pracownika nazywającego się Adam Nowak.
-- 2.8 Dla poprzednich zadań nazwij kolumny wyniku.
-- 2.9 Wybierz nazwiska pracowników, którzy mają tak samo na imiona, jak Kowalscy.