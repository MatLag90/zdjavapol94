package behavioral.state;

public class ToddlerWalkingState implements WalkingState {
    @Override
    public void walk() {
        System.out.println("Raczkuje.");
    }
}
