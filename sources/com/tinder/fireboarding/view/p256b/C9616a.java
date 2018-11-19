package com.tinder.fireboarding.view.p256b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/fireboarding/view/drawable/RaysDrawableWrapper;", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "", "setAlpha", "alpha", "setBounds", "left", "top", "right", "bottom", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.b.a */
public final class C9616a extends Drawable {
    /* renamed from: a */
    private final Drawable f32129a;

    public C9616a(@NotNull Drawable drawable) {
        C2668g.b(drawable, "drawable");
        this.f32129a = drawable;
    }

    public void draw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        this.f32129a.draw(canvas);
    }

    public void setAlpha(int i) {
        this.f32129a.setAlpha(i);
    }

    public int getOpacity() {
        return this.f32129a.getOpacity();
    }

    public void setColorFilter(@NotNull ColorFilter colorFilter) {
        C2668g.b(colorFilter, "colorFilter");
        this.f32129a.setColorFilter(colorFilter);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        int i5 = (i + i3) / 2;
        int i6 = (i2 + i4) / 2;
        i = (int) (((float) Math.max(i3 - i, i4 - i2)) * 1060320051);
        i2 = i5 - i;
        i5 += i;
        i3 = i6 - i;
        i6 += i;
        this.f32129a.setBounds(i2, i3, i5, i6);
        super.setBounds(i2, i3, i5, i6);
    }
}
