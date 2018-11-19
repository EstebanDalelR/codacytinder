package com.tinder.design.togglenavigationview.p230a;

import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010JB\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/tinder/design/togglenavigationview/renderer/CircularBackgroundRenderer;", "", "backgroundColor", "", "(I)V", "shapeDrawable", "Landroid/graphics/drawable/GradientDrawable;", "visible", "", "getVisible", "()Z", "setVisible", "(Z)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "width", "height", "radius", "insetLeft", "insetTop", "insetRight", "insetBottom", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.design.togglenavigationview.a.a */
public final class C8831a {
    /* renamed from: a */
    private boolean f30963a;
    /* renamed from: b */
    private final GradientDrawable f30964b;
    /* renamed from: c */
    private final int f30965c;

    public C8831a(int i) {
        this.f30965c = i;
        i = new GradientDrawable();
        i.setColor(this.f30965c);
        this.f30964b = i;
    }

    /* renamed from: a */
    public final void m37583a(boolean z) {
        this.f30963a = z;
    }

    /* renamed from: a */
    public static /* synthetic */ void m37580a(C8831a c8831a, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        c8831a.m37581a(i, i2, i3, i4, i5, (i8 & 32) != 0 ? i4 : i6, (i8 & 64) != 0 ? i5 : i7);
    }

    /* renamed from: a */
    public final void m37581a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f30964b.setBounds(i4, i5, i - i6, i2 - i7);
        this.f30964b.setCornerRadius((float) i3);
    }

    /* renamed from: a */
    public final void m37582a(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        if (this.f30963a) {
            this.f30964b.draw(canvas);
        }
    }
}
