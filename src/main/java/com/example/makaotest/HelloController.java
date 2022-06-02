package com.example.makaotest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController extends HelloApplication{

    @FXML
    private Button newGame;
    @FXML
    private Button niski;
    @FXML
    private Button wysoki;
    @FXML
    private Pane p1invisible;
    @FXML
    private Pane p2invisible;

    @FXML
    protected void onNewGameButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ingamefull.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)newGame.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        Tura=0;
        p2invisible.setVisible(true);
    }

    @FXML
    protected void onNiskiClick() {
        wysoki.setTextFill(Color.rgb(111,111,111));
        niski.setTextFill(Color.WHITE);
        Tryb=0;
    }

    @FXML
    protected void onWysokiClick() {
        niski.setTextFill(Color.rgb(111,111,111));
        wysoki.setTextFill(Color.WHITE);
        Tryb=1;
    }

    void cardsStart(){

    }
}