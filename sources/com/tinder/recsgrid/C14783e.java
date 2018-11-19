package com.tinder.recsgrid;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/recsgrid/ScrollStatus;", "", "progress", "", "velocity", "(FF)V", "getProgress", "()F", "getVelocity", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "recs-grid_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsgrid.e */
public final class C14783e {
    /* renamed from: a */
    private final float f46356a;
    /* renamed from: b */
    private final float f46357b;

    public C14783e() {
        this(0.0f, 0.0f, 3, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14783e) {
                C14783e c14783e = (C14783e) obj;
                if (Float.compare(this.f46356a, c14783e.f46356a) == 0 && Float.compare(this.f46357b, c14783e.f46357b) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f46356a) * 31) + Float.floatToIntBits(this.f46357b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ScrollStatus(progress=");
        stringBuilder.append(this.f46356a);
        stringBuilder.append(", velocity=");
        stringBuilder.append(this.f46357b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14783e(float f, float f2) {
        this.f46356a = f;
        this.f46357b = f2;
    }

    public /* synthetic */ C14783e(float f, float f2, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        this(f, f2);
    }

    /* renamed from: a */
    public final float m56057a() {
        return this.f46356a;
    }

    /* renamed from: b */
    public final float m56058b() {
        return this.f46357b;
    }
}
