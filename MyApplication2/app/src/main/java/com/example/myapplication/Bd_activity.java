package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.SearchEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

public class Bd_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_activity);

        //getSupportActionBar().setTitle(Html.fromHtml("<font color=\"white\">"+getString(R.string.app_name)+"</font>"));

    }
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


    public void coxsbazar(View view) {
        Intent coxs = new Intent(this,view_of_place.class);
        //coxs.putExtra("coxs","cox");
        startActivity(coxs);
    }

    public void rangamati(View view) {
        Intent rang = new Intent(this,Rangamati.class);
        //rang.putExtra("user_date","rang");
        startActivity(rang);
    }
    public void s(View view) {
        Intent intent = new Intent(this, Sylhet.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);


    }

    public void khagrachori(View view) {
        Intent intent = new Intent(this, Khagrachori.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void com(View view) {
        Intent intent = new Intent(this, Comilla.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void b(View view) {
        Intent intent = new Intent(this, Bagerhat.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


    public void searchclick(View view) {
        EditText imageView = (EditText) findViewById(R.id.search);
        String text = imageView.getText().toString();
        //Toast.makeText(getApplication(), text, Toast.LENGTH_SHORT).show();
        if(text.equals(""))
        {
            Toast.makeText(getApplication(),"invalid! Search something", Toast.LENGTH_SHORT).show();
        }
        else if (text.equals("কক্সবাজার")||text.equals(" "+"কক্সবাজার")||text.equals("কক্সবাজার"+" ")||text.equals("কক্সবাজার"+"  ")||text.equals(" "+"কক্সবাজার"+" ")||text.equals("  "+"কক্সবাজার"+" ")||text.equals("  "+"কক্সবাজারা")){
            Intent intent = new Intent(this, view_of_place.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

        }
        else if (text.equals("খাগড়াছড়ি")||text.equals(" "+"খাগড়াছড়ি")||text.equals("খাগড়াছড়ি"+" ")||text.equals("খাগড়াছড়ি"+"  ")||text.equals(" "+"খাগড়াছড়ি"+" ")||text.equals("  "+"খাগড়াছড়ি"+" ")||text.equals("  "+"খাগড়াছড়ি")){
            Intent intent = new Intent(this, Khagrachori.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

        }
        else if (text.equals("কুমিল্লা")||text.equals(" "+"কুমিল্লা")||text.equals("কুমিল্লা"+" ")||text.equals("কুমিল্লা"+"  ")||text.equals(" "+"কুমিল্লা"+" ")||text.equals("  "+"কুমিল্লা"+" ")||text.equals("  "+"কুমিল্লা")){
            Intent intent = new Intent(this, Comilla.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

        }
        else if (text.equals("বাগেরহাট")||text.equals(" "+"বাগেরহাট")||text.equals("বাগেরহাট"+" ")||text.equals("বাগেরহাট"+"  ")||text.equals(" "+"বাগেরহাট"+" ")||text.equals("  "+"বাগেরহাট"+" ")||text.equals("  "+"বাগেরহাট")){
            Intent intent = new Intent(this, Bagerhat.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        }
        else if (text.equals("রাঙ্গামাটি")||text.equals(" "+"রাঙ্গামাটি")||text.equals("রাঙ্গামাটি"+" ")||text.equals("রাঙ্গামাটি"+"  ")||text.equals(" "+"রাঙ্গামাটি"+" ")||text.equals("  "+"রাঙ্গামাটি"+" ")||text.equals("  "+"রাঙ্গামাটি")){
            Intent intent = new Intent(this,Rangamati.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

        }
        else if (text.equals("সিলেট")||text.equals(" "+"সিলেট")||text.equals("সিলেট"+" ")||text.equals("সিলেট"+"  ")||text.equals(" "+"সিলেট"+" ")||text.equals("  "+"সিলেট"+" ")||text.equals("  "+"সিলেট")){
            Intent intent = new Intent(this, Sylhet.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

        }
        else
        {
            Toast.makeText(getApplication(),"Search something valid", Toast.LENGTH_SHORT).show();

        }
    }
}