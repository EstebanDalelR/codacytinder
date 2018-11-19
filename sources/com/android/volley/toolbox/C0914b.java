package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.android.volley.toolbox.b */
public class C0914b {
    /* renamed from: a */
    protected static final Comparator<byte[]> f2388a = new C09131();
    /* renamed from: b */
    private List<byte[]> f2389b = new LinkedList();
    /* renamed from: c */
    private List<byte[]> f2390c = new ArrayList(64);
    /* renamed from: d */
    private int f2391d = 0;
    /* renamed from: e */
    private final int f2392e;

    /* renamed from: com.android.volley.toolbox.b$1 */
    static class C09131 implements Comparator<byte[]> {
        C09131() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m3061a((byte[]) obj, (byte[]) obj2);
        }

        /* renamed from: a */
        public int m3061a(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public C0914b(int i) {
        this.f2392e = i;
    }

    /* renamed from: a */
    public synchronized byte[] m3064a(int i) {
        for (int i2 = 0; i2 < this.f2390c.size(); i2++) {
            byte[] bArr = (byte[]) this.f2390c.get(i2);
            if (bArr.length >= i) {
                this.f2391d -= bArr.length;
                this.f2390c.remove(i2);
                this.f2389b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized void m3063a(byte[] r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        if (r3 == 0) goto L_0x002e;
    L_0x0003:
        r0 = r3.length;	 Catch:{ all -> 0x002b }
        r1 = r2.f2392e;	 Catch:{ all -> 0x002b }
        if (r0 <= r1) goto L_0x0009;
    L_0x0008:
        goto L_0x002e;
    L_0x0009:
        r0 = r2.f2389b;	 Catch:{ all -> 0x002b }
        r0.add(r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f2390c;	 Catch:{ all -> 0x002b }
        r1 = f2388a;	 Catch:{ all -> 0x002b }
        r0 = java.util.Collections.binarySearch(r0, r3, r1);	 Catch:{ all -> 0x002b }
        if (r0 >= 0) goto L_0x001b;
    L_0x0018:
        r0 = -r0;
        r0 = r0 + -1;
    L_0x001b:
        r1 = r2.f2390c;	 Catch:{ all -> 0x002b }
        r1.add(r0, r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f2391d;	 Catch:{ all -> 0x002b }
        r3 = r3.length;	 Catch:{ all -> 0x002b }
        r0 = r0 + r3;
        r2.f2391d = r0;	 Catch:{ all -> 0x002b }
        r2.m3062a();	 Catch:{ all -> 0x002b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.b.a(byte[]):void");
    }

    /* renamed from: a */
    private synchronized void m3062a() {
        while (this.f2391d > this.f2392e) {
            byte[] bArr = (byte[]) this.f2389b.remove(0);
            this.f2390c.remove(bArr);
            this.f2391d -= bArr.length;
        }
    }
}
