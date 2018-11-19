package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2072e;
import com.google.android.exoplayer2.extractor.mp4.C2087a.C3637a;
import com.google.android.exoplayer2.extractor.mp4.C2087a.C3638b;
import com.google.android.exoplayer2.extractor.mp4.C2096d.C2095a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2292c;
import com.google.android.exoplayer2.util.C2297h;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import com.google.android.exoplayer2.video.C2327a;
import com.google.android.exoplayer2.video.C2328b;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.b */
final class C2092b {
    /* renamed from: a */
    private static final int f5882a = C2314v.m8499g("vide");
    /* renamed from: b */
    private static final int f5883b = C2314v.m8499g("soun");
    /* renamed from: c */
    private static final int f5884c = C2314v.m8499g(ManagerWebServices.PARAM_TEXT);
    /* renamed from: d */
    private static final int f5885d = C2314v.m8499g("sbtl");
    /* renamed from: e */
    private static final int f5886e = C2314v.m8499g("subt");
    /* renamed from: f */
    private static final int f5887f = C2314v.m8499g("clcp");
    /* renamed from: g */
    private static final int f5888g = C2314v.m8499g(ManagerWebServices.PARAM_META);

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.b$a */
    private static final class C2088a {
        /* renamed from: a */
        public final int f5866a;
        /* renamed from: b */
        public int f5867b;
        /* renamed from: c */
        public int f5868c;
        /* renamed from: d */
        public long f5869d;
        /* renamed from: e */
        private final boolean f5870e;
        /* renamed from: f */
        private final C2302k f5871f;
        /* renamed from: g */
        private final C2302k f5872g;
        /* renamed from: h */
        private int f5873h;
        /* renamed from: i */
        private int f5874i;

        public C2088a(C2302k c2302k, C2302k c2302k2, boolean z) {
            this.f5872g = c2302k;
            this.f5871f = c2302k2;
            this.f5870e = z;
            c2302k2.m8388c(12);
            this.f5866a = c2302k2.m8409u();
            c2302k.m8388c(12);
            this.f5874i = c2302k.m8409u();
            c2302k2 = true;
            if (c2302k.m8403o() != 1) {
                c2302k2 = null;
            }
            C2289a.m8314b(c2302k2, "first_chunk must be 1");
            this.f5867b = -1;
        }

        /* renamed from: a */
        public boolean m7473a() {
            int i = this.f5867b + 1;
            this.f5867b = i;
            if (i == this.f5866a) {
                return false;
            }
            long w;
            if (this.f5870e) {
                w = this.f5871f.m8411w();
            } else {
                w = this.f5871f.m8401m();
            }
            this.f5869d = w;
            if (this.f5867b == this.f5873h) {
                this.f5868c = this.f5872g.m8409u();
                this.f5872g.m8390d(4);
                i = this.f5874i - 1;
                this.f5874i = i;
                this.f5873h = i > 0 ? this.f5872g.m8409u() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.b$b */
    private interface C2089b {
        /* renamed from: a */
        int mo2291a();

        /* renamed from: b */
        int mo2292b();

        /* renamed from: c */
        boolean mo2293c();
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.b$c */
    private static final class C2090c {
        /* renamed from: a */
        public final C2101h[] f5875a;
        /* renamed from: b */
        public Format f5876b;
        /* renamed from: c */
        public int f5877c;
        /* renamed from: d */
        public int f5878d = 0;

        public C2090c(int i) {
            this.f5875a = new C2101h[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.b$f */
    private static final class C2091f {
        /* renamed from: a */
        private final int f5879a;
        /* renamed from: b */
        private final long f5880b;
        /* renamed from: c */
        private final int f5881c;

        public C2091f(int i, long j, int i2) {
            this.f5879a = i;
            this.f5880b = j;
            this.f5881c = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.b$d */
    static final class C3639d implements C2089b {
        /* renamed from: a */
        private final int f11129a = this.f11131c.m8409u();
        /* renamed from: b */
        private final int f11130b = this.f11131c.m8409u();
        /* renamed from: c */
        private final C2302k f11131c;

        public C3639d(C3638b c3638b) {
            this.f11131c = c3638b.aQ;
            this.f11131c.m8388c(12);
        }

        /* renamed from: a */
        public int mo2291a() {
            return this.f11130b;
        }

        /* renamed from: b */
        public int mo2292b() {
            return this.f11129a == 0 ? this.f11131c.m8409u() : this.f11129a;
        }

        /* renamed from: c */
        public boolean mo2293c() {
            return this.f11129a != 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.b$e */
    static final class C3640e implements C2089b {
        /* renamed from: a */
        private final C2302k f11132a;
        /* renamed from: b */
        private final int f11133b = this.f11132a.m8409u();
        /* renamed from: c */
        private final int f11134c = (this.f11132a.m8409u() & 255);
        /* renamed from: d */
        private int f11135d;
        /* renamed from: e */
        private int f11136e;

        /* renamed from: c */
        public boolean mo2293c() {
            return false;
        }

        public C3640e(C3638b c3638b) {
            this.f11132a = c3638b.aQ;
            this.f11132a.m8388c(12);
        }

        /* renamed from: a */
        public int mo2291a() {
            return this.f11133b;
        }

        /* renamed from: b */
        public int mo2292b() {
            if (this.f11134c == 8) {
                return this.f11132a.m8395g();
            }
            if (this.f11134c == 16) {
                return this.f11132a.m8396h();
            }
            int i = this.f11135d;
            this.f11135d = i + 1;
            if (i % 2 != 0) {
                return this.f11136e & 15;
            }
            this.f11136e = this.f11132a.m8395g();
            return (this.f11136e & 240) >> 4;
        }
    }

    /* renamed from: a */
    public static Track m7483a(C3637a c3637a, C3638b c3638b, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        C3637a c3637a2 = c3637a;
        C3637a e = c3637a2.m13753e(C2087a.f5818E);
        int c = C2092b.m7497c(e.m13752d(C2087a.f5832S).aQ);
        if (c == -1) {
            return null;
        }
        long a;
        C3638b c3638b2;
        long[] jArr;
        long[] jArr2;
        Track track;
        C2091f b = C2092b.m7494b(c3637a2.m13752d(C2087a.f5828O).aQ);
        long j2 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            a = b.f5880b;
            c3638b2 = c3638b;
        } else {
            c3638b2 = c3638b;
            a = j;
        }
        long a2 = C2092b.m7480a(c3638b2.aQ);
        if (a != -9223372036854775807L) {
            j2 = C2314v.m8492d(a, 1000000, a2);
        }
        long j3 = j2;
        C3637a e2 = e.m13753e(C2087a.f5819F).m13753e(C2087a.f5820G);
        Pair d = C2092b.m7499d(e.m13752d(C2087a.f5831R).aQ);
        C2090c a3 = C2092b.m7484a(e2.m13752d(C2087a.f5833T).aQ, b.f5879a, b.f5881c, (String) d.second, drmInitData, z2);
        if (z) {
            jArr = null;
            jArr2 = jArr;
        } else {
            Pair a4 = C2092b.m7481a(c3637a2.m13753e(C2087a.f5829P));
            jArr2 = (long[]) a4.second;
            jArr = (long[]) a4.first;
        }
        if (a3.f5876b == null) {
            track = null;
        } else {
            int b2 = b.f5879a;
            j2 = ((Long) d.first).longValue();
            Format format = a3.f5876b;
            int i = a3.f5878d;
            C2101h[] c2101hArr = a3.f5875a;
            int i2 = a3.f5877c;
            Track track2 = new Track(b2, c, j2, a2, j3, format, i, c2101hArr, i2, jArr, jArr2);
        }
        return track;
    }

    /* renamed from: a */
    public static C2103j m7486a(Track track, C3637a c3637a, C2072e c2072e) throws ParserException {
        C2089b c3639d;
        Track track2 = track;
        C3637a c3637a2 = c3637a;
        C2072e c2072e2 = c2072e;
        C3638b d = c3637a2.m13752d(C2087a.aq);
        if (d != null) {
            c3639d = new C3639d(d);
        } else {
            d = c3637a2.m13752d(C2087a.ar);
            if (d == null) {
                throw new ParserException("Track has no sample table size information");
            }
            c3639d = new C3640e(d);
        }
        int a = c3639d.mo2291a();
        if (a == 0) {
            return new C2103j(new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        boolean z;
        int u;
        int u2;
        Object obj;
        long[] jArr;
        Object obj2;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        long j2;
        long j3;
        long[] jArr2;
        long j4;
        int i5;
        Object obj3;
        C3638b d2 = c3637a2.m13752d(C2087a.as);
        if (d2 == null) {
            d2 = c3637a2.m13752d(C2087a.at);
            z = true;
        } else {
            z = false;
        }
        C2302k c2302k = d2.aQ;
        C2302k c2302k2 = c3637a2.m13752d(C2087a.ap).aQ;
        C2302k c2302k3 = c3637a2.m13752d(C2087a.am).aQ;
        C3638b d3 = c3637a2.m13752d(C2087a.an);
        C2302k c2302k4 = d3 != null ? d3.aQ : null;
        C3638b d4 = c3637a2.m13752d(C2087a.ao);
        C2302k c2302k5 = d4 != null ? d4.aQ : null;
        C2088a c2088a = new C2088a(c2302k2, c2302k, z);
        c2302k3.m8388c(12);
        int u3 = c2302k3.m8409u() - 1;
        int u4 = c2302k3.m8409u();
        int u5 = c2302k3.m8409u();
        if (c2302k5 != null) {
            c2302k5.m8388c(12);
            u = c2302k5.m8409u();
        } else {
            u = 0;
        }
        int i6 = -1;
        if (c2302k4 != null) {
            c2302k4.m8388c(12);
            u2 = c2302k4.m8409u();
            if (u2 > 0) {
                i6 = c2302k4.m8409u() - 1;
            } else {
                c2302k4 = null;
            }
        } else {
            u2 = 0;
        }
        Object obj4 = (c3639d.mo2293c() && "audio/raw".equals(track2.f5808f.sampleMimeType) && u3 == 0 && u == 0 && u2 == 0) ? 1 : null;
        long j5 = 0;
        if (obj4 == null) {
            int i7;
            int i8;
            obj4 = new long[a];
            obj = new int[a];
            jArr = new long[a];
            int i9 = u2;
            obj2 = new int[a];
            int i10 = u3;
            int i11 = u4;
            C2302k c2302k6 = c2302k3;
            i = u5;
            i2 = i6;
            long j6 = 0;
            u4 = i9;
            i3 = 0;
            u3 = 0;
            i6 = 0;
            int i12 = 0;
            int i13 = 0;
            i9 = u;
            j = j6;
            while (u3 < a) {
                int i14;
                int i15;
                C2089b c2089b;
                C2302k c2302k7;
                while (i12 == 0) {
                    i4 = a;
                    C2289a.m8313b(c2088a.m7473a());
                    i7 = u4;
                    i14 = i;
                    long j7 = c2088a.f5869d;
                    i12 = c2088a.f5868c;
                    j6 = j7;
                    a = i4;
                    u4 = i7;
                    i = i14;
                }
                i4 = a;
                i7 = u4;
                i14 = i;
                if (c2302k5 != null) {
                    while (i6 == 0 && i9 > 0) {
                        i6 = c2302k5.m8409u();
                        i13 = c2302k5.m8403o();
                        i9--;
                    }
                    i6--;
                }
                a = i13;
                obj4[u3] = j6;
                obj[u3] = c3639d.mo2292b();
                if (obj[u3] > i3) {
                    i3 = obj[u3];
                }
                jArr[u3] = j + ((long) a);
                obj2[u3] = c2302k4 == null ? 1 : 0;
                if (u3 == i2) {
                    obj2[u3] = 1;
                    i = i7 - 1;
                    if (i > 0) {
                        i2 = c2302k4.m8409u() - 1;
                    }
                    u4 = i2;
                    i15 = a;
                    c2089b = c3639d;
                } else {
                    u4 = i2;
                    i15 = a;
                    c2089b = c3639d;
                    i = i7;
                }
                i2 = i14;
                long j8 = j + ((long) i2);
                i11--;
                if (i11 == 0) {
                    a = i10;
                    if (a > 0) {
                        c2302k7 = c2302k6;
                        i2 = c2302k7.m8409u();
                        u5 = c2302k7.m8403o();
                        i10 = a - 1;
                        i11 = i2;
                        j2 = j6 + ((long) obj[u3]);
                        i12--;
                        u3++;
                        i2 = u4;
                        u4 = i;
                        i = u5;
                        j6 = j2;
                        a = i4;
                        j = j8;
                        i13 = i15;
                        c2302k6 = c2302k7;
                        c3639d = c2089b;
                    } else {
                        c2302k7 = c2302k6;
                    }
                } else {
                    c2302k7 = c2302k6;
                    a = i10;
                }
                u5 = i2;
                i10 = a;
                j2 = j6 + ((long) obj[u3]);
                i12--;
                u3++;
                i2 = u4;
                u4 = i;
                i = u5;
                j6 = j2;
                a = i4;
                j = j8;
                i13 = i15;
                c2302k6 = c2302k7;
                c3639d = c2089b;
            }
            i4 = a;
            i7 = u4;
            a = i10;
            j3 = j + ((long) i13);
            C2289a.m8311a(i6 == 0);
            while (i9 > 0) {
                C2289a.m8311a(c2302k5.m8409u() == 0);
                c2302k5.m8403o();
                i9--;
            }
            if (i7 == 0 && i11 == 0 && i12 == 0) {
                if (a == 0) {
                    i8 = i3;
                    track2 = track;
                    a = i8;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Inconsistent stbl box for track ");
            i8 = i3;
            track2 = track;
            stringBuilder.append(track2.f5803a);
            stringBuilder.append(": remainingSynchronizationSamples ");
            stringBuilder.append(i7);
            stringBuilder.append(", remainingSamplesAtTimestampDelta ");
            stringBuilder.append(i11);
            stringBuilder.append(", remainingSamplesInChunk ");
            stringBuilder.append(i12);
            stringBuilder.append(", remainingTimestampDeltaChanges ");
            stringBuilder.append(a);
            Log.w("AtomParsers", stringBuilder.toString());
            a = i8;
        } else {
            i4 = a;
            jArr2 = new long[c2088a.f5866a];
            int[] iArr = new int[c2088a.f5866a];
            while (c2088a.m7473a()) {
                jArr2[c2088a.f5867b] = c2088a.f5869d;
                iArr[c2088a.f5867b] = c2088a.f5868c;
            }
            C2095a a2 = C2096d.m7503a(C2314v.m8483b(track2.f5808f.pcmEncoding, track2.f5808f.channelCount), jArr2, iArr, (long) u5);
            obj4 = a2.f5893a;
            obj = a2.f5894b;
            i2 = a2.f5895c;
            jArr = a2.f5896d;
            obj2 = a2.f5897e;
            j3 = a2.f5898f;
            a = i2;
        }
        Object obj5 = obj4;
        obj4 = obj2;
        long[] jArr3 = jArr;
        Object obj6 = obj;
        long d5 = C2314v.m8492d(j3, 1000000, track2.f5805c);
        if (track2.f5810h != null) {
            C2072e c2072e3 = c2072e;
            if (!c2072e.m7418a()) {
                long j9;
                long d6;
                if (track2.f5810h.length == 1 && track2.f5804b == 1 && jArr3.length >= 2) {
                    j9 = track2.f5811i[0];
                    j4 = d5;
                    d6 = j9 + C2314v.m8492d(track2.f5810h[0], track2.f5805c, track2.f5806d);
                    if (C2092b.m7492a(jArr3, j3, j9, d6)) {
                        long j10 = j3 - d6;
                        d5 = C2314v.m8492d(j9 - jArr3[0], (long) track2.f5808f.sampleRate, track2.f5805c);
                        d6 = C2314v.m8492d(j10, (long) track2.f5808f.sampleRate, track2.f5805c);
                        if (!(d5 == 0 && d6 == 0) && d5 <= 2147483647L && d6 <= 2147483647L) {
                            c2072e3.f5708b = (int) d5;
                            c2072e3.f5709c = (int) d6;
                            C2314v.m8476a(jArr3, 1000000, track2.f5805c);
                            return new C2103j(obj5, obj6, a, jArr3, obj4, j4);
                        }
                    }
                }
                j4 = d5;
                long j11;
                if (track2.f5810h.length == 1 && track2.f5810h[0] == 0) {
                    j11 = track2.f5811i[0];
                    for (u2 = 0; u2 < jArr3.length; u2++) {
                        jArr3[u2] = C2314v.m8492d(jArr3[u2] - j11, 1000000, track2.f5805c);
                    }
                    return new C2103j(obj5, obj6, a, jArr3, obj4, C2314v.m8492d(j3 - j11, 1000000, track2.f5805c));
                }
                Object obj7;
                Object obj8;
                long[] jArr4;
                int i16;
                Object obj9;
                Object obj10;
                boolean z2 = track2.f5804b == 1;
                int i17 = 0;
                u3 = 0;
                u4 = 0;
                i = 0;
                while (i17 < track2.f5810h.length) {
                    j = track2.f5811i[i17];
                    if (j != -1) {
                        obj7 = obj6;
                        i5 = a;
                        long d7 = C2314v.m8492d(track2.f5810h[i17], track2.f5805c, track2.f5806d);
                        int b = C2314v.m8484b(jArr3, j, true, true);
                        obj8 = obj5;
                        i3 = C2314v.m8484b(jArr3, j + d7, z2, false);
                        u4 += i3 - b;
                        int i18 = i != b ? 1 : 0;
                        i = i3;
                        u3 = i18 | u3;
                    } else {
                        obj8 = obj5;
                        obj7 = obj6;
                        i5 = a;
                    }
                    i17++;
                    obj6 = obj7;
                    a = i5;
                    obj5 = obj8;
                    track2 = track;
                }
                obj8 = obj5;
                obj7 = obj6;
                i5 = a;
                i3 = (u4 != i4 ? 1 : 0) | u3;
                jArr2 = i3 != 0 ? new long[u4] : obj8;
                obj6 = i3 != 0 ? new int[u4] : obj7;
                a = i3 != 0 ? 0 : i5;
                Object obj11 = i3 != 0 ? new int[u4] : obj4;
                long[] jArr5 = new long[u4];
                int i19 = a;
                Track track3 = track;
                u4 = 0;
                i = 0;
                while (u4 < track3.f5810h.length) {
                    int i20;
                    boolean z3;
                    d6 = track3.f5811i[u4];
                    j9 = track3.f5810h[u4];
                    if (d6 != -1) {
                        jArr4 = jArr5;
                        i20 = u4;
                        long[] jArr6 = jArr2;
                        Object obj12 = obj6;
                        j11 = d6 + C2314v.m8492d(j9, track3.f5805c, track3.f5806d);
                        i2 = C2314v.m8484b(jArr3, d6, true, true);
                        u3 = C2314v.m8484b(jArr3, j11, z2, false);
                        if (i3 != 0) {
                            u4 = u3 - i2;
                            obj3 = obj8;
                            jArr2 = jArr6;
                            System.arraycopy(obj3, i2, jArr2, i, u4);
                            z3 = z2;
                            i16 = i19;
                            obj2 = obj7;
                            obj9 = obj12;
                            System.arraycopy(obj2, i2, obj9, i, u4);
                            System.arraycopy(obj4, i2, obj11, i, u4);
                        } else {
                            z3 = z2;
                            i16 = i19;
                            obj2 = obj7;
                            obj3 = obj8;
                            jArr2 = jArr6;
                            obj9 = obj12;
                        }
                        u4 = i16;
                        while (i2 < u3) {
                            obj10 = obj11;
                            int i21 = u3;
                            long j12 = d6;
                            jArr4[i] = C2314v.m8492d(j5, 1000000, track3.f5806d) + C2314v.m8492d(jArr3[i2] - d6, 1000000, track3.f5805c);
                            if (i3 != 0 && r11[i] > u4) {
                                u4 = obj2[i2];
                            }
                            i++;
                            i2++;
                            obj11 = obj10;
                            u3 = i21;
                            d6 = j12;
                        }
                        obj10 = obj11;
                        i16 = u4;
                    } else {
                        z3 = z2;
                        obj10 = obj11;
                        jArr4 = jArr5;
                        i20 = u4;
                        i16 = i19;
                        obj2 = obj7;
                        obj3 = obj8;
                        obj9 = obj6;
                    }
                    u4 = i20 + 1;
                    obj7 = obj2;
                    j5 += j9;
                    obj6 = obj9;
                    obj8 = obj3;
                    d6 = -1;
                    jArr5 = jArr4;
                    z2 = z3;
                    i19 = i16;
                    obj11 = obj10;
                }
                obj10 = obj11;
                jArr4 = jArr5;
                i16 = i19;
                obj2 = obj7;
                obj3 = obj8;
                obj9 = obj6;
                j2 = C2314v.m8492d(j5, 1000000, track3.f5805c);
                obj11 = obj10;
                i2 = 0;
                for (i3 = 0; i3 < obj11.length && i2 == 0; i3++) {
                    i2 |= (obj11[i3] & 1) != 0 ? 1 : 0;
                }
                if (i2 != 0) {
                    return new C2103j(jArr2, obj9, i16, jArr4, obj11, j2);
                }
                Log.w("AtomParsers", "Ignoring edit list: Edited sample sequence does not contain a sync sample.");
                C2314v.m8476a(jArr3, 1000000, track3.f5805c);
                return new C2103j(obj3, obj2, i5, jArr3, obj4, j4);
            }
        }
        obj3 = obj5;
        i5 = a;
        j4 = d5;
        obj2 = obj6;
        C2314v.m8476a(jArr3, 1000000, track2.f5805c);
        return new C2103j(obj3, obj2, i5, jArr3, obj4, j4);
    }

    /* renamed from: a */
    public static Metadata m7487a(C3638b c3638b, boolean z) {
        if (z) {
            return null;
        }
        C2302k c2302k = c3638b.aQ;
        c2302k.m8388c(8);
        while (c2302k.m8385b() >= 8) {
            int d = c2302k.m8389d();
            int o = c2302k.m8403o();
            if (c2302k.m8403o() == C2087a.aB) {
                c2302k.m8388c(d);
                return C2092b.m7488a(c2302k, d + o);
            }
            c2302k.m8390d(o - 8);
        }
        return null;
    }

    /* renamed from: a */
    private static Metadata m7488a(C2302k c2302k, int i) {
        c2302k.m8390d(12);
        while (c2302k.m8389d() < i) {
            int d = c2302k.m8389d();
            int o = c2302k.m8403o();
            if (c2302k.m8403o() == C2087a.aC) {
                c2302k.m8388c(d);
                return C2092b.m7495b(c2302k, d + o);
            }
            c2302k.m8390d(o - 8);
        }
        return null;
    }

    /* renamed from: b */
    private static Metadata m7495b(C2302k c2302k, int i) {
        c2302k.m8390d(8);
        List arrayList = new ArrayList();
        while (c2302k.m8389d() < i) {
            Entry a = C2097e.m7504a(c2302k);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList.isEmpty() != null ? null : new Metadata(arrayList);
    }

    /* renamed from: a */
    private static long m7480a(C2302k c2302k) {
        int i = 8;
        c2302k.m8388c(8);
        if (C2087a.m7470a(c2302k.m8403o()) != 0) {
            i = 16;
        }
        c2302k.m8390d(i);
        return c2302k.m8401m();
    }

    /* renamed from: b */
    private static C2091f m7494b(C2302k c2302k) {
        Object obj;
        int i = 8;
        c2302k.m8388c(8);
        int a = C2087a.m7470a(c2302k.m8403o());
        c2302k.m8390d(a == 0 ? 8 : 16);
        int o = c2302k.m8403o();
        c2302k.m8390d(4);
        int d = c2302k.m8389d();
        if (a == 0) {
            i = 4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (c2302k.f6929a[d + i3] != (byte) -1) {
                obj = null;
                break;
            }
        }
        obj = 1;
        long j = -9223372036854775807L;
        if (obj != null) {
            c2302k.m8390d(i);
        } else {
            long m = a == 0 ? c2302k.m8401m() : c2302k.m8411w();
            if (m != 0) {
                j = m;
            }
        }
        c2302k.m8390d(16);
        i = c2302k.m8403o();
        a = c2302k.m8403o();
        c2302k.m8390d(4);
        int o2 = c2302k.m8403o();
        c2302k = c2302k.m8403o();
        if (i == 0 && a == 65536 && o2 == -65536 && c2302k == null) {
            i2 = 90;
        } else if (i == 0 && a == -65536 && o2 == 65536 && c2302k == null) {
            i2 = 270;
        } else if (i == -65536 && a == 0 && o2 == 0 && c2302k == -65536) {
            i2 = 180;
        }
        return new C2091f(o, j, i2);
    }

    /* renamed from: c */
    private static int m7497c(C2302k c2302k) {
        c2302k.m8388c(16);
        c2302k = c2302k.m8403o();
        if (c2302k == f5883b) {
            return 1;
        }
        if (c2302k == f5882a) {
            return 2;
        }
        if (!(c2302k == f5884c || c2302k == f5885d || c2302k == f5886e)) {
            if (c2302k != f5887f) {
                return c2302k == f5888g ? 4 : -1;
            }
        }
        return 3;
    }

    /* renamed from: d */
    private static Pair<Long, String> m7499d(C2302k c2302k) {
        int i = 8;
        c2302k.m8388c(8);
        int a = C2087a.m7470a(c2302k.m8403o());
        c2302k.m8390d(a == 0 ? 8 : 16);
        long m = c2302k.m8401m();
        if (a == 0) {
            i = 4;
        }
        c2302k.m8390d(i);
        c2302k = c2302k.m8396h();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append((char) (((c2302k >> 10) & 31) + 96));
        stringBuilder.append((char) (((c2302k >> 5) & 31) + 96));
        stringBuilder.append((char) ((c2302k & 31) + 96));
        return Pair.create(Long.valueOf(m), stringBuilder.toString());
    }

    /* renamed from: a */
    private static C2090c m7484a(C2302k c2302k, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        C2302k c2302k2 = c2302k;
        c2302k2.m8388c(12);
        int o = c2302k.m8403o();
        C2090c c2090c = new C2090c(o);
        for (int i3 = 0; i3 < o; i3++) {
            int d = c2302k.m8389d();
            int o2 = c2302k.m8403o();
            C2289a.m8312a(o2 > 0, "childAtomSize should be positive");
            int o3 = c2302k.m8403o();
            if (!(o3 == C2087a.f5841b || o3 == C2087a.f5842c || o3 == C2087a.f5839Z || o3 == C2087a.al || o3 == C2087a.f5843d || o3 == C2087a.f5844e || o3 == C2087a.f5845f || o3 == C2087a.aK)) {
                if (o3 != C2087a.aL) {
                    if (!(o3 == C2087a.f5848i || o3 == C2087a.aa || o3 == C2087a.f5853n || o3 == C2087a.f5855p || o3 == C2087a.f5857r || o3 == C2087a.f5860u || o3 == C2087a.f5858s || o3 == C2087a.f5859t || o3 == C2087a.ay || o3 == C2087a.az || o3 == C2087a.f5851l || o3 == C2087a.f5852m || o3 == C2087a.f5849j)) {
                        if (o3 != C2087a.aO) {
                            if (!(o3 == C2087a.aj || o3 == C2087a.au || o3 == C2087a.av || o3 == C2087a.aw)) {
                                if (o3 != C2087a.ax) {
                                    if (o3 == C2087a.aN) {
                                        c2090c.f5876b = Format.createSampleFormat(Integer.toString(i), "application/x-camera-motion", null, -1, null);
                                    }
                                    c2302k2.m8388c(d + o2);
                                }
                            }
                            C2092b.m7490a(c2302k2, o3, d, o2, i, str, c2090c);
                            c2302k2.m8388c(d + o2);
                        }
                    }
                    C2092b.m7491a(c2302k2, o3, d, o2, i, str, z, drmInitData, c2090c, i3);
                    c2302k2.m8388c(d + o2);
                }
            }
            C2092b.m7489a(c2302k2, o3, d, o2, i, i2, drmInitData, c2090c, i3);
            c2302k2.m8388c(d + o2);
        }
        return c2090c;
    }

    /* renamed from: a */
    private static void m7490a(C2302k c2302k, int i, int i2, int i3, int i4, String str, C2090c c2090c) throws ParserException {
        String str2;
        String str3;
        C2302k c2302k2 = c2302k;
        int i5 = i;
        C2090c c2090c2 = c2090c;
        c2302k2.m8388c((i2 + 8) + 8);
        int i6 = C2087a.aj;
        List list = null;
        long j = Format.OFFSET_SAMPLE_RELATIVE;
        if (i5 == i6) {
            str2 = "application/ttml+xml";
        } else if (i5 == C2087a.au) {
            i6 = (i3 - 8) - 8;
            Object obj = new byte[i6];
            c2302k2.m8384a(obj, 0, i6);
            list = Collections.singletonList(obj);
            str3 = "application/x-quicktime-tx3g";
            c2090c2.f5876b = Format.createTextSampleFormat(Integer.toString(i4), str3, null, -1, 0, str, -1, null, j, list);
        } else if (i5 == C2087a.av) {
            str2 = "application/x-mp4-vtt";
        } else if (i5 == C2087a.aw) {
            str2 = "application/ttml+xml";
            j = 0;
        } else if (i5 == C2087a.ax) {
            str2 = "application/x-mp4-cea-608";
            c2090c2.f5878d = 1;
        } else {
            throw new IllegalStateException();
        }
        str3 = str2;
        c2090c2.f5876b = Format.createTextSampleFormat(Integer.toString(i4), str3, null, -1, 0, str, -1, null, j, list);
    }

    /* renamed from: a */
    private static void m7489a(C2302k c2302k, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, C2090c c2090c, int i6) throws ParserException {
        Pair c;
        C2302k c2302k2 = c2302k;
        int i7 = i2;
        int i8 = i3;
        DrmInitData drmInitData2 = drmInitData;
        C2090c c2090c2 = c2090c;
        c2302k2.m8388c((i7 + 8) + 8);
        c2302k2.m8390d(16);
        int h = c2302k.m8396h();
        int h2 = c2302k.m8396h();
        c2302k2.m8390d(50);
        int d = c2302k.m8389d();
        String str = null;
        int i9 = i;
        if (i9 == C2087a.f5839Z) {
            c = C2092b.m7498c(c2302k2, i7, i8);
            if (c != null) {
                i9 = ((Integer) c.first).intValue();
                if (drmInitData2 == null) {
                    drmInitData2 = null;
                } else {
                    drmInitData2 = drmInitData2.copyWithSchemeType(((C2101h) c.second).f5934b);
                }
                c2090c2.f5875a[i6] = (C2101h) c.second;
            }
            c2302k2.m8388c(d);
        }
        DrmInitData drmInitData3 = drmInitData2;
        List list = null;
        byte[] bArr = list;
        Object obj = null;
        float f = 1.0f;
        int i10 = -1;
        while (d - i7 < i8) {
            c2302k2.m8388c(d);
            int d2 = c2302k.m8389d();
            int o = c2302k.m8403o();
            if (o != 0 || c2302k.m8389d() - i7 != i8) {
                C2289a.m8312a(o > 0, "childAtomSize should be positive");
                int o2 = c2302k.m8403o();
                if (o2 == C2087a.f5821H) {
                    C2289a.m8313b(str == null);
                    str = "video/avc";
                    c2302k2.m8388c(d2 + 8);
                    C2327a a = C2327a.m8521a(c2302k);
                    list = a.f6992a;
                    c2090c2.f5877c = a.f6993b;
                    if (obj == null) {
                        f = a.f6996e;
                    }
                } else if (o2 == C2087a.f5822I) {
                    C2289a.m8313b(str == null);
                    str = "video/hevc";
                    c2302k2.m8388c(d2 + 8);
                    C2328b a2 = C2328b.m8523a(c2302k);
                    list = a2.f6997a;
                    c2090c2.f5877c = a2.f6998b;
                } else if (o2 == C2087a.aM) {
                    C2289a.m8313b(str == null);
                    str = i9 == C2087a.aK ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (o2 == C2087a.f5846g) {
                    C2289a.m8313b(str == null);
                    str = "video/3gpp";
                } else if (o2 == C2087a.f5823J) {
                    C2289a.m8313b(str == null);
                    c = C2092b.m7500d(c2302k2, d2);
                    str = (String) c.first;
                    list = Collections.singletonList(c.second);
                } else if (o2 == C2087a.ai) {
                    f = C2092b.m7496c(c2302k2, d2);
                    obj = 1;
                } else if (o2 == C2087a.aI) {
                    bArr = C2092b.m7501d(c2302k2, d2, o);
                } else if (o2 == C2087a.aH) {
                    o2 = c2302k.m8395g();
                    c2302k2.m8390d(3);
                    if (o2 == 0) {
                        switch (c2302k.m8395g()) {
                            case 0:
                                i10 = 0;
                                break;
                            case 1:
                                i10 = 1;
                                break;
                            case 2:
                                i10 = 2;
                                break;
                            case 3:
                                i10 = 3;
                                break;
                            default:
                                break;
                        }
                    }
                }
                d += o;
            } else if (str == null) {
                c2090c2.f5876b = Format.createVideoSampleFormat(Integer.toString(i4), str, null, -1, -1, h, h2, -1.0f, list, i5, f, bArr, i10, null, drmInitData3);
            }
        }
        if (str == null) {
            c2090c2.f5876b = Format.createVideoSampleFormat(Integer.toString(i4), str, null, -1, -1, h, h2, -1.0f, list, i5, f, bArr, i10, null, drmInitData3);
        }
    }

    /* renamed from: a */
    private static Pair<long[], long[]> m7481a(C3637a c3637a) {
        if (c3637a != null) {
            c3637a = c3637a.m13752d(C2087a.f5830Q);
            if (c3637a != null) {
                c3637a = c3637a.aQ;
                c3637a.m8388c(8);
                int a = C2087a.m7470a(c3637a.m8403o());
                int u = c3637a.m8409u();
                Object obj = new long[u];
                Object obj2 = new long[u];
                for (int i = 0; i < u; i++) {
                    obj[i] = a == 1 ? c3637a.m8411w() : c3637a.m8401m();
                    obj2[i] = a == 1 ? c3637a.m8405q() : (long) c3637a.m8403o();
                    if (c3637a.m8398j() != (short) 1) {
                        throw new IllegalArgumentException("Unsupported media rate.");
                    }
                    c3637a.m8390d(2);
                }
                return Pair.create(obj, obj2);
            }
        }
        return Pair.create(null, null);
    }

    /* renamed from: c */
    private static float m7496c(C2302k c2302k, int i) {
        c2302k.m8388c(i + 8);
        return ((float) c2302k.m8409u()) / ((float) c2302k.m8409u());
    }

    /* renamed from: a */
    private static void m7491a(C2302k c2302k, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, C2090c c2090c, int i5) throws ParserException {
        int h;
        int round;
        int d;
        int i6;
        Pair c;
        DrmInitData drmInitData2;
        String str2;
        String str3;
        int i7;
        int i8;
        Object obj;
        int o;
        int i9;
        String str4;
        int i10;
        DrmInitData drmInitData3;
        Object obj2;
        C2090c c2090c2;
        Object obj3;
        String str5;
        int i11;
        Object obj4;
        List list;
        C2302k c2302k2 = c2302k;
        int i12 = i2;
        int i13 = i3;
        String str6 = str;
        DrmInitData drmInitData4 = drmInitData;
        C2090c c2090c3 = c2090c;
        c2302k2.m8388c((i12 + 8) + 8);
        if (z) {
            h = c2302k.m8396h();
            c2302k2.m8390d(6);
        } else {
            c2302k2.m8390d(8);
            h = 0;
        }
        if (h != 0) {
            if (h != 1) {
                if (h == 2) {
                    c2302k2.m8390d(16);
                    round = (int) Math.round(c2302k.m8412x());
                    h = c2302k.m8409u();
                    c2302k2.m8390d(20);
                    d = c2302k.m8389d();
                    i6 = i;
                    if (i6 == C2087a.aa) {
                        c = C2092b.m7498c(c2302k2, i12, i13);
                        if (c != null) {
                            i6 = ((Integer) c.first).intValue();
                            if (drmInitData4 != null) {
                                drmInitData4 = null;
                            } else {
                                drmInitData4 = drmInitData4.copyWithSchemeType(((C2101h) c.second).f5934b);
                            }
                            c2090c3.f5875a[i5] = (C2101h) c.second;
                        }
                        c2302k2.m8388c(d);
                    }
                    drmInitData2 = drmInitData4;
                    if (i6 == C2087a.f5853n) {
                        str2 = "audio/ac3";
                    } else if (i6 == C2087a.f5855p) {
                        str2 = "audio/eac3";
                    } else if (i6 != C2087a.f5857r) {
                        str2 = "audio/vnd.dts";
                    } else {
                        if (i6 != C2087a.f5858s) {
                            if (i6 == C2087a.f5859t) {
                                if (i6 == C2087a.f5860u) {
                                    str2 = "audio/vnd.dts.hd;profile=lbr";
                                } else if (i6 == C2087a.ay) {
                                    str2 = "audio/3gpp";
                                } else if (i6 != C2087a.az) {
                                    str2 = "audio/amr-wb";
                                } else {
                                    if (i6 != C2087a.f5851l) {
                                        if (i6 == C2087a.f5852m) {
                                            str2 = i6 != C2087a.f5849j ? "audio/mpeg" : i6 != C2087a.aO ? "audio/alac" : null;
                                        }
                                    }
                                    str2 = "audio/raw";
                                }
                            }
                        }
                        str2 = "audio/vnd.dts.hd";
                    }
                    str3 = str2;
                    i7 = round;
                    i8 = h;
                    i6 = d;
                    obj = null;
                    while (i6 - i12 < i13) {
                        c2302k2.m8388c(i6);
                        h = c2302k.m8403o();
                        C2289a.m8312a(h <= 0, "childAtomSize should be positive");
                        o = c2302k.m8403o();
                        if (o != C2087a.f5823J) {
                            if (z || o != C2087a.f5850k) {
                                if (o == C2087a.f5854o) {
                                    c2302k2.m8388c(i6 + 8);
                                    c2090c3.f5876b = Ac3Util.m7258a(c2302k2, Integer.toString(i4), str6, drmInitData2);
                                } else if (o != C2087a.f5856q) {
                                    c2302k2.m8388c(i6 + 8);
                                    c2090c3.f5876b = Ac3Util.m7262b(c2302k2, Integer.toString(i4), str6, drmInitData2);
                                } else {
                                    if (o != C2087a.f5861v) {
                                        i9 = h;
                                        str4 = str3;
                                        i10 = i6;
                                        drmInitData3 = drmInitData2;
                                        obj2 = obj;
                                        c2090c2 = c2090c3;
                                        c2090c2.f5876b = Format.createAudioSampleFormat(Integer.toString(i4), str3, null, -1, -1, i8, i7, null, drmInitData3, 0, str6);
                                    } else {
                                        i9 = h;
                                        obj2 = obj;
                                        str4 = str3;
                                        i10 = i6;
                                        drmInitData3 = drmInitData2;
                                        c2090c2 = c2090c3;
                                        if (o == C2087a.aO) {
                                            h = i9;
                                            obj3 = new byte[h];
                                            d = i10;
                                            c2302k2.m8388c(d);
                                            c2302k2.m8384a(obj3, 0, h);
                                            i6 = d + h;
                                            c2090c3 = c2090c2;
                                            obj = obj3;
                                            drmInitData2 = drmInitData3;
                                            str3 = str4;
                                            i13 = i3;
                                        }
                                    }
                                    h = i9;
                                    d = i10;
                                    obj3 = obj2;
                                    i6 = d + h;
                                    c2090c3 = c2090c2;
                                    obj = obj3;
                                    drmInitData2 = drmInitData3;
                                    str3 = str4;
                                    i13 = i3;
                                }
                                obj2 = obj;
                                str4 = str3;
                                d = i6;
                                drmInitData3 = drmInitData2;
                                c2090c2 = c2090c3;
                                obj3 = obj2;
                                i6 = d + h;
                                c2090c3 = c2090c2;
                                obj = obj3;
                                drmInitData2 = drmInitData3;
                                str3 = str4;
                                i13 = i3;
                            }
                        }
                        obj2 = obj;
                        str4 = str3;
                        d = i6;
                        drmInitData3 = drmInitData2;
                        c2090c2 = c2090c3;
                        if (o != C2087a.f5823J) {
                            i6 = d;
                        } else {
                            i6 = C2092b.m7493b(c2302k2, d, h);
                        }
                        if (i6 == -1) {
                            Pair d2 = C2092b.m7500d(c2302k2, i6);
                            str5 = (String) d2.first;
                            obj3 = (byte[]) d2.second;
                            if ("audio/mp4a-latm".equals(str5)) {
                                Pair a = C2292c.m8322a((byte[]) obj3);
                                i7 = ((Integer) a.first).intValue();
                                i8 = ((Integer) a.second).intValue();
                            }
                        } else {
                            str5 = str4;
                            obj3 = obj2;
                        }
                        str4 = str5;
                        i6 = d + h;
                        c2090c3 = c2090c2;
                        obj = obj3;
                        drmInitData2 = drmInitData3;
                        str3 = str4;
                        i13 = i3;
                    }
                    obj2 = obj;
                    str4 = str3;
                    drmInitData3 = drmInitData2;
                    c2090c2 = c2090c3;
                    if (c2090c2.f5876b == null) {
                        str2 = str4;
                        if (str2 != null) {
                            i11 = "audio/raw".equals(str2) ? 2 : -1;
                            String num = Integer.toString(i4);
                            obj4 = obj2;
                            if (obj4 != null) {
                                list = null;
                            } else {
                                list = Collections.singletonList(obj4);
                            }
                            c2090c2.f5876b = Format.createAudioSampleFormat(num, str2, null, -1, -1, i8, i7, i11, list, drmInitData3, 0, str6);
                        }
                    }
                }
                return;
            }
        }
        i11 = c2302k.m8396h();
        c2302k2.m8390d(6);
        round = c2302k.m8407s();
        if (h == 1) {
            c2302k2.m8390d(16);
        }
        h = i11;
        d = c2302k.m8389d();
        i6 = i;
        if (i6 == C2087a.aa) {
            c = C2092b.m7498c(c2302k2, i12, i13);
            if (c != null) {
                i6 = ((Integer) c.first).intValue();
                if (drmInitData4 != null) {
                    drmInitData4 = drmInitData4.copyWithSchemeType(((C2101h) c.second).f5934b);
                } else {
                    drmInitData4 = null;
                }
                c2090c3.f5875a[i5] = (C2101h) c.second;
            }
            c2302k2.m8388c(d);
        }
        drmInitData2 = drmInitData4;
        if (i6 == C2087a.f5853n) {
            str2 = "audio/ac3";
        } else if (i6 == C2087a.f5855p) {
            str2 = "audio/eac3";
        } else if (i6 != C2087a.f5857r) {
            if (i6 != C2087a.f5858s) {
                if (i6 == C2087a.f5859t) {
                    if (i6 == C2087a.f5860u) {
                        str2 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (i6 == C2087a.ay) {
                        str2 = "audio/3gpp";
                    } else if (i6 != C2087a.az) {
                        if (i6 != C2087a.f5851l) {
                            if (i6 == C2087a.f5852m) {
                                if (i6 != C2087a.f5849j) {
                                    if (i6 != C2087a.aO) {
                                    }
                                }
                            }
                        }
                        str2 = "audio/raw";
                    } else {
                        str2 = "audio/amr-wb";
                    }
                }
            }
            str2 = "audio/vnd.dts.hd";
        } else {
            str2 = "audio/vnd.dts";
        }
        str3 = str2;
        i7 = round;
        i8 = h;
        i6 = d;
        obj = null;
        while (i6 - i12 < i13) {
            c2302k2.m8388c(i6);
            h = c2302k.m8403o();
            if (h <= 0) {
            }
            C2289a.m8312a(h <= 0, "childAtomSize should be positive");
            o = c2302k.m8403o();
            if (o != C2087a.f5823J) {
                if (z) {
                }
                if (o == C2087a.f5854o) {
                    c2302k2.m8388c(i6 + 8);
                    c2090c3.f5876b = Ac3Util.m7258a(c2302k2, Integer.toString(i4), str6, drmInitData2);
                } else if (o != C2087a.f5856q) {
                    if (o != C2087a.f5861v) {
                        i9 = h;
                        obj2 = obj;
                        str4 = str3;
                        i10 = i6;
                        drmInitData3 = drmInitData2;
                        c2090c2 = c2090c3;
                        if (o == C2087a.aO) {
                            h = i9;
                            obj3 = new byte[h];
                            d = i10;
                            c2302k2.m8388c(d);
                            c2302k2.m8384a(obj3, 0, h);
                            i6 = d + h;
                            c2090c3 = c2090c2;
                            obj = obj3;
                            drmInitData2 = drmInitData3;
                            str3 = str4;
                            i13 = i3;
                        }
                    } else {
                        i9 = h;
                        str4 = str3;
                        i10 = i6;
                        drmInitData3 = drmInitData2;
                        obj2 = obj;
                        c2090c2 = c2090c3;
                        c2090c2.f5876b = Format.createAudioSampleFormat(Integer.toString(i4), str3, null, -1, -1, i8, i7, null, drmInitData3, 0, str6);
                    }
                    h = i9;
                    d = i10;
                    obj3 = obj2;
                    i6 = d + h;
                    c2090c3 = c2090c2;
                    obj = obj3;
                    drmInitData2 = drmInitData3;
                    str3 = str4;
                    i13 = i3;
                } else {
                    c2302k2.m8388c(i6 + 8);
                    c2090c3.f5876b = Ac3Util.m7262b(c2302k2, Integer.toString(i4), str6, drmInitData2);
                }
                obj2 = obj;
                str4 = str3;
                d = i6;
                drmInitData3 = drmInitData2;
                c2090c2 = c2090c3;
                obj3 = obj2;
                i6 = d + h;
                c2090c3 = c2090c2;
                obj = obj3;
                drmInitData2 = drmInitData3;
                str3 = str4;
                i13 = i3;
            }
            obj2 = obj;
            str4 = str3;
            d = i6;
            drmInitData3 = drmInitData2;
            c2090c2 = c2090c3;
            if (o != C2087a.f5823J) {
                i6 = C2092b.m7493b(c2302k2, d, h);
            } else {
                i6 = d;
            }
            if (i6 == -1) {
                str5 = str4;
                obj3 = obj2;
            } else {
                Pair d22 = C2092b.m7500d(c2302k2, i6);
                str5 = (String) d22.first;
                obj3 = (byte[]) d22.second;
                if ("audio/mp4a-latm".equals(str5)) {
                    Pair a2 = C2292c.m8322a((byte[]) obj3);
                    i7 = ((Integer) a2.first).intValue();
                    i8 = ((Integer) a2.second).intValue();
                }
            }
            str4 = str5;
            i6 = d + h;
            c2090c3 = c2090c2;
            obj = obj3;
            drmInitData2 = drmInitData3;
            str3 = str4;
            i13 = i3;
        }
        obj2 = obj;
        str4 = str3;
        drmInitData3 = drmInitData2;
        c2090c2 = c2090c3;
        if (c2090c2.f5876b == null) {
            str2 = str4;
            if (str2 != null) {
                if ("audio/raw".equals(str2)) {
                }
                String num2 = Integer.toString(i4);
                obj4 = obj2;
                if (obj4 != null) {
                    list = Collections.singletonList(obj4);
                } else {
                    list = null;
                }
                c2090c2.f5876b = Format.createAudioSampleFormat(num2, str2, null, -1, -1, i8, i7, i11, list, drmInitData3, 0, str6);
            }
        }
    }

    /* renamed from: b */
    private static int m7493b(C2302k c2302k, int i, int i2) {
        int d = c2302k.m8389d();
        while (d - i < i2) {
            c2302k.m8388c(d);
            int o = c2302k.m8403o();
            C2289a.m8312a(o > 0, "childAtomSize should be positive");
            if (c2302k.m8403o() == C2087a.f5823J) {
                return d;
            }
            d += o;
        }
        return -1;
    }

    /* renamed from: d */
    private static Pair<String, byte[]> m7500d(C2302k c2302k, int i) {
        c2302k.m8388c((i + 8) + 4);
        c2302k.m8390d(1);
        C2092b.m7502e(c2302k);
        c2302k.m8390d(2);
        int g = c2302k.m8395g();
        if ((g & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            c2302k.m8390d(2);
        }
        if ((g & 64) != 0) {
            c2302k.m8390d(c2302k.m8396h());
        }
        if ((g & 32) != 0) {
            c2302k.m8390d(2);
        }
        c2302k.m8390d(1);
        C2092b.m7502e(c2302k);
        String a = C2297h.m8341a(c2302k.m8395g());
        if (!("audio/mpeg".equals(a) || "audio/vnd.dts".equals(a))) {
            if (!"audio/vnd.dts.hd".equals(a)) {
                c2302k.m8390d(12);
                c2302k.m8390d(1);
                i = C2092b.m7502e(c2302k);
                Object obj = new byte[i];
                c2302k.m8384a(obj, 0, i);
                return Pair.create(a, obj);
            }
        }
        return Pair.create(a, null);
    }

    /* renamed from: c */
    private static Pair<Integer, C2101h> m7498c(C2302k c2302k, int i, int i2) {
        int d = c2302k.m8389d();
        while (d - i < i2) {
            c2302k.m8388c(d);
            int o = c2302k.m8403o();
            C2289a.m8312a(o > 0, "childAtomSize should be positive");
            if (c2302k.m8403o() == C2087a.f5835V) {
                Pair<Integer, C2101h> a = C2092b.m7482a(c2302k, d, o);
                if (a != null) {
                    return a;
                }
            }
            d += o;
        }
        return null;
    }

    /* renamed from: a */
    static Pair<Integer, C2101h> m7482a(C2302k c2302k, int i, int i2) {
        int i3 = i + 8;
        String str = null;
        Object obj = str;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            c2302k.m8388c(i3);
            int o = c2302k.m8403o();
            int o2 = c2302k.m8403o();
            if (o2 == C2087a.ab) {
                obj = Integer.valueOf(c2302k.m8403o());
            } else if (o2 == C2087a.f5836W) {
                c2302k.m8390d(4);
                str = c2302k.m8392e(4);
            } else if (o2 == C2087a.f5837X) {
                i4 = i3;
                i5 = o;
            }
            i3 += o;
        }
        if ("cenc".equals(str) == 0 && "cbc1".equals(str) == 0 && "cens".equals(str) == 0) {
            if ("cbcs".equals(str) == 0) {
                return null;
            }
        }
        i = 1;
        C2289a.m8312a(obj != null ? 1 : 0, "frma atom is mandatory");
        C2289a.m8312a(i4 != -1 ? 1 : 0, "schi atom is mandatory");
        c2302k = C2092b.m7485a(c2302k, i4, i5, str);
        if (c2302k == null) {
            i = 0;
        }
        C2289a.m8312a(i, "tenc atom is mandatory");
        return Pair.create(obj, c2302k);
    }

    /* renamed from: a */
    private static C2101h m7485a(C2302k c2302k, int i, int i2, String str) {
        C2101h c2101h;
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            c2101h = null;
            if (i5 - i >= i2) {
                return null;
            }
            c2302k.m8388c(i5);
            int o = c2302k.m8403o();
            if (c2302k.m8403o() == C2087a.f5838Y) {
                break;
            }
            i5 += o;
        }
        i = C2087a.m7470a(c2302k.m8403o());
        c2302k.m8390d(1);
        if (i == 0) {
            c2302k.m8390d(1);
            i3 = 0;
            i4 = 0;
        } else {
            i = c2302k.m8395g();
            i4 = i & 15;
            i3 = (i & 240) >> 4;
        }
        boolean z = c2302k.m8395g() == 1;
        int g = c2302k.m8395g();
        byte[] bArr = new byte[16];
        c2302k.m8384a(bArr, 0, bArr.length);
        if (z && g == 0) {
            i = c2302k.m8395g();
            c2101h = new byte[i];
            c2302k.m8384a(c2101h, 0, i);
        }
        return new C2101h(z, str, g, bArr, i3, i4, c2101h);
    }

    /* renamed from: d */
    private static byte[] m7501d(C2302k c2302k, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            c2302k.m8388c(i3);
            int o = c2302k.m8403o();
            if (c2302k.m8403o() == C2087a.aJ) {
                return Arrays.copyOfRange(c2302k.f6929a, i3, o + i3);
            }
            i3 += o;
        }
        return null;
    }

    /* renamed from: e */
    private static int m7502e(C2302k c2302k) {
        int g = c2302k.m8395g();
        int i = g & 127;
        while ((g & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            g = c2302k.m8395g();
            i = (i << 7) | (g & 127);
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m7492a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int a = C2314v.m8456a(3, 0, length);
        length = C2314v.m8456a(jArr.length - 3, 0, length);
        if (jArr[0] > j2 || j2 >= jArr[a] || jArr[length] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }
}
