package com.company.Task5.Сontainer;


public class CylindricalContainer implements Container {

    private final double Pi = 3.14;
    private int densityOfWater;
    private int height;
    private double sizeCone  = diagonal() * Pi * height;
    private double massOfWater = sizeCone * densityOfWater;

    public int getDensityOfWater() {
        return densityOfWater;
    }

    public void setDensityOfWater(int densityOfWater) {
        this.densityOfWater = densityOfWater;
    }

    public void setMassOfWater(double massOfWater) {
        this.massOfWater = massOfWater;
    }

    public double getMassOfWater() {
        return massOfWater;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public boolean sizeContainer() {
        int sizeContainer = 1 + (int ) Math.random()*10;
        if (sizeContainer <= 5) {
            return true;
        }else
            return false;
    }

    @Override
    public int diagonal() {
        if (sizeContainer())
            return 20;
        else
            return 10;
    }
}
