package com.google.android.m4b.maps.az;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Environment;
import android.util.Pair;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import java.io.File;

/* renamed from: com.google.android.m4b.maps.az.b */
public final class C4733b {
    /* renamed from: a */
    private static final long[] f17370a;
    /* renamed from: b */
    private static int f17371b;

    /* renamed from: a */
    public static boolean m21066a() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    /* renamed from: a */
    public static com.google.android.m4b.maps.ar.C4662a m21063a(android.content.Context r5, java.lang.String r6, com.google.android.m4b.maps.ar.C4664b r7) {
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
        r0 = 3;
        r1 = 0;
        r2 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x004b, RuntimeException -> 0x0021, all -> 0x001e }
        r3 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x004b, RuntimeException -> 0x0021, all -> 0x001e }
        r5 = r5.openFileInput(r6);	 Catch:{ IOException -> 0x004b, RuntimeException -> 0x0021, all -> 0x001e }
        r4 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;	 Catch:{ IOException -> 0x004b, RuntimeException -> 0x0021, all -> 0x001e }
        r3.<init>(r5, r4);	 Catch:{ IOException -> 0x004b, RuntimeException -> 0x0021, all -> 0x001e }
        r2.<init>(r3);	 Catch:{ IOException -> 0x004b, RuntimeException -> 0x0021, all -> 0x001e }
        r5 = new com.google.android.m4b.maps.ar.a;	 Catch:{ IOException -> 0x004c, RuntimeException -> 0x0022 }
        r5.<init>(r7);	 Catch:{ IOException -> 0x004c, RuntimeException -> 0x0022 }
        r5.m20818a(r2);	 Catch:{ IOException -> 0x004c, RuntimeException -> 0x0022 }
        r2.close();	 Catch:{ IOException -> 0x001d }
    L_0x001d:
        return r5;
    L_0x001e:
        r5 = move-exception;
        r2 = r1;
        goto L_0x0076;
    L_0x0021:
        r2 = r1;
    L_0x0022:
        r5 = "MapsNavigation";	 Catch:{ all -> 0x0075 }
        r5 = com.google.android.m4b.maps.ay.C4728u.m21050a(r5, r0);	 Catch:{ all -> 0x0075 }
        if (r5 == 0) goto L_0x0045;	 Catch:{ all -> 0x0075 }
    L_0x002a:
        r5 = "MapsNavigation";	 Catch:{ all -> 0x0075 }
        r7 = "readProtoFromFile failed: ";	 Catch:{ all -> 0x0075 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0075 }
        r0 = r6.length();	 Catch:{ all -> 0x0075 }
        if (r0 == 0) goto L_0x003d;	 Catch:{ all -> 0x0075 }
    L_0x0038:
        r6 = r7.concat(r6);	 Catch:{ all -> 0x0075 }
        goto L_0x0042;	 Catch:{ all -> 0x0075 }
    L_0x003d:
        r6 = new java.lang.String;	 Catch:{ all -> 0x0075 }
        r6.<init>(r7);	 Catch:{ all -> 0x0075 }
    L_0x0042:
        android.util.Log.d(r5, r6);	 Catch:{ all -> 0x0075 }
    L_0x0045:
        if (r2 == 0) goto L_0x004a;
    L_0x0047:
        r2.close();	 Catch:{ IOException -> 0x004a }
    L_0x004a:
        return r1;
    L_0x004b:
        r2 = r1;
    L_0x004c:
        r5 = "MapsNavigation";	 Catch:{ all -> 0x0075 }
        r5 = com.google.android.m4b.maps.ay.C4728u.m21050a(r5, r0);	 Catch:{ all -> 0x0075 }
        if (r5 == 0) goto L_0x006f;	 Catch:{ all -> 0x0075 }
    L_0x0054:
        r5 = "MapsNavigation";	 Catch:{ all -> 0x0075 }
        r7 = "readProtoFromFile failed: ";	 Catch:{ all -> 0x0075 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0075 }
        r0 = r6.length();	 Catch:{ all -> 0x0075 }
        if (r0 == 0) goto L_0x0067;	 Catch:{ all -> 0x0075 }
    L_0x0062:
        r6 = r7.concat(r6);	 Catch:{ all -> 0x0075 }
        goto L_0x006c;	 Catch:{ all -> 0x0075 }
    L_0x0067:
        r6 = new java.lang.String;	 Catch:{ all -> 0x0075 }
        r6.<init>(r7);	 Catch:{ all -> 0x0075 }
    L_0x006c:
        android.util.Log.d(r5, r6);	 Catch:{ all -> 0x0075 }
    L_0x006f:
        if (r2 == 0) goto L_0x0074;
    L_0x0071:
        r2.close();	 Catch:{ IOException -> 0x0074 }
    L_0x0074:
        return r1;
    L_0x0075:
        r5 = move-exception;
    L_0x0076:
        if (r2 == 0) goto L_0x007b;
    L_0x0078:
        r2.close();	 Catch:{ IOException -> 0x007b }
    L_0x007b:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.az.b.a(android.content.Context, java.lang.String, com.google.android.m4b.maps.ar.b):com.google.android.m4b.maps.ar.a");
    }

    /* renamed from: a */
    public static boolean m21067a(android.content.Context r5, com.google.android.m4b.maps.ar.C4662a r6, java.lang.String r7) {
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
        r0 = 0;
        r1 = 0;
        r2 = new java.io.DataOutputStream;	 Catch:{ IOException -> 0x0016 }
        r3 = r5.openFileOutput(r7, r0);	 Catch:{ IOException -> 0x0016 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x0016 }
        r6.m20830b(r2);	 Catch:{ IOException -> 0x0013 }
        r2.close();	 Catch:{ IOException -> 0x0013 }
        r5 = 1;
        return r5;
    L_0x0013:
        r6 = move-exception;
        r1 = r2;
        goto L_0x0017;
    L_0x0016:
        r6 = move-exception;
    L_0x0017:
        r2 = "MapsNavigation";
        r3 = 3;
        r2 = com.google.android.m4b.maps.ay.C4728u.m21050a(r2, r3);
        if (r2 == 0) goto L_0x003f;
    L_0x0020:
        r2 = "MapsNavigation";
        r3 = "writeProtoToFile failed: ";
        r6 = r6.getMessage();
        r6 = java.lang.String.valueOf(r6);
        r4 = r6.length();
        if (r4 == 0) goto L_0x0037;
    L_0x0032:
        r6 = r3.concat(r6);
        goto L_0x003c;
    L_0x0037:
        r6 = new java.lang.String;
        r6.<init>(r3);
    L_0x003c:
        android.util.Log.d(r2, r6);
    L_0x003f:
        if (r1 == 0) goto L_0x004b;
    L_0x0041:
        r1.close();	 Catch:{ IOException -> 0x0044 }
    L_0x0044:
        r5 = r5.getFileStreamPath(r7);
        r5.delete();
    L_0x004b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.az.b.a(android.content.Context, com.google.android.m4b.maps.ar.a, java.lang.String):boolean");
    }

    /* renamed from: d */
    private static File m21071d(Context context) {
        if (!C4733b.m21066a()) {
            return context.getDir("", 0);
        }
        context = context.getPackageName();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        String str = "Android/data/";
        context = String.valueOf(context);
        return new File(externalStorageDirectory, context.length() != 0 ? str.concat(context) : new String(str));
    }

    /* renamed from: a */
    public static File m21065a(Context context) {
        return new File(C4733b.m21071d(context), "testdata");
    }

    /* renamed from: b */
    public static File m21069b(Context context) {
        return new File(C4733b.m21071d(context), "debug");
    }

    /* renamed from: c */
    public static File m21070c(Context context) {
        return new File(C4733b.m21071d(context), "cache");
    }

    /* renamed from: b */
    public static long m21068b() {
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
        r0 = com.google.android.m4b.maps.az.C4733b.m21066a();
        r1 = 0;
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        return r1;
    L_0x0009:
        r0 = new android.os.StatFs;	 Catch:{ IllegalArgumentException -> 0x0023 }
        r3 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ IllegalArgumentException -> 0x0023 }
        r3 = r3.getPath();	 Catch:{ IllegalArgumentException -> 0x0023 }
        r0.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0023 }
        r3 = r0.getBlockSize();	 Catch:{ IllegalArgumentException -> 0x0023 }
        r3 = (long) r3;	 Catch:{ IllegalArgumentException -> 0x0023 }
        r0 = r0.getAvailableBlocks();	 Catch:{ IllegalArgumentException -> 0x0023 }
        r0 = (long) r0;
        r3 = r3 * r0;
        return r3;
    L_0x0023:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.az.b.b():long");
    }

    /* renamed from: a */
    public static Pair<Long, String> m21062a(bg bgVar, ba baVar) {
        long b;
        bgVar = baVar.mo5149a(baVar.m21627j().m21643a(bgVar));
        baVar = bgVar.m21627j();
        if (baVar.m21647b()) {
            b = ((((long) (bgVar.m21619b() & 31)) << 58) | (((long) (bgVar.m21620c() & 536870911)) << 29)) | ((long) (bgVar.m21621d() & 536870911));
        } else {
            long j;
            int b2 = bgVar.m21619b();
            if (b2 == 0) {
                j = 0;
            } else {
                j = f17370a[b2 - 1] + 1;
            }
            b = ((((long) baVar.hashCode()) << f17371b) | Long.MIN_VALUE) | ((((long) bgVar.m21620c()) + (((long) bgVar.m21621d()) << b2)) + j);
        }
        baVar = Long.valueOf(b);
        bgVar = bgVar.m21627j();
        return new Pair(baVar, bgVar.m21647b() ? null : bgVar.toString());
    }

    /* renamed from: a */
    public static ba m21064a(long j) {
        return j < 0 ? 0 : new ba(((int) (j >> 58)) & 31, ((int) (j >> 29)) & 536870911, ((int) j) & 536870911);
    }

    /* renamed from: a */
    public static long m21060a(java.lang.String r8) {
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
        r0 = new java.util.zip.CRC32;
        r0.<init>();
        r1 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r1 = r8.getBytes(r1);	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r0.update(r1);	 Catch:{ UnsupportedEncodingException -> 0x000e }
    L_0x000e:
        r0 = r0.getValue();
        r2 = 32;
        r0 = r0 << r2;
        r8 = r8.hashCode();
        r2 = (long) r8;
        r4 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;
        r6 = r2 & r4;
        r2 = r0 | r6;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.az.b.a(java.lang.String):long");
    }

    /* renamed from: a */
    public static Bitmap m21061a(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        r3 = new float[8];
        float height = (float) bitmap.getHeight();
        r3[3] = height;
        float f = (float) width;
        r3[4] = f;
        r3[5] = 0.0f;
        r3[6] = f;
        r3[7] = height;
        matrix.setPolyToPoly(r3, 0, new float[]{0.0f, height, 0.0f, 0.0f, f, height, f, 0.0f}, 0, 4);
        ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        new Canvas(bitmap).drawBitmap(Bitmap.createBitmap(bitmap), matrix, paint);
        return bitmap;
    }

    static {
        int i;
        long[] jArr = new long[22];
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        while (i3 < 22) {
            long j2 = j + (1 << (i3 * 2));
            jArr[i3] = j2 - 1;
            i3++;
            j = j2;
        }
        f17370a = jArr;
        long j3 = jArr[21];
        if (j3 < 0) {
            i = 64;
        } else {
            while (j3 != 0) {
                j3 >>= 1;
                i2++;
            }
            i = i2;
        }
        f17371b = i;
    }
}
