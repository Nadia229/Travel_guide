package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class view_of_place extends AppCompatActivity {


    ImageView img1;
    ImageView img2;
    ImageView img3;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_of_place);






    }


    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


    public void coxbazar_save(View view) {

        Intent intent = new Intent(this,Bd_activity.class);
        //intent.putExtra("image1","");
        startActivity(intent);

    }

    public void coxbazarsave(View view) {

        Share s = new Share();
        //s.show_coxsbazar();

        Intent intent = new Intent(view_of_place.this,Share.class);/*Defining The Intent*/
        intent.putExtra("long","cox");/*Putting The Data To Pass To The Next Activity*/
        //intent.putExtra("khagrachori","khag");/*Putting The Data To Pass To The Next Activity*/

        startActivity(intent);/*Starting The Activity*/

    }

    public void view_cox_details(View view) {
        Intent intent = new Intent(view_of_place.this,Details.class);/*Defining The Intent*/
        //intent.putExtra("long","cox");/*Putting The Data To Pass To The Next Activity*/
        //intent.putExtra("khagrachori","khag");/*Putting The Data To Pass To The Next Activity*/

        startActivity(intent);/*Starting The Activity*/
    }
}