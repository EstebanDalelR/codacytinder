package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4501b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.f */
public final class C2477f {
    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f7535a = Collections.synchronizedMap(new WeakHashMap());
    /* renamed from: b */
    private final Map<C4501b<?>, Boolean> f7536b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    private final void m9005a(boolean z, Status status) {
        synchronized (this.f7535a) {
            Map hashMap = new HashMap(this.f7535a);
        }
        synchronized (this.f7536b) {
            Map hashMap2 = new HashMap(this.f7536b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m14226b(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C4501b) entry2.getKey()).b(new ApiException(status));
            }
        }
    }

    /* renamed from: a */
    final void m9007a(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        this.f7535a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo2486a(new C3797g(this, basePendingResult));
    }

    /* renamed from: a */
    final <TResult> void m9008a(C4501b<TResult> c4501b, boolean z) {
        this.f7536b.put(c4501b, Boolean.valueOf(z));
        c4501b.a().a(new C3798h(this, c4501b));
    }

    /* renamed from: a */
    final boolean m9009a() {
        if (this.f7535a.isEmpty()) {
            if (this.f7536b.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void m9010b() {
        m9005a(false, al.f7459a);
    }

    /* renamed from: c */
    public final void m9011c() {
        m9005a(true, by.f7510a);
    }
}
