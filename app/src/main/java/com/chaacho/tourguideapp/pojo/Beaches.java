package com.chaacho.tourguideapp.pojo;

import com.chaacho.tourguideapp.R;

import java.util.ArrayList;

public class Beaches {
    private String nameBeach;
    private String shortDescription;
    private int imageSource;

    public Beaches(String nameBeach, String shortDescription, int imageSource) {
        this.nameBeach = nameBeach;
        this.shortDescription = shortDescription;
        this.imageSource = imageSource;
    }

    public String getNameBeach() {
        return nameBeach;
    }

    public void setNameBeach(String nameBeach) {
        this.nameBeach = nameBeach;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getImageSource() {
        return imageSource;
    }

    public void setImageSource(int imageSource) {
        this.imageSource = imageSource;
    }

    public static ArrayList<Beaches> loadBeaches() {
        ArrayList<Beaches> beachesArrayList = new ArrayList<Beaches>();
        beachesArrayList.add(new Beaches("El Duque \nLocation:Adeje",
                "Everything we have to say in favor of El Duque Beach is in the image." +
                        " The beach is located in the municipality of Adeje, in the Southwest, it is" +
                        " 390 m long and has one bad thing: it is so beautiful that it gets crowded.",
                R.drawable.elduque));
        beachesArrayList.add(new Beaches("Las Teresitas",
                "Las Teresitas beach is three times bigger than El Duque beach (1,300" +
                        " m), it is in the town of San Andrés (municipality of Santa Cruz de Tenerife)" +
                        " and it has a medium degree of occupation, neither high nor low. In its favor," +
                        " being the Canary Islands so touristy, is the fact that it is not embedded in a " +
                        "marsh of buildings, but isolated. You have to go",
                R.drawable.teresitas));
        beachesArrayList.add(new Beaches("De los Gigantes\nLocation:Los Gigantes",
                "Los Gigantes accidentally dispose of themselves between the terms of " +
                        "Buenavista del Norte and Santiago del Teide. Some cliffs open and show inlets " +
                        "and small beaches that are a joy. For example, this one, near Puerto de Los " +
                        "Gigantes: nice, pretty.",
                R.drawable.gigantes));
        beachesArrayList.add(new Beaches("Masca \nLocation:Masca",
                "Masca beach is either reached after a walking tour or reached by boat." +
                        " The counterpart of difficult access is that there are hardly any people and " +
                        "it is totally isolated. It is part of the Buenavista del Norte municipality" +
                        " and measures just over half a kilometer.",
                R.drawable.masca));
        beachesArrayList.add(new Beaches("Americas \nLocation:Adeje.",
                "You have to approach the municipality of Adeje (such as El Duque beach) " +
                        "to get to Las Américas beach. It is not a secret to anyone. The beach is " +
                        "usually crowded in the summer months. In almost half a kilometer you can find " +
                        "some space to lie down. If you go early or last minute, the whole beach for you.",
                R.drawable.americas));
        beachesArrayList.add(new Beaches("Bollullo \nLocation:La Orotava",
                "El Bollullo beach is a more than satisfactory option for those who " +
                        "do not want to see many people while taking a bath. It is isolated and measures" +
                        " just 200 m in length. It belongs to the municipality of La Orotava, " +
                        "on the slopes of Mount Teide.",
                R.drawable.bollullo));
        beachesArrayList.add(new Beaches("Benijo \nLocation:Anaga",
                "The Anaga district, in Santa Cruz de Tenerife, is beautiful. We will stop " +
                        "another time to talk about it. For now, suffice it to say that it houses the Benijo " +
                        "beach: volcanic, nudist, calm. It measures 300 m and there are usually not many people." +
                        " Facing the shore, the rocks, like giants.",
                R.drawable.benijo));
        return beachesArrayList;

    }
}
