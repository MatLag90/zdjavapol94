package pl.sdacademy.behavioral.strategy;

public class PunchStrategy implements HitStrategy {
    @Override
    public void hit() {
        System.out.println("Uderzenie pięścią");
    }
}
