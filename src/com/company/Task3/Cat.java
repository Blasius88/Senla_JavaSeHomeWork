package com.company.Task3;

import java.util.Objects;

public class Cat {
    public String name = "Cat1";
    public int old = 0;

    public Cat(String name, int old) {
        this.name = name;
        this.old = old;
    }
    public Cat(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", old=" + old +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return old == cat.old && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, old);
    }
}
