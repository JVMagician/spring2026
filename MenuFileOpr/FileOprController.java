package com.example.fileoperation;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javafx.scene.control.TextArea;

public class FileOprController {
    @FXML
    private Label fileLabel;

    @FXML
    private TextArea fileContentArea;

    private Stage stage;
    private File currentFile;

    // Setter for stage (needed to open FileChooser)
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void handleOpen() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");

        //-------
        // Only show .txt files
        FileChooser.ExtensionFilter txtFilter = new FileChooser.ExtensionFilter("Text Files(*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(txtFilter);

        // Optional: make it default
        fileChooser.setSelectedExtensionFilter(txtFilter);
        //-------

        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            fileLabel.setText("Selected file: " + file.getAbsolutePath());
            currentFile = file;
            try {
                String content = Files.readString(file.toPath());
                fileContentArea.setText(content);
            } catch (IOException e) {
                fileContentArea.setText("Failed to read file: " + e.getMessage());
            }
        }
    }

    @FXML
    private void handleExit() {
        currentFile = null;
        stage.close();
    }

    @FXML
    private void handleCreateNewFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Create New Text File");

        // Only allow .txt files
        FileChooser.ExtensionFilter txtFilter = new FileChooser.ExtensionFilter("Text Files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(txtFilter);
        fileChooser.setSelectedExtensionFilter(txtFilter);

        // Show save dialog
        File file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            try {
                // Create the file if it doesn't exist
                if (!file.exists()) {
                    file.createNewFile();
                }

                // Optionally, write initial content (empty or template)
                Files.writeString(file.toPath(), ""); // starts empty
                fileLabel.setText("Created file: " + file.getAbsolutePath());
                fileContentArea.setText(""); // clear TextArea

            } catch (IOException e) {
                fileLabel.setText("Error creating file: " + e.getMessage());
            }
        }
    }

    @FXML
    private void handleSaveFile() {
        /*
        TODO: in-class lab activity
        */
    }
}