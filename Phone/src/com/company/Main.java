package com.company;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone(12345, "Nokia 3310", 120.5);
        smartPhone smartPhone = new smartPhone(22222, "X", 200, 69.999, "IPhone", "USA");
        BabuskaPhone babushkaPhone = new BabuskaPhone(88005, "Easy", 100, 56.5, "8-800-555-35-35", "Sasha");

        phone.getNumber();
        phone.recieveCall(babushkaPhone.nameOfGrandson);

        babushkaPhone.checkBalance();

        smartPhone.knowLocation();
        smartPhone.getNumber();
    }
}


class Phone {
    int serialNumber;
    String model;
    double weight;

    Phone(int number, String model, double weight){
        this.serialNumber = number;
        this.model = model;
        this.weight = weight;
    }

    void recieveCall(String name){
        System.out.println("Call from - " + name);
    }

    void getNumber(){
        System.out.println("Phone serial number - " + this.serialNumber);
    }
}


class BabuskaPhone extends Phone {
    double balance;
    String number;
    String nameOfGrandson;

    BabuskaPhone(int number, String model, double weight, double balance, String phoneNumber, String nameOfGrandson){
        super(number, model, weight);
        this.balance = balance;
        this.number = phoneNumber;
        this.nameOfGrandson = nameOfGrandson;
    }

    @Override
    void recieveCall(String name){
        System.out.println("Call from - " + name);
    }

    void checkBalance(){
        System.out.println("Balance - " + this.balance);
        if(balance < 0){
            System.out.println("Your balance is lower than 0. You need to pay for your phone.");
        }
    }
}


class smartPhone extends Phone {
    double price;
    String brand;
    String location;

    smartPhone(int number, String model, double weight, double price, String brand, String location){
        super(number, model, weight);
        this.price = price;
        this.brand = brand;
        this.location = location;
    }

    void knowLocation(){
        System.out.println("Phone location is - " + this.location);
    }
}