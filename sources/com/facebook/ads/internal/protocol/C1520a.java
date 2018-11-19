package com.facebook.ads.internal.protocol;

/* renamed from: com.facebook.ads.internal.protocol.a */
public class C1520a extends Exception {
    /* renamed from: a */
    private final AdErrorType f4244a;
    /* renamed from: b */
    private final String f4245b;

    public C1520a(AdErrorType adErrorType, String str) {
        this(adErrorType, str, null);
    }

    public C1520a(AdErrorType adErrorType, String str, Throwable th) {
        super(str, th);
        this.f4244a = adErrorType;
        this.f4245b = str;
    }

    /* renamed from: a */
    public AdErrorType m5359a() {
        return this.f4244a;
    }

    /* renamed from: b */
    public String m5360b() {
        return this.f4245b;
    }
}
