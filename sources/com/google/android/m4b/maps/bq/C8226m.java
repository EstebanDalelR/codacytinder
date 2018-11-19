package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ay.C4723n;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bo;
import com.google.android.m4b.maps.br.C4875d;
import com.google.android.m4b.maps.bs.C4881d;
import com.google.android.m4b.maps.ch.C5203e;
import java.io.File;
import java.util.Locale;

/* renamed from: com.google.android.m4b.maps.bq.m */
public final class C8226m extends C8205n {
    /* renamed from: e */
    public static final C4873a f29395e = new C4873a();
    /* renamed from: g */
    private boolean f29396g = false;
    /* renamed from: h */
    private volatile C4873a f29397h;

    /* renamed from: com.google.android.m4b.maps.bq.m$a */
    public interface C4873a {
        C4873a() {
        }
    }

    public C8226m(C4723n c4723n, bg bgVar, int i, float f, Locale locale, boolean z, File file, C4873a c4873a, C4881d c4881d, C5203e c5203e) {
        super(c4723n, bgVar, i, f, locale, z, file, null, c5203e);
        this.f29397h = c4873a;
    }

    /* renamed from: a */
    public final void mo7079a(ba baVar, C4875d c4875d) {
        m35050a(baVar, null, c4875d);
    }

    /* renamed from: a */
    public final void m35050a(ba baVar, bo boVar, C4875d c4875d) {
        if (this.f29397h != null) {
            boVar = this.f29397h;
        }
        super.mo7079a(baVar, c4875d);
    }
}
