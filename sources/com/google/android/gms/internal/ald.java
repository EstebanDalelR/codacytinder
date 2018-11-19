package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

@zzzv
public abstract class ald<T> {
    /* renamed from: a */
    private final int f15405a;
    /* renamed from: b */
    private final String f15406b;
    /* renamed from: c */
    private final T f15407c;

    private ald(int i, String str, T t) {
        this.f15405a = i;
        this.f15406b = str;
        this.f15407c = t;
        aja.m19220e().m19329a(this);
    }

    /* renamed from: a */
    public static ald<String> m19313a(int i, String str) {
        ald<String> a = m19318a(i, str, null);
        aja.m19220e().m19331b(a);
        return a;
    }

    /* renamed from: a */
    public static ald<Float> m19314a(int i, String str, float f) {
        return new ali(i, str, Float.valueOf(0.0f));
    }

    /* renamed from: a */
    public static ald<Integer> m19315a(int i, String str, int i2) {
        return new alf(i, str, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static ald<Long> m19316a(int i, String str, long j) {
        return new alh(i, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static ald<Boolean> m19317a(int i, String str, Boolean bool) {
        return new ale(i, str, bool);
    }

    /* renamed from: a */
    public static ald<String> m19318a(int i, String str, String str2) {
        return new alj(i, str, str2);
    }

    /* renamed from: b */
    public static ald<String> m19319b(int i, String str) {
        ald<String> a = m19318a(i, str, null);
        aja.m19220e().m19332c(a);
        return a;
    }

    /* renamed from: a */
    protected abstract T mo4350a(SharedPreferences sharedPreferences);

    /* renamed from: a */
    protected abstract T mo4351a(JSONObject jSONObject);

    /* renamed from: a */
    public final String m19322a() {
        return this.f15406b;
    }

    /* renamed from: a */
    public abstract void mo4352a(Editor editor, T t);

    /* renamed from: b */
    public final T m19324b() {
        return this.f15407c;
    }

    /* renamed from: c */
    public final int m19325c() {
        return this.f15405a;
    }
}
