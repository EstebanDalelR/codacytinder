package com.tinder.data.match;

import android.support.annotation.NonNull;
import com.tinder.data.match.C8680y.C10805f;

/* renamed from: com.tinder.data.match.g */
final class C12917g extends C10805f {
    /* renamed from: a */
    private final String f41419a;
    /* renamed from: b */
    private final String f41420b;

    C12917g(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null match_id");
        }
        this.f41419a = str;
        if (str2 == null) {
            throw new NullPointerException("Null place_id");
        }
        this.f41420b = str2;
    }

    @NonNull
    public String match_id() {
        return this.f41419a;
    }

    @NonNull
    public String place_id() {
        return this.f41420b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MatchPlace{match_id=");
        stringBuilder.append(this.f41419a);
        stringBuilder.append(", place_id=");
        stringBuilder.append(this.f41420b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10805f)) {
            return false;
        }
        C10805f c10805f = (C10805f) obj;
        if (!this.f41419a.equals(c10805f.match_id()) || this.f41420b.equals(c10805f.place_id()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f41419a.hashCode() ^ 1000003) * 1000003) ^ this.f41420b.hashCode();
    }
}
