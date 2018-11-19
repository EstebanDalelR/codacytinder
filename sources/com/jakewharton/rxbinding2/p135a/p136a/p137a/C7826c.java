package com.jakewharton.rxbinding2.p135a.p136a.p137a;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0218d;

/* renamed from: com.jakewharton.rxbinding2.a.a.a.c */
final class C7826c extends C7021i {
    /* renamed from: a */
    private final TabLayout f28293a;
    /* renamed from: b */
    private final C0218d f28294b;

    C7826c(TabLayout tabLayout, C0218d c0218d) {
        if (tabLayout == null) {
            throw new NullPointerException("Null view");
        }
        this.f28293a = tabLayout;
        if (c0218d == null) {
            throw new NullPointerException("Null tab");
        }
        this.f28294b = c0218d;
    }

    @NonNull
    /* renamed from: a */
    public TabLayout mo7373a() {
        return this.f28293a;
    }

    @NonNull
    /* renamed from: b */
    public C0218d mo7374b() {
        return this.f28294b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TabLayoutSelectionUnselectedEvent{view=");
        stringBuilder.append(this.f28293a);
        stringBuilder.append(", tab=");
        stringBuilder.append(this.f28294b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7021i)) {
            return false;
        }
        C7021i c7021i = (C7021i) obj;
        if (!this.f28293a.equals(c7021i.mo7373a()) || this.f28294b.equals(c7021i.mo7374b()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f28293a.hashCode() ^ 1000003) * 1000003) ^ this.f28294b.hashCode();
    }
}
