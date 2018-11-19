package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;

@zzzv
public final class agn {
    /* renamed from: a */
    private final int f15190a;
    /* renamed from: b */
    private final int f15191b;
    /* renamed from: c */
    private final int f15192c;
    /* renamed from: d */
    private final agz f15193d;
    /* renamed from: e */
    private final ahi f15194e;
    /* renamed from: f */
    private final Object f15195f = new Object();
    /* renamed from: g */
    private ArrayList<String> f15196g = new ArrayList();
    /* renamed from: h */
    private ArrayList<String> f15197h = new ArrayList();
    /* renamed from: i */
    private ArrayList<agx> f15198i = new ArrayList();
    /* renamed from: j */
    private int f15199j = 0;
    /* renamed from: k */
    private int f15200k = 0;
    /* renamed from: l */
    private int f15201l = 0;
    /* renamed from: m */
    private int f15202m;
    /* renamed from: n */
    private String f15203n = "";
    /* renamed from: o */
    private String f15204o = "";
    /* renamed from: p */
    private String f15205p = "";

    public agn(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f15190a = i;
        this.f15191b = i2;
        this.f15192c = i3;
        this.f15193d = new agz(i4);
        this.f15194e = new ahi(i5, i6, i7);
    }

    /* renamed from: a */
    private static String m19113a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            stringBuffer.append((String) obj);
            stringBuffer.append(' ');
            if (stringBuffer.length() > 100) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() < 100 ? stringBuffer2 : stringBuffer2.substring(0, 100);
    }

    /* renamed from: c */
    private final void m19114c(@Nullable String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f15192c) {
            synchronized (this.f15195f) {
                this.f15196g.add(str);
                this.f15199j += str.length();
                if (z) {
                    this.f15197h.add(str);
                    this.f15198i.add(new agx(f, f2, f3, f4, this.f15197h.size() - 1));
                }
            }
        }
    }

    /* renamed from: a */
    public final void m19115a(int i) {
        this.f15200k = i;
    }

    /* renamed from: a */
    public final void m19116a(String str, boolean z, float f, float f2, float f3, float f4) {
        m19114c(str, z, f, f2, f3, f4);
        synchronized (this.f15195f) {
            if (this.f15201l < 0) {
                hx.m19911b("ActivityContent: negative number of WebViews.");
            }
            m19125h();
        }
    }

    /* renamed from: a */
    public final boolean m19117a() {
        boolean z;
        synchronized (this.f15195f) {
            z = this.f15201l == 0;
        }
        return z;
    }

    /* renamed from: b */
    public final String m19118b() {
        return this.f15203n;
    }

    /* renamed from: b */
    public final void m19119b(String str, boolean z, float f, float f2, float f3, float f4) {
        m19114c(str, z, f, f2, f3, f4);
    }

    /* renamed from: c */
    public final String m19120c() {
        return this.f15204o;
    }

    /* renamed from: d */
    public final String m19121d() {
        return this.f15205p;
    }

    /* renamed from: e */
    public final void m19122e() {
        synchronized (this.f15195f) {
            this.f15202m -= 100;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agn)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        agn agn = (agn) obj;
        return agn.f15203n != null && agn.f15203n.equals(this.f15203n);
    }

    /* renamed from: f */
    public final void m19123f() {
        synchronized (this.f15195f) {
            this.f15201l--;
        }
    }

    /* renamed from: g */
    public final void m19124g() {
        synchronized (this.f15195f) {
            this.f15201l++;
        }
    }

    /* renamed from: h */
    public final void m19125h() {
        synchronized (this.f15195f) {
            int i = (this.f15199j * this.f15190a) + (this.f15200k * this.f15191b);
            if (i > this.f15202m) {
                this.f15202m = i;
                if (((Boolean) aja.m19221f().m19334a(alo.f15439Q)).booleanValue() && !ar.i().m27299a()) {
                    this.f15203n = this.f15193d.m19163a(this.f15196g);
                    this.f15204o = this.f15193d.m19163a(this.f15197h);
                }
                if (((Boolean) aja.m19221f().m19334a(alo.f15441S)).booleanValue() && !ar.i().m27303b()) {
                    this.f15205p = this.f15194e.m19173a(this.f15197h, this.f15198i);
                }
            }
        }
    }

    public final int hashCode() {
        return this.f15203n.hashCode();
    }

    /* renamed from: i */
    public final int m19126i() {
        return this.f15202m;
    }

    /* renamed from: j */
    final int m19127j() {
        return this.f15199j;
    }

    public final String toString() {
        int i = this.f15200k;
        int i2 = this.f15202m;
        int i3 = this.f15199j;
        String a = m19113a(this.f15196g, 100);
        String a2 = m19113a(this.f15197h, 100);
        String str = this.f15203n;
        String str2 = this.f15204o;
        String str3 = this.f15205p;
        StringBuilder stringBuilder = new StringBuilder(((((String.valueOf(a).length() + 165) + String.valueOf(a2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("ActivityContent fetchId: ");
        stringBuilder.append(i);
        stringBuilder.append(" score:");
        stringBuilder.append(i2);
        stringBuilder.append(" total_length:");
        stringBuilder.append(i3);
        stringBuilder.append("\n text: ");
        stringBuilder.append(a);
        stringBuilder.append("\n viewableText");
        stringBuilder.append(a2);
        stringBuilder.append("\n signture: ");
        stringBuilder.append(str);
        stringBuilder.append("\n viewableSignture: ");
        stringBuilder.append(str2);
        stringBuilder.append("\n viewableSignatureForVertical: ");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }
}
