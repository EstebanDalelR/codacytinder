package com.jakewharton.rxbinding2.p135a.p136a.p137a;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0218d;

/* renamed from: com.jakewharton.rxbinding2.a.a.a.b */
final class C7825b extends C7020h {
    /* renamed from: a */
    private final TabLayout f28291a;
    /* renamed from: b */
    private final C0218d f28292b;

    C7825b(TabLayout tabLayout, C0218d c0218d) {
        if (tabLayout == null) {
            throw new NullPointerException("Null view");
        }
        this.f28291a = tabLayout;
        if (c0218d == null) {
            throw new NullPointerException("Null tab");
        }
        this.f28292b = c0218d;
    }

    @NonNull
    /* renamed from: a */
    public TabLayout mo7373a() {
        return this.f28291a;
    }

    @NonNull
    /* renamed from: b */
    public C0218d mo7374b() {
        return this.f28292b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TabLayoutSelectionSelectedEvent{view=");
        stringBuilder.append(this.f28291a);
        stringBuilder.append(", tab=");
        stringBuilder.append(this.f28292b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7020h)) {
            return false;
        }
        C7020h c7020h = (C7020h) obj;
        if (!this.f28291a.equals(c7020h.mo7373a()) || this.f28292b.equals(c7020h.mo7374b()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f28291a.hashCode() ^ 1000003) * 1000003) ^ this.f28292b.hashCode();
    }
}
