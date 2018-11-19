package com.tinder.recs.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.tinder.profile.view.ProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.LinearFloatInterpolator;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.LinearRectInterpolator;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderImageView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig;
import com.tinder.recs.animation.RecProfileAnimationDecorator.State;
import com.tinder.recs.view.RecProfileView;

public class DefaultRecProfileExitAnimationDecorator extends DefaultRecProfileAnimationDecorator {
    private static final long EXIT_ANIMATION_DURATION_MS = 120;
    @NonNull
    private State state = State.INITIALIZED;

    public DefaultRecProfileExitAnimationDecorator(@NonNull RecProfileView recProfileView, @NonNull PlaceholderPhotoConfig placeholderPhotoConfig) {
        super(recProfileView, placeholderPhotoConfig);
    }

    public void animate() {
        this.state = State.RUNNING;
        int width = this.recProfileView.getProfileView().getProfilePhotosView().getWidth();
        int height = this.recProfileView.getHeight() - width;
        final ProfileView profileView = this.recProfileView.getProfileView();
        final PlaceholderImageView placeholderImageView = this.recProfileView.getPlaceholderImageView();
        final View entranceBackground = this.recProfileView.getEntranceBackground();
        entranceBackground.setVisibility(0);
        profileView.setBackgroundColor(0);
        placeholderImageView.setVisibility(0);
        profileView.getProfilePhotosView().setVisibility(4);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(EXIT_ANIMATION_DURATION_MS);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        LinearFloatInterpolator linearFloatInterpolator = new LinearFloatInterpolator(0.0f, (float) height);
        LinearFloatInterpolator linearFloatInterpolator2 = new LinearFloatInterpolator(1.0f, 0.0f);
        Rect rect = new Rect(0, 0, width, width);
        Rect rect2 = new Rect(this.config.placeholderX(), this.config.placeholderY(), this.config.placeholderX() + this.config.placeholderWidth(), this.config.placeholderY() + this.config.placeholderHeight());
        ProfileView profileView2 = profileView;
        View view = entranceBackground;
        ofFloat.addUpdateListener(new DefaultRecProfileExitAnimationDecorator$$Lambda$0(linearFloatInterpolator, profileView2, view, linearFloatInterpolator2, new LinearRectInterpolator(rect, rect2), new Rect(), new LinearFloatInterpolator(1.0f, this.config.placeholderParallaxFactor()), placeholderImageView));
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                DefaultRecProfileExitAnimationDecorator.this.notifyAnimationStart();
                DefaultRecProfileExitAnimationDecorator.this.handleAnimationStart(profileView, entranceBackground);
                placeholderImageView.fadeTagView(Long.valueOf(DefaultRecProfileExitAnimationDecorator.EXIT_ANIMATION_DURATION_MS), Float.valueOf(1.0f));
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                DefaultRecProfileExitAnimationDecorator.this.state = State.FINISHED;
                DefaultRecProfileExitAnimationDecorator.this.notifyAnimationEnd();
                DefaultRecProfileExitAnimationDecorator.this.handleAnimationEnd(profileView, entranceBackground);
                placeholderImageView.removeTagViewFromView();
            }
        });
        ofFloat.start();
    }

    static final /* synthetic */ void lambda$animate$0$DefaultRecProfileExitAnimationDecorator(LinearFloatInterpolator linearFloatInterpolator, ProfileView profileView, View view, LinearFloatInterpolator linearFloatInterpolator2, LinearRectInterpolator linearRectInterpolator, Rect rect, LinearFloatInterpolator linearFloatInterpolator3, PlaceholderImageView placeholderImageView, ValueAnimator valueAnimator) {
        valueAnimator = valueAnimator.getAnimatedFraction();
        profileView.setTranslationY(linearFloatInterpolator.getValue(valueAnimator));
        view.setAlpha(linearFloatInterpolator2.getValue(valueAnimator));
        linearRectInterpolator.getValue(valueAnimator, rect);
        FrameLayout frameLayout = placeholderImageView;
        frameLayout.updateSize((float) rect.left, (float) rect.top, rect.width(), rect.height(), linearFloatInterpolator3.getValue(valueAnimator));
    }

    @NonNull
    public State getState() {
        return this.state;
    }

    private void handleAnimationStart(ProfileView profileView, View view) {
        profileView.setLayerType(2, null);
        view.setLayerType(2, null);
    }

    private void handleAnimationEnd(ProfileView profileView, View view) {
        profileView.setLayerType(0, null);
        view.setLayerType(0, null);
    }
}
