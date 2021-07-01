package pl.sdacademy.behavioral.strategy;

public class SwordSwingStrategy implements HitStrategy {
    @Override
    public void hit() {
        System.out.println("Uderzenie mieczem");
    }
}
