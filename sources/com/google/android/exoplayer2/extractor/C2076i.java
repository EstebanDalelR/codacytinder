package com.google.android.exoplayer2.extractor;

import android.support.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.extractor.i */
public final class C2076i {
    /* renamed from: a */
    public static final C2076i f5727a = new C2076i(0, 0);
    /* renamed from: b */
    public final long f5728b;
    /* renamed from: c */
    public final long f5729c;

    public C2076i(long j, long j2) {
        this.f5728b = j;
        this.f5729c = j2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[timeUs=");
        stringBuilder.append(this.f5728b);
        stringBuilder.append(", position=");
        stringBuilder.append(this.f5729c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2076i c2076i = (C2076i) obj;
                if (this.f5728b != c2076i.f5728b || this.f5729c != c2076i.f5729c) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f5728b) * 31) + ((int) this.f5729c);
    }
}
