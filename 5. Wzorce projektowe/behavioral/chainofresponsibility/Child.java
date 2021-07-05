package behavioral.chainofresponsibility;

public class Child extends FireLink {
    @Override
    public void handle(int flameHeight) {
        System.out.println("Dziecko widzi płomienie o wysokości " + flameHeight
                + ". Dziecko woła następną osobę.");
        next.handle(flameHeight);
    }
}
