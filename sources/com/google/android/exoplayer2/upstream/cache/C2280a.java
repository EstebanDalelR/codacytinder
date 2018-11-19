package com.google.android.exoplayer2.upstream.cache;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.File;

/* renamed from: com.google.android.exoplayer2.upstream.cache.a */
public class C2280a implements Comparable<C2280a> {
    /* renamed from: a */
    public final String f6851a;
    /* renamed from: b */
    public final long f6852b;
    /* renamed from: c */
    public final long f6853c;
    /* renamed from: d */
    public final boolean f6854d;
    @Nullable
    /* renamed from: e */
    public final File f6855e;
    /* renamed from: f */
    public final long f6856f;

    public /* synthetic */ int compareTo(@NonNull Object obj) {
        return m8250a((C2280a) obj);
    }

    public C2280a(String str, long j, long j2, long j3, @Nullable File file) {
        this.f6851a = str;
        this.f6852b = j;
        this.f6853c = j2;
        this.f6854d = file != null ? true : null;
        this.f6855e = file;
        this.f6856f = j3;
    }

    /* renamed from: a */
    public boolean m8251a() {
        return this.f6853c == -1;
    }

    /* renamed from: b */
    public boolean m8252b() {
        return this.f6854d ^ 1;
    }

    /* renamed from: a */
    public int m8250a(@NonNull C2280a c2280a) {
        if (!this.f6851a.equals(c2280a.f6851a)) {
            return this.f6851a.compareTo(c2280a.f6851a);
        }
        long j = this.f6852b - c2280a.f6852b;
        c2280a = j == 0 ? null : j < 0 ? -1 : true;
        return c2280a;
    }
}
