package pl.sdacademy.behavioral.visitor;

public interface Solicitor {
    void visit(AngryPerson person);
    void visit(HappyPerson person);
}
