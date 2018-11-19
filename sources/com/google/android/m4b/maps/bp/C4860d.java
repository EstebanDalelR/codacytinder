package com.google.android.m4b.maps.bp;

import java.util.regex.Pattern;

/* renamed from: com.google.android.m4b.maps.bp.d */
public final class C4860d {
    /* renamed from: a */
    private static final Pattern f17854a = Pattern.compile("[0-9]+[A-Z]?");
    /* renamed from: b */
    private final String f17855b;
    /* renamed from: c */
    private final String f17856c;
    /* renamed from: d */
    private final boolean f17857d;

    public C4860d(String str, String str2, boolean z) {
        this.f17856c = str;
        this.f17855b = str2;
        if (z) {
            if (f17854a.matcher(this.f17855b == null ? this.f17856c : this.f17855b).matches() != null) {
                str = true;
                this.f17857d = str;
            }
        }
        str = null;
        this.f17857d = str;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.f17855b == null ? 0 : this.f17855b.hashCode()) + 31) * 31) + (this.f17857d ? 1231 : 1237)) * 31;
        if (this.f17856c != null) {
            i = this.f17856c.hashCode();
        }
        return hashCode + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4860d)) {
            return false;
        }
        C4860d c4860d = (C4860d) obj;
        return this.f17856c.equals(c4860d.f17856c) && (((this.f17855b == null && c4860d.f17855b == null) || this.f17855b.equals(c4860d.f17855b)) && this.f17857d == c4860d.f17857d);
    }

    public final String toString() {
        return this.f17856c;
    }
}
