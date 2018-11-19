package com.google.android.m4b.maps.bt;

import com.google.android.m4b.maps.bo.ba;

/* renamed from: com.google.android.m4b.maps.bt.b */
public final class C4907b {
    /* renamed from: a */
    public final ba f18031a;
    /* renamed from: b */
    public final boolean f18032b;
    /* renamed from: c */
    public final long f18033c;

    public C4907b(ba baVar, long j, boolean z) {
        this.f18031a = baVar;
        this.f18032b = z;
        this.f18033c = j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18031a);
        boolean z = this.f18032b;
        long j = this.f18033c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 55);
        stringBuilder.append(valueOf);
        stringBuilder.append(", isLocalRequest=");
        stringBuilder.append(z);
        stringBuilder.append(", fetchToken=");
        stringBuilder.append(j);
        return stringBuilder.toString();
    }
}
