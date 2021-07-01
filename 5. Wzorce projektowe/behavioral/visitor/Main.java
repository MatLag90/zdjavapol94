package pl.sdacademy.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Person happyPerson = new HappyPerson();
        Person angryPerson = new AngryPerson();
        Solicitor beginnerSolicitor = new BeginnerSolicitor();
        Solicitor experiencedSolicitor = new ExperiencedSolicitor();

        happyPerson.accept(beginnerSolicitor);
    }
}
