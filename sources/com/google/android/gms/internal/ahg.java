package com.google.android.gms.internal;

import java.security.MessageDigest;

@zzzv
public final class ahg extends agy {
    /* renamed from: b */
    private MessageDigest f22950b;
    /* renamed from: c */
    private final int f22951c;
    /* renamed from: d */
    private final int f22952d;

    public ahg(int i) {
        int i2 = i / 8;
        if (i % 8 > 0) {
            i2++;
        }
        this.f22951c = i2;
        this.f22952d = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final byte[] mo4244a(java.lang.String r11) {
        /*
        r10 = this;
        r0 = r10.a;
        monitor-enter(r0);
        r1 = r10.m19160a();	 Catch:{ all -> 0x006f }
        r10.f22950b = r1;	 Catch:{ all -> 0x006f }
        r1 = r10.f22950b;	 Catch:{ all -> 0x006f }
        r2 = 0;
        if (r1 != 0) goto L_0x0012;
    L_0x000e:
        r11 = new byte[r2];	 Catch:{ all -> 0x006f }
        monitor-exit(r0);	 Catch:{ all -> 0x006f }
        return r11;
    L_0x0012:
        r1 = r10.f22950b;	 Catch:{ all -> 0x006f }
        r1.reset();	 Catch:{ all -> 0x006f }
        r1 = r10.f22950b;	 Catch:{ all -> 0x006f }
        r3 = "UTF-8";
        r3 = java.nio.charset.Charset.forName(r3);	 Catch:{ all -> 0x006f }
        r11 = r11.getBytes(r3);	 Catch:{ all -> 0x006f }
        r1.update(r11);	 Catch:{ all -> 0x006f }
        r11 = r10.f22950b;	 Catch:{ all -> 0x006f }
        r11 = r11.digest();	 Catch:{ all -> 0x006f }
        r1 = r11.length;	 Catch:{ all -> 0x006f }
        r3 = r10.f22951c;	 Catch:{ all -> 0x006f }
        if (r1 <= r3) goto L_0x0034;
    L_0x0031:
        r1 = r10.f22951c;	 Catch:{ all -> 0x006f }
        goto L_0x0035;
    L_0x0034:
        r1 = r11.length;	 Catch:{ all -> 0x006f }
    L_0x0035:
        r1 = new byte[r1];	 Catch:{ all -> 0x006f }
        r3 = r1.length;	 Catch:{ all -> 0x006f }
        java.lang.System.arraycopy(r11, r2, r1, r2, r3);	 Catch:{ all -> 0x006f }
        r11 = r10.f22952d;	 Catch:{ all -> 0x006f }
        r3 = 8;
        r11 = r11 % r3;
        if (r11 <= 0) goto L_0x006d;
    L_0x0042:
        r4 = 0;
    L_0x0044:
        r11 = r1.length;	 Catch:{ all -> 0x006f }
        if (r2 >= r11) goto L_0x0055;
    L_0x0047:
        if (r2 <= 0) goto L_0x004a;
    L_0x0049:
        r4 = r4 << r3;
    L_0x004a:
        r11 = r1[r2];	 Catch:{ all -> 0x006f }
        r11 = r11 & 255;
        r6 = (long) r11;	 Catch:{ all -> 0x006f }
        r8 = r4 + r6;
        r2 = r2 + 1;
        r4 = r8;
        goto L_0x0044;
    L_0x0055:
        r11 = r10.f22952d;	 Catch:{ all -> 0x006f }
        r11 = r11 % r3;
        r11 = 8 - r11;
        r4 = r4 >>> r11;
        r11 = r10.f22951c;	 Catch:{ all -> 0x006f }
        r11 = r11 + -1;
    L_0x005f:
        if (r11 < 0) goto L_0x006d;
    L_0x0061:
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r8 = r4 & r6;
        r2 = (int) r8;	 Catch:{ all -> 0x006f }
        r2 = (byte) r2;	 Catch:{ all -> 0x006f }
        r1[r11] = r2;	 Catch:{ all -> 0x006f }
        r4 = r4 >>> r3;
        r11 = r11 + -1;
        goto L_0x005f;
    L_0x006d:
        monitor-exit(r0);	 Catch:{ all -> 0x006f }
        return r1;
    L_0x006f:
        r11 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x006f }
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ahg.a(java.lang.String):byte[]");
    }
}
