package pl.sdacademy.creational.singleton.ver3;

public enum Sun {
    INSTANCE;
    Sun() {
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
