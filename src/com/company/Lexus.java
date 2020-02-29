package com.company;

public class Lexus extends Car implements Printable{
    private boolean comfortable;

    public Lexus(int speed, double volume,boolean comfortable) {
        super(speed,volume);
        this.comfortable = comfortable;
    }

    public boolean getComfortable() {
        return comfortable;
    }

    @Override
    public void print() {

    }
}
