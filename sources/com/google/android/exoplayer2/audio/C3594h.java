package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.exoplayer2.audio.h */
final class C3594h implements AudioProcessor {
    /* renamed from: b */
    private int f10775b = -1;
    /* renamed from: c */
    private int f10776c = -1;
    /* renamed from: d */
    private int f10777d = 0;
    /* renamed from: e */
    private ByteBuffer f10778e = a;
    /* renamed from: f */
    private ByteBuffer f10779f = a;
    /* renamed from: g */
    private boolean f10780g;

    public int getOutputEncoding() {
        return 2;
    }

    public boolean configure(int i, int i2, int i3) throws UnhandledFormatException {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new UnhandledFormatException(i, i2, i3);
        } else if (this.f10775b == i && this.f10776c == i2 && this.f10777d == i3) {
            return false;
        } else {
            this.f10775b = i;
            this.f10776c = i2;
            this.f10777d = i3;
            return true;
        }
    }

    public boolean isActive() {
        return (this.f10777d == 0 || this.f10777d == 2) ? false : true;
    }

    public int getOutputChannelCount() {
        return this.f10776c;
    }

    public int getOutputSampleRateHz() {
        return this.f10775b;
    }

    public void queueInput(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f10777d;
        if (i2 == Integer.MIN_VALUE) {
            i = (i / 3) * 2;
        } else if (i2 == 3) {
            i *= 2;
        } else if (i2 != 1073741824) {
            throw new IllegalStateException();
        } else {
            i /= 2;
        }
        if (this.f10778e.capacity() < i) {
            this.f10778e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f10778e.clear();
        }
        i = this.f10777d;
        if (i == Integer.MIN_VALUE) {
            while (position < limit) {
                this.f10778e.put(byteBuffer.get(position + 1));
                this.f10778e.put(byteBuffer.get(position + 2));
                position += 3;
            }
        } else if (i == 3) {
            while (position < limit) {
                this.f10778e.put((byte) 0);
                this.f10778e.put((byte) ((byteBuffer.get(position) & 255) - 128));
                position++;
            }
        } else if (i != 1073741824) {
            throw new IllegalStateException();
        } else {
            while (position < limit) {
                this.f10778e.put(byteBuffer.get(position + 2));
                this.f10778e.put(byteBuffer.get(position + 3));
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f10778e.flip();
        this.f10779f = this.f10778e;
    }

    public void queueEndOfStream() {
        this.f10780g = true;
    }

    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f10779f;
        this.f10779f = a;
        return byteBuffer;
    }

    public boolean isEnded() {
        return this.f10780g && this.f10779f == a;
    }

    public void flush() {
        this.f10779f = a;
        this.f10780g = false;
    }

    public void reset() {
        flush();
        this.f10775b = -1;
        this.f10776c = -1;
        this.f10777d = 0;
        this.f10778e = a;
    }
}
