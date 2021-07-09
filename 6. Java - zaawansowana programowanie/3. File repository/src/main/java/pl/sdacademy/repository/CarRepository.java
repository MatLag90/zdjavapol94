package pl.sdacademy.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CarRepository {
    private Set<Car> cars;
    private Path filePath;

    public CarRepository(String filename) {
        filePath = Paths.get(filename);
        try {
            cars = Files.lines(filePath)
                    .map(this::createCar)
                    .collect(Collectors.toSet());
        } catch (IOException e) {
            throw new RuntimeException("Błąd odczytu danych z pliku", e);
        }
    }

    public Set<Car> getAll() {
        return cars;
    }

    private Car createCar(String fileLine) {
        String[] lineParts = fileLine.split(",");
        int id = Integer.parseInt(lineParts[0]);
        int maxSpeed = Integer.parseInt(lineParts[1]);
        String model = lineParts[2];
        String color = lineParts[3];
        return new Car(id, maxSpeed, model, color);
    }

    public Car get(int id) {
        return cars.stream()
                .filter(car -> car.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private int generateNextId() {
        return cars.stream()
                .mapToInt(Car::getId)
                .max()
                .orElse(0) + 1;
    }

    private String createFileLine(Car car) {
        return car.getId() + "," + car.getMaxSpeed()
                + "," + car.getModel() + "," + car.getColor();
    }

    private void updateFile() {
        List<String> fileLines = cars.stream()
                .map(this::createFileLine)
                .collect(Collectors.toList());
        try {
            Files.write(filePath, fileLines);
        } catch (IOException e) {
            throw new RuntimeException("Błąd zapisu danych do pliku", e);
        }
    }

    public void add(Car car) {
        car.setId(generateNextId());
        cars.add(car);
        updateFile();
    }
}
