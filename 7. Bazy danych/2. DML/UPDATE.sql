-- Dane aktualizujemy za pomocą instrukcji UPDATE.
-- W części UPDATE specyfikujemy skąd pobieramy dane (analogia do części FROM).
-- W części SET opisujemy w jaki sposób aktualizujemy dane (nazwa kolumny = nowa wartość).
-- W części WHERE możemy doprecyzować, które wiersze modyfikujemy.
UPDATE
    employee
SET
    first_name = "Paweł"
WHERE
    id = 1;
    
SELECT
    *,
    "Paweł" AS new_first_name
FROM
    employee
WHERE
    id = 1;