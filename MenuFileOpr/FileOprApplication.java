package com.example.fileoperation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FileOprApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FileOprApplication.class.getResource("fileopr-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 820, 440);

        //----------
        // Pass stage to controller for FileChooser
        FileOprController controller = fxmlLoader.getController();
        controller.setStage(stage);
        //----------

        stage.setTitle("File loader");
        stage.setResizable(false); // Disables resizing
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}