package com.example.a2024project.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a2024project.databinding.ActivityMainBinding;

 public class MainActivity extends AppCompatActivity {

     private ActivityMainBinding binding;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         getWindow().setFlags(
                 WindowManager.LayoutParams.FLAG_FULLSCREEN,
                 WindowManager.LayoutParams.FLAG_FULLSCREEN);
         binding = ActivityMainBinding.inflate(getLayoutInflater());
         setContentView(binding.getRoot());
     }

     @Override
     public boolean onTouchEvent(MotionEvent event){
         if(event.getAction() == MotionEvent.ACTION_DOWN) {
             startActivity(new Intent(this, MainMenu.class));
         }
         return false;
     }
 }