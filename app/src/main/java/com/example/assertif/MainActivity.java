package com.example.assertif;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private String tag=this.getClass().getSimpleName();
    private Activity activity=this;
    ProgressDialog loading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ImageView imageView = (ImageView)findViewById(R.id.imageview_welcome_page);
        imageView.getLayoutParams().height = 300;
        imageView.getLayoutParams().width = 300;

        ((ImageView)findViewById(R.id.imageview_start)).setImageDrawable(getRoundedDrawable("books.png"));
        ((ImageView)findViewById(R.id.imageview_statistics)).setImageDrawable(getRoundedDrawable("video.png"));
        ((ImageView)findViewById(R.id.imageview_instructions)).setImageDrawable(getRoundedDrawable("quiz.png"));
        ((ImageView)findViewById(R.id.imageview_acknowledgments)).setImageDrawable(getRoundedDrawable("tentang.png"));

        CardView startCardview = (CardView)findViewById(R.id.card_view_materi);
        startCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "MATERI", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(activity,MateriActivity.class));
            }
        });

        CardView statsCardView = (CardView)findViewById(R.id.card_view_video);
        statsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Video", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(activity,VideoActivity.class));
            }
        });

        ((CardView)findViewById(R.id.card_view_quiz)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //loading = ProgressDialog.show(activity, null, "Harap Tunggu...", true, false);
                Toast.makeText(MainActivity.this, "QUIZ", Toast.LENGTH_SHORT).show();
                //loading.dismiss();
                startActivity(new Intent(activity,QuizActivity.class));
            }

        });

        ((CardView)findViewById(R.id.card_view_tentang)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Tentang Aplikasi", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(activity,TentangActivity.class));
            }
        });
    }

    private RoundedBitmapDrawable getRoundedDrawable(String filename) {
        try {
            RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(getResources(), getAssets().open(filename));
            dr.setCornerRadius(500);
            return dr;
        } catch (IOException e) {
//            Log.d("imageHandling", e.toString());
        }
        return null;
    }
}
