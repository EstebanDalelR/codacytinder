package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.C2072e;
import com.google.android.exoplayer2.extractor.C2073f;
import com.google.android.exoplayer2.extractor.C2074g;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Mp3Extractor implements Extractor {
    /* renamed from: a */
    public static final ExtractorsFactory f11053a = new C36331();
    /* renamed from: b */
    private static final int f11054b = C2314v.m8499g("Xing");
    /* renamed from: c */
    private static final int f11055c = C2314v.m8499g("Info");
    /* renamed from: d */
    private static final int f11056d = C2314v.m8499g("VBRI");
    /* renamed from: e */
    private final int f11057e;
    /* renamed from: f */
    private final long f11058f;
    /* renamed from: g */
    private final C2302k f11059g;
    /* renamed from: h */
    private final C2074g f11060h;
    /* renamed from: i */
    private final C2072e f11061i;
    /* renamed from: j */
    private final C2073f f11062j;
    /* renamed from: k */
    private ExtractorOutput f11063k;
    /* renamed from: l */
    private TrackOutput f11064l;
    /* renamed from: m */
    private int f11065m;
    /* renamed from: n */
    private Metadata f11066n;
    /* renamed from: o */
    private C3634a f11067o;
    /* renamed from: p */
    private long f11068p;
    /* renamed from: q */
    private long f11069q;
    /* renamed from: r */
    private int f11070r;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp3.Mp3Extractor$1 */
    static class C36331 implements ExtractorsFactory {
        C36331() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new Mp3Extractor()};
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp3.Mp3Extractor$a */
    interface C3634a extends SeekMap {
        /* renamed from: a */
        long mo3477a(long j);
    }

    /* renamed from: a */
    private static boolean m13700a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    public void release() {
    }

    public Mp3Extractor() {
        this(0);
    }

    public Mp3Extractor(int i) {
        this(i, -9223372036854775807L);
    }

    public Mp3Extractor(int i, long j) {
        this.f11057e = i;
        this.f11058f = j;
        this.f11059g = new C2302k((int) 10);
        this.f11060h = new C2074g();
        this.f11061i = new C2072e();
        this.f11068p = 1;
        this.f11062j = new C2073f();
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return m13701a(extractorInput, true);
    }

    public void init(ExtractorOutput extractorOutput) {
        this.f11063k = extractorOutput;
        this.f11064l = this.f11063k.track(0, 1);
        this.f11063k.endTracks();
    }

    public void seek(long j, long j2) {
        this.f11065m = 0;
        this.f11068p = -9223372036854775807L;
        this.f11069q = 0;
        this.f11070r = 0;
    }

    public int read(com.google.android.exoplayer2.extractor.ExtractorInput r20, com.google.android.exoplayer2.extractor.C2075h r21) throws java.io.IOException, java.lang.InterruptedException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r19 = this;
        r0 = r19;
        r1 = r0.f11065m;
        if (r1 != 0) goto L_0x000f;
    L_0x0006:
        r1 = 0;
        r2 = r20;
        r0.m13701a(r2, r1);	 Catch:{ EOFException -> 0x000d }
        goto L_0x0011;
    L_0x000d:
        r1 = -1;
        return r1;
    L_0x000f:
        r2 = r20;
    L_0x0011:
        r1 = r0.f11067o;
        if (r1 != 0) goto L_0x006f;
    L_0x0015:
        r1 = r19.m13702b(r20);
        r0.f11067o = r1;
        r1 = r0.f11067o;
        if (r1 == 0) goto L_0x002d;
    L_0x001f:
        r1 = r0.f11067o;
        r1 = r1.isSeekable();
        if (r1 != 0) goto L_0x0033;
    L_0x0027:
        r1 = r0.f11057e;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x0033;
    L_0x002d:
        r1 = r19.m13703c(r20);
        r0.f11067o = r1;
    L_0x0033:
        r1 = r0.f11063k;
        r3 = r0.f11067o;
        r1.seekMap(r3);
        r1 = r0.f11064l;
        r3 = 0;
        r4 = r0.f11060h;
        r4 = r4.f5720b;
        r5 = 0;
        r6 = -1;
        r7 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r8 = r0.f11060h;
        r8 = r8.f5723e;
        r9 = r0.f11060h;
        r9 = r9.f5722d;
        r10 = -1;
        r11 = r0.f11061i;
        r11 = r11.f5708b;
        r12 = r0.f11061i;
        r12 = r12.f5709c;
        r13 = 0;
        r14 = 0;
        r16 = 0;
        r15 = r0.f11057e;
        r15 = r15 & 2;
        if (r15 == 0) goto L_0x0064;
    L_0x0060:
        r15 = 0;
    L_0x0061:
        r17 = r15;
        goto L_0x0067;
    L_0x0064:
        r15 = r0.f11066n;
        goto L_0x0061;
    L_0x0067:
        r15 = 0;
        r3 = com.google.android.exoplayer2.Format.createAudioSampleFormat(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
        r1.format(r3);
    L_0x006f:
        r1 = r19.m13698a(r20);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.read(com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.extractor.h):int");
    }

    /* renamed from: a */
    private int m13698a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (this.f11070r == 0) {
            extractorInput.resetPeekPosition();
            if (!extractorInput.peekFully(this.f11059g.f6929a, 0, 4, true)) {
                return -1;
            }
            this.f11059g.m8388c(0);
            int o = this.f11059g.m8403o();
            if (m13700a(o, (long) this.f11065m)) {
                if (C2074g.m7425a(o) != -1) {
                    C2074g.m7427a(o, this.f11060h);
                    if (this.f11068p == -9223372036854775807L) {
                        this.f11068p = this.f11067o.mo3477a(extractorInput.getPosition());
                        if (this.f11058f != -9223372036854775807L) {
                            this.f11068p += this.f11058f - this.f11067o.mo3477a(0);
                        }
                    }
                    this.f11070r = this.f11060h.f5721c;
                }
            }
            extractorInput.skipFully(1);
            this.f11065m = 0;
            return 0;
        }
        extractorInput = this.f11064l.sampleData(extractorInput, this.f11070r, true);
        if (extractorInput == -1) {
            return -1;
        }
        this.f11070r -= extractorInput;
        if (this.f11070r > null) {
            return 0;
        }
        this.f11064l.sampleMetadata(this.f11068p + ((this.f11069q * 1000000) / ((long) this.f11060h.f5722d)), 1, this.f11060h.f5721c, 0, null);
        this.f11069q += (long) this.f11060h.f5725g;
        this.f11070r = 0;
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private boolean m13701a(com.google.android.exoplayer2.extractor.ExtractorInput r13, boolean r14) throws java.io.IOException, java.lang.InterruptedException {
        /*
        r12 = this;
        if (r14 == 0) goto L_0x0005;
    L_0x0002:
        r0 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        goto L_0x0007;
    L_0x0005:
        r0 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
    L_0x0007:
        r13.resetPeekPosition();
        r1 = r13.getPosition();
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        r1 = 1;
        r2 = 0;
        if (r5 != 0) goto L_0x0047;
    L_0x0016:
        r3 = r12.f11057e;
        r3 = r3 & 2;
        if (r3 == 0) goto L_0x001e;
    L_0x001c:
        r3 = 1;
        goto L_0x001f;
    L_0x001e:
        r3 = 0;
    L_0x001f:
        if (r3 == 0) goto L_0x0024;
    L_0x0021:
        r3 = com.google.android.exoplayer2.extractor.C2072e.f5706a;
        goto L_0x0025;
    L_0x0024:
        r3 = 0;
    L_0x0025:
        r4 = r12.f11062j;
        r3 = r4.m7421a(r13, r3);
        r12.f11066n = r3;
        r3 = r12.f11066n;
        if (r3 == 0) goto L_0x0038;
    L_0x0031:
        r3 = r12.f11061i;
        r4 = r12.f11066n;
        r3.m7420a(r4);
    L_0x0038:
        r3 = r13.getPeekPosition();
        r3 = (int) r3;
        if (r14 != 0) goto L_0x0042;
    L_0x003f:
        r13.skipFully(r3);
    L_0x0042:
        r6 = r3;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        goto L_0x004b;
    L_0x0047:
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
    L_0x004b:
        r7 = r12.f11059g;
        r7 = r7.f6929a;
        if (r3 <= 0) goto L_0x0053;
    L_0x0051:
        r8 = 1;
        goto L_0x0054;
    L_0x0053:
        r8 = 0;
    L_0x0054:
        r9 = 4;
        r7 = r13.peekFully(r7, r2, r9, r8);
        if (r7 != 0) goto L_0x005c;
    L_0x005b:
        goto L_0x00a5;
    L_0x005c:
        r7 = r12.f11059g;
        r7.m8388c(r2);
        r7 = r12.f11059g;
        r7 = r7.m8403o();
        if (r4 == 0) goto L_0x0070;
    L_0x0069:
        r10 = (long) r4;
        r8 = m13700a(r7, r10);
        if (r8 == 0) goto L_0x0077;
    L_0x0070:
        r8 = com.google.android.exoplayer2.extractor.C2074g.m7425a(r7);
        r10 = -1;
        if (r8 != r10) goto L_0x0098;
    L_0x0077:
        r3 = r5 + 1;
        if (r5 != r0) goto L_0x0086;
    L_0x007b:
        if (r14 != 0) goto L_0x0085;
    L_0x007d:
        r13 = new com.google.android.exoplayer2.ParserException;
        r14 = "Searched too many bytes.";
        r13.<init>(r14);
        throw r13;
    L_0x0085:
        return r2;
    L_0x0086:
        if (r14 == 0) goto L_0x0091;
    L_0x0088:
        r13.resetPeekPosition();
        r4 = r6 + r3;
        r13.advancePeekPosition(r4);
        goto L_0x0094;
    L_0x0091:
        r13.skipFully(r1);
    L_0x0094:
        r5 = r3;
        r3 = 0;
        r4 = 0;
        goto L_0x004b;
    L_0x0098:
        r3 = r3 + 1;
        if (r3 != r1) goto L_0x00a3;
    L_0x009c:
        r4 = r12.f11060h;
        com.google.android.exoplayer2.extractor.C2074g.m7427a(r7, r4);
        r4 = r7;
        goto L_0x00b2;
    L_0x00a3:
        if (r3 != r9) goto L_0x00b2;
    L_0x00a5:
        if (r14 == 0) goto L_0x00ac;
    L_0x00a7:
        r6 = r6 + r5;
        r13.skipFully(r6);
        goto L_0x00af;
    L_0x00ac:
        r13.resetPeekPosition();
    L_0x00af:
        r12.f11065m = r4;
        return r1;
    L_0x00b2:
        r8 = r8 + -4;
        r13.advancePeekPosition(r8);
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.a(com.google.android.exoplayer2.extractor.ExtractorInput, boolean):boolean");
    }

    /* renamed from: b */
    private C3634a m13702b(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i;
        int a;
        C3634a a2;
        C2302k c2302k = new C2302k(this.f11060h.f5721c);
        extractorInput.peekFully(c2302k.f6929a, 0, this.f11060h.f5721c);
        if ((this.f11060h.f5719a & 1) != 0) {
            if (this.f11060h.f5723e != 1) {
                i = 36;
                a = m13699a(c2302k, i);
                if (a != f11054b) {
                    if (a == f11055c) {
                        if (a == f11056d) {
                            a2 = C4239b.m16851a(extractorInput.getLength(), extractorInput.getPosition(), this.f11060h, c2302k);
                            extractorInput.skipFully(this.f11060h.f5721c);
                        } else {
                            a2 = null;
                            extractorInput.resetPeekPosition();
                        }
                        return a2;
                    }
                }
                a2 = C4240c.m16854a(extractorInput.getLength(), extractorInput.getPosition(), this.f11060h, c2302k);
                if (!(a2 == null || this.f11061i.m7418a())) {
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(i + 141);
                    extractorInput.peekFully(this.f11059g.f6929a, 0, 3);
                    this.f11059g.m8388c(0);
                    this.f11061i.m7419a(this.f11059g.m8399k());
                }
                extractorInput.skipFully(this.f11060h.f5721c);
                if (!(a2 == null || a2.isSeekable() || a != f11055c)) {
                    return m13703c(extractorInput);
                }
                return a2;
            }
        } else if (this.f11060h.f5723e == 1) {
            i = 13;
            a = m13699a(c2302k, i);
            if (a != f11054b) {
                if (a == f11055c) {
                    if (a == f11056d) {
                        a2 = null;
                        extractorInput.resetPeekPosition();
                    } else {
                        a2 = C4239b.m16851a(extractorInput.getLength(), extractorInput.getPosition(), this.f11060h, c2302k);
                        extractorInput.skipFully(this.f11060h.f5721c);
                    }
                    return a2;
                }
            }
            a2 = C4240c.m16854a(extractorInput.getLength(), extractorInput.getPosition(), this.f11060h, c2302k);
            extractorInput.resetPeekPosition();
            extractorInput.advancePeekPosition(i + 141);
            extractorInput.peekFully(this.f11059g.f6929a, 0, 3);
            this.f11059g.m8388c(0);
            this.f11061i.m7419a(this.f11059g.m8399k());
            extractorInput.skipFully(this.f11060h.f5721c);
            return m13703c(extractorInput);
        }
        i = 21;
        a = m13699a(c2302k, i);
        if (a != f11054b) {
            if (a == f11055c) {
                if (a == f11056d) {
                    a2 = C4239b.m16851a(extractorInput.getLength(), extractorInput.getPosition(), this.f11060h, c2302k);
                    extractorInput.skipFully(this.f11060h.f5721c);
                } else {
                    a2 = null;
                    extractorInput.resetPeekPosition();
                }
                return a2;
            }
        }
        a2 = C4240c.m16854a(extractorInput.getLength(), extractorInput.getPosition(), this.f11060h, c2302k);
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i + 141);
        extractorInput.peekFully(this.f11059g.f6929a, 0, 3);
        this.f11059g.m8388c(0);
        this.f11061i.m7419a(this.f11059g.m8399k());
        extractorInput.skipFully(this.f11060h.f5721c);
        return m13703c(extractorInput);
    }

    /* renamed from: c */
    private C3634a m13703c(ExtractorInput extractorInput) throws IOException, InterruptedException {
        extractorInput.peekFully(this.f11059g.f6929a, 0, 4);
        this.f11059g.m8388c(0);
        C2074g.m7427a(this.f11059g.m8403o(), this.f11060h);
        return new C4238a(extractorInput.getLength(), extractorInput.getPosition(), this.f11060h);
    }

    /* renamed from: a */
    private static int m13699a(C2302k c2302k, int i) {
        if (c2302k.m8387c() >= i + 4) {
            c2302k.m8388c(i);
            i = c2302k.m8403o();
            if (i == f11054b || i == f11055c) {
                return i;
            }
        }
        if (c2302k.m8387c() >= 40) {
            c2302k.m8388c(36);
            if (c2302k.m8403o() == f11056d) {
                return f11056d;
            }
        }
        return null;
    }
}
