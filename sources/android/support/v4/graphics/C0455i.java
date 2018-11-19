package android.support.v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.graphics.i */
public class C0455i {
    @android.support.annotation.Nullable
    /* renamed from: a */
    public static java.io.File m1744a(android.content.Context r5) {
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
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = ".font";
        r0.append(r1);
        r1 = android.os.Process.myPid();
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r1 = android.os.Process.myTid();
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r0 = r0.toString();
        r1 = 0;
    L_0x0027:
        r2 = 100;
        if (r1 >= r2) goto L_0x004d;
    L_0x002b:
        r2 = new java.io.File;
        r3 = r5.getCacheDir();
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4.append(r0);
        r4.append(r1);
        r4 = r4.toString();
        r2.<init>(r3, r4);
        r3 = r2.createNewFile();	 Catch:{ IOException -> 0x004a }
        if (r3 == 0) goto L_0x004a;
    L_0x0049:
        return r2;
    L_0x004a:
        r1 = r1 + 1;
        goto L_0x0027;
    L_0x004d:
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.i.a(android.content.Context):java.io.File");
    }

    @android.support.annotation.Nullable
    @android.support.annotation.RequiresApi(19)
    /* renamed from: a */
    private static java.nio.ByteBuffer m1747a(java.io.File r9) {
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
        r1 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0036 }
        r1.<init>(r9);	 Catch:{ IOException -> 0x0036 }
        r2 = r1.getChannel();	 Catch:{ Throwable -> 0x001f, all -> 0x001c }
        r6 = r2.size();	 Catch:{ Throwable -> 0x001f, all -> 0x001c }
        r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ Throwable -> 0x001f, all -> 0x001c }
        r4 = 0;	 Catch:{ Throwable -> 0x001f, all -> 0x001c }
        r9 = r2.map(r3, r4, r6);	 Catch:{ Throwable -> 0x001f, all -> 0x001c }
        if (r1 == 0) goto L_0x001b;
    L_0x0018:
        r1.close();	 Catch:{ IOException -> 0x0036 }
    L_0x001b:
        return r9;
    L_0x001c:
        r9 = move-exception;
        r2 = r0;
        goto L_0x0025;
    L_0x001f:
        r9 = move-exception;
        throw r9;	 Catch:{ all -> 0x0021 }
    L_0x0021:
        r2 = move-exception;
        r8 = r2;
        r2 = r9;
        r9 = r8;
    L_0x0025:
        if (r1 == 0) goto L_0x0035;
    L_0x0027:
        if (r2 == 0) goto L_0x0032;
    L_0x0029:
        r1.close();	 Catch:{ Throwable -> 0x002d }
        goto L_0x0035;
    L_0x002d:
        r1 = move-exception;
        r2.addSuppressed(r1);	 Catch:{ IOException -> 0x0036 }
        goto L_0x0035;	 Catch:{ IOException -> 0x0036 }
    L_0x0032:
        r1.close();	 Catch:{ IOException -> 0x0036 }
    L_0x0035:
        throw r9;	 Catch:{ IOException -> 0x0036 }
    L_0x0036:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.i.a(java.io.File):java.nio.ByteBuffer");
    }

    @android.support.annotation.Nullable
    @android.support.annotation.RequiresApi(19)
    /* renamed from: a */
    public static java.nio.ByteBuffer m1746a(android.content.Context r8, android.os.CancellationSignal r9, android.net.Uri r10) {
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
        r8 = r8.getContentResolver();
        r0 = 0;
        r1 = "r";	 Catch:{ IOException -> 0x006b }
        r8 = r8.openFileDescriptor(r10, r1, r9);	 Catch:{ IOException -> 0x006b }
        if (r8 != 0) goto L_0x0013;	 Catch:{ IOException -> 0x006b }
    L_0x000d:
        if (r8 == 0) goto L_0x0012;	 Catch:{ IOException -> 0x006b }
    L_0x000f:
        r8.close();	 Catch:{ IOException -> 0x006b }
    L_0x0012:
        return r0;
    L_0x0013:
        r9 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x0054, all -> 0x0051 }
        r10 = r8.getFileDescriptor();	 Catch:{ Throwable -> 0x0054, all -> 0x0051 }
        r9.<init>(r10);	 Catch:{ Throwable -> 0x0054, all -> 0x0051 }
        r1 = r9.getChannel();	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r5 = r1.size();	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r3 = 0;	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        r10 = r1.map(r2, r3, r5);	 Catch:{ Throwable -> 0x003a, all -> 0x0037 }
        if (r9 == 0) goto L_0x0031;
    L_0x002e:
        r9.close();	 Catch:{ Throwable -> 0x0054, all -> 0x0051 }
    L_0x0031:
        if (r8 == 0) goto L_0x0036;
    L_0x0033:
        r8.close();	 Catch:{ IOException -> 0x006b }
    L_0x0036:
        return r10;
    L_0x0037:
        r10 = move-exception;
        r1 = r0;
        goto L_0x0040;
    L_0x003a:
        r10 = move-exception;
        throw r10;	 Catch:{ all -> 0x003c }
    L_0x003c:
        r1 = move-exception;
        r7 = r1;
        r1 = r10;
        r10 = r7;
    L_0x0040:
        if (r9 == 0) goto L_0x0050;
    L_0x0042:
        if (r1 == 0) goto L_0x004d;
    L_0x0044:
        r9.close();	 Catch:{ Throwable -> 0x0048, all -> 0x0051 }
        goto L_0x0050;
    L_0x0048:
        r9 = move-exception;
        r1.addSuppressed(r9);	 Catch:{ Throwable -> 0x0054, all -> 0x0051 }
        goto L_0x0050;	 Catch:{ Throwable -> 0x0054, all -> 0x0051 }
    L_0x004d:
        r9.close();	 Catch:{ Throwable -> 0x0054, all -> 0x0051 }
    L_0x0050:
        throw r10;	 Catch:{ Throwable -> 0x0054, all -> 0x0051 }
    L_0x0051:
        r9 = move-exception;
        r10 = r0;
        goto L_0x005a;
    L_0x0054:
        r9 = move-exception;
        throw r9;	 Catch:{ all -> 0x0056 }
    L_0x0056:
        r10 = move-exception;
        r7 = r10;
        r10 = r9;
        r9 = r7;
    L_0x005a:
        if (r8 == 0) goto L_0x006a;
    L_0x005c:
        if (r10 == 0) goto L_0x0067;
    L_0x005e:
        r8.close();	 Catch:{ Throwable -> 0x0062 }
        goto L_0x006a;
    L_0x0062:
        r8 = move-exception;
        r10.addSuppressed(r8);	 Catch:{ IOException -> 0x006b }
        goto L_0x006a;	 Catch:{ IOException -> 0x006b }
    L_0x0067:
        r8.close();	 Catch:{ IOException -> 0x006b }
    L_0x006a:
        throw r9;	 Catch:{ IOException -> 0x006b }
    L_0x006b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.i.a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    @Nullable
    @RequiresApi(19)
    /* renamed from: a */
    public static ByteBuffer m1745a(Context context, Resources resources, int i) {
        File a = C0455i.m1744a(context);
        if (a == null) {
            return null;
        }
        try {
            if (C0455i.m1749a(a, resources, i) == null) {
                return null;
            }
            resources = C0455i.m1747a(a);
            a.delete();
            return resources;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public static boolean m1750a(File file, InputStream inputStream) {
        StringBuilder stringBuilder;
        Closeable closeable = null;
        try {
            Closeable fileOutputStream = new FileOutputStream(file, false);
            try {
                file = new byte[1024];
                while (true) {
                    int read = inputStream.read(file);
                    if (read != -1) {
                        fileOutputStream.write(file, 0, read);
                    } else {
                        C0455i.m1748a(fileOutputStream);
                        return true;
                    }
                }
            } catch (IOException e) {
                file = e;
                closeable = fileOutputStream;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error copying resource contents to temp file: ");
                    stringBuilder.append(file.getMessage());
                    Log.e("TypefaceCompatUtil", stringBuilder.toString());
                    C0455i.m1748a(closeable);
                    return false;
                } catch (Throwable th) {
                    file = th;
                    C0455i.m1748a(closeable);
                    throw file;
                }
            } catch (Throwable th2) {
                file = th2;
                closeable = fileOutputStream;
                C0455i.m1748a(closeable);
                throw file;
            }
        } catch (IOException e2) {
            file = e2;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error copying resource contents to temp file: ");
            stringBuilder.append(file.getMessage());
            Log.e("TypefaceCompatUtil", stringBuilder.toString());
            C0455i.m1748a(closeable);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m1749a(File file, Resources resources, int i) {
        Closeable openRawResource;
        try {
            openRawResource = resources.openRawResource(i);
            try {
                file = C0455i.m1750a(file, openRawResource);
                C0455i.m1748a(openRawResource);
                return file;
            } catch (Throwable th) {
                file = th;
                C0455i.m1748a(openRawResource);
                throw file;
            }
        } catch (Throwable th2) {
            file = th2;
            openRawResource = null;
            C0455i.m1748a(openRawResource);
            throw file;
        }
    }

    /* renamed from: a */
    public static void m1748a(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0005;
    L_0x0002:
        r0.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.i.a(java.io.Closeable):void");
    }
}
