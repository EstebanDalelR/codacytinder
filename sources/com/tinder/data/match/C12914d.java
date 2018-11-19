package com.tinder.data.match;

import android.support.annotation.NonNull;
import com.tinder.data.match.C8680y.C10802c;

/* renamed from: com.tinder.data.match.d */
final class C12914d extends C10802c {
    /* renamed from: a */
    private final String f41395a;
    /* renamed from: b */
    private final String f41396b;
    /* renamed from: c */
    private final boolean f41397c;
    /* renamed from: d */
    private final long f41398d;

    C12914d(String str, String str2, boolean z, long j) {
        if (str == null) {
            throw new NullPointerException("Null group_id");
        }
        this.f41395a = str;
        if (str2 == null) {
            throw new NullPointerException("Null person_id");
        }
        this.f41396b = str2;
        this.f41397c = z;
        this.f41398d = j;
    }

    @NonNull
    public String group_id() {
        return this.f41395a;
    }

    @NonNull
    public String person_id() {
        return this.f41396b;
    }

    public boolean is_owner() {
        return this.f41397c;
    }

    public long sort_order() {
        return this.f41398d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MatchGroupMember{group_id=");
        stringBuilder.append(this.f41395a);
        stringBuilder.append(", person_id=");
        stringBuilder.append(this.f41396b);
        stringBuilder.append(", is_owner=");
        stringBuilder.append(this.f41397c);
        stringBuilder.append(", sort_order=");
        stringBuilder.append(this.f41398d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10802c)) {
            return false;
        }
        C10802c c10802c = (C10802c) obj;
        if (!this.f41395a.equals(c10802c.group_id()) || !this.f41396b.equals(c10802c.person_id()) || this.f41397c != c10802c.is_owner() || this.f41398d != c10802c.sort_order()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (((long) ((((((this.f41395a.hashCode() ^ 1000003) * 1000003) ^ this.f41396b.hashCode()) * 1000003) ^ (this.f41397c ? 1231 : 1237)) * 1000003)) ^ ((this.f41398d >>> 32) ^ this.f41398d));
    }
}
