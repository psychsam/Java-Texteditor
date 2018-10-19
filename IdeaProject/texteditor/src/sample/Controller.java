package sample;

import com.sun.source.util.DocTreePathScanner;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Controller {

    @FXML
    TextField textarea = new TextField();
    @FXML
    TextField textfield_input = new TextField();
    @FXML
    void btn_load_OnAction(ActionEvent event) {
        String content = new String();
        try {
            textfield_input.setText("asiodfi");
            String path = textfield_input.getText();
            System.out.println(path);

            content = new Scanner(new File(path)).useDelimiter("\\Z").next(); // \\Z is the end of string

            new Scanner(textfield_input.getText()).next();
        }
        catch(FileNotFoundException exception) {

        }

        textarea.setText(content);
    }

    @FXML
    void btn_save_OnAction(ActionEvent event) {

    }
    @FXML
    void btn_clear_OnAction(ActionEvent event) {

    }


}
