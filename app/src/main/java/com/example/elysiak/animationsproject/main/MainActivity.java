package com.example.elysiak.animationsproject.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.elysiak.animationsproject.R;
import com.example.elysiak.animationsproject.advanced_transitions.CoordinatedMotionActivity;
import com.example.elysiak.animationsproject.advanced_transitions.ExplodeAndSlideActivity;
import com.example.elysiak.animationsproject.advanced_transitions.TransformsActivity;
import com.example.elysiak.animationsproject.advanced_transitions.fragment_transitions.FragmentTransitionsActivity;
import com.example.elysiak.animationsproject.advanced_transitions.window.WindowContentTransitionsActivity;
import com.example.elysiak.animationsproject.advanced_transitions.shared_element.SharedElementActivity;
import com.example.elysiak.animationsproject.animators.AnimatorSetActivity;
import com.example.elysiak.animationsproject.animators.ObjectAnimatorActivity;
import com.example.elysiak.animationsproject.animators.ViewPropertyAnimatorActivity;
import com.example.elysiak.animationsproject.animators.XMLAnimatorActivity;
import com.example.elysiak.animationsproject.classic_animations.BackgroundAnimationActivity;
import com.example.elysiak.animationsproject.classic_animations.ClassicAnimationsActivity;
import com.example.elysiak.animationsproject.classic_animations.ResourcesAnimationsActivity;
import com.example.elysiak.animationsproject.classic_animations.activity_animations.FirstActivityAnimationActivity;
import com.example.elysiak.animationsproject.classic_animations.combined_animations.FirstCombinedAnimationActivity;
import com.example.elysiak.animationsproject.constraint_animations.ConstraintSetAnimationActivity;
import com.example.elysiak.animationsproject.constraint_animations.GroupAnimationActivity;
import com.example.elysiak.animationsproject.constraint_animations.PlaceHolderAnimationActivity;
import com.example.elysiak.animationsproject.databinding.ActivityMainBinding;
import com.example.elysiak.animationsproject.transitions.SimpleTransitionActivity;
import com.example.elysiak.animationsproject.transitions.resources.TransitionResourcesActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        views = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initClickListeners();
    }

    private void initClickListeners() {
        views.btnGroupAnimation.setOnClickListener(v -> openActivity(GroupAnimationActivity.class));
        views.btnSetAnimation.setOnClickListener(v -> openActivity(ConstraintSetAnimationActivity.class));
        views.btnPlaceholderAnimation.setOnClickListener(v -> openActivity(PlaceHolderAnimationActivity.class));
        views.btnClassicAnimation.setOnClickListener(v -> openActivity(ClassicAnimationsActivity.class));
        views.btnResourcesAnimation.setOnClickListener(v -> openActivity(ResourcesAnimationsActivity.class));
        views.btnActivityAnimation.setOnClickListener(v -> openActivity(FirstActivityAnimationActivity.class));
        views.btnCombinedAnimation.setOnClickListener(v -> openActivity(FirstCombinedAnimationActivity.class));
        views.btnBackgroundAnimation.setOnClickListener(v -> openActivity(BackgroundAnimationActivity.class));
        views.btnObjectAnimator.setOnClickListener(v -> openActivity(ObjectAnimatorActivity.class));
        views.btnAnimatorSet.setOnClickListener(v -> openActivity(AnimatorSetActivity.class));
        views.btnViewPropertyAnimator.setOnClickListener(v -> openActivity(ViewPropertyAnimatorActivity.class));
        views.btnXmlAnimator.setOnClickListener(v -> openActivity(XMLAnimatorActivity.class));
        views.btnSimpleTransition.setOnClickListener(v -> openActivity(SimpleTransitionActivity.class));
        views.btnTransitionResources.setOnClickListener(v -> openActivity(TransitionResourcesActivity.class));
        views.btnExplodeAndSlide.setOnClickListener(v -> openActivity(ExplodeAndSlideActivity.class));
        views.btnCoordinatedMotion.setOnClickListener(v -> openActivity(CoordinatedMotionActivity.class));
        views.btnTransforms.setOnClickListener(v -> openActivity(TransformsActivity.class));
        views.btnSharedElement.setOnClickListener(v -> openActivity(SharedElementActivity.class));
        views.btnWindowContentTransitions.setOnClickListener(v -> openActivity(WindowContentTransitionsActivity.class));
        views.btnFragmentTransition.setOnClickListener(v -> openActivity(FragmentTransitionsActivity.class));
    }

    private void openActivity(Class activityClass) {
        startActivity(new Intent(this, activityClass));
    }
}
