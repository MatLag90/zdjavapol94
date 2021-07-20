-- Aby sortować wyniki zapytania używamy części ORDER BY. W niej wymieniamy
-- kolejne wyrażenia, które decydują o kolejności wyniku.
SELECT 
    *
FROM
    employee
ORDER BY
    last_name,
    first_name;
    
-- Słówkami DESC lub ASC określamy kolejność sortowania (ascending/descending). Domyślnie
-- kolejność jest rosnąca.
SELECT 
    *
FROM
    employee
ORDER BY
    last_name DESC,
    first_name DESC;

-- Aby ograniczyć liczbę wierszy wyniku możemy użyć części LIMIT.
SELECT
    *
FROM
    employee
LIMIT 3;

-- Jeśli w części limit zadamy dwie wartości, to pierwsza z nich będzie dodatkowo
-- offsetem - liczbą pominiętych wierszy.
SELECT
    *
FROM
    employee
LIMIT 2, 3;