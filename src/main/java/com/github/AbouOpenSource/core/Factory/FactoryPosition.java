package com.github.AbouOpenSource.core.Factory;


import com.github.AbouOpenSource.Model.Position.Position2D;
import com.github.AbouOpenSource.Model.Position.Position3D;
import com.github.AbouOpenSource.core.Interface.Factory;

public class FactoryPosition implements Factory {
    public static int dimension = 3;
    public Object getInstance(String type) {
        if(type.equalsIgnoreCase("3D")){
            return new Position3D() ;

        }else if (type.equalsIgnoreCase("2D")){
            return new Position2D();
        }
        return null;
    }
    public Object getInstance() {
        if(dimension==3){
            return new Position3D() ;

        }else if (dimension==2){
            return new Position2D();
        }
        return null;
    }
}
