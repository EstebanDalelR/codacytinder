package com.tinder.places.carousel.p309a;

import android.support.v7.widget.RecyclerView.State;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0004H\u0002J \u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¨\u0006\u0019"}, d2 = {"Lcom/tinder/places/carousel/util/ScrollCalculator;", "", "()V", "calculateNeededScroll", "", "diff", "scrollOffset", "maxOffset", "scrollItemSize", "freeScrolling", "", "calculateScrollForPosition", "itemPosition", "state", "Landroid/support/v7/widget/RecyclerView$State;", "didScrollMoreThanOne", "newPosRaw", "", "oldPosRaw", "getMinOrActualNegative", "value", "getMinOrActualPositive", "getResultScrollBasedOnSign", "sign", "getScrollPositionOnOffset", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.carousel.a.b */
public final class C10190b {
    /* renamed from: a */
    private final float m41469a(int i, int i2, int i3) {
        return i2 == 0 ? 0.0f : (((float) i) * 1.0f) / ((float) i3);
    }

    /* renamed from: a */
    public final int m41474a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i2 + i;
        if (-400 > i5) {
            return 0;
        }
        if (i5 > i3 + 800) {
            return i3 - i2;
        }
        float a = m41469a(i5, i3, i4);
        i2 = m41469a(i2, i3, i4);
        return (m41472a(a, i2) == 0 || z) ? i : m41471a(Math.signum((float) i), a, i2, i4);
    }

    /* renamed from: a */
    public final int m41475a(int i, @NotNull State state, int i2) {
        C2668g.b(state, "state");
        state = state.getItemCount();
        if (i >= state) {
            i = state - 1;
        }
        return i * i2;
    }

    /* renamed from: a */
    private final boolean m41472a(float f, float f2) {
        return Math.abs(((int) f) - ((int) f2)) >= Float.MIN_VALUE;
    }

    /* renamed from: a */
    private final int m41471a(float f, float f2, float f3, int i) {
        if (f >= ((float) 0)) {
            return m41470a((f * (((float) ((int) f2)) - f3)) * ((float) i));
        }
        return m41473b((f * (((float) ((int) f3)) - f2)) * ((float) i));
    }

    /* renamed from: a */
    private final int m41470a(float f) {
        return f < ((float) 1) ? (int) Math.ceil((double) f) : (int) f;
    }

    /* renamed from: b */
    private final int m41473b(float f) {
        return Math.abs(f) < ((float) 1) ? (int) Math.floor((double) f) : (int) f;
    }
}
