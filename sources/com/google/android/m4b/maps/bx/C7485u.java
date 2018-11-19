package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5051c;
import com.google.android.m4b.maps.ca.C5052d;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.bx.u */
public class C7485u extends C6561r {
    /* renamed from: a */
    private C5016a f27623a;
    /* renamed from: b */
    private int[] f27624b = new int[(C5008i.f18492h + 1)];

    public C7485u(C5016a c5016a) {
        this.f27623a = c5016a;
    }

    /* renamed from: b */
    public void mo7551b(int i) {
        Arrays.fill(this.f27624b, i);
    }

    /* renamed from: a */
    public final void m32525a(C5008i c5008i, int i) {
        this.f27624b[c5008i.m22384a()] = Integer.MIN_VALUE;
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return this.f27623a;
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        c6570b = this.f27624b[c5009j.m22385a().m22384a()];
        if (c5009j.m22388b() <= null) {
            if (c6570b != null) {
                c5009j = c5052d.m22635x();
                c5009j.glPushMatrix();
                c5009j.glLoadIdentity();
                c5009j.glTranslatef(0.0f, 0.0f, -1.0f);
                c5009j.glBlendFunc(770, 771);
                C5051c.m22593a(c5009j, c6570b);
                c5052d.f18689g.mo7123d(c5052d);
                c5009j.glDrawArrays(5, null, 4);
                c5009j.glPopMatrix();
            }
        }
    }
}
