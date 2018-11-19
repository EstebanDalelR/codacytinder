package com.squareup.okhttp.internal.framed;

import okio.ByteString;

/* renamed from: com.squareup.okhttp.internal.framed.c */
public final class C6028c {
    /* renamed from: a */
    public static final ByteString f22091a = ByteString.a(":status");
    /* renamed from: b */
    public static final ByteString f22092b = ByteString.a(":method");
    /* renamed from: c */
    public static final ByteString f22093c = ByteString.a(":path");
    /* renamed from: d */
    public static final ByteString f22094d = ByteString.a(":scheme");
    /* renamed from: e */
    public static final ByteString f22095e = ByteString.a(":authority");
    /* renamed from: f */
    public static final ByteString f22096f = ByteString.a(":host");
    /* renamed from: g */
    public static final ByteString f22097g = ByteString.a(":version");
    /* renamed from: h */
    public final ByteString f22098h;
    /* renamed from: i */
    public final ByteString f22099i;
    /* renamed from: j */
    final int f22100j;

    public C6028c(String str, String str2) {
        this(ByteString.a(str), ByteString.a(str2));
    }

    public C6028c(ByteString byteString, String str) {
        this(byteString, ByteString.a(str));
    }

    public C6028c(ByteString byteString, ByteString byteString2) {
        this.f22098h = byteString;
        this.f22099i = byteString2;
        this.f22100j = (byteString.h() + 32) + byteString2.h();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C6028c)) {
            return false;
        }
        C6028c c6028c = (C6028c) obj;
        if (this.f22098h.equals(c6028c.f22098h) && this.f22099i.equals(c6028c.f22099i) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + this.f22098h.hashCode()) * 31) + this.f22099i.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f22098h.a(), this.f22099i.a()});
    }
}
