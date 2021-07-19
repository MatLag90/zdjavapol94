-- INSERT.1 Napisz zapytanie, które doda dział Zaopatrzenie mieszczący się w Szczecinie.
INSERT INTO
    department(name, location)
VALUES
    ("Zaopatrzenie", "Szczecin");
    
-- INSERT.2 Napisz zapytanie (jedno!), które doda trzy osoby z wypełnionymi polami.
INSERT INTO
    employee(first_name, last_name, year_of_birth, department_id, job_id)
VALUES
    ("Adam", "Adamowski", 1987, 1, 2),
    ("Bartosz", "Bartoszowski", 1977, 2, 3),
    ("Celina", "Celinowska", 1967, 3, 3);
    
-- INSERT.3 Napisz zapytanie, które zdubluje wszystkich pracowników w taki sposób, że każdy zdublowany będzie miał do imienia oraz nazwiska dodany sufiks "_el_dobler"
INSERT INTO
    employee(first_name, last_name, year_of_birth, department_id, job_id)
SELECT
    CONCAT(first_name, "_el_dobler"),
    CONCAT(last_name, "_el_dobler"),
    year_of_birth,
    department_id,
    job_id
FROM
    employee
-- INSERT.4 Napisz zapytanie, które dla każdego działu utworzy rekord w tabeli employees w taki sposób, że jego imieniem będzie "Szefuncio", nazwiskiem "<<nazwa miasta działu>>ski", a id działu będzie zgodne z tym, dla którego wiersz tworzymy.