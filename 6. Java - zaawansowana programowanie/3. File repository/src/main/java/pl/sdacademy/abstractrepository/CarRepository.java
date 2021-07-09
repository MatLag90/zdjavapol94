package pl.sdacademy.abstractrepository;

public class CarRepository extends AbstractRepository<Car> {
    public CarRepository(String filename) {
        super(filename);
    }

    @Override
    protected Car createEntity(String fileLine) {
        String[] lineParts = fileLine.split(",");
        int id = Integer.parseInt(lineParts[0]);
        int maxSpeed = Integer.parseInt(lineParts[1]);
        String model = lineParts[2];
        String color = lineParts[3];
        return new Car(id, maxSpeed, model, color);
    }

    @Override
    protected String createFileLine(Car car) {
        return car.getId() + "," + car.getMaxSpeed()
                + "," + car.getModel() + "," + car.getColor();
    }
}
