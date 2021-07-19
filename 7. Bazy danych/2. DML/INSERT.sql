-- Wiersze możemy dodawać za pomocą instrukcji INSERT INTO, po której podajemy nazwę tabeli
-- a następnie w części VALUES podajemy w nawiasach wartości kolejnych kolumn dla dodawanego wiersza.
-- Kolumny dopuszczające wartość NULL, mające ustawioną wartość domyślną lub te z autoinkrementacją można pominąć.
INSERT INTO
	certificate(name)
VALUES
	("Certyfikat 123");
    
-- Możemy za pomocą polecenia INSERT INTO wstawić więcej niż jeden wiersz:
INSERT INTO
    certificate(id, name)
VALUES
    (50, "Aaa"),
    (51, "Bbb");
    
-- Polecenia INSERT INTO możemy użyć również w taki sposób, że zamiast wartości podanych przez nas wstawimy wynik polecenia SELECT.
-- Poniższe polecenie doda nowe certyfikaty, których nazwy będą lokalizacjami działów z bazy.
INSERT INTO
    certificate(name)
SELECT
    location
FROM
    department