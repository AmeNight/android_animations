package com.example.elysiak.animationsproject.advanced_transitions.window;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.transition.Transition;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityWindowContentTransitionBinding;

public class WindowContentTransitionsActivity extends AppCompatActivity {


    private ActivityWindowContentTransitionBinding views;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_window_content_transition);

        /*Transition explodeTransition = new Explode();
        explodeTransition.setDuration(2000);
        getWindow().setExitTransition(explodeTransition);
        getWindow().setReenterTransition(explodeTransition);*/

        views.btnStartContentTransitions.setOnClickListener(v -> {
            Intent intent = new Intent(WindowContentTransitionsActivity.this,
                    WindowContentTransitions2Activity.class);
            startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(
                    WindowContentTransitionsActivity.this).toBundle());
        });
    }
}
