package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.model.d */
public class C1036d {
    /* renamed from: a */
    private final URL f2843a;
    /* renamed from: b */
    private final Headers f2844b;
    /* renamed from: c */
    private final String f2845c;
    /* renamed from: d */
    private String f2846d;
    /* renamed from: e */
    private URL f2847e;

    public C1036d(URL url) {
        this(url, Headers.f2837b);
    }

    public C1036d(String str) {
        this(str, Headers.f2837b);
    }

    public C1036d(URL url, Headers headers) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        } else if (headers == null) {
            throw new IllegalArgumentException("Headers must not be null");
        } else {
            this.f2843a = url;
            this.f2845c = null;
            this.f2844b = headers;
        }
    }

    public C1036d(String str, Headers headers) {
        if (TextUtils.isEmpty(str)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("String url must not be empty or null: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (headers == null) {
            throw new IllegalArgumentException("Headers must not be null");
        } else {
            this.f2845c = str;
            this.f2843a = null;
            this.f2844b = headers;
        }
    }

    /* renamed from: a */
    public URL m3578a() throws MalformedURLException {
        return m3576e();
    }

    /* renamed from: e */
    private URL m3576e() throws MalformedURLException {
        if (this.f2847e == null) {
            this.f2847e = new URL(m3577f());
        }
        return this.f2847e;
    }

    /* renamed from: b */
    public String m3579b() {
        return m3577f();
    }

    /* renamed from: f */
    private String m3577f() {
        if (TextUtils.isEmpty(this.f2846d)) {
            String str = this.f2845c;
            if (TextUtils.isEmpty(str)) {
                str = this.f2843a.toString();
            }
            this.f2846d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.f2846d;
    }

    /* renamed from: c */
    public Map<String, String> m3580c() {
        return this.f2844b.getHeaders();
    }

    /* renamed from: d */
    public String m3581d() {
        return this.f2845c != null ? this.f2845c : this.f2843a.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m3581d());
        stringBuilder.append('\n');
        stringBuilder.append(this.f2844b.toString());
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C1036d)) {
            return false;
        }
        C1036d c1036d = (C1036d) obj;
        if (m3581d().equals(c1036d.m3581d()) && this.f2844b.equals(c1036d.f2844b) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return (m3581d().hashCode() * 31) + this.f2844b.hashCode();
    }
}
