package com.google.android.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2072e;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.C2076i;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.C2054a;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp4.C2087a.C3637a;
import com.google.android.exoplayer2.extractor.mp4.C2087a.C3638b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2300i;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public final class Mp4Extractor implements Extractor, SeekMap {
    /* renamed from: a */
    public static final ExtractorsFactory f11108a = new C36361();
    /* renamed from: b */
    private static final int f11109b = C2314v.m8499g("qt  ");
    /* renamed from: c */
    private final int f11110c;
    /* renamed from: d */
    private final C2302k f11111d;
    /* renamed from: e */
    private final C2302k f11112e;
    /* renamed from: f */
    private final C2302k f11113f;
    /* renamed from: g */
    private final Stack<C3637a> f11114g;
    /* renamed from: h */
    private int f11115h;
    /* renamed from: i */
    private int f11116i;
    /* renamed from: j */
    private long f11117j;
    /* renamed from: k */
    private int f11118k;
    /* renamed from: l */
    private C2302k f11119l;
    /* renamed from: m */
    private int f11120m;
    /* renamed from: n */
    private int f11121n;
    /* renamed from: o */
    private int f11122o;
    /* renamed from: p */
    private ExtractorOutput f11123p;
    /* renamed from: q */
    private C2086a[] f11124q;
    /* renamed from: r */
    private long[][] f11125r;
    /* renamed from: s */
    private int f11126s;
    /* renamed from: t */
    private long f11127t;
    /* renamed from: u */
    private boolean f11128u;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$a */
    private static final class C2086a {
        /* renamed from: a */
        public final Track f5799a;
        /* renamed from: b */
        public final C2103j f5800b;
        /* renamed from: c */
        public final TrackOutput f5801c;
        /* renamed from: d */
        public int f5802d;

        public C2086a(Track track, C2103j c2103j, TrackOutput trackOutput) {
            this.f5799a = track;
            this.f5800b = c2103j;
            this.f5801c = trackOutput;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$1 */
    static class C36361 implements ExtractorsFactory {
        C36361() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new Mp4Extractor()};
        }
    }

    public boolean isSeekable() {
        return true;
    }

    public void release() {
    }

    public Mp4Extractor() {
        this(0);
    }

    public Mp4Extractor(int i) {
        this.f11110c = i;
        this.f11113f = new C2302k(16);
        this.f11114g = new Stack();
        this.f11111d = new C2302k(C2300i.f6921a);
        this.f11112e = new C2302k(4);
        this.f11120m = -1;
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return C2100g.m7523b(extractorInput);
    }

    public void init(ExtractorOutput extractorOutput) {
        this.f11123p = extractorOutput;
    }

    public void seek(long j, long j2) {
        this.f11114g.clear();
        this.f11118k = 0;
        this.f11120m = -1;
        this.f11121n = 0;
        this.f11122o = 0;
        if (j == 0) {
            m13738a();
        } else if (this.f11124q != null) {
            m13749c(j2);
        }
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        while (true) {
            switch (this.f11115h) {
                case 0:
                    if (m13742a(extractorInput)) {
                        break;
                    }
                    return -1;
                case 1:
                    if (!m13743a(extractorInput, c2075h)) {
                        break;
                    }
                    return 1;
                case 2:
                    return m13747b(extractorInput, c2075h);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public long getDurationUs() {
        return this.f11127t;
    }

    public C2054a getSeekPoints(long j) {
        if (this.f11124q.length == 0) {
            return new C2054a(C2076i.f5727a);
        }
        int a;
        long j2;
        long j3;
        long j4;
        long j5;
        if (this.f11126s != -1) {
            C2103j c2103j = this.f11124q[this.f11126s].f5800b;
            a = m13736a(c2103j, j);
            if (a == -1) {
                return new C2054a(C2076i.f5727a);
            }
            j2 = c2103j.f5961e[a];
            j3 = c2103j.f5958b[a];
            if (j2 < j && a < c2103j.f5957a - 1) {
                j = c2103j.m7532b(j);
                if (!(j == -1 || j == a)) {
                    j4 = c2103j.f5961e[j];
                    j = c2103j.f5958b[j];
                    j5 = j;
                    j = j2;
                }
            }
            j = -1;
            j4 = -9223372036854775807L;
            j5 = j;
            j = j2;
        } else {
            j3 = Format.OFFSET_SAMPLE_RELATIVE;
            j5 = -1;
            j4 = -9223372036854775807L;
        }
        for (a = 0; a < this.f11124q.length; a++) {
            if (a != this.f11126s) {
                C2103j c2103j2 = this.f11124q[a].f5800b;
                j2 = m13737a(c2103j2, j, j3);
                if (j4 != -9223372036854775807L) {
                    j5 = m13737a(c2103j2, j4, j5);
                }
                j3 = j2;
            }
        }
        C2076i c2076i = new C2076i(j, j3);
        if (j4 == -9223372036854775807L) {
            return new C2054a(c2076i);
        }
        return new C2054a(c2076i, new C2076i(j4, j5));
    }

    /* renamed from: a */
    private void m13738a() {
        this.f11115h = 0;
        this.f11118k = 0;
    }

    /* renamed from: a */
    private boolean m13742a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        long length;
        if (this.f11118k == 0) {
            if (!extractorInput.readFully(this.f11113f.f6929a, 0, 8, true)) {
                return false;
            }
            this.f11118k = 8;
            this.f11113f.m8388c(0);
            this.f11117j = this.f11113f.m8401m();
            this.f11116i = this.f11113f.m8403o();
        }
        if (this.f11117j == 1) {
            extractorInput.readFully(this.f11113f.f6929a, 8, 8);
            this.f11118k += 8;
            this.f11117j = this.f11113f.m8411w();
        } else if (this.f11117j == 0) {
            length = extractorInput.getLength();
            if (length == -1 && !this.f11114g.isEmpty()) {
                length = ((C3637a) this.f11114g.peek()).aQ;
            }
            if (length != -1) {
                this.f11117j = (length - extractorInput.getPosition()) + ((long) this.f11118k);
            }
        }
        if (this.f11117j < ((long) this.f11118k)) {
            throw new ParserException("Atom size less than header length (unsupported).");
        }
        if (m13748b(this.f11116i)) {
            length = (extractorInput.getPosition() + this.f11117j) - ((long) this.f11118k);
            this.f11114g.add(new C3637a(this.f11116i, length));
            if (this.f11117j == ((long) this.f11118k)) {
                m13739a(length);
            } else {
                m13738a();
            }
        } else if (m13741a(this.f11116i) != null) {
            C2289a.m8313b(this.f11118k == 8 ? true : null);
            C2289a.m8313b(this.f11117j <= 2147483647L ? true : null);
            this.f11119l = new C2302k((int) this.f11117j);
            System.arraycopy(this.f11113f.f6929a, 0, this.f11119l.f6929a, 0, 8);
            this.f11115h = 1;
        } else {
            this.f11119l = null;
            this.f11115h = 1;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m13743a(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        long j = this.f11117j - ((long) this.f11118k);
        long position = extractorInput.getPosition() + j;
        if (this.f11119l != null) {
            extractorInput.readFully(this.f11119l.f6929a, this.f11118k, (int) j);
            if (this.f11116i == C2087a.f5840a) {
                this.f11128u = m13744a(this.f11119l);
            } else if (this.f11114g.isEmpty() == null) {
                ((C3637a) this.f11114g.peek()).m13751a(new C3638b(this.f11116i, this.f11119l));
            }
        } else if (j < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            extractorInput.skipFully((int) j);
        } else {
            c2075h.f5726a = extractorInput.getPosition() + j;
            extractorInput = true;
            m13739a(position);
            if (extractorInput != null || this.f11115h == 2) {
                return false;
            }
            return true;
        }
        extractorInput = null;
        m13739a(position);
        if (extractorInput != null) {
        }
        return false;
    }

    /* renamed from: a */
    private void m13739a(long j) throws ParserException {
        while (!this.f11114g.isEmpty() && ((C3637a) this.f11114g.peek()).aQ == j) {
            C3637a c3637a = (C3637a) this.f11114g.pop();
            if (c3637a.aP == C2087a.f5815B) {
                m13740a(c3637a);
                this.f11114g.clear();
                this.f11115h = 2;
            } else if (!this.f11114g.isEmpty()) {
                ((C3637a) this.f11114g.peek()).m13750a(c3637a);
            }
        }
        if (this.f11115h != 2) {
            m13738a();
        }
    }

    /* renamed from: a */
    private void m13740a(C3637a c3637a) throws ParserException {
        Metadata a;
        Mp4Extractor mp4Extractor = this;
        C3637a c3637a2 = c3637a;
        List arrayList = new ArrayList();
        C2072e c2072e = new C2072e();
        C3638b d = c3637a2.m13752d(C2087a.aA);
        if (d != null) {
            a = C2092b.m7487a(d, mp4Extractor.f11128u);
            if (a != null) {
                c2072e.m7420a(a);
            }
        } else {
            a = null;
        }
        int i = -1;
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < c3637a2.aS.size(); i2++) {
            C3637a c3637a3 = (C3637a) c3637a2.aS.get(i2);
            if (c3637a3.aP == C2087a.f5817D) {
                Track a2 = C2092b.m7483a(c3637a3, c3637a2.m13752d(C2087a.f5816C), -9223372036854775807L, null, (mp4Extractor.f11110c & 1) != 0, mp4Extractor.f11128u);
                if (a2 != null) {
                    C2103j a3 = C2092b.m7486a(a2, c3637a3.m13753e(C2087a.f5818E).m13753e(C2087a.f5819F).m13753e(C2087a.f5820G), c2072e);
                    if (a3.f5957a != 0) {
                        C2086a c2086a = new C2086a(a2, a3, mp4Extractor.f11123p.track(i2, a2.f5804b));
                        Format copyWithMaxInputSize = a2.f5808f.copyWithMaxInputSize(a3.f5960d + 30);
                        if (a2.f5804b == 1) {
                            if (c2072e.m7418a()) {
                                copyWithMaxInputSize = copyWithMaxInputSize.copyWithGaplessInfo(c2072e.f5708b, c2072e.f5709c);
                            }
                            if (a != null) {
                                copyWithMaxInputSize = copyWithMaxInputSize.copyWithMetadata(a);
                            }
                        }
                        c2086a.f5801c.format(copyWithMaxInputSize);
                        long max = Math.max(j, a2.f5807e != -9223372036854775807L ? a2.f5807e : a3.f5963g);
                        if (a2.f5804b == 2) {
                            if (i == -1) {
                                i = arrayList.size();
                            }
                        }
                        arrayList.add(c2086a);
                        j = max;
                    }
                }
            }
        }
        mp4Extractor.f11126s = i;
        mp4Extractor.f11127t = j;
        mp4Extractor.f11124q = (C2086a[]) arrayList.toArray(new C2086a[arrayList.size()]);
        mp4Extractor.f11125r = m13745a(mp4Extractor.f11124q);
        mp4Extractor.f11123p.endTracks();
        mp4Extractor.f11123p.seekMap(mp4Extractor);
    }

    /* renamed from: b */
    private int m13747b(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        long position = extractorInput.getPosition();
        if (this.f11120m == -1) {
            this.f11120m = m13746b(position);
            if (this.f11120m == -1) {
                return -1;
            }
        }
        C2086a c2086a = this.f11124q[this.f11120m];
        TrackOutput trackOutput = c2086a.f5801c;
        int i = c2086a.f5802d;
        long j = c2086a.f5800b.f5958b[i];
        int i2 = c2086a.f5800b.f5959c[i];
        long j2 = (j - position) + ((long) this.f11121n);
        if (j2 >= 0) {
            if (j2 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                if (c2086a.f5799a.f5809g == 1) {
                    i2 -= 8;
                    j2 += 8;
                }
                extractorInput.skipFully((int) j2);
                if (c2086a.f5799a.f5812j != null) {
                    c2075h = this.f11112e.f6929a;
                    c2075h[0] = null;
                    c2075h[1] = null;
                    c2075h[2] = null;
                    c2075h = c2086a.f5799a.f5812j;
                    int i3 = 4 - c2086a.f5799a.f5812j;
                    while (this.f11121n < i2) {
                        if (this.f11122o == 0) {
                            extractorInput.readFully(this.f11112e.f6929a, i3, c2075h);
                            this.f11112e.m8388c(0);
                            this.f11122o = this.f11112e.m8409u();
                            this.f11111d.m8388c(0);
                            trackOutput.sampleData(this.f11111d, 4);
                            this.f11121n += 4;
                            i2 += i3;
                        } else {
                            int sampleData = trackOutput.sampleData(extractorInput, this.f11122o, false);
                            this.f11121n += sampleData;
                            this.f11122o -= sampleData;
                        }
                    }
                } else {
                    while (this.f11121n < i2) {
                        c2075h = trackOutput.sampleData(extractorInput, i2 - this.f11121n, false);
                        this.f11121n += c2075h;
                        this.f11122o -= c2075h;
                    }
                }
                int i4 = i2;
                trackOutput.sampleMetadata(c2086a.f5800b.f5961e[i], c2086a.f5800b.f5962f[i], i4, 0, null);
                c2086a.f5802d += 1;
                this.f11120m = -1;
                this.f11121n = 0;
                this.f11122o = 0;
                return 0;
            }
        }
        c2075h.f5726a = j;
        return 1;
    }

    /* renamed from: b */
    private int m13746b(long j) {
        Mp4Extractor mp4Extractor = this;
        long j2 = Format.OFFSET_SAMPLE_RELATIVE;
        Object obj = 1;
        long j3 = Format.OFFSET_SAMPLE_RELATIVE;
        int i = -1;
        int i2 = -1;
        Object obj2 = 1;
        long j4 = Format.OFFSET_SAMPLE_RELATIVE;
        for (int i3 = 0; i3 < mp4Extractor.f11124q.length; i3++) {
            C2086a c2086a = mp4Extractor.f11124q[i3];
            int i4 = c2086a.f5802d;
            if (i4 != c2086a.f5800b.f5957a) {
                Object obj3;
                long j5 = c2086a.f5800b.f5958b[i4];
                long j6 = mp4Extractor.f11125r[i3][i4];
                long j7 = j5 - j;
                if (j7 >= 0) {
                    if (j7 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        obj3 = null;
                        if ((obj3 == null && r13 != null) || (obj3 == r13 && j7 < r14)) {
                            obj2 = obj3;
                            i = i3;
                            j3 = j6;
                            j4 = j7;
                        }
                        if (j6 < j2) {
                            obj = obj3;
                            i2 = i3;
                            j2 = j6;
                        }
                    }
                }
                obj3 = 1;
                obj2 = obj3;
                i = i3;
                j3 = j6;
                j4 = j7;
                if (j6 < j2) {
                    obj = obj3;
                    i2 = i3;
                    j2 = j6;
                }
            }
        }
        if (j2 == Format.OFFSET_SAMPLE_RELATIVE || r8 == null) {
            return i;
        }
        return j3 < j2 + 10485760 ? i : i2;
    }

    /* renamed from: c */
    private void m13749c(long j) {
        for (C2086a c2086a : this.f11124q) {
            C2103j c2103j = c2086a.f5800b;
            int a = c2103j.m7531a(j);
            if (a == -1) {
                a = c2103j.m7532b(j);
            }
            c2086a.f5802d = a;
        }
    }

    /* renamed from: a */
    private static long[][] m13745a(C2086a[] c2086aArr) {
        int i;
        long[][] jArr = new long[c2086aArr.length][];
        int[] iArr = new int[c2086aArr.length];
        long[] jArr2 = new long[c2086aArr.length];
        boolean[] zArr = new boolean[c2086aArr.length];
        for (i = 0; i < c2086aArr.length; i++) {
            jArr[i] = new long[c2086aArr[i].f5800b.f5957a];
            jArr2[i] = c2086aArr[i].f5800b.f5961e[0];
        }
        long j = 0;
        i = 0;
        while (i < c2086aArr.length) {
            int i2 = -1;
            long j2 = Format.OFFSET_SAMPLE_RELATIVE;
            int i3 = 0;
            while (i3 < c2086aArr.length) {
                if (!zArr[i3] && jArr2[i3] <= r11) {
                    j2 = jArr2[i3];
                    i2 = i3;
                }
                i3++;
            }
            i3 = iArr[i2];
            jArr[i2][i3] = j;
            long j3 = j + ((long) c2086aArr[i2].f5800b.f5959c[i3]);
            i3++;
            iArr[i2] = i3;
            if (i3 < jArr[i2].length) {
                jArr2[i2] = c2086aArr[i2].f5800b.f5961e[i3];
            } else {
                zArr[i2] = true;
                i++;
            }
            j = j3;
        }
        return jArr;
    }

    /* renamed from: a */
    private static long m13737a(C2103j c2103j, long j, long j2) {
        j = m13736a(c2103j, j);
        if (j == -1) {
            return j2;
        }
        return Math.min(c2103j.f5958b[j], j2);
    }

    /* renamed from: a */
    private static int m13736a(C2103j c2103j, long j) {
        int a = c2103j.m7531a(j);
        return a == -1 ? c2103j.m7532b(j) : a;
    }

    /* renamed from: a */
    private static boolean m13744a(C2302k c2302k) {
        c2302k.m8388c(8);
        if (c2302k.m8403o() == f11109b) {
            return true;
        }
        c2302k.m8390d(4);
        while (c2302k.m8385b() > 0) {
            if (c2302k.m8403o() == f11109b) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m13741a(int i) {
        if (!(i == C2087a.f5831R || i == C2087a.f5816C || i == C2087a.f5832S || i == C2087a.f5833T || i == C2087a.am || i == C2087a.an || i == C2087a.ao || i == C2087a.f5830Q || i == C2087a.ap || i == C2087a.aq || i == C2087a.ar || i == C2087a.as || i == C2087a.at || i == C2087a.f5828O || i == C2087a.f5840a)) {
            if (i != C2087a.aA) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m13748b(int i) {
        if (!(i == C2087a.f5815B || i == C2087a.f5817D || i == C2087a.f5818E || i == C2087a.f5819F || i == C2087a.f5820G)) {
            if (i != C2087a.f5829P) {
                return false;
            }
        }
        return true;
    }
}
