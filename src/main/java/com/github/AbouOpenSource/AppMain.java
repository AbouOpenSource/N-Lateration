package com.github.AbouOpenSource;

import com.github.AbouOpenSource.Model.CollectionEmetteur;
import com.github.AbouOpenSource.Model.Position.Position3D;
import com.github.AbouOpenSource.core.Reader;

public class AppMain {
    public static void main(String[] args) throws Exception {

      String name = "src/main/java/com/github/AbouOpenSource/data/data_test.csv";
      Reader reader = new Reader(name);
      CollectionEmetteur collectionEmetteur = reader.getCollectionEmetteur();
      Position3D position = collectionEmetteur.getPositionOfDevice();

      System.out.println(position);
    }
}
