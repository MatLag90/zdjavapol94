package pl.sdacademy.behavioral.visitor;

public class BeginnerSolicitor implements Solicitor {
    @Override
    public void visit(AngryPerson person) {
        System.out.println("Wściekła osoba trzaska drzwiami");
    }

    @Override
    public void visit(HappyPerson person) {
        System.out.println("Coś tam udało się sprzedać wesołej osobie");
    }
}
