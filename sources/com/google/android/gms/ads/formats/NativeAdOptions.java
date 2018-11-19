package com.google.android.gms.ads.formats;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.C2414k;
import com.google.android.gms.internal.zzzv;

@zzzv
public final class NativeAdOptions {
    /* renamed from: a */
    private final boolean f7055a;
    /* renamed from: b */
    private final int f7056b;
    /* renamed from: c */
    private final boolean f7057c;
    /* renamed from: d */
    private final int f7058d;
    /* renamed from: e */
    private final C2414k f7059e;

    public @interface AdChoicesPlacement {
    }

    /* renamed from: com.google.android.gms.ads.formats.NativeAdOptions$a */
    public static final class C2350a {
        /* renamed from: a */
        private boolean f7050a = false;
        /* renamed from: b */
        private int f7051b = -1;
        /* renamed from: c */
        private boolean f7052c = false;
        /* renamed from: d */
        private C2414k f7053d;
        /* renamed from: e */
        private int f7054e = 1;

        /* renamed from: a */
        public final C2350a m8586a(int i) {
            this.f7051b = i;
            return this;
        }

        /* renamed from: a */
        public final C2350a m8587a(C2414k c2414k) {
            this.f7053d = c2414k;
            return this;
        }

        /* renamed from: a */
        public final C2350a m8588a(boolean z) {
            this.f7050a = z;
            return this;
        }

        /* renamed from: a */
        public final NativeAdOptions m8589a() {
            return new NativeAdOptions();
        }

        /* renamed from: b */
        public final C2350a m8590b(@AdChoicesPlacement int i) {
            this.f7054e = i;
            return this;
        }

        /* renamed from: b */
        public final C2350a m8591b(boolean z) {
            this.f7052c = z;
            return this;
        }
    }

    private NativeAdOptions(C2350a c2350a) {
        this.f7055a = c2350a.f7050a;
        this.f7056b = c2350a.f7051b;
        this.f7057c = c2350a.f7052c;
        this.f7058d = c2350a.f7054e;
        this.f7059e = c2350a.f7053d;
    }

    /* renamed from: a */
    public final boolean m8592a() {
        return this.f7055a;
    }

    /* renamed from: b */
    public final int m8593b() {
        return this.f7056b;
    }

    /* renamed from: c */
    public final boolean m8594c() {
        return this.f7057c;
    }

    /* renamed from: d */
    public final int m8595d() {
        return this.f7058d;
    }

    @Nullable
    /* renamed from: e */
    public final C2414k m8596e() {
        return this.f7059e;
    }
}
