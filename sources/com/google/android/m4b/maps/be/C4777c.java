package com.google.android.m4b.maps.be;

import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.be.c */
public abstract class C4777c<T> {
    /* renamed from: a */
    private final int f17459a;
    /* renamed from: b */
    private final LinkedList<SoftReference<T>> f17460b = new LinkedList();
    /* renamed from: c */
    private int f17461c;
    /* renamed from: d */
    private int f17462d;

    /* renamed from: a */
    protected abstract T mo5015a();

    public C4777c(int i) {
        this.f17459a = i;
    }

    /* renamed from: a */
    public final void m21163a(List<T> list) {
        synchronized (this.f17460b) {
            for (Object next : list) {
                if (this.f17460b.size() == this.f17459a) {
                    this.f17460b.removeFirst();
                }
                this.f17460b.add(new SoftReference(next));
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final T m21164b() {
        /*
        r3 = this;
        r0 = r3.f17460b;
        monitor-enter(r0);
        r1 = r3.f17460b;	 Catch:{ all -> 0x002d }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x002d }
        if (r1 != 0) goto L_0x0021;
    L_0x000b:
        r1 = r3.f17460b;	 Catch:{ all -> 0x002d }
        r1 = r1.removeLast();	 Catch:{ all -> 0x002d }
        r1 = (java.lang.ref.SoftReference) r1;	 Catch:{ all -> 0x002d }
        r1 = r1.get();	 Catch:{ all -> 0x002d }
        if (r1 == 0) goto L_0x0021;
    L_0x0019:
        r2 = r3.f17462d;	 Catch:{ all -> 0x002d }
        r2 = r2 + 1;
        r3.f17462d = r2;	 Catch:{ all -> 0x002d }
        monitor-exit(r0);	 Catch:{ all -> 0x002d }
        return r1;
    L_0x0021:
        monitor-exit(r0);	 Catch:{ all -> 0x002d }
        r0 = r3.f17461c;
        r0 = r0 + 1;
        r3.f17461c = r0;
        r0 = r3.mo5015a();
        return r0;
    L_0x002d:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002d }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.be.c.b():T");
    }
}
