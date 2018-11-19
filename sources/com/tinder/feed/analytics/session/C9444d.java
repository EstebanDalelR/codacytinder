package com.tinder.feed.analytics.session;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/tinder/feed/analytics/session/FeedPositionInfo;", "", "firstItemPositionOnStart", "", "lastItemPositionOnEnd", "minItemPositionForSession", "maxItemPositionForSession", "(IIII)V", "getFirstItemPositionOnStart", "()I", "getLastItemPositionOnEnd", "getMaxItemPositionForSession", "getMinItemPositionForSession", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.d */
public final class C9444d {
    /* renamed from: a */
    private final int f31647a;
    /* renamed from: b */
    private final int f31648b;
    /* renamed from: c */
    private final int f31649c;
    /* renamed from: d */
    private final int f31650d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9444d) {
            C9444d c9444d = (C9444d) obj;
            if ((this.f31647a == c9444d.f31647a ? 1 : null) != null) {
                if ((this.f31648b == c9444d.f31648b ? 1 : null) != null) {
                    if ((this.f31649c == c9444d.f31649c ? 1 : null) != null) {
                        if ((this.f31650d == c9444d.f31650d ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f31647a * 31) + this.f31648b) * 31) + this.f31649c) * 31) + this.f31650d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedPositionInfo(firstItemPositionOnStart=");
        stringBuilder.append(this.f31647a);
        stringBuilder.append(", lastItemPositionOnEnd=");
        stringBuilder.append(this.f31648b);
        stringBuilder.append(", minItemPositionForSession=");
        stringBuilder.append(this.f31649c);
        stringBuilder.append(", maxItemPositionForSession=");
        stringBuilder.append(this.f31650d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9444d(int i, int i2, int i3, int i4) {
        this.f31647a = i;
        this.f31648b = i2;
        this.f31649c = i3;
        this.f31650d = i4;
    }

    /* renamed from: a */
    public final int m39486a() {
        return this.f31647a;
    }

    /* renamed from: b */
    public final int m39487b() {
        return this.f31648b;
    }

    /* renamed from: c */
    public final int m39488c() {
        return this.f31649c;
    }

    /* renamed from: d */
    public final int m39489d() {
        return this.f31650d;
    }
}
