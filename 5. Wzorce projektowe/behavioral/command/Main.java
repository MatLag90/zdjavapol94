package pl.sdacademy.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Adam Adamowski", "Jakaś treść dokumentu");
        System.out.println("Pierwotna wersja dokumentu: " + document);
        Executor executor = new Executor();

        Command setAuthorCommand = new SetAuthorCommand(document, "Piotr Piotrowski");
        executor.execute(setAuthorCommand);
        System.out.println("Dokument po wywołaniu polecenia setAuthorCommand: " + document);

        Command clearContentCommand = new ClearContentCommand(document);
        executor.execute(clearContentCommand);
        System.out.println("Dokument po wywołaniu polecenia clearContentCommand: " + document);

        executor.undoLast();
        System.out.println("Dokument po wycofaniu ostatniego polecenia: " + document);

        executor.undoLast();
        System.out.println("Dokument po wycofaniu ostatniego polecenia: " + document);
    }
}
