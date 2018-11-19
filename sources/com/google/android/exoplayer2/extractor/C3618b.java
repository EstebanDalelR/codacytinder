package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.b */
public final class C3618b implements ExtractorInput {
    /* renamed from: a */
    private final byte[] f10938a = new byte[4096];
    /* renamed from: b */
    private final DataSource f10939b;
    /* renamed from: c */
    private final long f10940c;
    /* renamed from: d */
    private long f10941d;
    /* renamed from: e */
    private byte[] f10942e = new byte[65536];
    /* renamed from: f */
    private int f10943f;
    /* renamed from: g */
    private int f10944g;

    public C3618b(DataSource dataSource, long j, long j2) {
        this.f10939b = dataSource;
        this.f10941d = j;
        this.f10940c = j2;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int a = m13624a(bArr, i, i2);
        if (a == 0) {
            a = m13625a(bArr, i, i2, 0, true);
        }
        m13629d(a);
        return a;
    }

    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int a = m13624a(bArr, i, i2);
        while (a < i2 && a != -1) {
            a = m13625a(bArr, i, i2, a, z);
        }
        m13629d(a);
        return a != -1 ? 1 : null;
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        readFully(bArr, i, i2, false);
    }

    public int skip(int i) throws IOException, InterruptedException {
        int b = m13627b(i);
        if (b == 0) {
            b = m13625a(this.f10938a, 0, Math.min(i, this.f10938a.length), 0, true);
        }
        m13629d(b);
        return b;
    }

    public boolean skipFully(int i, boolean z) throws IOException, InterruptedException {
        int b = m13627b(i);
        while (b < i && b != -1) {
            b = m13625a(this.f10938a, -b, Math.min(i, this.f10938a.length + b), b, z);
        }
        m13629d(b);
        return b != -1;
    }

    public void skipFully(int i) throws IOException, InterruptedException {
        skipFully(i, false);
    }

    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!advancePeekPosition(i2, z)) {
            return null;
        }
        System.arraycopy(this.f10942e, this.f10943f - i2, bArr, i, i2);
        return 1;
    }

    public void peekFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        peekFully(bArr, i, i2, false);
    }

    public boolean advancePeekPosition(int i, boolean z) throws IOException, InterruptedException {
        m13626a(i);
        int min = Math.min(this.f10944g - this.f10943f, i);
        while (min < i) {
            min = m13625a(this.f10942e, this.f10943f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        this.f10943f += i;
        this.f10944g = Math.max(this.f10944g, this.f10943f);
        return true;
    }

    public void advancePeekPosition(int i) throws IOException, InterruptedException {
        advancePeekPosition(i, false);
    }

    public void resetPeekPosition() {
        this.f10943f = 0;
    }

    public long getPeekPosition() {
        return this.f10941d + ((long) this.f10943f);
    }

    public long getPosition() {
        return this.f10941d;
    }

    public long getLength() {
        return this.f10940c;
    }

    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        C2289a.m8311a(j >= 0);
        this.f10941d = j;
        throw e;
    }

    /* renamed from: a */
    private void m13626a(int i) {
        int i2 = this.f10943f + i;
        if (i2 > this.f10942e.length) {
            this.f10942e = Arrays.copyOf(this.f10942e, C2314v.m8456a(this.f10942e.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: b */
    private int m13627b(int i) {
        i = Math.min(this.f10944g, i);
        m13628c(i);
        return i;
    }

    /* renamed from: a */
    private int m13624a(byte[] bArr, int i, int i2) {
        if (this.f10944g == 0) {
            return 0;
        }
        i2 = Math.min(this.f10944g, i2);
        System.arraycopy(this.f10942e, 0, bArr, i, i2);
        m13628c(i2);
        return i2;
    }

    /* renamed from: c */
    private void m13628c(int i) {
        this.f10944g -= i;
        this.f10943f = 0;
        Object obj = this.f10942e;
        if (this.f10944g < this.f10942e.length - 524288) {
            obj = new byte[(this.f10944g + 65536)];
        }
        System.arraycopy(this.f10942e, i, obj, 0, this.f10944g);
        this.f10942e = obj;
    }

    /* renamed from: a */
    private int m13625a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        bArr = this.f10939b.read(bArr, i + i3, i2 - i3);
        if (bArr != -1) {
            return i3 + bArr;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: d */
    private void m13629d(int i) {
        if (i != -1) {
            this.f10941d += (long) i;
        }
    }
}
