package com.example.makaotest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class HelloApplication extends Application {
    public int Tryb; //0-Niski, 1-Wysoki
    public int Tura;
    public List<Card> cardsP1 =new ArrayList<>();;
    public List<Card> cardsP2 =new ArrayList<>();;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("startmenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Makao");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}