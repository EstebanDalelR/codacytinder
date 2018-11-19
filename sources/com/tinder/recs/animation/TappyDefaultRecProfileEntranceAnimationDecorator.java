package com.tinder.recs.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.p012a.p013a.C0745a;
import com.tinder.profile.view.ProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.LinearFloatInterpolator;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.LinearRectInterpolator;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig;
import com.tinder.recs.animation.RecProfileAnimationDecorator.State;
import com.tinder.recs.view.RecProfileView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/recs/animation/TappyDefaultRecProfileEntranceAnimationDecorator;", "Lcom/tinder/recs/animation/DefaultRecProfileEntranceAnimationDecorator;", "recProfileView", "Lcom/tinder/recs/view/RecProfileView;", "config", "Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderPhotoConfig;", "(Lcom/tinder/recs/view/RecProfileView;Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderPhotoConfig;)V", "ENTER_ANIMATION_DURATION_MS", "", "startAnimation", "", "AnimatorListenerInternal", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TappyDefaultRecProfileEntranceAnimationDecorator extends DefaultRecProfileEntranceAnimationDecorator {
    private final long ENTER_ANIMATION_DURATION_MS = 120;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/recs/animation/TappyDefaultRecProfileEntranceAnimationDecorator$AnimatorListenerInternal;", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/recs/animation/TappyDefaultRecProfileEntranceAnimationDecorator;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private final class AnimatorListenerInternal extends AnimatorListenerAdapter {
        public void onAnimationStart(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            super.onAnimationStart(animator);
            animator = TappyDefaultRecProfileEntranceAnimationDecorator.this.profileView;
            C2668g.a(animator, "profileView");
            animator.setVisibility(0);
            TappyDefaultRecProfileEntranceAnimationDecorator.this.recProfileView.getEntranceBackground().setVisibility(0);
            animator = TappyDefaultRecProfileEntranceAnimationDecorator.this.placeholderImageView;
            C2668g.a(animator, "placeholderImageView");
            animator.setVisibility(0);
            TappyDefaultRecProfileEntranceAnimationDecorator.this.notifyAnimationStart();
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            super.onAnimationEnd(animator);
            TappyDefaultRecProfileEntranceAnimationDecorator.this.recProfileView.getEntranceBackground().setVisibility(8);
            animator = TappyDefaultRecProfileEntranceAnimationDecorator.this.placeholderImageView;
            C2668g.a(animator, "placeholderImageView");
            animator.setVisibility(4);
            animator = TappyDefaultRecProfileEntranceAnimationDecorator.this.photosView;
            C2668g.a(animator, "photosView");
            animator.setVisibility(0);
            TappyDefaultRecProfileEntranceAnimationDecorator.this.profileView.setBackgroundColor(-1);
            TappyDefaultRecProfileEntranceAnimationDecorator.this.state = State.FINISHED;
            TappyDefaultRecProfileEntranceAnimationDecorator.this.notifyAnimationEnd();
        }
    }

    public TappyDefaultRecProfileEntranceAnimationDecorator(@NotNull RecProfileView<?> recProfileView, @NotNull PlaceholderPhotoConfig placeholderPhotoConfig) {
        C2668g.b(recProfileView, "recProfileView");
        C2668g.b(placeholderPhotoConfig, "config");
        super(recProfileView, placeholderPhotoConfig);
    }

    protected void startAnimation() {
        ProfileView profileView = this.profileView;
        C2668g.a(profileView, "profileView");
        View profilePhotosView = profileView.getProfilePhotosView();
        C2668g.a(profilePhotosView, "profileView.profilePhotosView");
        int width = profilePhotosView.getWidth();
        RecProfileView recProfileView = this.recProfileView;
        C2668g.a(recProfileView, "recProfileView");
        int height = recProfileView.getHeight() - width;
        ProfileView profileView2 = this.profileView;
        C2668g.a(profileView2, "profileView");
        float f = (float) height;
        profileView2.setTranslationY(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C2668g.a(ofFloat, "animator");
        ofFloat.setDuration(this.ENTER_ANIMATION_DURATION_MS);
        ofFloat.addListener(new AnimatorListenerInternal());
        ofFloat.setInterpolator(new DecelerateInterpolator());
        LinearFloatInterpolator linearFloatInterpolator = new LinearFloatInterpolator(f, 0.0f);
        LinearFloatInterpolator linearFloatInterpolator2 = new LinearFloatInterpolator(0.0f, 1.0f);
        Rect rect = new Rect(this.config.placeholderX(), this.config.placeholderY(), this.config.placeholderX() + this.config.placeholderWidth(), this.config.placeholderY() + this.config.placeholderHeight());
        Rect rect2 = new Rect(0, 0, width, width);
        ofFloat.addUpdateListener(new C14703x3d992518(this, linearFloatInterpolator, linearFloatInterpolator2, new LinearRectInterpolator(rect, rect2), new Rect(), new LinearFloatInterpolator(this.config.placeholderParallaxFactor(), 1.0f)));
        C0745a.a(ofFloat, null, new C18765x3d992519(this), null, null, 13, null);
        ofFloat.start();
    }
}
