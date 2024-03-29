package com.example.makaotest;

import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.effect.BlurType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.effect.DropShadow;
import javafx.util.Duration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class IngameController extends HelloApplication{

    @FXML
    private Text p1enemyilosc;
    @FXML
    private Text p2enemyilosc;
    @FXML
    private Text zmianagracza;
    @FXML
    private Text p1wym;
    @FXML
    private Text p2wym;
    @FXML
    private Text p1wymagania;
    @FXML
    private Text p2wymagania;
    @FXML
    private AnchorPane p1invisible;
    @FXML
    private AnchorPane p2invisible;
    @FXML
    private Button p11;
    @FXML
    private Button p12;
    @FXML
    private Button p13;
    @FXML
    private Button p14;
    @FXML
    private Button p15;
    @FXML
    private Button p16;
    @FXML
    private Button p17;
    @FXML
    private Button p18;
    @FXML
    private Button p19;
    @FXML
    private Button p110;
    @FXML
    private Button p111;
    @FXML
    private Button p112;
    @FXML
    private Button p113;
    @FXML
    private Button p114;
    @FXML
    private Button p115;
    @FXML
    private Button p116;
    @FXML
    private Button p21;
    @FXML
    private Button p22;
    @FXML
    private Button p23;
    @FXML
    private Button p24;
    @FXML
    private Button p25;
    @FXML
    private Button p26;
    @FXML
    private Button p27;
    @FXML
    private Button p28;
    @FXML
    private Button p29;
    @FXML
    private Button p210;
    @FXML
    private Button p211;
    @FXML
    private Button p212;
    @FXML
    private Button p213;
    @FXML
    private Button p214;
    @FXML
    private Button p215;
    @FXML
    private Button p216;
    @FXML
    private ImageView polozona1;
    @FXML
    private ImageView polozona2;
    @FXML
    private Button p1dobierz;
    @FXML
    private Button p2dobierz;
    @FXML
    private Button menu;
    @FXML
    private ChoiceBox p1wyborStatusBox;
    @FXML
    private ChoiceBox p2wyborStatusBox;
    ObservableList<String> figury = FXCollections.observableArrayList("Kier","Karo","Pik","Trefl");
    ObservableList<String> numery = FXCollections.observableArrayList("5","6","7","8","9","10");
    @FXML
    private Button p1okClickWybor;
    @FXML
    private Button p2okClickWybor;
    @FXML
    private AnchorPane p1WyborBlokada;
    @FXML
    private AnchorPane p2WyborBlokada;
    @FXML
    private AnchorPane p2jakGrac;
    @FXML
    private AnchorPane p1jakGrac;

    @FXML
    protected void initialize() throws FileNotFoundException {
        kartTest();
        checkForGreenP1();
        checkForGreenP2();
        dobranieSetter();
        System.out.println("Tryb: "+Tryb);
    }

    @FXML
    protected void onPytanie1Click(){
        p1jakGrac.setVisible(true);
    }

    @FXML
    protected void onPytanie2Click(){
        p2jakGrac.setVisible(true);
    }

    @FXML
    protected void onPytanie1Off(){
        p1jakGrac.setVisible(false);
    }

    @FXML
    protected void onPytanie2Off(){
        p2jakGrac.setVisible(false);
    }

    @FXML
    protected void cheatCode() throws FileNotFoundException {
        int size=cardsP1.size();
        for(int i=0;i<size;i++)
        {
            cardsP1.get(i).setNumber(onTable.getNumber());
            cardsP1.get(i).setSymbol(onTable.getSymbol());
        }
        cardsAmountUpdate();
        cardsSetImages();
        checkForGreenP1();
        System.out.println("Cheat");
    }

    @FXML
    protected void onMenuClick() throws IOException {
        //ustawianie zmiennych na poczatkowe
        zmianagracza.setText("Zmiana gracza");
        Tura=0;
        Tryb=0;
        ileDobrac=1;
        p1ileStoi=0;
        p2ileStoi=0;
        ileTurNumerek=0;
        ileTurColorek=0;
        currentColorek="0";
        currentNumerek="0";
        onTable.setSymbol("0");
        onTable.setNumber("0");
        cardsP1.clear();
        cardsP2.clear();
        //zmiana sceny
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("startmenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)menu.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    protected void onDobierz1Click() throws FileNotFoundException {
//        p2invisible.setVisible(false);
//        p1invisible.setVisible(true);
        for(int i=0;i<ileDobrac;i++)
            addCard(cardsP1);
        ileDobrac=1;
        cardsAmountUpdate();
        cardsSetImages();
        checkForGreenP1();
        if(ileTurColorek>0)
            ileTurColorek--;
        if(ileTurNumerek>0)
            ileTurNumerek--;
        dobranieSetter();
        animationFromP1ToP2();
    }

    @FXML
    protected void onDobierz2Click() throws FileNotFoundException {
//        p2invisible.setVisible(true);
//        p1invisible.setVisible(false);
        for(int i=0;i<ileDobrac;i++)
            addCard(cardsP2);
        ileDobrac=1;
        cardsAmountUpdate();
        cardsSetImages();
        checkForGreenP2();
        if(ileTurColorek>0)
            ileTurColorek--;
        if(ileTurNumerek>0)
            ileTurNumerek--;
        Tura++;
        dobranieSetter();
        animationFromP2ToP1();
    }

    void addCard(List<Card> cards)
    {
        Random rand = new Random();
        Card zamiana = new Card("1", "1");
        while (true) {
            String s = new String();
            int los = rand.nextInt(4);
            if (los == 0)
                s = "s";
            if (los == 1)
                s = "w";
            if (los == 2)
                s = "d";
            if (los == 3)
                s = "z";
            int los2 = rand.nextInt(2, 15);
            String a = Integer.toString(los2);
            zamiana.setSymbol(s);
            zamiana.setNumber(a);
            if (!isInHandP2(zamiana) && !isInHandP1(zamiana) && zamiana.isDiffrent(onTable))
                break;
        }
        System.out.println(zamiana.getNumber()+zamiana.getSymbol());
        cards.add(zamiana);

    }

    @FXML
    protected void kartTest() throws FileNotFoundException {
        p2invisible.setVisible(true);
        p1invisible.setVisible(false);
        cardsStart();
        cardsSetImages();
        int enemy1=cardsP2.size();
        int enemy2=cardsP1.size();
        p1enemyilosc.setText(Integer.toString(enemy1));
        p2enemyilosc.setText(Integer.toString(enemy2));
        String s=new String("karty/back.png");
        System.out.println(s);
        Image image = new Image(new FileInputStream(s));
        polozona1.setImage(image);
        polozona2.setImage(image);
    }

    @FXML
    protected void onClickCardP1(ActionEvent e) throws FileNotFoundException {
        //pobieranie guziora
        Button card = (Button)e.getTarget();
        //ustawianie karty na srodku
        onClickCardP1Fucntion(card,p116,16);
        onClickCardP1Fucntion(card,p115,15);
        onClickCardP1Fucntion(card,p114,14);
        onClickCardP1Fucntion(card,p113,13);
        onClickCardP1Fucntion(card,p112,12);
        onClickCardP1Fucntion(card,p111,11);
        onClickCardP1Fucntion(card,p110,10);
        onClickCardP1Fucntion(card,p19,9);
        onClickCardP1Fucntion(card,p18,8);
        onClickCardP1Fucntion(card,p17,7);
        onClickCardP1Fucntion(card,p16,6);
        onClickCardP1Fucntion(card,p15,5);
        onClickCardP1Fucntion(card,p14,4);
        onClickCardP1Fucntion(card,p13,3);
        onClickCardP1Fucntion(card,p12,2);
        onClickCardP1Fucntion(card,p11,1);
        dobranieSetter();
    }

    private void onClickCardP1Fucntion(Button card, Button p, int amt) throws FileNotFoundException {
        //sprawdzanie i inne gowna
        if(cardsP1.size()>=amt&&card.equals(p)&&(cardsP1.get(amt-1).isSimilar(onTable)||Objects.equals(onTable.getNumber(), "0"))){
            Card karta = cardsP1.get(amt - 1);
            String symbol = cardsP1.get(amt - 1).getSymbol();
            String number = cardsP1.get(amt - 1).getNumber();
            String s = new String("karty/" + number + symbol + ".png");
            System.out.println(s + " Na srodek");
            Image image = new Image(new FileInputStream(s));
            onTable.setNumber(number);
            onTable.setSymbol(symbol);
            polozona1.setImage(image);
            polozona2.setImage(image);
            //usuniecie karty z reki
            specialCardsDetectorP1(karta);
            cardsP1.remove(amt - 1);
            disableAllCardsP1();
            if(ileTurColorek>0)
                ileTurColorek--;
            if(ileTurNumerek>0)
                ileTurNumerek--;
            if (cardsP1.size() == 0) {
                winnerAnimationP1();
            } else {
                //zamiana karty z reki na losowa
                randomizeCards(cardsP1);
                //reload kart w rece
                cardsSetImages();
                checkForGreenP1();
                checkForGreenP2();
                //update ilosci kart
                cardsAmountUpdate();
                //animacja
                animationFromP1ToP2();
            }
        }
    }

    //1. 2,3,król czerw. król wino
    //3. 4
    //5. Królowa - usuniecie kart do dodania i 4
    //4. As - zmiana koloru
    //5. Jopek - Żądanie karty
    private void specialCardsDetectorP1(Card card)
    {
        ileDobrac=ileDobrac+specialCardsDobranie(card);

        p2ileStoi=p1ileStoi+specialCardsCzekanie(card);
        if(specialCardsCzekanie(card)==1)
            p1ileStoi=0;

        if(specialCardsKrolowa(card)){
            ileDobrac=1;
            p1ileStoi=0;
        }
    }

    private void dobranieSetter(){
        p1wymagania.setText(String.valueOf(ileDobrac));
        p2wymagania.setText(String.valueOf(ileDobrac));
    }
//    ObservableList<String> figury = FXCollections.observableArrayList("Kier","Karo","Pik","Trefl");
    @FXML
    protected void onClickWyborButtonP1(ActionEvent e){
        String wybor= (String) p1wyborStatusBox.getValue();
        if(Objects.equals(wybor, "Kier")||Objects.equals(wybor, "Karo")||Objects.equals(wybor, "Pik")||Objects.equals(wybor, "Trefl")){
            currentColorek=wybor;
            ileTurColorek=2;
            currentNumerek="0";
            ileTurNumerek=0;
        }

        if(Objects.equals(wybor, "5")||Objects.equals(wybor, "6")||Objects.equals(wybor, "7")||Objects.equals(wybor, "8")
            ||Objects.equals(wybor, "9")||Objects.equals(wybor, "10")){
            currentNumerek=wybor;
            ileTurNumerek=2;
            currentColorek="0";
            ileTurColorek=0;
        }
        animationFromP1ToP2();
        p1WyborBlokada.setVisible(false);
    }

    private int specialCardsDobranie(Card card){
        int amount=0;

        if(Objects.equals(card.getNumber(), "2")) //dwójki
            amount+=2;
        if(Objects.equals(card.getNumber(), "3")) //trójki
            amount+=3;
        if(Objects.equals(card.getNumber(), "13")&&((Objects.equals(card.getSymbol(), "s")||Objects.equals(card.getSymbol(), "w"))))
            amount+=5;//króle czerwo i wino

        return amount;
    }

    private int specialCardsCzekanie(Card card){ //dodawanie czekania
        int amount=0;

        if(Objects.equals(card.getNumber(), "4"))
            amount++;

        return amount;
    }

    private boolean specialCardsKrolowa(Card card) //sprawdzanie czy jest krolowa
    {
        return Objects.equals(card.getNumber(), "12");
    }

    void winnerAnimationP1()
    {
        p1invisible.setOpacity(0);
        p1invisible.setVisible(true);
        p2invisible.setOpacity(1);
        p2invisible.setVisible(true);
        menu.setVisible(true);
        zmianagracza.setVisible(true);
        zmianagracza.setText("Winner: Gracz1");
        FadeTransition t1 = new FadeTransition(Duration.millis(1000),p1invisible);
        t1.setFromValue(0);
        t1.setToValue(1);
        t1.play();
        FadeTransition t2 = new FadeTransition(Duration.millis(500),zmianagracza);
        t2.setFromValue(0);
        t2.setToValue(1);
        t1.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                t2.play();
                FadeTransition t3 = new FadeTransition(Duration.millis(500),menu);
                t3.setFromValue(0);
                t3.setToValue(1);
                t2.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        t3.play();
                    }
                });
            }
        });
    }

    void animationFromP1ToP2()
    {
        p1invisible.setOpacity(0);
        p1invisible.setVisible(true);
        p2invisible.setOpacity(1);
        p2invisible.setVisible(true);
        FadeTransition t1 = new FadeTransition(Duration.millis(1000),p1invisible);
        t1.setFromValue(0);
        t1.setToValue(1);
        t1.play();
        FadeTransition t2 = new FadeTransition(Duration.millis(1000),p2invisible);
        t2.setFromValue(1);
        t2.setToValue(0);
        t2.setDelay(Duration.millis(4000));
        t2.play();
        t1.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                zmianagracza.setVisible(true);
                FadeTransition t3 = new FadeTransition(Duration.millis(500),zmianagracza);
                t3.setFromValue(0);
                t3.setToValue(1.0);
                t3.setAutoReverse(true);
                t3.setCycleCount(1);
                t3.play();
                t3.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        FadeTransition t4 = new FadeTransition(Duration.millis(500),zmianagracza);
                        t4.setFromValue(1.0);
                        t4.setToValue(0);
                        t4.setDelay(Duration.millis(2000));
                        t4.setAutoReverse(true);
                        t4.setCycleCount(1);
                        t4.play();
                    }
                });
            }
        });
        t2.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                p2invisible.setVisible(false);
                zmianagracza.setVisible(false);
            }
        });
    }

    void randomizeCards(List<Card> cards){
        Random rand =new Random();
        if(Tryb==0){
            int max=cards.size();
            int cardnumber=rand.nextInt(0, max);
            Card karta = cards.get(cardnumber);
            Card zamiana = new Card(karta.getSymbol(), karta.getNumber());
            while(true){
                String s = new String();
                int los = rand.nextInt(4);
                if (los == 0)
                    s = "s";
                if (los == 1)
                    s = "w";
                if (los == 2)
                    s = "d";
                if (los == 3)
                    s = "z";
                int los2 = rand.nextInt(2, 15);
                String a = Integer.toString(los2);
                zamiana.setSymbol(s);
                zamiana.setNumber(a);
                if(zamiana.isDiffrent(karta)&&!isInHandP2(zamiana)&&!isInHandP1(zamiana)&&zamiana.isDiffrent(onTable))
                    break;
            }
            System.out.println("zamiana "+karta.getNumber()+karta.getSymbol()+" na "+zamiana.getNumber()+zamiana.getSymbol());
            cards.set(cardnumber,zamiana);
        }
        else{
            for(int i=0;i<cards.size();i++)
            {
                Card karta = cards.get(i);
                Card zamiana = new Card(karta.getSymbol(), karta.getNumber());
                while(true){
                    String s = new String();
                    int los = rand.nextInt(4);
                    if (los == 0)
                        s = "s";
                    if (los == 1)
                        s = "w";
                    if (los == 2)
                        s = "d";
                    if (los == 3)
                        s = "z";
                    int los2 = rand.nextInt(2, 15);
                    String a = Integer.toString(los2);
                    zamiana.setSymbol(s);
                    zamiana.setNumber(a);
                    if(zamiana.isDiffrent(karta)&&!isInHandP2(zamiana)&&!isInHandP1(zamiana)&&zamiana.isDiffrent(onTable))
                        break;
                }
                System.out.println("zamiana "+karta.getNumber()+karta.getSymbol()+" na "+zamiana.getNumber()+zamiana.getSymbol());
                cards.set(i,zamiana);
            }
        }
    }

    void disableAllCardsP1()
    {
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
    }

    @FXML
    protected void onClickCardP2(ActionEvent e) throws FileNotFoundException {
        //pobieranie guziora
        Button card = (Button)e.getTarget();
        //ustawianie karty na srodku
        onClickCardP2Fucntion(card,p216,16);
        onClickCardP2Fucntion(card,p215,15);
        onClickCardP2Fucntion(card,p214,14);
        onClickCardP2Fucntion(card,p213,13);
        onClickCardP2Fucntion(card,p212,12);
        onClickCardP2Fucntion(card,p211,11);
        onClickCardP2Fucntion(card,p210,10);
        onClickCardP2Fucntion(card,p29,9);
        onClickCardP2Fucntion(card,p28,8);
        onClickCardP2Fucntion(card,p27,7);
        onClickCardP2Fucntion(card,p26,6);
        onClickCardP2Fucntion(card,p25,5);
        onClickCardP2Fucntion(card,p24,4);
        onClickCardP2Fucntion(card,p23,3);
        onClickCardP2Fucntion(card,p22,2);
        onClickCardP2Fucntion(card,p21,1);
        dobranieSetter();
    }

    private void onClickCardP2Fucntion(Button card, Button p, int amt) throws FileNotFoundException {
        //sprawdzanie i inne gowna
        if(cardsP2.size()>=amt&&card.equals(p)&&(cardsP2.get(amt-1).isSimilar(onTable)||Objects.equals(onTable.getNumber(), "0"))){
            String symbol=cardsP2.get(amt-1).getSymbol();
            String number=cardsP2.get(amt-1).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            onTable.setNumber(number);
            onTable.setSymbol(symbol);
            polozona1.setImage(image);
            polozona2.setImage(image);
            //usuniecie karty z reki
            specialCardsDetectorP1(cardsP2.get(amt-1));
            cardsP2.remove(amt-1);
            disableAllCardsP2();
            if(cardsP1.size()==0) {
                winnerAnimationP2();
            }
            else {
                //zamiana karty z reki na losowa
                randomizeCards(cardsP2);
                //reload kart w rece
                cardsSetImages();
                checkForGreenP1();
                checkForGreenP2();
                //update ilosci kart
                cardsAmountUpdate();
                //animacja
                animationFromP2ToP1();
            }
        }
    }

    void winnerAnimationP2()
    {
        p1invisible.setOpacity(1);
        p1invisible.setVisible(true);
        p2invisible.setOpacity(0);
        p2invisible.setVisible(true);
        menu.setVisible(true);
        zmianagracza.setVisible(true);
        zmianagracza.setText("Winner: Gracz2");
        FadeTransition t1 = new FadeTransition(Duration.millis(1000),p1invisible);
        t1.setFromValue(0);
        t1.setToValue(1);
        t1.play();
        FadeTransition t2 = new FadeTransition(Duration.millis(500),zmianagracza);
        t2.setFromValue(0);
        t2.setToValue(1);
        t1.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                t2.play();
                FadeTransition t3 = new FadeTransition(Duration.millis(500),menu);
                t3.setFromValue(0);
                t3.setToValue(1);
                t2.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        t3.play();
                    }
                });
            }
        });
    }

    void cardsAmountUpdate()
    {
        int enemy1 = cardsP2.size();
        int enemy2 = cardsP1.size();
        p1enemyilosc.setText(Integer.toString(enemy1));
        p2enemyilosc.setText(Integer.toString(enemy2));
    }

    void animationFromP2ToP1()
    {
        p1invisible.setOpacity(1);
        p1invisible.setVisible(true);
        p2invisible.setOpacity(0);
        p2invisible.setVisible(true);
        FadeTransition t1 = new FadeTransition(Duration.millis(1000),p2invisible);
        t1.setFromValue(0);
        t1.setToValue(1);
        t1.play();
        FadeTransition t2 = new FadeTransition(Duration.millis(1000),p1invisible);
        t2.setFromValue(1);
        t2.setToValue(0);
        t2.setDelay(Duration.millis(4000));
        t2.play();
        t1.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                zmianagracza.setVisible(true);
                FadeTransition t3 = new FadeTransition(Duration.millis(500),zmianagracza);
                t3.setFromValue(0);
                t3.setToValue(1.0);
                t3.setAutoReverse(true);
                t3.setCycleCount(1);
                t3.play();
                t3.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        FadeTransition t4 = new FadeTransition(Duration.millis(500),zmianagracza);
                        t4.setFromValue(1.0);
                        t4.setToValue(0);
                        t4.setDelay(Duration.millis(2000));
                        t4.setAutoReverse(true);
                        t4.setCycleCount(1);
                        t4.play();
                    }
                });
            }
        });
        t2.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                p1invisible.setVisible(false);
                zmianagracza.setVisible(false);
            }
        });
    }

    void disableAllCardsP2()
    {
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

    void checkForGreenP1(){
        checkForGreenHelper(cardsP1, 16, 15, p116);
        checkForGreenHelper(cardsP1, 15, 14, p115);
        checkForGreenHelper(cardsP1, 14, 13, p114);
        checkForGreenHelper(cardsP1, 13, 12, p113);
        checkForGreenHelper(cardsP1, 12, 11, p112);
        checkForGreenHelper(cardsP1, 11, 10, p111);
        checkForGreenHelper(cardsP1, 10, 9, p110);
        checkForGreenHelper(cardsP1, 9, 8, p19);
        checkForGreenHelper(cardsP1, 8, 7, p18);
        checkForGreenHelper(cardsP1, 7, 6, p17);
        checkForGreenHelper(cardsP1, 6, 5, p16);
        checkForGreenHelper(cardsP1, 5, 4, p15);
        checkForGreenHelper(cardsP1, 4, 3, p14);
        checkForGreenHelper(cardsP1, 3, 2, p13);
        checkForGreenHelper(cardsP1, 2, 1, p12);
        checkForGreenHelper(cardsP1, 1, 0, p11);
    }

    void checkForGreenP2(){
        checkForGreenHelper(cardsP2, 16, 15, p216);
        checkForGreenHelper(cardsP2, 15, 14, p215);
        checkForGreenHelper(cardsP2, 14, 13, p214);
        checkForGreenHelper(cardsP2, 13, 12, p213);
        checkForGreenHelper(cardsP2, 12, 11, p212);
        checkForGreenHelper(cardsP2, 11, 10, p211);
        checkForGreenHelper(cardsP2, 10, 9, p210);
        checkForGreenHelper(cardsP2, 9, 8, p29);
        checkForGreenHelper(cardsP2, 8, 7, p28);
        checkForGreenHelper(cardsP2, 7, 6, p27);
        checkForGreenHelper(cardsP2, 6, 5, p26);
        checkForGreenHelper(cardsP2, 5, 4, p25);
        checkForGreenHelper(cardsP2, 4, 3, p24);
        checkForGreenHelper(cardsP2, 3, 2, p23);
        checkForGreenHelper(cardsP2, 2, 1, p22);
        checkForGreenHelper(cardsP2, 1, 0, p21);
    }

    private void checkForGreenHelper(List<Card> cards, int x, int index, Button p) {
        if(cards.size()>= x)
        {
            if(ileDobrac==1){
                if(cards.get(index).isSimilar(onTable)||Objects.equals(onTable.getNumber(), "0")) {
                    setGreenGlow(p);
                }
                else
                    disableGreenGlow(p);
            }
            else{
                if(isBitewna(cards.get(index)))
                    setGreenGlow(p);
                else
                    disableGreenGlow(p);
            }

        }
    }

    boolean isBitewna(Card card){
        if(Objects.equals(card.getNumber(), "2")||Objects.equals(card.getNumber(), "3"))
            return true;

        if(Objects.equals(card.getNumber(), "13")&&Objects.equals(card.getSymbol(), "s"))
            return true;

        if(Objects.equals(card.getNumber(), "13")&&Objects.equals(card.getSymbol(), "w"))
            return true;

        return false;
    }

    void disableGreenGlow(Button card){
        //card.setStyle("-fx-effect: dropshadow(three-pass-box,rgb(13,255,0),35,0.63,0,0)");
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.THREE_PASS_BOX);
        dropShadow.setColor(Color.rgb(0,0,0));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(10);
        dropShadow.setSpread(0);
        card.setEffect(dropShadow);
    }

    void setGreenGlow(Button card){
        //card.setStyle("-fx-effect: dropshadow(three-pass-box,rgb(0,0,0),10,0,0,0)");
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.THREE_PASS_BOX);
        dropShadow.setColor(Color.rgb(13,185,0));
        dropShadow.setHeight(31);
        dropShadow.setWidth(31);
        dropShadow.setRadius(15);
        dropShadow.setSpread(0.45);
        card.setEffect(dropShadow);
    }

    //    ObservableList<String> figury = FXCollections.observableArrayList("Kier","Karo","Pik","Trefl");
    //    ObservableList<String> numery = FXCollections.observableArrayList("5","6","7","8","9","10");

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

        //losowanie kart
        Random rand =new Random();
        //p1
        System.out.println("p1");
        for(int i=0;i<5;i++)
        {
            Card karta;
            while(true)
            {
                String s = new String();
                int los = rand.nextInt(4);
                if (los == 0)
                    s = "s";
                if (los == 1)
                    s = "w";
                if (los == 2)
                    s = "d";
                if (los == 3)
                    s = "z";
                int los2 = rand.nextInt(2, 15);
                String a = Integer.toString(los2);
                karta = new Card(s, a);
                if(!isInHandP1(karta))
                    break;
            }
            System.out.println(karta.getSymbol() + ' ' + karta.getNumber());
            cardsP1.add(karta);
        }
        //p2
        System.out.println("p2");
        for(int i=0;i<5;i++)
        {
            Card karta;
            while(true)
            {
                String s = new String();
                int los = rand.nextInt(4);
                if (los == 0)
                    s = "s";
                if (los == 1)
                    s = "w";
                if (los == 2)
                    s = "d";
                if (los == 3)
                    s = "z";
                int los2 = rand.nextInt(2, 15);
                String a = Integer.toString(los2);
                karta = new Card(s, a);
                if(!isInHandP1(karta)&&!isInHandP2(karta))
                    break;
            }
            System.out.println(karta.getSymbol() + ' ' + karta.getNumber());
            cardsP2.add(karta);
        }
    }

    void cardsSetImages() throws FileNotFoundException {
        cardsSetImagesHelper(cardsP1, 16, p116, 15);
        cardsSetImagesHelper(cardsP1, 15, p115, 14);
        cardsSetImagesHelper(cardsP1, 14, p114, 13);
        cardsSetImagesHelper(cardsP1, 13, p113, 12);
        cardsSetImagesHelper(cardsP1, 12, p112, 11);
        cardsSetImagesHelper(cardsP1, 11, p111, 10);
        cardsSetImagesHelper(cardsP1, 10, p110, 9);
        cardsSetImagesHelper(cardsP1, 9, p19, 8);
        cardsSetImagesHelper(cardsP1, 8, p18, 7);
        cardsSetImagesHelper(cardsP1, 7, p17, 6);
        cardsSetImagesHelper(cardsP1, 6, p16, 5);
        cardsSetImagesHelper(cardsP1, 5, p15, 4);
        cardsSetImagesHelper(cardsP1, 4, p14, 3);
        cardsSetImagesHelper(cardsP1, 3, p13, 2);
        cardsSetImagesHelper(cardsP1, 2, p12, 1);
        cardsSetImagesHelper(cardsP1, 1, p11, 0);
        //-------------------------------------------------------------------------------------------------
        cardsSetImagesHelper(cardsP2, 16, p216, 15);
        cardsSetImagesHelper(cardsP2, 15, p215, 14);
        cardsSetImagesHelper(cardsP2, 14, p214, 13);
        cardsSetImagesHelper(cardsP2, 13, p213, 12);
        cardsSetImagesHelper(cardsP2, 12, p212, 11);
        cardsSetImagesHelper(cardsP2, 11, p211, 10);
        cardsSetImagesHelper(cardsP2, 10, p210, 9);
        cardsSetImagesHelper(cardsP2, 9, p29, 8);
        cardsSetImagesHelper(cardsP2, 8, p28, 7);
        cardsSetImagesHelper(cardsP2, 7, p27, 6);
        cardsSetImagesHelper(cardsP2, 6, p26, 5);
        cardsSetImagesHelper(cardsP2, 5, p25, 4);
        cardsSetImagesHelper(cardsP2, 4, p24, 3);
        cardsSetImagesHelper(cardsP2, 3, p23, 2);
        cardsSetImagesHelper(cardsP2, 2, p22, 1);
        cardsSetImagesHelper(cardsP2, 1, p21, 0);
    }

    private void cardsSetImagesHelper(List<Card> cards, int x, Button p, int index) throws FileNotFoundException {
        if(cards.size()>= x)
        {
            p.setVisible(true);
            String symbol= cards.get(index).getSymbol();
            String number= cards.get(index).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s+" do gracza");
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p.setBackground(bg);
        }
    }

    public boolean isInHandP1(Card c){
        for(int i=0;i<cardsP1.size();i++)
        {
            if(c.isEqual(cardsP1.get(i)))
                return true;
        }
        return false;
    }

    public boolean isInHandP2(Card c){
        for(int i=0;i<cardsP1.size();i++)
        {
            if(c.isEqual(cardsP1.get(i)))
                return true;
        }
        return false;
    }
}