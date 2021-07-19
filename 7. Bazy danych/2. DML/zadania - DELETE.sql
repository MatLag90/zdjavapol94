-- DELETE.1 Usuń pracowników o nazwisku "Kowalski".
DELETE
FROM
    employee
WHERE
    last_name = "Kowalski";
    
-- DELETE.2 W Krakowie redukcja zatrudnienia - napisz zapytanie, które usunie pracowników z Krakowa, którzy są starsi niż 60 lat, tych którzy mają 55+ i  wypłatę większą od 4 tysięcy, do tego tych, którzy mają więcej niż 50 lat oraz wypłatę większą niż 5 tysięcy.
DELETE
    employee
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id
    INNER JOIN
    job ON job.id = employee.job_id
WHERE
    department.location = "Kraków"
    AND
    (
        YEAR(CURDATE()) - employee.year_of_birth > 60
        OR
        YEAR(CURDATE()) - employee.year_of_birth >= 55 AND job.salary > 4000
        OR
        YEAR(CURDATE()) - employee.year_of_birth > 50 AND job.salary > 5000
    );
    
-- DELETE.3 Usuń te działy (wraz z pracownikami), w których pracuje pracownik o nazwisku "Zaraza". Aby to uzyskać, ustaw odpowiednią kaskadowość kluczowi obcemu. Spróbuj wygooglować rozwiązanie - jak zrobić to przy użyciu Workbencha.
DELETE
    department
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id
WHERE
    employee.last_name = "Zaraza"