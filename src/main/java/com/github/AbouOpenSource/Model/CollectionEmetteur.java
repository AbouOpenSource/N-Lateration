package com.github.AbouOpenSource.Model;

import java.util.Arrays;
import java.util.Vector;

public class CollectionEmetteur {
        Vector<Emetteur> emetteurs;
        public CollectionEmetteur(){
            emetteurs = new Vector<Emetteur>();
        }

        public void add(Emetteur emetteur){
            emetteurs.add(emetteur);
        }

        public void add(Emetteur... emetteurs){
            this.emetteurs.addAll(Arrays.asList(emetteurs));
    }


        public void del(Emetteur emetteur){
            emetteurs.remove(emetteur);
        }

        public void clear(){
            emetteurs.clear();
        }

        public double sumDistance(Position position){
              double tmp =0.0;
              for(Emetteur emetteur:emetteurs){
                  tmp += emetteur.distanceFromToPosition(position);
              }
          return tmp;
        }

    public double sumDelta(Position position){
        double tmp =0.0;
        for(Emetteur emetteur:emetteurs){
            tmp += emetteur.deltaRaduisDistance(position);
        }
        return tmp;
    }

        public Position getPositionOfDevice(){

        Position position= new Position(0,0,0);
           double somme =this.sumDelta(position);
            for (double x=0; x < 10.0;x+=0.1)
                for (double y=0; y < 10.0; y+=0.1)
                    for (double z =0; z<10.0;z+=0.1){
                        double temp = this.sumDelta(new Position(x,y,z));
                        if(temp<somme){
                            somme = temp;
                            position.setX(x);
                            position.setY(y);
                            position.setZ(z);
                        }
                    }
            return position;
        }
}
