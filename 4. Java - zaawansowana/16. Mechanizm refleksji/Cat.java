package pl.sdacademy.reflection;

@MyAnnotation
public class Cat {
    private int age;
    private String breed;

    public Cat(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    @MyAnnotation
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    @MyAnnotation
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
