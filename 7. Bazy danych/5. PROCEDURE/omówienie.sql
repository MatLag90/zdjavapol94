DELIMITER $$
-- Procedura to sparametryzowany zestaw instrukcji. Procedur używamy do zarządzania bazą danych.
CREATE PROCEDURE get_employee (p_id INT)
BEGIN
    SELECT * 
    FROM employee
    WHERE id = p_id;
END$$

-- Procedury wywołujemy za pomocą polecenia CALL, po którym następuje nazwa procedury, a nastepnie w nawiasach przekazujemy argumenty.
CALL get_employee(3)