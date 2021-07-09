-- 1.0 Wybierz imiona, nazwiska i rok urodzenia wszystkich pracowników.
SELECT
    first_name,
    last_name,
    year_of_birth
FROM
    employee;
    
-- 1.1 Wybierz imiona i nazwiska dorosłych pracowników.
SELECT
    first_name,
    last_name
FROM
    employee
WHERE
    year_of_birth <= 2003;
    
SELECT
    first_name,
    last_name
FROM
    employee
WHERE
    2021 - year_of_birth >= 18;
    
SELECT
    first_name,
    last_name
FROM
    employee
WHERE
    YEAR(CURDATE()) - year_of_birth >= 18;
    

-- 1.2 Wybierz imiona i nazwiska osob o inicjałach KM.
SELECT
    first_name,
    last_name
FROM
    employee
WHERE
    first_name LIKE "K%"
    AND
    last_name LIKE "M%";
    
-- 1.3 Wybierz wszystkie imiona pracowników (bez powtórzeń - googlujemy).
SELECT DISTINCT
    first_name
FROM
    employee;
    
-- 1.4 Wybierz lata, w których urodzili się pracownicy o imieniu "Adam" lub "Anna".
SELECT
    year_of_birth
FROM
    employee
WHERE
    first_name = "Adam"
    OR
    first_name = "Anna";

-- 1.5 Wybierz wszystkie dane osób o imieniu "Adam" oraz urodzonych przed 1980 rokiem.
SELECT
    *
FROM
    employee
WHERE
    first_name = "Adam"
    AND
    year_of_birth < 1980;

-- 1.6 Wybierz nazwiska wszystkich pracowników, którzy urodzili się w latach 80'
-- !!!!!! Po rozwiązaniu zadania, rozwiąż je przy użyciu operatora BETWEEN !!!!!!!!
-- 1.7 Rozwiąż zadanie 1.4 przy użyciu słówka kluczowego IN
-- 1.8 Wybierz trzy najstarsze osoby.
-- 1.9 Wybierz drugą najstarszą osobę.