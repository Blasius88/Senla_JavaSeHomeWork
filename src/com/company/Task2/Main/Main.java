package com.company.Task2.Main;

import com.company.Task2.Rainbox.Rainbow;
import com.company.Task2.Scan.Scan;

import java.util.*;

public class Main {

    private static List<Rainbow> rainbows = new ArrayList<>();

    public static void main(String[] args) {
        Start();
    }

    static void Start (){
        int a = 0;
        int colSizeRainbows= 0;
        for (int i = 0; i <= rainbows.size(); i ++ ){
            colSizeRainbows++;
        }
        while (a != -1) {
            System.out.println("Make a choice:\n1 - add color;\n2 - bring out all colors\n3 - " +
                    "display color by number\n4 - exit");
            int num =Integer.parseInt(Scan.Sc());
            switch (num){
                case 1:
                    System.out.println("enter color ");
                    rainbows.add( new Rainbow(colSizeRainbows++, Scan.Sc()));
                    break;
                case 2:
                    if (colSizeRainbows != 0) {
                        for (int i = 0; i < rainbows.size(); i++){
                            System.out.println(rainbows.get(i).getId() + " - " + rainbows.get(i).getColor());
                        }
                    }
                    else System.out.println("no colors in the rainbow");
                    break;
                case 3:
                    System.out.println("enter id color");
                    double idCоlor = Double.parseDouble(Scan.Sc());
                    boolean bool = false;
                    if (colSizeRainbows != 0) {
                        for (int i = 0; i < rainbows.size(); i++) {
                            if (rainbows.get(i).getId() == idCоlor) {
                                System.out.println("id = " + rainbows.get(i).getId() + " - " + rainbows.get(i).getColor());
                                bool = true;
                            }
                            else if ((int) idCоlor != idCоlor) {
                                int IntIdColor = (int) idCоlor;
                                try {
                                    if (rainbows.get(i).getId() == IntIdColor) {
                                        System.out.println(rainbows.get(i).getColor() + " - " + rainbows.get(i + 1).getColor());
                                        bool = true;
                                    }
                                }
                                catch (IndexOutOfBoundsException e) {
                                    if (rainbows.get(i).getId() == IntIdColor) {
                                        System.out.println(rainbows.get(i).getColor());
                                        bool = true;
                                    }
                                }
                            }
                        }
                        if (!bool) System.out.println("his color is not on the list");
                    }
                    break;
                case 4:
                    a = -1;
                    break;
                default:
                    Start();
                    break;
            }

        }
    }
}
