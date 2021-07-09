package pl.sdacademy.abstractrepository;

public class PersonRepository extends AbstractRepository<Person> {
    public PersonRepository(String filename) {
        super(filename);
    }

    @Override
    protected Person createEntity(String fileLine) {
        String[] lineParts = fileLine.split(",");
        int id = Integer.parseInt(lineParts[0]);
        String firstName = lineParts[1];
        String lastName = lineParts[2];
        int age = Integer.parseInt(lineParts[3]);
        return new Person(id, firstName, lastName, age);
    }

    @Override
    protected String createFileLine(Person person) {
        return person.getId() + "," + person.getFirstName()
                + "," + person.getLastName() + "," + person.getAge();
    }
}
