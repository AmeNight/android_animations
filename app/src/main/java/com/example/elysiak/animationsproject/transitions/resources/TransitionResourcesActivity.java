package com.example.elysiak.animationsproject.transitions.resources;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Scene;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.elysiak.animationsproject.R;

public class TransitionResourcesActivity extends AppCompatActivity {

    private ViewGroup root;
    private Button btnLogin;
    private Button btnRegister;

    private Scene mainScene;
    private Scene loginScene;
    private Scene signUpScene;

    private TransitionSet transitionSet;
    private TransitionManager transitionManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_resources);
        initViews();
        initScenes();
        initOnClickListeners();

        transitionSet = (TransitionSet) TransitionInflater.from(this)
                .inflateTransition(R.transition.transitions);
        transitionManager = TransitionInflater.from(this)
                .inflateTransitionManager(R.transition.transition_manager, root);
    }

    private void initViews() {
        root = findViewById(R.id.root);
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);
    }

    private void initScenes() {
        mainScene = Scene.getSceneForLayout(root, R.layout.activity_transition_resources, this);
        loginScene = Scene.getSceneForLayout(root, R.layout.activity_transition_login, this);
        signUpScene = Scene.getSceneForLayout(root, R.layout.activity_transition_sign_up, this);
    }

    private void initOnClickListeners() {
        btnLogin.setOnClickListener(this::onLoginClick);
        btnRegister.setOnClickListener(this::onSignUpClick);
    }

    private void onLoginClick(View view) {
        transitionManager.transitionTo(loginScene);
    }

    private void onSignUpClick(View view) {
        transitionManager.transitionTo(signUpScene);
    }
}
