package com.google.android.m4b.maps.cd;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bx.C6561r;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bx.aj;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import java.util.Iterator;
import java.util.Vector;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cd.b */
public final class C7507b extends C6561r {
    /* renamed from: a */
    private final Vector<C7506a> f27826a = new Vector();
    /* renamed from: b */
    private C7506a f27827b;

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (!this.f27826a.isEmpty()) {
            synchronized (this.f27826a) {
                Iterator it = this.f27826a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                GL10 x = c5052d.m22635x();
                x.glPushMatrix();
                x.glMatrixMode(5889);
                x.glPushMatrix();
                x.glLoadIdentity();
                x.glOrthof(0.0f, (float) c6570b.m29249e(), 0.0f, (float) c6570b.m29250f(), -1.0f, 1.0f);
                x.glMatrixMode(5888);
                x.glLoadIdentity();
                try {
                    it = this.f27826a.iterator();
                    while (it.hasNext()) {
                        ((C7506a) it.next()).mo5222a(c5052d, c6570b, c5009j);
                    }
                } finally {
                    C7507b.m32775d(c5052d);
                }
            }
        }
    }

    /* renamed from: d */
    private static void m32775d(C5052d c5052d) {
        c5052d = c5052d.m22635x();
        c5052d.glMatrixMode(5889);
        c5052d.glPopMatrix();
        c5052d.glMatrixMode(5888);
        c5052d.glPopMatrix();
    }

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        Iterator it = this.f27826a.iterator();
        while (it.hasNext()) {
            ((C7506a) it.next()).mo7044a(c6570b, c5052d);
        }
        return super.mo7044a(c6570b, c5052d);
    }

    /* renamed from: a */
    public final boolean mo7043a(float f, float f2, af afVar, C6570b c6570b) {
        Iterator it = this.f27826a.iterator();
        while (it.hasNext()) {
            if (((C7506a) it.next()).mo7043a(f, f2, afVar, c6570b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo7105b(float f, float f2, C6570b c6570b) {
        Iterator it = this.f27826a.iterator();
        while (it.hasNext()) {
            C7506a c7506a = (C7506a) it.next();
            if (c7506a.mo7105b(f, f2, c6570b)) {
                this.f27827b = c7506a;
                return true;
            }
        }
        return false;
    }

    public final void a_() {
        if (this.f27827b != null) {
            this.f27827b.a_();
            this.f27827b = null;
        }
    }

    /* renamed from: c */
    public final boolean mo7145c(float f, float f2, C6570b c6570b) {
        Iterator it = this.f27826a.iterator();
        while (it.hasNext()) {
            if (((C7506a) it.next()).mo7145c(f, f2, c6570b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return C5016a.HEADS_UP_DISPLAY;
    }

    public final boolean f_() {
        Iterator it = this.f27826a.iterator();
        while (it.hasNext()) {
            if (((C7506a) it.next()).f_()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo7144c(float f, float f2, af afVar, C6570b c6570b) {
        Iterator it = this.f27826a.iterator();
        while (it.hasNext()) {
            if (((C7506a) it.next()).mo7144c(f, f2, afVar, c6570b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo7040a(C5052d c5052d) {
        Iterator it = this.f27826a.iterator();
        while (it.hasNext()) {
            ((C7506a) it.next()).mo7040a(c5052d);
        }
    }

    /* renamed from: a */
    public final void mo7041a(C5052d c5052d, aj ajVar) {
        Iterator it = this.f27826a.iterator();
        while (it.hasNext()) {
            ((C7506a) it.next()).mo7041a(c5052d, ajVar);
        }
    }
}
