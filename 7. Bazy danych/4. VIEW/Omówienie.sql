-- Widok to spojrzenie na dane przechowywane w naszej bazie przez pryzmat wybranego zapytania SELECT. Takich widoków możemy następnie używać w innych zapytaniach, dzięki czemu zapytania mogą stać się czytelniejsze.
-- Dodatkowo, jeśli w wielu zapytaniach używamy jednego widoku, to w przypadku modyfikacji, modyfikujemy jedynie widok, a nie każde takie zapytanie.
-- Ponadto możemy zdecydować, że wybrani użytkownicy (lub grupy użytkowników) będą mogły widzieć dane w bazie jedynie z perspektywy wybranych widoków.
-- W przypadku wielu serwerów baz danych widoków można używać w poleceniach DML, jeśli edytowana komórka to odwołanie jeden-do-jednego do komórki edytowanej tabeli.

-- Widok tworzymy za pomocą polecenia:
-- CREATE VIEW <<nazwa widoku>> AS SELECT ...
CREATE VIEW emp_count_by_job_and_dept AS
SELECT
    department.name AS dept_name,
    job.name AS job_name,
    COUNT(*) AS emp_count
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id
    INNER JOIN
    job ON job.id = employee.job_id
GROUP BY
    department.name,
    job.name;
    
-- Widoków możemy używać w zapytaniach analogicznie jak tabel (mamy na uwadze, że odwołujemy się do kolumn widoku, nie "skrytych" pod nim tabel).
SELECT
    *
FROM
    emp_count_by_job_and_dept
WHERE
    dept_name = "Sprzedaż"