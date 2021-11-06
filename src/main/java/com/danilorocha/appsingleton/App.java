package com.danilorocha.appsingleton;

import com.danilorocha.appsingleton.view.MainScene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        var label = new Label("Hello, JavaFX");
        var scene = new MainScene(this);
        stage.setScene(scene);
        stage.show();
        /*FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/
    }

    public static void main(String[] args) {
        launch();
    }

    public void setScene(Scene scene) {
        stage.setScene(scene);
    }

}