package com.company.Task6.Robot;

import com.company.Task6.Body.Body;
import com.company.Task6.Head.Head;

import java.util.ArrayList;
import java.util.List;

public class Robot implements IRobot {
    private String name;
    private String body;
    private String head;

    public Robot(){}

    public Robot(String name, String body, String head) {
        this.name = name;
        this.body = body;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", body='" + body + '\'' +
                ", head='" + head + '\'' +
                '}';
    }
}
