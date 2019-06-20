package com.example.elysiak.animationsproject.advanced_transitions;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.transition.ChangeClipBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.widget.Button;

import com.example.elysiak.animationsproject.R;

import static android.widget.ImageView.ScaleType.CENTER;

public class TransformsActivity extends AppCompatActivity {

    private AppCompatImageView image;
    private Button btnChangeTransform;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transforms);

        btnChangeTransform = findViewById(R.id.btn_change_transform);
        image = findViewById(R.id.iv_image);

        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeTransform());
        transitionSet.addTransition(new ChangeClipBounds());
        transitionSet.addTransition(new ChangeImageTransform());
        transitionSet.setDuration(500);

        btnChangeTransform.setOnClickListener(v -> {
            TransitionManager.beginDelayedTransition(
                    findViewById(android.R.id.content), transitionSet);
            image.setScaleX(1.5f);
            image.setScaleY(1.5f);
            image.setRotation(45);
            image.setScaleType(CENTER);
            image.setClipBounds(new Rect(100, 200, 500, 400));
        });
    }
}
