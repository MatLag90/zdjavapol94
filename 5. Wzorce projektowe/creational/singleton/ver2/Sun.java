package pl.sdacademy.creational.singleton.ver2;

public class Sun {
    private static Sun INSTANCE;

    public static Sun getInstance() {
        if (INSTANCE == null) {
            synchronized (Sun.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Sun();
                }
            }
        }
        return INSTANCE;
    }

    private Sun() {
        System.out.println("Tworzę instancję typu Sun");
    }

    //////////////////////////////////////////

    private int mass = 123456;

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
