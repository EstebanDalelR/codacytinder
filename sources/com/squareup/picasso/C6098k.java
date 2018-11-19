package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.k */
final class C6098k extends InputStream {
    /* renamed from: a */
    private final InputStream f22397a;
    /* renamed from: b */
    private long f22398b;
    /* renamed from: c */
    private long f22399c;
    /* renamed from: d */
    private long f22400d;
    /* renamed from: e */
    private long f22401e;

    public C6098k(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public C6098k(InputStream inputStream, int i) {
        this.f22401e = -1;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, i);
        }
        this.f22397a = inputStream;
    }

    public void mark(int i) {
        this.f22401e = m26504a(i);
    }

    /* renamed from: a */
    public long m26504a(int i) {
        long j = this.f22398b + ((long) i);
        if (this.f22400d < j) {
            m26503b(j);
        }
        return this.f22398b;
    }

    /* renamed from: b */
    private void m26503b(long j) {
        try {
            if (this.f22399c >= this.f22398b || this.f22398b > this.f22400d) {
                this.f22399c = this.f22398b;
                this.f22397a.mark((int) (j - this.f22398b));
            } else {
                this.f22397a.reset();
                this.f22397a.mark((int) (j - this.f22399c));
                m26502a(this.f22399c, this.f22398b);
            }
            this.f22400d = j;
        } catch (long j2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to mark: ");
            stringBuilder.append(j2);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void reset() throws IOException {
        m26505a(this.f22401e);
    }

    /* renamed from: a */
    public void m26505a(long j) throws IOException {
        if (this.f22398b <= this.f22400d) {
            if (j >= this.f22399c) {
                this.f22397a.reset();
                m26502a(this.f22399c, j);
                this.f22398b = j;
                return;
            }
        }
        throw new IOException("Cannot reset");
    }

    /* renamed from: a */
    private void m26502a(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f22397a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public int read() throws IOException {
        int read = this.f22397a.read();
        if (read != -1) {
            this.f22398b++;
        }
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        bArr = this.f22397a.read(bArr);
        if (bArr != -1) {
            this.f22398b += (long) bArr;
        }
        return bArr;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        bArr = this.f22397a.read(bArr, i, i2);
        if (bArr != -1) {
            this.f22398b += (long) bArr;
        }
        return bArr;
    }

    public long skip(long j) throws IOException {
        j = this.f22397a.skip(j);
        this.f22398b += j;
        return j;
    }

    public int available() throws IOException {
        return this.f22397a.available();
    }

    public void close() throws IOException {
        this.f22397a.close();
    }

    public boolean markSupported() {
        return this.f22397a.markSupported();
    }
}
