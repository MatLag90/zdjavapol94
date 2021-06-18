package pl.sdacademy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



// Klasa App (podobnie jak cały szablon projektu) wygenerowania automatycznie przy użyciu archetypu:
// groupId: org.openjfx
// artifactId: javafx-archetype-simple
// version: 0.0.5
// Przy starcie aplikacji przy wykorzystaniu metody main, zostanie utworzony obiekt tej klasy.
// Następnie zostanie wywołana metoda start.
public class App extends Application {

    // Metoda wywoływana przy starcie aplikacji korzystającej z JavyFX.
    // Jej parametr (o nazwie stage, typu Stage) to główne okno aplikacji.
    @Override
    public void start(Stage stage) {
        // Utworzymy obiekt typu VBox i przypiszemy go do zmiennej.
        // Obiekt będzie kontenerem, który rozmieszcza swoje dzieci pionowo (vertical).
        VBox vBox = new VBox();
        // Pole tekstowe, które przypiszemy do zmiennej.
        TextField textField = new TextField("Pole tekstowe");
        // Etykieta, którą przypiszemy do zmiennej.
        Label label = new Label("Etykieta");
        // Przycisk, które przypiszemy do zmiennej.
        Button button = new Button("Przycisk");
        // Pole zaznaczania, które przypiszemy do zmiennej.
        CheckBox checkBox = new CheckBox("Pole zaznaczenia");
        // Dodamy kontenerowi dzieci - wywołując metodę getChildren, a następnie na wyniku wywołania
        // tej metody wywołując metodę addAll. Jako argumenty przekazujemy kontrolki, która zostaną dodane.
        vBox.getChildren().addAll(
                textField,
                label,
                button,
                checkBox
        );
        // Następnie wywołamy metodę setOnAction przycisku. Metoda służy do określenia, co ma się stać,
        // kiedy przycisk zostanie kliknięty. Wartość parametru określimy za pomocą wyrażenia lambda, o którym
        // będziemy mówili w przyszłości.
        // Na razie rozumiemy, że zapisujemy "event -> ", po czym zapiszemy nawiasy wąsate.
        button.setOnAction(event -> {
            // Instrukcje z bloku kodu będą wykonywane za każdym razem, gdy przycisk zostanie kliknięty.
            System.out.println("Przycisk został kliknięty");
            // Etykiecie ustawimy tekst, który będzie zawierał informacje o stanie pola tekstowego i pola zaznaczenia.
            label.setText("Wartość w polu tekstowym: " + textField.getText()
                + ", czy checkbox jest zaznaczony: " + checkBox.isSelected());
        });
        // Utworzymy obiekt typu Scene. Scena to główny element okna. Jako pierwszy argument przekażemy
        // korzeń sceny - bazowy element. W naszym przypadku będzie to vBox.
        // Następne argumenty to szerokość i wysokość.
        Scene scene = new Scene(vBox, 500, 300);
        // Ustawimy scenę oknu.
        stage.setScene(scene);
        // Pokażemy okno.
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
