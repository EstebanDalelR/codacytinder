package com.tinder.recsads.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.tinder.recsads.C14760n.C14757c;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/recsads/view/ArrowAnimationDrawableImageView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animationDrawable", "Landroid/graphics/drawable/AnimationDrawable;", "onAttachedToWindow", "", "onDetachedFromWindow", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class ArrowAnimationDrawableImageView extends ImageView {
    /* renamed from: a */
    private final AnimationDrawable f46324a = new AnimationDrawable();

    public ArrowAnimationDrawableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f46324a.addFrame(C0432b.a(context, C14757c.group_arrows_step_0), MapboxConstants.ANIMATION_DURATION);
        this.f46324a.addFrame(C0432b.a(context, C14757c.group_arrows_step_1), MapboxConstants.ANIMATION_DURATION);
        this.f46324a.addFrame(C0432b.a(context, C14757c.group_arrows_step_2), MapboxConstants.ANIMATION_DURATION);
        this.f46324a.addFrame(C0432b.a(context, C14757c.group_arrows_step_3), MapboxConstants.ANIMATION_DURATION);
        this.f46324a.setOneShot(null);
        setImageDrawable((Drawable) this.f46324a);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46324a.start();
    }

    protected void onDetachedFromWindow() {
        this.f46324a.stop();
        super.onDetachedFromWindow();
    }
}
