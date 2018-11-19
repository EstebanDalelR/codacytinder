package com.google.android.exoplayer2.extractor.p061b;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.C2302k;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.b.c */
public class C3614c implements Extractor {
    /* renamed from: a */
    public static final ExtractorsFactory f10926a = new C36131();
    /* renamed from: b */
    private ExtractorOutput f10927b;
    /* renamed from: c */
    private C2062h f10928c;
    /* renamed from: d */
    private boolean f10929d;

    /* renamed from: com.google.android.exoplayer2.extractor.b.c$1 */
    static class C36131 implements ExtractorsFactory {
        C36131() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new C3614c()};
        }
    }

    public void release() {
    }

    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput r1) throws java.io.IOException, java.lang.InterruptedException {
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
        r0 = this;
        r1 = r0.m13605a(r1);	 Catch:{ ParserException -> 0x0005 }
        return r1;
    L_0x0005:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.b.c.sniff(com.google.android.exoplayer2.extractor.ExtractorInput):boolean");
    }

    public void init(ExtractorOutput extractorOutput) {
        this.f10927b = extractorOutput;
    }

    public void seek(long j, long j2) {
        if (this.f10928c != null) {
            this.f10928c.m7391a(j, j2);
        }
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        if (this.f10928c == null) {
            if (m13605a(extractorInput)) {
                extractorInput.resetPeekPosition();
            } else {
                throw new ParserException("Failed to determine bitstream type");
            }
        }
        if (!this.f10929d) {
            TrackOutput track = this.f10927b.track(0, 1);
            this.f10927b.endTracks();
            this.f10928c.m7392a(this.f10927b, track);
            this.f10929d = true;
        }
        return this.f10928c.m7389a(extractorInput, c2075h);
    }

    /* renamed from: a */
    private boolean m13605a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        C2058e c2058e = new C2058e();
        if (c2058e.m7383a(extractorInput, true)) {
            if ((c2058e.f5648b & 2) == 2) {
                int min = Math.min(c2058e.f5655i, 8);
                C2302k c2302k = new C2302k(min);
                extractorInput.peekFully(c2302k.f6929a, 0, min);
                if (C3612b.m13598a(C3614c.m13604a(c2302k)) != null) {
                    this.f10928c = new C3612b();
                } else if (C3617j.m13618a(C3614c.m13604a(c2302k)) != null) {
                    this.f10928c = new C3617j();
                } else if (C3615g.m13608a(C3614c.m13604a(c2302k)) == null) {
                    return false;
                } else {
                    this.f10928c = new C3615g();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static C2302k m13604a(C2302k c2302k) {
        c2302k.m8388c(0);
        return c2302k;
    }
}
