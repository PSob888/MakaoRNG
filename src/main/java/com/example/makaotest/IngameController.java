package com.example.makaotest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
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
    protected void initialize() throws FileNotFoundException {
        kartTest();
        checkForGreenP1();
        checkForGreenP2();
    }

    @FXML
    protected void onDobierz1Click(){
        p2invisible.setVisible(false);
        p1invisible.setVisible(true);
    }

    @FXML
    protected void onDobierz2Click(){
        p2invisible.setVisible(true);
        p1invisible.setVisible(false);
        Tura++;
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
    }

    private void onClickCardP1Fucntion(Button card, Button p, int amt) throws FileNotFoundException {
        //sprawdzanie i inne gowna
        if(cardsP1.size()>=amt&& card.equals(p)){
            String symbol=cardsP1.get(amt-1).getSymbol();
            String number=cardsP1.get(amt-1).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            onTable.setNumber(number);
            onTable.setSymbol(symbol);
            polozona1.setImage(image);
            polozona2.setImage(image);
            //usuniecie karty z reki
            //losowanie karty
            //reload kart w rece
            checkForGreenP1();
            checkForGreenP2();
            //animacja
        }
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
    }

    private void onClickCardP2Fucntion(Button card, Button p, int amt) throws FileNotFoundException {
        //sprawdzanie i inne gowna
        if(cardsP1.size()>=amt&& card.equals(p)){
            String symbol=cardsP1.get(amt-1).getSymbol();
            String number=cardsP1.get(amt-1).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            onTable.setNumber(number);
            onTable.setSymbol(symbol);
            polozona1.setImage(image);
            polozona2.setImage(image);
            //usuniecie karty z reki
            //losowanie karty
            //reload kart w rece
            checkForGreenP1();
            checkForGreenP2();
            //animacja
        }
    }

    void checkForGreenP1(){
        if(cardsP1.size()>=16)
        {
            if(cardsP1.get(15).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p116);
            else
                disableGreenGlow(p116);
        }
        if(cardsP1.size()>=15)
        {
            if(cardsP1.get(14).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p115);
            else
                disableGreenGlow(p115);
        }
        if(cardsP1.size()>=14)
        {
            if(cardsP1.get(13).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p114);
            else
                disableGreenGlow(p114);
        }
        if(cardsP1.size()>=13)
        {
            if(cardsP1.get(12).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p113);
            else
                disableGreenGlow(p113);
        }
        if(cardsP1.size()>=12)
        {
            if(cardsP1.get(11).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p112);
            else
                disableGreenGlow(p112);
        }
        if(cardsP1.size()>=11)
        {
            if(cardsP1.get(10).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p111);
            else
                disableGreenGlow(p111);
        }
        if(cardsP1.size()>=10)
        {
            if(cardsP1.get(9).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p110);
            else
                disableGreenGlow(p110);
        }
        if(cardsP1.size()>=9)
        {
            if(cardsP1.get(8).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p19);
            else
                disableGreenGlow(p19);
        }
        if(cardsP1.size()>=8)
        {
            if(cardsP1.get(7).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p18);
            else
                disableGreenGlow(p18);
        }
        if(cardsP1.size()>=7)
        {
            if(cardsP1.get(6).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p17);
            else
                disableGreenGlow(p17);
        }
        if(cardsP1.size()>=6)
        {
            if(cardsP1.get(5).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p16);
            else
                disableGreenGlow(p16);
        }
        if(cardsP1.size()>=5)
        {
            if(cardsP1.get(4).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p15);
            else
                disableGreenGlow(p15);
        }
        if(cardsP1.size()>=4)
        {
            if(cardsP1.get(3).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p14);
            else
                disableGreenGlow(p14);
        }
        if(cardsP1.size()>=3)
        {
            if(cardsP1.get(2).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p13);
            else
                disableGreenGlow(p13);
        }
        if(cardsP1.size()>=2)
        {
            if(cardsP1.get(1).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p12);
            else
                disableGreenGlow(p12);
        }
        if(cardsP1.size()>=1)
        {
            if(cardsP1.get(0).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p11);
            else
                disableGreenGlow(p11);
        }
    }

    void checkForGreenP2(){
        if(cardsP2.size()>=16)
        {
            if(cardsP2.get(15).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p216);
            else
                disableGreenGlow(p216);
        }
        if(cardsP2.size()>=15)
        {
            if(cardsP2.get(14).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p215);
            else
                disableGreenGlow(p215);
        }
        if(cardsP2.size()>=14)
        {
            if(cardsP2.get(13).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p214);
            else
                disableGreenGlow(p214);
        }
        if(cardsP2.size()>=13)
        {
            if(cardsP2.get(12).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p213);
            else
                disableGreenGlow(p213);
        }
        if(cardsP2.size()>=12)
        {
            if(cardsP2.get(11).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p212);
            else
                disableGreenGlow(p212);
        }
        if(cardsP2.size()>=11)
        {
            if(cardsP2.get(10).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p211);
            else
                disableGreenGlow(p211);
        }
        if(cardsP2.size()>=10)
        {
            if(cardsP2.get(9).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p210);
            else
                disableGreenGlow(p210);
        }
        if(cardsP2.size()>=9)
        {
            if(cardsP2.get(8).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p29);
            else
                disableGreenGlow(p29);
        }
        if(cardsP2.size()>=8)
        {
            if(cardsP2.get(7).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p28);
            else
                disableGreenGlow(p28);
        }
        if(cardsP2.size()>=7)
        {
            if(cardsP2.get(6).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p27);
            else
                disableGreenGlow(p27);
        }
        if(cardsP2.size()>=6)
        {
            if(cardsP2.get(5).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p26);
            else
                disableGreenGlow(p26);
        }
        if(cardsP2.size()>=5)
        {
            if(cardsP2.get(4).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p25);
            else
                disableGreenGlow(p25);
        }
        if(cardsP2.size()>=4)
        {
            if(cardsP2.get(3).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p24);
            else
                disableGreenGlow(p24);
        }
        if(cardsP2.size()>=3)
        {
            if(cardsP2.get(2).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p23);
            else
                disableGreenGlow(p23);
        }
        if(cardsP2.size()>=2)
        {
            if(cardsP2.get(1).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p22);
            else
                disableGreenGlow(p22);
        }
        if(cardsP2.size()>=1)
        {
            if(cardsP2.get(0).isEqual(onTable)|| Objects.equals(onTable.getNumber(), "0"))
                setGreenGlow(p21);
            else
                disableGreenGlow(p21);
        }
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
        dropShadow.setColor(Color.rgb(13,255,0));
        dropShadow.setHeight(31);
        dropShadow.setWidth(31);
        dropShadow.setRadius(15);
        dropShadow.setSpread(0.45);
        card.setEffect(dropShadow);
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

        //losowanie kart
        Random rand =new Random();
        //p1
        System.out.println("p1");
        for(int i=0;i<5;i++)
        {
            Card karta;
            do
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
            }while(isInHandP1(karta));
            System.out.println(karta.getSymbol() + ' ' + karta.getNumber());
            cardsP1.add(karta);
        }
        //p2
        System.out.println("p2");
        for(int i=0;i<5;i++)
        {
            Card karta;
            do
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
            }while(isInHandP1(karta)||isInHandP2(karta));
            System.out.println(karta.getSymbol() + ' ' + karta.getNumber());
            cardsP2.add(karta);
        }
    }

    void cardsSetImages() throws FileNotFoundException {
        if(cardsP1.size()>=16)
        {
            p116.setVisible(true);
            String symbol=cardsP1.get(15).getSymbol();
            String number=cardsP1.get(15).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p116.setBackground(bg);
        }
        if(cardsP1.size()>=15)
        {
            p115.setVisible(true);
            String symbol=cardsP1.get(14).getSymbol();
            String number=cardsP1.get(14).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p115.setBackground(bg);
        }
        if(cardsP1.size()>=14)
        {
            p114.setVisible(true);
            String symbol=cardsP1.get(13).getSymbol();
            String number=cardsP1.get(13).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p114.setBackground(bg);
        }
        if(cardsP1.size()>=13)
        {
            p113.setVisible(true);
            String symbol=cardsP1.get(12).getSymbol();
            String number=cardsP1.get(12).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p113.setBackground(bg);
        }
        if(cardsP1.size()>=12)
        {
            p112.setVisible(true);
            String symbol=cardsP1.get(11).getSymbol();
            String number=cardsP1.get(11).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p112.setBackground(bg);
        }
        if(cardsP1.size()>=11)
        {
            p111.setVisible(true);
            String symbol=cardsP1.get(10).getSymbol();
            String number=cardsP1.get(10).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p111.setBackground(bg);
        }
        if(cardsP1.size()>=10)
        {
            p110.setVisible(true);
            String symbol=cardsP1.get(9).getSymbol();
            String number=cardsP1.get(9).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p110.setBackground(bg);
        }
        if(cardsP1.size()>=9)
        {
            p19.setVisible(true);
            String symbol=cardsP1.get(8).getSymbol();
            String number=cardsP1.get(8).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p19.setBackground(bg);
        }
        if(cardsP1.size()>=8)
        {
            p18.setVisible(true);
            String symbol=cardsP1.get(7).getSymbol();
            String number=cardsP1.get(7).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p18.setBackground(bg);
        }
        if(cardsP1.size()>=7)
        {
            p17.setVisible(true);
            String symbol=cardsP1.get(6).getSymbol();
            String number=cardsP1.get(6).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p17.setBackground(bg);
        }
        if(cardsP1.size()>=6)
        {
            p16.setVisible(true);
            String symbol=cardsP1.get(5).getSymbol();
            String number=cardsP1.get(5).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p16.setBackground(bg);
        }
        if(cardsP1.size()>=5)
        {
            p15.setVisible(true);
            String symbol=cardsP1.get(4).getSymbol();
            String number=cardsP1.get(4).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p15.setBackground(bg);
        }
        if(cardsP1.size()>=4)
        {
            p14.setVisible(true);
            String symbol=cardsP1.get(3).getSymbol();
            String number=cardsP1.get(3).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p14.setBackground(bg);
        }
        if(cardsP1.size()>=3)
        {
            p13.setVisible(true);
            String symbol=cardsP1.get(2).getSymbol();
            String number=cardsP1.get(2).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p13.setBackground(bg);
        }
        if(cardsP1.size()>=2)
        {
            p12.setVisible(true);
            String symbol=cardsP1.get(1).getSymbol();
            String number=cardsP1.get(1).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p12.setBackground(bg);
        }
        if(cardsP1.size()>=1)
        {
            p11.setVisible(true);
            String symbol=cardsP1.get(0).getSymbol();
            String number=cardsP1.get(0).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p11.setBackground(bg);
        }

        //-------------------------------------------------------------------------------------------------
        if(cardsP2.size()>=16)
        {
            p216.setVisible(true);
            String symbol=cardsP2.get(15).getSymbol();
            String number=cardsP2.get(15).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p216.setBackground(bg);
        }
        if(cardsP2.size()>=15)
        {
            p215.setVisible(true);
            String symbol=cardsP2.get(14).getSymbol();
            String number=cardsP2.get(14).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p215.setBackground(bg);
        }
        if(cardsP2.size()>=14)
        {
            p214.setVisible(true);
            String symbol=cardsP2.get(13).getSymbol();
            String number=cardsP2.get(13).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p214.setBackground(bg);
        }
        if(cardsP2.size()>=13)
        {
            p213.setVisible(true);
            String symbol=cardsP2.get(12).getSymbol();
            String number=cardsP2.get(12).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p213.setBackground(bg);
        }
        if(cardsP2.size()>=12)
        {
            p212.setVisible(true);
            String symbol=cardsP2.get(11).getSymbol();
            String number=cardsP2.get(11).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p212.setBackground(bg);
        }
        if(cardsP2.size()>=11)
        {
            p211.setVisible(true);
            String symbol=cardsP2.get(10).getSymbol();
            String number=cardsP2.get(10).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p211.setBackground(bg);
        }
        if(cardsP2.size()>=10)
        {
            p210.setVisible(true);
            String symbol=cardsP2.get(9).getSymbol();
            String number=cardsP2.get(9).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p210.setBackground(bg);
        }
        if(cardsP2.size()>=9)
        {
            p29.setVisible(true);
            String symbol=cardsP2.get(8).getSymbol();
            String number=cardsP2.get(8).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p29.setBackground(bg);
        }
        if(cardsP1.size()>=8)
        {
            p28.setVisible(true);
            String symbol=cardsP2.get(7).getSymbol();
            String number=cardsP2.get(7).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p28.setBackground(bg);
        }
        if(cardsP1.size()>=7)
        {
            p27.setVisible(true);
            String symbol=cardsP2.get(6).getSymbol();
            String number=cardsP2.get(6).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p27.setBackground(bg);
        }
        if(cardsP1.size()>=6)
        {
            p26.setVisible(true);
            String symbol=cardsP2.get(5).getSymbol();
            String number=cardsP2.get(5).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p26.setBackground(bg);
        }
        if(cardsP2.size()>=5)
        {
            p25.setVisible(true);
            String symbol=cardsP2.get(4).getSymbol();
            String number=cardsP2.get(4).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p25.setBackground(bg);
        }
        if(cardsP2.size()>=4)
        {
            p24.setVisible(true);
            String symbol=cardsP2.get(3).getSymbol();
            String number=cardsP2.get(3).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p24.setBackground(bg);
        }
        if(cardsP2.size()>=3)
        {
            p23.setVisible(true);
            String symbol=cardsP2.get(2).getSymbol();
            String number=cardsP2.get(2).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p23.setBackground(bg);
        }
        if(cardsP2.size()>=2)
        {
            p22.setVisible(true);
            String symbol=cardsP2.get(1).getSymbol();
            String number=cardsP2.get(1).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p22.setBackground(bg);
        }
        if(cardsP2.size()>=1)
        {
            p21.setVisible(true);
            String symbol=cardsP2.get(0).getSymbol();
            String number=cardsP2.get(0).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image img = new Image(new FileInputStream(s));
            BackgroundSize size = new BackgroundSize(79,111,false,false,false,false);
            BackgroundImage bimg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, size);
            Background bg = new Background(bimg);
            p21.setBackground(bg);
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