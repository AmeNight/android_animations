package com.example.elysiak.animationsproject.classic_animations.activity_animations;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityFirstActivityAnimationBinding;

public class FirstActivityAnimationActivity extends AppCompatActivity {

    private ActivityFirstActivityAnimationBinding views;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_first_activity_animation);
        views.btnNext.setOnClickListener(v -> {
            startActivity(new Intent(this, SecondActivityAnimationActivity.class));
            overridePendingTransition(R.anim.slide_right_in, R.anim.slide_left_out);
        });
    }
}
