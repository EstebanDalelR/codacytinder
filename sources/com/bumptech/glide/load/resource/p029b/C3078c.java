package com.bumptech.glide.load.resource.p029b;

import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.b.c */
public class C3078c<T> implements ResourceDecoder<File, T> {
    /* renamed from: a */
    private static final C1042a f9532a = new C1042a();
    /* renamed from: b */
    private ResourceDecoder<InputStream, T> f9533b;
    /* renamed from: c */
    private final C1042a f9534c;

    /* renamed from: com.bumptech.glide.load.resource.b.c$a */
    static class C1042a {
        C1042a() {
        }

        /* renamed from: a */
        public InputStream m3592a(File file) throws FileNotFoundException {
            return new FileInputStream(file);
        }
    }

    public String getId() {
        return "";
    }

    public /* synthetic */ Resource decode(Object obj, int i, int i2) throws IOException {
        return m12022a((File) obj, i, i2);
    }

    public C3078c(ResourceDecoder<InputStream, T> resourceDecoder) {
        this(resourceDecoder, f9532a);
    }

    C3078c(ResourceDecoder<InputStream, T> resourceDecoder, C1042a c1042a) {
        this.f9533b = resourceDecoder;
        this.f9534c = c1042a;
    }

    /* renamed from: a */
    public com.bumptech.glide.load.engine.Resource<T> m12022a(java.io.File r3, int r4, int r5) throws java.io.IOException {
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
        r2 = this;
        r0 = 0;
        r1 = r2.f9534c;	 Catch:{ all -> 0x0015 }
        r3 = r1.m3592a(r3);	 Catch:{ all -> 0x0015 }
        r0 = r2.f9533b;	 Catch:{ all -> 0x0013 }
        r4 = r0.decode(r3, r4, r5);	 Catch:{ all -> 0x0013 }
        if (r3 == 0) goto L_0x0012;
    L_0x000f:
        r3.close();	 Catch:{ IOException -> 0x0012 }
    L_0x0012:
        return r4;
    L_0x0013:
        r4 = move-exception;
        goto L_0x0017;
    L_0x0015:
        r4 = move-exception;
        r3 = r0;
    L_0x0017:
        if (r3 == 0) goto L_0x001c;
    L_0x0019:
        r3.close();	 Catch:{ IOException -> 0x001c }
    L_0x001c:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.b.c.a(java.io.File, int, int):com.bumptech.glide.load.engine.Resource<T>");
    }
}
