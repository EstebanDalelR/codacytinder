package com.google.android.exoplayer2.extractor.mp4;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.C3608a;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.C3605b;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput.C2055a;
import com.google.android.exoplayer2.extractor.mp4.C2087a.C3637a;
import com.google.android.exoplayer2.extractor.mp4.C2087a.C3638b;
import com.google.android.exoplayer2.text.p065a.C2223f;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2300i;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

public final class FragmentedMp4Extractor implements Extractor {
    /* renamed from: a */
    public static final ExtractorsFactory f11071a = new C36351();
    /* renamed from: b */
    private static final int f11072b = C2314v.m8499g("seig");
    /* renamed from: c */
    private static final byte[] f11073c = new byte[]{(byte) -94, (byte) 57, (byte) 79, (byte) 82, (byte) 90, (byte) -101, (byte) 79, (byte) 20, (byte) -94, (byte) 68, (byte) 108, (byte) 66, (byte) 124, (byte) 100, (byte) -115, (byte) -12};
    /* renamed from: d */
    private static final Format f11074d = Format.createSampleFormat(null, "application/x-emsg", Format.OFFSET_SAMPLE_RELATIVE);
    /* renamed from: A */
    private long f11075A;
    /* renamed from: B */
    private long f11076B;
    /* renamed from: C */
    private C2085b f11077C;
    /* renamed from: D */
    private int f11078D;
    /* renamed from: E */
    private int f11079E;
    /* renamed from: F */
    private int f11080F;
    /* renamed from: G */
    private boolean f11081G;
    /* renamed from: H */
    private ExtractorOutput f11082H;
    /* renamed from: I */
    private TrackOutput[] f11083I;
    /* renamed from: J */
    private TrackOutput[] f11084J;
    /* renamed from: K */
    private boolean f11085K;
    /* renamed from: e */
    private final int f11086e;
    @Nullable
    /* renamed from: f */
    private final Track f11087f;
    /* renamed from: g */
    private final List<Format> f11088g;
    @Nullable
    /* renamed from: h */
    private final DrmInitData f11089h;
    /* renamed from: i */
    private final SparseArray<C2085b> f11090i;
    /* renamed from: j */
    private final C2302k f11091j;
    /* renamed from: k */
    private final C2302k f11092k;
    /* renamed from: l */
    private final C2302k f11093l;
    @Nullable
    /* renamed from: m */
    private final C2310s f11094m;
    /* renamed from: n */
    private final C2302k f11095n;
    /* renamed from: o */
    private final byte[] f11096o;
    /* renamed from: p */
    private final Stack<C3637a> f11097p;
    /* renamed from: q */
    private final ArrayDeque<C2084a> f11098q;
    @Nullable
    /* renamed from: r */
    private final TrackOutput f11099r;
    /* renamed from: s */
    private int f11100s;
    /* renamed from: t */
    private int f11101t;
    /* renamed from: u */
    private long f11102u;
    /* renamed from: v */
    private int f11103v;
    /* renamed from: w */
    private C2302k f11104w;
    /* renamed from: x */
    private long f11105x;
    /* renamed from: y */
    private int f11106y;
    /* renamed from: z */
    private long f11107z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$a */
    private static final class C2084a {
        /* renamed from: a */
        public final long f5787a;
        /* renamed from: b */
        public final int f5788b;

        public C2084a(long j, int i) {
            this.f5787a = j;
            this.f5788b = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$b */
    private static final class C2085b {
        /* renamed from: a */
        public final TrackOutput f5789a;
        /* renamed from: b */
        public final C2102i f5790b = new C2102i();
        /* renamed from: c */
        public Track f5791c;
        /* renamed from: d */
        public C2093c f5792d;
        /* renamed from: e */
        public int f5793e;
        /* renamed from: f */
        public int f5794f;
        /* renamed from: g */
        public int f5795g;
        /* renamed from: h */
        public int f5796h;
        /* renamed from: i */
        private final C2302k f5797i = new C2302k(1);
        /* renamed from: j */
        private final C2302k f5798j = new C2302k();

        public C2085b(TrackOutput trackOutput) {
            this.f5789a = trackOutput;
        }

        /* renamed from: a */
        public void m7466a(Track track, C2093c c2093c) {
            this.f5791c = (Track) C2289a.m8309a((Object) track);
            this.f5792d = (C2093c) C2289a.m8309a((Object) c2093c);
            this.f5789a.format(track.f5808f);
            m7463a();
        }

        /* renamed from: a */
        public void m7465a(DrmInitData drmInitData) {
            C2101h a = this.f5791c.m7469a(this.f5790b.f5938a.f5889a);
            this.f5789a.format(this.f5791c.f5808f.copyWithDrmInitData(drmInitData.copyWithSchemeType(a != null ? a.f5934b : null)));
        }

        /* renamed from: a */
        public void m7463a() {
            this.f5790b.m7525a();
            this.f5793e = 0;
            this.f5795g = 0;
            this.f5794f = 0;
            this.f5796h = 0;
        }

        /* renamed from: a */
        public void m7464a(long j) {
            j = C2005C.m7215a(j);
            int i = this.f5793e;
            while (i < this.f5790b.f5943f && this.f5790b.m7530b(i) < j) {
                if (this.f5790b.f5949l[i]) {
                    this.f5796h = i;
                }
                i++;
            }
        }

        /* renamed from: b */
        public boolean m7467b() {
            this.f5793e++;
            this.f5794f++;
            if (this.f5794f != this.f5790b.f5945h[this.f5795g]) {
                return true;
            }
            this.f5795g++;
            this.f5794f = 0;
            return false;
        }

        /* renamed from: c */
        public int m7468c() {
            if (!this.f5790b.f5950m) {
                return 0;
            }
            C2302k c2302k;
            int i;
            C2101h e = m7462e();
            if (e.f5936d != 0) {
                c2302k = this.f5790b.f5954q;
                i = e.f5936d;
            } else {
                byte[] bArr = e.f5937e;
                this.f5798j.m8383a(bArr, bArr.length);
                c2302k = this.f5798j;
                i = bArr.length;
            }
            boolean z = this.f5790b.f5951n[this.f5793e];
            this.f5797i.f6929a[0] = (byte) ((z ? ProfileEditingConfig.DEFAULT_MAX_LENGTH : 0) | i);
            this.f5797i.m8388c(0);
            this.f5789a.sampleData(this.f5797i, 1);
            this.f5789a.sampleData(c2302k, i);
            if (!z) {
                return i + 1;
            }
            C2302k c2302k2 = this.f5790b.f5954q;
            int h = c2302k2.m8396h();
            c2302k2.m8390d(-2);
            h = (h * 6) + 2;
            this.f5789a.sampleData(c2302k2, h);
            return (i + 1) + h;
        }

        /* renamed from: d */
        private void m7461d() {
            if (this.f5790b.f5950m) {
                C2302k c2302k = this.f5790b.f5954q;
                C2101h e = m7462e();
                if (e.f5936d != 0) {
                    c2302k.m8390d(e.f5936d);
                }
                if (this.f5790b.f5951n[this.f5793e]) {
                    c2302k.m8390d(c2302k.m8396h() * 6);
                }
            }
        }

        /* renamed from: e */
        private C2101h m7462e() {
            int i = this.f5790b.f5938a.f5889a;
            if (this.f5790b.f5952o != null) {
                return this.f5790b.f5952o;
            }
            return this.f5791c.m7469a(i);
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$1 */
    static class C36351 implements ExtractorsFactory {
        C36351() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new FragmentedMp4Extractor()};
        }
    }

    public void release() {
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    public FragmentedMp4Extractor(int i) {
        this(i, null);
    }

    public FragmentedMp4Extractor(int i, @Nullable C2310s c2310s) {
        this(i, c2310s, null, null);
    }

    public FragmentedMp4Extractor(int i, @Nullable C2310s c2310s, @Nullable Track track, @Nullable DrmInitData drmInitData) {
        this(i, c2310s, track, drmInitData, Collections.emptyList());
    }

    public FragmentedMp4Extractor(int i, @Nullable C2310s c2310s, @Nullable Track track, @Nullable DrmInitData drmInitData, List<Format> list) {
        this(i, c2310s, track, drmInitData, list, null);
    }

    public FragmentedMp4Extractor(int i, @Nullable C2310s c2310s, @Nullable Track track, @Nullable DrmInitData drmInitData, List<Format> list, @Nullable TrackOutput trackOutput) {
        this.f11086e = i | (track != null ? 8 : 0);
        this.f11094m = c2310s;
        this.f11087f = track;
        this.f11089h = drmInitData;
        this.f11088g = Collections.unmodifiableList(list);
        this.f11099r = trackOutput;
        this.f11095n = new C2302k(16);
        this.f11091j = new C2302k(C2300i.f6921a);
        this.f11092k = new C2302k(5);
        this.f11093l = new C2302k();
        this.f11096o = new byte[16];
        this.f11097p = new Stack();
        this.f11098q = new ArrayDeque();
        this.f11090i = new SparseArray();
        this.f11075A = -9223372036854775807L;
        this.f11107z = -9223372036854775807L;
        this.f11076B = -9223372036854775807L;
        m13709a();
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return C2100g.m7521a(extractorInput);
    }

    public void init(ExtractorOutput extractorOutput) {
        this.f11082H = extractorOutput;
        if (this.f11087f != null) {
            C2085b c2085b = new C2085b(extractorOutput.track(0, this.f11087f.f5804b));
            c2085b.m7466a(this.f11087f, new C2093c(0, 0, 0, 0));
            this.f11090i.put(0, c2085b);
            m13724b();
            this.f11082H.endTracks();
        }
    }

    public void seek(long j, long j2) {
        j = this.f11090i.size();
        for (int i = 0; i < j; i++) {
            ((C2085b) this.f11090i.valueAt(i)).m7463a();
        }
        this.f11098q.clear();
        this.f11106y = 0;
        this.f11107z = j2;
        this.f11097p.clear();
        m13709a();
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        while (true) {
            switch (this.f11100s) {
                case null:
                    if (m13722a(extractorInput) != null) {
                        break;
                    }
                    return -1;
                case 1:
                    m13726b(extractorInput);
                    break;
                case 2:
                    m13732c(extractorInput);
                    break;
                default:
                    if (m13735d(extractorInput) == null) {
                        break;
                    }
                    return null;
            }
        }
    }

    /* renamed from: a */
    private void m13709a() {
        this.f11100s = 0;
        this.f11103v = 0;
    }

    /* renamed from: a */
    private boolean m13722a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        long length;
        if (this.f11103v == 0) {
            if (!extractorInput.readFully(this.f11095n.f6929a, 0, 8, true)) {
                return false;
            }
            this.f11103v = 8;
            this.f11095n.m8388c(0);
            this.f11102u = this.f11095n.m8401m();
            this.f11101t = this.f11095n.m8403o();
        }
        if (this.f11102u == 1) {
            extractorInput.readFully(this.f11095n.f6929a, 8, 8);
            this.f11103v += 8;
            this.f11102u = this.f11095n.m8411w();
        } else if (this.f11102u == 0) {
            length = extractorInput.getLength();
            if (length == -1 && !this.f11097p.isEmpty()) {
                length = ((C3637a) this.f11097p.peek()).aQ;
            }
            if (length != -1) {
                this.f11102u = (length - extractorInput.getPosition()) + ((long) this.f11103v);
            }
        }
        if (this.f11102u < ((long) this.f11103v)) {
            throw new ParserException("Atom size less than header length (unsupported).");
        }
        long position = extractorInput.getPosition() - ((long) this.f11103v);
        if (this.f11101t == C2087a.f5824K) {
            int size = this.f11090i.size();
            for (int i = 0; i < size; i++) {
                C2102i c2102i = ((C2085b) this.f11090i.valueAt(i)).f5790b;
                c2102i.f5939b = position;
                c2102i.f5941d = position;
                c2102i.f5940c = position;
            }
        }
        if (this.f11101t == C2087a.f5847h) {
            this.f11077C = null;
            this.f11105x = position + this.f11102u;
            if (this.f11085K == null) {
                this.f11082H.seekMap(new C3605b(this.f11075A, position));
                this.f11085K = true;
            }
            this.f11100s = 2;
            return true;
        }
        if (m13730b(this.f11101t)) {
            length = (extractorInput.getPosition() + this.f11102u) - 8;
            this.f11097p.add(new C3637a(this.f11101t, length));
            if (this.f11102u == ((long) this.f11103v)) {
                m13710a(length);
            } else {
                m13709a();
            }
        } else if (m13721a(this.f11101t) != null) {
            if (this.f11103v != 8) {
                throw new ParserException("Leaf atom defines extended atom size (unsupported).");
            } else if (this.f11102u > 2147483647L) {
                throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
            } else {
                this.f11104w = new C2302k((int) this.f11102u);
                System.arraycopy(this.f11095n.f6929a, 0, this.f11104w.f6929a, 0, 8);
                this.f11100s = 1;
            }
        } else if (this.f11102u > 2147483647L) {
            throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
        } else {
            this.f11104w = null;
            this.f11100s = 1;
        }
        return true;
    }

    /* renamed from: b */
    private void m13726b(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i = ((int) this.f11102u) - this.f11103v;
        if (this.f11104w != null) {
            extractorInput.readFully(this.f11104w.f6929a, 8, i);
            m13714a(new C3638b(this.f11101t, this.f11104w), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i);
        }
        m13710a(extractorInput.getPosition());
    }

    /* renamed from: a */
    private void m13710a(long j) throws ParserException {
        while (!this.f11097p.isEmpty() && ((C3637a) this.f11097p.peek()).aQ == j) {
            m13711a((C3637a) this.f11097p.pop());
        }
        m13709a();
    }

    /* renamed from: a */
    private void m13714a(C3638b c3638b, long j) throws ParserException {
        if (!this.f11097p.isEmpty()) {
            ((C3637a) this.f11097p.peek()).m13751a(c3638b);
        } else if (c3638b.aP == C2087a.f5814A) {
            c3638b = m13705a(c3638b.aQ, j);
            this.f11076B = ((Long) c3638b.first).longValue();
            this.f11082H.seekMap((SeekMap) c3638b.second);
            this.f11085K = true;
        } else if (c3638b.aP == C2087a.aG) {
            m13716a(c3638b.aQ);
        }
    }

    /* renamed from: a */
    private void m13711a(C3637a c3637a) throws ParserException {
        if (c3637a.aP == C2087a.f5815B) {
            m13727b(c3637a);
        } else if (c3637a.aP == C2087a.f5824K) {
            m13733c(c3637a);
        } else if (!this.f11097p.isEmpty()) {
            ((C3637a) this.f11097p.peek()).m13750a(c3637a);
        }
    }

    /* renamed from: b */
    private void m13727b(C3637a c3637a) throws ParserException {
        DrmInitData drmInitData;
        C3637a c3637a2 = c3637a;
        int i = 0;
        boolean z = true;
        C2289a.m8314b(this.f11087f == null, "Unexpected moov box.");
        if (r0.f11089h != null) {
            drmInitData = r0.f11089h;
        } else {
            drmInitData = m13706a(c3637a2.aR);
        }
        C3637a e = c3637a2.m13753e(C2087a.f5826M);
        SparseArray sparseArray = new SparseArray();
        int size = e.aR.size();
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            C3638b c3638b = (C3638b) e.aR.get(i2);
            if (c3638b.aP == C2087a.f5864y) {
                Pair b = m13723b(c3638b.aQ);
                sparseArray.put(((Integer) b.first).intValue(), b.second);
            } else if (c3638b.aP == C2087a.f5827N) {
                j = m13731c(c3638b.aQ);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c3637a2.aS.size();
        int i3 = 0;
        while (i3 < size2) {
            int i4;
            int i5;
            e = (C3637a) c3637a2.aS.get(i3);
            if (e.aP == C2087a.f5817D) {
                i4 = i3;
                i5 = size2;
                Track a = C2092b.m7483a(e, c3637a2.m13752d(C2087a.f5816C), j, drmInitData, (r0.f11086e & 16) != 0, false);
                if (a != null) {
                    sparseArray2.put(a.f5803a, a);
                }
            } else {
                i4 = i3;
                i5 = size2;
            }
            i3 = i4 + 1;
            size2 = i5;
        }
        int size3 = sparseArray2.size();
        if (r0.f11090i.size() == 0) {
            while (i < size3) {
                Track track = (Track) sparseArray2.valueAt(i);
                C2085b c2085b = new C2085b(r0.f11082H.track(i, track.f5804b));
                c2085b.m7466a(track, (C2093c) sparseArray.get(track.f5803a));
                r0.f11090i.put(track.f5803a, c2085b);
                r0.f11075A = Math.max(r0.f11075A, track.f5807e);
                i++;
            }
            m13724b();
            r0.f11082H.endTracks();
            return;
        }
        if (r0.f11090i.size() != size3) {
            z = false;
        }
        C2289a.m8313b(z);
        while (i < size3) {
            track = (Track) sparseArray2.valueAt(i);
            ((C2085b) r0.f11090i.get(track.f5803a)).m7466a(track, (C2093c) sparseArray.get(track.f5803a));
            i++;
        }
    }

    /* renamed from: c */
    private void m13733c(C3637a c3637a) throws ParserException {
        DrmInitData drmInitData;
        m13712a(c3637a, this.f11090i, this.f11086e, this.f11096o);
        if (this.f11089h != null) {
            drmInitData = null;
        } else {
            drmInitData = m13706a(c3637a.aR);
        }
        if (drmInitData != null) {
            int size = this.f11090i.size();
            for (int i = 0; i < size; i++) {
                ((C2085b) this.f11090i.valueAt(i)).m7465a(drmInitData);
            }
        }
        if (this.f11107z != -9223372036854775807L) {
            c3637a = this.f11090i.size();
            for (int i2 = 0; i2 < c3637a; i2++) {
                ((C2085b) this.f11090i.valueAt(i2)).m7464a(this.f11107z);
            }
            this.f11107z = -9223372036854775807L;
        }
    }

    /* renamed from: b */
    private void m13724b() {
        int i = 0;
        if (this.f11083I == null) {
            int i2;
            this.f11083I = new TrackOutput[2];
            if (this.f11099r != null) {
                this.f11083I[0] = this.f11099r;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((this.f11086e & 4) != 0) {
                int i3 = i2 + 1;
                this.f11083I[i2] = this.f11082H.track(this.f11090i.size(), 4);
                i2 = i3;
            }
            this.f11083I = (TrackOutput[]) Arrays.copyOf(this.f11083I, i2);
            for (TrackOutput format : this.f11083I) {
                format.format(f11074d);
            }
        }
        if (this.f11084J == null) {
            this.f11084J = new TrackOutput[this.f11088g.size()];
            while (i < this.f11084J.length) {
                TrackOutput track = this.f11082H.track((this.f11090i.size() + 1) + i, 3);
                track.format((Format) this.f11088g.get(i));
                this.f11084J[i] = track;
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m13716a(C2302k c2302k) {
        if (this.f11083I != null) {
            if (this.f11083I.length != 0) {
                c2302k.m8388c(12);
                int b = c2302k.m8385b();
                c2302k.m8413y();
                c2302k.m8413y();
                long d = C2314v.m8492d(c2302k.m8401m(), 1000000, c2302k.m8401m());
                for (TrackOutput trackOutput : this.f11083I) {
                    c2302k.m8388c(12);
                    trackOutput.sampleData(c2302k, b);
                }
                if (this.f11076B != -9223372036854775807L) {
                    for (TrackOutput sampleMetadata : this.f11083I) {
                        sampleMetadata.sampleMetadata(this.f11076B + d, 1, b, 0, null);
                    }
                } else {
                    this.f11098q.addLast(new C2084a(d, b));
                    this.f11106y += b;
                }
            }
        }
    }

    /* renamed from: b */
    private static Pair<Integer, C2093c> m13723b(C2302k c2302k) {
        c2302k.m8388c(12);
        return Pair.create(Integer.valueOf(c2302k.m8403o()), new C2093c(c2302k.m8409u() - 1, c2302k.m8409u(), c2302k.m8409u(), c2302k.m8403o()));
    }

    /* renamed from: c */
    private static long m13731c(C2302k c2302k) {
        c2302k.m8388c(8);
        return C2087a.m7470a(c2302k.m8403o()) == 0 ? c2302k.m8401m() : c2302k.m8411w();
    }

    /* renamed from: a */
    private static void m13712a(C3637a c3637a, SparseArray<C2085b> sparseArray, int i, byte[] bArr) throws ParserException {
        int size = c3637a.aS.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3637a c3637a2 = (C3637a) c3637a.aS.get(i2);
            if (c3637a2.aP == C2087a.f5825L) {
                m13728b(c3637a2, sparseArray, i, bArr);
            }
        }
    }

    /* renamed from: b */
    private static void m13728b(C3637a c3637a, SparseArray<C2085b> sparseArray, int i, byte[] bArr) throws ParserException {
        C2085b a = m13708a(c3637a.m13752d(C2087a.f5863x).aQ, (SparseArray) sparseArray, i);
        if (a != null) {
            C2102i c2102i = a.f5790b;
            long j = c2102i.f5956s;
            a.m7463a();
            if (c3637a.m13752d(C2087a.f5862w) != null && (i & 2) == 0) {
                j = m13734d(c3637a.m13752d(C2087a.f5862w).aQ);
            }
            m13713a(c3637a, a, j, i);
            C2101h a2 = a.f5791c.m7469a(c2102i.f5938a.f5889a);
            i = c3637a.m13752d(C2087a.ac);
            if (i != 0) {
                m13715a(a2, i.aQ, c2102i);
            }
            i = c3637a.m13752d(C2087a.ad);
            if (i != 0) {
                m13718a(i.aQ, c2102i);
            }
            i = c3637a.m13752d(C2087a.ah);
            if (i != 0) {
                m13729b(i.aQ, c2102i);
            }
            i = c3637a.m13752d(C2087a.ae);
            C3638b d = c3637a.m13752d(C2087a.af);
            if (!(i == 0 || d == null)) {
                m13720a(i.aQ, d.aQ, a2 != null ? a2.f5934b : null, c2102i);
            }
            sparseArray = c3637a.aR.size();
            for (i = 0; i < sparseArray; i++) {
                d = (C3638b) c3637a.aR.get(i);
                if (d.aP == C2087a.ag) {
                    m13719a(d.aQ, c2102i, bArr);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m13713a(C3637a c3637a, C2085b c2085b, long j, int i) {
        c3637a = c3637a.aR;
        int size = c3637a.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            C3638b c3638b = (C3638b) c3637a.get(i5);
            if (c3638b.aP == C2087a.f5865z) {
                C2302k c2302k = c3638b.aQ;
                c2302k.m8388c(12);
                int u = c2302k.m8409u();
                if (u > 0) {
                    i4 += u;
                    i3++;
                }
            }
        }
        c2085b.f5795g = 0;
        c2085b.f5794f = 0;
        c2085b.f5793e = 0;
        c2085b.f5790b.m7527a(i3, i4);
        i3 = 0;
        int i6 = 0;
        while (i2 < size) {
            C3638b c3638b2 = (C3638b) c3637a.get(i2);
            if (c3638b2.aP == C2087a.f5865z) {
                int i7 = i3 + 1;
                i6 = m13704a(c2085b, i3, j, i, c3638b2.aQ, i6);
                i3 = i7;
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static void m13715a(C2101h c2101h, C2302k c2302k, C2102i c2102i) throws ParserException {
        c2101h = c2101h.f5936d;
        c2302k.m8388c(8);
        boolean z = true;
        if ((C2087a.m7471b(c2302k.m8403o()) & 1) == 1) {
            c2302k.m8390d(8);
        }
        int g = c2302k.m8395g();
        int u = c2302k.m8409u();
        if (u != c2102i.f5943f) {
            c2302k = new StringBuilder();
            c2302k.append("Length mismatch: ");
            c2302k.append(u);
            c2302k.append(", ");
            c2302k.append(c2102i.f5943f);
            throw new ParserException(c2302k.toString());
        }
        int i;
        if (g == 0) {
            boolean[] zArr = c2102i.f5951n;
            i = 0;
            for (int i2 = 0; i2 < u; i2++) {
                int g2 = c2302k.m8395g();
                i += g2;
                zArr[i2] = g2 > c2101h;
            }
        } else {
            if (g <= c2101h) {
                z = false;
            }
            i = (g * u) + 0;
            Arrays.fill(c2102i.f5951n, 0, u, z);
        }
        c2102i.m7526a(i);
    }

    /* renamed from: a */
    private static void m13718a(C2302k c2302k, C2102i c2102i) throws ParserException {
        c2302k.m8388c(8);
        int o = c2302k.m8403o();
        if ((C2087a.m7471b(o) & 1) == 1) {
            c2302k.m8390d(8);
        }
        int u = c2302k.m8409u();
        if (u != 1) {
            c2102i = new StringBuilder();
            c2102i.append("Unexpected saio entry count: ");
            c2102i.append(u);
            throw new ParserException(c2102i.toString());
        }
        c2102i.f5941d += C2087a.m7470a(o) == 0 ? c2302k.m8401m() : c2302k.m8411w();
    }

    /* renamed from: a */
    private static C2085b m13708a(C2302k c2302k, SparseArray<C2085b> sparseArray, int i) {
        c2302k.m8388c(8);
        int b = C2087a.m7471b(c2302k.m8403o());
        int o = c2302k.m8403o();
        if ((i & 8) != 0) {
            o = 0;
        }
        C2085b c2085b = (C2085b) sparseArray.get(o);
        if (c2085b == null) {
            return null;
        }
        if ((b & 1) != 0) {
            long w = c2302k.m8411w();
            c2085b.f5790b.f5940c = w;
            c2085b.f5790b.f5941d = w;
        }
        i = c2085b.f5792d;
        c2085b.f5790b.f5938a = new C2093c((b & 2) != 0 ? c2302k.m8409u() - 1 : i.f5889a, (b & 8) != 0 ? c2302k.m8409u() : i.f5890b, (b & 16) != 0 ? c2302k.m8409u() : i.f5891c, (b & 32) != 0 ? c2302k.m8409u() : i.f5892d);
        return c2085b;
    }

    /* renamed from: d */
    private static long m13734d(C2302k c2302k) {
        c2302k.m8388c(8);
        return C2087a.m7470a(c2302k.m8403o()) == 1 ? c2302k.m8411w() : c2302k.m8401m();
    }

    /* renamed from: a */
    private static int m13704a(C2085b c2085b, int i, long j, int i2, C2302k c2302k, int i3) {
        Object obj;
        int[] iArr;
        long j2;
        C2085b c2085b2 = c2085b;
        c2302k.m8388c(8);
        int b = C2087a.m7471b(c2302k.m8403o());
        Track track = c2085b2.f5791c;
        C2102i c2102i = c2085b2.f5790b;
        C2093c c2093c = c2102i.f5938a;
        c2102i.f5945h[i] = c2302k.m8409u();
        c2102i.f5944g[i] = c2102i.f5940c;
        if ((b & 1) != 0) {
            long[] jArr = c2102i.f5944g;
            jArr[i] = jArr[i] + ((long) c2302k.m8403o());
        }
        Object obj2 = (b & 4) != 0 ? 1 : null;
        int i4 = c2093c.f5892d;
        if (obj2 != null) {
            i4 = c2302k.m8409u();
        }
        Object obj3 = (b & 256) != 0 ? 1 : null;
        Object obj4 = (b & 512) != 0 ? 1 : null;
        Object obj5 = (b & 1024) != 0 ? 1 : null;
        Object obj6 = (b & ItemAnimator.FLAG_MOVED) != 0 ? 1 : null;
        long j3 = 0;
        if (track.f5810h != null && track.f5810h.length == 1 && track.f5810h[0] == 0) {
            j3 = C2314v.m8492d(track.f5811i[0], 1000, track.f5805c);
        }
        int[] iArr2 = c2102i.f5946i;
        int[] iArr3 = c2102i.f5947j;
        long[] jArr2 = c2102i.f5948k;
        int i5 = i4;
        boolean[] zArr = c2102i.f5949l;
        int[] iArr4 = iArr2;
        Object obj7 = (track.f5804b != 2 || (i2 & 1) == 0) ? null : 1;
        i4 = i3 + c2102i.f5945h[i];
        long[] jArr3 = jArr2;
        long j4 = j3;
        long j5 = track.f5805c;
        if (i > 0) {
            obj = obj7;
            iArr = iArr3;
            j2 = c2102i.f5956s;
        } else {
            obj = obj7;
            iArr = iArr3;
            j2 = j;
        }
        int i6 = i3;
        while (i6 < i4) {
            Object obj8;
            int i7;
            Object obj9;
            int u = obj3 != null ? c2302k.m8409u() : c2093c.f5890b;
            int u2 = obj4 != null ? c2302k.m8409u() : c2093c.f5891c;
            if (i6 == 0 && obj2 != null) {
                obj8 = obj2;
                i7 = i5;
            } else if (obj5 != null) {
                i7 = c2302k.m8403o();
                obj8 = obj2;
            } else {
                obj8 = obj2;
                i7 = c2093c.f5892d;
            }
            if (obj6 != null) {
                obj9 = obj6;
                iArr[i6] = (int) ((((long) c2302k.m8403o()) * 1000) / j5);
            } else {
                obj9 = obj6;
                iArr[i6] = 0;
            }
            jArr3[i6] = C2314v.m8492d(j2, 1000, j5) - j4;
            iArr4[i6] = u2;
            boolean z = ((i7 >> 16) & 1) == 0 && (obj == null || i6 == 0);
            zArr[i6] = z;
            i6++;
            j2 += (long) u;
            obj2 = obj8;
            obj6 = obj9;
            C2302k c2302k2 = c2302k;
        }
        c2102i.f5956s = j2;
        return i4;
    }

    /* renamed from: a */
    private static void m13719a(C2302k c2302k, C2102i c2102i, byte[] bArr) throws ParserException {
        c2302k.m8388c(8);
        c2302k.m8384a(bArr, 0, 16);
        if (Arrays.equals(bArr, f11073c) != null) {
            m13717a(c2302k, 16, c2102i);
        }
    }

    /* renamed from: b */
    private static void m13729b(C2302k c2302k, C2102i c2102i) throws ParserException {
        m13717a(c2302k, 0, c2102i);
    }

    /* renamed from: a */
    private static void m13717a(C2302k c2302k, int i, C2102i c2102i) throws ParserException {
        c2302k.m8388c(i + 8);
        i = C2087a.m7471b(c2302k.m8403o());
        if ((i & 1) != 0) {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        i = (i & 2) != 0 ? 1 : 0;
        int u = c2302k.m8409u();
        if (u != c2102i.f5943f) {
            i = new StringBuilder();
            i.append("Length mismatch: ");
            i.append(u);
            i.append(", ");
            i.append(c2102i.f5943f);
            throw new ParserException(i.toString());
        }
        Arrays.fill(c2102i.f5951n, 0, u, i);
        c2102i.m7526a(c2302k.m8385b());
        c2102i.m7529a(c2302k);
    }

    /* renamed from: a */
    private static void m13720a(C2302k c2302k, C2302k c2302k2, String str, C2102i c2102i) throws ParserException {
        c2302k.m8388c(8);
        int o = c2302k.m8403o();
        if (c2302k.m8403o() == f11072b) {
            if (C2087a.m7470a(o) == 1) {
                c2302k.m8390d(4);
            }
            if (c2302k.m8403o() != 1) {
                throw new ParserException("Entry count in sbgp != 1 (unsupported).");
            }
            c2302k2.m8388c(8);
            c2302k = c2302k2.m8403o();
            if (c2302k2.m8403o() == f11072b) {
                c2302k = C2087a.m7470a(c2302k);
                if (c2302k == 1) {
                    if (c2302k2.m8401m() == 0) {
                        throw new ParserException("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c2302k >= 2) {
                    c2302k2.m8390d(4);
                }
                if (c2302k2.m8401m() != 1) {
                    throw new ParserException("Entry count in sgpd != 1 (unsupported).");
                }
                c2302k2.m8390d(1);
                c2302k = c2302k2.m8395g();
                int i = (c2302k & 240) >> 4;
                int i2 = c2302k & 15;
                boolean z = c2302k2.m8395g() == 1;
                if (z) {
                    byte[] bArr;
                    int g = c2302k2.m8395g();
                    byte[] bArr2 = new byte[16];
                    c2302k2.m8384a(bArr2, 0, bArr2.length);
                    if (z && g == 0) {
                        c2302k = c2302k2.m8395g();
                        byte[] bArr3 = new byte[c2302k];
                        c2302k2.m8384a(bArr3, 0, c2302k);
                        bArr = bArr3;
                    } else {
                        bArr = null;
                    }
                    c2102i.f5950m = true;
                    c2102i.f5952o = new C2101h(z, str, g, bArr2, i, i2, bArr);
                }
            }
        }
    }

    /* renamed from: a */
    private static Pair<Long, C3608a> m13705a(C2302k c2302k, long j) throws ParserException {
        long m;
        long m2;
        C2302k c2302k2 = c2302k;
        c2302k2.m8388c(8);
        int a = C2087a.m7470a(c2302k.m8403o());
        c2302k2.m8390d(4);
        long m3 = c2302k.m8401m();
        if (a == 0) {
            m = c2302k.m8401m();
            m2 = j + c2302k.m8401m();
        } else {
            m = c2302k.m8411w();
            m2 = j + c2302k.m8411w();
        }
        long j2 = m;
        long j3 = m2;
        m2 = C2314v.m8492d(j2, 1000000, m3);
        c2302k2.m8390d(2);
        a = c2302k.m8396h();
        int[] iArr = new int[a];
        long[] jArr = new long[a];
        long[] jArr2 = new long[a];
        long[] jArr3 = new long[a];
        long j4 = j2;
        long j5 = m2;
        int i = 0;
        while (i < a) {
            int o = c2302k.m8403o();
            if ((Integer.MIN_VALUE & o) != 0) {
                throw new ParserException("Unhandled indirect reference");
            }
            long m4 = c2302k.m8401m();
            iArr[i] = o & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            jArr[i] = j3;
            jArr3[i] = j5;
            j5 = j4 + m4;
            long[] jArr4 = jArr3;
            long[] jArr5 = jArr;
            long[] jArr6 = jArr2;
            long j6 = m2;
            m = C2314v.m8492d(j5, 1000000, m3);
            jArr6[i] = m - jArr4[i];
            c2302k2.m8390d(4);
            j4 = j3 + ((long) iArr[i]);
            i++;
            jArr2 = jArr6;
            j3 = j4;
            jArr = jArr5;
            m2 = j6;
            j4 = j5;
            j5 = m;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(m2), new C3608a(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: c */
    private void m13732c(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int size = this.f11090i.size();
        C2085b c2085b = null;
        long j = Format.OFFSET_SAMPLE_RELATIVE;
        for (int i = 0; i < size; i++) {
            C2102i c2102i = ((C2085b) this.f11090i.valueAt(i)).f5790b;
            if (c2102i.f5955r && c2102i.f5941d < j) {
                long j2 = c2102i.f5941d;
                c2085b = (C2085b) this.f11090i.valueAt(i);
                j = j2;
            }
        }
        if (c2085b == null) {
            this.f11100s = 3;
            return;
        }
        size = (int) (j - extractorInput.getPosition());
        if (size < 0) {
            throw new ParserException("Offset to encryption data was negative.");
        }
        extractorInput.skipFully(size);
        c2085b.f5790b.m7528a(extractorInput);
    }

    /* renamed from: d */
    private boolean m13735d(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i;
        C2055a c2055a;
        ExtractorInput extractorInput2 = extractorInput;
        int i2 = 4;
        int i3 = 1;
        int i4 = 0;
        if (this.f11100s == 3) {
            if (r0.f11077C == null) {
                C2085b a = m13707a(r0.f11090i);
                if (a == null) {
                    int position = (int) (r0.f11105x - extractorInput.getPosition());
                    if (position < 0) {
                        throw new ParserException("Offset to end of mdat was negative.");
                    }
                    extractorInput2.skipFully(position);
                    m13709a();
                    return false;
                }
                int position2 = (int) (a.f5790b.f5944g[a.f5795g] - extractorInput.getPosition());
                if (position2 < 0) {
                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    position2 = 0;
                }
                extractorInput2.skipFully(position2);
                r0.f11077C = a;
            }
            r0.f11078D = r0.f11077C.f5790b.f5946i[r0.f11077C.f5793e];
            if (r0.f11077C.f5793e < r0.f11077C.f5796h) {
                extractorInput2.skipFully(r0.f11078D);
                r0.f11077C.m7461d();
                if (!r0.f11077C.m7467b()) {
                    r0.f11077C = null;
                }
                r0.f11100s = 3;
                return true;
            }
            if (r0.f11077C.f5791c.f5809g == 1) {
                r0.f11078D -= 8;
                extractorInput2.skipFully(8);
            }
            r0.f11079E = r0.f11077C.m7468c();
            r0.f11078D += r0.f11079E;
            r0.f11100s = 4;
            r0.f11080F = 0;
        }
        C2102i c2102i = r0.f11077C.f5790b;
        Track track = r0.f11077C.f5791c;
        TrackOutput trackOutput = r0.f11077C.f5789a;
        int i5 = r0.f11077C.f5793e;
        if (track.f5812j != 0) {
            byte[] bArr = r0.f11092k.f6929a;
            bArr[0] = (byte) 0;
            bArr[1] = (byte) 0;
            bArr[2] = (byte) 0;
            int i6 = track.f5812j + 1;
            int i7 = 4 - track.f5812j;
            while (r0.f11079E < r0.f11078D) {
                if (r0.f11080F == 0) {
                    extractorInput2.readFully(bArr, i7, i6);
                    r0.f11092k.m8388c(i4);
                    r0.f11080F = r0.f11092k.m8409u() - i3;
                    r0.f11091j.m8388c(i4);
                    trackOutput.sampleData(r0.f11091j, i2);
                    trackOutput.sampleData(r0.f11092k, i3);
                    boolean z = r0.f11084J.length > 0 && C2300i.m8357a(track.f5808f.sampleMimeType, bArr[i2]);
                    r0.f11081G = z;
                    r0.f11079E += 5;
                    r0.f11078D += i7;
                } else {
                    int i8;
                    if (r0.f11081G) {
                        r0.f11093l.m8381a(r0.f11080F);
                        extractorInput2.readFully(r0.f11093l.f6929a, i4, r0.f11080F);
                        trackOutput.sampleData(r0.f11093l, r0.f11080F);
                        i8 = r0.f11080F;
                        int a2 = C2300i.m8351a(r0.f11093l.f6929a, r0.f11093l.m8387c());
                        r0.f11093l.m8388c("video/hevc".equals(track.f5808f.sampleMimeType));
                        r0.f11093l.m8386b(a2);
                        C2223f.m7958a(c2102i.m7530b(i5) * 1000, r0.f11093l, r0.f11084J);
                    } else {
                        i8 = trackOutput.sampleData(extractorInput2, r0.f11080F, false);
                    }
                    r0.f11079E += i8;
                    r0.f11080F -= i8;
                    i2 = 4;
                    i3 = 1;
                    i4 = 0;
                }
            }
        } else {
            while (r0.f11079E < r0.f11078D) {
                r0.f11079E += trackOutput.sampleData(extractorInput2, r0.f11078D - r0.f11079E, false);
            }
        }
        long b = c2102i.m7530b(i5) * 1000;
        if (r0.f11094m != null) {
            b = r0.f11094m.m8443c(b);
        }
        boolean z2 = c2102i.f5949l[i5];
        if (c2102i.f5950m) {
            C2101h c2101h;
            int i9 = z2 | 1073741824;
            if (c2102i.f5952o != null) {
                c2101h = c2102i.f5952o;
            } else {
                c2101h = track.m7469a(c2102i.f5938a.f5889a);
            }
            i = i9;
            c2055a = c2101h.f5935c;
        } else {
            i = z2;
            c2055a = null;
        }
        trackOutput.sampleMetadata(b, i, r0.f11078D, 0, c2055a);
        m13725b(b);
        if (!r0.f11077C.m7467b()) {
            r0.f11077C = null;
        }
        r0.f11100s = 3;
        return true;
    }

    /* renamed from: b */
    private void m13725b(long j) {
        while (!this.f11098q.isEmpty()) {
            C2084a c2084a = (C2084a) this.f11098q.removeFirst();
            this.f11106y -= c2084a.f5788b;
            for (TrackOutput sampleMetadata : this.f11083I) {
                sampleMetadata.sampleMetadata(j + c2084a.f5787a, 1, c2084a.f5788b, this.f11106y, null);
            }
        }
    }

    /* renamed from: a */
    private static C2085b m13707a(SparseArray<C2085b> sparseArray) {
        int size = sparseArray.size();
        C2085b c2085b = null;
        long j = Format.OFFSET_SAMPLE_RELATIVE;
        for (int i = 0; i < size; i++) {
            C2085b c2085b2 = (C2085b) sparseArray.valueAt(i);
            if (c2085b2.f5795g != c2085b2.f5790b.f5942e) {
                long j2 = c2085b2.f5790b.f5944g[c2085b2.f5795g];
                if (j2 < j) {
                    c2085b = c2085b2;
                    j = j2;
                }
            }
        }
        return c2085b;
    }

    /* renamed from: a */
    private static DrmInitData m13706a(List<C3638b> list) {
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            C3638b c3638b = (C3638b) list.get(i);
            if (c3638b.aP == C2087a.f5834U) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                byte[] bArr = c3638b.aQ.f6929a;
                UUID a = C2099f.m7516a(bArr);
                if (a == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    list2.add(new SchemeData(a, "video/mp4", bArr));
                }
            }
        }
        if (list2 == null) {
            return null;
        }
        return new DrmInitData(list2);
    }

    /* renamed from: a */
    private static boolean m13721a(int i) {
        if (!(i == C2087a.f5832S || i == C2087a.f5831R || i == C2087a.f5816C || i == C2087a.f5814A || i == C2087a.f5833T || i == C2087a.f5862w || i == C2087a.f5863x || i == C2087a.f5828O || i == C2087a.f5864y || i == C2087a.f5865z || i == C2087a.f5834U || i == C2087a.ac || i == C2087a.ad || i == C2087a.ah || i == C2087a.ag || i == C2087a.ae || i == C2087a.af || i == C2087a.f5830Q || i == C2087a.f5827N)) {
            if (i != C2087a.aG) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m13730b(int i) {
        if (!(i == C2087a.f5815B || i == C2087a.f5817D || i == C2087a.f5818E || i == C2087a.f5819F || i == C2087a.f5820G || i == C2087a.f5824K || i == C2087a.f5825L || i == C2087a.f5826M)) {
            if (i != C2087a.f5829P) {
                return false;
            }
        }
        return true;
    }
}
