package com.company.Task6;


import com.company.Task6.Robot.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        for (int i = 0; i < 9; i ++){
            System.out.println(robot.name(i) + " head: " + robot.head(randomGen()) + " body: " + robot.body(randomGen()));
        }

    }

    private static int randomGen (){
        return 1+ (int) Math.random()*3;
    }
}
