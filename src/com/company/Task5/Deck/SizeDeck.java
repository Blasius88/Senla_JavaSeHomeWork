package com.company.Task5.Deck;

import com.company.Task5.Ship;

public class SizeDeck implements Deck{


    @Override
    public boolean sizeDeck(int i) {
        if (i < 5 )
            return true;
        else
            return false;
    }

    @Override
    public boolean fullDecks(double sizeDeck, Ship ship) {

        return false;
    }
}
