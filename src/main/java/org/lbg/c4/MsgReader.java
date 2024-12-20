package org.lbg.c4;

import java.util.Scanner;

public abstract class MsgReader implements IElementReader {
    protected ICustomPrompt itsPrompt;

    public MsgReader( ICustomPrompt cp ) {
        itsPrompt = cp;
    }

    public abstract String readFromKeyboard ( Scanner theScanner );

}
