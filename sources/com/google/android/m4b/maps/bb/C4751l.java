package com.google.android.m4b.maps.bb;

import android.view.animation.LinearInterpolator;
import com.google.android.m4b.maps.ca.C5052d;

/* renamed from: com.google.android.m4b.maps.bb.l */
public final class C4751l {
    /* renamed from: b */
    private static final Integer[] f17417b = new Integer[]{Integer.valueOf(0), Integer.valueOf(164), Integer.valueOf(655), Integer.valueOf(1469), Integer.valueOf(2598), Integer.valueOf(4030), Integer.valueOf(5752), Integer.valueOf(7747), Integer.valueOf(9997), Integer.valueOf(12479), Integer.valueOf(15169), Integer.valueOf(18042), Integer.valueOf(21071), Integer.valueOf(24224), Integer.valueOf(27474), Integer.valueOf(30787), Integer.valueOf(34133), Integer.valueOf(37478), Integer.valueOf(40792), Integer.valueOf(44041), Integer.valueOf(47195), Integer.valueOf(50223), Integer.valueOf(53096), Integer.valueOf(55787), Integer.valueOf(58269), Integer.valueOf(60518), Integer.valueOf(62514), Integer.valueOf(64236), Integer.valueOf(65668), Integer.valueOf(66796), Integer.valueOf(67610), Integer.valueOf(68102), Integer.valueOf(68266), Integer.valueOf(68102), Integer.valueOf(67610), Integer.valueOf(66796), Integer.valueOf(65668), Integer.valueOf(65536)};
    /* renamed from: c */
    private static final int f17418c = 296;
    /* renamed from: a */
    private final C8063a<Integer> f17419a = new C8063a(new LinearInterpolator(), f17417b);

    public C4751l() {
        this.f17419a.setDuration((long) f17418c);
    }

    /* renamed from: a */
    public final int m21091a(C5052d c5052d) {
        long e = c5052d.m22616e();
        if (!this.f17419a.hasStarted()) {
            this.f17419a.start();
        }
        this.f17419a.m32050b(e);
        int intValue = ((Integer) this.f17419a.m32049b()).intValue();
        if (!this.f17419a.hasEnded()) {
            c5052d.m22611b();
        }
        return intValue;
    }
}
