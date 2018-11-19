package io.fabric.sdk.android.services.common;

/* renamed from: io.fabric.sdk.android.services.common.b */
class C15617b {
    /* renamed from: a */
    public final String f48363a;
    /* renamed from: b */
    public final boolean f48364b;

    C15617b(String str, boolean z) {
        this.f48363a = str;
        this.f48364b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C15617b c15617b = (C15617b) obj;
                if (this.f48364b != c15617b.f48364b) {
                    return false;
                }
                if (this.f48363a == null) {
                    return c15617b.f48363a == null;
                } else {
                    if (this.f48363a.equals(c15617b.f48363a) == null) {
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f48363a != null ? this.f48363a.hashCode() : 0) * 31) + this.f48364b;
    }
}
