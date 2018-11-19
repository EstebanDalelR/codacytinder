package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.gms.tasks.n */
final class C4510n<TResult> {
    /* renamed from: a */
    private final Object f16751a = new Object();
    /* renamed from: b */
    private Queue<C4509m<TResult>> f16752b;
    /* renamed from: c */
    private boolean f16753c;

    C4510n() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m20381a(@android.support.annotation.NonNull com.google.android.gms.tasks.C4500a<TResult> r3) {
        /*
        r2 = this;
        r0 = r2.f16751a;
        monitor-enter(r0);
        r1 = r2.f16752b;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x002a;
    L_0x0007:
        r1 = r2.f16753c;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x002a;
    L_0x000c:
        r1 = 1;
        r2.f16753c = r1;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
    L_0x0010:
        r1 = r2.f16751a;
        monitor-enter(r1);
        r0 = r2.f16752b;	 Catch:{ all -> 0x0027 }
        r0 = r0.poll();	 Catch:{ all -> 0x0027 }
        r0 = (com.google.android.gms.tasks.C4509m) r0;	 Catch:{ all -> 0x0027 }
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        r3 = 0;
        r2.f16753c = r3;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        return;
    L_0x0022:
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        r0.mo4754a(r3);
        goto L_0x0010;
    L_0x0027:
        r3 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        throw r3;
    L_0x002a:
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        return;
    L_0x002c:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.n.a(com.google.android.gms.tasks.a):void");
    }

    /* renamed from: a */
    public final void m20382a(@NonNull C4509m<TResult> c4509m) {
        synchronized (this.f16751a) {
            if (this.f16752b == null) {
                this.f16752b = new ArrayDeque();
            }
            this.f16752b.add(c4509m);
        }
    }
}
