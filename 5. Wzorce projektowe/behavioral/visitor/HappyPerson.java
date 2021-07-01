package pl.sdacademy.behavioral.visitor;

public class HappyPerson implements Person {
    @Override
    public void accept(Solicitor solicitor) {
        solicitor.visit(this);
    }
}
