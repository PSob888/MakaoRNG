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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.effect.DropShadow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
            setGreenGlow(p11);
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
            setGreenGlow(p21);
        }
    }

    void disableGreenGlow(ImageView card){
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

    void setGreenGlow(ImageView card){
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
            Image image = new Image(new FileInputStream(s));
            p116.setImage(image);

        }
        if(cardsP1.size()>=15)
        {
            p115.setVisible(true);
            String symbol=cardsP1.get(14).getSymbol();
            String number=cardsP1.get(14).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p115.setImage(image);
        }
        if(cardsP1.size()>=14)
        {
            p114.setVisible(true);
            String symbol=cardsP1.get(13).getSymbol();
            String number=cardsP1.get(13).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p114.setImage(image);
        }
        if(cardsP1.size()>=13)
        {
            p113.setVisible(true);
            String symbol=cardsP1.get(12).getSymbol();
            String number=cardsP1.get(12).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p113.setImage(image);
        }
        if(cardsP1.size()>=12)
        {
            p112.setVisible(true);
            String symbol=cardsP1.get(11).getSymbol();
            String number=cardsP1.get(11).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p112.setImage(image);
        }
        if(cardsP1.size()>=11)
        {
            p111.setVisible(true);
            String symbol=cardsP1.get(10).getSymbol();
            String number=cardsP1.get(10).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p111.setImage(image);
        }
        if(cardsP1.size()>=10)
        {
            p110.setVisible(true);
            String symbol=cardsP1.get(9).getSymbol();
            String number=cardsP1.get(9).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p110.setImage(image);
        }
        if(cardsP1.size()>=9)
        {
            p19.setVisible(true);
            String symbol=cardsP1.get(8).getSymbol();
            String number=cardsP1.get(8).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p19.setImage(image);
        }
        if(cardsP1.size()>=8)
        {
            p18.setVisible(true);
            String symbol=cardsP1.get(7).getSymbol();
            String number=cardsP1.get(7).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p18.setImage(image);
        }
        if(cardsP1.size()>=7)
        {
            p17.setVisible(true);
            String symbol=cardsP1.get(6).getSymbol();
            String number=cardsP1.get(6).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p17.setImage(image);
        }
        if(cardsP1.size()>=6)
        {
            p16.setVisible(true);
            String symbol=cardsP1.get(5).getSymbol();
            String number=cardsP1.get(5).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p16.setImage(image);
        }
        if(cardsP1.size()>=5)
        {
            p15.setVisible(true);
            String symbol=cardsP1.get(4).getSymbol();
            String number=cardsP1.get(4).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p15.setImage(image);
        }
        if(cardsP1.size()>=4)
        {
            p14.setVisible(true);
            String symbol=cardsP1.get(3).getSymbol();
            String number=cardsP1.get(3).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p14.setImage(image);
        }
        if(cardsP1.size()>=3)
        {
            p13.setVisible(true);
            String symbol=cardsP1.get(2).getSymbol();
            String number=cardsP1.get(2).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p13.setImage(image);
        }
        if(cardsP1.size()>=2)
        {
            p12.setVisible(true);
            String symbol=cardsP1.get(1).getSymbol();
            String number=cardsP1.get(1).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p12.setImage(image);
        }
        if(cardsP1.size()>=1)
        {
            p11.setVisible(true);
            String symbol=cardsP1.get(0).getSymbol();
            String number=cardsP1.get(0).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p11.setImage(image);
        }

        //-------------------------------------------------------------------------------------------------
        if(cardsP2.size()>=16)
        {
            p216.setVisible(true);
            String symbol=cardsP2.get(15).getSymbol();
            String number=cardsP2.get(15).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p216.setImage(image);
        }
        if(cardsP2.size()>=15)
        {
            p215.setVisible(true);
            String symbol=cardsP2.get(14).getSymbol();
            String number=cardsP2.get(14).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p215.setImage(image);
        }
        if(cardsP2.size()>=14)
        {
            p214.setVisible(true);
            String symbol=cardsP2.get(13).getSymbol();
            String number=cardsP2.get(13).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p214.setImage(image);
        }
        if(cardsP2.size()>=13)
        {
            p213.setVisible(true);
            String symbol=cardsP2.get(12).getSymbol();
            String number=cardsP2.get(12).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p213.setImage(image);
        }
        if(cardsP2.size()>=12)
        {
            p212.setVisible(true);
            String symbol=cardsP2.get(11).getSymbol();
            String number=cardsP2.get(11).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p212.setImage(image);
        }
        if(cardsP2.size()>=11)
        {
            p211.setVisible(true);
            String symbol=cardsP2.get(10).getSymbol();
            String number=cardsP2.get(10).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p211.setImage(image);
        }
        if(cardsP2.size()>=10)
        {
            p210.setVisible(true);
            String symbol=cardsP2.get(9).getSymbol();
            String number=cardsP2.get(9).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p210.setImage(image);
        }
        if(cardsP2.size()>=9)
        {
            p29.setVisible(true);
            String symbol=cardsP2.get(8).getSymbol();
            String number=cardsP2.get(8).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p29.setImage(image);
        }
        if(cardsP1.size()>=8)
        {
            p28.setVisible(true);
            String symbol=cardsP2.get(7).getSymbol();
            String number=cardsP2.get(7).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p28.setImage(image);
        }
        if(cardsP1.size()>=7)
        {
            p27.setVisible(true);
            String symbol=cardsP2.get(6).getSymbol();
            String number=cardsP2.get(6).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p27.setImage(image);
        }
        if(cardsP1.size()>=6)
        {
            p26.setVisible(true);
            String symbol=cardsP2.get(5).getSymbol();
            String number=cardsP2.get(5).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p26.setImage(image);
        }
        if(cardsP2.size()>=5)
        {
            p25.setVisible(true);
            String symbol=cardsP2.get(4).getSymbol();
            String number=cardsP2.get(4).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p25.setImage(image);
        }
        if(cardsP2.size()>=4)
        {
            p24.setVisible(true);
            String symbol=cardsP2.get(3).getSymbol();
            String number=cardsP2.get(3).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p24.setImage(image);
        }
        if(cardsP2.size()>=3)
        {
            p23.setVisible(true);
            String symbol=cardsP2.get(2).getSymbol();
            String number=cardsP2.get(2).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p23.setImage(image);
        }
        if(cardsP2.size()>=2)
        {
            p22.setVisible(true);
            String symbol=cardsP2.get(1).getSymbol();
            String number=cardsP2.get(1).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p22.setImage(image);
        }
        if(cardsP2.size()>=1)
        {
            p21.setVisible(true);
            String symbol=cardsP2.get(0).getSymbol();
            String number=cardsP2.get(0).getNumber();
            String s=new String("karty/"+number+symbol+".png");
            System.out.println(s);
            Image image = new Image(new FileInputStream(s));
            p21.setImage(image);
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