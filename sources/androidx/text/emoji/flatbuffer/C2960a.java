package androidx.text.emoji.flatbuffer;

import java.nio.ByteBuffer;

/* renamed from: androidx.text.emoji.flatbuffer.a */
public final class C2960a extends C0749c {
    /* renamed from: a */
    public void m11459a(int i, ByteBuffer byteBuffer) {
        this.b = i;
        this.c = byteBuffer;
    }

    /* renamed from: b */
    public C2960a m11460b(int i, ByteBuffer byteBuffer) {
        m11459a(i, byteBuffer);
        return this;
    }

    /* renamed from: a */
    public int m11457a() {
        int b = m2657b(4);
        return b != 0 ? this.c.getInt(b + this.b) : 0;
    }

    /* renamed from: b */
    public boolean m11461b() {
        int b = m2657b(6);
        if (b == 0 || this.c.get(b + this.b) == (byte) 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public short m11462c() {
        int b = m2657b(8);
        return b != 0 ? this.c.getShort(b + this.b) : (short) 0;
    }

    /* renamed from: d */
    public short m11463d() {
        int b = m2657b(12);
        return b != 0 ? this.c.getShort(b + this.b) : (short) 0;
    }

    /* renamed from: e */
    public short m11464e() {
        int b = m2657b(14);
        return b != 0 ? this.c.getShort(b + this.b) : (short) 0;
    }

    /* renamed from: a */
    public int m11458a(int i) {
        int b = m2657b(16);
        return b != 0 ? this.c.getInt(m2660e(b) + (i * 4)) : 0;
    }

    /* renamed from: f */
    public int m11465f() {
        int b = m2657b(16);
        return b != 0 ? m2659d(b) : 0;
    }
}
