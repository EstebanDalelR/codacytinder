package com.google.android.gms.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

final class pp {
    /* renamed from: a */
    static CountDownLatch f16392a = new CountDownLatch(1);
    /* renamed from: b */
    private static boolean f16393b = false;
    /* renamed from: c */
    private static MessageDigest f16394c;
    /* renamed from: d */
    private static final Object f16395d = new Object();
    /* renamed from: e */
    private static final Object f16396e = new Object();

    /* renamed from: a */
    private static nx m20138a(long j) {
        nx nxVar = new nx();
        nxVar.f26985k = Long.valueOf(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return nxVar;
    }

    /* renamed from: a */
    static String m20139a(nx nxVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] a = aee.m19058a((aee) nxVar);
        if (((Boolean) aja.m19221f().m19334a(alo.by)).booleanValue()) {
            a = m20144a(a, str);
        } else if (ps.f16397a == null) {
            throw new GeneralSecurityException();
        } else {
            a = ps.f16397a.zzd(a, str != null ? str.getBytes() : new byte[0]);
            aee ogVar = new og();
            ogVar.f27041a = new byte[][]{a};
            ogVar.f27043c = Integer.valueOf(2);
            a = aee.m19058a(ogVar);
        }
        return pn.m20136a(a, true);
    }

    /* renamed from: a */
    private static java.util.Vector<byte[]> m20141a(byte[] r6, int r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r7 = 0;
        if (r6 == 0) goto L_0x002c;
    L_0x0003:
        r0 = r6.length;
        if (r0 > 0) goto L_0x0007;
    L_0x0006:
        return r7;
    L_0x0007:
        r0 = r6.length;
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r0 + r1;
        r0 = r0 + -1;
        r0 = r0 / r1;
        r2 = new java.util.Vector;
        r2.<init>();
        r3 = 0;
    L_0x0014:
        if (r3 >= r0) goto L_0x002b;
    L_0x0016:
        r4 = r3 * 255;
        r5 = r6.length;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        r5 = r5 - r4;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        if (r5 <= r1) goto L_0x001f;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
    L_0x001c:
        r5 = r4 + 255;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        goto L_0x0020;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
    L_0x001f:
        r5 = r6.length;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
    L_0x0020:
        r4 = java.util.Arrays.copyOfRange(r6, r4, r5);	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        r2.add(r4);	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        r3 = r3 + 1;
        goto L_0x0014;
    L_0x002a:
        return r7;
    L_0x002b:
        return r2;
    L_0x002c:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pp.a(byte[], int):java.util.Vector<byte[]>");
    }

    /* renamed from: a */
    static void m20142a() {
        synchronized (f16396e) {
            if (!f16393b) {
                f16393b = true;
                new Thread(new pr()).start();
            }
        }
    }

    /* renamed from: a */
    public static byte[] m20143a(byte[] bArr) throws NoSuchAlgorithmException {
        synchronized (f16395d) {
            MessageDigest b = m20146b();
            if (b == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            b.reset();
            b.update(bArr);
            bArr = f16394c.digest();
        }
        return bArr;
    }

    /* renamed from: a */
    private static byte[] m20144a(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector a = m20141a(bArr, 255);
        if (a != null) {
            if (a.size() != 0) {
                aee ogVar = new og();
                ogVar.f27041a = new byte[a.size()][];
                Iterator it = a.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    ogVar.f27041a[i] = m20145a((byte[]) it.next(), str, false);
                    i = i2;
                }
                ogVar.f27042b = m20143a(bArr);
                return aee.m19058a(ogVar);
            }
        }
        return m20145a(aee.m19058a(m20138a((long) PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)), str, true);
    }

    /* renamed from: a */
    private static byte[] m20145a(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer put;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = aee.m19058a(m20138a((long) PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM));
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr);
        }
        bArr = put.array();
        if (z) {
            bArr = ByteBuffer.allocate(256).put(m20143a(bArr)).put(bArr).array();
        }
        byte[] bArr3 = new byte[256];
        new pu().m20149a(bArr, bArr3);
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new aay(str.getBytes("UTF-8")).m18810a(bArr3);
        }
        return bArr3;
    }

    /* renamed from: b */
    private static java.security.MessageDigest m20146b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        m20142a();
        r0 = f16392a;	 Catch:{ InterruptedException -> 0x000e }
        r1 = 2;	 Catch:{ InterruptedException -> 0x000e }
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x000e }
        r0 = r0.await(r1, r3);	 Catch:{ InterruptedException -> 0x000e }
        goto L_0x000f;
    L_0x000e:
        r0 = 0;
    L_0x000f:
        r1 = 0;
        if (r0 != 0) goto L_0x0013;
    L_0x0012:
        return r1;
    L_0x0013:
        r0 = f16394c;
        if (r0 != 0) goto L_0x0018;
    L_0x0017:
        return r1;
    L_0x0018:
        r0 = f16394c;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pp.b():java.security.MessageDigest");
    }
}
