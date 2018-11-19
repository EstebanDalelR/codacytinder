package com.tinder.reactions.drawer.p392c;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/reactions/drawer/transformer/AlphaTransformer;", "", "minAlpha", "", "maxAlpha", "threshold", "multiplier", "", "(FFFI)V", "calculateNeAlpha", "progress", "setNewAlpha", "", "view", "Landroid/view/View;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.c.a */
public final class C14625a {
    /* renamed from: a */
    private final float f46131a;
    /* renamed from: b */
    private final float f46132b;
    /* renamed from: c */
    private final float f46133c;
    /* renamed from: d */
    private final int f46134d;

    public C14625a(float f, float f2, float f3, int i) {
        this.f46131a = f;
        this.f46132b = f2;
        this.f46133c = f3;
        this.f46134d = i;
    }

    /* renamed from: a */
    public final void m55790a(float f, @NotNull View view) {
        C2668g.b(view, "view");
        view.setAlpha(m55789a(f));
    }

    /* renamed from: a */
    private final float m55789a(float f) {
        if (f > this.f46132b) {
            return this.f46132b;
        }
        if (f < this.f46133c) {
            return this.f46131a;
        }
        return (f - this.f46133c) * ((float) this.f46134d);
    }
}
