-- W MySQL mamy do dyspozycji zestaw różnych wbudowanych funkcji.
-- Funckja CONCAT zwraca konkatenację, może przyjść dowolną liczbę argumentów.
SELECT CONCAT("ABC", "DEF");
SELECT CONCAT("ABC", "DEF", "GHI");

-- Funkcja IF zwraca drugi argument, jeśli pierwszy argument jest prawdziwy. Gdy pierwszy argument jest nieprawdziwy, zwraca trzeci argument.
SELECT IF(1 = 1, "A", "B");
SELECT IF(1 = 0, "A", "B");

-- NULL porównujemy za pomocą operatora IS!!!!!!!!!!!!!!!
SELECT NULL = NULL;
SELECT NULL <> NULL;
SELECT NULL IS NULL;

SELECT *
FROM employee
WHERE year_of_birth IS NULL; -- analogicznie: IS NOT NULL

-- Funkcja IFNULL zwróci pierwszy argument, jeśli jest różny od NULL. Jeśli pierwszy argument to NULL to zwróci drugi.
SELECT IFNULL(NULL, "Wartość zwrócona, jeśli pierwszy argument to NULL");

SELECT
    first_name,
    last_name,
    IFNULL(year_of_birth, "Nie podano roku urodzenia") AS year_of_birth
FROM
    employee;
    
-- Wyrażenie CASE możemy użyć jak instrukcji if .. else if.. else znanej z Javy dla wyliczenia wartości.   
SELECT
    first_name,
    last_name,
    CASE
        WHEN year_of_birth > 1990 THEN "Urodzony po roku 1990"
        WHEN year_of_birth > 1980 THEN "Urodzony od 1980 do 1990"
        ELSE "Urodzony do roku 1980 lub brak informacji o roku urodzenia"
    END AS year_of_birth_info
FROM
    employee;
    
-- Lub też jak instrukcji switch - w takim wypadku zapisujemy wyrażenie po słówku CASE, a po słówku WHEN zapisujemy wartość, dla której wynik przygotujemy.
SELECT
    first_name,
    last_name,
    CASE year_of_birth
        WHEN 1974 THEN "Urodzony w roku 1974"
        WHEN 1974 THEN "Urodzony w roku 1965"
        ELSE "Urodzony w innym roku niż 1974 i 1965"
    END AS year_of_birth_info
FROM
    employee;