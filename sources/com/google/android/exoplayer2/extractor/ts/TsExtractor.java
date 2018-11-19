package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.SeekMap.C3605b;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2104a;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2105b;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2301j;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class TsExtractor implements Extractor {
    /* renamed from: a */
    public static final ExtractorsFactory f11146a = new C36411();
    /* renamed from: b */
    private static final long f11147b = ((long) C2314v.m8499g("AC-3"));
    /* renamed from: c */
    private static final long f11148c = ((long) C2314v.m8499g("EAC3"));
    /* renamed from: d */
    private static final long f11149d = ((long) C2314v.m8499g("HEVC"));
    /* renamed from: e */
    private final int f11150e;
    /* renamed from: f */
    private final List<C2310s> f11151f;
    /* renamed from: g */
    private final C2302k f11152g;
    /* renamed from: h */
    private final SparseIntArray f11153h;
    /* renamed from: i */
    private final Factory f11154i;
    /* renamed from: j */
    private final SparseArray<TsPayloadReader> f11155j;
    /* renamed from: k */
    private final SparseBooleanArray f11156k;
    /* renamed from: l */
    private ExtractorOutput f11157l;
    /* renamed from: m */
    private int f11158m;
    /* renamed from: n */
    private boolean f11159n;
    /* renamed from: o */
    private TsPayloadReader f11160o;
    /* renamed from: p */
    private int f11161p;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsExtractor$1 */
    static class C36411 implements ExtractorsFactory {
        C36411() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new TsExtractor()};
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsExtractor$a */
    private class C3642a implements SectionPayloadReader {
        /* renamed from: a */
        final /* synthetic */ TsExtractor f11139a;
        /* renamed from: b */
        private final C2301j f11140b = new C2301j(new byte[4]);

        public void init(C2310s c2310s, ExtractorOutput extractorOutput, C2106c c2106c) {
        }

        public C3642a(TsExtractor tsExtractor) {
            this.f11139a = tsExtractor;
        }

        public void consume(C2302k c2302k) {
            if (c2302k.m8395g() == 0) {
                c2302k.m8390d(7);
                int b = c2302k.m8385b() / 4;
                for (int i = 0; i < b; i++) {
                    c2302k.m8382a(this.f11140b, 4);
                    int c = this.f11140b.m8373c(16);
                    this.f11140b.m8370b(3);
                    if (c == 0) {
                        this.f11140b.m8370b(13);
                    } else {
                        c = this.f11140b.m8373c(13);
                        this.f11139a.f11155j.put(c, new C3661p(new C3643b(this.f11139a, c)));
                        this.f11139a.f11158m = this.f11139a.f11158m + 1;
                    }
                }
                if (this.f11139a.f11150e != 2) {
                    this.f11139a.f11155j.remove(0);
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsExtractor$b */
    private class C3643b implements SectionPayloadReader {
        /* renamed from: a */
        final /* synthetic */ TsExtractor f11141a;
        /* renamed from: b */
        private final C2301j f11142b = new C2301j(new byte[5]);
        /* renamed from: c */
        private final SparseArray<TsPayloadReader> f11143c = new SparseArray();
        /* renamed from: d */
        private final SparseIntArray f11144d = new SparseIntArray();
        /* renamed from: e */
        private final int f11145e;

        public void init(C2310s c2310s, ExtractorOutput extractorOutput, C2106c c2106c) {
        }

        public C3643b(TsExtractor tsExtractor, int i) {
            this.f11141a = tsExtractor;
            this.f11145e = i;
        }

        public void consume(C2302k c2302k) {
            C3643b c3643b = this;
            C2302k c2302k2 = c2302k;
            if (c2302k.m8395g() == 2) {
                C2310s c2310s;
                int h;
                int i;
                int i2;
                int b;
                int c;
                int c2;
                int c3;
                C2105b a;
                Object createPayloadReader;
                int size;
                TsPayloadReader tsPayloadReader;
                TsExtractor tsExtractor;
                int i3 = 0;
                if (!(c3643b.f11141a.f11150e == 1 || c3643b.f11141a.f11150e == 2)) {
                    if (c3643b.f11141a.f11158m != 1) {
                        c2310s = new C2310s(((C2310s) c3643b.f11141a.f11151f.get(0)).m8438a());
                        c3643b.f11141a.f11151f.add(c2310s);
                        c2302k2.m8390d(2);
                        h = c2302k.m8396h();
                        i = 5;
                        c2302k2.m8390d(5);
                        c2302k2.m8382a(c3643b.f11142b, 2);
                        i2 = 4;
                        c3643b.f11142b.m8370b(4);
                        c2302k2.m8390d(c3643b.f11142b.m8373c(12));
                        if (c3643b.f11141a.f11150e == 2 && c3643b.f11141a.f11160o == null) {
                            c3643b.f11141a.f11160o = c3643b.f11141a.f11154i.createPayloadReader(21, new C2105b(21, null, null, new byte[0]));
                            c3643b.f11141a.f11160o.init(c2310s, c3643b.f11141a.f11157l, new C2106c(h, 21, 8192));
                        }
                        c3643b.f11143c.clear();
                        c3643b.f11144d.clear();
                        b = c2302k.m8385b();
                        while (b > 0) {
                            c2302k2.m8382a(c3643b.f11142b, i);
                            c = c3643b.f11142b.m8373c(8);
                            c3643b.f11142b.m8370b(3);
                            c2 = c3643b.f11142b.m8373c(13);
                            c3643b.f11142b.m8370b(i2);
                            c3 = c3643b.f11142b.m8373c(12);
                            a = m13762a(c2302k2, c3);
                            if (c == 6) {
                                c = a.f5967a;
                            }
                            b -= c3 + 5;
                            i2 = c3643b.f11141a.f11150e != 2 ? c : c2;
                            if (c3643b.f11141a.f11156k.get(i2)) {
                                if (c3643b.f11141a.f11150e == 2 || c != 21) {
                                    createPayloadReader = c3643b.f11141a.f11154i.createPayloadReader(c, a);
                                } else {
                                    createPayloadReader = c3643b.f11141a.f11160o;
                                }
                                if (c3643b.f11141a.f11150e == 2 || c2 < c3643b.f11144d.get(i2, 8192)) {
                                    c3643b.f11144d.put(i2, c2);
                                    c3643b.f11143c.put(i2, createPayloadReader);
                                }
                            }
                            i = 5;
                            i2 = 4;
                        }
                        size = c3643b.f11144d.size();
                        for (i = 0; i < size; i++) {
                            b = c3643b.f11144d.keyAt(i);
                            c3643b.f11141a.f11156k.put(b, true);
                            tsPayloadReader = (TsPayloadReader) c3643b.f11143c.valueAt(i);
                            if (tsPayloadReader == null) {
                                if (tsPayloadReader != c3643b.f11141a.f11160o) {
                                    tsPayloadReader.init(c2310s, c3643b.f11141a.f11157l, new C2106c(h, b, 8192));
                                }
                                c3643b.f11141a.f11155j.put(c3643b.f11144d.valueAt(i), tsPayloadReader);
                            }
                        }
                        if (c3643b.f11141a.f11150e == 2) {
                            c3643b.f11141a.f11155j.remove(c3643b.f11145e);
                            tsExtractor = c3643b.f11141a;
                            if (c3643b.f11141a.f11150e == 1) {
                                i3 = c3643b.f11141a.f11158m - 1;
                            }
                            tsExtractor.f11158m = i3;
                            if (c3643b.f11141a.f11158m == 0) {
                                c3643b.f11141a.f11157l.endTracks();
                                c3643b.f11141a.f11159n = true;
                            }
                        } else if (!c3643b.f11141a.f11159n) {
                            c3643b.f11141a.f11157l.endTracks();
                            c3643b.f11141a.f11158m = 0;
                            c3643b.f11141a.f11159n = true;
                        }
                    }
                }
                c2310s = (C2310s) c3643b.f11141a.f11151f.get(0);
                c2302k2.m8390d(2);
                h = c2302k.m8396h();
                i = 5;
                c2302k2.m8390d(5);
                c2302k2.m8382a(c3643b.f11142b, 2);
                i2 = 4;
                c3643b.f11142b.m8370b(4);
                c2302k2.m8390d(c3643b.f11142b.m8373c(12));
                c3643b.f11141a.f11160o = c3643b.f11141a.f11154i.createPayloadReader(21, new C2105b(21, null, null, new byte[0]));
                c3643b.f11141a.f11160o.init(c2310s, c3643b.f11141a.f11157l, new C2106c(h, 21, 8192));
                c3643b.f11143c.clear();
                c3643b.f11144d.clear();
                b = c2302k.m8385b();
                while (b > 0) {
                    c2302k2.m8382a(c3643b.f11142b, i);
                    c = c3643b.f11142b.m8373c(8);
                    c3643b.f11142b.m8370b(3);
                    c2 = c3643b.f11142b.m8373c(13);
                    c3643b.f11142b.m8370b(i2);
                    c3 = c3643b.f11142b.m8373c(12);
                    a = m13762a(c2302k2, c3);
                    if (c == 6) {
                        c = a.f5967a;
                    }
                    b -= c3 + 5;
                    if (c3643b.f11141a.f11150e != 2) {
                    }
                    if (c3643b.f11141a.f11156k.get(i2)) {
                        if (c3643b.f11141a.f11150e == 2) {
                        }
                        createPayloadReader = c3643b.f11141a.f11154i.createPayloadReader(c, a);
                        if (c3643b.f11141a.f11150e == 2) {
                        }
                        c3643b.f11144d.put(i2, c2);
                        c3643b.f11143c.put(i2, createPayloadReader);
                    }
                    i = 5;
                    i2 = 4;
                }
                size = c3643b.f11144d.size();
                for (i = 0; i < size; i++) {
                    b = c3643b.f11144d.keyAt(i);
                    c3643b.f11141a.f11156k.put(b, true);
                    tsPayloadReader = (TsPayloadReader) c3643b.f11143c.valueAt(i);
                    if (tsPayloadReader == null) {
                        if (tsPayloadReader != c3643b.f11141a.f11160o) {
                            tsPayloadReader.init(c2310s, c3643b.f11141a.f11157l, new C2106c(h, b, 8192));
                        }
                        c3643b.f11141a.f11155j.put(c3643b.f11144d.valueAt(i), tsPayloadReader);
                    }
                }
                if (c3643b.f11141a.f11150e == 2) {
                    c3643b.f11141a.f11155j.remove(c3643b.f11145e);
                    tsExtractor = c3643b.f11141a;
                    if (c3643b.f11141a.f11150e == 1) {
                        i3 = c3643b.f11141a.f11158m - 1;
                    }
                    tsExtractor.f11158m = i3;
                    if (c3643b.f11141a.f11158m == 0) {
                        c3643b.f11141a.f11157l.endTracks();
                        c3643b.f11141a.f11159n = true;
                    }
                } else if (c3643b.f11141a.f11159n) {
                    c3643b.f11141a.f11157l.endTracks();
                    c3643b.f11141a.f11158m = 0;
                    c3643b.f11141a.f11159n = true;
                }
            }
        }

        /* renamed from: a */
        private C2105b m13762a(C2302k c2302k, int i) {
            int d = c2302k.m8389d();
            i += d;
            String str = null;
            int i2 = -1;
            List list = null;
            while (c2302k.m8389d() < i) {
                int g = c2302k.m8395g();
                int d2 = c2302k.m8389d() + c2302k.m8395g();
                if (g == 5) {
                    long m = c2302k.m8401m();
                    if (m != TsExtractor.f11147b) {
                        if (m == TsExtractor.f11148c) {
                            i2 = 135;
                            c2302k.m8390d(d2 - c2302k.m8389d());
                        } else {
                            if (m == TsExtractor.f11149d) {
                                i2 = 36;
                            }
                            c2302k.m8390d(d2 - c2302k.m8389d());
                        }
                    }
                } else if (g != 106) {
                    if (g != 122) {
                        if (g == 123) {
                            i2 = 138;
                        } else if (g == 10) {
                            str = c2302k.m8392e(3).trim();
                        } else if (g == 89) {
                            List arrayList = new ArrayList();
                            while (c2302k.m8389d() < d2) {
                                String trim = c2302k.m8392e(3).trim();
                                g = c2302k.m8395g();
                                byte[] bArr = new byte[4];
                                c2302k.m8384a(bArr, 0, 4);
                                arrayList.add(new C2104a(trim, g, bArr));
                            }
                            list = arrayList;
                            i2 = 89;
                        }
                        c2302k.m8390d(d2 - c2302k.m8389d());
                    }
                    i2 = 135;
                    c2302k.m8390d(d2 - c2302k.m8389d());
                }
                i2 = 129;
                c2302k.m8390d(d2 - c2302k.m8389d());
            }
            c2302k.m8388c(i);
            return new C2105b(i2, str, list, Arrays.copyOfRange(c2302k.f6929a, d, i));
        }
    }

    public void release() {
    }

    public TsExtractor() {
        this(0);
    }

    public TsExtractor(int i) {
        this(1, i);
    }

    public TsExtractor(int i, int i2) {
        this(i, new C2310s(0), new DefaultTsPayloadReaderFactory(i2));
    }

    public TsExtractor(int i, C2310s c2310s, Factory factory) {
        this.f11154i = (Factory) C2289a.m8309a((Object) factory);
        this.f11150e = i;
        if (i != 1) {
            if (i != 2) {
                this.f11151f = new ArrayList();
                this.f11151f.add(c2310s);
                this.f11152g = new C2302k(new byte[9400], null);
                this.f11156k = new SparseBooleanArray();
                this.f11155j = new SparseArray();
                this.f11153h = new SparseIntArray();
                m13773d();
            }
        }
        this.f11151f = Collections.singletonList(c2310s);
        this.f11152g = new C2302k(new byte[9400], null);
        this.f11156k = new SparseBooleanArray();
        this.f11155j = new SparseArray();
        this.f11153h = new SparseIntArray();
        m13773d();
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        byte[] bArr = this.f11152g.f6929a;
        extractorInput.peekFully(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 != 5) {
                if (bArr[(i2 * 188) + i] != (byte) 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            extractorInput.skipFully(i);
            return true;
        }
        return false;
    }

    public void init(ExtractorOutput extractorOutput) {
        this.f11157l = extractorOutput;
        extractorOutput.seekMap(new C3605b(-9223372036854775807L));
    }

    public void seek(long j, long j2) {
        j = this.f11151f.size();
        for (j2 = null; j2 < j; j2++) {
            ((C2310s) this.f11151f.get(j2)).m8444d();
        }
        this.f11152g.m8380a();
        this.f11153h.clear();
        m13773d();
        this.f11161p = 0;
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        int b;
        byte[] bArr = this.f11152g.f6929a;
        if (9400 - this.f11152g.m8389d() < 188) {
            b = this.f11152g.m8385b();
            if (b > 0) {
                System.arraycopy(bArr, this.f11152g.m8389d(), bArr, 0, b);
            }
            this.f11152g.m8383a(bArr, b);
        }
        while (this.f11152g.m8385b() < 188) {
            b = this.f11152g.m8387c();
            int read = extractorInput.read(bArr, b, 9400 - b);
            if (read == -1) {
                return -1;
            }
            this.f11152g.m8386b(b + read);
        }
        C2075h c = this.f11152g.m8387c();
        b = this.f11152g.m8389d();
        int i = b;
        while (i < c && bArr[i] != (byte) 71) {
            i++;
        }
        this.f11152g.m8388c(i);
        c2075h = i + 188;
        if (c2075h > c) {
            this.f11161p += i - b;
            if (this.f11150e != 2 || this.f11161p <= 376) {
                return 0;
            }
            throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
        }
        this.f11161p = 0;
        b = this.f11152g.m8403o();
        if ((8388608 & b) != 0) {
            this.f11152g.m8388c(c2075h);
            return 0;
        }
        boolean z = (4194304 & b) != 0;
        int i2 = (2096896 & b) >> 8;
        Object obj = (b & 32) != 0 ? 1 : null;
        TsPayloadReader tsPayloadReader = ((b & 16) != 0 ? 1 : null) != null ? (TsPayloadReader) this.f11155j.get(i2) : null;
        if (tsPayloadReader == null) {
            this.f11152g.m8388c(c2075h);
            return 0;
        }
        if (this.f11150e != 2) {
            b &= 15;
            read = this.f11153h.get(i2, b - 1);
            this.f11153h.put(i2, b);
            if (read == b) {
                this.f11152g.m8388c(c2075h);
                return 0;
            } else if (b != ((read + 1) & 15)) {
                tsPayloadReader.seek();
            }
        }
        if (obj != null) {
            this.f11152g.m8390d(this.f11152g.m8395g());
        }
        this.f11152g.m8386b(c2075h);
        tsPayloadReader.consume(this.f11152g, z);
        this.f11152g.m8386b(c);
        this.f11152g.m8388c(c2075h);
        return 0;
    }

    /* renamed from: d */
    private void m13773d() {
        this.f11156k.clear();
        this.f11155j.clear();
        SparseArray createInitialPayloadReaders = this.f11154i.createInitialPayloadReaders();
        int size = createInitialPayloadReaders.size();
        for (int i = 0; i < size; i++) {
            this.f11155j.put(createInitialPayloadReaders.keyAt(i), createInitialPayloadReaders.valueAt(i));
        }
        this.f11155j.put(0, new C3661p(new C3642a(this)));
        this.f11160o = null;
    }
}
