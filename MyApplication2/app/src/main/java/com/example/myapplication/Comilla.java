package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Comilla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comilla);
    }

    public void moynamoti(View view) {
        Intent intent = new Intent(Comilla.this,Moynamoti_details.class);/*Defining The Intent*/


        startActivity(intent);/*Starting The Activity*/
    }

}