package com.example.elysiak.animationsproject.vector_drawable_animations;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.widget.Button;

import com.example.elysiak.animationsproject.R;

public class SingleFileApproachActivity extends AppCompatActivity {

    private Button btnStart;
    private AppCompatImageView ivImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_file_approach);
        btnStart = findViewById(R.id.btn_start);
        ivImage = findViewById(R.id.image);

        btnStart.setOnClickListener(v -> {
            AnimatedVectorDrawable avd = (AnimatedVectorDrawable) ivImage.getDrawable();
            avd.start();
        });
    }
}
