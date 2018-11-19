package com.tinder.data.match;

import android.support.annotation.NonNull;
import com.tinder.data.match.C8680y.C10801b;

/* renamed from: com.tinder.data.match.c */
final class C12913c extends C10801b {
    /* renamed from: a */
    private final String f41394a;

    C12913c(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f41394a = str;
    }

    @NonNull
    public String id() {
        return this.f41394a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MatchGroup{id=");
        stringBuilder.append(this.f41394a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10801b)) {
            return null;
        }
        return this.f41394a.equals(((C10801b) obj).id());
    }

    public int hashCode() {
        return this.f41394a.hashCode() ^ 1000003;
    }
}
