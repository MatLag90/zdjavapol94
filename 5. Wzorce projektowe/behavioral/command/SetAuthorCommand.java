package pl.sdacademy.behavioral.command;

public class SetAuthorCommand implements Command {
    private Document document;
    private String author;
    private String oldAuthor;

    public SetAuthorCommand(Document document, String author) {
        this.document = document;
        this.author = author;
    }

    @Override
    public void execute() {
        oldAuthor = document.getAuthor();
        document.setAuthor(author);
    }

    @Override
    public void undo() {
        document.setAuthor(oldAuthor);
    }
}
