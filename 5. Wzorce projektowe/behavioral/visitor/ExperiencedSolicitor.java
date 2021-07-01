package pl.sdacademy.behavioral.visitor;

public class ExperiencedSolicitor implements Solicitor {
    @Override
    public void visit(AngryPerson person) {
        System.out.println("Wściekła osoba coś tam kupuje");
    }

    @Override
    public void visit(HappyPerson person) {
        System.out.println("Wesoła osoba wydaje majątek");
    }
}
