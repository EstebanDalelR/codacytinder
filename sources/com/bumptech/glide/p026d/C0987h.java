package com.bumptech.glide.p026d;

import android.graphics.Bitmap.Config;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.d.h */
public final class C0987h {
    /* renamed from: a */
    private static final char[] f2681a = "0123456789abcdef".toCharArray();
    /* renamed from: b */
    private static final char[] f2682b = new char[64];
    /* renamed from: c */
    private static final char[] f2683c = new char[40];

    /* renamed from: com.bumptech.glide.d.h$1 */
    static /* synthetic */ class C09861 {
        /* renamed from: a */
        static final /* synthetic */ int[] f2680a = new int[Config.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = android.graphics.Bitmap.Config.values();
            r0 = r0.length;
            r0 = new int[r0];
            f2680a = r0;
            r0 = f2680a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.graphics.Bitmap.Config.ALPHA_8;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f2680a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f2680a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.graphics.Bitmap.Config.ARGB_4444;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f2680a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.h.1.<clinit>():void");
        }
    }

    /* renamed from: b */
    private static boolean m3414b(int i) {
        if (i <= 0) {
            if (i != Integer.MIN_VALUE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m3407a(byte[] bArr) {
        synchronized (f2682b) {
            bArr = C0987h.m3408a(bArr, f2682b);
        }
        return bArr;
    }

    /* renamed from: a */
    private static String m3408a(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = f2681a[i2 >>> 4];
            cArr[i3 + 1] = f2681a[i2 & 15];
        }
        return new String(cArr);
    }

    @android.annotation.TargetApi(19)
    /* renamed from: a */
    public static int m3406a(android.graphics.Bitmap r2) {
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
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 19;
        if (r0 < r1) goto L_0x000b;
    L_0x0006:
        r0 = r2.getAllocationByteCount();	 Catch:{ NullPointerException -> 0x000b }
        return r0;
    L_0x000b:
        r0 = r2.getHeight();
        r2 = r2.getRowBytes();
        r0 = r0 * r2;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.h.a(android.graphics.Bitmap):int");
    }

    /* renamed from: a */
    public static int m3404a(int i, int i2, Config config) {
        return (i * i2) * C0987h.m3405a(config);
    }

    /* renamed from: a */
    private static int m3405a(Config config) {
        if (config == null) {
            config = Config.ARGB_8888;
        }
        switch (C09861.f2680a[config.ordinal()]) {
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    /* renamed from: a */
    public static boolean m3412a(int i, int i2) {
        return (C0987h.m3414b(i) == 0 || C0987h.m3414b(i2) == 0) ? false : true;
    }

    /* renamed from: a */
    public static void m3411a() {
        if (!C0987h.m3415c()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static void m3413b() {
        if (!C0987h.m3416d()) {
            throw new IllegalArgumentException("YOu must call this method on a background thread");
        }
    }

    /* renamed from: c */
    public static boolean m3415c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: d */
    public static boolean m3416d() {
        return C0987h.m3415c() ^ 1;
    }

    /* renamed from: a */
    public static <T> Queue<T> m3410a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static <T> List<T> m3409a(Collection<T> collection) {
        List<T> arrayList = new ArrayList(collection.size());
        for (T add : collection) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
