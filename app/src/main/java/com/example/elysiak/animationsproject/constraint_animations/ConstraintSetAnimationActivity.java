package com.example.elysiak.animationsproject.constraint_animations;

import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.animation.OvershootInterpolator;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityContraintSetAnimationBinding;

public class ConstraintSetAnimationActivity extends AppCompatActivity {

    private ActivityContraintSetAnimationBinding views;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_contraint_set_animation);

        views.start.setOnClickListener(v -> {
            ConstraintSet set = new ConstraintSet();
            set.clone(ConstraintSetAnimationActivity.this, R.layout.activity_constraint_set_second_frame);
            set.applyTo(views.rootLayout);
            Transition transition = new ChangeBounds();
            transition.setInterpolator(new OvershootInterpolator());
            transition.setDuration(2000);
            TransitionManager.beginDelayedTransition(views.rootLayout, transition);
        });
    }
}
