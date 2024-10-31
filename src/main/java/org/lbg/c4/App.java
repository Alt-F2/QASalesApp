package org.lbg.c4;

import java.io.IOException;
import java.util.ArrayList;
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
            ICustomPrompt thePrompt = new CustomPrompt();
            MsgItemPriceReader mipr = new MsgItemPriceReader( thePrompt );
            MsgItemVATReader mivr = new MsgItemVATReader( thePrompt );
            ArrayList<IElementReader> readers = new ArrayList<>(2);
            readers.add( mipr );
            readers.add( mivr );

            Runner rnr = new Runner( readers );

            rnr.run();

        }
    }

