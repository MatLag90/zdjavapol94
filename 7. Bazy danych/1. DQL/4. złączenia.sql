-- Jeśli w zapytaniu chcemy użyć danych z dwóch tabel, użyjemy złączenia.
-- Złączenie wewnętrzne (użyjemy operatora INNER JOIN) łączy tabele w taki sposób, że:
-- bierzemy każdą parę wierszy z jednej i drugiej tabeli, liczymy dla nich wynik wyrażenia logicznego
-- zapisanego w części ON i jeśli wynikiem będzie prawda, to para trafia do wyniku tworząc jeden wiersz.

-- W poniższym przykładzie "posklejamy" wiersze z tabeli employees i tabeli departments w taki sposób,
-- że identyfikator działu w obu przypadkach będzie musiał być taki sam.
SELECT
    *
FROM
    employee
    INNER JOIN -- inaczej: JOIN
    department ON department.id = employee.department_id;
    
-- Jeśli chcemy się odwołać do kolumn z wybranej tabeli, to możemy przed nazwą kolumny zapisać nazwę tabeli.
-- Jeśli w obu tabelach pojawia się kolumna o tej samej nazwie, to musimy to zrobić.
-- Dobrą praktyką jest w przypadku złożonego zapytania dopisanie nazwy tabeli przed nazwą kolumny.   
SELECT
    employee.first_name,
    employee.year_of_birth,
    department.location
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id;

-- Poniższe zapytanie jest błędne - zarówno w tabeli employees jak i departments mamy kolumnę id (rozwiązaniem będzie employees.id lub department.id)
SELECT
	id
FROM
	employees
    INNER JOIN
    departments ON departments.id = employees.department_id;
    
-- Jeśli w części from po nazwie tabeli zapiszemy AS <alias> to w zapytaniu będziemy się odwoływali do tabeli zgodnie z podanym aliasem (słówko AS jest opcjonalne).
-- Będziemy unikali aliasów jednoliterowych.
SELECT
    emp.first_name,
    emp.year_of_birth,
    dept.location
FROM
    employee AS emp
    INNER JOIN
    department AS dept ON dept.id = emp.department_id;
    
-- Możemy wybrać wszystkie kolumny z zadanej tabeli - gwiazdkę poprzedzimy nazwą tabeli.
SELECT
    employee.*,
    department.location
FROM
    employee
    INNER JOIN
    department ON department.id = employee.department_id;
    
-- Złączenie lewostronne pozostawi w wyniku również te wiersze z lewej części złączenia (employee), które
-- nie mają odpowiednika po prawej stronie. Wartości w kolumnach powstałych z prawej strony złączenia będą NULLami.
-- W tym przypadku wypiszemy również pracowników, którzy nie są przypisani do żadnego działu.
SELECT
    *
FROM
    employee
    LEFT JOIN -- inaczej: LEFT OUTER JOIN
    department ON department.id = employee.department_id;
    
-- Analogicznie działa złączenie prawostronne. W tym przypadku wypiszemy również działy, w których nikt nie pracuje.
SELECT
    *
FROM
    employee
    RIGHT JOIN -- inaczej: RIGHT OUTER JOIN
    department ON department.id = employee.department_id;
    
-- W przypadku wybranych serwerów baz danych obsługiwane jest również złączenie zewnętrzne - połączenie RIGHT JOIN oraz LEFT JOIN.
-- W MySQL nie ma takiej możliwości.
SELECT
    *
FROM
    employee
    FULL JOIN -- inaczej: FULL OUTER JOIN
    department ON department.id = employee.department_id;
    
-- Obrazowe przedstawienie złączeń tabel, przy użyciu diagramu Venna: https://i.stack.imgur.com/UI25E.jpg

-- Złączenie CROSS JOIN to inaczej iloczyn kartezjański - łączymy wszystkie wiersze lewej strony złączenia ze wszystkimi wierszami prawej strony złączenia.
SELECT
    *
FROM
    employee
    CROSS JOIN -- Aliasem dla słówek CROSS JOIN jest przecinek.
    department;