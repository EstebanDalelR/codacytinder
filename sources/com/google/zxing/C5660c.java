package com.google.zxing;

/* renamed from: com.google.zxing.c */
public final class C5660c {
    /* renamed from: a */
    private final int f20966a;
    /* renamed from: b */
    private final int f20967b;

    /* renamed from: a */
    public int m24729a() {
        return this.f20966a;
    }

    /* renamed from: b */
    public int m24730b() {
        return this.f20967b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5660c)) {
            return false;
        }
        C5660c c5660c = (C5660c) obj;
        if (this.f20966a == c5660c.f20966a && this.f20967b == c5660c.f20967b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f20966a * 32713) + this.f20967b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f20966a);
        stringBuilder.append("x");
        stringBuilder.append(this.f20967b);
        return stringBuilder.toString();
    }
}
