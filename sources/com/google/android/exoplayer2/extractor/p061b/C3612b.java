package com.google.android.exoplayer2.extractor.p061b;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2076i;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.C2054a;
import com.google.android.exoplayer2.extractor.p061b.C2062h.C2061a;
import com.google.android.exoplayer2.util.C2295f;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.b.b */
final class C3612b extends C2062h {
    /* renamed from: a */
    private C2295f f10924a;
    /* renamed from: b */
    private C3611a f10925b;

    /* renamed from: com.google.android.exoplayer2.extractor.b.b$a */
    private class C3611a implements SeekMap, C2059f {
        /* renamed from: a */
        final /* synthetic */ C3612b f10919a;
        /* renamed from: b */
        private long[] f10920b;
        /* renamed from: c */
        private long[] f10921c;
        /* renamed from: d */
        private long f10922d = -1;
        /* renamed from: e */
        private long f10923e = -1;

        /* renamed from: c */
        public SeekMap mo2252c() {
            return this;
        }

        public boolean isSeekable() {
            return true;
        }

        public C3611a(C3612b c3612b) {
            this.f10919a = c3612b;
        }

        /* renamed from: b */
        public void m13595b(long j) {
            this.f10922d = j;
        }

        /* renamed from: a */
        public void m13594a(C2302k c2302k) {
            c2302k.m8390d(1);
            int k = c2302k.m8399k() / 18;
            this.f10920b = new long[k];
            this.f10921c = new long[k];
            for (int i = 0; i < k; i++) {
                this.f10920b[i] = c2302k.m8405q();
                this.f10921c[i] = c2302k.m8405q();
                c2302k.m8390d(2);
            }
        }

        /* renamed from: a */
        public long mo2251a(ExtractorInput extractorInput) throws IOException, InterruptedException {
            if (this.f10923e < 0) {
                return -1;
            }
            long j = -(this.f10923e + 2);
            this.f10923e = -1;
            return j;
        }

        /* renamed from: a */
        public long mo2250a(long j) {
            j = this.f10919a.m7395b(j);
            this.f10923e = this.f10920b[C2314v.m8460a(this.f10920b, j, true, true)];
            return j;
        }

        public C2054a getSeekPoints(long j) {
            int a = C2314v.m8460a(this.f10920b, this.f10919a.m7395b(j), true, true);
            long a2 = this.f10919a.m7390a(this.f10920b[a]);
            C2076i c2076i = new C2076i(a2, this.f10922d + this.f10921c[a]);
            if (a2 < j) {
                if (a != this.f10920b.length - 1) {
                    a++;
                    return new C2054a(c2076i, new C2076i(this.f10919a.m7390a(this.f10920b[a]), this.f10922d + this.f10921c[a]));
                }
            }
            return new C2054a(c2076i);
        }

        public long getDurationUs() {
            return this.f10919a.f10924a.m8336b();
        }
    }

    C3612b() {
    }

    /* renamed from: a */
    public static boolean m13598a(C2302k c2302k) {
        return (c2302k.m8385b() >= 5 && c2302k.m8395g() == 127 && c2302k.m8401m() == 1179402563) ? true : null;
    }

    /* renamed from: a */
    protected void mo2253a(boolean z) {
        super.mo2253a(z);
        if (z) {
            this.f10924a = null;
            this.f10925b = null;
        }
    }

    /* renamed from: a */
    private static boolean m13599a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: b */
    protected long mo2255b(C2302k c2302k) {
        if (C3612b.m13599a(c2302k.f6929a)) {
            return (long) m13600c(c2302k);
        }
        return -1;
    }

    /* renamed from: a */
    protected boolean mo2254a(C2302k c2302k, long j, C2061a c2061a) throws IOException, InterruptedException {
        byte[] bArr = c2302k.f6929a;
        if (this.f10924a == null) {
            this.f10924a = new C2295f(bArr, 17);
            c2302k = Arrays.copyOfRange(bArr, 9, c2302k.m8387c());
            c2302k[4] = Byte.MIN_VALUE;
            c2061a.f5658a = Format.createAudioSampleFormat(null, "audio/flac", null, -1, this.f10924a.m8335a(), this.f10924a.f6903f, this.f10924a.f6902e, Collections.singletonList(c2302k), null, 0, null);
        } else if ((bArr[0] & 127) == 3) {
            this.f10925b = new C3611a(this);
            this.f10925b.m13594a(c2302k);
        } else if (C3612b.m13599a(bArr) != null) {
            if (this.f10925b != null) {
                this.f10925b.m13595b(j);
                c2061a.f5659b = this.f10925b;
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private int m13600c(C2302k c2302k) {
        int i = (c2302k.f6929a[2] & 255) >> 4;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
            case 7:
                c2302k.m8390d(4);
                c2302k.m8378A();
                i = i == 6 ? c2302k.m8395g() : c2302k.m8396h();
                c2302k.m8388c(0);
                return i + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
