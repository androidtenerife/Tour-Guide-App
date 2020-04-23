package com.chaacho.tourguideapp.pojo;

import com.chaacho.tourguideapp.R;

import java.util.ArrayList;

public class WalkingTrail {
    private int titleWalkingTrail;
    private int shortDescrWalkingTrail;
    private int srcImageWalkingTrail;


    public WalkingTrail(int titleWalkingTrail, int shortDescrWalkingTrail, int srcImageWalkingTrail) {
        this.titleWalkingTrail = titleWalkingTrail;
        this.shortDescrWalkingTrail = shortDescrWalkingTrail;
        this.srcImageWalkingTrail = srcImageWalkingTrail;
    }

    public int getTitleWalkingTrail() {
        return titleWalkingTrail;
    }

    public int getShortDescrWalkingTrail() {
        return shortDescrWalkingTrail;
    }

    public int getSrcImageWalkingTrail() {
        return srcImageWalkingTrail;
    }

    public static ArrayList<WalkingTrail> getWalkingTrail() {
        ArrayList<WalkingTrail> walkingTrails = new ArrayList<WalkingTrail>();
        walkingTrails.add(new WalkingTrail(R.string.magic,
                R.string.magic_descr,
                R.drawable.tour_guide_1
        ));
        walkingTrails.add(new WalkingTrail(R.string.masca,
                R.string.masca_descr,
                R.drawable.tour_guide_7));
        walkingTrails.add(new WalkingTrail(R.string.colorful,
                R.string.colorful_descr,
                R.drawable.tour_guide_2));
        walkingTrails.add(new WalkingTrail(R.string.sheph,
                R.string.sheph_descr,
                R.drawable.tour_guide_5));

        return walkingTrails;
    }

}
