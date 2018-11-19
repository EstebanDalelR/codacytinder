package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.exoplayer2.audio.i */
public final class C3595i implements AudioProcessor {
    /* renamed from: b */
    private int f10781b = -1;
    /* renamed from: c */
    private int f10782c = -1;
    /* renamed from: d */
    private int f10783d;
    /* renamed from: e */
    private boolean f10784e;
    /* renamed from: f */
    private ByteBuffer f10785f = a;
    /* renamed from: g */
    private ByteBuffer f10786g = a;
    /* renamed from: h */
    private boolean f10787h;
    /* renamed from: i */
    private byte[] f10788i = new byte[0];
    /* renamed from: j */
    private byte[] f10789j = new byte[0];
    /* renamed from: k */
    private int f10790k;
    /* renamed from: l */
    private int f10791l;
    /* renamed from: m */
    private int f10792m;
    /* renamed from: n */
    private boolean f10793n;
    /* renamed from: o */
    private long f10794o;

    public int getOutputEncoding() {
        return 2;
    }

    /* renamed from: a */
    public void m13507a(boolean z) {
        this.f10784e = z;
        flush();
    }

    /* renamed from: a */
    public long m13506a() {
        return this.f10794o;
    }

    public boolean configure(int i, int i2, int i3) throws UnhandledFormatException {
        if (i3 != 2) {
            throw new UnhandledFormatException(i, i2, i3);
        } else if (this.f10782c == i && this.f10781b == i2) {
            return false;
        } else {
            this.f10782c = i;
            this.f10781b = i2;
            this.f10783d = i2 * 2;
            return true;
        }
    }

    public boolean isActive() {
        return this.f10782c != -1 && this.f10784e;
    }

    public int getOutputChannelCount() {
        return this.f10781b;
    }

    public int getOutputSampleRateHz() {
        return this.f10782c;
    }

    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.f10786g.hasRemaining()) {
            switch (this.f10790k) {
                case 0:
                    m13498a(byteBuffer);
                    break;
                case 1:
                    m13501b(byteBuffer);
                    break;
                case 2:
                    m13502c(byteBuffer);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public void queueEndOfStream() {
        this.f10787h = true;
        if (this.f10791l > 0) {
            m13500a(this.f10788i, this.f10791l);
        }
        if (!this.f10793n) {
            this.f10794o += (long) (this.f10792m / this.f10783d);
        }
    }

    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f10786g;
        this.f10786g = a;
        return byteBuffer;
    }

    public boolean isEnded() {
        return this.f10787h && this.f10786g == a;
    }

    public void flush() {
        if (isActive()) {
            int a = m13496a(100000) * this.f10783d;
            if (this.f10788i.length != a) {
                this.f10788i = new byte[a];
            }
            this.f10792m = m13496a(10000) * this.f10783d;
            if (this.f10789j.length != this.f10792m) {
                this.f10789j = new byte[this.f10792m];
            }
        }
        this.f10790k = 0;
        this.f10786g = a;
        this.f10787h = false;
        this.f10794o = 0;
        this.f10791l = 0;
        this.f10793n = false;
    }

    public void reset() {
        this.f10784e = false;
        flush();
        this.f10785f = a;
        this.f10781b = -1;
        this.f10782c = -1;
        this.f10792m = 0;
        this.f10788i = new byte[0];
        this.f10789j = new byte[0];
    }

    /* renamed from: a */
    private void m13498a(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f10788i.length));
        int f = m13505f(byteBuffer);
        if (f == byteBuffer.position()) {
            this.f10790k = 1;
        } else {
            byteBuffer.limit(f);
            m13503d(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: b */
    private void m13501b(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int e = m13504e(byteBuffer);
        int position = e - byteBuffer.position();
        int length = this.f10788i.length - this.f10791l;
        if (e >= limit || position >= length) {
            e = Math.min(position, length);
            byteBuffer.limit(byteBuffer.position() + e);
            byteBuffer.get(this.f10788i, this.f10791l, e);
            this.f10791l += e;
            if (this.f10791l == this.f10788i.length) {
                if (this.f10793n) {
                    m13500a(this.f10788i, this.f10792m);
                    this.f10794o += (long) ((this.f10791l - (this.f10792m * 2)) / this.f10783d);
                } else {
                    this.f10794o += (long) ((this.f10791l - this.f10792m) / this.f10783d);
                }
                m13499a(byteBuffer, this.f10788i, this.f10791l);
                this.f10791l = 0;
                this.f10790k = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        m13500a(this.f10788i, this.f10791l);
        this.f10791l = 0;
        this.f10790k = 0;
    }

    /* renamed from: c */
    private void m13502c(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int e = m13504e(byteBuffer);
        byteBuffer.limit(e);
        this.f10794o += (long) (byteBuffer.remaining() / this.f10783d);
        m13499a(byteBuffer, this.f10789j, this.f10792m);
        if (e < limit) {
            m13500a(this.f10789j, this.f10792m);
            this.f10790k = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: a */
    private void m13500a(byte[] bArr, int i) {
        m13497a(i);
        this.f10785f.put(bArr, 0, i);
        this.f10785f.flip();
        this.f10786g = this.f10785f;
    }

    /* renamed from: d */
    private void m13503d(ByteBuffer byteBuffer) {
        m13497a(byteBuffer.remaining());
        this.f10785f.put(byteBuffer);
        this.f10785f.flip();
        this.f10786g = this.f10785f;
    }

    /* renamed from: a */
    private void m13497a(int i) {
        if (this.f10785f.capacity() < i) {
            this.f10785f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f10785f.clear();
        }
        if (i > 0) {
            this.f10793n = true;
        }
    }

    /* renamed from: a */
    private void m13499a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f10792m);
        int i2 = this.f10792m - min;
        System.arraycopy(bArr, i - i2, this.f10789j, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f10789j, i2, min);
    }

    /* renamed from: a */
    private int m13496a(long j) {
        return (int) ((j * ((long) this.f10782c)) / 1000000);
    }

    /* renamed from: e */
    private int m13504e(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.get(position)) > 4) {
                return this.f10783d * (position / this.f10783d);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: f */
    private int m13505f(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs(byteBuffer.get(limit)) > 4) {
                return (this.f10783d * (limit / this.f10783d)) + this.f10783d;
            }
        }
        return byteBuffer.position();
    }
}
