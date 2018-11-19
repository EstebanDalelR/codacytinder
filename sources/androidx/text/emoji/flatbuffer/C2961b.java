package androidx.text.emoji.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: androidx.text.emoji.flatbuffer.b */
public final class C2961b extends C0749c {
    /* renamed from: a */
    public static C2961b m11466a(ByteBuffer byteBuffer) {
        return C2961b.m11467a(byteBuffer, new C2961b());
    }

    /* renamed from: a */
    public static C2961b m11467a(ByteBuffer byteBuffer, C2961b c2961b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c2961b.m11472b(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: a */
    public void m11470a(int i, ByteBuffer byteBuffer) {
        this.b = i;
        this.c = byteBuffer;
    }

    /* renamed from: b */
    public C2961b m11472b(int i, ByteBuffer byteBuffer) {
        m11470a(i, byteBuffer);
        return this;
    }

    /* renamed from: a */
    public int m11468a() {
        int b = m2657b(4);
        return b != 0 ? this.c.getInt(b + this.b) : 0;
    }

    /* renamed from: a */
    public C2960a m11469a(C2960a c2960a, int i) {
        int b = m2657b(6);
        return b != 0 ? c2960a.m11460b(m2658c(m2660e(b) + (i * 4)), this.c) : null;
    }

    /* renamed from: b */
    public int m11471b() {
        int b = m2657b(6);
        return b != 0 ? m2659d(b) : 0;
    }
}
