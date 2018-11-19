package com.google.android.m4b.maps.p125y;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.y.o */
public final class C5578o {
    /* renamed from: a */
    private final C5582s f20578a;
    /* renamed from: b */
    private boolean f20579b;
    /* renamed from: c */
    private long f20580c;

    /* renamed from: com.google.android.m4b.maps.y.o$1 */
    static /* synthetic */ class C55771 {
        /* renamed from: a */
        static final /* synthetic */ int[] f20577a = new int[TimeUnit.values().length];

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
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = java.util.concurrent.TimeUnit.values();
            r0 = r0.length;
            r0 = new int[r0];
            f20577a = r0;
            r0 = f20577a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f20577a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = java.util.concurrent.TimeUnit.MICROSECONDS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f20577a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f20577a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.y.o.1.<clinit>():void");
        }
    }

    @Deprecated
    public C5578o() {
        this(C5582s.m24322b());
    }

    @Deprecated
    private C5578o(C5582s c5582s) {
        this.f20578a = (C5582s) C5571j.m24293a((Object) c5582s, (Object) "ticker");
    }

    /* renamed from: a */
    public final C5578o m24317a() {
        C5571j.m24302b(this.f20579b ^ true, (Object) "This stopwatch is already running.");
        this.f20579b = true;
        this.f20580c = this.f20578a.mo5824a();
        return this;
    }

    /* renamed from: b */
    private long m24315b() {
        return this.f20579b ? (this.f20578a.mo5824a() - this.f20580c) + 0 : 0;
    }

    /* renamed from: a */
    public final long m24316a(TimeUnit timeUnit) {
        return timeUnit.convert(m24315b(), TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long b = m24315b();
        if (TimeUnit.SECONDS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        String str2 = "%.4g %s";
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(((double) b) / ((double) TimeUnit.NANOSECONDS.convert(1, timeUnit)));
        switch (C55771.f20577a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            default:
                throw new AssertionError();
        }
        objArr[1] = str;
        return String.format(str2, objArr);
    }
}
