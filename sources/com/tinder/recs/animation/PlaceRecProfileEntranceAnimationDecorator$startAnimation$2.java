package com.tinder.recs.animation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
final class PlaceRecProfileEntranceAnimationDecorator$startAnimation$2 implements AnimatorUpdateListener {
    final /* synthetic */ int $heightDelta;
    final /* synthetic */ float $parallaxDelta;
    final /* synthetic */ int $recProfileHeight;
    final /* synthetic */ int $widthDelta;
    final /* synthetic */ PlaceRecProfileEntranceAnimationDecorator this$0;

    PlaceRecProfileEntranceAnimationDecorator$startAnimation$2(PlaceRecProfileEntranceAnimationDecorator placeRecProfileEntranceAnimationDecorator, int i, int i2, float f, int i3) {
        this.this$0 = placeRecProfileEntranceAnimationDecorator;
        this.$widthDelta = i;
        this.$heightDelta = i2;
        this.$parallaxDelta = f;
        this.$recProfileHeight = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C2668g.a(valueAnimator, "it");
        valueAnimator = valueAnimator.getAnimatedValue();
        if (valueAnimator == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
        valueAnimator = ((Float) valueAnimator).floatValue();
        float f = ((float) 1) - valueAnimator;
        this.this$0.recProfileView.getEntranceBackground().setAlpha(valueAnimator);
        float placeholderX = ((float) this.this$0.config.placeholderX()) * f;
        float placeholderY = f * ((float) this.this$0.config.placeholderY());
        int placeholderWidth = (int) (((float) this.this$0.config.placeholderWidth()) + (((float) this.$widthDelta) * valueAnimator));
        int placeholderHeight = (int) (((float) this.this$0.config.placeholderHeight()) + (((float) this.$heightDelta) * valueAnimator));
        this.this$0.placeholderImageView.updateSize(placeholderX, placeholderY, placeholderWidth, placeholderHeight, (this.$parallaxDelta * f) + 1.0f);
        f = (((float) (this.$recProfileHeight - placeholderHeight)) * valueAnimator) + ((float) placeholderHeight);
        this.this$0.updateProfileSize(placeholderX, placeholderY, placeholderWidth, (int) f);
        if (((double) f) > ((double) this.this$0.config.placeholderHeight()) * 1.1d) {
            valueAnimator = this.this$0.profileView;
            C2668g.a(valueAnimator, "profileView");
            if (valueAnimator.getVisibility() != null) {
                valueAnimator = this.this$0.profileView;
                C2668g.a(valueAnimator, "profileView");
                valueAnimator.setVisibility(0);
            }
        }
    }
}
