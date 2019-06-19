package com.example.elysiak.animationsproject.transitions;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.elysiak.animationsproject.R;

public class SimpleTransitionActivity extends AppCompatActivity {

    private Button btnClick;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_transition);
        btnClick = findViewById(R.id.btn_click);

        btnClick.setOnClickListener(v -> {
            Transition changeBounds = new ChangeBounds();
            TransitionSet transitionSet = new TransitionSet();
            //transition set if want to add some more transitions
            transitionSet.addTransition(changeBounds)
                    .setDuration(2000);

            ViewGroup root = findViewById(android.R.id.content);
            Scene sceneNew = Scene.getSceneForLayout(root, R.layout.activity_simple_transition_second, this);
            TransitionManager.go(sceneNew, transitionSet);
        });
    }
}
