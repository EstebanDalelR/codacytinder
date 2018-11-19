package com.facebook.ads.internal.p043j.p044a;

/* renamed from: com.facebook.ads.internal.j.a.l */
public abstract class C1438l {
    /* renamed from: a */
    protected String f3978a = "";
    /* renamed from: b */
    protected C1437j f3979b;
    /* renamed from: c */
    protected String f3980c;
    /* renamed from: d */
    protected byte[] f3981d;

    public C1438l(String str, C1442p c1442p) {
        if (str != null) {
            this.f3978a = str;
        }
        if (c1442p != null) {
            str = c1442p.m5050a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f3978a);
            stringBuilder.append("?");
            stringBuilder.append(str);
            this.f3978a = stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public String m5037a() {
        return this.f3978a;
    }

    /* renamed from: b */
    public C1437j m5038b() {
        return this.f3979b;
    }

    /* renamed from: c */
    public String m5039c() {
        return this.f3980c;
    }

    /* renamed from: d */
    public byte[] m5040d() {
        return this.f3981d;
    }
}
