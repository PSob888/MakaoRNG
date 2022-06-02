package com.example.makaotest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
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
    private ImageView p11;
    @FXML
    private ImageView p12;
    @FXML
    private ImageView p13;
    @FXML
    private ImageView p14;
    @FXML
    private ImageView p15;
    @FXML
    private ImageView p16;
    @FXML
    private ImageView p17;
    @FXML
    private ImageView p18;
    @FXML
    private ImageView p19;
    @FXML
    private ImageView p110;
    @FXML
    private ImageView p111;
    @FXML
    private ImageView p112;
    @FXML
    private ImageView p113;
    @FXML
    private ImageView p114;
    @FXML
    private ImageView p115;
    @FXML
    private ImageView p116;
    @FXML
    private ImageView p21;
    @FXML
    private ImageView p22;
    @FXML
    private ImageView p23;
    @FXML
    private ImageView p24;
    @FXML
    private ImageView p25;
    @FXML
    private ImageView p26;
    @FXML
    private ImageView p27;
    @FXML
    private ImageView p28;
    @FXML
    private ImageView p29;
    @FXML
    private ImageView p210;
    @FXML
    private ImageView p211;
    @FXML
    private ImageView p212;
    @FXML
    private ImageView p213;
    @FXML
    private ImageView p214;
    @FXML
    private ImageView p215;
    @FXML
    private ImageView p216;

    @FXML
    protected void onNewGameButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ingamefull.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)newGame.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        Tura=0;
        p2invisible.setVisible(true);
        cardsStart();
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

    void cardsStart(){ //dodac krole itd
        p11.setVisible(false);
        p12.setVisible(false);
        p13.setVisible(false);
        p14.setVisible(false);
        p15.setVisible(false);
        p16.setVisible(false);
        p17.setVisible(false);
        p18.setVisible(false);
        p19.setVisible(false);
        p110.setVisible(false);
        p111.setVisible(false);
        p112.setVisible(false);
        p113.setVisible(false);
        p114.setVisible(false);
        p115.setVisible(false);
        p116.setVisible(false);
        p21.setVisible(false);
        p22.setVisible(false);
        p23.setVisible(false);
        p24.setVisible(false);
        p25.setVisible(false);
        p26.setVisible(false);
        p27.setVisible(false);
        p28.setVisible(false);
        p29.setVisible(false);
        p210.setVisible(false);
        p211.setVisible(false);
        p212.setVisible(false);
        p213.setVisible(false);
        p214.setVisible(false);
        p215.setVisible(false);
        p216.setVisible(false);

    }
}