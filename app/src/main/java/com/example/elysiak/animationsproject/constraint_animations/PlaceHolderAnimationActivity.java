package com.example.elysiak.animationsproject.constraint_animations;

import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityPlaceholderAnimationBinding;

public class PlaceHolderAnimationActivity extends AppCompatActivity {

    private ActivityPlaceholderAnimationBinding views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_placeholder_animation);
        views.ivOne.setOnClickListener(this::onViewClick);
        views.ivTwo.setOnClickListener(this::onViewClick);
        views.ivThree.setOnClickListener(this::onViewClick);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void onViewClick(View view) {
        Transition transition = new ChangeBounds();
        transition.setDuration(2000);
        transition.setInterpolator(new OvershootInterpolator());

        TransitionManager.beginDelayedTransition(views.clRoot, transition);
        views.placeholder.setContentId(view.getId());
    }
}
