package behavioral.templatemethod;

public abstract class LetterComposerHelper {
    public String compose(String recipient, String sender, String content) {
        return createHeader(recipient) + content + createFooter(sender);
    }

    protected abstract String createFooter(String sender);

    protected abstract String createHeader(String recipient);
}
