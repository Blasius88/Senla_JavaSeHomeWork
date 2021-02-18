package com.company.Task5;

public class Port {

    private int dockForShip;

    private int masWater;

    public Port(){}

    public Port(int dockForShip, int masVater){
        this.dockForShip = dockForShip;
        this.masWater = masVater;
    }

    public int getDockForShip() {
        return dockForShip;
    }
    public void setDockForShip(int dockForShip) {
        this.dockForShip = dockForShip;
    }
    public int getMasWater() {
        return masWater;
    }

    public void setMasWater(int masWater) {
        this.masWater = masWater;
    }


    @Override
    public String toString() {
        return "" +dockForShip + " boats arrived at the port and delivered " + masWater + " units of water\n";
    }
}
