package com.jakewharton.rxbinding2.p135a.p138b.p139a;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

/* renamed from: com.jakewharton.rxbinding2.a.b.a.a */
final class C7022a extends C5714b {
    /* renamed from: a */
    private final RecyclerView f25474a;
    /* renamed from: b */
    private final int f25475b;
    /* renamed from: c */
    private final int f25476c;

    C7022a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView == null) {
            throw new NullPointerException("Null view");
        }
        this.f25474a = recyclerView;
        this.f25475b = i;
        this.f25476c = i2;
    }

    @NonNull
    /* renamed from: a */
    public RecyclerView mo6184a() {
        return this.f25474a;
    }

    /* renamed from: b */
    public int mo6185b() {
        return this.f25475b;
    }

    /* renamed from: c */
    public int mo6186c() {
        return this.f25476c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecyclerViewScrollEvent{view=");
        stringBuilder.append(this.f25474a);
        stringBuilder.append(", dx=");
        stringBuilder.append(this.f25475b);
        stringBuilder.append(", dy=");
        stringBuilder.append(this.f25476c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5714b)) {
            return false;
        }
        C5714b c5714b = (C5714b) obj;
        if (!this.f25474a.equals(c5714b.mo6184a()) || this.f25475b != c5714b.mo6185b() || this.f25476c != c5714b.mo6186c()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.f25474a.hashCode() ^ 1000003) * 1000003) ^ this.f25475b) * 1000003) ^ this.f25476c;
    }
}
