-- 5.1 Wypisz imiona, nazwiska, nazwy stanowisk oraz działu wszystkich pracowników, którzy mają więcej niż 50 lat.
SELECT
    employee.first_name,
    employee.last_name,
    job.name AS job_name,
    department.name AS dept_name
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id
    INNER JOIN
    job ON job.id = employee.job_id
WHERE
    YEAR(CURDATE()) - employee.year_of_birth > 50;
    
-- 5.2 Wypisz ilu pracowników mamy na każdym stanowisku w każdym dziale.
SELECT
    job.name AS job_name,
    department.name AS dept_name,
    COUNT(*) AS emp_count
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id
    INNER JOIN
    job ON job.id = employee.job_id
GROUP BY
    job.name,
    department.name;
    
-- 5.3 Wypisz pracowników, którzy pracują na stanowisku, na którym zarabia się najwięcej.
SELECT
    employee.*
FROM
    employee
    INNER JOIN
    job ON job.id = employee.job_id
WHERE
    job.salary = (
        SELECT MAX(salary)
        FROM job
    )
-- 5.4 Wypisz nazwy stanowisk, które są obsadzone zarówno w dziale sprzedaży jak i marketingu.
-- 5.5 Wypisz średnią różnicę wieku między pracownikami.