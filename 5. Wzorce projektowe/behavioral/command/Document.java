package pl.sdacademy.behavioral.command;

public class Document {
    private String author;
    private String content;

    public Document(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
