package com.example.elysiak.animationsproject.advanced_transitions.window;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.transition.Transition;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityWindowContentTransition2Binding;

public class WindowContentTransitions2Activity extends AppCompatActivity {


    private ActivityWindowContentTransition2Binding views;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_window_content_transition_2);

        /*Transition slideTransition = new Slide();
        slideTransition.setDuration(2000);
        getWindow().setEnterTransition(slideTransition);
        getWindow().setReturnTransition(slideTransition);*/
    }
}