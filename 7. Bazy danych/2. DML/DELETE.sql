-- Rekody możemy usuwać przy użyciu zapytania DELETE. Jeśli korzystamy w zapytaniu z jednej tabeli
-- to zapytanie jest w pełni analogiczne do zapytania SELECT wybierającego dane, z tymże zastępujemy część select częścią "DELETE".
-- W tym zapytaniu usuniemy rekord z tabeli employees o id = 14.
DELETE
FROM
    employee
WHERE
    id = 14;

-- Gdy do usuwania danych potrzebujemy więcej niż jednej tabeli, wymienimy tabele, z ktorych kasujemy dane w części DELETE.
-- Usuniemy wszystkich pracowników działu o nazwie 'Zaopatrzenie'.
DELETE
    employee
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id
WHERE
    department.name = "Zaopatrzenie";
    