package com.tinder.base.p173c;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/base/extension/LocationOnScreen;", "", "left", "", "top", "(II)V", "getLeft", "()I", "getTop", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "base_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.base.c.a */
public final class C8302a {
    /* renamed from: a */
    private final int f29575a;
    /* renamed from: b */
    private final int f29576b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8302a) {
            C8302a c8302a = (C8302a) obj;
            if ((this.f29575a == c8302a.f29575a ? 1 : null) != null) {
                if ((this.f29576b == c8302a.f29576b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f29575a * 31) + this.f29576b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocationOnScreen(left=");
        stringBuilder.append(this.f29575a);
        stringBuilder.append(", top=");
        stringBuilder.append(this.f29576b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8302a(int i, int i2) {
        this.f29575a = i;
        this.f29576b = i2;
    }

    /* renamed from: a */
    public final int m35393a() {
        return this.f29575a;
    }

    /* renamed from: b */
    public final int m35394b() {
        return this.f29576b;
    }
}
