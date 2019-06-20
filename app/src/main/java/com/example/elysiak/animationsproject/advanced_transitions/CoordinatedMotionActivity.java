package com.example.elysiak.animationsproject.advanced_transitions;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.elysiak.animationsproject.R;

import static android.view.Gravity.END;
import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class CoordinatedMotionActivity extends AppCompatActivity {

    private static final int TRANSITION_DURATION = 200;

    private ViewGroup root;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinated_motion);
        root = findViewById(R.id.linear);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        for (int i = 0; i < root.getChildCount(); i++) {
            final View view = root.getChildAt(i);
            view.postDelayed(() -> {
                TransitionManager.beginDelayedTransition(root, new Slide(END));
                view.setVisibility(view.getVisibility() == VISIBLE ? INVISIBLE : VISIBLE);
            }, TRANSITION_DURATION * i);
        }
        return super.onOptionsItemSelected(item);
    }
}
