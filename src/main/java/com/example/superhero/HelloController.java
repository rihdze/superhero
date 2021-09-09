package com.example.superhero;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController {

    @FXML
    private Button btnGeneratename;

    @FXML
    private TextField txtFieldmonth;

    @FXML
    private TextArea txtArea;

    @FXML
    private Button btngenerate;

    @FXML
    private TextField txtenemymonth;

    @FXML
    private Button btngeneratesuperpower;

    @FXML
    private Button btnCreateEenemy;

    @FXML
    private Button btnprint;



    private String superHeroName;
    private String superHeroPowerLevel;
    private String superHeroSuperPower;
    SuperHero yourHero = new SuperHero();
    SuperHero enemyHero = new SuperHero();


    @FXML
    void onHelloButtonClick(ActionEvent event) {

        if (event.getSource() == btnGeneratename) {
            yourHero.setName(getName(txtFieldmonth.getText()));
            txtArea.setText("Your superhero name will be: " + yourHero.getName());
        } else if (event.getSource() == btngeneratesuperpower) {
            yourHero.setSuperPower(getSuperpower());
            txtArea.setText("Your superpower is: " + yourHero.getSuperPower());
        } else if (event.getSource() == btngenerate) {
            yourHero.setPowerLevel(getPowerLevel());
            if(yourHero.getPowerLevel() == 0){
                txtArea.setText("Your superhero is as weak as they get ;(");
            } else {
                txtArea.setText("Your superhero is STRONG!!!!");
            }

        } else if(event.getSource() == btnCreateEenemy){
            System.out.println("works");

            enemyHero.setName(getName(txtenemymonth.getText()));
            enemyHero.setSuperPower(getSuperpower());
            enemyHero.setPowerLevel(getPowerLevel());
        } else if (event.getSource()== btnprint){
            txtArea.setText("YOUR HERO: " + yourHero.toString() + "   ENEMY HERO: " + enemyHero.toString());
        }
    }






    public String getName(String month){
        String name;

        switch (month) {
            case "1":
                name = "Hulk";

                break;
            case "2":
                name = "Superman";
                break;
            case "3":
                name = "Thor";
                break;
            case "4":
                name = "Spiderman";
                break;
            case "5":
                name = "Flash";
                break;
            case "6":
                name = "Deadpool";
                break;
            case "7":
                name = "Wolverine";
                break;
            case "8":
                name = "Bearslayer";
                break;
            case "9":
                name = "Dr. Chaos";
                break;
            case "10":
                name = "Monkey man";
                break;
            case "11":
                name = "Loki";
                break;
            case "12":
                name = "Arrow";
                break;

            default:
                name = "Dummy";
                break;
        }

        return name;

    }

//    public void test(){
//
//        if(superHeroName != null){
//            String lol = superHeroName + " IS WEAK AF dxdxdxd";
//            txtArea.setText(lol);
//        } else {
//            txtArea.setText("Generate superhero name first!");
//        }
//
//
//
//
//
//    }

    public int getPowerLevel(){
        Random r = new Random();
        int roll,i;
        int level;
        roll = r.nextInt(9+1);


        if(roll<5){

            level = 0;

        }
        else{

            level =  1;
        }

        return level;

    }


    public String getSuperpower() {
        String superPower;

        switch (new Random().nextInt(13)) {
            case 1:
                superPower = "gravity manipulation";
                break;
            case 2:
                superPower =  "nature controlling";
                break;
            case 3:
                superPower =  "breathing under water";
                break;
            case 4:
                superPower =  "acid cloud summoning";
                break;
            case 5:
                superPower =  "respawning";
                break;
            case 6:
                superPower =  "flexibility";
                break;
            case 7:
                superPower =  "teleportation";
                break;
            case 8:
                superPower =  "water manipulation";
                break;
            case 9:
                superPower =  "fire breathing";
                break;
            case 10:
                superPower =  "invisibility";
                break;
            case 11:
                superPower =  "flying";
                break;
            default:
                superPower =  "walking";
                break;
        }

          return superPower;
    }







}
