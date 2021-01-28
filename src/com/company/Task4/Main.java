package com.company.Task4;


import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        task4_1();
    }

    static void task4_1(){
        String [][] mas  = mas();
        printMas(mas);
        if (diagonalСomparison(mas))
            System.out.println("arrays are equal");
        else System.out.println("arrays are unequal");
        System.out.println("display diagonals on the screen");
        String [][] arr = formingAnArrayOfDiagonals(mas);
        printMas(arr);
        System.out.println("check the number or string in the array");
        checkNumber(arr);
        System.out.println("source array");
        printMas(mas);


    }

    static String [][] mas (){
        String [][] mas = new String [10][10];
        for (int i = 0; i < mas.length; i++ ){
            for (int j = 0; j < mas.length; j++){
                if (randomGen())
                    mas[i][j] = generateRandomWord(6);
                else
                    mas[i][j] = generateRandomDouble();
            }
        }
        return mas;
    }

    static void printMas (String [][] mas){
        for (int i = 0; i < mas.length; i++ ){
            for (int j = 0; j < mas[i].length; j++){
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean diagonalСomparison (String [][] mas){
        boolean result = false;
        for (int i =0; i < mas.length; i ++ ){
            for (int j = 0; j < mas.length; j ++ ){
                if (i == j ){
                    for (int a = 0 ; a < mas.length; a ++){
                        for (int b = 0; b < mas[a].length; b ++) {
                            if (a + b == mas.length-1) {
                                if   (mas[i][j].equals(mas[a][b]) ) result = true;
                                else {
                                    result = false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    static String generateRandomWord(int wordLength) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder(wordLength);
        for(int i = 0; i < wordLength; i++) {
            char tmp = (char) ('a' + r.nextInt('z' - 'a' ));
            sb.append(tmp);
        }
        return sb.toString();
    }

    static String generateRandomDouble() {
        double dob = (Math.random()*10);
        //DecimalFormat df = new DecimalFormat("#.####");
        String str = String.format("%.5g ", dob);
        return str;
    }

    static boolean randomGen (){
        boolean res = false;
        int rez = 1 + (int) (Math.random()*10);
        if (rez < 5)
            res = true;
        return res;
    }

    static String [][] formingAnArrayOfDiagonals (String[][] arr){
        int aj =0;
        String[][] mas = new String[2][10];
        for (int i =0; i < arr.length; i ++ ) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    mas[0][aj] = arr[i][j];
                    aj ++;
                }
            }
        }
        aj = 0;
        for (int a = 0 ; a < arr.length; a ++){
            for (int b = 0; b < arr[a].length; b ++) {
                if (a + b == arr.length-1) {
                    mas[1][aj] = arr[a][b];
                    aj ++;
                }
            }
        }
        return mas;
    }

    static boolean checkNum(String s) {
            String str = String.valueOf(s);
            return str.matches("-?\\d+(\\.\\d+)?");
        }

    static void checkNumber (String [][] arr){
        ArrayList<Integer> mas = new ArrayList<>();
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length; j ++) {
                if (checkNum(arr[i][j])) {
                    System.out.println("Element[" + i + "][" + j + "] - number ");
                    System.out.println("Element[" + i + "][" + j + "] = " + arr[i][j] + "\nround it up : " + Math.round(Double.parseDouble(arr[i][j])));
                    double temp =  Math.round(Double.parseDouble(arr[i][j]));
                    mas.add(Integer.parseInt(String.valueOf(temp)));
                } else {
                    System.out.println("Element[" + i + "][" + j + "] - string : " + arr[i][j]);
                    StringBuffer buffer = new StringBuffer(arr[i][j]);
                    char [] chars = new char[3];
                    buffer.getChars(1,4, chars, 0);
                    printChar(chars);
                }
            }
        }
        printArrayList(mas);
    }

    static void printChar (char[] chars){
        for (var a: chars){
            System.out.println("We display 2 - 4 elements of the word: " + a);

        }
    }

    static void printArrayList (ArrayList<Integer> arr) {
        for (int a: arr) {
            System.out.print(a + " ");
        }
        for (int a: arr) {
            System.out.print(a + "_");
        }
    }
}
