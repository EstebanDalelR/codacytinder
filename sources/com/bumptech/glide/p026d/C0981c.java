package com.bumptech.glide.p026d;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.d.c */
public class C0981c extends InputStream {
    /* renamed from: a */
    private static final Queue<C0981c> f2669a = C0987h.m3410a(0);
    /* renamed from: b */
    private InputStream f2670b;
    /* renamed from: c */
    private IOException f2671c;

    /* renamed from: a */
    public static C0981c m3388a(InputStream inputStream) {
        C0981c c0981c;
        synchronized (f2669a) {
            c0981c = (C0981c) f2669a.poll();
        }
        if (c0981c == null) {
            c0981c = new C0981c();
        }
        c0981c.m3391b(inputStream);
        return c0981c;
    }

    C0981c() {
    }

    /* renamed from: b */
    void m3391b(InputStream inputStream) {
        this.f2670b = inputStream;
    }

    public int available() throws IOException {
        return this.f2670b.available();
    }

    public void close() throws IOException {
        this.f2670b.close();
    }

    public void mark(int i) {
        this.f2670b.mark(i);
    }

    public boolean markSupported() {
        return this.f2670b.markSupported();
    }

    public int read(byte[] bArr) throws IOException {
        try {
            return this.f2670b.read(bArr);
        } catch (byte[] bArr2) {
            this.f2671c = bArr2;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f2670b.read(bArr, i, i2);
        } catch (byte[] bArr2) {
            this.f2671c = bArr2;
            return -1;
        }
    }

    public synchronized void reset() throws IOException {
        this.f2670b.reset();
    }

    public long skip(long j) throws IOException {
        try {
            return this.f2670b.skip(j);
        } catch (long j2) {
            this.f2671c = j2;
            return 0;
        }
    }

    public int read() throws IOException {
        try {
            return this.f2670b.read();
        } catch (IOException e) {
            this.f2671c = e;
            return -1;
        }
    }

    /* renamed from: a */
    public IOException m3389a() {
        return this.f2671c;
    }

    /* renamed from: b */
    public void m3390b() {
        this.f2671c = null;
        this.f2670b = null;
        synchronized (f2669a) {
            f2669a.offer(this);
        }
    }
}
