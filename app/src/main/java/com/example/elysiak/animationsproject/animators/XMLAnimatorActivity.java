package com.example.elysiak.animationsproject.animators;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityXmlAnimatorBinding;

public class XMLAnimatorActivity extends AppCompatActivity {

    private ActivityXmlAnimatorBinding views;
    private AnimatorSet animatorSet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_xml_animator);

        views.ivAnimated.setOnClickListener(v -> {
            animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.my_animator);
            animatorSet.setDuration(2000);
            animatorSet.setTarget(views.ivAnimated);
            animatorSet.start();
        });
    }
}
