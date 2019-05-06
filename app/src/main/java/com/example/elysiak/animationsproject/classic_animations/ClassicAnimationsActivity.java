package com.example.elysiak.animationsproject.classic_animations;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityClassicAnimationsBinding;

public class ClassicAnimationsActivity extends AppCompatActivity {

    private ActivityClassicAnimationsBinding views;

    private TranslateAnimation translateAnimation;
    private RotateAnimation rotateAnimation;
    private ScaleAnimation scaleAnimation;
    private AnimationSet animationSet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_classic_animations);
        initAnimations();
        views.btn.setOnClickListener(v -> {
            v.startAnimation(animationSet);
        });
    }

    private void initAnimations() {
        translateAnimation = new TranslateAnimation(-300, 0, -300, 0);
        rotateAnimation = new RotateAnimation(0, 360);
        scaleAnimation = new ScaleAnimation(0, 2, 0, 2);

        animationSet = new AnimationSet(this, null);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(3000);
    }
}
