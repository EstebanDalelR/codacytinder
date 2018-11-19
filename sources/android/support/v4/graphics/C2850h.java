package android.support.v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.content.res.FontResourcesParserCompat.C0437b;
import android.support.v4.content.res.FontResourcesParserCompat.C2840a;
import android.support.v4.graphics.C0449d.C0448a;
import android.support.v4.provider.FontsContractCompat.C0533b;

@RequiresApi(14)
@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.graphics.h */
class C2850h implements C0448a {

    /* renamed from: android.support.v4.graphics.h$a */
    private interface C0454a<T> {
        /* renamed from: a */
        boolean mo466a(T t);

        /* renamed from: b */
        int mo467b(T t);
    }

    /* renamed from: android.support.v4.graphics.h$1 */
    class C28481 implements C0454a<C0533b> {
        /* renamed from: a */
        final /* synthetic */ C2850h f9042a;

        C28481(C2850h c2850h) {
            this.f9042a = c2850h;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo466a(Object obj) {
            return m11255b((C0533b) obj);
        }

        /* renamed from: b */
        public /* synthetic */ int mo467b(Object obj) {
            return m11252a((C0533b) obj);
        }

        /* renamed from: a */
        public int m11252a(C0533b c0533b) {
            return c0533b.m1960c();
        }

        /* renamed from: b */
        public boolean m11255b(C0533b c0533b) {
            return c0533b.m1961d();
        }
    }

    /* renamed from: android.support.v4.graphics.h$2 */
    class C28492 implements C0454a<C0437b> {
        /* renamed from: a */
        final /* synthetic */ C2850h f9043a;

        C28492(C2850h c2850h) {
            this.f9043a = c2850h;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo466a(Object obj) {
            return m11259b((C0437b) obj);
        }

        /* renamed from: b */
        public /* synthetic */ int mo467b(Object obj) {
            return m11256a((C0437b) obj);
        }

        /* renamed from: a */
        public int m11256a(C0437b c0437b) {
            return c0437b.m1655b();
        }

        /* renamed from: b */
        public boolean m11259b(C0437b c0437b) {
            return c0437b.m1656c();
        }
    }

    C2850h() {
    }

    /* renamed from: a */
    private static <T> T m11261a(T[] tArr, int i, C0454a<T> c0454a) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (T t2 : tArr) {
            int abs = (Math.abs(c0454a.mo467b(t2) - i2) * 2) + (c0454a.mo466a(t2) == z ? 0 : 1);
            if (t == null || r6 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    protected C0533b m11266a(C0533b[] c0533bArr, int i) {
        return (C0533b) C2850h.m11261a(c0533bArr, i, new C28481(this));
    }

    /* renamed from: a */
    protected android.graphics.Typeface m11265a(android.content.Context r2, java.io.InputStream r3) {
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
        r1 = this;
        r2 = android.support.v4.graphics.C0455i.m1744a(r2);
        r0 = 0;
        if (r2 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r3 = android.support.v4.graphics.C0455i.m1750a(r2, r3);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        if (r3 != 0) goto L_0x0012;
    L_0x000e:
        r2.delete();
        return r0;
    L_0x0012:
        r3 = r2.getPath();	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r3 = android.graphics.Typeface.createFromFile(r3);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r2.delete();
        return r3;
    L_0x001e:
        r3 = move-exception;
        r2.delete();
        throw r3;
    L_0x0023:
        r2.delete();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.h.a(android.content.Context, java.io.InputStream):android.graphics.Typeface");
    }

    /* renamed from: a */
    public android.graphics.Typeface mo469a(android.content.Context r3, @android.support.annotation.Nullable android.os.CancellationSignal r4, @android.support.annotation.NonNull android.support.v4.provider.FontsContractCompat.C0533b[] r5, int r6) {
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
        r4 = r5.length;
        r0 = 0;
        r1 = 1;
        if (r4 >= r1) goto L_0x0006;
    L_0x0005:
        return r0;
    L_0x0006:
        r4 = r2.m11266a(r5, r6);
        r5 = r3.getContentResolver();	 Catch:{ IOException -> 0x0026, all -> 0x0021 }
        r4 = r4.m1958a();	 Catch:{ IOException -> 0x0026, all -> 0x0021 }
        r4 = r5.openInputStream(r4);	 Catch:{ IOException -> 0x0026, all -> 0x0021 }
        r3 = r2.m11265a(r3, r4);	 Catch:{ IOException -> 0x0027, all -> 0x001e }
        android.support.v4.graphics.C0455i.m1748a(r4);
        return r3;
    L_0x001e:
        r3 = move-exception;
        r0 = r4;
        goto L_0x0022;
    L_0x0021:
        r3 = move-exception;
    L_0x0022:
        android.support.v4.graphics.C0455i.m1748a(r0);
        throw r3;
    L_0x0026:
        r4 = r0;
    L_0x0027:
        android.support.v4.graphics.C0455i.m1748a(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.h.a(android.content.Context, android.os.CancellationSignal, android.support.v4.provider.FontsContractCompat$b[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    private C0437b m11260a(C2840a c2840a, int i) {
        return (C0437b) C2850h.m11261a(c2840a.m11242a(), i, new C28492(this));
    }

    @Nullable
    /* renamed from: a */
    public Typeface mo470a(Context context, C2840a c2840a, Resources resources, int i) {
        c2840a = m11260a(c2840a, i);
        if (c2840a == null) {
            return null;
        }
        return C0449d.m1710a(context, resources, c2840a.m1657d(), c2840a.m1654a(), i);
    }

    @android.support.annotation.Nullable
    /* renamed from: a */
    public android.graphics.Typeface mo468a(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
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
        r1 = android.support.v4.graphics.C0455i.m1744a(r1);
        r4 = 0;
        if (r1 != 0) goto L_0x0008;
    L_0x0007:
        return r4;
    L_0x0008:
        r2 = android.support.v4.graphics.C0455i.m1749a(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        if (r2 != 0) goto L_0x0012;
    L_0x000e:
        r1.delete();
        return r4;
    L_0x0012:
        r2 = r1.getPath();	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r2 = android.graphics.Typeface.createFromFile(r2);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r1.delete();
        return r2;
    L_0x001e:
        r2 = move-exception;
        r1.delete();
        throw r2;
    L_0x0023:
        r1.delete();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.h.a(android.content.Context, android.content.res.Resources, int, java.lang.String, int):android.graphics.Typeface");
    }
}
