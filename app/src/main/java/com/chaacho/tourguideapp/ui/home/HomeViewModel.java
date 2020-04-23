package com.chaacho.tourguideapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to Tenerife \n Canary Island - Spain ");// +"\n" + (R.string.text_home));
    }

    public LiveData<String> getText() {
        return mText;
    }
}