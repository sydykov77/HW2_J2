package com.company;

public class Main {

    public static void main(String[] args) {
        CreteObject("BMW").print();
        CreteObject("Mercedes").print();
        CreteObject("Lexus").print();

    }

    public static Printable CreteObject(String className) {
        Printable print = null;
        switch (className) {
            case "BMW":
                print = new BMW(80, 5.5, 330);
                break;
            case "Mercedes":
                print = new Mercedes(100, 6.3, true);
                break;
            case "Lexus":
                print = new Lexus(70, 5.7, true);
                break;
        }
        return print;
    }

}


