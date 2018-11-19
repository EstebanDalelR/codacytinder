package com.tinder.fireboarding.view;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/tinder/fireboarding/view/ViewBounds;", "", "left", "", "top", "height", "width", "right", "bottom", "(IIIIII)V", "getBottom", "()I", "getHeight", "getLeft", "getRight", "getTop", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.a */
public final class C9571a {
    /* renamed from: a */
    private final int f31993a;
    /* renamed from: b */
    private final int f31994b;
    /* renamed from: c */
    private final int f31995c;
    /* renamed from: d */
    private final int f31996d;
    /* renamed from: e */
    private final int f31997e;
    /* renamed from: f */
    private final int f31998f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9571a) {
            C9571a c9571a = (C9571a) obj;
            if ((this.f31993a == c9571a.f31993a ? 1 : null) != null) {
                if ((this.f31994b == c9571a.f31994b ? 1 : null) != null) {
                    if ((this.f31995c == c9571a.f31995c ? 1 : null) != null) {
                        if ((this.f31996d == c9571a.f31996d ? 1 : null) != null) {
                            if ((this.f31997e == c9571a.f31997e ? 1 : null) != null) {
                                if ((this.f31998f == c9571a.f31998f ? 1 : null) != null) {
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
        return (((((((((this.f31993a * 31) + this.f31994b) * 31) + this.f31995c) * 31) + this.f31996d) * 31) + this.f31997e) * 31) + this.f31998f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ViewBounds(left=");
        stringBuilder.append(this.f31993a);
        stringBuilder.append(", top=");
        stringBuilder.append(this.f31994b);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f31995c);
        stringBuilder.append(", width=");
        stringBuilder.append(this.f31996d);
        stringBuilder.append(", right=");
        stringBuilder.append(this.f31997e);
        stringBuilder.append(", bottom=");
        stringBuilder.append(this.f31998f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9571a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f31993a = i;
        this.f31994b = i2;
        this.f31995c = i3;
        this.f31996d = i4;
        this.f31997e = i5;
        this.f31998f = i6;
    }

    /* renamed from: a */
    public final int m39894a() {
        return this.f31993a;
    }

    /* renamed from: b */
    public final int m39895b() {
        return this.f31994b;
    }

    /* renamed from: c */
    public final int m39896c() {
        return this.f31995c;
    }

    /* renamed from: d */
    public final int m39897d() {
        return this.f31996d;
    }

    /* renamed from: e */
    public final int m39898e() {
        return this.f31997e;
    }

    public /* synthetic */ C9571a(int i, int i2, int i3, int i4, int i5, int i6, int i7, C15823e c15823e) {
        if ((i7 & 16) != null) {
            i5 = i + i4;
        }
        int i8 = i5;
        if ((i7 & 32) != 0) {
            i6 = i2 + i3;
        }
        this(i, i2, i3, i4, i8, i6);
    }

    /* renamed from: f */
    public final int m39899f() {
        return this.f31998f;
    }
}
