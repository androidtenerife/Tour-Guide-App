package com.chaacho.tourguideapp.pojo;

import com.chaacho.tourguideapp.R;

import java.util.ArrayList;

public class Beaches {
    private int nameBeach;
    private int shortDescription;
    private int imageSource;

    public Beaches(int nameBeach, int shortDescription, int imageSource) {
        this.nameBeach = nameBeach;
        this.shortDescription = shortDescription;
        this.imageSource = imageSource;
    }

    public int getNameBeach() {
        return nameBeach;
    }

    public int getShortDescription() {
        return shortDescription;
    }

    public int getImageSource() {
        return imageSource;
    }

    public static ArrayList<Beaches> loadBeaches() {
        ArrayList<Beaches> beachesArrayList = new ArrayList<Beaches>();
        beachesArrayList.add(new Beaches(R.string.elduque,
                R.string.elduque_des,
                R.drawable.elduque));
        beachesArrayList.add(new Beaches(R.string.teresitas,
                R.string.teresitas_descr,
                R.drawable.teresitas));
        beachesArrayList.add(new Beaches(R.string.gigantes,
                R.string.gigantes_desc,
                R.drawable.gigantes));

        return beachesArrayList;

    }
}
