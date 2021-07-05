package behavioral.state;

public class Human {
    private String name;
    private WalkingState walkingState;

    public Human(String name, WalkingState walkingState) {
        this.name = name;
        this.walkingState = walkingState;
    }

    public void setWalkingState(WalkingState walkingState) {
        this.walkingState = walkingState;
    }

    public void walk() {
        walkingState.walk();
    }
}
