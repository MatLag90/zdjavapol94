package pl.sdacademy;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        gridPane.add(new Label("HiHat"), 0, 0);
        gridPane.add(new Label("Stopa"), 0, 1);
        gridPane.add(new Label("Werbel"), 0, 2);
        MidiPlayer midiPlayer = new MidiPlayer();
        midiPlayer.setOnNotePlayed(noteIndex -> System.out.println(noteIndex));
        midiPlayer.start();
        NoteSequence noteSequence = midiPlayer.getNoteSequence();
        for (int i = 0; i < 32; i++) {
            int columnIndex = i + 1;
            int noteIndex = i;
            ///////// HiHat checkbox - TODO spróbuj wyłączyć poniższe duplikaty do metod //////////
            CheckBox chkHiHat = new CheckBox();
            chkHiHat.setOnAction(event -> noteSequence.setHHNoteAt(noteIndex, chkHiHat.isSelected()));
            gridPane.add(chkHiHat, columnIndex, 0);
            ///////// Kick checkbox //////////
            CheckBox chkKick = new CheckBox();
            chkKick.setOnAction(event -> noteSequence.setKickNoteAt(noteIndex, chkKick.isSelected()));
            gridPane.add(chkKick, columnIndex, 1);
            ///////// Snare checkbox //////////
            CheckBox chkSnare = new CheckBox();
            chkSnare.setOnAction(event -> noteSequence.setSnareNoteAt(noteIndex, chkSnare.isSelected()));
            gridPane.add(chkSnare, columnIndex, 2);
        }
        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
