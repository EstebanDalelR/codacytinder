package com.tinder.analytics.fireworks.data;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2632i;

/* renamed from: com.tinder.analytics.fireworks.data.a */
final class C8013a extends C7328i {
    /* renamed from: a */
    private final long f28645a;
    /* renamed from: b */
    private final C2632i f28646b;

    C8013a(long j, C2632i c2632i) {
        this.f28645a = j;
        if (c2632i == null) {
            throw new NullPointerException("Null event");
        }
        this.f28646b = c2632i;
    }

    public long _id() {
        return this.f28645a;
    }

    @NonNull
    public C2632i event() {
        return this.f28646b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FireworksEventWrapper{_id=");
        stringBuilder.append(this.f28645a);
        stringBuilder.append(", event=");
        stringBuilder.append(this.f28646b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7328i)) {
            return false;
        }
        C7328i c7328i = (C7328i) obj;
        if (this.f28645a != c7328i._id() || this.f28646b.equals(c7328i.event()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f28646b.hashCode() ^ (((int) (((long) 1000003) ^ ((this.f28645a >>> 32) ^ this.f28645a))) * 1000003);
    }
}
