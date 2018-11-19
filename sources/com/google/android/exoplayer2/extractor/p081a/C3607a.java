package com.google.android.exoplayer2.extractor.p081a;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.SeekMap.C3605b;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.C2314v;
import io.fabric.sdk.android.services.events.C15645a;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.a.a */
public final class C3607a implements Extractor {
    /* renamed from: a */
    public static final ExtractorsFactory f10887a = new C36061();
    /* renamed from: b */
    private static final int[] f10888b = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    /* renamed from: c */
    private static final int[] f10889c = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    /* renamed from: d */
    private static final byte[] f10890d = C2314v.m8491c("#!AMR\n");
    /* renamed from: e */
    private static final byte[] f10891e = C2314v.m8491c("#!AMR-WB\n");
    /* renamed from: f */
    private static final int f10892f = f10889c[8];
    /* renamed from: g */
    private final byte[] f10893g = new byte[1];
    /* renamed from: h */
    private boolean f10894h;
    /* renamed from: i */
    private long f10895i;
    /* renamed from: j */
    private int f10896j;
    /* renamed from: k */
    private int f10897k;
    /* renamed from: l */
    private TrackOutput f10898l;
    /* renamed from: m */
    private boolean f10899m;

    /* renamed from: com.google.android.exoplayer2.extractor.a.a$1 */
    static class C36061 implements ExtractorsFactory {
        C36061() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new C3607a()};
        }
    }

    public void release() {
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return m13569a(extractorInput);
    }

    public void init(ExtractorOutput extractorOutput) {
        extractorOutput.seekMap(new C3605b(-9223372036854775807L));
        this.f10898l = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        if (extractorInput.getPosition() == 0 && m13569a(extractorInput) == null) {
            throw new ParserException("Could not find AMR header.");
        }
        m13568a();
        return m13571b(extractorInput);
    }

    public void seek(long j, long j2) {
        this.f10895i = 0;
        this.f10896j = 0;
        this.f10897k = 0;
    }

    /* renamed from: a */
    private boolean m13569a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (m13570a(extractorInput, f10890d)) {
            this.f10894h = false;
            extractorInput.skipFully(f10890d.length);
            return true;
        } else if (!m13570a(extractorInput, f10891e)) {
            return false;
        } else {
            this.f10894h = true;
            extractorInput.skipFully(f10891e.length);
            return true;
        }
    }

    /* renamed from: a */
    private boolean m13570a(ExtractorInput extractorInput, byte[] bArr) throws IOException, InterruptedException {
        extractorInput.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        extractorInput.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: a */
    private void m13568a() {
        if (!this.f10899m) {
            this.f10899m = true;
            this.f10898l.format(Format.createAudioSampleFormat(null, this.f10894h ? "audio/amr-wb" : "audio/3gpp", null, -1, f10892f, 1, this.f10894h ? 16000 : C15645a.MAX_BYTE_SIZE_PER_FILE, -1, null, null, 0, null));
        }
    }

    /* renamed from: b */
    private int m13571b(com.google.android.exoplayer2.extractor.ExtractorInput r9) throws java.io.IOException, java.lang.InterruptedException {
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
        r8 = this;
        r0 = r8.f10897k;
        r1 = -1;
        if (r0 != 0) goto L_0x0011;
    L_0x0005:
        r0 = r8.m13573c(r9);	 Catch:{ EOFException -> 0x0010 }
        r8.f10896j = r0;	 Catch:{ EOFException -> 0x0010 }
        r0 = r8.f10896j;
        r8.f10897k = r0;
        goto L_0x0011;
    L_0x0010:
        return r1;
    L_0x0011:
        r0 = r8.f10898l;
        r2 = r8.f10897k;
        r3 = 1;
        r9 = r0.sampleData(r9, r2, r3);
        if (r9 != r1) goto L_0x001d;
    L_0x001c:
        return r1;
    L_0x001d:
        r0 = r8.f10897k;
        r0 = r0 - r9;
        r8.f10897k = r0;
        r9 = r8.f10897k;
        r0 = 0;
        if (r9 <= 0) goto L_0x0028;
    L_0x0027:
        return r0;
    L_0x0028:
        r1 = r8.f10898l;
        r2 = r8.f10895i;
        r4 = 1;
        r5 = r8.f10896j;
        r6 = 0;
        r7 = 0;
        r1.sampleMetadata(r2, r4, r5, r6, r7);
        r1 = r8.f10895i;
        r3 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r5 = r1 + r3;
        r8.f10895i = r5;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.a.a.b(com.google.android.exoplayer2.extractor.ExtractorInput):int");
    }

    /* renamed from: c */
    private int m13573c(ExtractorInput extractorInput) throws IOException, InterruptedException {
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.f10893g, 0, 1);
        extractorInput = this.f10893g[0];
        if ((extractorInput & 131) <= 0) {
            return m13567a((extractorInput >> 3) & 15);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid padding bits for frame header ");
        stringBuilder.append(extractorInput);
        throw new ParserException(stringBuilder.toString());
    }

    /* renamed from: a */
    private int m13567a(int i) throws ParserException {
        if (m13572b(i)) {
            return this.f10894h ? f10889c[i] : f10888b[i];
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal AMR ");
            stringBuilder.append(this.f10894h ? "WB" : "NB");
            stringBuilder.append(" frame type ");
            stringBuilder.append(i);
            throw new ParserException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private boolean m13572b(int i) {
        return i >= 0 && i <= 15 && (m13574c(i) || m13575d(i) != 0);
    }

    /* renamed from: c */
    private boolean m13574c(int i) {
        return this.f10894h && (i < 10 || i > 13);
    }

    /* renamed from: d */
    private boolean m13575d(int i) {
        return !this.f10894h && (i < 12 || i > 14);
    }
}
