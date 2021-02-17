package com.company.Task6.Robot;

import com.company.Task6.Body.Body;
import com.company.Task6.Head.Head;

import java.util.ArrayList;
import java.util.List;

public class Robot implements IRobot {

    @Override
    public String name(int i) {
        return "Robot " + i ;
    }

    @Override
    public String head(int randomGen) {
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

    @Override
    public String body(int randomGen) {
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
}
