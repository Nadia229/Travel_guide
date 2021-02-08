package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Save_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_places);

        ImageView viewBitmap = (ImageView)findViewById(R.id.im1);
        TextView textView = (TextView)findViewById(R.id.t1);
        TextView textView1 = (TextView)findViewById(R.id.t2) ;
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.l1);

        ImageView viewBitmap2 = (ImageView)findViewById(R.id.im2);
        TextView textView2 = (TextView)findViewById(R.id.t3);
        TextView textView12 = (TextView)findViewById(R.id.t4) ;
        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.l2);

        ImageView viewBitmap3 = (ImageView)findViewById(R.id.im3);
        TextView textView3 = (TextView)findViewById(R.id.t5);
        TextView textView13 = (TextView)findViewById(R.id.t6) ;
        LinearLayout linearLayout3 = (LinearLayout)findViewById(R.id.l3);


        ImageView viewBitmap4 = (ImageView)findViewById(R.id.im5);
        TextView textView4 = (TextView)findViewById(R.id.t9);
        TextView textView14 = (TextView)findViewById(R.id.t7) ;
        LinearLayout linearLayout4 = (LinearLayout)findViewById(R.id.l4);

        ImageView viewBitmap5 = (ImageView)findViewById(R.id.im4);
        TextView textView5 = (TextView)findViewById(R.id.t10);
        TextView textView15 = (TextView)findViewById(R.id.t8) ;
        LinearLayout linearLayout5 = (LinearLayout)findViewById(R.id.l5);


        ImageView viewBitmap6 = (ImageView)findViewById(R.id.im6);
        TextView textView6 = (TextView)findViewById(R.id.t11);
        TextView textView16 = (TextView)findViewById(R.id.t12) ;
        LinearLayout linearLayout6 = (LinearLayout)findViewById(R.id.l6);




        CustomScrollView scrollView = (CustomScrollView)findViewById(R.id.scroll);
        //scrollView.isEnableScrolling(false);
        scrollView.setEnableScrolling(false);


       // Bitmap bitmap = (Bitmap)this.getIntent().getParcelableExtra("Bitmap");
        Bundle extras = getIntent().getExtras();
        if (extras!=null)
        {
           linearLayout.setVisibility(View.VISIBLE);
            int res_image = extras.getInt("image");
            viewBitmap.setImageResource(res_image);
            textView.setText("sajek");
            textView1.setText("sajek onek sundor");

        }

        //viewBitmap.setImageBitmap(bitmap);



       /* byte[] byteArray = extras.getByteArray("picture");

        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        ImageView image = (ImageView) findViewById(R.id.im7);

        image.setImageBitmap(bmp);*/
    }
}