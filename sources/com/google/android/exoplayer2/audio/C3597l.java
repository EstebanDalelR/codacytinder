package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import com.google.android.exoplayer2.util.C2314v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.exoplayer2.audio.l */
final class C3597l implements AudioProcessor {
    /* renamed from: b */
    private boolean f10808b;
    /* renamed from: c */
    private int f10809c;
    /* renamed from: d */
    private int f10810d;
    /* renamed from: e */
    private int f10811e = -1;
    /* renamed from: f */
    private int f10812f = -1;
    /* renamed from: g */
    private int f10813g;
    /* renamed from: h */
    private ByteBuffer f10814h = a;
    /* renamed from: i */
    private ByteBuffer f10815i = a;
    /* renamed from: j */
    private byte[] f10816j = new byte[0];
    /* renamed from: k */
    private int f10817k;
    /* renamed from: l */
    private boolean f10818l;

    public int getOutputEncoding() {
        return 2;
    }

    /* renamed from: a */
    public void m13511a(int i, int i2) {
        this.f10809c = i;
        this.f10810d = i2;
    }

    public boolean configure(int i, int i2, int i3) throws UnhandledFormatException {
        if (i3 != 2) {
            throw new UnhandledFormatException(i, i2, i3);
        }
        this.f10811e = i2;
        this.f10812f = i;
        this.f10816j = new byte[((this.f10810d * i2) * 2)];
        this.f10817k = 0;
        this.f10813g = (this.f10809c * i2) * 2;
        i2 = this.f10808b;
        if (this.f10809c == 0) {
            if (this.f10810d == 0) {
                i3 = 0;
                this.f10808b = i3;
                if (i2 == this.f10808b) {
                    return true;
                }
                return false;
            }
        }
        i3 = 1;
        this.f10808b = i3;
        if (i2 == this.f10808b) {
            return false;
        }
        return true;
    }

    public boolean isActive() {
        return this.f10808b;
    }

    public int getOutputChannelCount() {
        return this.f10811e;
    }

    public int getOutputSampleRateHz() {
        return this.f10812f;
    }

    public void queueInput(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int min = Math.min(i, this.f10813g);
        this.f10813g -= min;
        byteBuffer.position(position + min);
        if (this.f10813g <= 0) {
            i -= min;
            position = (this.f10817k + i) - this.f10816j.length;
            if (this.f10814h.capacity() < position) {
                this.f10814h = ByteBuffer.allocateDirect(position).order(ByteOrder.nativeOrder());
            } else {
                this.f10814h.clear();
            }
            min = C2314v.m8456a(position, 0, this.f10817k);
            this.f10814h.put(this.f10816j, 0, min);
            position = C2314v.m8456a(position - min, 0, i);
            byteBuffer.limit(byteBuffer.position() + position);
            this.f10814h.put(byteBuffer);
            byteBuffer.limit(limit);
            i -= position;
            this.f10817k -= min;
            System.arraycopy(this.f10816j, min, this.f10816j, 0, this.f10817k);
            byteBuffer.get(this.f10816j, this.f10817k, i);
            this.f10817k += i;
            this.f10814h.flip();
            this.f10815i = this.f10814h;
        }
    }

    public void queueEndOfStream() {
        this.f10818l = true;
    }

    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f10815i;
        this.f10815i = a;
        return byteBuffer;
    }

    public boolean isEnded() {
        return this.f10818l && this.f10815i == a;
    }

    public void flush() {
        this.f10815i = a;
        this.f10818l = false;
        this.f10813g = 0;
        this.f10817k = 0;
    }

    public void reset() {
        flush();
        this.f10814h = a;
        this.f10811e = -1;
        this.f10812f = -1;
        this.f10816j = new byte[0];
    }
}
