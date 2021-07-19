-- 4.0 Wypisz imiona i nazwiska pracowników oraz nazwę działu, w którym pracują.
SELECT
    employee.first_name,
    employee.last_name,
    department.name AS dept_name
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id;
    
-- 4.1 Wypisz bez powtórzeń nazwiska pracowników, którzy pracują w sprzedaży.
SELECT DISTINCT
    employee.last_name
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id
WHERE
    department.name = "Sprzedaż";

-- 4.2 Wypisz ilu pracowników pracuje w danym dziale (dział przedstawiamy za pomocą jego nazwy).
SELECT
    department.name AS dept_name,
    COUNT(*) AS emp_count
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id
GROUP BY
    department.name;
    
-- 4.3 Rozwiąż zadanie z poprzedniego podpunktu, aby wypisać też dane działów, w których nie ma żadnego pracownika.
SELECT
    department.name AS dept_name,
    COUNT(employee.id) AS emp_count
FROM
    employee
    RIGHT JOIN
    department ON department.id = employee.department_id
GROUP BY
    department.name;
    
-- 4.4 Wypisz nazwy działów, w których nikt nie pracuje.