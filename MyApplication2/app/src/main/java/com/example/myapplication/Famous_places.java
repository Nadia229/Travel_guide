package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Famous_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_places);
    }

    public void sajek_detail(View view) {
        Intent intent = new Intent(Famous_places.this,Sajek_valley.class);/*Defining The Intent*/


        startActivity(intent);/*Starting The Activity*/
    }

    public void alutila_detail(View view) {
        Intent intent = new Intent(Famous_places.this,Alutila_details.class);/*Defining The Intent*/


        startActivity(intent);/*Starting The Activity*/
    }


    public void saintmartin(View view) {
        Intent intent = new Intent(Famous_places.this,Details.class);/*Defining The Intent*/


        startActivity(intent);/*Starting The Activity*/
    }
}