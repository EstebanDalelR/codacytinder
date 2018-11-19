package com.android.volley;

import com.android.volley.Cache.C0901a;

public class Response<T> {
    /* renamed from: a */
    public final T f2354a;
    /* renamed from: b */
    public final C0901a f2355b;
    /* renamed from: c */
    public final VolleyError f2356c;
    /* renamed from: d */
    public boolean f2357d;

    public interface ErrorListener {
        void onErrorResponse(VolleyError volleyError);
    }

    public interface Listener<T> {
        void onResponse(T t);
    }

    /* renamed from: a */
    public static <T> Response<T> m3042a(T t, C0901a c0901a) {
        return new Response(t, c0901a);
    }

    /* renamed from: a */
    public static <T> Response<T> m3041a(VolleyError volleyError) {
        return new Response(volleyError);
    }

    /* renamed from: a */
    public boolean m3043a() {
        return this.f2356c == null;
    }

    private Response(T t, C0901a c0901a) {
        this.f2357d = false;
        this.f2354a = t;
        this.f2355b = c0901a;
        this.f2356c = null;
    }

    private Response(VolleyError volleyError) {
        this.f2357d = false;
        this.f2354a = null;
        this.f2355b = null;
        this.f2356c = volleyError;
    }
}
