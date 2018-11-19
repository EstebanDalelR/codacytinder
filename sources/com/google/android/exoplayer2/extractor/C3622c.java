package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.flv.C3627b;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.p061b.C3614c;
import com.google.android.exoplayer2.extractor.p062c.C3620a;
import com.google.android.exoplayer2.extractor.p081a.C3607a;
import com.google.android.exoplayer2.extractor.ts.C3645a;
import com.google.android.exoplayer2.extractor.ts.C3648c;
import com.google.android.exoplayer2.extractor.ts.C3660o;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.reflect.Constructor;

/* renamed from: com.google.android.exoplayer2.extractor.c */
public final class C3622c implements ExtractorsFactory {
    /* renamed from: a */
    private static final Constructor<? extends Extractor> f10959a;
    /* renamed from: b */
    private int f10960b;
    /* renamed from: c */
    private int f10961c;
    /* renamed from: d */
    private int f10962d;
    /* renamed from: e */
    private int f10963e;
    /* renamed from: f */
    private int f10964f = 1;
    /* renamed from: g */
    private int f10965g;

    static {
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
        r0 = "com.google.android.exoplayer2.ext.flac.FlacExtractor";	 Catch:{ ClassNotFoundException -> 0x001d, Exception -> 0x0014 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x001d, Exception -> 0x0014 }
        r1 = com.google.android.exoplayer2.extractor.Extractor.class;	 Catch:{ ClassNotFoundException -> 0x001d, Exception -> 0x0014 }
        r0 = r0.asSubclass(r1);	 Catch:{ ClassNotFoundException -> 0x001d, Exception -> 0x0014 }
        r1 = 0;	 Catch:{ ClassNotFoundException -> 0x001d, Exception -> 0x0014 }
        r1 = new java.lang.Class[r1];	 Catch:{ ClassNotFoundException -> 0x001d, Exception -> 0x0014 }
        r0 = r0.getConstructor(r1);	 Catch:{ ClassNotFoundException -> 0x001d, Exception -> 0x0014 }
        goto L_0x001e;
    L_0x0014:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = "Error instantiating FLAC extension";
        r1.<init>(r2, r0);
        throw r1;
    L_0x001d:
        r0 = 0;
    L_0x001e:
        f10959a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.c.<clinit>():void");
    }

    public synchronized Extractor[] createExtractors() {
        Extractor[] extractorArr;
        extractorArr = new Extractor[(f10959a == null ? 12 : 13)];
        extractorArr[0] = new MatroskaExtractor(this.f10960b);
        extractorArr[1] = new FragmentedMp4Extractor(this.f10962d);
        extractorArr[2] = new Mp4Extractor(this.f10961c);
        extractorArr[3] = new Mp3Extractor(this.f10963e);
        extractorArr[4] = new C3648c();
        extractorArr[5] = new C3645a();
        extractorArr[6] = new TsExtractor(this.f10964f, this.f10965g);
        extractorArr[7] = new C3627b();
        extractorArr[8] = new C3614c();
        extractorArr[9] = new C3660o();
        extractorArr[10] = new C3620a();
        extractorArr[11] = new C3607a();
        if (f10959a != null) {
            try {
                extractorArr[12] = (Extractor) f10959a.newInstance(new Object[0]);
            } catch (Throwable e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return extractorArr;
    }
}
