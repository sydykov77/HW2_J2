package com.company;

public class Car implements Printable {
    private int speed;
    private double volume;
    

    public Car(int speed,double volume) {
        this.speed = speed;
        this.volume= volume;
    }

    public int getSpeed() {
        return speed;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void print() {
        System.out.println("||Скорость:"+speed+"||"+
                "Объем:"+volume+"||");

    }
}
