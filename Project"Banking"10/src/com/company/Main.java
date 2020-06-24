package com.company;

public class Main {

    public static void main(String[] args) {




    }

    public static String choiceCurrency(String currency){
        String rez= "error";
        switch(currency){
            case "EURO":
                double euro = double usd *1.08;
                rez="USD"+euro;
                break;
            case "RUR":
                double rub = double usd *0.014;
                rez="USD"+rub;
                break;
            case "USD":
                double usd = usd *1;
                rez="USD"+usd;
                break;
            case "GPB": //milk coffee
                double gpb = usd *1.24;
                rez="USD"+usd;
                break;
        }

        return rez;
    }

    public static double coffeeMaker(String calcCurrency){
        if

        return true;
    }

    public static void print(String coffeeString){
        if(coffeeString!="error"){
            System.out.println("Ваш кофе " +coffeeString + " готов");
        }else{
            System.out.println("Что-то не так!");
        }
    }
}
