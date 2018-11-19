package com.google.android.gms.internal;

public final class asu<T> {
    /* renamed from: a */
    public final T f15689a;
    /* renamed from: b */
    public final pt f15690b;
    /* renamed from: c */
    public final zzad f15691c;
    /* renamed from: d */
    public boolean f15692d;

    private asu(zzad zzad) {
        this.f15692d = false;
        this.f15689a = null;
        this.f15690b = null;
        this.f15691c = zzad;
    }

    private asu(T t, pt ptVar) {
        this.f15692d = false;
        this.f15689a = t;
        this.f15690b = ptVar;
        this.f15691c = null;
    }

    /* renamed from: a */
    public static <T> asu<T> m19469a(zzad zzad) {
        return new asu(zzad);
    }

    /* renamed from: a */
    public static <T> asu<T> m19470a(T t, pt ptVar) {
        return new asu(t, ptVar);
    }
}
