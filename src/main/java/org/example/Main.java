package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Enter pizza type Normal or Deluxe: ");
        Scanner scanner = new Scanner(System.in);
        String pizzaType = scanner.next();
        Pizza pizza;
        if(pizzaType.equalsIgnoreCase("normal")){
            pizza = new NormalPizza(true,true);
        }
        else {
            pizza = new DeluxePizza(false, true);
        }

        double bill = pizza.getPrice();

        System.out.println("Bill: "+bill);
    }
}