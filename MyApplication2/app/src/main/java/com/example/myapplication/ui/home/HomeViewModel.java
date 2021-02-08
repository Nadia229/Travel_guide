package com.example.myapplication.ui.home;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

import com.example.myapplication.Bd_activity;
import com.example.myapplication.Main2Activity;
import com.example.myapplication.R;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {




    private MutableLiveData<String> mText;


    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}