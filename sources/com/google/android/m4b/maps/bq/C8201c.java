package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ay.C4723n;
import com.google.android.m4b.maps.bo.C6523o;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bq.C7467b.C7466a;
import com.google.android.m4b.maps.bq.C8066a.C8065a;
import com.google.android.m4b.maps.bs.C4881d;
import com.google.android.m4b.maps.ch.C5203e;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.m4b.maps.bq.c */
public final class C8201c extends C8066a {
    /* renamed from: e */
    private static final List<Integer> f29342e = Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(5)});

    public C8201c(C4723n c4723n, bg bgVar, int i, int i2, float f, Locale locale, File file, C4881d c4881d, C5203e c5203e) {
        String str = "its";
        bg bgVar2 = bgVar;
        String valueOf = String.valueOf(bgVar2.f17774D);
        super(c4723n, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), bgVar2, 256, f29342e, i, i2, f, false, locale, false, file, null, c5203e);
    }

    /* renamed from: d */
    protected final C7466a mo7550d() {
        return new C8065a(this, this.c) {
            /* renamed from: c */
            private /* synthetic */ C8201c f29341c;

            /* renamed from: b */
            protected final az mo7549b(int i) {
                if (this.b[i] == null) {
                    return 0;
                }
                return new C6523o(m32287a(i).f24237a, mo7075h(), 256, 256, this.b[i], this.f29341c.b, this.f29341c.c);
            }

            /* renamed from: c */
            protected final byte[] mo7637c(int r7) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r6 = this;
                r0 = r6.b;
                r0 = r0[r7];
                r1 = 0;
                if (r0 != 0) goto L_0x0008;
            L_0x0007:
                return r1;
            L_0x0008:
                r0 = new java.io.ByteArrayOutputStream;
                r2 = r6.b;
                r2 = r2[r7];
                r2 = r2.length;
                r2 = r2 + 32;
                r0.<init>(r2);
                r2 = r6.m32287a(r7);	 Catch:{ IOException -> 0x004c }
                r2 = r2.f24237a;	 Catch:{ IOException -> 0x004c }
                r3 = r6.mo7075h();	 Catch:{ IOException -> 0x004c }
                r4 = r6.b;	 Catch:{ IOException -> 0x004c }
                r7 = r4[r7];	 Catch:{ IOException -> 0x004c }
                r4 = new java.io.DataOutputStream;	 Catch:{ IOException -> 0x004c }
                r4.<init>(r0);	 Catch:{ IOException -> 0x004c }
                r5 = 1146241364; // 0x44524154 float:841.02075 double:5.6631848E-315;	 Catch:{ IOException -> 0x004c }
                r4.writeInt(r5);	 Catch:{ IOException -> 0x004c }
                r5 = 8;	 Catch:{ IOException -> 0x004c }
                com.google.android.m4b.maps.bo.bl.m21699a(r4, r5);	 Catch:{ IOException -> 0x004c }
                r2.m21618a(r4);	 Catch:{ IOException -> 0x004c }
                com.google.android.m4b.maps.bo.bl.m21699a(r4, r3);	 Catch:{ IOException -> 0x004c }
                r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;	 Catch:{ IOException -> 0x004c }
                com.google.android.m4b.maps.bo.bl.m21699a(r4, r2);	 Catch:{ IOException -> 0x004c }
                com.google.android.m4b.maps.bo.bl.m21699a(r4, r2);	 Catch:{ IOException -> 0x004c }
                r2 = r7.length;	 Catch:{ IOException -> 0x004c }
                com.google.android.m4b.maps.bo.bl.m21699a(r4, r2);	 Catch:{ IOException -> 0x004c }
                r4.write(r7);	 Catch:{ IOException -> 0x004c }
                r7 = r0.toByteArray();	 Catch:{ IOException -> 0x004c }
                return r7;
            L_0x004c:
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bq.c.1.c(int):byte[]");
            }
        };
    }
}
