package com.google.android.m4b.maps.cj;

import com.google.android.m4b.maps.ac.C4591a;
import com.google.android.m4b.maps.cw.C5312a.C8228a;
import com.google.android.m4b.maps.cw.C5312a.C8228a.C8227a;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.cj.a */
public final class C5214a {
    /* renamed from: a */
    public static String m23263a(C8228a c8228a) {
        byte[] f = c8228a.mo7225f();
        C8227a s = C8228a.m35056s();
        if (c8228a.m35061p()) {
            s.m35052a(c8228a.m35062q());
        }
        if (!c8228a.m35063r().isEmpty()) {
            s.m35053a(c8228a.m35063r());
        }
        if (Arrays.equals(((C8228a) s.m34393e()).mo7225f(), f) != null) {
            return C4591a.m20681b().mo4844a().m20685a(f);
        }
        throw new IllegalArgumentException("The place id is not normalized");
    }
}
