package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class gw {
    /* renamed from: e */
    private static Comparator<byte[]> f16120e = new hv();
    /* renamed from: a */
    private final List<byte[]> f16121a = new LinkedList();
    /* renamed from: b */
    private final List<byte[]> f16122b = new ArrayList(64);
    /* renamed from: c */
    private int f16123c = 0;
    /* renamed from: d */
    private final int f16124d = 4096;

    public gw(int i) {
    }

    /* renamed from: a */
    private final synchronized void m19833a() {
        while (this.f16123c > this.f16124d) {
            byte[] bArr = (byte[]) this.f16121a.remove(0);
            this.f16122b.remove(bArr);
            this.f16123c -= bArr.length;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final synchronized void m19834a(byte[] r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        if (r3 == 0) goto L_0x002e;
    L_0x0003:
        r0 = r3.length;	 Catch:{ all -> 0x002b }
        r1 = r2.f16124d;	 Catch:{ all -> 0x002b }
        if (r0 <= r1) goto L_0x0009;
    L_0x0008:
        goto L_0x002e;
    L_0x0009:
        r0 = r2.f16121a;	 Catch:{ all -> 0x002b }
        r0.add(r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f16122b;	 Catch:{ all -> 0x002b }
        r1 = f16120e;	 Catch:{ all -> 0x002b }
        r0 = java.util.Collections.binarySearch(r0, r3, r1);	 Catch:{ all -> 0x002b }
        if (r0 >= 0) goto L_0x001b;
    L_0x0018:
        r0 = -r0;
        r0 = r0 + -1;
    L_0x001b:
        r1 = r2.f16122b;	 Catch:{ all -> 0x002b }
        r1.add(r0, r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f16123c;	 Catch:{ all -> 0x002b }
        r3 = r3.length;	 Catch:{ all -> 0x002b }
        r0 = r0 + r3;
        r2.f16123c = r0;	 Catch:{ all -> 0x002b }
        r2.m19833a();	 Catch:{ all -> 0x002b }
        monitor-exit(r2);
        return;
    L_0x002b:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
    L_0x002e:
        monitor-exit(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gw.a(byte[]):void");
    }

    /* renamed from: a */
    public final synchronized byte[] m19835a(int i) {
        for (int i2 = 0; i2 < this.f16122b.size(); i2++) {
            byte[] bArr = (byte[]) this.f16122b.get(i2);
            if (bArr.length >= i) {
                this.f16123c -= bArr.length;
                this.f16122b.remove(i2);
                this.f16121a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
