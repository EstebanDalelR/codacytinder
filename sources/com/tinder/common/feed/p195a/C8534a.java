package com.tinder.common.feed.p195a;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/tinder/common/feed/utils/SpanConfig;", "", "color", "", "textSize", "(II)V", "getColor", "()I", "setColor", "(I)V", "getTextSize", "setTextSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.feed.a.a */
public final class C8534a {
    /* renamed from: a */
    private int f30281a;
    /* renamed from: b */
    private int f30282b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8534a) {
            C8534a c8534a = (C8534a) obj;
            if ((this.f30281a == c8534a.f30281a ? 1 : null) != null) {
                if ((this.f30282b == c8534a.f30282b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f30281a * 31) + this.f30282b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpanConfig(color=");
        stringBuilder.append(this.f30281a);
        stringBuilder.append(", textSize=");
        stringBuilder.append(this.f30282b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8534a(int i, int i2) {
        this.f30281a = i;
        this.f30282b = i2;
    }

    /* renamed from: a */
    public final int m36502a() {
        return this.f30281a;
    }

    /* renamed from: a */
    public final void m36503a(int i) {
        this.f30281a = i;
    }

    /* renamed from: b */
    public final int m36504b() {
        return this.f30282b;
    }
}
