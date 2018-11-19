package com.google.android.m4b.maps.cg;

import android.content.SharedPreferences;
import com.google.android.m4b.maps.ay.C4718l;
import com.google.android.m4b.maps.ay.C6407a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.cg.i */
public final class C7511i extends C6407a {
    /* renamed from: a */
    private SharedPreferences f28020a;
    /* renamed from: b */
    private C5178a f28021b;
    /* renamed from: c */
    private C5184n f28022c;
    /* renamed from: d */
    private long f28023d = 0;

    /* renamed from: com.google.android.m4b.maps.cg.i$a */
    public interface C5178a {
        /* renamed from: a */
        void mo4948a();
    }

    public C7511i(C5184n c5184n, SharedPreferences sharedPreferences, C5178a c5178a) {
        this.f28022c = c5184n;
        this.f28020a = sharedPreferences;
        this.f28021b = c5178a;
    }

    /* renamed from: a */
    public final void m33010a(long j) {
        if (!this.f28022c.m23169a(false)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f28020a.getLong("LAST_FETCH_PERSISTENT_TAG", currentTimeMillis) > j) {
                this.f28021b.mo4948a();
            }
        }
    }

    /* renamed from: a */
    public final void mo4873a(C4718l c4718l) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f28023d > TimeUnit.HOURS.toMillis(1)) {
            this.f28020a.edit().putLong("LAST_FETCH_PERSISTENT_TAG", currentTimeMillis).commit();
            this.f28023d = currentTimeMillis;
        }
    }
}
