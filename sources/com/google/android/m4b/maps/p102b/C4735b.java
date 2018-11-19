package com.google.android.m4b.maps.p102b;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.b.b */
public final class C4735b {
    /* renamed from: e */
    private static Comparator<byte[]> f17372e = new C47341();
    /* renamed from: a */
    private List<byte[]> f17373a = new LinkedList();
    /* renamed from: b */
    private List<byte[]> f17374b = new ArrayList(64);
    /* renamed from: c */
    private int f17375c = 0;
    /* renamed from: d */
    private final int f17376d;

    /* renamed from: com.google.android.m4b.maps.b.b$1 */
    static class C47341 implements Comparator<byte[]> {
        C47341() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((byte[]) obj).length - ((byte[]) obj2).length;
        }
    }

    public C4735b(int i) {
        this.f17376d = i;
    }

    /* renamed from: a */
    public final synchronized byte[] m21074a(int i) {
        for (int i2 = 0; i2 < this.f17374b.size(); i2++) {
            byte[] bArr = (byte[]) this.f17374b.get(i2);
            if (bArr.length >= i) {
                this.f17375c -= bArr.length;
                this.f17374b.remove(i2);
                this.f17373a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final synchronized void m21073a(byte[] r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        if (r3 == 0) goto L_0x002e;
    L_0x0003:
        r0 = r3.length;	 Catch:{ all -> 0x002b }
        r1 = r2.f17376d;	 Catch:{ all -> 0x002b }
        if (r0 <= r1) goto L_0x0009;
    L_0x0008:
        goto L_0x002e;
    L_0x0009:
        r0 = r2.f17373a;	 Catch:{ all -> 0x002b }
        r0.add(r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f17374b;	 Catch:{ all -> 0x002b }
        r1 = f17372e;	 Catch:{ all -> 0x002b }
        r0 = java.util.Collections.binarySearch(r0, r3, r1);	 Catch:{ all -> 0x002b }
        if (r0 >= 0) goto L_0x001b;
    L_0x0018:
        r0 = -r0;
        r0 = r0 + -1;
    L_0x001b:
        r1 = r2.f17374b;	 Catch:{ all -> 0x002b }
        r1.add(r0, r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f17375c;	 Catch:{ all -> 0x002b }
        r3 = r3.length;	 Catch:{ all -> 0x002b }
        r0 = r0 + r3;
        r2.f17375c = r0;	 Catch:{ all -> 0x002b }
        r2.m21072a();	 Catch:{ all -> 0x002b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.b.b.a(byte[]):void");
    }

    /* renamed from: a */
    private synchronized void m21072a() {
        while (this.f17375c > this.f17376d) {
            byte[] bArr = (byte[]) this.f17373a.remove(0);
            this.f17374b.remove(bArr);
            this.f17375c -= bArr.length;
        }
    }
}
