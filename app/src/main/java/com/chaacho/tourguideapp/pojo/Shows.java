package com.chaacho.tourguideapp.pojo;

import com.chaacho.tourguideapp.R;

import java.util.ArrayList;

public class Shows {
    private String nameOfShow;
    private String shortDescription;
    private int imageResource;

    public Shows(String nameOfShow, String shortDescription, int imageResource) {
        this.nameOfShow = nameOfShow;
        this.shortDescription = shortDescription;
        this.imageResource = imageResource;
    }

    public String getNameOfShow() {
        return nameOfShow;
    }

    public void setNameOfShow(String nameOfShow) {
        this.nameOfShow = nameOfShow;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public static ArrayList<Shows> loadShows() {
        ArrayList<Shows> showsArrayList = new ArrayList<Shows>();
        showsArrayList.add(new Shows("Arona en Colores \nCity: Las Galletas",
                "Arona in colors is a multicolored urban party. It will be held this" +
                        " Saturday June 14 from 10 a.m. to 12 p.m.",
                R.drawable.showa));
        showsArrayList.add(new Shows("Noche Azul \nCity: Los Cristianos.",
                "The blue night returns to Los Cristianos, on August 22 the night will " +
                        "be filled with light, music, fireworks, organizes the Christian Town Hall," +
                        " municipality of Arona.",
                R.drawable.showb));
        showsArrayList.add(new Shows("Arona en colores\nCity: Las Galletas",
                "Arona in colors arrives at the Cookies. Multicolor Urban Party.\n" +
                        "Music and street events, you can't miss it.\n" +
                        "Organized by the City Council of Arona, Los Cristianos. We wait for you " +
                        "this coming Saturday June 15.",
                R.drawable.showc));
        showsArrayList.add(new Shows("Gala Solidaria \nCity:Los Cristianos",
                "Solidarity gala, a child a meal a book.\n" +
                        "Participate in this musical event tribute to the music of all time, bolero " +
                        "rock, pop, dance. Infanta Leonor Auditorium.\n" +
                        "Organized by Rotary Club Tenerife Sur.",
                R.drawable.showd));
        showsArrayList.add(new Shows("III Gala Solidaria \nCity:Adeje",
                "Third Solidarity Gala in the south of Tenerife, charitable event.\n" +
                        "Los Sabandeños, Canto del Loco, Maná, and great pop music artists participate.\n" +
                        "We are waiting for you this November 17.",
                R.drawable.showe));
        showsArrayList.add(new Shows("IV Gala Solidaria \nCity:Arona",
                "Fourth Solidarity Gala in the south of Tenerife, charitable event.\n" +
                        "Los Sabandeños, Canto del Loco, Maná, and great pop music artists participate.\n" +
                        "We are waiting for you this November 16.",
                R.drawable.showf));
        return showsArrayList;
    }
}
