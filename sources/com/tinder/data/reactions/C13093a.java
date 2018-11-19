package com.tinder.data.reactions;

import android.support.annotation.NonNull;
import com.tinder.data.reactions.C8769d.C10988a;

/* renamed from: com.tinder.data.reactions.a */
final class C13093a extends C10988a {
    /* renamed from: a */
    private final String f41698a;
    /* renamed from: b */
    private final String f41699b;

    C13093a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null match_id");
        }
        this.f41698a = str;
        if (str2 == null) {
            throw new NullPointerException("Null strike_id");
        }
        this.f41699b = str2;
    }

    @NonNull
    public String match_id() {
        return this.f41698a;
    }

    @NonNull
    public String strike_id() {
        return this.f41699b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StrikeReactions{match_id=");
        stringBuilder.append(this.f41698a);
        stringBuilder.append(", strike_id=");
        stringBuilder.append(this.f41699b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10988a)) {
            return false;
        }
        C10988a c10988a = (C10988a) obj;
        if (!this.f41698a.equals(c10988a.match_id()) || this.f41699b.equals(c10988a.strike_id()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f41698a.hashCode() ^ 1000003) * 1000003) ^ this.f41699b.hashCode();
    }
}
