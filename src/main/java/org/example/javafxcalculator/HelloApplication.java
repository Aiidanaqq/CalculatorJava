package org.example.javafxcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage Stage) throws IOException {
        FXMLLoader fxmlLoader  = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Stage.setTitle("Hello Calculator App");
        Scene scene = new Scene(fxmlLoader.load(),320, 240);
        Stage.setScene(scene);
        Stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}