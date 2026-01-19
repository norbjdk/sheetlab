package com.norbdev.desktop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;

public class Launcher extends Application {
    private Stage primaryStage;
    private Map<String, Scene> projectScenes;
    @Override
    public void init() {

    }

    @Override
    public void start(Stage stage)  {
        primaryStage = stage;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/home.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1800, 900);
            stage.setTitle("Home | Sheetlab");
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}