package com.google.android.m4b.maps.cb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.m4b.maps.cb.j */
public final class C5066j {
    /* renamed from: a */
    private ByteBuffer f18781a;
    /* renamed from: b */
    private ShortBuffer f18782b;
    /* renamed from: c */
    private IntBuffer f18783c;

    /* renamed from: a */
    public final ByteBuffer m22693a() {
        if (this.f18781a == null) {
            this.f18781a = ByteBuffer.allocateDirect(196608);
            this.f18781a.order(ByteOrder.nativeOrder());
        }
        this.f18781a.position(0);
        this.f18781a.limit(196608);
        return this.f18781a;
    }

    /* renamed from: b */
    public final ShortBuffer m22694b() {
        if (this.f18782b == null) {
            this.f18782b = m22693a().asShortBuffer();
        }
        this.f18782b.position(0);
        this.f18782b.limit(98304);
        return this.f18782b;
    }

    /* renamed from: c */
    public final IntBuffer m22695c() {
        if (this.f18783c == null) {
            this.f18783c = m22693a().asIntBuffer();
        }
        this.f18783c.position(0);
        this.f18783c.limit(49152);
        return this.f18783c;
    }
}
