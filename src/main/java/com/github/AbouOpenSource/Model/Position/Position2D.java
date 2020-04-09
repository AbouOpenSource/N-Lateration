package com.github.AbouOpenSource.Model.Position;

import com.github.AbouOpenSource.core.Interface.Position;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Position2D implements Position {
    double x;
    double y;

    public Position2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position2D() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceFromToPosition(Position2D position) {
         return sqrt(

               pow(position.getX()-this.getX(),2)+

                       pow(position.getY()-this.getY(),2)
       );
    }

    public double distanceFromToPosition(Position3D position) {
        return 0;
    }

    public int getDimension() {
        return 2;
    }
}
