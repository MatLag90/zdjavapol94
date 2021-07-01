package pl.sdacademy.behavioral.command;

public class ClearContentCommand implements Command {
    private Document document;
    private String oldContent;

    public ClearContentCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        oldContent = document.getContent();
        document.setContent("");
    }

    @Override
    public void undo() {
        document.setContent(oldContent);
    }
}
