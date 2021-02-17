package com.company.Task6;


import com.company.Task6.Body.Body;
import com.company.Task6.Head.Head;
import com.company.Task6.Robot.Robot;

import java.util.ArrayList;
import java.util.List;



public class Main {
    private static List<Robot> robotObjekt = new ArrayList<Robot>();

    public static void main(String[] args) {
        for (int i = 0; i < 9; i ++){
            robotObjekt.add(new Robot(name(i), body(randomGen()), head(randomGen())));
        }
        for (int i = 0; i < robotObjekt.size(); i ++ ) {
            System.out.println(robotObjekt.get(i).toString());
        }



    }

    private static int randomGen (){
        return ((int) (Math.random()*3));
    }

    public static String name(int i) {
        return "Robot " + i ;
    }

    public static String body(int randomGen) {
        List<String> body = new ArrayList<>();
        for (Body x: Body.values()) {
            body.add(x.toString());
        }
        String bodyName ="";
        for (int i = 0; i < body.size(); i ++){
            if (i == randomGen){
                bodyName = body.get(i).toString();
            }
        }
        return bodyName;
    }

    public static String head(int randomGen) {
        List<String> head = new ArrayList<>();
        for (Head x: Head.values()) {
            head.add(x.toString());
        }
        String headName ="";
        for (int i = 0; i < head.size(); i ++){
            if (i == randomGen){
                headName = head.get(i).toString();
            }
        }
        return headName;
    }

}
