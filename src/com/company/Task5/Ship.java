package com.company.Task5;

import com.company.Task5.Deck.SizeDeck;
import com.company.Task5.Сontainer.ConeContainer;
import com.company.Task5.Сontainer.CylindricalContainer;
import com.company.Task5.Сontainer.SquareContainer;

public class Ship {

    private double largeOrSmallLoad = 0;
    private int sizeDeck;

    public int getSizeDeck() {
        SizeDeck deck = new SizeDeck();
        if (deck.sizeDeck(getRandomNumber()))
            return sizeDeck = 1;
        else
            return sizeDeck = 2;
    }

    public void setSizeDeck(int sizeDeck) {
        this.sizeDeck = sizeDeck;
    }

    private double carg;

    public double getCarg() {
        //определяем размер контейнера груза
        int a = getRandomNumber ();
        //1 палуба
        if (getSizeDeck() < 2 ) {
            for (int i = 0; i < 2; i++) {
                if (getRandomNumber() < 5 ){
                    //большой контейнер
                    if (a <= 5) {
                        determineCargo(a, i);
                        largeOrSmallLoad++;
                    }
                    // маленкий контейнер
                    else {
                        for (int j = 0 ; j < 2; j ++ ){}
                        determineCargo(a, i);
                        largeOrSmallLoad += 0.5;
                    }
                }
            }
        }
        //2 палубы
        else {
            for (int i = 0; i < 2; i++) {
                if (getSizeDeck() < 2) {
                    for (int s = 0; s < 2; s++) {
                        if (getRandomNumber() < 5) {
                            //большой контейнер
                            if (a <= 5) {
                                determineCargo(a, i);
                                largeOrSmallLoad++;
                            }
                            // маленкий контейнер
                            else {
                                for (int j = 0; j < 2; j++) {
                                    determineCargo(a, i );
                                }
                                largeOrSmallLoad += 0.5;
                            }
                        }
                    }
                }
            }
        }

        return carg;
    }

    public void setCarg(double carg) {
        this.carg = carg;
    }


    private int getRandomNumber (){
        return 1 + (int) Math.random() * 10;
    }

    //определяет груз
    private void determineCargo (int a, int i ){
        try{
            //определяем тип контейнера
            int ran = getRandomNumber();
            //квадратный контейнер
            if (ran <= 3) {
                SquareContainer squareContainer = new SquareContainer();
                squareContainer.sizeContainer();
                squareContainer.diagonal();
                System.out.println("Enter height");
                squareContainer.setHeight(Main.Sc());
                carg = squareContainer.getMassOfWater();
            }
            // целендричиский контейнер
            else if (a > 3 && i <= 6) {
                CylindricalContainer cylindricalContainer = new CylindricalContainer();
                cylindricalContainer.sizeContainer();
                cylindricalContainer.diagonal();
                System.out.println("Enter height");
                cylindricalContainer.setHeight(Main.Sc());
                carg = cylindricalContainer.getMassOfWater();

            }
            //конусный контейенер
            else {
                ConeContainer coneContainer = new ConeContainer();
                coneContainer.sizeContainer();
                coneContainer.diagonal();
                System.out.println("Enter height");
                coneContainer.setHeight(Main.Sc());
                carg = coneContainer.getMassOfWater();

            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
