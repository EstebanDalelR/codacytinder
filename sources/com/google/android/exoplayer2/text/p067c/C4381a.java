package com.google.android.exoplayer2.text.p067c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.exoplayer2.text.C4258a;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* renamed from: com.google.android.exoplayer2.text.c.a */
public final class C4381a extends C4258a {
    /* renamed from: a */
    private final C2302k f14513a = new C2302k();
    /* renamed from: b */
    private final C2233a f14514b = new C2233a();
    /* renamed from: c */
    private Inflater f14515c;
    /* renamed from: d */
    private byte[] f14516d;
    /* renamed from: e */
    private int f14517e;

    /* renamed from: com.google.android.exoplayer2.text.c.a$a */
    private static final class C2233a {
        /* renamed from: a */
        private final C2302k f6560a = new C2302k();
        /* renamed from: b */
        private final int[] f6561b = new int[256];
        /* renamed from: c */
        private boolean f6562c;
        /* renamed from: d */
        private int f6563d;
        /* renamed from: e */
        private int f6564e;
        /* renamed from: f */
        private int f6565f;
        /* renamed from: g */
        private int f6566g;
        /* renamed from: h */
        private int f6567h;
        /* renamed from: i */
        private int f6568i;

        /* renamed from: a */
        private void m7980a(C2302k c2302k, int i) {
            C2233a c2233a = this;
            if (i % 5 == 2) {
                c2302k.m8390d(2);
                Arrays.fill(c2233a.f6561b, 0);
                int i2 = i / 5;
                for (int i3 = 0; i3 < i2; i3++) {
                    int g = c2302k.m8395g();
                    int g2 = c2302k.m8395g();
                    int g3 = c2302k.m8395g();
                    int g4 = c2302k.m8395g();
                    int g5 = c2302k.m8395g();
                    double d = (double) g2;
                    double d2 = (double) (g3 - 128);
                    int i4 = (int) ((1.402d * d2) + d);
                    int i5 = g;
                    double d3 = (double) (g4 - 128);
                    g2 = (int) ((d - (0.34414d * d3)) - (d2 * 0.71414d));
                    int i6 = (int) (d + (d3 * 1.772d));
                    c2233a.f6561b[i5] = C2314v.m8456a(i6, 0, 255) | ((C2314v.m8456a(g2, 0, 255) << 8) | ((g5 << 24) | (C2314v.m8456a(i4, 0, 255) << 16)));
                }
                c2233a.f6562c = true;
            }
        }

        /* renamed from: b */
        private void m7982b(C2302k c2302k, int i) {
            if (i >= 4) {
                int k;
                c2302k.m8390d(3);
                i -= 4;
                if (((c2302k.m8395g() & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? 1 : null) != null) {
                    if (i >= 7) {
                        k = c2302k.m8399k();
                        if (k >= 4) {
                            this.f6567h = c2302k.m8396h();
                            this.f6568i = c2302k.m8396h();
                            this.f6560a.m8381a(k - 4);
                            i -= 7;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                int d = this.f6560a.m8389d();
                k = this.f6560a.m8387c();
                if (d < k && i > 0) {
                    i = Math.min(i, k - d);
                    c2302k.m8384a(this.f6560a.f6929a, d, i);
                    this.f6560a.m8388c(d + i);
                }
            }
        }

        /* renamed from: c */
        private void m7984c(C2302k c2302k, int i) {
            if (i >= 19) {
                this.f6563d = c2302k.m8396h();
                this.f6564e = c2302k.m8396h();
                c2302k.m8390d(11);
                this.f6565f = c2302k.m8396h();
                this.f6566g = c2302k.m8396h();
            }
        }

        /* renamed from: a */
        public Cue m7985a() {
            if (!(this.f6563d == 0 || this.f6564e == 0 || this.f6567h == 0 || this.f6568i == 0 || this.f6560a.m8387c() == 0 || this.f6560a.m8389d() != this.f6560a.m8387c())) {
                if (this.f6562c) {
                    this.f6560a.m8388c(0);
                    int[] iArr = new int[(this.f6567h * this.f6568i)];
                    int i = 0;
                    while (i < iArr.length) {
                        int i2;
                        int g = this.f6560a.m8395g();
                        if (g != 0) {
                            i2 = i + 1;
                            iArr[i] = this.f6561b[g];
                        } else {
                            g = this.f6560a.m8395g();
                            if (g != 0) {
                                if ((g & 64) == 0) {
                                    i2 = g & 63;
                                } else {
                                    i2 = ((g & 63) << 8) | this.f6560a.m8395g();
                                }
                                if ((g & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                                    g = 0;
                                } else {
                                    g = this.f6561b[this.f6560a.m8395g()];
                                }
                                i2 += i;
                                Arrays.fill(iArr, i, i2, g);
                            }
                        }
                        i = i2;
                    }
                    return new Cue(Bitmap.createBitmap(iArr, this.f6567h, this.f6568i, Config.ARGB_8888), ((float) this.f6565f) / ((float) this.f6563d), 0, ((float) this.f6566g) / ((float) this.f6564e), 0, ((float) this.f6567h) / ((float) this.f6563d), ((float) this.f6568i) / ((float) this.f6564e));
                }
            }
            return null;
        }

        /* renamed from: b */
        public void m7986b() {
            this.f6563d = 0;
            this.f6564e = 0;
            this.f6565f = 0;
            this.f6566g = 0;
            this.f6567h = 0;
            this.f6568i = 0;
            this.f6560a.m8381a(0);
            this.f6562c = false;
        }
    }

    public C4381a() {
        super("PgsDecoder");
    }

    /* renamed from: a */
    protected Subtitle mo3740a(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        if (m18092a(bArr, i)) {
            this.f14513a.m8383a(this.f14516d, this.f14517e);
        } else {
            this.f14513a.m8383a(bArr, i);
        }
        this.f14514b.m7986b();
        bArr = new ArrayList();
        while (this.f14513a.m8385b() >= true) {
            i = C4381a.m18091a(this.f14513a, this.f14514b);
            if (i != 0) {
                bArr.add(i);
            }
        }
        return new C3704b(Collections.unmodifiableList(bArr));
    }

    /* renamed from: a */
    private boolean m18092a(byte[] r6, int r7) {
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
        r5 = this;
        r0 = 0;
        if (r7 == 0) goto L_0x007b;
    L_0x0003:
        r1 = r6[r0];
        r2 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        if (r1 == r2) goto L_0x000a;
    L_0x0009:
        goto L_0x007b;
    L_0x000a:
        r1 = r5.f14515c;
        if (r1 != 0) goto L_0x0019;
    L_0x000e:
        r1 = new java.util.zip.Inflater;
        r1.<init>();
        r5.f14515c = r1;
        r1 = new byte[r7];
        r5.f14516d = r1;
    L_0x0019:
        r5.f14517e = r0;
        r1 = r5.f14515c;
        r1.setInput(r6, r0, r7);
    L_0x0020:
        r6 = r5.f14515c;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r6 = r6.finished();	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        if (r6 != 0) goto L_0x0062;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
    L_0x0028:
        r6 = r5.f14515c;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r6 = r6.needsDictionary();	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        if (r6 != 0) goto L_0x0062;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
    L_0x0030:
        r6 = r5.f14515c;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r6 = r6.needsInput();	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        if (r6 != 0) goto L_0x0062;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
    L_0x0038:
        r6 = r5.f14517e;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r7 = r5.f14516d;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r7 = r7.length;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        if (r6 != r7) goto L_0x004c;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
    L_0x003f:
        r6 = r5.f14516d;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r7 = r5.f14516d;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r7 = r7.length;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r7 = r7 * 2;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r6 = java.util.Arrays.copyOf(r6, r7);	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r5.f14516d = r6;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
    L_0x004c:
        r6 = r5.f14517e;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r7 = r5.f14515c;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r1 = r5.f14516d;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r2 = r5.f14517e;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r3 = r5.f14516d;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r3 = r3.length;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r4 = r5.f14517e;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r3 = r3 - r4;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r7 = r7.inflate(r1, r2, r3);	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r6 = r6 + r7;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r5.f14517e = r6;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        goto L_0x0020;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
    L_0x0062:
        r6 = r5.f14515c;	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r6 = r6.finished();	 Catch:{ DataFormatException -> 0x0075, all -> 0x006e }
        r7 = r5.f14515c;
        r7.reset();
        return r6;
    L_0x006e:
        r6 = move-exception;
        r7 = r5.f14515c;
        r7.reset();
        throw r6;
    L_0x0075:
        r6 = r5.f14515c;
        r6.reset();
        return r0;
    L_0x007b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.c.a.a(byte[], int):boolean");
    }

    /* renamed from: a */
    private static Cue m18091a(C2302k c2302k, C2233a c2233a) {
        int c = c2302k.m8387c();
        int g = c2302k.m8395g();
        int h = c2302k.m8396h();
        int d = c2302k.m8389d() + h;
        Cue cue = null;
        if (d > c) {
            c2302k.m8388c(c);
            return null;
        }
        if (g != ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            switch (g) {
                case 20:
                    c2233a.m7980a(c2302k, h);
                    break;
                case 21:
                    c2233a.m7982b(c2302k, h);
                    break;
                case 22:
                    c2233a.m7984c(c2302k, h);
                    break;
                default:
                    break;
            }
        }
        cue = c2233a.m7985a();
        c2233a.m7986b();
        c2302k.m8388c(d);
        return cue;
    }
}
