package com.tinder.feed.analytics.session;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/tinder/feed/analytics/session/FeedItemsSessionInfo;", "", "numActivitiesViewed", "", "numActivitiesTotal", "numFetches", "numActivitiesFetched", "numOtherIdInActivitiesFetched", "numOtherIdInActivitiesViewed", "(IIIIII)V", "getNumActivitiesFetched", "()I", "getNumActivitiesTotal", "getNumActivitiesViewed", "getNumFetches", "getNumOtherIdInActivitiesFetched", "getNumOtherIdInActivitiesViewed", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.c */
public final class C9443c {
    /* renamed from: a */
    private final int f31641a;
    /* renamed from: b */
    private final int f31642b;
    /* renamed from: c */
    private final int f31643c;
    /* renamed from: d */
    private final int f31644d;
    /* renamed from: e */
    private final int f31645e;
    /* renamed from: f */
    private final int f31646f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9443c) {
            C9443c c9443c = (C9443c) obj;
            if ((this.f31641a == c9443c.f31641a ? 1 : null) != null) {
                if ((this.f31642b == c9443c.f31642b ? 1 : null) != null) {
                    if ((this.f31643c == c9443c.f31643c ? 1 : null) != null) {
                        if ((this.f31644d == c9443c.f31644d ? 1 : null) != null) {
                            if ((this.f31645e == c9443c.f31645e ? 1 : null) != null) {
                                if ((this.f31646f == c9443c.f31646f ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f31641a * 31) + this.f31642b) * 31) + this.f31643c) * 31) + this.f31644d) * 31) + this.f31645e) * 31) + this.f31646f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedItemsSessionInfo(numActivitiesViewed=");
        stringBuilder.append(this.f31641a);
        stringBuilder.append(", numActivitiesTotal=");
        stringBuilder.append(this.f31642b);
        stringBuilder.append(", numFetches=");
        stringBuilder.append(this.f31643c);
        stringBuilder.append(", numActivitiesFetched=");
        stringBuilder.append(this.f31644d);
        stringBuilder.append(", numOtherIdInActivitiesFetched=");
        stringBuilder.append(this.f31645e);
        stringBuilder.append(", numOtherIdInActivitiesViewed=");
        stringBuilder.append(this.f31646f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9443c(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f31641a = i;
        this.f31642b = i2;
        this.f31643c = i3;
        this.f31644d = i4;
        this.f31645e = i5;
        this.f31646f = i6;
    }

    /* renamed from: a */
    public final int m39480a() {
        return this.f31641a;
    }

    /* renamed from: b */
    public final int m39481b() {
        return this.f31642b;
    }

    /* renamed from: c */
    public final int m39482c() {
        return this.f31643c;
    }

    /* renamed from: d */
    public final int m39483d() {
        return this.f31644d;
    }

    /* renamed from: e */
    public final int m39484e() {
        return this.f31645e;
    }

    /* renamed from: f */
    public final int m39485f() {
        return this.f31646f;
    }
}
