-- Aby rozpocząć transakcję użyjemy polecenia START TRANSACTION.
START TRANSACTION;
-- W ramach transakcji możemy manipulować danymi.
DELETE FROM employee WHERE id = 11;
-- Nastepnie mamy do wyboru dwa polecenia:
COMMIT;  -- zatwierdzi zmiany dokonane w ramach polecenia
-- oraz ROLLBACK; -- które wycofa zmiany dokonane w ramach transakcji.
-- Zmiany dokonywane w ramach transakcji dotyczą tylko naszego połączenia (sesji).
-- Dopiero po zatwierdzeniu zmian (instrukcja COMMIT) zmiany będą dostępne ogólnie.

-- Aby baza danych dopuszczała transakcyjność wymagany jest zestaw właściwości ACID:
-- https://pl.wikipedia.org/wiki/ACID