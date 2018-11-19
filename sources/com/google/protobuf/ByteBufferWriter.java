package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;

final class ByteBufferWriter {
    private static final ThreadLocal<SoftReference<byte[]>> BUFFER = new ThreadLocal();
    private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    private static final long CHANNEL_FIELD_OFFSET = getChannelFieldOffset(FILE_OUTPUT_STREAM_CLASS);
    private static final Class<?> FILE_OUTPUT_STREAM_CLASS = safeGetClass("java.io.FileOutputStream");
    private static final int MAX_CACHED_BUFFER_SIZE = 16384;
    private static final int MIN_CACHED_BUFFER_SIZE = 1024;

    private static boolean needToReallocate(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * BUFFER_REALLOCATION_THRESHOLD;
    }

    private ByteBufferWriter() {
    }

    static void clearCachedBuffer() {
        BUFFER.set(null);
    }

    static void write(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!writeToChannel(byteBuffer, outputStream)) {
                byte[] orCreateBuffer = getOrCreateBuffer(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), orCreateBuffer.length);
                    byteBuffer.get(orCreateBuffer, 0, min);
                    outputStream.write(orCreateBuffer, 0, min);
                }
            }
            byteBuffer.position(position);
        } catch (Throwable th) {
            byteBuffer.position(position);
        }
    }

    private static byte[] getOrCreateBuffer(int i) {
        i = Math.max(i, MIN_CACHED_BUFFER_SIZE);
        byte[] buffer = getBuffer();
        if (buffer == null || needToReallocate(i, buffer.length)) {
            buffer = new byte[i];
            if (i <= MAX_CACHED_BUFFER_SIZE) {
                setBuffer(buffer);
            }
        }
        return buffer;
    }

    private static byte[] getBuffer() {
        SoftReference softReference = (SoftReference) BUFFER.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    private static void setBuffer(byte[] bArr) {
        BUFFER.set(new SoftReference(bArr));
    }

    private static boolean writeToChannel(java.nio.ByteBuffer r5, java.io.OutputStream r6) throws java.io.IOException {
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
        r0 = CHANNEL_FIELD_OFFSET;
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 < 0) goto L_0x0022;
    L_0x0008:
        r0 = FILE_OUTPUT_STREAM_CLASS;
        r0 = r0.isInstance(r6);
        if (r0 == 0) goto L_0x0022;
    L_0x0010:
        r0 = 0;
        r1 = CHANNEL_FIELD_OFFSET;	 Catch:{ ClassCastException -> 0x001a }
        r6 = com.google.protobuf.UnsafeUtil.getObject(r6, r1);	 Catch:{ ClassCastException -> 0x001a }
        r6 = (java.nio.channels.WritableByteChannel) r6;	 Catch:{ ClassCastException -> 0x001a }
        goto L_0x001b;
    L_0x001a:
        r6 = r0;
    L_0x001b:
        if (r6 == 0) goto L_0x0022;
    L_0x001d:
        r6.write(r5);
        r5 = 1;
        return r5;
    L_0x0022:
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ByteBufferWriter.writeToChannel(java.nio.ByteBuffer, java.io.OutputStream):boolean");
    }

    private static java.lang.Class<?> safeGetClass(java.lang.String r0) {
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
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ByteBufferWriter.safeGetClass(java.lang.String):java.lang.Class<?>");
    }

    private static long getChannelFieldOffset(java.lang.Class<?> r2) {
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
        if (r2 == 0) goto L_0x0013;
    L_0x0002:
        r0 = com.google.protobuf.UnsafeUtil.hasUnsafeArrayOperations();	 Catch:{ Throwable -> 0x0013 }
        if (r0 == 0) goto L_0x0013;	 Catch:{ Throwable -> 0x0013 }
    L_0x0008:
        r0 = "channel";	 Catch:{ Throwable -> 0x0013 }
        r2 = r2.getDeclaredField(r0);	 Catch:{ Throwable -> 0x0013 }
        r0 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r2);	 Catch:{ Throwable -> 0x0013 }
        return r0;
    L_0x0013:
        r0 = -1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ByteBufferWriter.getChannelFieldOffset(java.lang.Class):long");
    }
}
