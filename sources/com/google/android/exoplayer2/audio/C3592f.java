package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import com.google.android.exoplayer2.util.C2314v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.exoplayer2.audio.f */
final class C3592f implements AudioProcessor {
    /* renamed from: b */
    private static final int f10767b = Float.floatToIntBits(Float.NaN);
    /* renamed from: c */
    private int f10768c = -1;
    /* renamed from: d */
    private int f10769d = -1;
    /* renamed from: e */
    private int f10770e = 0;
    /* renamed from: f */
    private ByteBuffer f10771f = a;
    /* renamed from: g */
    private ByteBuffer f10772g = a;
    /* renamed from: h */
    private boolean f10773h;

    public int getOutputEncoding() {
        return 4;
    }

    public boolean configure(int i, int i2, int i3) throws UnhandledFormatException {
        if (!C2314v.m8494d(i3)) {
            throw new UnhandledFormatException(i, i2, i3);
        } else if (this.f10768c == i && this.f10769d == i2 && this.f10770e == i3) {
            return false;
        } else {
            this.f10768c = i;
            this.f10769d = i2;
            this.f10770e = i3;
            return true;
        }
    }

    public boolean isActive() {
        return C2314v.m8494d(this.f10770e);
    }

    public int getOutputChannelCount() {
        return this.f10769d;
    }

    public int getOutputSampleRateHz() {
        return this.f10768c;
    }

    public void queueInput(ByteBuffer byteBuffer) {
        Object obj = this.f10770e == 1073741824 ? 1 : null;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (obj == null) {
            i = (i / 3) * 4;
        }
        if (this.f10771f.capacity() < i) {
            this.f10771f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f10771f.clear();
        }
        if (obj != null) {
            while (position < limit) {
                C3592f.m13495a((((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8)) | ((byteBuffer.get(position + 2) & 255) << 16)) | ((byteBuffer.get(position + 3) & 255) << 24), this.f10771f);
                position += 4;
            }
        } else {
            while (position < limit) {
                C3592f.m13495a((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16)) | ((byteBuffer.get(position + 2) & 255) << 24), this.f10771f);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f10771f.flip();
        this.f10772g = this.f10771f;
    }

    public void queueEndOfStream() {
        this.f10773h = true;
    }

    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f10772g;
        this.f10772g = a;
        return byteBuffer;
    }

    public boolean isEnded() {
        return this.f10773h && this.f10772g == a;
    }

    public void flush() {
        this.f10772g = a;
        this.f10773h = false;
    }

    public void reset() {
        flush();
        this.f10768c = -1;
        this.f10769d = -1;
        this.f10770e = 0;
        this.f10771f = a;
    }

    /* renamed from: a */
    private static void m13495a(int i, ByteBuffer byteBuffer) {
        i = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (i == f10767b) {
            i = Float.floatToIntBits(0);
        }
        byteBuffer.putInt(i);
    }
}
