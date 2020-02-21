package com.fyld.gamifyldation.ui.players;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.fyld.gamifyldation.data.DatabaseHelper;

public class PlayersViewModel extends ViewModel {

    private MutableLiveData<String> mText;


    public PlayersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is players fragment");
    }

    public LiveData<String> get(DatabaseHelper db) {
        return mText;
    }
}