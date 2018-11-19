package com.tinder.reactions.drawer.p392c;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/reactions/drawer/transformer/HeightLayoutTransformer;", "", "minHeight", "", "maxHeight", "(II)V", "HEIGHT_MULTIPLIER", "calculateNewHeight", "progress", "", "setNewHeight", "", "view", "Landroid/view/View;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.c.b */
public final class C14626b {
    /* renamed from: a */
    private final int f46135a = 2;
    /* renamed from: b */
    private final int f46136b;
    /* renamed from: c */
    private final int f46137c;

    public C14626b(int i, int i2) {
        this.f46136b = i;
        this.f46137c = i2;
    }

    /* renamed from: a */
    public final void m55792a(float f, @NotNull View view) {
        C2668g.b(view, "view");
        int a = m55791a(f);
        view.getLayoutParams().height = a;
        if (a == this.f46136b || a == this.f46137c) {
            view.requestLayout();
        }
    }

    /* renamed from: a */
    private final int m55791a(float f) {
        int i = (int) (((float) this.f46136b) + ((((float) (this.f46137c - this.f46136b)) * f) * ((float) this.f46135a)));
        if (i > this.f46137c) {
            return this.f46137c;
        }
        return i < this.f46136b ? this.f46136b : i;
    }
}
