package com.google.android.gms.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class zr {
    /* renamed from: a */
    private final ConcurrentHashMap<zs, List<Throwable>> f16674a = new ConcurrentHashMap(16, 0.75f, 10);
    /* renamed from: b */
    private final ReferenceQueue<Throwable> f16675b = new ReferenceQueue();

    zr() {
    }

    /* renamed from: a */
    public final List<Throwable> m20294a(Throwable th, boolean z) {
        while (true) {
            Reference poll = this.f16675b.poll();
            if (poll != null) {
                this.f16674a.remove(poll);
            } else {
                return (List) this.f16674a.get(new zs(th, null));
            }
        }
    }
}
