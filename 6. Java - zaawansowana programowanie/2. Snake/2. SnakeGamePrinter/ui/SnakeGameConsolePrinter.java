package pl.sdacademy.snake.ui;

import pl.sdacademy.snake.game.SnakeGame;
import pl.sdacademy.snake.game.SnakeGamePrinter;

public class SnakeGameConsolePrinter implements SnakeGamePrinter {
    @Override
    public void print(SnakeGame snakeGame) {
        System.out.println(snakeGame);
    }
}
