package com.debugging.pgccdownloaderapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DownloaderApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DownloaderApplication.class.getResource("downloader-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 420);
        stage.setTitle("Download Master");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}