package behavioral.chainofresponsibility;

public class Adult extends FireLink {
    @Override
    public void handle(int flameHeight) {
        System.out.println("Dorosła osoba widzi płomienie o wysokości " + flameHeight
                + " i wylewa na nie wiadro wody");
        flameHeight -= 10;
        if (flameHeight > 0) {
            System.out.println("Płomienie mają wysokość " + flameHeight
                    + ". Osoba woła następne ogniwo łańcucha.");
            next.handle(flameHeight);
        } else {
            System.out.println("Dorosła osoba ugasiła pożar.");
        }
    }
}
