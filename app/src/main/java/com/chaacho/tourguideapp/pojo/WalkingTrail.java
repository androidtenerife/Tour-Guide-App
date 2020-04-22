package com.chaacho.tourguideapp.pojo;

import com.chaacho.tourguideapp.R;

import java.util.ArrayList;

public class WalkingTrail {
    private String titleWalkingTrail;
    private String fullDescrWalkingTrail;
    private String shortDescrWalkingTrail;
    private int srcImageWalkingTrail;


    public WalkingTrail(String titleWalkingTrail, String fullDescrWalkingTrail, String shortDescrWalkingTrail, int srcImageWalkingTrail) {
        this.titleWalkingTrail = titleWalkingTrail;
        this.fullDescrWalkingTrail = fullDescrWalkingTrail;
        this.shortDescrWalkingTrail = shortDescrWalkingTrail;
        this.srcImageWalkingTrail = srcImageWalkingTrail;
    }

    public String getTitleWalkingTrail() {
        return titleWalkingTrail;
    }

    public void setTitleWalkingTrail(String titleWalkingTrail) {
        this.titleWalkingTrail = titleWalkingTrail;
    }

    public String getFullDescrWalkingTrail() {
        return fullDescrWalkingTrail;
    }

    public void setFullDescrWalkingTrail(String fullDescrWalkingTrail) {
        this.fullDescrWalkingTrail = fullDescrWalkingTrail;
    }

    public String getShortDescrWalkingTrail() {
        return shortDescrWalkingTrail;
    }

    public void setShortDescrWalkingTrail(String shortDescrWalkingTrail) {
        this.shortDescrWalkingTrail = shortDescrWalkingTrail;
    }

    public int getSrcImageWalkingTrail() {
        return srcImageWalkingTrail;
    }

    public void setSrcImageWalkingTrail(int srcImageWalkingTrail) {
        this.srcImageWalkingTrail = srcImageWalkingTrail;
    }

   public static ArrayList<WalkingTrail> getWalkingTrail(){
        ArrayList<WalkingTrail> walkingTrails = new ArrayList<WalkingTrail>();
        walkingTrails.add(new WalkingTrail(
                "Magic Forest \n 10 Km. Easy hike",
                "Trees full of lichens, giant ferns and moos pad. Botanically " +
                        "interesting hike through an enchanted evergreen laurel forest with variety" +
                        "of endemic species of trees and plants. A must-see in Tenerife!",
                "Trees full of lichens, giant ferns and moos pad. Botanically ...",
                R.drawable.senderos_fw
        ));
        walkingTrails.add(new WalkingTrail("Top Tour Masca \n 8.5 Km. Medium hike.",
                "High-constrast tour through lush vegetation and impressive gorges." +
                        "Places of barter trades and threshing floors remember former times." +
                        "Grand finale is in one of the most picturesque mountain villages of Tenerife.",
                "High-constrast tour through lush vegetation and impressive gorges.",
                R.drawable.senderos_fw));
        walkingTrails.add(new WalkingTrail("Colourful Palm-Valley \n 7 Km. Easy hike.",
                "Easy ascent through terraced fields where the locals still grow potatoes, pumpkins and wine." +
                        "Enjoy a powerful landscape with old volcanoes, barren lava rocks and subtropical fog forest." +
                        "Plenty of interesting things to discover in a small space!",
                "Easy ascent through terraced fields where the locals still grow potatoes, pumpkins and wine.",
                R.drawable.senderos_fw));
        walkingTrails.add(new WalkingTrail("Shepherds Paths \n 8 Km. Medium hike.",
                "This hiking trail on an ancient goat path leads to on of the most remoted places in Tenerife." +
                        "Experience firsthand former times in the nature reserve of Teno." +
                        "Optional goat cheese and wine at a local bar. Rural Tenerife at its best!",
                "This hiking trail on an ancient goat path leads to on of th emost remoted places in Tenerife.",
                R.drawable.senderos_fw));

        return walkingTrails;
   }

}
