package com.example.elysiak.animationsproject.classic_animations;

import android.databinding.DataBindingUtil;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityBackgroundBinding;

public class BackgroundAnimationActivity extends AppCompatActivity {

    private ActivityBackgroundBinding views;

    private boolean isAnimationRunning = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_background);

        AnimationDrawable animationDrawable = (AnimationDrawable) views.btnStart.getBackground();
        views.btnStart.setOnClickListener(v -> {
            if (isAnimationRunning) {
                views.btnStart.setText("Start");
                animationDrawable.stop();
            } else {
                views.btnStart.setText("Stop");
                animationDrawable.start();
            }
            isAnimationRunning = !isAnimationRunning;
        });
    }
}
