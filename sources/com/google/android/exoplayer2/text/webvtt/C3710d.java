package com.google.android.exoplayer2.text.webvtt;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.google.android.exoplayer2.text.Cue;

/* renamed from: com.google.android.exoplayer2.text.webvtt.d */
public final class C3710d extends Cue {
    /* renamed from: o */
    public final long f11574o;
    /* renamed from: p */
    public final long f11575p;

    /* renamed from: com.google.android.exoplayer2.text.webvtt.d$1 */
    static /* synthetic */ class C22401 {
        /* renamed from: a */
        static final /* synthetic */ int[] f6626a = new int[Alignment.values().length];

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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = android.text.Layout.Alignment.values();
            r0 = r0.length;
            r0 = new int[r0];
            f6626a = r0;
            r0 = f6626a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.text.Layout.Alignment.ALIGN_NORMAL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f6626a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.text.Layout.Alignment.ALIGN_CENTER;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f6626a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.d.1.<clinit>():void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.webvtt.d$a */
    public static class C2241a {
        /* renamed from: a */
        private long f6627a;
        /* renamed from: b */
        private long f6628b;
        /* renamed from: c */
        private SpannableStringBuilder f6629c;
        /* renamed from: d */
        private Alignment f6630d;
        /* renamed from: e */
        private float f6631e;
        /* renamed from: f */
        private int f6632f;
        /* renamed from: g */
        private int f6633g;
        /* renamed from: h */
        private float f6634h;
        /* renamed from: i */
        private int f6635i;
        /* renamed from: j */
        private float f6636j;

        public C2241a() {
            m8073a();
        }

        /* renamed from: a */
        public void m8073a() {
            this.f6627a = 0;
            this.f6628b = 0;
            this.f6629c = null;
            this.f6630d = null;
            this.f6631e = Float.MIN_VALUE;
            this.f6632f = Integer.MIN_VALUE;
            this.f6633g = Integer.MIN_VALUE;
            this.f6634h = Float.MIN_VALUE;
            this.f6635i = Integer.MIN_VALUE;
            this.f6636j = Float.MIN_VALUE;
        }

        /* renamed from: b */
        public C3710d m8077b() {
            if (this.f6634h != Float.MIN_VALUE && this.f6635i == Integer.MIN_VALUE) {
                m8067c();
            }
            return new C3710d(this.f6627a, this.f6628b, this.f6629c, this.f6630d, this.f6631e, this.f6632f, this.f6633g, this.f6634h, this.f6635i, this.f6636j);
        }

        /* renamed from: a */
        public C2241a m8070a(long j) {
            this.f6627a = j;
            return this;
        }

        /* renamed from: b */
        public C2241a m8076b(long j) {
            this.f6628b = j;
            return this;
        }

        /* renamed from: a */
        public C2241a m8072a(SpannableStringBuilder spannableStringBuilder) {
            this.f6629c = spannableStringBuilder;
            return this;
        }

        /* renamed from: a */
        public C2241a m8071a(Alignment alignment) {
            this.f6630d = alignment;
            return this;
        }

        /* renamed from: a */
        public C2241a m8068a(float f) {
            this.f6631e = f;
            return this;
        }

        /* renamed from: a */
        public C2241a m8069a(int i) {
            this.f6632f = i;
            return this;
        }

        /* renamed from: b */
        public C2241a m8075b(int i) {
            this.f6633g = i;
            return this;
        }

        /* renamed from: b */
        public C2241a m8074b(float f) {
            this.f6634h = f;
            return this;
        }

        /* renamed from: c */
        public C2241a m8079c(int i) {
            this.f6635i = i;
            return this;
        }

        /* renamed from: c */
        public C2241a m8078c(float f) {
            this.f6636j = f;
            return this;
        }

        /* renamed from: c */
        private C2241a m8067c() {
            if (this.f6630d != null) {
                switch (C22401.f6626a[this.f6630d.ordinal()]) {
                    case 1:
                        this.f6635i = 0;
                        break;
                    case 2:
                        this.f6635i = 1;
                        break;
                    case 3:
                        this.f6635i = 2;
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unrecognized alignment: ");
                        stringBuilder.append(this.f6630d);
                        Log.w("WebvttCueBuilder", stringBuilder.toString());
                        this.f6635i = 0;
                        break;
                }
            }
            this.f6635i = Integer.MIN_VALUE;
            return this;
        }
    }

    public C3710d(CharSequence charSequence) {
        this(0, 0, charSequence);
    }

    public C3710d(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C3710d(long j, long j2, CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.f11574o = j;
        this.f11575p = j2;
    }

    /* renamed from: a */
    public boolean m14038a() {
        return this.d == Float.MIN_VALUE && this.g == Float.MIN_VALUE;
    }
}
