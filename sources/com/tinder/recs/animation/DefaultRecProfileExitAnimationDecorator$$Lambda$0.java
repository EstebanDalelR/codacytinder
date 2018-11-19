package com.tinder.recs.animation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;
import android.view.View;
import com.tinder.profile.view.ProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.LinearFloatInterpolator;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.LinearRectInterpolator;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderImageView;

final /* synthetic */ class DefaultRecProfileExitAnimationDecorator$$Lambda$0 implements AnimatorUpdateListener {
    private final LinearFloatInterpolator arg$1;
    private final ProfileView arg$2;
    private final View arg$3;
    private final LinearFloatInterpolator arg$4;
    private final LinearRectInterpolator arg$5;
    private final Rect arg$6;
    private final LinearFloatInterpolator arg$7;
    private final PlaceholderImageView arg$8;

    DefaultRecProfileExitAnimationDecorator$$Lambda$0(LinearFloatInterpolator linearFloatInterpolator, ProfileView profileView, View view, LinearFloatInterpolator linearFloatInterpolator2, LinearRectInterpolator linearRectInterpolator, Rect rect, LinearFloatInterpolator linearFloatInterpolator3, PlaceholderImageView placeholderImageView) {
        this.arg$1 = linearFloatInterpolator;
        this.arg$2 = profileView;
        this.arg$3 = view;
        this.arg$4 = linearFloatInterpolator2;
        this.arg$5 = linearRectInterpolator;
        this.arg$6 = rect;
        this.arg$7 = linearFloatInterpolator3;
        this.arg$8 = placeholderImageView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        DefaultRecProfileExitAnimationDecorator.lambda$animate$0$DefaultRecProfileExitAnimationDecorator(this.arg$1, this.arg$2, this.arg$3, this.arg$4, this.arg$5, this.arg$6, this.arg$7, this.arg$8, valueAnimator);
    }
}
