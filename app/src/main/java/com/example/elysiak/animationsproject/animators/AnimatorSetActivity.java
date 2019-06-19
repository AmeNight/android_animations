package com.example.elysiak.animationsproject.animators;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityAnimatorSetBinding;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

public class AnimatorSetActivity extends AppCompatActivity {

    private ActivityAnimatorSetBinding views;
    private AnimatorSet animatorSet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_animator_set);
        initAnimations();
        views.btnClick.setOnClickListener(this::onBtnClick);
    }

    private void initAnimations() {
        ObjectAnimator translateAnim = ObjectAnimator.ofFloat(views.btnClick,
                "translationY", 300);
        translateAnim.setRepeatMode(ValueAnimator.REVERSE);
        translateAnim.setRepeatCount(ValueAnimator.INFINITE);

        ObjectAnimator xScaleAnim = ObjectAnimator.ofFloat(views.btnClick,
                "scaleX", 3);
        xScaleAnim.setRepeatMode(ValueAnimator.REVERSE);
        xScaleAnim.setRepeatCount(ValueAnimator.INFINITE);

        ObjectAnimator colorAnim = ObjectAnimator.ofObject(views.btnClick,
                "textColor", new ArgbEvaluator(), RED, GREEN);
        colorAnim.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim.setRepeatCount(ValueAnimator.INFINITE);

        animatorSet = new AnimatorSet();
        animatorSet.playTogether(translateAnim, xScaleAnim, colorAnim);
        animatorSet.setDuration(1000);
        animatorSet.start();
    }

    private void onBtnClick(View view) {
        if (animatorSet.isRunning()) {
            animatorSet.end();
        } else {
            animatorSet.start();
        }
    }
}
