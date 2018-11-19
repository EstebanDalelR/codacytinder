package com.tinder.recs.view.nativevideos;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.tinder.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/recs/view/nativevideos/ArrowAnimationDrawableImageView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animationDrawable", "Landroid/graphics/drawable/AnimationDrawable;", "onAttachedToWindow", "", "onDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ArrowAnimationDrawableImageView extends ImageView {
    private HashMap _$_findViewCache;
    private final AnimationDrawable animationDrawable = new AnimationDrawable();

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), view);
        return view;
    }

    public ArrowAnimationDrawableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.animationDrawable.addFrame(C0432b.a(context, R.drawable.group_arrows_step_0), MapboxConstants.ANIMATION_DURATION);
        this.animationDrawable.addFrame(C0432b.a(context, R.drawable.group_arrows_step_1), MapboxConstants.ANIMATION_DURATION);
        this.animationDrawable.addFrame(C0432b.a(context, R.drawable.group_arrows_step_2), MapboxConstants.ANIMATION_DURATION);
        this.animationDrawable.addFrame(C0432b.a(context, R.drawable.group_arrows_step_3), MapboxConstants.ANIMATION_DURATION);
        this.animationDrawable.setOneShot(null);
        setImageDrawable((Drawable) this.animationDrawable);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.animationDrawable.start();
    }

    protected void onDetachedFromWindow() {
        this.animationDrawable.stop();
        super.onDetachedFromWindow();
    }
}
