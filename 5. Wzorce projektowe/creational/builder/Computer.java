package creational.builder;

public class Computer {
    private Double cpu;
    private Double ram;
    private String graphicsCard;
    private Double hdd;
    private String powerAdapter;
    private String coolingSystem;

    private Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", hdd=" + hdd +
                ", powerAdapter='" + powerAdapter + '\'' +
                ", coolingSystem='" + coolingSystem + '\'' +
                '}';
    }

    public static class Builder {
        private Double cpu;
        private Double ram;
        private String graphicsCard;
        private Double hdd;
        private String powerAdapter;
        private String coolingSystem;

        public Builder withCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder withRam(Double ram) {
            this.ram = ram;
            return this;
        }

        public Builder withGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder withHdd(Double hdd) {
            this.hdd = hdd;
            return this;
        }

        public Builder withPowerAdapter(String powerAdapter) {
            this.powerAdapter = powerAdapter;
            return this;
        }

        public Builder withCoolingSystem(String coolingSystem) {
            this.coolingSystem = coolingSystem;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer();
            computer.coolingSystem = coolingSystem;
            computer.ram = ram;
            computer.cpu = cpu;
            computer.powerAdapter = powerAdapter;
            computer.graphicsCard = graphicsCard;
            computer.hdd = hdd;
            return computer;
        }
    }
}
