package org.lbg.c4;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.math.*;
import java.text.*;
import java.util.Vector;

/**
 * Hello world!
 */
public class App {



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String item;
        boolean asked = false;
        String answer;
        double itemPrice = 0, itemPriceTotal = 0, itemVAT;
        Vector<Integer> itemVec = new Vector<Integer>(10);

        System.out.println("Hello, welcome to my sales application.");

        while(true) {
            try {
                    if(!asked) {
                        item = input.nextLine();
                        itemPrice += Double.parseDouble(item);

                        System.out.println("Please type the VAT type of your item: ");
                        item = input.nextLine();
                        itemVAT = Double.parseDouble(item);

                        itemPriceTotal += calculatePrice(itemPrice, itemVAT);

                        asked = true;
                    }
                    System.out.println("Would you like to continue? if no type 'QUIT' if yes" +
                            " press the ENTER key.");

                    answer = input.nextLine();
                    System.out.println(answer);

                    if(answer.contains("Q")) {
                        break;
                    }

                    if (answer.contains("B")){
                            asked = false;

                    }
            } catch (Exception e) {
                System.out.println("Incorrect Value entered, please try again.");
            }
        }
    }
}
