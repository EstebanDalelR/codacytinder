package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.C4258a;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.webvtt.C3710d.C2241a;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.text.webvtt.b */
public final class C4386b extends C4258a {
    /* renamed from: a */
    private static final int f14543a = C2314v.m8499g("payl");
    /* renamed from: b */
    private static final int f14544b = C2314v.m8499g("sttg");
    /* renamed from: c */
    private static final int f14545c = C2314v.m8499g("vttc");
    /* renamed from: d */
    private final C2302k f14546d = new C2302k();
    /* renamed from: e */
    private final C2241a f14547e = new C2241a();

    /* renamed from: a */
    protected /* synthetic */ Subtitle mo3740a(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        return m18127b(bArr, i, z);
    }

    public C4386b() {
        super("Mp4WebvttDecoder");
    }

    /* renamed from: b */
    protected C3709c m18127b(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f14546d.m8383a(bArr, i);
        bArr = new ArrayList();
        while (this.f14546d.m8385b() > 0) {
            if (this.f14546d.m8385b() < true) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            i = this.f14546d.m8403o();
            if (this.f14546d.m8403o() == f14545c) {
                bArr.add(C4386b.m18125a(this.f14546d, this.f14547e, i - 8));
            } else {
                this.f14546d.m8390d(i - 8);
            }
        }
        return new C3709c(bArr);
    }

    /* renamed from: a */
    private static Cue m18125a(C2302k c2302k, C2241a c2241a, int i) throws SubtitleDecoderException {
        c2241a.m8073a();
        while (i > 0) {
            if (i < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int o = c2302k.m8403o();
            int o2 = c2302k.m8403o();
            i -= 8;
            o -= 8;
            String str = new String(c2302k.f6929a, c2302k.m8389d(), o);
            c2302k.m8390d(o);
            i -= o;
            if (o2 == f14544b) {
                C2244e.m8087a(str, c2241a);
            } else if (o2 == f14543a) {
                C2244e.m8089a(null, str.trim(), c2241a, Collections.emptyList());
            }
        }
        return c2241a.m8077b();
    }
}
