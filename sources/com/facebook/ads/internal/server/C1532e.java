package com.facebook.ads.internal.server;

import com.facebook.ads.internal.p040g.C1409d;

/* renamed from: com.facebook.ads.internal.server.e */
class C1532e {
    /* renamed from: a */
    private final C1531a f4286a;
    /* renamed from: b */
    private final C1409d f4287b;
    /* renamed from: c */
    private final String f4288c;
    /* renamed from: d */
    private final String f4289d;

    /* renamed from: com.facebook.ads.internal.server.e$a */
    enum C1531a {
        UNKNOWN,
        ERROR,
        ADS
    }

    C1532e(C1531a c1531a) {
        this(c1531a, null, null, null);
    }

    C1532e(C1531a c1531a, C1409d c1409d, String str, String str2) {
        this.f4286a = c1531a;
        this.f4287b = c1409d;
        this.f4288c = str;
        this.f4289d = str2;
    }

    /* renamed from: a */
    public C1409d mo1784a() {
        return this.f4287b;
    }

    /* renamed from: b */
    C1531a m5394b() {
        return this.f4286a;
    }

    /* renamed from: c */
    String m5395c() {
        return this.f4288c;
    }

    /* renamed from: d */
    String m5396d() {
        return this.f4289d;
    }
}
