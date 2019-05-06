package com.example.elysiak.animationsproject.classic_animations;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityResourcesAnimationBinding;

public class ResourcesAnimationsActivity extends AppCompatActivity {

    private ActivityResourcesAnimationBinding views;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_resources_animation);
        views.btn.setOnClickListener(v -> {
            Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.animate_one);
            Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.animate_two);

            views.btn.startAnimation(animation1);
            views.ivIcon.startAnimation(animation2);
        });
    }
}
