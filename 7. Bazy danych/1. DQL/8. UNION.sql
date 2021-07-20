-- Jęśli chcemy zsumować zbiory wynikowe dwóch zapytań, użyjemy operatora UNION. Liczba kolumn i typy ich wartości w łączonych zapytaniach muszą się zgadzać.
    SELECT
        year_of_birth,
        last_name
    FROM
        employee
UNION
    SELECT
        id,
        location
    FROM
        department;
        
	SELECT 1
UNION -- operator UNION usunie duplikaty
	SELECT 1;
    
    SELECT 1
UNION ALL -- operator UNION ALL nie usunie duplikatów.
	SELECT 1