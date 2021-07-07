package pl.sdacademy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    private Canvas canvas;

    @Override
    public void start(Stage stage) {
        canvas = new Canvas(400, 400);
        VBox vBox = new VBox(canvas);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();

//        example1();
        example2();
    }

    private void example1() {
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Color.BROWN);
        graphicsContext.fillRect(20, 130, 50, 100);
    }

    private void example2() {
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        Thread animationThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                graphicsContext.clearRect(0, 0, 400, 400);
                graphicsContext.setFill(Color.rgb(255 - i, i, 2 * i));
                graphicsContext.fillRect(i, 2 * i, 200 - i, 50 + i);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        animationThread.setDaemon(true);
        animationThread.start();
    }


    public static void main(String[] args) {
        launch();
    }

}
