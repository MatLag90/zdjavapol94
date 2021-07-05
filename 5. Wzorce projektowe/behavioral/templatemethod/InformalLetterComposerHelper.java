package behavioral.templatemethod;

public class InformalLetterComposerHelper extends LetterComposerHelper {
    @Override
    protected String createFooter(String sender) {
        return "\n\nPozdrawiam,\n" + sender;
    }

    @Override
    protected String createHeader(String recipient) {
        return "Cześć " + recipient + "!\n\n";
    }
}
