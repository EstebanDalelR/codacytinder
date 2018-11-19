package com.facebook.ads.internal.p043j.p044a;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.j.a.n */
public class C1440n {
    /* renamed from: a */
    private int f3983a;
    /* renamed from: b */
    private String f3984b;
    /* renamed from: c */
    private Map<String, List<String>> f3985c;
    /* renamed from: d */
    private byte[] f3986d;

    public C1440n(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.f3983a = httpURLConnection.getResponseCode();
            this.f3984b = httpURLConnection.getURL().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f3985c = httpURLConnection.getHeaderFields();
        this.f3986d = bArr;
    }

    /* renamed from: a */
    public int m5042a() {
        return this.f3983a;
    }

    /* renamed from: b */
    public String m5043b() {
        return this.f3984b;
    }

    /* renamed from: c */
    public Map<String, List<String>> m5044c() {
        return this.f3985c;
    }

    /* renamed from: d */
    public byte[] m5045d() {
        return this.f3986d;
    }

    /* renamed from: e */
    public String m5046e() {
        return this.f3986d != null ? new String(this.f3986d) : null;
    }
}
