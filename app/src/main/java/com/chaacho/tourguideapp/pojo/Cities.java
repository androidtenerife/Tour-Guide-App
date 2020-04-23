package com.chaacho.tourguideapp.pojo;

import com.chaacho.tourguideapp.R;

import java.util.ArrayList;

public class Cities {
    private int nameInCity;
    private int shortDescription;
    private int sourceImage;

    public Cities(int nameInCity, int shortDescription, int sourceImage) {
        this.nameInCity = nameInCity;
        this.shortDescription = shortDescription;
        this.sourceImage = sourceImage;
    }

    public int getNameInCity() {
        return nameInCity;
    }

    public int getShortDescription() {
        return shortDescription;
    }

    public int getSourceImage() {
        return sourceImage;
    }

    public static ArrayList<Cities> loadCity() {
        ArrayList<Cities> cityArrayList = new ArrayList<Cities>();
        cityArrayList.add(new Cities(R.string.lalaguna,
                R.string.lalaguna_desc,
                R.drawable.lalaguna));
        cityArrayList.add(new Cities(R.string.la_orotava,
                R.string.la_orotava_descr,
                R.drawable.orotava));
        cityArrayList.add(new Cities(R.string.puerto_cruz,
                R.string.puerto_cruz_descr,
                R.drawable.puerto));
        cityArrayList.add(new Cities(R.string.icod_vinos,
                R.string.icod_vinos_descr,
                R.drawable.icoddelosvinos));

        return cityArrayList;
    }

}
