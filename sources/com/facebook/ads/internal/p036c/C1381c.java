package com.facebook.ads.internal.p036c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.Nullable;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.facebook.ads.internal.c.c */
public class C1381c {
    /* renamed from: a */
    private static final String f3739a = "c";
    /* renamed from: b */
    private static C1381c f3740b;
    /* renamed from: c */
    private final Context f3741c;

    private C1381c(Context context) {
        this.f3741c = context;
    }

    /* renamed from: a */
    public static C1381c m4810a(Context context) {
        if (f3740b == null) {
            context = context.getApplicationContext();
            synchronized (context) {
                if (f3740b == null) {
                    f3740b = new C1381c(context);
                }
            }
        }
        return f3740b;
    }

    /* renamed from: a */
    private static void m4811a(@android.support.annotation.Nullable java.io.Closeable r0) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        if (r0 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0.close();	 Catch:{ IOException -> 0x0006 }
    L_0x0006:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.c.c.a(java.io.Closeable):void");
    }

    @Nullable
    /* renamed from: b */
    private Bitmap m4812b(String str) {
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring("file://".length())), null, null);
            m4815a(str, decodeStream);
            return decodeStream;
        } catch (Throwable e) {
            String str2 = f3739a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to copy local image into cache (url=");
            stringBuilder.append(str);
            stringBuilder.append(").");
            Log.e(str2, stringBuilder.toString(), e);
            return null;
        }
    }

    @android.support.annotation.Nullable
    /* renamed from: c */
    private android.graphics.Bitmap m4813c(java.lang.String r5) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = "asset:///";
        r0 = r5.startsWith(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x0047;
    L_0x0009:
        r0 = r4.f3741c;	 Catch:{ IOException -> 0x003b, all -> 0x002f }
        r0 = r0.getAssets();	 Catch:{ IOException -> 0x003b, all -> 0x002f }
        r2 = 9;	 Catch:{ IOException -> 0x003b, all -> 0x002f }
        r3 = r5.length();	 Catch:{ IOException -> 0x003b, all -> 0x002f }
        r2 = r5.substring(r2, r3);	 Catch:{ IOException -> 0x003b, all -> 0x002f }
        r0 = r0.open(r2);	 Catch:{ IOException -> 0x003b, all -> 0x002f }
        r2 = android.graphics.BitmapFactory.decodeStream(r0);	 Catch:{ IOException -> 0x003c, all -> 0x002c }
        if (r0 == 0) goto L_0x005b;
    L_0x0023:
        r0.close();	 Catch:{ IOException -> 0x0027 }
        goto L_0x005b;
    L_0x0027:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x005b;
    L_0x002c:
        r5 = move-exception;
        r1 = r0;
        goto L_0x0030;
    L_0x002f:
        r5 = move-exception;
    L_0x0030:
        if (r1 == 0) goto L_0x003a;
    L_0x0032:
        r1.close();	 Catch:{ IOException -> 0x0036 }
        goto L_0x003a;
    L_0x0036:
        r0 = move-exception;
        r0.printStackTrace();
    L_0x003a:
        throw r5;
    L_0x003b:
        r0 = r1;
    L_0x003c:
        if (r0 == 0) goto L_0x0046;
    L_0x003e:
        r0.close();	 Catch:{ IOException -> 0x0042 }
        return r1;
    L_0x0042:
        r5 = move-exception;
        r5.printStackTrace();
    L_0x0046:
        return r1;
    L_0x0047:
        r0 = r4.f3741c;
        r0 = com.facebook.ads.internal.p047k.p048a.C1475a.m5150a(r0);
        r0 = r0.m5015a(r5, r1);
        r0 = r0.m5045d();
        r1 = 0;
        r2 = r0.length;
        r2 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r2);
    L_0x005b:
        r4.m4815a(r5, r2);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.c.c.c(java.lang.String):android.graphics.Bitmap");
    }

    @Nullable
    /* renamed from: a */
    public Bitmap m4814a(String str) {
        File cacheDir = this.f3741c.getCacheDir();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.hashCode());
        stringBuilder.append(".png");
        File file = new File(cacheDir, stringBuilder.toString());
        return !file.exists() ? str.startsWith("file://") ? m4812b(str) : m4813c(str) : BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    /* renamed from: a */
    public void m4815a(java.lang.String r7, android.graphics.Bitmap r8) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:55:0x00cb in {8, 13, 15, 17, 19, 21, 23, 24, 26, 27, 29, 31, 32, 34, 36, 38, 39, 41, 43, 47, 49, 51, 54, 56, 58} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = new java.io.File;
        r1 = r6.f3741c;
        r1 = r1.getCacheDir();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r7.hashCode();
        r2.append(r3);
        r3 = ".png";
        r2.append(r3);
        r2 = r2.toString();
        r0.<init>(r1, r2);
        r1 = 0;
        r2 = new java.io.ByteArrayOutputStream;	 Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x0082, OutOfMemoryError -> 0x0072, all -> 0x006f }
        r2.<init>();	 Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x0082, OutOfMemoryError -> 0x0072, all -> 0x006f }
        r3 = android.graphics.Bitmap.CompressFormat.PNG;	 Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0067, OutOfMemoryError -> 0x0063, all -> 0x005e }
        r4 = 100;	 Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0067, OutOfMemoryError -> 0x0063, all -> 0x005e }
        r8.compress(r3, r4, r2);	 Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0067, OutOfMemoryError -> 0x0063, all -> 0x005e }
        r8 = r2.size();	 Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0067, OutOfMemoryError -> 0x0063, all -> 0x005e }
        r3 = 3145728; // 0x300000 float:4.408104E-39 double:1.554196E-317;	 Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0067, OutOfMemoryError -> 0x0063, all -> 0x005e }
        if (r8 < r3) goto L_0x0043;	 Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0067, OutOfMemoryError -> 0x0063, all -> 0x005e }
    L_0x0035:
        r8 = f3739a;	 Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0067, OutOfMemoryError -> 0x0063, all -> 0x005e }
        r3 = "Bitmap size exceeds max size for storage";	 Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0067, OutOfMemoryError -> 0x0063, all -> 0x005e }
        android.util.Log.d(r8, r3);	 Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0067, OutOfMemoryError -> 0x0063, all -> 0x005e }
        com.facebook.ads.internal.p036c.C1381c.m4811a(r2);
        com.facebook.ads.internal.p036c.C1381c.m4811a(r1);
        return;
    L_0x0043:
        r8 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0067, OutOfMemoryError -> 0x0063, all -> 0x005e }
        r8.<init>(r0);	 Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0067, OutOfMemoryError -> 0x0063, all -> 0x005e }
        r2.writeTo(r8);	 Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0056, OutOfMemoryError -> 0x0054, all -> 0x0052 }
        r8.flush();	 Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0056, OutOfMemoryError -> 0x0054, all -> 0x0052 }
        com.facebook.ads.internal.p036c.C1381c.m4811a(r2);
        goto L_0x007e;
    L_0x0052:
        r7 = move-exception;
        goto L_0x0060;
    L_0x0054:
        r7 = move-exception;
        goto L_0x0065;
    L_0x0056:
        r0 = move-exception;
        r1 = r2;
        r5 = r0;
        r0 = r8;
        r8 = r5;
        goto L_0x0084;
    L_0x005c:
        r7 = move-exception;
        goto L_0x006d;
    L_0x005e:
        r7 = move-exception;
        r8 = r1;
    L_0x0060:
        r1 = r2;
        goto L_0x00cd;
    L_0x0063:
        r7 = move-exception;
        r8 = r1;
    L_0x0065:
        r1 = r2;
        goto L_0x0074;
    L_0x0067:
        r8 = move-exception;
        r0 = r1;
        r1 = r2;
        goto L_0x0084;
    L_0x006b:
        r7 = move-exception;
        r8 = r1;
    L_0x006d:
        r1 = r2;
        goto L_0x00ab;
    L_0x006f:
        r7 = move-exception;
        r8 = r1;
        goto L_0x00cd;
    L_0x0072:
        r7 = move-exception;
        r8 = r1;
    L_0x0074:
        r0 = f3739a;	 Catch:{ all -> 0x00cc }
        r2 = "Unable to write bitmap to output stream";	 Catch:{ all -> 0x00cc }
        android.util.Log.e(r0, r2, r7);	 Catch:{ all -> 0x00cc }
    L_0x007b:
        com.facebook.ads.internal.p036c.C1381c.m4811a(r1);
    L_0x007e:
        com.facebook.ads.internal.p036c.C1381c.m4811a(r8);
        return;
    L_0x0082:
        r8 = move-exception;
        r0 = r1;
    L_0x0084:
        r2 = f3739a;	 Catch:{ all -> 0x00a6 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a6 }
        r3.<init>();	 Catch:{ all -> 0x00a6 }
        r4 = "Unable to write bitmap to file (url=";	 Catch:{ all -> 0x00a6 }
        r3.append(r4);	 Catch:{ all -> 0x00a6 }
        r3.append(r7);	 Catch:{ all -> 0x00a6 }
        r7 = ").";	 Catch:{ all -> 0x00a6 }
        r3.append(r7);	 Catch:{ all -> 0x00a6 }
        r7 = r3.toString();	 Catch:{ all -> 0x00a6 }
        android.util.Log.e(r2, r7, r8);	 Catch:{ all -> 0x00a6 }
        com.facebook.ads.internal.p036c.C1381c.m4811a(r1);
        com.facebook.ads.internal.p036c.C1381c.m4811a(r0);
        return;
    L_0x00a6:
        r7 = move-exception;
        r8 = r0;
        goto L_0x00cd;
    L_0x00a9:
        r7 = move-exception;
        r8 = r1;
    L_0x00ab:
        r2 = f3739a;	 Catch:{ all -> 0x00cc }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00cc }
        r3.<init>();	 Catch:{ all -> 0x00cc }
        r4 = "Bad output destination (file=";	 Catch:{ all -> 0x00cc }
        r3.append(r4);	 Catch:{ all -> 0x00cc }
        r0 = r0.getAbsolutePath();	 Catch:{ all -> 0x00cc }
        r3.append(r0);	 Catch:{ all -> 0x00cc }
        r0 = ").";	 Catch:{ all -> 0x00cc }
        r3.append(r0);	 Catch:{ all -> 0x00cc }
        r0 = r3.toString();	 Catch:{ all -> 0x00cc }
        android.util.Log.e(r2, r0, r7);	 Catch:{ all -> 0x00cc }
        goto L_0x007b;
        return;
    L_0x00cc:
        r7 = move-exception;
    L_0x00cd:
        com.facebook.ads.internal.p036c.C1381c.m4811a(r1);
        com.facebook.ads.internal.p036c.C1381c.m4811a(r8);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.c.c.a(java.lang.String, android.graphics.Bitmap):void");
    }
}
