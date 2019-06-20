package com.example.elysiak.animationsproject.advanced_transitions.shared_element;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.elysiak.animationsproject.R;

public class SharedElementSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_element_second);
        Toast.makeText(this, "Activity 2", Toast.LENGTH_SHORT).show();
    }
}
