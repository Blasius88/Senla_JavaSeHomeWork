package com.company.Task5.Сontainer;

import com.company.Task5.Сontainer.Container;

public class SquareContainer  implements Container {

    private int densityOfWater;
    private int height;
    private double sizeCone  = diagonal() * diagonal() * height;
    private double massOfWater = sizeCone * densityOfWater;

    public int getDensityOfWater() {
        return densityOfWater;
    }

    public void setDensityOfWater(int densityOfWater) {
        this.densityOfWater = densityOfWater;
    }

    public double getMassOfWater() {
        return massOfWater;
    }

    public void setMassOfWater(double massOfWater) {
        this.massOfWater = massOfWater;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double getSizeCone() {
        return sizeCone;
    }

    @Override
    public int diagonal() {
        if (sizeContainer())
            return 20;
        else
            return 10;
    }

    @Override
    public boolean sizeContainer() {
        int sizeContainer = 1 + (int ) Math.random()*10;
        if (sizeContainer <= 5) {
            return true;
        }else
            return false;
    }
}
