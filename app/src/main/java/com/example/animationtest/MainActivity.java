package com.example.animationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnAnimationButton(View view){
        float y = view.getY() + 500;
        view.animate().setDuration(1000).setInterpolator(new BounceInterpolator()).y(y);

        int i = 3;

        int i2 = 3;
    }
}