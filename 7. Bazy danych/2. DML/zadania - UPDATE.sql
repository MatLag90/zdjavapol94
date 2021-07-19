-- UPDATE.1 Napisz zapytanie zwiększające rok urodzenia każdej osoby o 1.
SELECT
    *,
    year_of_birth + 1 AS new_year_of_birth
FROM
    employee;
    
UPDATE
    employee
SET
    year_of_birth = year_of_birth + 1;
    

-- UPDATE.2 Napisz zapytanie dodające każdemu pracownikowi pracującemu w Krakowie do imienia 'a'
SELECT
    *,
    CONCAT(employee.first_name, "a") AS new_first_name
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id
WHERE
    department.location = "Kraków";
    
UPDATE
    employee
    INNER JOIN
    department ON department.id = employee.department_id
SET
    first_name = CONCAT(employee.first_name, "a")
WHERE
    department.location = "Kraków";
-- UPDATE.3 Znajdź pracowników działu z miasta kończącego się na literę 'a' i (których imię kończy się na 'a' lub których nazwisko kończy się na 'ska'). Imiona tych pracowników zmień w taki sposób, żeby były zapisane na wspak. 
-- UPDATE.4 Napisz zapytanie UPDATE, które skróci imię o jeden znak
SELECT
    *,
    LEFT(first_name, CHAR_LENGTH(first_name) - 1) AS new_first_name
FROM
    employee;
    
-- TODO: Dopisać UPDATE.

-- UPDATE.5 Napisz zapytanie UPDATE, które skróci imię jeden znak, jeśli długość imienia jest większa niż 5 znaków.
-- UPDATE.6 Napisz zapytanie aktualizujące dane osób z działu Sprzedaży w następujący sposób:
-- jeśli rok urodzenia jest nieparzysty, to dodajmy do niego 3, jeśli jest parzysty, to odejmijmy 2, jeśli nazwisko zaczyna się na literę A, to do imienia powinno zostać dodane "a", a jeśli nazwisko kończy się na 'ski' to imię powinno zostać ukrócone o jeden znak.
-- UPDATE.7 Rozwiąż zadanie UPDATE.3 w taki sposób, aby również rok urodzenia zapisać na wspak.