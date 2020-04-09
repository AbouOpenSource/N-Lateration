package com.github.AbouOpenSource.core;

import com.github.AbouOpenSource.Model.CollectionEmetteur;
import com.github.AbouOpenSource.Model.Emetteur;
import com.github.AbouOpenSource.Model.Position.Position3D;
import com.github.AbouOpenSource.core.Factory.FactoryPosition;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    String csvFile;
    String cvsSplitBy = ",";

    BufferedReader bufferedReader;

    public Reader(String csvFile) throws FileNotFoundException, IOException {
        this.csvFile = csvFile;

    }

    public Reader(String csvFile, String cvsSplitBy) throws FileNotFoundException, IOException {
        this.csvFile = csvFile;
        this.cvsSplitBy = cvsSplitBy;

    }


    public CollectionEmetteur getCollectionEmetteur() throws FileNotFoundException {
        CollectionEmetteur collectionEmetteur = new CollectionEmetteur();
        FactoryPosition factoryPosition= new FactoryPosition();

        String line = "";
        bufferedReader = new BufferedReader(new FileReader(csvFile));
        try {
            while ((line = bufferedReader.readLine()) != null) {
             Position3D position = (Position3D) factoryPosition.getInstance();
             String[] liste = line.split(",") ;
             position = new Position3D(Double.parseDouble(liste[0]),Double.parseDouble(liste[1]),Double.parseDouble(liste[2]));
               collectionEmetteur.add(new Emetteur(position, Double.parseDouble(liste[3])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return collectionEmetteur;
    }
}