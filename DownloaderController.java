package com.debugging.pgccdownloaderapp;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.concurrent.Task;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;

public class DownloaderController {

    @FXML
    private ProgressBar progress1, progress2, progress3;

    @FXML
    private Button btn1, btn2, btn3;

    @FXML
    private Label labelPercent1, labelPercent2, labelPercent3;

    @FXML
    private void startDownload1() {
        startDownload(progress1, btn1, 50, labelPercent1); // slower download
    }

    @FXML
    private void startDownload2() {
        startDownload(progress2, btn2, 30, labelPercent2); // faster download
    }

    @FXML
    private void startDownload3() {
        startDownload(progress3, btn3, 70, labelPercent3); // medium download
    }

    private void startDownload(ProgressBar progressBar, Button button, int speed, Label percentLabel) {
        button.setDisable(true); // prevent multiple clicks

        Task<Void> task = new Task<>() {
            @Override
            protected Void call() throws Exception {
                for (int i = 1; i <= 100; i++) {
                    Thread.sleep(speed); // simulate download
                    updateProgress(i, 100);

                    int percentValue = i;
                    Platform.runLater(() -> percentLabel.setText(percentValue + "%"));

                }
                return null;
            }
        };

        task.setOnSucceeded(e -> button.setDisable(false)); // re-enable button
        task.setOnFailed(e -> button.setDisable(false));

        /*
        task.progressProperty().addListener((observableValue, oldVal, newVal) -> {
            int percent = (int)(newVal.doubleValue() * 100);
            labelPercent1.setText(percent + "%");
        });
        */

        progressBar.progressProperty().bind(task.progressProperty());

        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start();
    }

}