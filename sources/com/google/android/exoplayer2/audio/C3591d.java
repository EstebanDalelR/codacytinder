package com.google.android.exoplayer2.audio;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import com.google.android.exoplayer2.util.C2289a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.audio.d */
final class C3591d implements AudioProcessor {
    /* renamed from: b */
    private int f10759b = -1;
    /* renamed from: c */
    private int f10760c = -1;
    @Nullable
    /* renamed from: d */
    private int[] f10761d;
    /* renamed from: e */
    private boolean f10762e;
    @Nullable
    /* renamed from: f */
    private int[] f10763f;
    /* renamed from: g */
    private ByteBuffer f10764g = a;
    /* renamed from: h */
    private ByteBuffer f10765h = a;
    /* renamed from: i */
    private boolean f10766i;

    public int getOutputEncoding() {
        return 2;
    }

    /* renamed from: a */
    public void m13494a(@Nullable int[] iArr) {
        this.f10761d = iArr;
    }

    public boolean configure(int i, int i2, int i3) throws UnhandledFormatException {
        boolean equals = Arrays.equals(this.f10761d, this.f10763f) ^ true;
        this.f10763f = this.f10761d;
        if (this.f10763f == null) {
            this.f10762e = false;
            return equals;
        } else if (i3 != 2) {
            throw new UnhandledFormatException(i, i2, i3);
        } else if (!equals && this.f10760c == i && this.f10759b == i2) {
            return false;
        } else {
            this.f10760c = i;
            this.f10759b = i2;
            this.f10762e = i2 != this.f10763f.length;
            int i4 = 0;
            while (i4 < this.f10763f.length) {
                int i5 = this.f10763f[i4];
                if (i5 >= i2) {
                    throw new UnhandledFormatException(i, i2, i3);
                }
                this.f10762e = (i5 != i4 ? 1 : 0) | this.f10762e;
                i4++;
            }
            return true;
        }
    }

    public boolean isActive() {
        return this.f10762e;
    }

    public int getOutputChannelCount() {
        return this.f10763f == null ? this.f10759b : this.f10763f.length;
    }

    public int getOutputSampleRateHz() {
        return this.f10760c;
    }

    public void queueInput(ByteBuffer byteBuffer) {
        C2289a.m8313b(this.f10763f != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f10759b * 2)) * this.f10763f.length) * 2;
        if (this.f10764g.capacity() < length) {
            this.f10764g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f10764g.clear();
        }
        while (position < limit) {
            for (int i : this.f10763f) {
                this.f10764g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f10759b * 2;
        }
        byteBuffer.position(limit);
        this.f10764g.flip();
        this.f10765h = this.f10764g;
    }

    public void queueEndOfStream() {
        this.f10766i = true;
    }

    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f10765h;
        this.f10765h = a;
        return byteBuffer;
    }

    public boolean isEnded() {
        return this.f10766i && this.f10765h == a;
    }

    public void flush() {
        this.f10765h = a;
        this.f10766i = false;
    }

    public void reset() {
        flush();
        this.f10764g = a;
        this.f10759b = -1;
        this.f10760c = -1;
        this.f10763f = null;
        this.f10761d = null;
        this.f10762e = false;
    }
}
