


package com.github.AbouOpenSource.Model;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Position {

    static int dimension=0;
    double[] values;
    double x;
    double y;
    double z;

    public Position(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Position(double ... args) throws Exception {
        if(Position.dimension == 0){
             Position.dimension= args.length;
        }else
            if(Position.dimension!=args.length){
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
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    /*******************************/

    public double distanceFromToPosition(Position position){

        return sqrt(

                            pow(position.getX()-this.getX(),2)+

                            pow(position.getY()-this.getY(),2)+

                            pow(position.getZ()-this.getZ(),2)
                 );
    }



}
