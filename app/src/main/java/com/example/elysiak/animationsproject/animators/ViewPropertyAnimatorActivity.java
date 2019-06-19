package com.example.elysiak.animationsproject.animators;

import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.databinding.ActivityViewPropertyAnimatorBinding;

public class ViewPropertyAnimatorActivity extends AppCompatActivity {

    private ActivityViewPropertyAnimatorBinding views;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_view_property_animator);

        views.btnClick.setOnClickListener(v -> {
            views.btnClick.animate().translationY(300).scaleX(2).alpha(0.5f).setDuration(2000)
                    .withEndAction(() -> {
                        Toast.makeText(this, "The animation ended", Toast.LENGTH_SHORT).show();
                    });
        });
    }
}
