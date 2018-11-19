package com.tinder.recs.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.tinder.profile.view.ProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderImageView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig;
import com.tinder.recs.view.RecProfileView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0014J(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/tinder/recs/animation/PlaceRecProfileEntranceAnimationDecorator;", "Lcom/tinder/recs/animation/DefaultRecProfileEntranceAnimationDecorator;", "recProfileView", "Lcom/tinder/recs/view/RecProfileView;", "config", "Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderPhotoConfig;", "(Lcom/tinder/recs/view/RecProfileView;Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderPhotoConfig;)V", "animatorSet", "Landroid/animation/AnimatorSet;", "gamepad", "Landroid/view/View;", "getGamepad", "()Landroid/view/View;", "getFadeInAnimation", "setupPlaceholder", "", "startAnimation", "startArrowDownButtonAnimation", "updateProfileSize", "x", "", "y", "width", "", "height", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceRecProfileEntranceAnimationDecorator extends DefaultRecProfileEntranceAnimationDecorator {
    private AnimatorSet animatorSet;
    @Nullable
    private final View gamepad;

    public PlaceRecProfileEntranceAnimationDecorator(@NotNull RecProfileView<?> recProfileView, @NotNull PlaceholderPhotoConfig placeholderPhotoConfig) {
        C2668g.b(recProfileView, "recProfileView");
        C2668g.b(placeholderPhotoConfig, "config");
        super(recProfileView, placeholderPhotoConfig);
        this.gamepad = recProfileView.getGamepadView();
        recProfileView = this.gamepad;
        if (recProfileView != null) {
            recProfileView.setAlpha(null);
        }
        recProfileView = this.profileView;
        C2668g.a(recProfileView, "profileView");
        recProfileView.setVisibility(4);
    }

    @Nullable
    public final View getGamepad() {
        return this.gamepad;
    }

    protected void setupPlaceholder() {
        PlaceholderImageView placeholderImageView = this.placeholderImageView;
        C2668g.a(placeholderImageView, "placeholderImageView");
        ViewParent parent = placeholderImageView.getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.removeView(this.placeholderImageView);
        viewGroup.addView(this.placeholderImageView);
        placeholderImageView = this.placeholderImageView;
        C2668g.a(placeholderImageView, "placeholderImageView");
        placeholderImageView.setAlpha(1.0f);
        super.setupPlaceholder();
    }

    protected void startArrowDownButtonAnimation() {
        ProfileView profileView = this.profileView;
        C2668g.a(profileView, "profileView");
        View downArrowView = profileView.getDownArrowView();
        if (downArrowView != null) {
            downArrowView.setAlpha(0.0f);
        }
    }

    protected void startAnimation() {
        ProfileView profileView = this.profileView;
        C2668g.a(profileView, "profileView");
        View profilePhotosView = profileView.getProfilePhotosView();
        C2668g.a(profilePhotosView, "profileView.profilePhotosView");
        int width = profilePhotosView.getWidth();
        int placeholderWidth = width - this.config.placeholderWidth();
        int placeholderHeight = width - this.config.placeholderHeight();
        float placeholderParallaxFactor = this.config.placeholderParallaxFactor() - 1.0f;
        RecProfileView recProfileView = this.recProfileView;
        C2668g.a(recProfileView, "recProfileView");
        int height = recProfileView.getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C2668g.a(ofFloat, "profileOpenAnimation");
        ofFloat.setDuration(200);
        ofFloat.addListener(new PlaceRecProfileEntranceAnimationDecorator$startAnimation$1(this));
        ofFloat.addUpdateListener(new PlaceRecProfileEntranceAnimationDecorator$startAnimation$2(this, placeholderWidth, placeholderHeight, placeholderParallaxFactor, height));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, getFadeInAnimation()});
        animatorSet.start();
        this.animatorSet = animatorSet;
    }

    private final AnimatorSet getFadeInAnimation() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.gamepad, "alpha", new float[]{1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.placeholderImageView, "alpha", new float[]{0.0f});
        ProfileView profileView = this.profileView;
        C2668g.a(profileView, "profileView");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(profileView.getDownArrowView(), "alpha", new float[]{1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(100);
        animatorSet.setStartDelay(180);
        animatorSet.addListener(new C16393x21311227(this, ofFloat, ofFloat2, ofFloat3));
        return animatorSet;
    }

    private final void updateProfileSize(float f, float f2, int i, int i2) {
        ProfileView profileView = this.profileView;
        C2668g.a(profileView, "profileView");
        LayoutParams layoutParams = profileView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        i = this.profileView;
        C2668g.a(i, "profileView");
        i.setLayoutParams(layoutParams);
        i = this.profileView;
        C2668g.a(i, "profileView");
        i.setTranslationX(f);
        f = this.profileView;
        C2668g.a(f, "profileView");
        f.setTranslationY(f2);
    }
}
