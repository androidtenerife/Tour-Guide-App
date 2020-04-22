package com.chaacho.tourguideapp.pojo;

import com.chaacho.tourguideapp.R;

import java.util.ArrayList;

public class Cities {
    private String nameInCity;
    private String shortDescription;
    private int sourceImage;

    public Cities(String nameInCity, String shortDescription, int sourceImage) {
        this.nameInCity = nameInCity;
        this.shortDescription = shortDescription;
        this.sourceImage = sourceImage;
    }

    public String getNameInCity() {
        return nameInCity;
    }

    public void setNameInCity(String nameInCity) {
        this.nameInCity = nameInCity;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getSourceImage() {
        return sourceImage;
    }

    public void setSourceImage(int sourceImage) {
        this.sourceImage = sourceImage;
    }

    public static ArrayList<Cities> loadCity() {
        ArrayList<Cities> cityArrayList = new ArrayList<Cities>();
        cityArrayList.add(new Cities("City La Laguna \nLa Laguna.",
                "The old capital of Tenerife and the former headquarters of the general" +
                        " captaincy of the Canary Islands, something like the de facto capital of the" +
                        " Canary archipelago; the only city declared a World Heritage Site by UNESCO" +
                        " in the Canary Islands; the model for all Spanish colonial cities in the" +
                        " New World ... La Laguna is the jewel in the crown of the cultural heritage " +
                        "of the north of Tenerife and the entire island.",
                R.drawable.lalaguna));
        cityArrayList.add(new Cities("City of La Orotava \n La Orotava",
                "The town of La Orotava is another essential in the north of Tenerife." +
                        " It was the first town that became independent from La Laguna and obtained " +
                        "the title of town, hence its proud inhabitants continue to be called " +
                        "\"villeros\". Already from the road, the red dome of the church of La " +
                        "Concepción warns you that you are approaching a city with character.",
                R.drawable.orotava));
        cityArrayList.add(new Cities("Urban Musseum \nPuerto de la Cruz.",
                "When we arrived in Puerto de la Cruz we had no idea that we would" +
                        " find a large open-air museum of urban art in its fishing neighborhood, " +
                        "La Ranilla. The Puerto Street Art project surprised us and we liked it so" +
                        " much that we dedicated an entire article to it.",
                R.drawable.puerto));
        cityArrayList.add(new Cities("City of Icod de los Vinos \nIcod de los Vinos",
                "The historic center of Icod de los Vinos is another one worth a visit," +
                        " although the part that is best preserved is much smaller, basically the one" +
                        " that surrounds the Plaza de la Pila.",
                R.drawable.icoddelosvinos));
        cityArrayList.add(new Cities("City of Garachico \nGarachico",
                "Garachico is another of the most beautiful towns in the north of Tenerife." +
                        " It was founded by a “cousin” of mine, a Genoese, in the late 15th century " +
                        "and for many years it was the first port on the island, hence its wealth and " +
                        "heritage. But at the beginning of the 18th century a volcanic eruption " +
                        "completely destroyed its port. Since then, it was Puerto de la Cruz that " +
                        "became the access by sea to the island par excellence and Garachico ceased " +
                        "to have its importance.",
                R.drawable.garachico));
        return cityArrayList;
    }

}
