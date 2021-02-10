package com.company.Task5;

import com.company.Task5.Deck.SizeDeck;
import com.company.Task5.Сontainer.SquareContainer;

public class Ship {

    private int sizeDeck;

    public int getSizeDeck() {
        int i = 1 +  (int)Math.random() *10;
        SizeDeck deck = new SizeDeck();
        if (deck.sizeDeck(i))
            return sizeDeck = 1;
        else
            return sizeDeck = 2;
    }

    public void setSizeDeck(int sizeDeck) {
        this.sizeDeck = sizeDeck;
    }

    private double carg;

    public double getCarg() {
        //1 палуба
        if (getSizeDeck() < 2 ) {
            for (int i = 0; i < 2; i++) {
                //определяем размер контейнера груза
                int a = 1 + (int) Math.random() * 10;
                //большой контейнер
                if (a <= 3) {
                    //определяем тип контейнера
                    int ran = 1 + (int) Math.random()*9;
                    //квадратный контейнер
                    if (ran <= 3){
                        SquareContainer squareContainer = new SquareContainer();
                        squareContainer.sizeContainer();
                        squareContainer.diagonal();
                        System.out.println("Enter height");
                        squareContainer.setHeight(Main.Sc());

                    }
                } else if (a > 3 && i <= 6) {
//2 палубы
                } else {

                }
            }
        }
        return carg;
    }

    public void setCarg(double carg) {
        this.carg = carg;
    }
}
