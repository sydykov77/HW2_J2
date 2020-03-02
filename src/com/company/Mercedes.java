package com.company;

public class Mercedes extends Car implements Printable{
    private boolean cruisControl;

    public Mercedes(int speed,double volume,boolean cruisControl ) {
        super(speed,volume);
        this.cruisControl=cruisControl;

    }

    public boolean isCruisControl() {
        return cruisControl;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Круиз контроль:"+ cruisControl);

    }
}
