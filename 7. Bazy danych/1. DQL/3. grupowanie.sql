-- Część GROUP BY służy do podziału danych na grupy. W tej części wymieniamy wyrażenia, których wynik liczymy dla każdego wiersza. Te wiersze, dla których wynik wyrażeń będzie taki sam, utworzą grupę. Następnie dla tych grup możemy wyliczać wartości funkcji agregujących.
-- W tym przypadku wypiszemy ile mamy rekordów dla każdego imienia.
SELECT
    first_name,
    COUNT(*)
FROM
    employee
GROUP BY
    first_name;
-- Ważne, że jeśli jakieś wyrażenie, które nie korzysta z funkcji agregującej pojawi się w części SELECT, to żeby pojawiło się też w części GROUP BY.

-- Aby filtrować grupy (grupy filtrujemy na podstawie wartości funkcji agregującej, dla innych przypadków użyjmy części WHERE!) dodamy część HAVING. w tym przypadku pozostawimy tylko te grupy, w których jest więcej niż 1 rekord.
SELECT
    first_name,
    COUNT(*)
FROM
    employee
GROUP BY
    first_name
HAVING
    COUNT(*) > 1;

-- Część WHERE służy do filtrowania WIERSZY (nie używamy w tej części funkcji agregujących).
-- Część HAVING służy do filtrowania GRUP (używamy w tej części funkcji agregujących).
