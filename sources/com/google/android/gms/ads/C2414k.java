package com.google.android.gms.ads;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.zzmr;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.k */
public final class C2414k {
    /* renamed from: a */
    private final boolean f7330a;
    /* renamed from: b */
    private final boolean f7331b;
    /* renamed from: c */
    private final boolean f7332c;

    /* renamed from: com.google.android.gms.ads.k$a */
    public static final class C2413a {
        /* renamed from: a */
        private boolean f7327a = true;
        /* renamed from: b */
        private boolean f7328b = false;
        /* renamed from: c */
        private boolean f7329c = false;

        /* renamed from: a */
        public final C2413a m8758a(boolean z) {
            this.f7327a = z;
            return this;
        }

        /* renamed from: a */
        public final C2414k m8759a() {
            return new C2414k();
        }

        @KeepForSdk
        /* renamed from: b */
        public final C2413a m8760b(boolean z) {
            this.f7328b = z;
            return this;
        }
    }

    private C2414k(C2413a c2413a) {
        this.f7330a = c2413a.f7327a;
        this.f7331b = c2413a.f7328b;
        this.f7332c = c2413a.f7329c;
    }

    public C2414k(zzmr zzmr) {
        this.f7330a = zzmr.zzbgx;
        this.f7331b = zzmr.zzbgy;
        this.f7332c = zzmr.zzbgz;
    }

    /* renamed from: a */
    public final boolean m8761a() {
        return this.f7330a;
    }

    @KeepForSdk
    /* renamed from: b */
    public final boolean m8762b() {
        return this.f7331b;
    }

    @KeepForSdk
    /* renamed from: c */
    public final boolean m8763c() {
        return this.f7332c;
    }
}
