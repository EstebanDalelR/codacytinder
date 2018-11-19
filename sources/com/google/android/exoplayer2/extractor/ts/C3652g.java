package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2300i;
import com.google.android.exoplayer2.util.C2302k;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.ts.g */
public final class C3652g implements ElementaryStreamReader {
    /* renamed from: c */
    private static final double[] f11221c = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    /* renamed from: a */
    private String f11222a;
    /* renamed from: b */
    private TrackOutput f11223b;
    /* renamed from: d */
    private boolean f11224d;
    /* renamed from: e */
    private long f11225e;
    /* renamed from: f */
    private final boolean[] f11226f = new boolean[4];
    /* renamed from: g */
    private final C2107a f11227g = new C2107a(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: h */
    private long f11228h;
    /* renamed from: i */
    private boolean f11229i;
    /* renamed from: j */
    private long f11230j;
    /* renamed from: k */
    private long f11231k;
    /* renamed from: l */
    private long f11232l;
    /* renamed from: m */
    private boolean f11233m;
    /* renamed from: n */
    private boolean f11234n;

    /* renamed from: com.google.android.exoplayer2.extractor.ts.g$a */
    private static final class C2107a {
        /* renamed from: d */
        private static final byte[] f5976d = new byte[]{(byte) 0, (byte) 0, (byte) 1};
        /* renamed from: a */
        public int f5977a;
        /* renamed from: b */
        public int f5978b;
        /* renamed from: c */
        public byte[] f5979c;
        /* renamed from: e */
        private boolean f5980e;

        public C2107a(int i) {
            this.f5979c = new byte[i];
        }

        /* renamed from: a */
        public void m7537a() {
            this.f5980e = false;
            this.f5977a = 0;
            this.f5978b = 0;
        }

        /* renamed from: a */
        public boolean m7539a(int i, int i2) {
            if (this.f5980e) {
                this.f5977a -= i2;
                if (this.f5978b == 0 && i == 181) {
                    this.f5978b = this.f5977a;
                } else {
                    this.f5980e = false;
                    return true;
                }
            } else if (i == 179) {
                this.f5980e = true;
            }
            m7538a(f5976d, 0, f5976d.length);
            return false;
        }

        /* renamed from: a */
        public void m7538a(byte[] bArr, int i, int i2) {
            if (this.f5980e) {
                i2 -= i;
                if (this.f5979c.length < this.f5977a + i2) {
                    this.f5979c = Arrays.copyOf(this.f5979c, (this.f5977a + i2) * 2);
                }
                System.arraycopy(bArr, i, this.f5979c, this.f5977a, i2);
                this.f5977a += i2;
            }
        }
    }

    public void packetFinished() {
    }

    public void seek() {
        C2300i.m8356a(this.f11226f);
        this.f11227g.m7537a();
        this.f11228h = 0;
        this.f11229i = false;
    }

    public void createTracks(ExtractorOutput extractorOutput, C2106c c2106c) {
        c2106c.m7534a();
        this.f11222a = c2106c.m7536c();
        this.f11223b = extractorOutput.track(c2106c.m7535b(), 2);
    }

    public void packetStarted(long j, boolean z) {
        this.f11230j = j;
    }

    public void consume(C2302k c2302k) {
        C2302k c2302k2 = c2302k;
        int d = c2302k.m8389d();
        int c = c2302k.m8387c();
        byte[] bArr = c2302k2.f6929a;
        this.f11228h += (long) c2302k.m8385b();
        this.f11223b.sampleData(c2302k2, c2302k.m8385b());
        while (true) {
            int a = C2300i.m8352a(bArr, d, c, r0.f11226f);
            if (a == c) {
                break;
            }
            int i;
            byte[] bArr2;
            boolean z;
            int i2 = a + 3;
            int i3 = c2302k2.f6929a[i2] & 255;
            if (!r0.f11224d) {
                int i4 = a - d;
                if (i4 > 0) {
                    r0.f11227g.m7538a(bArr, d, a);
                }
                if (r0.f11227g.m7539a(i3, i4 < 0 ? -i4 : 0)) {
                    Pair a2 = C3652g.m13796a(r0.f11227g, r0.f11222a);
                    r0.f11223b.format((Format) a2.first);
                    r0.f11225e = ((Long) a2.second).longValue();
                    r0.f11224d = true;
                }
            }
            if (i3 != 0) {
                if (i3 != 179) {
                    if (i3 == 184) {
                        r0.f11233m = true;
                    }
                    i = c;
                    bArr2 = bArr;
                    d = i2;
                    c = i;
                    bArr = bArr2;
                }
            }
            d = c - a;
            if (r0.f11229i && r0.f11234n && r0.f11224d) {
                i = c;
                bArr2 = bArr;
                r0.f11223b.sampleMetadata(r0.f11232l, r0.f11233m, ((int) (r0.f11228h - r0.f11231k)) - d, d, null);
            } else {
                i = c;
                bArr2 = bArr;
            }
            if (r0.f11229i) {
                if (!r0.f11234n) {
                    z = false;
                    if (i3 == 0) {
                        z = true;
                    }
                    r0.f11234n = z;
                    d = i2;
                    c = i;
                    bArr = bArr2;
                }
            }
            r0.f11231k = r0.f11228h - ((long) d);
            long j = r0.f11230j != -9223372036854775807L ? r0.f11230j : r0.f11229i ? r0.f11232l + r0.f11225e : 0;
            r0.f11232l = j;
            z = false;
            r0.f11233m = false;
            r0.f11230j = -9223372036854775807L;
            r0.f11229i = true;
            if (i3 == 0) {
                z = true;
            }
            r0.f11234n = z;
            d = i2;
            c = i;
            bArr = bArr2;
        }
        if (!r0.f11224d) {
            r0.f11227g.m7538a(bArr, d, c);
        }
    }

    /* renamed from: a */
    private static Pair<Format, Long> m13796a(C2107a c2107a, String str) {
        float f;
        float f2;
        C2107a c2107a2 = c2107a;
        Object copyOf = Arrays.copyOf(c2107a2.f5979c, c2107a2.f5977a);
        int i = copyOf[5] & 255;
        int i2 = ((copyOf[4] & 255) << 4) | (i >> 4);
        int i3 = ((i & 15) << 8) | (copyOf[6] & 255);
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                f = ((float) (i3 * 4)) / ((float) (i2 * 3));
                break;
            case 3:
                f = ((float) (i3 * 16)) / ((float) (i2 * 9));
                break;
            case 4:
                f = ((float) (i3 * 121)) / ((float) (i2 * 100));
                break;
            default:
                f2 = 1.0f;
                break;
        }
        f2 = f;
        Format createVideoSampleFormat = Format.createVideoSampleFormat(str, "video/mpeg2", null, -1, -1, i2, i3, -1.0f, Collections.singletonList(copyOf), -1, f2, null);
        long j = 0;
        int i4 = (copyOf[7] & 15) - 1;
        if (i4 >= 0 && i4 < f11221c.length) {
            double d = f11221c[i4];
            int i5 = c2107a2.f5978b + 9;
            i4 = (copyOf[i5] & 96) >> 5;
            i5 = copyOf[i5] & 31;
            if (i4 != i5) {
                d *= (((double) i4) + 1.0d) / ((double) (i5 + 1));
            }
            j = (long) (1000000.0d / d);
        }
        return Pair.create(createVideoSampleFormat, Long.valueOf(j));
    }
}
