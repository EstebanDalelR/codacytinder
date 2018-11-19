package com.tinder.superlikeable.view.p425a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0003J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005J\u0012\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/superlikeable/view/drawable/RoundedCornerDrawable;", "Landroid/graphics/drawable/Drawable;", "backgroundColor", "", "radius", "", "(IF)V", "bounds", "Landroid/graphics/RectF;", "paint", "Landroid/graphics/Paint;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "onBoundsChange", "Landroid/graphics/Rect;", "setAlpha", "alpha", "setBackground", "color", "setColor", "setColorFilter", "cf", "Landroid/graphics/ColorFilter;", "setRadius", "updateBounds", "givenBounds", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.view.a.a */
public final class C15171a extends Drawable {
    /* renamed from: a */
    private final Paint f47195a = new Paint(5);
    /* renamed from: b */
    private final RectF f47196b = new RectF();
    /* renamed from: c */
    private float f47197c;

    public int getOpacity() {
        return -3;
    }

    public C15171a(int i, float f) {
        this.f47197c = f;
        m57054a(i);
    }

    public void draw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        canvas.drawRoundRect(this.f47196b, this.f47197c, this.f47197c, this.f47195a);
    }

    protected void onBoundsChange(@NotNull Rect rect) {
        C2668g.b(rect, "bounds");
        super.onBoundsChange(rect);
        m57055a(rect);
    }

    public void setAlpha(int i) {
        this.f47195a.setAlpha(i);
    }

    public void setColorFilter(@NotNull ColorFilter colorFilter) {
        C2668g.b(colorFilter, "cf");
        this.f47195a.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    private final void m57054a(int i) {
        this.f47195a.setColor(i);
    }

    /* renamed from: a */
    private final void m57055a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        if (rect != null) {
            this.f47196b.set(rect);
        }
    }
}
