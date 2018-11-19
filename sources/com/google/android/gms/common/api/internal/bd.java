package com.google.android.gms.common.api.internal;

public final class bd<L> {
    /* renamed from: a */
    private final L f7491a;
    /* renamed from: b */
    private final String f7492b;

    bd(L l, String str) {
        this.f7491a = l;
        this.f7492b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return this.f7491a == bdVar.f7491a && this.f7492b.equals(bdVar.f7492b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f7491a) * 31) + this.f7492b.hashCode();
    }
}
