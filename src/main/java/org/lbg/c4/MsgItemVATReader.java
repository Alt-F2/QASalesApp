package org.lbg.c4;

import java.util.Scanner;

public class MsgItemVATReader extends MsgReader{
    public MsgItemVATReader( ICustomPrompt prompt ) {
        super( prompt );
    }

    @Override
    public String readFromKeyboard( Scanner theScanner ) {
        itsPrompt.prompt("Type in the VAT of your item: ");

        return String.valueOf(theScanner.nextDouble());
    }
}
