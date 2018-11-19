package com.tinder.recs.animation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;
import com.tinder.profile.view.ProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.LinearFloatInterpolator;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.LinearRectInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.animation.TappyDefaultRecProfileEntranceAnimationDecorator$startAnimation$1 */
final class C14703x3d992518 implements AnimatorUpdateListener {
    final /* synthetic */ LinearFloatInterpolator $entranceBackgroundAlphaInterpolator;
    final /* synthetic */ LinearFloatInterpolator $parallaxInterpolator;
    final /* synthetic */ LinearRectInterpolator $placeholderImageViewRectInterpolator;
    final /* synthetic */ Rect $tempRect;
    final /* synthetic */ LinearFloatInterpolator $translationYInterpolator;
    final /* synthetic */ TappyDefaultRecProfileEntranceAnimationDecorator this$0;

    C14703x3d992518(TappyDefaultRecProfileEntranceAnimationDecorator tappyDefaultRecProfileEntranceAnimationDecorator, LinearFloatInterpolator linearFloatInterpolator, LinearFloatInterpolator linearFloatInterpolator2, LinearRectInterpolator linearRectInterpolator, Rect rect, LinearFloatInterpolator linearFloatInterpolator3) {
        this.this$0 = tappyDefaultRecProfileEntranceAnimationDecorator;
        this.$translationYInterpolator = linearFloatInterpolator;
        this.$entranceBackgroundAlphaInterpolator = linearFloatInterpolator2;
        this.$placeholderImageViewRectInterpolator = linearRectInterpolator;
        this.$tempRect = rect;
        this.$parallaxInterpolator = linearFloatInterpolator3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C2668g.a(valueAnimator, "animation");
        valueAnimator = valueAnimator.getAnimatedFraction();
        float value = this.$translationYInterpolator.getValue(valueAnimator);
        ProfileView profileView = this.this$0.profileView;
        C2668g.a(profileView, "profileView");
        profileView.setTranslationY(value);
        this.this$0.recProfileView.getEntranceBackground().setAlpha(this.$entranceBackgroundAlphaInterpolator.getValue(valueAnimator));
        this.$placeholderImageViewRectInterpolator.getValue(valueAnimator, this.$tempRect);
        this.this$0.placeholderImageView.updateSize((float) this.$tempRect.left, (float) this.$tempRect.top, this.$tempRect.width(), this.$tempRect.height(), this.$parallaxInterpolator.getValue(valueAnimator));
    }
}
