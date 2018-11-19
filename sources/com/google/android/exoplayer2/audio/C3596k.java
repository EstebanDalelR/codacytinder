package com.google.android.exoplayer2.audio;

import android.support.annotation.Nullable;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.exoplayer2.audio.k */
public final class C3596k implements AudioProcessor {
    /* renamed from: b */
    private int f10795b = -1;
    /* renamed from: c */
    private int f10796c = -1;
    /* renamed from: d */
    private float f10797d = 1.0f;
    /* renamed from: e */
    private float f10798e = 1.0f;
    /* renamed from: f */
    private int f10799f = -1;
    /* renamed from: g */
    private int f10800g = -1;
    @Nullable
    /* renamed from: h */
    private C2032j f10801h;
    /* renamed from: i */
    private ByteBuffer f10802i = a;
    /* renamed from: j */
    private ShortBuffer f10803j = this.f10802i.asShortBuffer();
    /* renamed from: k */
    private ByteBuffer f10804k = a;
    /* renamed from: l */
    private long f10805l;
    /* renamed from: m */
    private long f10806m;
    /* renamed from: n */
    private boolean f10807n;

    public int getOutputEncoding() {
        return 2;
    }

    /* renamed from: a */
    public float m13508a(float f) {
        f = C2314v.m8454a(f, 0.1f, 8.0f);
        if (this.f10797d != f) {
            this.f10797d = f;
            this.f10801h = null;
        }
        flush();
        return f;
    }

    /* renamed from: b */
    public float m13510b(float f) {
        f = C2314v.m8454a(f, 0.1f, 8.0f);
        if (this.f10798e != f) {
            this.f10798e = f;
            this.f10801h = null;
        }
        flush();
        return f;
    }

    /* renamed from: a */
    public long m13509a(long j) {
        if (this.f10806m < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (((double) this.f10797d) * ((double) j));
        }
        if (this.f10799f == this.f10796c) {
            j = C2314v.m8492d(j, this.f10805l, this.f10806m);
        } else {
            j = C2314v.m8492d(j, this.f10805l * ((long) this.f10799f), this.f10806m * ((long) this.f10796c));
        }
        return j;
    }

    public boolean configure(int i, int i2, int i3) throws UnhandledFormatException {
        if (i3 != 2) {
            throw new UnhandledFormatException(i, i2, i3);
        }
        i3 = this.f10800g == -1 ? i : this.f10800g;
        if (this.f10796c == i && this.f10795b == i2 && this.f10799f == i3) {
            return false;
        }
        this.f10796c = i;
        this.f10795b = i2;
        this.f10799f = i3;
        this.f10801h = 0;
        return true;
    }

    public boolean isActive() {
        return this.f10796c != -1 && (Math.abs(this.f10797d - 1.0f) >= 0.01f || Math.abs(this.f10798e - 1.0f) >= 0.01f || this.f10799f != this.f10796c);
    }

    public int getOutputChannelCount() {
        return this.f10795b;
    }

    public int getOutputSampleRateHz() {
        return this.f10799f;
    }

    public void queueInput(ByteBuffer byteBuffer) {
        C2289a.m8313b(this.f10801h != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f10805l += (long) remaining;
            this.f10801h.m7335a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        byteBuffer = (this.f10801h.m7338c() * this.f10795b) * 2;
        if (byteBuffer > null) {
            if (this.f10802i.capacity() < byteBuffer) {
                this.f10802i = ByteBuffer.allocateDirect(byteBuffer).order(ByteOrder.nativeOrder());
                this.f10803j = this.f10802i.asShortBuffer();
            } else {
                this.f10802i.clear();
                this.f10803j.clear();
            }
            this.f10801h.m7337b(this.f10803j);
            this.f10806m += (long) byteBuffer;
            this.f10802i.limit(byteBuffer);
            this.f10804k = this.f10802i;
        }
    }

    public void queueEndOfStream() {
        C2289a.m8313b(this.f10801h != null);
        this.f10801h.m7334a();
        this.f10807n = true;
    }

    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f10804k;
        this.f10804k = a;
        return byteBuffer;
    }

    public boolean isEnded() {
        return this.f10807n && (this.f10801h == null || this.f10801h.m7338c() == 0);
    }

    public void flush() {
        if (isActive()) {
            if (this.f10801h == null) {
                this.f10801h = new C2032j(this.f10796c, this.f10795b, this.f10797d, this.f10798e, this.f10799f);
            } else {
                this.f10801h.m7336b();
            }
        }
        this.f10804k = a;
        this.f10805l = 0;
        this.f10806m = 0;
        this.f10807n = false;
    }

    public void reset() {
        this.f10797d = 1.0f;
        this.f10798e = 1.0f;
        this.f10795b = -1;
        this.f10796c = -1;
        this.f10799f = -1;
        this.f10802i = a;
        this.f10803j = this.f10802i.asShortBuffer();
        this.f10804k = a;
        this.f10800g = -1;
        this.f10801h = null;
        this.f10805l = 0;
        this.f10806m = 0;
        this.f10807n = false;
    }
}
