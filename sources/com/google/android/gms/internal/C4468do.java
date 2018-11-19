package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

@zzzv
/* renamed from: com.google.android.gms.internal.do */
final class C4468do {
    /* renamed from: a */
    private long f16017a = -1;
    /* renamed from: b */
    private long f16018b = -1;

    /* renamed from: a */
    public final long m19625a() {
        return this.f16018b;
    }

    /* renamed from: b */
    public final void m19626b() {
        this.f16018b = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final void m19627c() {
        this.f16017a = SystemClock.elapsedRealtime();
    }

    /* renamed from: d */
    public final Bundle m19628d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f16017a);
        bundle.putLong("tclose", this.f16018b);
        return bundle;
    }
}
