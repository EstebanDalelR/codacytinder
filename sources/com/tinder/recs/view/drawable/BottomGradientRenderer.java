package com.tinder.recs.view.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0012J\u0018\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\n@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/tinder/recs/view/drawable/BottomGradientRenderer;", "", "()V", "bottomGradientDrawableCache", "Lcom/tinder/recs/view/drawable/BottomGradientDrawableCache;", "getBottomGradientDrawableCache", "()Lcom/tinder/recs/view/drawable/BottomGradientDrawableCache;", "setBottomGradientDrawableCache", "(Lcom/tinder/recs/view/drawable/BottomGradientDrawableCache;)V", "color", "", "getColor", "()I", "setColor", "(I)V", "drawable", "Landroid/graphics/drawable/GradientDrawable;", "top", "", "visibility", "getVisibility", "setVisibility", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setDimensions", "drawableWidth", "drawableHeight", "containerHeight", "updateDrawableDimensions", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class BottomGradientRenderer {
    @Inject
    @NotNull
    public BottomGradientDrawableCache bottomGradientDrawableCache;
    private int color;
    private GradientDrawable drawable;
    private float top;
    private int visibility;

    public final int getVisibility() {
        return this.visibility;
    }

    public final void setVisibility(int i) {
        this.visibility = i;
    }

    @NotNull
    public final BottomGradientDrawableCache getBottomGradientDrawableCache() {
        BottomGradientDrawableCache bottomGradientDrawableCache = this.bottomGradientDrawableCache;
        if (bottomGradientDrawableCache == null) {
            C2668g.b("bottomGradientDrawableCache");
        }
        return bottomGradientDrawableCache;
    }

    public final void setBottomGradientDrawableCache(@NotNull BottomGradientDrawableCache bottomGradientDrawableCache) {
        C2668g.b(bottomGradientDrawableCache, "<set-?>");
        this.bottomGradientDrawableCache = bottomGradientDrawableCache;
    }

    public final int getColor() {
        return this.color;
    }

    public final void setColor(@ColorInt int i) {
        this.color = i;
        BottomGradientDrawableCache bottomGradientDrawableCache = this.bottomGradientDrawableCache;
        if (bottomGradientDrawableCache == null) {
            C2668g.b("bottomGradientDrawableCache");
        }
        this.drawable = bottomGradientDrawableCache.get(i);
    }

    public final void setDimensions(int i, int i2, float f) {
        this.top = Math.max(0.0f, f - ((float) i2));
        updateDrawableDimensions(i, i2);
    }

    public final void draw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        if (this.visibility == 0) {
            int save = canvas.save();
            canvas.translate(0.0f, this.top);
            GradientDrawable gradientDrawable = this.drawable;
            if (gradientDrawable != null) {
                gradientDrawable.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    private final void updateDrawableDimensions(int i, int i2) {
        GradientDrawable gradientDrawable = this.drawable;
        if (gradientDrawable != null) {
            gradientDrawable.setSize(i, i2);
        }
        gradientDrawable = this.drawable;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, i, i2);
        }
    }
}
