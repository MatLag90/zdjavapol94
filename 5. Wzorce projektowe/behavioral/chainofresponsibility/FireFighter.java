package behavioral.chainofresponsibility;

public class FireFighter extends FireLink {
    @Override
    public void handle(int flameHeight) {
        System.out.println("Strażak widzi płomienie o wysokości " + flameHeight
            + ". Strażak ugasił pożar.");
    }
}
