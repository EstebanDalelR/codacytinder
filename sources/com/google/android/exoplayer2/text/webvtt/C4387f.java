package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.C4258a;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.webvtt.C3710d.C2241a;
import com.google.android.exoplayer2.util.C2302k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.webvtt.f */
public final class C4387f extends C4258a {
    /* renamed from: a */
    private final C2244e f14548a = new C2244e();
    /* renamed from: b */
    private final C2302k f14549b = new C2302k();
    /* renamed from: c */
    private final C2241a f14550c = new C2241a();
    /* renamed from: d */
    private final C2239a f14551d = new C2239a();
    /* renamed from: e */
    private final List<WebvttCssStyle> f14552e = new ArrayList();

    /* renamed from: a */
    protected /* synthetic */ Subtitle mo3740a(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        return m18131b(bArr, i, z);
    }

    public C4387f() {
        super("WebvttDecoder");
    }

    /* renamed from: b */
    protected C3711h m18131b(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f14549b.m8383a(bArr, i);
        this.f14550c.m8073a();
        this.f14552e.clear();
        C2245g.m8099a(this.f14549b);
        while (TextUtils.isEmpty(this.f14549b.m8414z()) == null) {
        }
        bArr = new ArrayList();
        while (true) {
            boolean a = C4387f.m18128a(this.f14549b);
            if (!a) {
                return new C3711h(bArr);
            }
            if (a) {
                C4387f.m18129b(this.f14549b);
            } else if (a) {
                if (bArr.isEmpty() == 0) {
                    throw new SubtitleDecoderException("A style block was found after the first cue.");
                }
                this.f14549b.m8414z();
                i = this.f14551d.m8066a(this.f14549b);
                if (i != 0) {
                    this.f14552e.add(i);
                }
            } else if (a && this.f14548a.m8097a(this.f14549b, this.f14550c, this.f14552e) != 0) {
                bArr.add(this.f14550c.m8077b());
                this.f14550c.m8073a();
            }
        }
    }

    /* renamed from: a */
    private static int m18128a(C2302k c2302k) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = c2302k.m8389d();
            String z = c2302k.m8414z();
            i = z == null ? 0 : "STYLE".equals(z) ? 2 : "NOTE".startsWith(z) ? 1 : 3;
        }
        c2302k.m8388c(i2);
        return i;
    }

    /* renamed from: b */
    private static void m18129b(C2302k c2302k) {
        while (!TextUtils.isEmpty(c2302k.m8414z())) {
        }
    }
}
