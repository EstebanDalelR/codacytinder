package com.google.android.m4b.maps.bv;

import io.fabric.sdk.android.services.events.C15645a;

/* renamed from: com.google.android.m4b.maps.bv.s */
final class C4946s {
    /* renamed from: a */
    private final String f18288a;
    /* renamed from: b */
    private final int f18289b;
    /* renamed from: c */
    private final int f18290c;
    /* renamed from: d */
    private final int f18291d;
    /* renamed from: e */
    private final int f18292e;
    /* renamed from: f */
    private final int f18293f;

    public C4946s(String str, int i, int i2, int i3, int i4) {
        this.f18288a = str;
        this.f18293f = ((((i2 << (i4 + 1)) | i) | (i3 << (i4 + 2))) ^ i4) ^ this.f18288a.hashCode();
        this.f18289b = i;
        this.f18290c = i2;
        this.f18291d = i3;
        this.f18292e = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4946s)) {
            return false;
        }
        C4946s c4946s = (C4946s) obj;
        return c4946s.f18289b == this.f18289b && c4946s.f18290c == this.f18290c && c4946s.f18291d == this.f18291d && c4946s.f18292e == this.f18292e && c4946s.f18288a.equals(this.f18288a) != null;
    }

    public final int hashCode() {
        return this.f18293f;
    }

    public final String toString() {
        String str = this.f18288a;
        int i = this.f18292e;
        int i2 = this.f18289b;
        int i3 = this.f18290c;
        int i4 = this.f18291d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 69);
        stringBuilder.append("panoid=");
        stringBuilder.append(str);
        stringBuilder.append("&zoom=");
        stringBuilder.append(i);
        stringBuilder.append("&x=");
        stringBuilder.append(i2);
        stringBuilder.append("&y=");
        stringBuilder.append(i3);
        stringBuilder.append("&face=");
        stringBuilder.append(i4);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final String m22182a() {
        String str = this.f18288a;
        int i = this.f18292e;
        int i2 = this.f18289b;
        int i3 = this.f18290c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 41);
        stringBuilder.append("tile_");
        stringBuilder.append(str);
        stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
        stringBuilder.append(i);
        stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
        stringBuilder.append(i2);
        stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
        stringBuilder.append(i3);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final String m22183b() {
        return this.f18288a;
    }

    /* renamed from: c */
    public final int m22184c() {
        return this.f18289b;
    }

    /* renamed from: d */
    public final int m22185d() {
        return this.f18290c;
    }

    /* renamed from: e */
    public final int m22186e() {
        return this.f18291d;
    }

    /* renamed from: f */
    public final int m22187f() {
        return this.f18292e;
    }
}
