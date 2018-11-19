package com.android.volley;

public class VolleyError extends Exception {
    /* renamed from: a */
    public final NetworkResponse f2358a;
    /* renamed from: b */
    private long f2359b;

    public VolleyError() {
        this.f2358a = null;
    }

    public VolleyError(NetworkResponse networkResponse) {
        this.f2358a = networkResponse;
    }

    public VolleyError(String str) {
        super(str);
        this.f2358a = null;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.f2358a = null;
    }

    /* renamed from: a */
    void m3044a(long j) {
        this.f2359b = j;
    }
}
