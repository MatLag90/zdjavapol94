package pl.sdacademy.warrior;

public class Warrior {
    public static final int DEFAULT_HEALTH_POINTS = 100;
    private String name;
    private int damage;
    private int healthPoints;

    public Warrior(String name, int damage, int healthPoints) {
        this.name = name;
        this.damage = damage;
        this.healthPoints = healthPoints;
    }

    public Warrior(String name) {
        this.name = name;
        damage = 1;
        healthPoints = DEFAULT_HEALTH_POINTS;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String toString() {
        return "Imię: " + name + ", siła ataku: " + damage + ", punkty życia: " + healthPoints;
    }

    public void hit(Warrior warrior) {
        warrior.healthPoints -= damage;
    }
}
