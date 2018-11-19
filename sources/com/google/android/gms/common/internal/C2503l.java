package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.l */
public final class C2503l {
    /* renamed from: a */
    private static int f7653a = 15;
    /* renamed from: b */
    private static final String f7654b = null;
    /* renamed from: c */
    private final String f7655c;
    /* renamed from: d */
    private final String f7656d;

    public C2503l(String str) {
        this(str, null);
    }

    public C2503l(String str, String str2) {
        ad.m9046a((Object) str, (Object) "log tag cannot be null");
        ad.m9056b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.f7655c = str;
        if (str2 != null) {
            if (str2.length() > 0) {
                this.f7656d = str2;
                return;
            }
        }
        this.f7656d = null;
    }
}
