package behavioral.templatemethod;

public class FormalLetterComposerHelper extends LetterComposerHelper {
    @Override
    protected String createFooter(String sender) {
        return "\n\nZ poważaniem,\n" + sender;
    }

    @Override
    protected String createHeader(String recipient) {
        return "Szanowny " + recipient + ",\n\n";
    }
}
