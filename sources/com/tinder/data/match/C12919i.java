package com.tinder.data.match;

import android.support.annotation.NonNull;
import com.tinder.data.match.C8680y.C10807h;

/* renamed from: com.tinder.data.match.i */
final class C12919i extends C10807h {
    /* renamed from: a */
    private final String f41425a;
    /* renamed from: b */
    private final String f41426b;

    C12919i(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f41425a = str;
        if (str2 == null) {
            throw new NullPointerException("Null name");
        }
        this.f41426b = str2;
    }

    @NonNull
    public String id() {
        return this.f41425a;
    }

    @NonNull
    public String name() {
        return this.f41426b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Place{id=");
        stringBuilder.append(this.f41425a);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f41426b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10807h)) {
            return false;
        }
        C10807h c10807h = (C10807h) obj;
        if (!this.f41425a.equals(c10807h.id()) || this.f41426b.equals(c10807h.name()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f41425a.hashCode() ^ 1000003) * 1000003) ^ this.f41426b.hashCode();
    }
}
