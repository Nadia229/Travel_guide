package com.example.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import java.io.ByteArrayOutputStream;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    ImageButton bt1;
    ImageButton bt2;
    ImageButton bt3;
    ImageButton bt4;
    ImageButton bt5;
    ImageButton bt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // Toolbar toolbar = findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);
        // FloatingActionButton fab = findViewById(R.id.fab);

      // getSupportActionBar().setTitle(Html.fromHtml("<font color=\"red\">"+getString(R.string.app_name)+"</font>"));


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setBackgroundColor(getResources().getColor(R.color.my));




        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.nav_about)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                int id = destination.getId();



                switch (id){
                    case R.id.nav_home:
//                        Intent intent = new Intent(Main2Activity.this,Main2Activity.class);
//                        startActivity(intent);
                        Toast.makeText(Main2Activity.this,"home clicked",Toast.LENGTH_LONG).show();
                        break;


                    case R.id.nav_gallery:
                        Intent intent1 = new Intent(Main2Activity.this,Bd_activity.class);
                        startActivity(intent1);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        Toast.makeText(Main2Activity.this,"gallery clicked",Toast.LENGTH_LONG).show();
                        break;


                    case R.id.nav_slideshow:
                        Intent intent2 = new Intent(Main2Activity.this,Famous_places.class);
                        startActivity(intent2);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        Toast.makeText(Main2Activity.this,"slideshow clicked",Toast.LENGTH_LONG).show();
                        break;
                    /*case R.id.nav_saveplace:
                        Intent intent3 = new Intent(Main2Activity.this,Save_places.class);
                        startActivity(intent3);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

                        Toast.makeText(Main2Activity.this,"save place clicked",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_about:
                        Intent intent4 = new Intent(Main2Activity.this,About.class);
                        startActivity(intent4);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

                        Toast.makeText(Main2Activity.this,"About clicked",Toast.LENGTH_LONG).show();
                        break;*/
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void imageButtonOnClick(View view) {
        Intent intent = new Intent(this, Bd_activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

    }

    public void important(View view) {

       // Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.sajek);
        Intent intent = new Intent();
        intent.setClass(Main2Activity.this, Famous_places.class);

        startActivity(intent);



    }

    public void saved(View view) {
        Intent intent = new Intent(this,view_of_place.class);
       // intent.putExtra("image1","share");
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

    }
    public void btn(View view) {
        /*Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.sajek);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();*/


        Intent intent = new Intent(this, Famous_places.class);
        //intent.putExtra("image1",R.drawable.sajek);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

    }



}