package com.github.AbouOpenSource;

import com.github.AbouOpenSource.Model.CollectionEmetteur;
import com.github.AbouOpenSource.Model.Emetteur;
import com.github.AbouOpenSource.Model.Position;

public class AppMain {
    public static void main(String[] args) throws Exception {
        Emetteur emetteur  = new Emetteur(new Position(0.5f,0.5f,0.5f),3);
        Emetteur emetteur1 = new Emetteur(new Position(4,0,0),2);
        Emetteur emetteur2 = new Emetteur(new Position(4,5,5),4.2f);
        Emetteur emetteur3 = new Emetteur(new Position(3,3,3),2.5f);

        CollectionEmetteur collectionEmetteur =new CollectionEmetteur();
            collectionEmetteur.add(emetteur);
            collectionEmetteur.add(emetteur1);
            collectionEmetteur.add(emetteur2);
            collectionEmetteur.add(emetteur3);

        Position position = new Position();
        position =  collectionEmetteur.getPositionOfDevice();

        System.out.println(position);
    }
}
