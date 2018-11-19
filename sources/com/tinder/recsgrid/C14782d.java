package com.tinder.recsgrid;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/recsgrid/RecPrefetcher;", "", "fetchInterval", "", "threshold", "", "(FI)V", "calculatePrefetchDistance", "progress", "numOfRecs", "shouldPrefetch", "", "velocity", "recs-grid_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsgrid.d */
public final class C14782d {
    /* renamed from: a */
    private final float f46354a;
    /* renamed from: b */
    private final int f46355b;

    public C14782d(float f, int i) {
        this.f46354a = f;
        this.f46355b = i;
    }

    /* renamed from: a */
    public final boolean m56056a(float f, float f2, int i) {
        f2 *= (float) i;
        boolean z = false;
        float f3 = (float) null;
        if (f2 <= f3) {
            return false;
        }
        f = m56055a(f, this.f46355b, i) / f2;
        if (f3 <= f && f < this.f46354a) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private final float m56055a(float f, int i, int i2) {
        return Math.max(0.0f, ((1.0f - f) * ((float) i2)) - ((float) i));
    }
}
