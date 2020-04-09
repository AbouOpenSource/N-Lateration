


package com.github.AbouOpenSource.Model.Position;
import com.github.AbouOpenSource.core.Interface.Position;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Position3D implements Position {

    static int dimension=0;
    double[] values;
    double x;
    double y;
    double z;

    public Position3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public Position3D() {
    }

    public Position3D(double ... args) throws Exception {
        if(Position3D.dimension == 0){
             Position3D.dimension= args.length;
        }else
            if(Position3D.dimension!=args.length){
                throw new Exception("Error With different dim");
        }
        values = new double[args.length];
        System.arraycopy(args, 0, values, 0, args.length);
    }


    /***************************/
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }


    /***************************/
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /********************************/
    @Override
    public String toString() {
        return "Position3D {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    /*******************************/

    public double distanceFromToPosition(Position3D position){

        return sqrt(

                            pow(position.getX()-this.getX(),2)+

                            pow(position.getY()-this.getY(),2)+

                            pow(position.getZ()-this.getZ(),2)
                 );
    }

    public int getDimension() {
        return 3;
    }
}
