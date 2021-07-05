package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Adam Adamowski", new ToddlerWalkingState());
        human.walk();
        human.setWalkingState(new OldManWalkingState());
        human.walk();
    }
}
