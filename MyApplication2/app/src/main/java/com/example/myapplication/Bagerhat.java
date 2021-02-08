package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bagerhat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagerhat);
    }

    public void khan(View view) {
        Intent intent = new Intent(Bagerhat.this,khan_jahan.class);/*Defining The Intent*/


        startActivity(intent);/*Starting The Activity*/
    }
}