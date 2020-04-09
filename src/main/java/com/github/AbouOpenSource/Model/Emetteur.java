package com.github.AbouOpenSource.Model;

import com.github.AbouOpenSource.Model.Position.Position2D;
import com.github.AbouOpenSource.Model.Position.Position3D;
import com.github.AbouOpenSource.core.Interface.Position;

public class Emetteur {
    Position position ;
    double raduis ;

    public Emetteur() {
    }

    public Emetteur(Position3D position) {
        this.position = position;
    }

    public Emetteur(Position2D position){
        this.position = position;
    }

    public Emetteur(double raduis) {
        this.raduis = raduis;
    }

    public Emetteur(Position3D position, double raduis) {
        this.position = position;
        this.raduis = raduis;
    }

    /**************************************/


    public double getraduis() {
        return raduis;
    }

    /****************************************/

    public void setPosition(Position3D position) {
        this.position = position;
    }

    public void setraduis(double raduis) {
        this.raduis = raduis;
    }

    /*************************************/


    public double distanceFromToPosition(Position3D position){
        return this.position.distanceFromToPosition(position);
    }

    
    
    
    
    public double deltaRaduisDistance(Position3D position){
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
