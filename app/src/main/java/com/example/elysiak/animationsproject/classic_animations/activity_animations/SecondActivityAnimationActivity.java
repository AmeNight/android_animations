package com.example.elysiak.animationsproject.classic_animations.activity_animations;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivitySecondActivityAnimationBinding;

public class SecondActivityAnimationActivity extends AppCompatActivity {

    private ActivitySecondActivityAnimationBinding views;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_second_activity_animation);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_right_out);
    }
}
