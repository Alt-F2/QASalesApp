package org.lbg.c4;

import java.util.Scanner;

public class MsgItemPriceReader extends MsgReader{
    public MsgItemPriceReader( ICustomPrompt prompt ) {
        super( prompt );
    }

    @Override
    public String readFromKeyboard ( Scanner theScanner ){
        itsPrompt.prompt("Type in the price of your item: ");

        return String.valueOf(theScanner.nextDouble());
    }
}
