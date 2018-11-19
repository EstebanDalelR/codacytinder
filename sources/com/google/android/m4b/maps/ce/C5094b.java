package com.google.android.m4b.maps.ce;

/* renamed from: com.google.android.m4b.maps.ce.b */
public class C5094b {
    /* renamed from: a */
    private final String f18876a;
    /* renamed from: b */
    private final boolean f18877b;

    public C5094b() {
        this(null);
    }

    public C5094b(String str) {
        this(str, false);
    }

    public C5094b(String str, boolean z) {
        this.f18876a = str;
        this.f18877b = z;
    }

    /* renamed from: b */
    public final boolean m22747b() {
        return this.f18877b;
    }

    public String toString() {
        if (this.f18876a == null) {
            return super.toString();
        }
        String str = this.f18876a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 15);
        stringBuilder.append("[LabelSource: ");
        stringBuilder.append(str);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static boolean m22746a(C5094b c5094b, C5094b c5094b2) {
        if (c5094b == null) {
            return c5094b2 == null ? true : null;
        } else {
            return c5094b.equals(c5094b2);
        }
    }
}
