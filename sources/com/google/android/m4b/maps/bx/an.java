package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import javax.microedition.khronos.opengles.GL10;

public final class an {
    /* renamed from: a */
    public static void m22326a(C5052d c5052d, C6570b c6570b, af afVar, float f, float[] fArr) {
        m22325a(c5052d, c6570b, afVar, f, true, fArr);
    }

    /* renamed from: a */
    private static void m22325a(C5052d c5052d, C6570b c6570b, af afVar, float f, boolean z, float[] fArr) {
        af afVar2;
        af afVar3;
        if (c5052d == null) {
            afVar2 = new af();
            afVar3 = new af();
        } else {
            af afVar4 = c5052d.f18694l;
            afVar3 = c5052d.f18695m;
            afVar2 = afVar4;
        }
        c6570b.m29237a(afVar2);
        af.m21468b(afVar, afVar2, afVar3);
        if (z) {
            afVar3.m21497i(afVar3);
        }
        c5052d = c6570b.m29261q();
        fArr[null] = ((float) afVar3.m21490f()) * c5052d;
        fArr[1] = ((float) afVar3.m21492g()) * c5052d;
        fArr[2] = ((float) afVar3.m21494h()) * c5052d;
        fArr[3] = c5052d * f;
    }

    /* renamed from: a */
    public static void m22324a(C5052d c5052d, C6570b c6570b, af afVar, float f) {
        m22326a(c5052d, c6570b, afVar, f, c5052d.f18693k);
        m22328a(c5052d.m22635x(), c5052d.f18693k);
    }

    /* renamed from: b */
    public static void m22329b(C5052d c5052d, C6570b c6570b, af afVar, float f) {
        m22325a(c5052d, c6570b, afVar, f, false, c5052d.f18693k);
        m22328a(c5052d.m22635x(), c5052d.f18693k);
    }

    /* renamed from: a */
    public static void m22328a(GL10 gl10, float[] fArr) {
        gl10.glTranslatef(fArr[0], fArr[1], fArr[2]);
        gl10.glScalef(fArr[3], fArr[3], fArr[3]);
    }

    /* renamed from: a */
    public static void m22327a(GL10 gl10, C6570b c6570b) {
        gl10.glRotatef(-c6570b.m29254j(), 0.0f, 0.0f, 1.0f);
        gl10.glRotatef(c6570b.m29255k() - 90.0f, 1.0f, 0.0f, 0.0f);
    }
}
