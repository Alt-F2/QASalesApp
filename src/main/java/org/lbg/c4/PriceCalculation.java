package org.lbg.c4;

import java.text.DecimalFormat;
import java.util.Vector;

public class PriceCalculation {
    private final double itemPrice;

    private final double itemVAT;

    static Vector<Double> itemPriceVec = new Vector<Double>(10);

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void calculatePrice( double item, double vat ){
        double itemPrice = item + (item*vat);
        itemPriceVec.add(itemPrice);
    }

    boolean asked = false;
    String answer;

    public PriceCalculation ( double itemPrice, double itemVAT ) {
        this.itemPrice = itemPrice;
        this.itemVAT = itemVAT;
    }

    public double getItemPrice(){
        return itemPrice;
    }

    public double getItemVAT(){
        return itemVAT;
    }
}
