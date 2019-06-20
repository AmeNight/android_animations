package com.example.elysiak.animationsproject.advanced_transitions.fragment_transitions;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.transition.Slide;
import android.widget.Button;

import com.example.elysiak.animationsproject.R;

import static android.view.Gravity.START;

public class FragmentTransitionsActivity extends AppCompatActivity {

    private Button btnStart;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_transitions);

        btnStart = findViewById(R.id.btn_start);

        btnStart.setOnClickListener(v -> {
            TransitionFirstFragment fragment = new TransitionFirstFragment();
            fragment.setEnterTransition(new Slide(START));
            fragment.setReturnTransition(new Explode());
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.fl_fragment, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
    }
}
