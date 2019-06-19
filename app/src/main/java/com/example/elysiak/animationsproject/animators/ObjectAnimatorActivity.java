package com.example.elysiak.animationsproject.animators;

import android.animation.ObjectAnimator;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityObjectAnimatorBinding;

import static android.animation.ValueAnimator.INFINITE;
import static android.animation.ValueAnimator.REVERSE;

public class ObjectAnimatorActivity extends AppCompatActivity {

    private ActivityObjectAnimatorBinding views;
    private ObjectAnimator animator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_object_animator);
        views.btnClick.setOnClickListener(v -> {
            animator = ObjectAnimator.ofFloat(views.btnClick, "scaleX", 5);
            animator.setDuration(1000);
            animator.setRepeatCount(INFINITE);
            animator.setRepeatMode(REVERSE);
            animator.start();
        });
    }
}
