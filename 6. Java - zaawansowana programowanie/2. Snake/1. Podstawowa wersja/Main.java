package pl.sdacademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SnakeGame snakeGame = new SnakeGame(10, 10);
        Thread thread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String userInput = scanner.nextLine();
                switch (userInput) {
                    case "u":
                        snakeGame.setSnakeDirection(Direction.UP);
                        break;
                    case "r":
                        snakeGame.setSnakeDirection(Direction.RIGHT);
                        break;
                    case "d":
                        snakeGame.setSnakeDirection(Direction.DOWN);
                        break;
                    case "l":
                        snakeGame.setSnakeDirection(Direction.LEFT);
                        break;
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

        snakeGame.start();
    }
}
