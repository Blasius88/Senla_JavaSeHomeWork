package com.company.Task3;

import com.company.Task2.Scan.Scan;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Cat> cats = new ArrayList<>();

    public static void main(String[] args) {
        run();
    }

    private static void run (){
        System.out.println("1 - task 1\n2 - task 2\n3 - task 3\n4 - task 4\nEnter task number ");
        int  a  = Integer.parseInt(Scan.Sc());
        switch (a){
            case 1:
                task1 ();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
                task4();
                break;
            default:
                run();
                break;
        }
    }

    private static void task1(){
        int i = 0;
        while ( i != 10){
            Cat cat = new Cat();
            System.out.println(cat.name + " "  + cat.old);
            i++;
        }
    }

    private static void task2(){
        Cat cat = new Cat();

        for(int i = 0; i < 10; i ++ ){
            System.out.println("Enter name cat");
            cat.name  = Scan.Sc();
            System.out.println("Enter old cat ");
            cat.old = Integer.parseInt(Scan.Sc());
            cats.add(new Cat(cat.name, cat.old));
        }

        for(int i = 0; i < cats.size(); i ++ ){
            System.out.println("Name cat = " + cats.get(i).name + "\nCat age = " + cats.get(i).old);
        }
    }

    private static void task3 () {
        List <Cat> cat = new ArrayList<>();
        int i = 0;
        int old = 0;
        String name = "" ;
        do {
            System.out.println("Enter name cat");
            name  = Scan.Sc();
            System.out.println("Enter old cat ");
            old = Integer.parseInt(Scan.Sc());
            cat.add(new Cat(name, old));
            i++;
        } while (i != 10);
    }

    private static void task4 (){
        List <Cat> cat = new ArrayList<>();
        int old = 0;
        String name = "" ;
        for (int i = 0; i < 5; i ++) {
            System.out.println("Enter name cat");
            name = Scan.Sc();
            System.out.println("Enter old cat ");
            old = Integer.parseInt(Scan.Sc());
            cat.add(new Cat(name, old));
        }
        for (Cat cat1: cat) {
            System.out.println(cat1.name + " " + cat1.old);
        }
    }
}