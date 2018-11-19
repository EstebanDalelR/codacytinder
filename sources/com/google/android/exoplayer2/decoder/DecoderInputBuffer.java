package com.google.android.exoplayer2.decoder;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public class DecoderInputBuffer extends C2033a {
    /* renamed from: a */
    public final C2036b f10829a = new C2036b();
    /* renamed from: b */
    public ByteBuffer f10830b;
    /* renamed from: c */
    public long f10831c;
    /* renamed from: d */
    private final int f10832d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    /* renamed from: e */
    public static DecoderInputBuffer m13515e() {
        return new DecoderInputBuffer(0);
    }

    public DecoderInputBuffer(int i) {
        this.f10832d = i;
    }

    /* renamed from: e */
    public void m13518e(int i) throws IllegalStateException {
        if (this.f10830b == null) {
            this.f10830b = m13516f(i);
            return;
        }
        int capacity = this.f10830b.capacity();
        int position = this.f10830b.position();
        i += position;
        if (capacity < i) {
            i = m13516f(i);
            if (position > 0) {
                this.f10830b.position(0);
                this.f10830b.limit(position);
                i.put(this.f10830b);
            }
            this.f10830b = i;
        }
    }

    /* renamed from: f */
    public final boolean m13519f() {
        return this.f10830b == null && this.f10832d == 0;
    }

    /* renamed from: g */
    public final boolean m13520g() {
        return m7346d(1073741824);
    }

    /* renamed from: h */
    public final void m13521h() {
        this.f10830b.flip();
    }

    /* renamed from: a */
    public void mo2221a() {
        super.mo2221a();
        if (this.f10830b != null) {
            this.f10830b.clear();
        }
    }

    /* renamed from: f */
    private ByteBuffer m13516f(int i) {
        if (this.f10832d == 1) {
            return ByteBuffer.allocate(i);
        }
        if (this.f10832d == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        int capacity = this.f10830b == null ? 0 : this.f10830b.capacity();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Buffer too small (");
        stringBuilder.append(capacity);
        stringBuilder.append(" < ");
        stringBuilder.append(i);
        stringBuilder.append(")");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
