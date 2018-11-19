package org.objectweb.asm;

/* renamed from: org.objectweb.asm.m */
public final class C19343m {
    /* renamed from: a */
    final int f60355a;
    /* renamed from: b */
    final String f60356b;
    /* renamed from: c */
    final String f60357c;
    /* renamed from: d */
    final String f60358d;

    public C19343m(int i, String str, String str2, String str3) {
        this.f60355a = i;
        this.f60356b = str;
        this.f60357c = str2;
        this.f60358d = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19343m)) {
            return false;
        }
        C19343m c19343m = (C19343m) obj;
        return this.f60355a == c19343m.f60355a && this.f60356b.equals(c19343m.f60356b) && this.f60357c.equals(c19343m.f60357c) && this.f60358d.equals(c19343m.f60358d);
    }

    public int hashCode() {
        return this.f60355a + ((this.f60356b.hashCode() * this.f60357c.hashCode()) * this.f60358d.hashCode());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f60356b);
        stringBuffer.append('.');
        stringBuffer.append(this.f60357c);
        stringBuffer.append(this.f60358d);
        stringBuffer.append(" (");
        stringBuffer.append(this.f60355a);
        stringBuffer.append(')');
        return stringBuffer.toString();
    }
}
