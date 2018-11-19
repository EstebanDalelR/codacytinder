package com.google.android.exoplayer2.text.p065a;

import android.util.Log;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.text.a.f */
public final class C2223f {
    /* renamed from: a */
    private static final int f6502a = C2314v.m8499g("GA94");
    /* renamed from: b */
    private static final int f6503b = C2314v.m8499g("DTG1");

    /* renamed from: a */
    public static void m7958a(long j, C2302k c2302k, TrackOutput[] trackOutputArr) {
        C2302k c2302k2 = c2302k;
        TrackOutput[] trackOutputArr2 = trackOutputArr;
        while (c2302k.m8385b() > 1) {
            int a = C2223f.m7957a(c2302k);
            int a2 = C2223f.m7957a(c2302k);
            int d = c2302k.m8389d() + a2;
            if (a2 != -1) {
                if (a2 <= c2302k.m8385b()) {
                    if (a == 4 && a2 >= 8) {
                        a = c2302k.m8395g();
                        a2 = c2302k.m8396h();
                        int o = a2 == 49 ? c2302k.m8403o() : 0;
                        int g = c2302k.m8395g();
                        if (a2 == 47) {
                            c2302k2.m8390d(1);
                        }
                        a = (a == 181 && ((a2 == 49 || a2 == 47) && g == 3)) ? 1 : 0;
                        if (a2 == 49) {
                            if (o != f6502a) {
                                if (o != f6503b) {
                                    a2 = 0;
                                    a &= a2;
                                }
                            }
                            a2 = 1;
                            a &= a2;
                        }
                        if (a != 0) {
                            a = c2302k.m8395g() & 31;
                            c2302k2.m8390d(1);
                            a *= 3;
                            int d2 = c2302k.m8389d();
                            for (TrackOutput trackOutput : trackOutputArr2) {
                                c2302k2.m8388c(d2);
                                trackOutput.sampleData(c2302k2, a);
                                trackOutput.sampleMetadata(j, 1, a, 0, null);
                            }
                        }
                    }
                    c2302k2.m8388c(d);
                }
            }
            Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
            d = c2302k.m8387c();
            c2302k2.m8388c(d);
        }
    }

    /* renamed from: a */
    private static int m7957a(C2302k c2302k) {
        int i = 0;
        while (c2302k.m8385b() != 0) {
            int g = c2302k.m8395g();
            i += g;
            if (g != 255) {
                return i;
            }
        }
        return -1;
    }
}
