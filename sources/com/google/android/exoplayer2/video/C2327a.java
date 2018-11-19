package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.C2292c;
import com.google.android.exoplayer2.util.C2300i;
import com.google.android.exoplayer2.util.C2302k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.video.a */
public final class C2327a {
    /* renamed from: a */
    public final List<byte[]> f6992a;
    /* renamed from: b */
    public final int f6993b;
    /* renamed from: c */
    public final int f6994c;
    /* renamed from: d */
    public final int f6995d;
    /* renamed from: e */
    public final float f6996e;

    /* renamed from: a */
    public static C2327a m8521a(C2302k c2302k) throws ParserException {
        try {
            c2302k.m8390d(4);
            int g = (c2302k.m8395g() & 3) + 1;
            if (g == 3) {
                throw new IllegalStateException();
            }
            int i;
            int i2;
            float f;
            int i3;
            List arrayList = new ArrayList();
            int g2 = c2302k.m8395g() & 31;
            for (i = 0; i < g2; i++) {
                arrayList.add(C2327a.m8522b(c2302k));
            }
            i = c2302k.m8395g();
            for (i2 = 0; i2 < i; i2++) {
                arrayList.add(C2327a.m8522b(c2302k));
            }
            if (g2 > 0) {
                c2302k = C2300i.m8353a((byte[]) arrayList.get(0), g, ((byte[]) arrayList.get(0)).length);
                g2 = c2302k.f6912b;
                int i4 = c2302k.f6913c;
                f = c2302k.f6914d;
                i2 = g2;
                i3 = i4;
            } else {
                i2 = -1;
                i3 = -1;
                f = 1.0f;
            }
            return new C2327a(arrayList, g, i2, i3, f);
        } catch (C2302k c2302k2) {
            throw new ParserException("Error parsing AVC config", c2302k2);
        }
    }

    private C2327a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f6992a = list;
        this.f6993b = i;
        this.f6994c = i2;
        this.f6995d = i3;
        this.f6996e = f;
    }

    /* renamed from: b */
    private static byte[] m8522b(C2302k c2302k) {
        int h = c2302k.m8396h();
        int d = c2302k.m8389d();
        c2302k.m8390d(h);
        return C2292c.m8325a(c2302k.f6929a, d, h);
    }
}
