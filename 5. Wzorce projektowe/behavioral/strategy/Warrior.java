package pl.sdacademy.behavioral.strategy;

public class Warrior {
    private String name;
    private HitStrategy hitStrategy;

    public Warrior(String name, HitStrategy hitStrategy) {
        this.name = name;
        this.hitStrategy = hitStrategy;
    }

    public void setHitStrategy(HitStrategy hitStrategy) {
        this.hitStrategy = hitStrategy;
    }

    public void hit() {
        hitStrategy.hit();
    }
}
