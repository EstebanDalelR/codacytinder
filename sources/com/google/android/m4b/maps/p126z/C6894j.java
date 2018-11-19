package com.google.android.m4b.maps.p126z;

import com.google.android.m4b.maps.p126z.C5609n.C5606a;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.google.android.m4b.maps.z.j */
final class C6894j extends C5609n implements C5600h, Serializable {
    private static final long serialVersionUID = 7249069246863182397L;

    /* renamed from: a */
    final long mo5861a(long j, long j2) {
        return j + j2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo5860a(long r14) {
        /*
        r13 = this;
        r0 = r13.c;
        if (r0 != 0) goto L_0x000e;
    L_0x0004:
        r1 = r13.d;
        r3 = r1 + r14;
        r1 = r13.m24448b(r1, r3);
        if (r1 != 0) goto L_0x00f6;
    L_0x000e:
        r1 = a;
        r1 = r1.get();
        r1 = (com.google.android.m4b.maps.p126z.C5609n.C5607b) r1;
        r2 = r1.f20699a;
        r3 = 1;
        if (r0 == 0) goto L_0x002f;
    L_0x001b:
        r4 = r0.length;
        if (r4 <= 0) goto L_0x002f;
    L_0x001e:
        r4 = r4 - r3;
        r2 = r2 & r4;
        r0 = r0[r2];
        if (r0 == 0) goto L_0x002f;
    L_0x0024:
        r4 = r0.f20697a;
        r6 = r4 + r14;
        r0 = r0.m24443a(r4, r6);
        if (r0 != 0) goto L_0x00f6;
    L_0x002e:
        goto L_0x0030;
    L_0x002f:
        r0 = 1;
    L_0x0030:
        r2 = r1.f20699a;
        r4 = 0;
    L_0x0033:
        r5 = 0;
    L_0x0034:
        r6 = r13.f20705c;
        if (r6 == 0) goto L_0x00bb;
    L_0x0038:
        r7 = r6.length;
        if (r7 <= 0) goto L_0x00bb;
    L_0x003b:
        r8 = r7 + -1;
        r8 = r8 & r2;
        r8 = r6[r8];
        if (r8 != 0) goto L_0x0070;
    L_0x0042:
        r6 = r13.f20707e;
        r6 = new com.google.android.m4b.maps.z.n$a;
        r6.<init>(r14);
        r7 = r13.f20707e;
        r7 = r13.m24447b();
        if (r7 == 0) goto L_0x006e;
    L_0x0051:
        r7 = r13.f20705c;	 Catch:{ all -> 0x006a }
        if (r7 == 0) goto L_0x0063;
    L_0x0055:
        r8 = r7.length;	 Catch:{ all -> 0x006a }
        if (r8 <= 0) goto L_0x0063;
    L_0x0058:
        r8 = r8 + -1;
        r8 = r8 & r2;
        r9 = r7[r8];	 Catch:{ all -> 0x006a }
        if (r9 != 0) goto L_0x0063;
    L_0x005f:
        r7[r8] = r6;	 Catch:{ all -> 0x006a }
        r6 = 1;
        goto L_0x0064;
    L_0x0063:
        r6 = 0;
    L_0x0064:
        r13.f20707e = r4;
        if (r6 == 0) goto L_0x0034;
    L_0x0068:
        goto L_0x00f4;
    L_0x006a:
        r14 = move-exception;
        r13.f20707e = r4;
        throw r14;
    L_0x006e:
        r5 = 0;
        goto L_0x00b0;
    L_0x0070:
        if (r0 != 0) goto L_0x0074;
    L_0x0072:
        r0 = 1;
        goto L_0x00b0;
    L_0x0074:
        r9 = r8.f20697a;
        r11 = r13.mo5861a(r9, r14);
        r8 = r8.m24443a(r9, r11);
        if (r8 != 0) goto L_0x00f4;
    L_0x0080:
        r8 = com.google.android.m4b.maps.p126z.C5609n.f20701b;
        if (r7 >= r8) goto L_0x006e;
    L_0x0084:
        r8 = r13.f20705c;
        if (r8 == r6) goto L_0x0089;
    L_0x0088:
        goto L_0x006e;
    L_0x0089:
        if (r5 != 0) goto L_0x008d;
    L_0x008b:
        r5 = 1;
        goto L_0x00b0;
    L_0x008d:
        r8 = r13.f20707e;
        r8 = r13.m24447b();
        if (r8 == 0) goto L_0x00b0;
    L_0x0095:
        r5 = r13.f20705c;	 Catch:{ all -> 0x00ac }
        if (r5 != r6) goto L_0x00a9;
    L_0x0099:
        r5 = r7 << 1;
        r5 = new com.google.android.m4b.maps.p126z.C5609n.C5606a[r5];	 Catch:{ all -> 0x00ac }
        r8 = 0;
    L_0x009e:
        if (r8 >= r7) goto L_0x00a7;
    L_0x00a0:
        r9 = r6[r8];	 Catch:{ all -> 0x00ac }
        r5[r8] = r9;	 Catch:{ all -> 0x00ac }
        r8 = r8 + 1;
        goto L_0x009e;
    L_0x00a7:
        r13.f20705c = r5;	 Catch:{ all -> 0x00ac }
    L_0x00a9:
        r13.f20707e = r4;
        goto L_0x0033;
    L_0x00ac:
        r14 = move-exception;
        r13.f20707e = r4;
        throw r14;
    L_0x00b0:
        r6 = r2 << 13;
        r2 = r2 ^ r6;
        r6 = r2 >>> 17;
        r2 = r2 ^ r6;
        r6 = r2 << 5;
        r2 = r2 ^ r6;
        goto L_0x0034;
    L_0x00bb:
        r7 = r13.f20707e;
        r7 = r13.f20705c;
        if (r7 != r6) goto L_0x00e6;
    L_0x00c1:
        r7 = r13.m24447b();
        if (r7 == 0) goto L_0x00e6;
    L_0x00c7:
        r7 = r13.f20705c;	 Catch:{ all -> 0x00e2 }
        if (r7 != r6) goto L_0x00db;
    L_0x00cb:
        r6 = 2;
        r6 = new com.google.android.m4b.maps.p126z.C5609n.C5606a[r6];	 Catch:{ all -> 0x00e2 }
        r7 = r2 & 1;
        r8 = new com.google.android.m4b.maps.z.n$a;	 Catch:{ all -> 0x00e2 }
        r8.<init>(r14);	 Catch:{ all -> 0x00e2 }
        r6[r7] = r8;	 Catch:{ all -> 0x00e2 }
        r13.f20705c = r6;	 Catch:{ all -> 0x00e2 }
        r6 = 1;
        goto L_0x00dc;
    L_0x00db:
        r6 = 0;
    L_0x00dc:
        r13.f20707e = r4;
        if (r6 != 0) goto L_0x00f4;
    L_0x00e0:
        goto L_0x0034;
    L_0x00e2:
        r14 = move-exception;
        r13.f20707e = r4;
        throw r14;
    L_0x00e6:
        r6 = r13.f20706d;
        r8 = r13.mo5861a(r6, r14);
        r6 = r13.m24448b(r6, r8);
        if (r6 != 0) goto L_0x00f4;
    L_0x00f2:
        goto L_0x0034;
    L_0x00f4:
        r1.f20699a = r2;
    L_0x00f6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.z.j.a(long):void");
    }

    /* renamed from: a */
    public final void mo5859a() {
        mo5860a(1);
    }

    /* renamed from: d */
    private long m30455d() {
        long j = this.d;
        C5606a[] c5606aArr = this.c;
        if (c5606aArr != null) {
            for (C5606a c5606a : c5606aArr) {
                if (c5606a != null) {
                    j += c5606a.f20697a;
                }
            }
        }
        return j;
    }

    public final String toString() {
        return Long.toString(m30455d());
    }

    public final long longValue() {
        return m30455d();
    }

    public final int intValue() {
        return (int) m30455d();
    }

    public final float floatValue() {
        return (float) m30455d();
    }

    public final double doubleValue() {
        return (double) m30455d();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(m30455d());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.e = 0;
        this.c = null;
        this.d = objectInputStream.readLong();
    }
}
