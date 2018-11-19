package com.google.android.m4b.maps.be;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.m4b.maps.be.d */
public final class C6459d extends C4775a<int[]> {
    /* renamed from: e */
    private static final C4777c<int[]> f23973e = new C64581(100);

    /* renamed from: com.google.android.m4b.maps.be.d$1 */
    class C64581 extends C4777c<int[]> {
        C64581(int i) {
            super(100);
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo5015a() {
            return new int[1034];
        }
    }

    public C6459d(int i) {
        super(i, 10, f23973e);
    }

    /* renamed from: a */
    public final void m28317a(IntBuffer intBuffer) {
        for (int i = 0; i < this.b; i++) {
            intBuffer.put((int[]) this.a.get(i), 0, 1024);
        }
        if (this.b != this.a.size()) {
            intBuffer.put((int[]) this.c, 0, this.d);
        }
    }

    /* renamed from: a */
    public final void m28318a(ShortBuffer shortBuffer, int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            int[] iArr = (int[]) this.a.get(i2);
            for (int i3 = 0; i3 < 1024; i3++) {
                shortBuffer.put((short) (iArr[i3] / i));
            }
        }
        if (this.b != this.a.size()) {
            for (int i4 = 0; i4 < this.d; i4++) {
                shortBuffer.put((short) (((int[]) this.c)[i4] / i));
            }
        }
    }

    /* renamed from: a */
    public final void m28316a(ByteBuffer byteBuffer, int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            int[] iArr = (int[]) this.a.get(i2);
            for (int i3 = 0; i3 < 1024; i3++) {
                byteBuffer.put((byte) (iArr[i3] / i));
            }
        }
        if (this.b != this.a.size()) {
            for (int i4 = 0; i4 < this.d; i4++) {
                byteBuffer.put((byte) (((int[]) this.c)[i4] / i));
            }
        }
    }
}
