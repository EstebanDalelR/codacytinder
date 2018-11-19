package com.tinder.design.togglenavigationview.p230a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\nJ\u001e\u0010!\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\"\u001a\u00020\nJ\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010&\u001a\u00020\nJ\u0006\u0010\u0019\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/design/togglenavigationview/renderer/SelectedSegmentBackgroundRenderer;", "", "layerColors", "", "layersPaddingPx", "", "([IF)V", "bounds", "Landroid/graphics/Rect;", "centerX", "", "height", "layerDrawable", "Landroid/graphics/drawable/LayerDrawable;", "layers", "", "Landroid/graphics/drawable/GradientDrawable;", "[Landroid/graphics/drawable/GradientDrawable;", "radius", "visible", "", "getVisible", "()Z", "setVisible", "(Z)V", "width", "bottom", "draw", "", "canvas", "Landroid/graphics/Canvas;", "layerCount", "left", "onSizeChanged", "right", "scroll", "dx", "setCenterX", "top", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.design.togglenavigationview.a.b */
public final class C8832b {
    /* renamed from: a */
    private final GradientDrawable[] f30966a;
    /* renamed from: b */
    private boolean f30967b;
    /* renamed from: c */
    private final LayerDrawable f30968c;
    /* renamed from: d */
    private final Rect f30969d;
    /* renamed from: e */
    private int f30970e;
    /* renamed from: f */
    private int f30971f;
    /* renamed from: g */
    private int f30972g;
    /* renamed from: h */
    private int f30973h;
    /* renamed from: i */
    private final int[] f30974i;
    /* renamed from: j */
    private final float f30975j;

    public C8832b(@NotNull int[] iArr, float f) {
        C2668g.b(iArr, "layerColors");
        this.f30974i = iArr;
        this.f30975j = f;
        iArr = new GradientDrawable[this.f30974i.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(this.f30974i[i]);
            iArr[i] = gradientDrawable;
        }
        this.f30966a = iArr;
        this.f30968c = new LayerDrawable((Drawable[]) this.f30966a);
        this.f30969d = new Rect();
    }

    /* renamed from: a */
    public final void m37588a(boolean z) {
        this.f30967b = z;
    }

    /* renamed from: a */
    public final void m37586a(int i, int i2, int i3) {
        GradientDrawable[] gradientDrawableArr = this.f30966a;
        int length = gradientDrawableArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i5 + 1;
            gradientDrawableArr[i4].setCornerRadius((float) i3);
            int i7 = i6 * ((int) this.f30975j);
            this.f30968c.setLayerInset(i5, i7, i7, i7, i7);
            i4++;
            i5 = i6;
        }
        this.f30972g = i3;
        this.f30970e = i;
        this.f30971f = i2;
    }

    /* renamed from: a */
    public final void m37587a(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        if (this.f30967b) {
            this.f30968c.setBounds(this.f30969d);
            this.f30968c.draw(canvas);
        }
    }

    /* renamed from: a */
    public final void m37585a(int i) {
        this.f30973h = i;
        int i2 = this.f30971f / 2;
        int i3 = i2 - (this.f30971f / 2);
        this.f30969d.set(i - this.f30972g, i3, i + this.f30972g, i2 + (this.f30971f / 2));
    }

    /* renamed from: b */
    public final void m37590b(int i) {
        Rect rect = this.f30969d;
        rect.left += i;
        rect = this.f30969d;
        rect.right += i;
    }

    /* renamed from: a */
    public final int m37584a() {
        return this.f30968c.getNumberOfLayers();
    }

    /* renamed from: b */
    public final int m37589b() {
        return this.f30969d.left;
    }

    /* renamed from: c */
    public final int m37591c() {
        return this.f30969d.right;
    }

    /* renamed from: d */
    public final int m37592d() {
        return this.f30969d.top;
    }

    /* renamed from: e */
    public final int m37593e() {
        return this.f30969d.bottom;
    }

    /* renamed from: f */
    public final int m37594f() {
        return m37591c() - m37589b();
    }
}
