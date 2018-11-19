package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.C2302k;

/* renamed from: com.google.android.exoplayer2.extractor.f */
public final class C2073f {
    /* renamed from: a */
    private final C2302k f5710a = new C2302k(10);

    @android.support.annotation.Nullable
    /* renamed from: a */
    public com.google.android.exoplayer2.metadata.Metadata m7421a(com.google.android.exoplayer2.extractor.ExtractorInput r8, @android.support.annotation.Nullable com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r9) throws java.io.IOException, java.lang.InterruptedException {
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
        r7 = this;
        r0 = 0;
        r1 = 0;
        r2 = 0;
    L_0x0003:
        r3 = r7.f5710a;	 Catch:{ EOFException -> 0x0047 }
        r3 = r3.f6929a;	 Catch:{ EOFException -> 0x0047 }
        r4 = 10;	 Catch:{ EOFException -> 0x0047 }
        r8.peekFully(r3, r0, r4);	 Catch:{ EOFException -> 0x0047 }
        r3 = r7.f5710a;
        r3.m8388c(r0);
        r3 = r7.f5710a;
        r3 = r3.m8399k();
        r5 = com.google.android.exoplayer2.metadata.id3.Id3Decoder.f11333b;
        if (r3 == r5) goto L_0x001c;
    L_0x001b:
        goto L_0x0047;
    L_0x001c:
        r3 = r7.f5710a;
        r5 = 3;
        r3.m8390d(r5);
        r3 = r7.f5710a;
        r3 = r3.m8408t();
        r5 = r3 + 10;
        if (r1 != 0) goto L_0x0042;
    L_0x002c:
        r1 = new byte[r5];
        r6 = r7.f5710a;
        r6 = r6.f6929a;
        java.lang.System.arraycopy(r6, r0, r1, r0, r4);
        r8.peekFully(r1, r4, r3);
        r3 = new com.google.android.exoplayer2.metadata.id3.Id3Decoder;
        r3.<init>(r9);
        r1 = r3.m13852a(r1, r5);
        goto L_0x0045;
    L_0x0042:
        r8.advancePeekPosition(r3);
    L_0x0045:
        r2 = r2 + r5;
        goto L_0x0003;
    L_0x0047:
        r8.resetPeekPosition();
        r8.advancePeekPosition(r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.f.a(com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate):com.google.android.exoplayer2.metadata.Metadata");
    }
}
