package com.company.Task5;

public class Port {

    private int dockForShip;

    private int masVater;

    public Port(){}

    public Port(int dockForShip, int masVater){
        this.dockForShip = dockForShip;
        this.masVater = masVater;
    }

    public int getDockForShip() {
        return dockForShip;
    }
    public void setDockForShip(int dockForShip) {
        this.dockForShip = dockForShip;
    }
    public int getMasVater() {
        return masVater;
    }

    public void setMasVater(int masVater) {
        this.masVater = masVater;
    }


    @Override
    public String toString() {
        return "" +dockForShip + " boats arrived at the port and delivered " + masVater + " units of water\n";
    }
}
