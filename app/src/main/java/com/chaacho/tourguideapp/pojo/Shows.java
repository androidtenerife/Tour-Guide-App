package com.chaacho.tourguideapp.pojo;

import com.chaacho.tourguideapp.R;

import java.util.ArrayList;

public class Shows {
    private int nameOfShow;
    private int shortDescription;
    private int imageResource;

    public Shows(int nameOfShow, int shortDescription, int imageResource) {
        this.nameOfShow = nameOfShow;
        this.shortDescription = shortDescription;
        this.imageResource = imageResource;
    }

    public int getNameOfShow() {
        return nameOfShow;
    }

    public int getShortDescription() {
        return shortDescription;
    }

    public int getImageResource() {
        return imageResource;
    }

    public static ArrayList<Shows> loadShows() {
        ArrayList<Shows> showsArrayList = new ArrayList<Shows>();
        showsArrayList.add(new Shows(R.string.arona,
                R.string.arona_descr,
                R.drawable.showa));
        showsArrayList.add(new Shows(R.string.noche_azul,
                R.string.noche_azul_desc,
                R.drawable.showb));
        showsArrayList.add(new Shows(R.string.galletas,
                R.string.galletas_descr,
                R.drawable.showc));
        showsArrayList.add(new Shows(R.string.gala,
                R.string.gala_descr,
                R.drawable.showd));

        return showsArrayList;
    }
}
