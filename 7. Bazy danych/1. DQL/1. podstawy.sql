-- SQL (Structural Query Language) to język zapytań do zarządzania bazami danych.
-- Dzieli się na cztery główne podzbiory:
-- DQL (Data Query Language) - wybieranie danych (SELECT)
-- DML (Data Manipulation Language) - edycja danych (UPDATE, DELETE, INSERT, TRUNCATE ...)
-- DDL (Data Definition Language) - edycja struktury (CREATE, ALTER, DROP ...)
-- DCL (Data Control Language) - kontrola danych - zarządzanie uprawnieniami (GRANT, REVOKE, DENY ...)

-- W taki sposób w języku SQL zapisujemy komentarze

-- W jednym skrypcie SQL możemy zawrzeć wiele zapytań (domyślnie znakiem rozdzielającym zapytania jest średnik)

-- Aby wykonać zapytania należy wybrać jako domyślną bazę danych bazę company - klikamy dwukrotnie w widoku schemas na nazwie tej bazy danych.
-- Zapytanie wybierające wybierające dane ze wszytkich kolumn (stąd *) wierszy z tabeli employee:
SELECT * FROM employee;

-- Zapytania będziemy formatowali w wybrany przez nas sposób.
SELECT
    *
FROM
    employee;

-- Zapytanie wybierające wartości z wybranych kolumn (w tym przypadku first_name i last_name)
SELECT
    id,
    year_of_birth
FROM
    employee;

-- Zapytanie z klauzulą "WHERE" precyzuje, które wiersze chcemy wybrać
SELECT
    *
FROM
    employee
WHERE
        id = 3;

-- W przypadku bazy MySQL nie potrzebujemy część FROM dla zapytania SELECT. W takim wypadku wynik będzie składał się z jednego wiersza.
-- Wartości liczbowe zapisujemy analogicznie jak w Javie. Wartości tekstowe zapisujemy w apostrofach lub cudzysłowach.
SELECT
    'ABC',
    "ABC",
    123;

-- Do dyspozycji mamy analogiczne do javy operatory arytmetyczne.
SELECT
        3 + 5,
        3 * 5,
        5 - 3,
        8 / 2,
        9 % 2;

-- Oraz podobne operatory logiczne i porównań.
SELECT
        1 AND 1, -- java: true && true
        0 OR 1, -- java: false || true
        NOT 0, -- java: !false
        10 > 4,
        4 < 10,
        5 <= 5,
        5 >= 5,
        5 = 5, -- java: 5 == 5
        5 <> 321, -- to samo, co: != (wolimy <>)
        5 != 321;

-- Operator LIKE przyrównuje wartości do wzoru - znak _ zastępuje jeden dowolny znak.
-- Znak % zastępuje dowolną liczbę dowolnych znaków.
SELECT
        "ABC" LIKE "A__", -- czy tekst "ABC" pasuje do tekstu, w którym mamy znak A, a ponim dwa dowolne znaki
        "ABC" LIKE "A%"; -- czy tekst "ABC" pasuje do tekstu, w którym pierwszy znak to A, a po nim mamy dowolną liczbę dowolnych znaków
