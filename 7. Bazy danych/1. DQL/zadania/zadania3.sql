-- 3.1 Wypisz ilu jest pracowników wedle nazwiska
SELECT
    last_name,
    COUNT(*)
FROM
    employee
GROUP BY
    last_name;
    
-- 3.2 Wypisz ilu jest pracowników wedle imienia i wieku.
SELECT
    first_name,
    YEAR(CURDATE()) - year_of_birth AS age, -- przypisujemy alias wyrażeniu liczacemu wiek pracownika
    COUNT(*)
FROM
    employee
GROUP BY
    first_name,
    age; -- w części group by możemy odwołać się do wyrażenia liczącego wiek przy użyciu aliasu
    
-- 3.3 Wypisz ilu pracowników ma więcej niż 25 lat wedle imienia.
SELECT
    first_name,
    COUNT(*)
FROM
    employee
WHERE
    YEAR(CURDATE()) - year_of_birth > 25
GROUP BY
    first_name;
    
-- 3.4 Wypisz te imiona osób, dla których średnia wieku będzie większa od 50.
SELECT
    first_name
FROM
    employee
GROUP BY
    first_name
HAVING
    YEAR(CURDATE()) - AVG(year_of_birth) > 50

-- 3.5 Rozwiąż zadanie z podpunktu 3.4 w taki sposób, żeby ta średnia była większa od średniej wieku wszystkich pracowników.
-- 3.6 Spośród maksymalnych wieków dla imion, które rozpoczynają się od litery 'A' wybierz wartość najmniejszą.