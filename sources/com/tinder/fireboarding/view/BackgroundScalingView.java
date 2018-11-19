package com.tinder.fireboarding.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tinder.fireboarding.C9559a.C9553b;
import com.tinder.fireboarding.view.p256b.C9616a;
import com.tinder.utils.au;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J&\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020(J&\u0010,\u001a\u00020\"2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020(R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\u0018@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017¨\u0006-"}, d2 = {"Lcom/tinder/fireboarding/view/BackgroundScalingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bounds", "Landroid/graphics/Rect;", "raysDrawable", "Lcom/tinder/fireboarding/view/drawable/RaysDrawableWrapper;", "value", "", "raysDrawableVisible", "getRaysDrawableVisible", "()Z", "setRaysDrawableVisible", "(Z)V", "", "rotationDegreesRays", "getRotationDegreesRays", "()F", "setRotationDegreesRays", "(F)V", "Landroid/graphics/drawable/GradientDrawable;", "roundedCornerDrawable", "getRoundedCornerDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "setRoundedCornerDrawable", "(Landroid/graphics/drawable/GradientDrawable;)V", "translationRaysY", "getTranslationRaysY", "setTranslationRaysY", "drawRays", "", "canvas", "Landroid/graphics/Canvas;", "onDraw", "setRaysDrawableBounds", "left", "", "top", "right", "bottom", "updateBounds", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
public final class BackgroundScalingView extends FrameLayout {
    /* renamed from: a */
    private float f31970a;
    /* renamed from: b */
    private float f31971b;
    /* renamed from: c */
    private final Rect f31972c;
    /* renamed from: d */
    private final C9616a f31973d;
    @Nullable
    /* renamed from: e */
    private GradientDrawable f31974e;

    public /* synthetic */ BackgroundScalingView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public BackgroundScalingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f31972c = new Rect();
        this.f31973d = new C9616a(au.b(this, C9553b.fireboarding_rays));
        setWillNotDraw(null);
    }

    public final float getTranslationRaysY() {
        return this.f31970a;
    }

    public final void setTranslationRaysY(float f) {
        this.f31970a = f;
        invalidate();
    }

    public final float getRotationDegreesRays() {
        return this.f31971b;
    }

    public final void setRotationDegreesRays(float f) {
        this.f31971b = f;
        invalidate();
    }

    public final void setRaysDrawableVisible(boolean z) {
        if (this.f31973d.setVisible(z, false)) {
            invalidate();
        }
    }

    public final boolean getRaysDrawableVisible() {
        return this.f31973d.isVisible();
    }

    @Nullable
    public final GradientDrawable getRoundedCornerDrawable() {
        return this.f31974e;
    }

    public final void setRoundedCornerDrawable(@Nullable GradientDrawable gradientDrawable) {
        this.f31974e = gradientDrawable;
        invalidate();
    }

    /* renamed from: a */
    public final void m39874a(int i, int i2, int i3, int i4) {
        this.f31972c.set(i, i2, i3, i4);
        GradientDrawable gradientDrawable = this.f31974e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(i, i2, i3, i4);
        }
        invalidate();
    }

    /* renamed from: b */
    public final void m39875b(int i, int i2, int i3, int i4) {
        this.f31973d.setBounds(i, i2, i3, i4);
        invalidate();
    }

    protected void onDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        GradientDrawable gradientDrawable = this.f31974e;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        if (getRaysDrawableVisible()) {
            m39873a(canvas);
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private final void m39873a(Canvas canvas) {
        canvas.clipRect(this.f31972c);
        int save = canvas.save();
        Rect bounds = this.f31973d.getBounds();
        float f = (float) 2;
        float f2 = ((float) (bounds.left + bounds.right)) / f;
        float f3 = ((float) (bounds.top + bounds.bottom)) / f;
        canvas.translate(f2, this.f31970a + f3);
        canvas.rotate(this.f31971b);
        canvas.translate(-f2, -f3);
        this.f31973d.draw(canvas);
        canvas.restoreToCount(save);
    }
}
