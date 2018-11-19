package com.google.android.m4b.maps.cb;

import com.google.android.m4b.maps.ca.C5052d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.microedition.khronos.opengles.GL11;

/* renamed from: com.google.android.m4b.maps.cb.f */
public class C5064f {
    /* renamed from: a */
    private ByteBuffer f18773a;
    /* renamed from: b */
    private int f18774b;
    /* renamed from: c */
    private final boolean f18775c;
    /* renamed from: d */
    private final boolean f18776d;
    /* renamed from: e */
    private int f18777e;
    /* renamed from: f */
    private final int[] f18778f = new int[1];
    /* renamed from: g */
    private boolean f18779g = false;
    /* renamed from: h */
    private int f18780h;

    /* renamed from: com.google.android.m4b.maps.cb.f$a */
    public static final class C6578a extends C5064f {
        public C6578a(float[] fArr, int i) {
            super(9);
            ByteBuffer order = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder());
            order.asFloatBuffer().put(fArr);
            super.mo5271a(order);
        }

        /* renamed from: a */
        public final void mo5271a(ByteBuffer byteBuffer) {
            throw new UnsupportedOperationException("Immutable");
        }

        /* renamed from: b */
        public final void mo5272b(C5052d c5052d) {
            throw new UnsupportedOperationException("Immutable");
        }
    }

    public C5064f(int i) {
        boolean z = true;
        this.f18774b = i;
        this.f18775c = (i & 8) != 0;
        if ((i & 4) == 0) {
            z = false;
        }
        this.f18776d = z;
        this.f18777e = 12;
        if (this.f18776d != 0) {
            this.f18777e += 16;
        }
        if (this.f18775c != 0) {
            this.f18777e += 8;
        }
    }

    /* renamed from: a */
    public void mo5271a(ByteBuffer byteBuffer) {
        this.f18773a = byteBuffer;
        this.f18779g = true;
        this.f18780h = this.f18773a.capacity() / this.f18777e;
    }

    /* renamed from: a */
    public final int m22681a() {
        return this.f18780h;
    }

    /* renamed from: a */
    public final void m22682a(C5052d c5052d) {
        GL11 gl11 = (GL11) c5052d.m22635x();
        if (this.f18778f[0] == 0) {
            GL11 gl112 = (GL11) c5052d.m22635x();
            gl112.glGenBuffers(1, this.f18778f, 0);
            gl112.glBindBuffer(34962, this.f18778f[0]);
        } else {
            gl11.glBindBuffer(34962, this.f18778f[0]);
        }
        if (this.f18779g != null) {
            this.f18773a.rewind();
            gl11.glBufferData(34962, this.f18773a.capacity(), this.f18773a, 35044);
            this.f18779g = false;
        }
        gl11.glVertexPointer(3, 5126, this.f18777e, 0);
        int i = 12;
        if (this.f18776d != null) {
            gl11.glColorPointer(4, 5126, this.f18777e, 12);
            i = 28;
        }
        if (this.f18775c != null) {
            gl11.glTexCoordPointer(2, 5126, this.f18777e, i);
        }
        gl11.glBindBuffer(34962, 0);
    }

    /* renamed from: b */
    public void mo5272b(C5052d c5052d) {
        m22686d(c5052d);
        this.f18773a = null;
    }

    /* renamed from: c */
    public final void m22685c(C5052d c5052d) {
        m22686d(c5052d);
    }

    /* renamed from: d */
    public final void m22686d(C5052d c5052d) {
        if (this.f18778f[0] != 0) {
            if (c5052d != null) {
                ((GL11) c5052d.m22635x()).glDeleteBuffers(1, this.f18778f, 0);
            }
            this.f18778f[0] = null;
            if (this.f18773a != null) {
                this.f18773a.clear();
            }
        }
    }
}
