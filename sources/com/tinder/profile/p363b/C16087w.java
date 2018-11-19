package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.profile.p363b.C16080m.C14387a;

/* renamed from: com.tinder.profile.b.w */
final class C16087w extends C14387a {
    /* renamed from: a */
    private final String f50019a;
    /* renamed from: b */
    private final String f50020b;

    C16087w(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null artistName");
        }
        this.f50019a = str;
        if (str2 == null) {
            throw new NullPointerException("Null songName");
        }
        this.f50020b = str2;
    }

    @NonNull
    /* renamed from: a */
    public String mo11586a() {
        return this.f50019a;
    }

    @NonNull
    /* renamed from: b */
    public String mo11587b() {
        return this.f50020b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{artistName=");
        stringBuilder.append(this.f50019a);
        stringBuilder.append(", songName=");
        stringBuilder.append(this.f50020b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14387a)) {
            return false;
        }
        C14387a c14387a = (C14387a) obj;
        if (!this.f50019a.equals(c14387a.mo11586a()) || this.f50020b.equals(c14387a.mo11587b()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f50019a.hashCode() ^ 1000003) * 1000003) ^ this.f50020b.hashCode();
    }
}
