package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.C2300i;
import com.google.android.exoplayer2.util.C2302k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.video.b */
public final class C2328b {
    /* renamed from: a */
    public final List<byte[]> f6997a;
    /* renamed from: b */
    public final int f6998b;

    /* renamed from: a */
    public static C2328b m8523a(C2302k c2302k) throws ParserException {
        try {
            int i;
            int h;
            c2302k.m8390d(21);
            int g = c2302k.m8395g() & 3;
            int g2 = c2302k.m8395g();
            int d = c2302k.m8389d();
            int i2 = 0;
            int i3 = 0;
            while (i2 < g2) {
                c2302k.m8390d(1);
                int h2 = c2302k.m8396h();
                i = i3;
                for (i3 = 0; i3 < h2; i3++) {
                    h = c2302k.m8396h();
                    i += h + 4;
                    c2302k.m8390d(h);
                }
                i2++;
                i3 = i;
            }
            c2302k.m8388c(d);
            Object obj = new byte[i3];
            i2 = 0;
            i = 0;
            while (i2 < g2) {
                c2302k.m8390d(1);
                h = c2302k.m8396h();
                int i4 = i;
                for (i = 0; i < h; i++) {
                    int h3 = c2302k.m8396h();
                    System.arraycopy(C2300i.f6921a, 0, obj, i4, C2300i.f6921a.length);
                    i4 += C2300i.f6921a.length;
                    System.arraycopy(c2302k.f6929a, c2302k.m8389d(), obj, i4, h3);
                    i4 += h3;
                    c2302k.m8390d(h3);
                }
                i2++;
                i = i4;
            }
            if (i3 == 0) {
                c2302k = null;
            } else {
                c2302k = Collections.singletonList(obj);
            }
            return new C2328b(c2302k, g + 1);
        } catch (C2302k c2302k2) {
            throw new ParserException("Error parsing HEVC config", c2302k2);
        }
    }

    private C2328b(List<byte[]> list, int i) {
        this.f6997a = list;
        this.f6998b = i;
    }
}
