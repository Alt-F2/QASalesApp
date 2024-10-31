package org.lbg.c4;

import java.text.DecimalFormat;

public class PriceCalculation {
    private final double itemPrice;
    private final double itemVAT;
    private final DecimalFormat df;

    public PriceCalculation (double itemPrice, double itemVAT ) {
        this.itemPrice = itemPrice;
        this.itemVAT = itemVAT;
        df = new DecimalFormat("0.00");
    }

    public double calculateTotal() {
        double total = ((itemVAT));
        return total;
    }

    public double getItemPrice(){
        return itemPrice;
    }

    public double getItemVAT(){
        return itemVAT;
    }
}
