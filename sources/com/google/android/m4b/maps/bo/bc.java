package com.google.android.m4b.maps.bo;

public final class bc {
    /* renamed from: a */
    private final int f17712a;
    /* renamed from: b */
    private final ba f17713b;
    /* renamed from: c */
    private final aw f17714c;
    /* renamed from: d */
    private final String[] f17715d;
    /* renamed from: e */
    private final au f17716e;

    public bc(int i, ba baVar, aw awVar, String[] strArr, au auVar) {
        this.f17712a = i;
        this.f17713b = baVar;
        this.f17714c = awVar;
        this.f17715d = strArr;
        this.f17716e = auVar;
    }

    /* renamed from: a */
    public final int m21629a() {
        return this.f17712a;
    }

    /* renamed from: b */
    public final ba m21632b() {
        return this.f17713b;
    }

    /* renamed from: a */
    public final as m21630a(int i) {
        return this.f17714c.m21579a(i);
    }

    /* renamed from: b */
    public final at m21631b(int i) {
        return this.f17716e.m21573a(i);
    }

    /* renamed from: c */
    public final String m21633c(int i) {
        String[] strArr = this.f17715d;
        Object obj = (strArr == null || i < 0 || i >= strArr.length) ? null : 1;
        return obj != null ? this.f17715d[i] : 0;
    }
}
