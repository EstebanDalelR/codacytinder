package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2300i;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2303l;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.ts.i */
public final class C3654i implements ElementaryStreamReader {
    /* renamed from: a */
    private final C2114q f11249a;
    /* renamed from: b */
    private String f11250b;
    /* renamed from: c */
    private TrackOutput f11251c;
    /* renamed from: d */
    private C2111a f11252d;
    /* renamed from: e */
    private boolean f11253e;
    /* renamed from: f */
    private final boolean[] f11254f = new boolean[3];
    /* renamed from: g */
    private final C2112m f11255g = new C2112m(32, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: h */
    private final C2112m f11256h = new C2112m(33, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: i */
    private final C2112m f11257i = new C2112m(34, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: j */
    private final C2112m f11258j = new C2112m(39, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: k */
    private final C2112m f11259k = new C2112m(40, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: l */
    private long f11260l;
    /* renamed from: m */
    private long f11261m;
    /* renamed from: n */
    private final C2302k f11262n = new C2302k();

    /* renamed from: com.google.android.exoplayer2.extractor.ts.i$a */
    private static final class C2111a {
        /* renamed from: a */
        private final TrackOutput f6015a;
        /* renamed from: b */
        private long f6016b;
        /* renamed from: c */
        private boolean f6017c;
        /* renamed from: d */
        private int f6018d;
        /* renamed from: e */
        private long f6019e;
        /* renamed from: f */
        private boolean f6020f;
        /* renamed from: g */
        private boolean f6021g;
        /* renamed from: h */
        private boolean f6022h;
        /* renamed from: i */
        private boolean f6023i;
        /* renamed from: j */
        private boolean f6024j;
        /* renamed from: k */
        private long f6025k;
        /* renamed from: l */
        private long f6026l;
        /* renamed from: m */
        private boolean f6027m;

        public C2111a(TrackOutput trackOutput) {
            this.f6015a = trackOutput;
        }

        /* renamed from: a */
        public void m7555a() {
            this.f6020f = false;
            this.f6021g = false;
            this.f6022h = false;
            this.f6023i = false;
            this.f6024j = false;
        }

        /* renamed from: a */
        public void m7557a(long j, int i, int i2, long j2) {
            this.f6021g = false;
            this.f6022h = false;
            this.f6019e = j2;
            this.f6018d = 0;
            this.f6016b = j;
            j = 1;
            if (i2 >= 32) {
                if (!this.f6024j && this.f6023i) {
                    m7554a(i);
                    this.f6023i = false;
                }
                if (i2 <= 34) {
                    this.f6022h = this.f6024j ^ true;
                    this.f6024j = true;
                }
            }
            boolean z = i2 >= 16 && i2 <= 21;
            this.f6017c = z;
            if (!this.f6017c) {
                if (i2 > 9) {
                    j = null;
                }
            }
            this.f6020f = j;
        }

        /* renamed from: a */
        public void m7558a(byte[] bArr, int i, int i2) {
            if (this.f6020f) {
                int i3 = (i + 2) - this.f6018d;
                if (i3 < i2) {
                    this.f6021g = (bArr[i3] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != null ? 1 : null;
                    this.f6020f = false;
                    return;
                }
                this.f6018d += i2 - i;
            }
        }

        /* renamed from: a */
        public void m7556a(long j, int i) {
            if (this.f6024j && this.f6021g) {
                this.f6027m = this.f6017c;
                this.f6024j = 0;
            } else if (this.f6022h || this.f6021g) {
                if (this.f6023i) {
                    m7554a(i + ((int) (j - this.f6016b)));
                }
                this.f6025k = this.f6016b;
                this.f6026l = this.f6019e;
                this.f6023i = 1;
                this.f6027m = this.f6017c;
            }
        }

        /* renamed from: a */
        private void m7554a(int i) {
            this.f6015a.sampleMetadata(this.f6026l, this.f6027m, (int) (this.f6016b - this.f6025k), i, null);
        }
    }

    public void packetFinished() {
    }

    public C3654i(C2114q c2114q) {
        this.f11249a = c2114q;
    }

    public void seek() {
        C2300i.m8356a(this.f11254f);
        this.f11255g.m7559a();
        this.f11256h.m7559a();
        this.f11257i.m7559a();
        this.f11258j.m7559a();
        this.f11259k.m7559a();
        this.f11252d.m7555a();
        this.f11260l = 0;
    }

    public void createTracks(ExtractorOutput extractorOutput, C2106c c2106c) {
        c2106c.m7534a();
        this.f11250b = c2106c.m7536c();
        this.f11251c = extractorOutput.track(c2106c.m7535b(), 2);
        this.f11252d = new C2111a(this.f11251c);
        this.f11249a.m7569a(extractorOutput, c2106c);
    }

    public void packetStarted(long j, boolean z) {
        this.f11261m = j;
    }

    public void consume(C2302k c2302k) {
        C3654i c3654i = this;
        C2302k c2302k2 = c2302k;
        while (c2302k.m8385b() > 0) {
            int d = c2302k.m8389d();
            int c = c2302k.m8387c();
            byte[] bArr = c2302k2.f6929a;
            c3654i.f11260l += (long) c2302k.m8385b();
            c3654i.f11251c.sampleData(c2302k2, c2302k.m8385b());
            while (d < c) {
                int a = C2300i.m8352a(bArr, d, c, c3654i.f11254f);
                if (a == c) {
                    m13803a(bArr, d, c);
                    return;
                }
                int c2 = C2300i.m8360c(bArr, a);
                int i = a - d;
                if (i > 0) {
                    m13803a(bArr, d, a);
                }
                int i2 = c - a;
                long j = c3654i.f11260l - ((long) i2);
                int i3 = i < 0 ? -i : 0;
                long j2 = j;
                int i4 = i2;
                m13804b(j2, i4, i3, c3654i.f11261m);
                m13801a(j2, i4, c2, c3654i.f11261m);
                d = a + 3;
            }
        }
    }

    /* renamed from: a */
    private void m13801a(long j, int i, int i2, long j2) {
        if (this.f11253e) {
            this.f11252d.m7557a(j, i, i2, j2);
        } else {
            this.f11255g.m7560a(i2);
            this.f11256h.m7560a(i2);
            this.f11257i.m7560a(i2);
        }
        this.f11258j.m7560a(i2);
        this.f11259k.m7560a(i2);
    }

    /* renamed from: a */
    private void m13803a(byte[] bArr, int i, int i2) {
        if (this.f11253e) {
            this.f11252d.m7558a(bArr, i, i2);
        } else {
            this.f11255g.m7561a(bArr, i, i2);
            this.f11256h.m7561a(bArr, i, i2);
            this.f11257i.m7561a(bArr, i, i2);
        }
        this.f11258j.m7561a(bArr, i, i2);
        this.f11259k.m7561a(bArr, i, i2);
    }

    /* renamed from: b */
    private void m13804b(long j, int i, int i2, long j2) {
        if (this.f11253e) {
            this.f11252d.m7556a(j, i);
        } else {
            this.f11255g.m7563b(i2);
            this.f11256h.m7563b(i2);
            this.f11257i.m7563b(i2);
            if (!(this.f11255g.m7562b() == null || this.f11256h.m7562b() == null || this.f11257i.m7562b() == null)) {
                this.f11251c.format(C3654i.m13800a(this.f11250b, this.f11255g, this.f11256h, this.f11257i));
                this.f11253e = 1;
            }
        }
        if (this.f11258j.m7563b(i2) != null) {
            this.f11262n.m8383a(this.f11258j.f6028a, C2300i.m8351a(this.f11258j.f6028a, this.f11258j.f6029b));
            this.f11262n.m8390d(5);
            this.f11249a.m7568a(j2, this.f11262n);
        }
        if (this.f11259k.m7563b(i2) != null) {
            this.f11262n.m8383a(this.f11259k.f6028a, C2300i.m8351a(this.f11259k.f6028a, this.f11259k.f6029b));
            this.f11262n.m8390d(5);
            this.f11249a.m7568a(j2, this.f11262n);
        }
    }

    /* renamed from: a */
    private static Format m13800a(String str, C2112m c2112m, C2112m c2112m2, C2112m c2112m3) {
        float f;
        C2112m c2112m4 = c2112m;
        C2112m c2112m5 = c2112m2;
        C2112m c2112m6 = c2112m3;
        Object obj = new byte[((c2112m4.f6029b + c2112m5.f6029b) + c2112m6.f6029b)];
        int i = 0;
        System.arraycopy(c2112m4.f6028a, 0, obj, 0, c2112m4.f6029b);
        System.arraycopy(c2112m5.f6028a, 0, obj, c2112m4.f6029b, c2112m5.f6029b);
        System.arraycopy(c2112m6.f6028a, 0, obj, c2112m4.f6029b + c2112m5.f6029b, c2112m6.f6029b);
        C2303l c2303l = new C2303l(c2112m5.f6028a, 0, c2112m5.f6029b);
        c2303l.m8419a(44);
        int c = c2303l.m8423c(3);
        c2303l.m8418a();
        c2303l.m8419a(88);
        c2303l.m8419a(8);
        int i2 = 0;
        for (int i3 = 0; i3 < c; i3++) {
            if (c2303l.m8421b()) {
                i2 += 89;
            }
            if (c2303l.m8421b()) {
                i2 += 8;
            }
        }
        c2303l.m8419a(i2);
        if (c > 0) {
            c2303l.m8419a((8 - c) * 2);
        }
        c2303l.m8425d();
        i2 = c2303l.m8425d();
        if (i2 == 3) {
            c2303l.m8418a();
        }
        int d = c2303l.m8425d();
        int d2 = c2303l.m8425d();
        if (c2303l.m8421b()) {
            int i4;
            int d3 = c2303l.m8425d();
            int d4 = c2303l.m8425d();
            int d5 = c2303l.m8425d();
            int d6 = c2303l.m8425d();
            if (i2 != 1) {
                if (i2 != 2) {
                    i4 = 1;
                    d -= i4 * (d3 + d4);
                    d2 -= (i2 != 1 ? 2 : 1) * (d5 + d6);
                }
            }
            i4 = 2;
            if (i2 != 1) {
            }
            d -= i4 * (d3 + d4);
            d2 -= (i2 != 1 ? 2 : 1) * (d5 + d6);
        }
        int i5 = d;
        int i6 = d2;
        c2303l.m8425d();
        c2303l.m8425d();
        d = c2303l.m8425d();
        i2 = c2303l.m8421b() ? 0 : c;
        while (i2 <= c) {
            c2303l.m8425d();
            c2303l.m8425d();
            c2303l.m8425d();
            i2++;
        }
        c2303l.m8425d();
        c2303l.m8425d();
        c2303l.m8425d();
        c2303l.m8425d();
        c2303l.m8425d();
        c2303l.m8425d();
        if (c2303l.m8421b() && c2303l.m8421b()) {
            C3654i.m13802a(c2303l);
        }
        c2303l.m8419a(2);
        if (c2303l.m8421b()) {
            c2303l.m8419a(8);
            c2303l.m8425d();
            c2303l.m8425d();
            c2303l.m8418a();
        }
        C3654i.m13805b(c2303l);
        if (c2303l.m8421b()) {
            while (i < c2303l.m8425d()) {
                c2303l.m8419a((d + 4) + 1);
                i++;
            }
        }
        c2303l.m8419a(2);
        float f2 = 1.0f;
        if (c2303l.m8421b() && c2303l.m8421b()) {
            c = c2303l.m8423c(8);
            if (c == 255) {
                int c2 = c2303l.m8423c(16);
                int c3 = c2303l.m8423c(16);
                if (!(c2 == 0 || c3 == 0)) {
                    f2 = ((float) c2) / ((float) c3);
                }
                f = f2;
            } else if (c < C2300i.f6922b.length) {
                f = C2300i.f6922b[c];
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected aspect_ratio_idc value: ");
                stringBuilder.append(c);
                Log.w("H265Reader", stringBuilder.toString());
            }
            return Format.createVideoSampleFormat(str, "video/hevc", null, -1, -1, i5, i6, -1.0f, Collections.singletonList(obj), -1, f, null);
        }
        f = 1.0f;
        return Format.createVideoSampleFormat(str, "video/hevc", null, -1, -1, i5, i6, -1.0f, Collections.singletonList(obj), -1, f, null);
    }

    /* renamed from: a */
    private static void m13802a(C2303l c2303l) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int min;
                if (c2303l.m8421b()) {
                    min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        c2303l.m8426e();
                    }
                    for (int i3 = 0; i3 < min; i3++) {
                        c2303l.m8426e();
                    }
                } else {
                    c2303l.m8425d();
                }
                min = 3;
                if (i != 3) {
                    min = 1;
                }
                i2 += min;
            }
        }
    }

    /* renamed from: b */
    private static void m13805b(C2303l c2303l) {
        int d = c2303l.m8425d();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            if (i2 != 0) {
                z = c2303l.m8421b();
            }
            int i3;
            if (z) {
                c2303l.m8418a();
                c2303l.m8425d();
                for (i3 = 0; i3 <= i; i3++) {
                    if (c2303l.m8421b()) {
                        c2303l.m8418a();
                    }
                }
            } else {
                i = c2303l.m8425d();
                i3 = c2303l.m8425d();
                int i4 = i + i3;
                for (int i5 = 0; i5 < i; i5++) {
                    c2303l.m8425d();
                    c2303l.m8418a();
                }
                for (i = 0; i < i3; i++) {
                    c2303l.m8425d();
                    c2303l.m8418a();
                }
                i = i4;
            }
        }
    }
}
