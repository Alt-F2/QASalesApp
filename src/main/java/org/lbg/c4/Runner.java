package org.lbg.c4;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner
{
    private final ArrayList<IElementReader> itsReaders;

    public  Runner( ArrayList<IElementReader> readers )
    {
        itsReaders = readers;
    }

    public ArrayList<Double> run()
    {
        String lineRead = "";
        boolean exitApp = false;
        double itemPrice = 0, itemPriceVAT = 0;
        ArrayList<Double> itemPriceVec = new ArrayList<>(10);


        while(!exitApp)
        {
            for(var reader : itsReaders) {
                lineRead = reader.readFromKeyboard(new Scanner(System.in));
                if (lineRead.equalsIgnoreCase("QUIT"))
                {
                    exitApp = true;
                    break;
                }
                PriceCalculation le = new PriceCalculation(itemPrice, itemPriceVAT);
                itemPriceVec.add(le.getItemPrice() * le.getItemVAT());
            }
        }

        return itemPriceVec;
    }
}