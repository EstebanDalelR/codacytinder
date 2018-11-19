package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4723n;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bp.C7465b;
import com.google.android.m4b.maps.bq.C7467b.C7466a;
import com.google.android.m4b.maps.bq.C8066a.C8065a;
import com.google.android.m4b.maps.bs.C4881d;
import com.google.android.m4b.maps.ch.C5203e;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.m4b.maps.bq.h */
public final class C8203h extends C8066a {
    /* renamed from: e */
    private static final List<Integer> f29344e = Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(9)});

    public C8203h(C4723n c4723n, bg bgVar, Locale locale, File file, C4881d c4881d, C5203e c5203e) {
        String str = "rgts";
        bg bgVar2 = bgVar;
        String valueOf = String.valueOf(bgVar2.f17774D);
        super(c4723n, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), bgVar2, 256, f29344e, 1, 24, 1.0f, true, locale, false, file, null, c5203e);
    }

    /* renamed from: d */
    protected final C7466a mo7550d() {
        return new C8065a(this, this.c) {
            /* renamed from: c */
            private /* synthetic */ C8203h f29343c;

            /* renamed from: b */
            protected final az mo7549b(int i) {
                if (this.b[i] == null) {
                    return 0;
                }
                ba baVar = m32287a(i).f24237a;
                i = this.b[i];
                C4712d.m20955a();
                return C7465b.m32269a(baVar, i, 0, C4712d.m20957c() + 1209600000);
            }

            /* renamed from: h */
            protected final int mo7075h() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r3 = this;
                r0 = 0;
                r1 = 0;
            L_0x0002:
                r2 = r3.b;
                r2 = r2.length;
                if (r1 >= r2) goto L_0x0019;
            L_0x0007:
                r2 = r3.b;
                r2 = r2[r1];
                if (r2 == 0) goto L_0x0016;
            L_0x000d:
                r2 = r3.b;	 Catch:{ IOException -> 0x0016 }
                r2 = r2[r1];	 Catch:{ IOException -> 0x0016 }
                r2 = com.google.android.m4b.maps.bp.C7465b.m32268a(r2, r0);	 Catch:{ IOException -> 0x0016 }
                return r2;
            L_0x0016:
                r1 = r1 + 1;
                goto L_0x0002;
            L_0x0019:
                r0 = -1;
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bq.h.1.h():int");
            }

            /* renamed from: c */
            protected final byte[] mo7637c(int i) {
                return this.b[i];
            }
        };
    }
}
