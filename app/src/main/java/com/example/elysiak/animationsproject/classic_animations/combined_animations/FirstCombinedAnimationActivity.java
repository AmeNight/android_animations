package com.example.elysiak.animationsproject.classic_animations.combined_animations;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityFirstCombinedAnimationBinding;

public class FirstCombinedAnimationActivity extends AppCompatActivity {

    private ActivityFirstCombinedAnimationBinding views;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_first_combined_animation);
        views.btnNext.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.animate_view);
            animation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {

                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    startActivity(new Intent(FirstCombinedAnimationActivity.this,
                            SecondCombinedAnimationActivity.class));
                    overridePendingTransition(R.anim.activity_enter, R.anim.activity_exit);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });
            v.startAnimation(animation);
        });
    }
}
