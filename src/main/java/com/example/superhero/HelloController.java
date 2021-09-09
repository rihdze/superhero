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
    private TextField txtFieldDay;

    @FXML
    private Button btngeneratesuperpower;


    private String superHeroName;
    private String superHeroPowerLevel;
    private String superHeroSuperPower;





    public void getName(){
        String name;
        String month = txtFieldmonth.getText();
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
        this.superHeroName = name;
        txtArea.setText("Your superhero name is: " + name + " " + getPowerLevel());

    }

    public void test(){

        if(superHeroName != null){
            String lol = superHeroName + " IS WEAK AF dxdxdxd";
            txtArea.setText(lol);
        } else {
            txtArea.setText("Generate superhero name first!");
        }





    }

    public static String getPowerLevel(){
        Random r = new Random();
        int roll,i;
        String level;
        roll = r.nextInt(9+1);


        if(roll<5){
            level = "You are weak ";

        }
        else{
            level = "You are strong ";
        }
        return level;

    }


    public void getSuperpower() {

        switch (new Random().nextInt(13)) {
            case 1:
                this.superHeroSuperPower = "gravity manipulation";
            case 2:
                this.superHeroSuperPower =  "nature controlling";
            case 3:
                this.superHeroSuperPower =  "breathing under water";
            case 4:
                this.superHeroSuperPower =  "acid cloud summoning";
            case 5:
                this.superHeroSuperPower =  "respawning";
            case 6:
                this.superHeroSuperPower =  "flexibility";
            case 7:
                this.superHeroSuperPower =  "teleportation";
            case 8:
                this.superHeroSuperPower =  "water manipulation";
            case 9:
                this.superHeroSuperPower =  "fire breathing";
            case 10:
                this.superHeroSuperPower =  "invisibility";
            case 11:
                this.superHeroSuperPower =  "flying";
            default:
                this.superHeroSuperPower =  "walking";
        }

          txtArea.setText("Your superhero super power is :" + this.superHeroSuperPower);
    }







}
