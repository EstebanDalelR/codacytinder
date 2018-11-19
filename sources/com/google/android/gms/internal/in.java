package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@zzzv
final class in {
    /* renamed from: a */
    private final Object f16190a = new Object();
    /* renamed from: b */
    private final List<Runnable> f16191b = new ArrayList();
    /* renamed from: c */
    private boolean f16192c = false;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m19932a() {
        /*
        r4 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r4.f16190a;
        monitor-enter(r1);
        r2 = r4.f16192c;	 Catch:{ all -> 0x0032 }
        if (r2 == 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
        return;
    L_0x000e:
        r2 = r4.f16191b;	 Catch:{ all -> 0x0032 }
        r0.addAll(r2);	 Catch:{ all -> 0x0032 }
        r2 = r4.f16191b;	 Catch:{ all -> 0x0032 }
        r2.clear();	 Catch:{ all -> 0x0032 }
        r2 = 1;
        r4.f16192c = r2;	 Catch:{ all -> 0x0032 }
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
        r0 = (java.util.ArrayList) r0;
        r1 = r0.size();
        r2 = 0;
    L_0x0023:
        if (r2 >= r1) goto L_0x0031;
    L_0x0025:
        r3 = r0.get(r2);
        r2 = r2 + 1;
        r3 = (java.lang.Runnable) r3;
        r3.run();
        goto L_0x0023;
    L_0x0031:
        return;
    L_0x0032:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.in.a():void");
    }

    /* renamed from: a */
    public final void m19933a(Runnable runnable, Executor executor) {
        synchronized (this.f16190a) {
            if (this.f16192c) {
                executor.execute(runnable);
            } else {
                this.f16191b.add(new io(executor, runnable));
            }
        }
    }
}
