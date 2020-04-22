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

    public static ArrayList<Beaches> loadBeaches(){
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


return beachesArrayList;

    }
}
