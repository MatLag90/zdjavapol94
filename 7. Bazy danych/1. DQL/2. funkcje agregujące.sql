-- Jeśli w zapytaniu użyjemy funkcji agregującej, to w wyniku uzyskamy jeden wiersz. Argumentem funkcji będą wartości wyliczone dla wszystkich wierszy.
-- W części SELECT możemy nazywać kolumny wyniku. Po wyrażeniu zapisujemy naszą nazwę kolumny (słówko AS jest opcjonalne, ale będziemy jego używali).
SELECT
    COUNT(*) AS "Liczba pracowników",
    COUNT(year_of_birth) AS "Liczba pracowników z podanym rokiem urodzenia",
    MIN(year_of_birth) AS "Najmniejszy rok urodzenia",
    MIN(first_name) AS "Najmniejsze imię",
    MAX(year_of_birth) AS "Największy rok urodzenia",
    MAX(first_name) AS "Największe imię",
    AVG(year_of_birth) AS "Średni rok urodzenia",
    SUM(id) AS "Suma identyfikatorów"
FROM
    employee
    
-- Funkcja COUNT zlicza wiersze (jeśli przekażemy jako argument wyrażenie, np. nazwę kolumny, to zliczy te, dla których wyrażenie, np. wartość w kolumnie nie jest NULLem)
-- Funkcje MIN i MAX wybierają wartości najmniejszą i największą
-- Funkcja AVG liczy średnią
-- Funkcja SUM liczy sumę