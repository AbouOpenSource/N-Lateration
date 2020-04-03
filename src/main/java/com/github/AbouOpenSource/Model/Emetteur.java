package com.github.AbouOpenSource.Model;

public class Emetteur {
    Position position ;
    double raduis ;

    public Emetteur() {
    }

    public Emetteur(Position position) {
        this.position = position;
    }

    public Emetteur(double raduis) {
        this.raduis = raduis;
    }

    public Emetteur(Position position, double raduis) {
        this.position = position;
        this.raduis = raduis;
    }

    /**************************************/

    public Position getPosition() {
        return position;
    }

    public double getraduis() {
        return raduis;
    }

    /****************************************/

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setraduis(double raduis) {
        this.raduis = raduis;
    }

    /*************************************/


    public double distanceFromToPosition(Position position){
        return this.position.distanceFromToPosition(position);
    }

    
    
    
    
    public double deltaRaduisDistance(Position position){
       return Math.abs(this.distanceFromToPosition(position) - this.getraduis());
    }
    /**************************************/
    @Override
    public String toString() {
        return "Emetteur{" +
                "position=" + position +
                ", raduis=" + raduis +
                '}';
    }

    public double distanceEmetteurDevice(Device device){
           return this.position.distanceFromToPosition(device.getPosition());
    }
}
