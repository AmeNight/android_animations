package com.example.elysiak.animationsproject.constraint_animations;

import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityGroupAnimationBinding;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class GroupAnimationActivity extends AppCompatActivity {

    private ActivityGroupAnimationBinding views;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_group_animation);
        views.btnStart.setOnClickListener(v -> {
            views.btnStart.setVisibility(GONE);
            views.group.setVisibility(VISIBLE);

            Transition transition = new Fade();
            transition.setDuration(1000);
            TransitionManager.beginDelayedTransition(views.clRoot, transition);
        });
    }
}
