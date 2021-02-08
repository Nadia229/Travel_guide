package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sylhet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);
    }

    public void Jaflong_detail(View view) {
        Intent intent = new Intent(Sylhet.this,Jaflong.class);/*Defining The Intent*/


        startActivity(intent);/*Starting The Activity*/
    }
}