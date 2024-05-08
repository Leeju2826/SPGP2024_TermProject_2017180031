package com.example.a2024project.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a2024project.BuildConfig;
import com.example.a2024project.R;
import com.example.a2024project.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

     private ActivityMainBinding binding;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         if(BuildConfig.DEBUG){
             startActivity(new Intent(this, GameStage1.class));
         }

     }

     public void onBtnStartGame(View view) {
         startActivity(new Intent(this, GameStage1.class));
     }
 }