package com.google.android.m4b.maps.p112l;

import android.os.SystemClock;
import android.support.v4.util.C0562m;
import android.util.Log;

/* renamed from: com.google.android.m4b.maps.l.f */
public final class C5474f {
    /* renamed from: a */
    private final long f20472a;
    /* renamed from: b */
    private final int f20473b;
    /* renamed from: c */
    private final C0562m<String, Long> f20474c;

    public C5474f() {
        this.f20472a = 60000;
        this.f20473b = 10;
        this.f20474c = new C0562m(10);
    }

    public C5474f(int i, long j) {
        this.f20472a = j;
        this.f20473b = 1024;
        this.f20474c = new C0562m();
    }

    /* renamed from: a */
    public final Long m23827a(String str) {
        Long l;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f20472a;
        synchronized (this) {
            while (this.f20474c.size() >= this.f20473b) {
                for (int size = this.f20474c.size() - 1; size >= 0; size--) {
                    if (elapsedRealtime - ((Long) this.f20474c.c(size)).longValue() > j) {
                        this.f20474c.d(size);
                    }
                }
                j /= 2;
                int i = this.f20473b;
                StringBuilder stringBuilder = new StringBuilder(94);
                stringBuilder.append("The max capacity ");
                stringBuilder.append(i);
                stringBuilder.append(" is not enough. Current durationThreshold is: ");
                stringBuilder.append(j);
                Log.w("ConnectionTracker", stringBuilder.toString());
            }
            l = (Long) this.f20474c.put(str, Long.valueOf(elapsedRealtime));
        }
        return l;
    }

    /* renamed from: b */
    public final boolean m23828b(String str) {
        synchronized (this) {
            str = this.f20474c.remove(str) != null ? true : null;
        }
        return str;
    }
}
