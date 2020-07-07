package com.example.dont_get_sick;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.ViewFlipper;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    ViewFlipper flipper;
    ToggleButton toggle_Flipping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipper = (ViewFlipper) findViewById(R.id.flipper);

        for (int i = 0; i < 4; i++) {
            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.test_img01 + i);
            flipper.addView(img);
        }
        Animation showIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        flipper.setInAnimation(showIn);

        flipper.setOutAnimation(this, android.R.anim.slide_out_right);
        toggle_Flipping = (ToggleButton) findViewById(R.id.toggle_auto);
        toggle_Flipping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // TODO Auto-generated method stub
                if (isChecked) {

                    flipper.setFlipInterval(1000);//플리핑 간격(1000ms)
                    flipper.startFlipping();//자동 Flipping 시작
                } else {

                    flipper.stopFlipping();
                }
            }
        });

    }

    }
