package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecyclableBufferedInputStream extends FilterInputStream {
    /* renamed from: a */
    private volatile byte[] f2866a;
    /* renamed from: b */
    private int f2867b;
    /* renamed from: c */
    private int f2868c;
    /* renamed from: d */
    private int f2869d = -1;
    /* renamed from: e */
    private int f2870e;

    public static class InvalidMarkException extends RuntimeException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public boolean markSupported() {
        return true;
    }

    public RecyclableBufferedInputStream(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (bArr != null) {
            if (bArr.length != null) {
                this.f2866a = bArr;
                return;
            }
        }
        throw new IllegalArgumentException("buffer is null or empty");
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f2866a != null) {
            if (inputStream != null) {
            }
        }
        throw m3610b();
        return (this.f2867b - this.f2870e) + inputStream.available();
    }

    /* renamed from: b */
    private static IOException m3610b() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void m3611a() {
        this.f2868c = this.f2866a.length;
    }

    public void close() throws IOException {
        this.f2866a = null;
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: a */
    private int m3609a(InputStream inputStream, byte[] bArr) throws IOException {
        if (this.f2869d != -1) {
            if (this.f2870e - this.f2869d < this.f2868c) {
                if (this.f2869d == 0 && this.f2868c > bArr.length && this.f2867b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length > this.f2868c) {
                        length = this.f2868c;
                    }
                    if (Log.isLoggable("BufferedIs", 3)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("allocate buffer of length: ");
                        stringBuilder.append(length);
                        Log.d("BufferedIs", stringBuilder.toString());
                    }
                    Object obj = new byte[length];
                    System.arraycopy(bArr, 0, obj, 0, bArr.length);
                    this.f2866a = obj;
                    bArr = obj;
                } else if (this.f2869d > 0) {
                    System.arraycopy(bArr, this.f2869d, bArr, 0, bArr.length - this.f2869d);
                }
                this.f2870e -= this.f2869d;
                this.f2869d = 0;
                this.f2867b = 0;
                inputStream = inputStream.read(bArr, this.f2870e, bArr.length - this.f2870e);
                if (inputStream <= null) {
                    bArr = this.f2870e;
                } else {
                    bArr = this.f2870e + inputStream;
                }
                this.f2867b = bArr;
                return inputStream;
            }
        }
        inputStream = inputStream.read(bArr);
        if (inputStream > null) {
            this.f2869d = -1;
            this.f2870e = 0;
            this.f2867b = inputStream;
        }
        return inputStream;
    }

    public synchronized void mark(int i) {
        this.f2868c = Math.max(this.f2868c, i);
        this.f2869d = this.f2870e;
    }

    public synchronized int read() throws IOException {
        byte[] bArr = this.f2866a;
        InputStream inputStream = this.in;
        if (bArr != null) {
            if (inputStream != null) {
                if (this.f2870e >= this.f2867b && m3609a(inputStream, bArr) == -1) {
                    return -1;
                }
                if (bArr != this.f2866a) {
                    bArr = this.f2866a;
                    if (bArr == null) {
                        throw m3610b();
                    }
                }
                if (this.f2867b - this.f2870e <= 0) {
                    return -1;
                }
                int i = this.f2870e;
                this.f2870e = i + 1;
                return bArr[i] & 255;
            }
        }
        throw m3610b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.f2866a;	 Catch:{ all -> 0x009d }
        if (r0 != 0) goto L_0x000a;
    L_0x0005:
        r6 = m3610b();	 Catch:{ all -> 0x009d }
        throw r6;	 Catch:{ all -> 0x009d }
    L_0x000a:
        if (r8 != 0) goto L_0x000f;
    L_0x000c:
        r6 = 0;
        monitor-exit(r5);
        return r6;
    L_0x000f:
        r1 = r5.in;	 Catch:{ all -> 0x009d }
        if (r1 != 0) goto L_0x0018;
    L_0x0013:
        r6 = m3610b();	 Catch:{ all -> 0x009d }
        throw r6;	 Catch:{ all -> 0x009d }
    L_0x0018:
        r2 = r5.f2870e;	 Catch:{ all -> 0x009d }
        r3 = r5.f2867b;	 Catch:{ all -> 0x009d }
        if (r2 >= r3) goto L_0x0045;
    L_0x001e:
        r2 = r5.f2867b;	 Catch:{ all -> 0x009d }
        r3 = r5.f2870e;	 Catch:{ all -> 0x009d }
        r2 = r2 - r3;
        if (r2 < r8) goto L_0x0027;
    L_0x0025:
        r2 = r8;
        goto L_0x002c;
    L_0x0027:
        r2 = r5.f2867b;	 Catch:{ all -> 0x009d }
        r3 = r5.f2870e;	 Catch:{ all -> 0x009d }
        r2 = r2 - r3;
    L_0x002c:
        r3 = r5.f2870e;	 Catch:{ all -> 0x009d }
        java.lang.System.arraycopy(r0, r3, r6, r7, r2);	 Catch:{ all -> 0x009d }
        r3 = r5.f2870e;	 Catch:{ all -> 0x009d }
        r3 = r3 + r2;
        r5.f2870e = r3;	 Catch:{ all -> 0x009d }
        if (r2 == r8) goto L_0x0043;
    L_0x0038:
        r3 = r1.available();	 Catch:{ all -> 0x009d }
        if (r3 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0043;
    L_0x003f:
        r7 = r7 + r2;
        r2 = r8 - r2;
        goto L_0x0046;
    L_0x0043:
        monitor-exit(r5);
        return r2;
    L_0x0045:
        r2 = r8;
    L_0x0046:
        r3 = r5.f2869d;	 Catch:{ all -> 0x009d }
        r4 = -1;
        if (r3 != r4) goto L_0x005b;
    L_0x004b:
        r3 = r0.length;	 Catch:{ all -> 0x009d }
        if (r2 < r3) goto L_0x005b;
    L_0x004e:
        r3 = r1.read(r6, r7, r2);	 Catch:{ all -> 0x009d }
        if (r3 != r4) goto L_0x008d;
    L_0x0054:
        if (r2 != r8) goto L_0x0057;
    L_0x0056:
        goto L_0x0059;
    L_0x0057:
        r4 = r8 - r2;
    L_0x0059:
        monitor-exit(r5);
        return r4;
    L_0x005b:
        r3 = r5.m3609a(r1, r0);	 Catch:{ all -> 0x009d }
        if (r3 != r4) goto L_0x0068;
    L_0x0061:
        if (r2 != r8) goto L_0x0064;
    L_0x0063:
        goto L_0x0066;
    L_0x0064:
        r4 = r8 - r2;
    L_0x0066:
        monitor-exit(r5);
        return r4;
    L_0x0068:
        r3 = r5.f2866a;	 Catch:{ all -> 0x009d }
        if (r0 == r3) goto L_0x0075;
    L_0x006c:
        r0 = r5.f2866a;	 Catch:{ all -> 0x009d }
        if (r0 != 0) goto L_0x0075;
    L_0x0070:
        r6 = m3610b();	 Catch:{ all -> 0x009d }
        throw r6;	 Catch:{ all -> 0x009d }
    L_0x0075:
        r3 = r5.f2867b;	 Catch:{ all -> 0x009d }
        r4 = r5.f2870e;	 Catch:{ all -> 0x009d }
        r3 = r3 - r4;
        if (r3 < r2) goto L_0x007e;
    L_0x007c:
        r3 = r2;
        goto L_0x0083;
    L_0x007e:
        r3 = r5.f2867b;	 Catch:{ all -> 0x009d }
        r4 = r5.f2870e;	 Catch:{ all -> 0x009d }
        r3 = r3 - r4;
    L_0x0083:
        r4 = r5.f2870e;	 Catch:{ all -> 0x009d }
        java.lang.System.arraycopy(r0, r4, r6, r7, r3);	 Catch:{ all -> 0x009d }
        r4 = r5.f2870e;	 Catch:{ all -> 0x009d }
        r4 = r4 + r3;
        r5.f2870e = r4;	 Catch:{ all -> 0x009d }
    L_0x008d:
        r2 = r2 - r3;
        if (r2 != 0) goto L_0x0092;
    L_0x0090:
        monitor-exit(r5);
        return r8;
    L_0x0092:
        r4 = r1.available();	 Catch:{ all -> 0x009d }
        if (r4 != 0) goto L_0x009b;
    L_0x0098:
        r8 = r8 - r2;
        monitor-exit(r5);
        return r8;
    L_0x009b:
        r7 = r7 + r3;
        goto L_0x0046;
    L_0x009d:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read(byte[], int, int):int");
    }

    public synchronized void reset() throws IOException {
        if (this.f2866a == null) {
            throw new IOException("Stream is closed");
        } else if (-1 == this.f2869d) {
            throw new InvalidMarkException("Mark has been invalidated");
        } else {
            this.f2870e = this.f2869d;
        }
    }

    public synchronized long skip(long j) throws IOException {
        byte[] bArr = this.f2866a;
        InputStream inputStream = this.in;
        if (bArr == null) {
            throw m3610b();
        } else if (j < 1) {
            return 0;
        } else {
            if (inputStream == null) {
                throw m3610b();
            } else if (((long) (this.f2867b - this.f2870e)) >= j) {
                this.f2870e = (int) (((long) this.f2870e) + j);
                return j;
            } else {
                long j2 = (long) (this.f2867b - this.f2870e);
                this.f2870e = this.f2867b;
                if (this.f2869d == -1 || j > ((long) this.f2868c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m3609a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    long j3 = j - j2;
                    if (((long) (this.f2867b - this.f2870e)) >= j3) {
                        this.f2870e = (int) (((long) this.f2870e) + j3);
                        return j;
                    }
                    j2 = (j2 + ((long) this.f2867b)) - ((long) this.f2870e);
                    this.f2870e = this.f2867b;
                    return j2;
                }
            }
        }
    }
}
