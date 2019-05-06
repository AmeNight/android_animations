package com.example.elysiak.animationsproject;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.elysiak.animationsproject.classic_animations.BackgroundAnimationActivity;
import com.example.elysiak.animationsproject.classic_animations.ClassicAnimationsActivity;
import com.example.elysiak.animationsproject.classic_animations.ResourcesAnimationsActivity;
import com.example.elysiak.animationsproject.classic_animations.activity_animations.FirstActivityAnimationActivity;
import com.example.elysiak.animationsproject.classic_animations.combined_animations.FirstCombinedAnimationActivity;
import com.example.elysiak.animationsproject.constraint_animations.ConstraintSetAnimationActivity;
import com.example.elysiak.animationsproject.constraint_animations.GroupAnimationActivity;
import com.example.elysiak.animationsproject.constraint_animations.PlaceHolderAnimationActivity;
import com.example.elysiak.animationsproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initClickListeners();
    }

    private void initClickListeners() {
        views.btnGroupAnimation.setOnClickListener(v -> openActivity(GroupAnimationActivity.class));
        views.btnSetAnimation.setOnClickListener(v -> openActivity(ConstraintSetAnimationActivity.class));
        views.btnPlaceholderAnimation.setOnClickListener(v -> openActivity(PlaceHolderAnimationActivity.class));
        views.btnClassicAnimation.setOnClickListener(v -> openActivity(ClassicAnimationsActivity.class));
        views.btnResourcesAnimation.setOnClickListener(v -> openActivity(ResourcesAnimationsActivity.class));
        views.btnActivityAnimation.setOnClickListener(v -> openActivity(FirstActivityAnimationActivity.class));
        views.btnCombinedAnimation.setOnClickListener(v -> openActivity(FirstCombinedAnimationActivity.class));
        views.btnBackgroundAnimation.setOnClickListener(v -> openActivity(BackgroundAnimationActivity.class));
    }

    private void openActivity(Class activityClass) {
        startActivity(new Intent(this, activityClass));
    }
}
