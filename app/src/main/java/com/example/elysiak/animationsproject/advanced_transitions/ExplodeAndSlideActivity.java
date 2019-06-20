package com.example.elysiak.animationsproject.advanced_transitions;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.widget.Button;

import com.example.elysiak.animationsproject.R;

import static android.view.Gravity.RIGHT;
import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class ExplodeAndSlideActivity extends AppCompatActivity {

    private AppCompatImageView ivIcon;
    private Button btnExplode;
    private Button btnSlide;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explode_and_slide);

        ivIcon = findViewById(R.id.iv_icon);
        btnExplode = findViewById(R.id.btn_explode);
        btnSlide = findViewById(R.id.btn_slide);

        btnExplode.setOnClickListener(v -> {
            TransitionManager.beginDelayedTransition(
                    findViewById(android.R.id.content), new Explode());
            ivIcon.setVisibility(ivIcon.getVisibility() == VISIBLE ? INVISIBLE : VISIBLE);
        });

        btnSlide.setOnClickListener(v -> {
            TransitionManager.beginDelayedTransition(
                    findViewById(android.R.id.content), new Slide(RIGHT));
            ivIcon.setVisibility(ivIcon.getVisibility() == VISIBLE ? INVISIBLE : VISIBLE);
        });
    }
}
