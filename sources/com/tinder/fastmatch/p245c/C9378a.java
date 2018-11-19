package com.tinder.fastmatch.p245c;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tinder/fastmatch/model/FastMatchSession;", "", "numberOfSwipes", "", "numberOfLikes", "duration", "(III)V", "getDuration", "()I", "getNumberOfLikes", "getNumberOfSwipes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.c.a */
public final class C9378a {
    /* renamed from: a */
    private final int f31460a;
    /* renamed from: b */
    private final int f31461b;
    /* renamed from: c */
    private final int f31462c;

    public C9378a() {
        this(0, 0, 0, 7, null);
    }

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C9378a m39272a(C9378a c9378a, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = c9378a.f31460a;
        }
        if ((i4 & 2) != 0) {
            i2 = c9378a.f31461b;
        }
        if ((i4 & 4) != 0) {
            i3 = c9378a.f31462c;
        }
        return c9378a.m39274a(i, i2, i3);
    }

    @NotNull
    /* renamed from: a */
    public final C9378a m39274a(int i, int i2, int i3) {
        return new C9378a(i, i2, i3);
    }

    /* renamed from: d */
    public final int m39277d() {
        return this.f31460a;
    }

    /* renamed from: e */
    public final int m39278e() {
        return this.f31461b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9378a) {
            C9378a c9378a = (C9378a) obj;
            if ((this.f31460a == c9378a.f31460a ? 1 : null) != null) {
                if ((this.f31461b == c9378a.f31461b ? 1 : null) != null) {
                    if ((this.f31462c == c9378a.f31462c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f31460a * 31) + this.f31461b) * 31) + this.f31462c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchSession(numberOfSwipes=");
        stringBuilder.append(this.f31460a);
        stringBuilder.append(", numberOfLikes=");
        stringBuilder.append(this.f31461b);
        stringBuilder.append(", duration=");
        stringBuilder.append(this.f31462c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9378a(int i, int i2, int i3) {
        this.f31460a = i;
        this.f31461b = i2;
        this.f31462c = i3;
    }

    public /* synthetic */ C9378a(int i, int i2, int i3, int i4, C15823e c15823e) {
        if ((i4 & 1) != null) {
            i = 0;
        }
        if ((i4 & 2) != null) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        this(i, i2, i3);
    }

    /* renamed from: a */
    public final int m39273a() {
        return this.f31460a;
    }

    /* renamed from: b */
    public final int m39275b() {
        return this.f31461b;
    }

    /* renamed from: c */
    public final int m39276c() {
        return this.f31462c;
    }
}
