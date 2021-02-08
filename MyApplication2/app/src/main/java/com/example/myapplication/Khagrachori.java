package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Khagrachori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khagrachori);


        ImageView viewBitmap = (ImageView)findViewById(R.id.im1);

        // Bitmap bitmap = (Bitmap)this.getIntent().getParcelableExtra("Bitmap");
        Bundle extras = getIntent().getExtras();
        if (extras!=null)
        {
            int res_image = extras.getInt("image");
            viewBitmap.setImageResource(res_image);

        }
    }

    public void alutila_details(View view) {
        Intent intent = new Intent(this,Alutila_details.class);
        startActivity(intent);
    }
}