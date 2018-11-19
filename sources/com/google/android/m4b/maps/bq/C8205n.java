package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4723n;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bo;
import com.google.android.m4b.maps.bq.C7467b.C7466a;
import com.google.android.m4b.maps.bq.C8066a.C8065a;
import com.google.android.m4b.maps.bs.C4881d;
import com.google.android.m4b.maps.bw.C4978f;
import com.google.android.m4b.maps.ch.C5203e;
import io.fabric.sdk.android.services.events.C15645a;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.m4b.maps.bq.n */
public class C8205n extends C8066a {
    /* renamed from: e */
    private static final List<Integer> f29346e = Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(12)});
    /* renamed from: f */
    protected long f29347f;

    public C8205n(C4723n c4723n, bg bgVar, int i, float f, Locale locale, boolean z, File file, C4881d c4881d, C5203e c5203e) {
        String str;
        StringBuilder stringBuilder;
        bg bgVar2 = bgVar;
        String str2 = bgVar2.f17774D;
        if (!(c4723n == null || c4723n.mo4895j() == null)) {
            if (!"DriveAbout".equals(c4723n.mo4895j())) {
                str = C15645a.ROLL_OVER_FILE_NAME_SEPARATOR;
                String valueOf = String.valueOf(c4723n.mo4895j().replace(':', '_'));
                str = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                stringBuilder = new StringBuilder((String.valueOf(str2).length() + 3) + String.valueOf(str).length());
                stringBuilder.append("vts");
                stringBuilder.append(str2);
                stringBuilder.append(str);
                super(c4723n, stringBuilder.toString(), bgVar2, 256, f29346e, 1, i, f, false, locale, z, file, c4881d, c5203e);
                this.f29347f = -1;
            }
        }
        str = "";
        stringBuilder = new StringBuilder((String.valueOf(str2).length() + 3) + String.valueOf(str).length());
        stringBuilder.append("vts");
        stringBuilder.append(str2);
        stringBuilder.append(str);
        super(c4723n, stringBuilder.toString(), bgVar2, 256, f29346e, 1, i, f, false, locale, z, file, c4881d, c5203e);
        this.f29347f = -1;
    }

    public void run() {
        C4978f.m22258a();
        try {
            super.run();
        } finally {
            C4978f.m22261b();
        }
    }

    /* renamed from: d */
    protected final C7466a mo7550d() {
        return new C8065a(this, this.c) {
            /* renamed from: c */
            private /* synthetic */ C8205n f29345c;

            /* renamed from: b */
            protected final az mo7549b(int i) {
                if (this.b[i] == null) {
                    return null;
                }
                long c;
                if (r0.f29345c.f29347f > 0) {
                    C4712d.m20955a();
                    c = C4712d.m20957c() + r0.f29345c.f29347f;
                } else {
                    c = -1;
                }
                az a = bo.m32230a(m32287a(i).f24237a, r0.b[i], 0, m32287a(i).f24244h, c, -1, r0.f29345c.c);
                a.mo5098c(C4712d.m20955a());
                return a;
            }

            /* renamed from: a */
            protected final byte[] mo7638a(int i, int i2) {
                i = new byte[(i + 8)];
                ac.m21433a(this.a, i, 0);
                ac.m21433a(i2, i, 4);
                return i;
            }

            /* renamed from: c */
            protected final byte[] mo7637c(int i) {
                return this.b[i];
            }
        };
    }

    /* renamed from: a */
    public final void m34987a(long j) {
        this.f29347f = 120000;
    }
}
