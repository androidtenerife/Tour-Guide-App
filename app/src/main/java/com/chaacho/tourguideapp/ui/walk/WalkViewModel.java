package com.chaacho.tourguideapp.ui.walk;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WalkViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public WalkViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to Tenerife \n Canary Island - Spain ");// +"\n" + (R.string.text_home));
    }

    public LiveData<String> getText() {
        return mText;
    }
}