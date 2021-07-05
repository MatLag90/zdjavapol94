package structural.adapter;

public class DogToCatAdapter implements Cat {
    private Dog dog;

    public DogToCatAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void run() {
        dog.run();
    }

    @Override
    public void meow() {
        dog.bark();
    }
}
