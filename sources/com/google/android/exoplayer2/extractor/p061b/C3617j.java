package com.google.android.exoplayer2.extractor.p061b;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.p061b.C2062h.C2061a;
import com.google.android.exoplayer2.extractor.p061b.C2069k.C2066b;
import com.google.android.exoplayer2.extractor.p061b.C2069k.C2067c;
import com.google.android.exoplayer2.extractor.p061b.C2069k.C2068d;
import com.google.android.exoplayer2.util.C2302k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.b.j */
final class C3617j extends C2062h {
    /* renamed from: a */
    private C2064a f10933a;
    /* renamed from: b */
    private int f10934b;
    /* renamed from: c */
    private boolean f10935c;
    /* renamed from: d */
    private C2068d f10936d;
    /* renamed from: e */
    private C2066b f10937e;

    /* renamed from: com.google.android.exoplayer2.extractor.b.j$a */
    static final class C2064a {
        /* renamed from: a */
        public final C2068d f5677a;
        /* renamed from: b */
        public final C2066b f5678b;
        /* renamed from: c */
        public final byte[] f5679c;
        /* renamed from: d */
        public final C2067c[] f5680d;
        /* renamed from: e */
        public final int f5681e;

        public C2064a(C2068d c2068d, C2066b c2066b, byte[] bArr, C2067c[] c2067cArr, int i) {
            this.f5677a = c2068d;
            this.f5678b = c2066b;
            this.f5679c = bArr;
            this.f5680d = c2067cArr;
            this.f5681e = i;
        }
    }

    /* renamed from: a */
    static int m13615a(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    C3617j() {
    }

    /* renamed from: a */
    public static boolean m13618a(com.google.android.exoplayer2.util.C2302k r1) {
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
        r0 = 1;
        r1 = com.google.android.exoplayer2.extractor.p061b.C2069k.m7407a(r0, r1, r0);	 Catch:{ ParserException -> 0x0006 }
        return r1;
    L_0x0006:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.b.j.a(com.google.android.exoplayer2.util.k):boolean");
    }

    /* renamed from: a */
    protected void mo2253a(boolean z) {
        super.mo2253a(z);
        if (z) {
            this.f10933a = null;
            this.f10936d = null;
            this.f10937e = null;
        }
        this.f10934b = 0;
        this.f10935c = false;
    }

    /* renamed from: c */
    protected void mo2256c(long j) {
        super.mo2256c(j);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        j = null;
        this.f10935c = i != 0;
        if (this.f10936d != null) {
            j = this.f10936d.f5700g;
        }
        this.f10934b = j;
    }

    /* renamed from: b */
    protected long mo2255b(C2302k c2302k) {
        int i = 0;
        if ((c2302k.f6929a[0] & 1) == 1) {
            return -1;
        }
        int a = C3617j.m13616a(c2302k.f6929a[0], this.f10933a);
        if (this.f10935c) {
            i = (this.f10934b + a) / 4;
        }
        long j = (long) i;
        C3617j.m13617a(c2302k, j);
        this.f10935c = true;
        this.f10934b = a;
        return j;
    }

    /* renamed from: a */
    protected boolean mo2254a(C2302k c2302k, long j, C2061a c2061a) throws IOException, InterruptedException {
        if (this.f10933a != null) {
            return null;
        }
        this.f10933a = m13622c(c2302k);
        if (this.f10933a == null) {
            return true;
        }
        List arrayList = new ArrayList();
        arrayList.add(this.f10933a.f5677a.f5703j);
        arrayList.add(this.f10933a.f5679c);
        c2061a.f5658a = Format.createAudioSampleFormat(null, "audio/vorbis", null, this.f10933a.f5677a.f5698e, -1, this.f10933a.f5677a.f5695b, (int) this.f10933a.f5677a.f5696c, arrayList, null, 0, null);
        return true;
    }

    /* renamed from: c */
    C2064a m13622c(C2302k c2302k) throws IOException {
        if (this.f10936d == null) {
            this.f10936d = C2069k.m7405a(c2302k);
            return null;
        } else if (this.f10937e == null) {
            this.f10937e = C2069k.m7410b(c2302k);
            return null;
        } else {
            Object obj = new byte[c2302k.m8387c()];
            System.arraycopy(c2302k.f6929a, 0, obj, 0, c2302k.m8387c());
            C2067c[] a = C2069k.m7409a(c2302k, this.f10936d.f5695b);
            return new C2064a(this.f10936d, this.f10937e, obj, a, C2069k.m7403a(a.length - 1));
        }
    }

    /* renamed from: a */
    static void m13617a(C2302k c2302k, long j) {
        c2302k.m8386b(c2302k.m8387c() + 4);
        c2302k.f6929a[c2302k.m8387c() - 4] = (byte) ((int) (j & 255));
        c2302k.f6929a[c2302k.m8387c() - 3] = (byte) ((int) ((j >>> 8) & 255));
        c2302k.f6929a[c2302k.m8387c() - 2] = (byte) ((int) ((j >>> 16) & 255));
        c2302k.f6929a[c2302k.m8387c() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    /* renamed from: a */
    private static int m13616a(byte b, C2064a c2064a) {
        if (c2064a.f5680d[C3617j.m13615a(b, c2064a.f5681e, 1)].f5690a == (byte) 0) {
            return c2064a.f5677a.f5700g;
        }
        return c2064a.f5677a.f5701h;
    }
}
