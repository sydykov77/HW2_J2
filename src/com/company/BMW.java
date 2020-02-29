package com.company;

public class BMW extends Car implements Printable{
    int maxspeed;

    public BMW(int speed,double volume,int maxspeed) {
        super(speed,volume);
        this.maxspeed=maxspeed;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    @Override
    public void print() {
        System.out.println("Максимальная Скорость:"+maxspeed);

    }
}
