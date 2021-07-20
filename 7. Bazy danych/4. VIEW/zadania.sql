-- VIEW.1 Stwórz widok przedstawiający dane pracowników:
--     id, imię, nazwisko, wiek, nazwę działu, miasto w którym pracuje, stanowisko oraz płacę
CREATE VIEW emp_full_details AS
SELECT
    employee.id,
    employee.first_name,
    employee.last_name,
    YEAR(CURDATE()) - employee.year_of_birth AS age,
    department.name AS dept_name,
    department.location AS dept_location,
    job.name AS job_name,
    job.salary
FROM
    employee
    LEFT JOIN
    department ON department.id = employee.department_id
    LEFT JOIN
    job ON job.id = employee.job_id;

-- VIEW.2 Korzystając z utworzonego w VIEW.1 widoku wypisz ilu pracowników pracuje w którym mieście
SELECT
    dept_location,
    COUNT(*) AS emp_count
FROM
    emp_full_details
GROUP BY
    dept_location;
    
-- VIEW.3 Utwórz widok przedstawiający liczbę działów w danym mieście.
SELECT
    location,
    COUNT(*) AS count
FROM
    department
GROUP BY
    location;
    
-- VIEW.4 Korzystając z utworzonego w VIEW.1 widoku wypisz ilu pracowników zarabia kwotę w danym przedziale, przy użyciu widełek z zakresem 1000 zł.