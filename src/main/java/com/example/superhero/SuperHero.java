package com.example.superhero;

public class SuperHero {

    String name;
    String superPower;
    int powerLevel;

    public SuperHero(String name, String superPower, int powerLevel) {
        this.name = name;
        this.superPower = superPower;
        this.powerLevel = powerLevel;
    }

    public SuperHero(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public SuperHero(String name) {
        this.name = name;
    }

    public SuperHero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name= '" + name + '\'' +
                ", superPower= '" + superPower + '\'' +
                ", powerLevel= '" + powerLevel +
                '}';
    }
}
