package com.appsflyer;

import android.support.annotation.NonNull;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;

/* renamed from: com.appsflyer.q */
final class C0947q {
    /* renamed from: a */
    private final Object f2512a;
    /* renamed from: b */
    private long f2513b;
    /* renamed from: c */
    private String f2514c;

    C0947q(long j, String str) {
        this.f2512a = new Object();
        this.f2513b = 0;
        this.f2514c = "";
        this.f2513b = j;
        this.f2514c = str;
    }

    C0947q(String str) {
        this(System.currentTimeMillis(), str);
    }

    @NonNull
    /* renamed from: a */
    static C0947q m3235a(String str) {
        if (str == null) {
            return C0947q.m3238b();
        }
        str = str.split(",");
        if (str.length < 2) {
            return C0947q.m3238b();
        }
        return new C0947q(Long.parseLong(str[0]), str[1]);
    }

    /* renamed from: b */
    private static C0947q m3238b() {
        return new C0947q(0, "");
    }

    /* renamed from: a */
    final boolean m3241a(C0947q c0947q) {
        if (c0947q != null) {
            return m3237a(c0947q.m3239c(), c0947q.m3240a());
        }
        c0947q = C0947q.m3238b();
        return m3237a(c0947q.f2513b, c0947q.m3240a());
    }

    /* renamed from: a */
    private boolean m3237a(long j, String str) {
        synchronized (this.f2512a) {
            if (str != null) {
                if (!str.equals(this.f2514c) && m3236a(j)) {
                    this.f2513b = j;
                    this.f2514c = str;
                    return 1;
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    private boolean m3236a(long j) {
        return j - this.f2513b > DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL ? 1 : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f2513b);
        stringBuilder.append(",");
        stringBuilder.append(this.f2514c);
        return stringBuilder.toString();
    }

    /* renamed from: c */
    private long m3239c() {
        return this.f2513b;
    }

    /* renamed from: a */
    final String m3240a() {
        return this.f2514c;
    }
}
