package com.jakewharton.rxbinding2.p135a.p136a.p137a;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0218d;

/* renamed from: com.jakewharton.rxbinding2.a.a.a.a */
final class C7824a extends C7019g {
    /* renamed from: a */
    private final TabLayout f28289a;
    /* renamed from: b */
    private final C0218d f28290b;

    C7824a(TabLayout tabLayout, C0218d c0218d) {
        if (tabLayout == null) {
            throw new NullPointerException("Null view");
        }
        this.f28289a = tabLayout;
        if (c0218d == null) {
            throw new NullPointerException("Null tab");
        }
        this.f28290b = c0218d;
    }

    @NonNull
    /* renamed from: a */
    public TabLayout mo7373a() {
        return this.f28289a;
    }

    @NonNull
    /* renamed from: b */
    public C0218d mo7374b() {
        return this.f28290b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TabLayoutSelectionReselectedEvent{view=");
        stringBuilder.append(this.f28289a);
        stringBuilder.append(", tab=");
        stringBuilder.append(this.f28290b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7019g)) {
            return false;
        }
        C7019g c7019g = (C7019g) obj;
        if (!this.f28289a.equals(c7019g.mo7373a()) || this.f28290b.equals(c7019g.mo7374b()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f28289a.hashCode() ^ 1000003) * 1000003) ^ this.f28290b.hashCode();
    }
}
