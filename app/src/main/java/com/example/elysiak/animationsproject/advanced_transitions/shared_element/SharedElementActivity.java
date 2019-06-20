package com.example.elysiak.animationsproject.advanced_transitions.shared_element;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.widget.Toast;

import com.example.elysiak.animationsproject.R;

public class SharedElementActivity extends AppCompatActivity {

    private AppCompatImageView sharedImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_element);
        Toast.makeText(this, "Activity 1", Toast.LENGTH_SHORT).show();
        sharedImage = findViewById(R.id.iv_shared_image);
        sharedImage.setOnClickListener(v -> {
            Intent intent = new Intent(SharedElementActivity.this, SharedElementSecondActivity.class);
            ActivityOptionsCompat options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(SharedElementActivity.this, sharedImage, "nature");
            startActivity(intent, options.toBundle());
        });
    }
}
