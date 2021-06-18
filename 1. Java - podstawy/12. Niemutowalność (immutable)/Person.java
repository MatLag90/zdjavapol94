package immutable;

// Klasa jest niemutowalna (immutable), jeśli nie możemy zmienić stanu (modyfikować) żadnego z utworzonych obiektów.
// Przykład klasy niemutowalnej. Zwróćmy uwagę, że jeśli utworzymy osobę, nie możemy w żaden sposób jej zmienić.
// Dodanie np. setterów sprawiłoby, że klasa nie byłaby już niemutowalna.
// Innym przykładem klasy niemutowalnej będzie klasa String - po utworzeniu tekstu nie możemy go w żaden sposób
// zmodyfikować - może zostać utworzony ewentualnie nowy obiekt na bazie istniejącego.
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
