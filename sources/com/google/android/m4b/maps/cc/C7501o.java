package com.google.android.m4b.maps.cc;

import android.graphics.Bitmap;
import com.google.android.m4b.maps.bb.C4749e;
import com.google.android.m4b.maps.bb.C4749e.C4748a;
import com.google.android.m4b.maps.bo.ak;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bo.C4843b;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C7490k;
import com.google.android.m4b.maps.cb.C6579g;
import com.tinder.api.ManagerWebServices;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cc.o */
public final class C7501o extends C6581d {
    /* renamed from: h */
    private static final Map<Float, C6579g> f27739h = Collections.synchronizedMap(new TreeMap());
    /* renamed from: b */
    private volatile C7490k f27740b;
    /* renamed from: c */
    private C6579g f27741c;
    /* renamed from: d */
    private final byte[] f27742d;
    /* renamed from: e */
    private C4749e f27743e;
    /* renamed from: f */
    private boolean f27744f = 1;
    /* renamed from: g */
    private long f27745g = null;

    /* renamed from: a */
    public static C7501o m32692a(ba baVar, String[] strArr, C4843b c4843b, C5052d c5052d) {
        baVar = new HashSet();
        ak akVar = (ak) c4843b.next();
        for (int i : akVar.mo5111l()) {
            if (i >= 0 && i < strArr.length) {
                baVar.add(strArr[i]);
            }
        }
        return new C7501o(akVar.m28563b(), baVar);
    }

    /* renamed from: a */
    public static C7501o m32693a(byte[] bArr, ba baVar, C5052d c5052d) {
        return new C7501o(bArr, new HashSet());
    }

    private C7501o(byte[] bArr, C5052d c5052d) {
        super(c5052d);
        this.f27742d = bArr;
    }

    /* renamed from: d */
    private android.graphics.Bitmap m32695d(com.google.android.m4b.maps.ca.C5052d r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = new android.graphics.BitmapFactory$Options;
        r0.<init>();
        r1 = 1;
        r0.inPurgeable = r1;
        r0.inInputShareable = r1;
        r1 = android.graphics.Bitmap.Config.RGB_565;
        r0.inPreferredConfig = r1;
        r3 = r3.m22623l();	 Catch:{ OutOfMemoryError -> 0x0019 }
        r1 = r2.f27742d;	 Catch:{ OutOfMemoryError -> 0x0019 }
        r3 = r3.m22650a(r1, r0);	 Catch:{ OutOfMemoryError -> 0x0019 }
        goto L_0x001a;
    L_0x0019:
        r3 = 0;
    L_0x001a:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cc.o.d(com.google.android.m4b.maps.ca.d):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        if (this.f27740b != null) {
            this.f27740b.m32557f();
            this.f27740b = null;
            this.f27744f = true;
        }
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        mo5223b(c5052d);
        this.a.clear();
    }

    /* renamed from: a */
    public static void m32694a(C5052d c5052d) {
        GL10 x = c5052d.m22635x();
        x.glBlendFunc(1, 771);
        x.glTexEnvx(8960, 8704, 8448);
        c5052d.m22627p();
        c5052d.f18687e.mo7123d(c5052d);
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        c6570b = this.f27740b;
        if (c6570b == null) {
            Bitmap d;
            if (!this.f27744f) {
                c5052d.m22612b((int) ManagerWebServices.TIMEOUT_DEFAULT_MS);
                d = m32695d(c5052d);
            } else if (c5052d.m22610a((int) ManagerWebServices.TIMEOUT_DEFAULT_MS)) {
                d = m32695d(c5052d);
                this.f27743e = new C4749e(this.f27745g, 250, C4748a.FADE_IN);
            } else {
                d = null;
            }
            if (d != null) {
                C6579g c6579g;
                c6570b = new C7490k(c5052d);
                c6570b.m32552c(true);
                c6570b.m32548b(d);
                this.f27740b = c6570b;
                float b = c6570b.m32546b();
                if (f27739h.containsKey(Float.valueOf(b))) {
                    c6579g = (C6579g) f27739h.get(Float.valueOf(b));
                } else {
                    C6579g c6579g2 = new C6579g(8);
                    int i = (int) (65536.0f * b);
                    c6579g2.mo5254a(0, 0);
                    c6579g2.mo5254a(0, i);
                    c6579g2.mo5254a(i, 0);
                    c6579g2.mo5254a(i, i);
                    f27739h.put(Float.valueOf(b), c6579g2);
                    c6579g = c6579g2;
                }
                this.f27741c = c6579g;
                d.recycle();
            }
        }
        if (c6570b != null) {
            GL10 x = c5052d.m22635x();
            this.f27741c.mo7118d(c5052d);
            c6570b.m32544a(x);
            if (this.f27743e != null) {
                c5052d = this.f27743e.m21087a(c5052d);
                if (c5052d == 65536) {
                    this.f27743e = null;
                    this.f27744f = false;
                }
            } else {
                c5052d = 65536;
            }
            x.glColor4x(c5052d, c5052d, c5052d, c5052d);
            x.glDrawArrays(5, 0, 4);
        }
    }

    /* renamed from: c */
    public final boolean m32702c() {
        return this.f27744f;
    }

    /* renamed from: e */
    public final void m32703e() {
        this.f27744f = false;
    }

    /* renamed from: a */
    public final void m32697a(long j) {
        this.f27745g = j;
    }

    /* renamed from: a */
    public final int mo7125a() {
        C7490k c7490k = this.f27740b;
        if (c7490k != null) {
            return 0 + c7490k.m32559h();
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo7126b() {
        if (this.f27742d != null) {
            return 96 + (this.f27742d.length + 16);
        }
        return 96;
    }
}
