package com.bumptech.glide.p023a;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.a.c */
final class C0974c {
    /* renamed from: a */
    static final Charset f2609a = Charset.forName("US-ASCII");
    /* renamed from: b */
    static final Charset f2610b = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m3346a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("not a readable directory: ");
            stringBuilder.append(file);
            throw new IOException(stringBuilder.toString());
        }
        file = listFiles.length;
        int i = 0;
        while (i < file) {
            File file2 = listFiles[i];
            if (file2.isDirectory()) {
                C0974c.m3346a(file2);
            }
            if (file2.delete()) {
                i++;
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("failed to delete file: ");
                stringBuilder2.append(file2);
                throw new IOException(stringBuilder2.toString());
            }
        }
    }

    /* renamed from: a */
    static void m3345a(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0008;
    L_0x0002:
        r0.close();	 Catch:{ RuntimeException -> 0x0006, Exception -> 0x0008 }
        goto L_0x0008;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.c.a(java.io.Closeable):void");
    }
}
