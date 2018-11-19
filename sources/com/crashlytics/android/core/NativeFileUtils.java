package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

final class NativeFileUtils {
    private NativeFileUtils() {
    }

    static byte[] readFile(java.io.File r2) {
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
        r1 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x001b, IOException -> 0x0016, all -> 0x0011 }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x001b, IOException -> 0x0016, all -> 0x0011 }
        r2 = readBytes(r1);	 Catch:{ FileNotFoundException -> 0x001c, IOException -> 0x0017, all -> 0x000e }
        io.fabric.sdk.android.services.common.CommonUtils.a(r1);
        return r2;
    L_0x000e:
        r2 = move-exception;
        r0 = r1;
        goto L_0x0012;
    L_0x0011:
        r2 = move-exception;
    L_0x0012:
        io.fabric.sdk.android.services.common.CommonUtils.a(r0);
        throw r2;
    L_0x0016:
        r1 = r0;
    L_0x0017:
        io.fabric.sdk.android.services.common.CommonUtils.a(r1);
        return r0;
    L_0x001b:
        r1 = r0;
    L_0x001c:
        io.fabric.sdk.android.services.common.CommonUtils.a(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.NativeFileUtils.readFile(java.io.File):byte[]");
    }

    private static byte[] readBytes(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private static File filter(File file, String str) {
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    static byte[] minidumpFromDirectory(File file) {
        file = filter(file, ".dmp");
        return file == null ? new byte[null] : minidumpFromFile(file);
    }

    private static byte[] minidumpFromFile(File file) {
        return readFile(file);
    }

    static byte[] binaryImagesJsonFromDirectory(File file, Context context) throws IOException {
        File filter = filter(file, ".maps");
        if (filter != null) {
            return binaryImagesJsonFromMapsFile(filter, context);
        }
        file = filter(file, ".binary_libs");
        return file != null ? binaryImagesJsonFromBinaryLibsFile(file, context) : null;
    }

    private static byte[] binaryImagesJsonFromBinaryLibsFile(File file, Context context) throws IOException {
        file = readFile(file);
        if (file != null) {
            if (file.length != 0) {
                return processBinaryImages(context, new String(file));
            }
        }
        return null;
    }

    private static byte[] binaryImagesJsonFromMapsFile(File file, Context context) throws IOException {
        Closeable bufferedReader;
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                file = new BinaryImagesConverter(context, new Sha1FileIdStrategy()).convert((BufferedReader) bufferedReader);
                CommonUtils.a(bufferedReader);
                return file;
            } catch (Throwable th) {
                file = th;
                CommonUtils.a(bufferedReader);
                throw file;
            }
        } catch (Throwable th2) {
            file = th2;
            bufferedReader = null;
            CommonUtils.a(bufferedReader);
            throw file;
        }
    }

    static byte[] metadataJsonFromDirectory(File file) {
        file = filter(file, ".device_info");
        if (file == null) {
            return null;
        }
        return readFile(file);
    }

    private static byte[] processBinaryImages(Context context, String str) throws IOException {
        return new BinaryImagesConverter(context, new Sha1FileIdStrategy()).convert(str);
    }
}
