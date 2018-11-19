package com.bumptech.glide.gifdecoder;

import android.util.Log;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.gifdecoder.c */
public class C0993c {
    /* renamed from: a */
    private final byte[] f2758a = new byte[256];
    /* renamed from: b */
    private ByteBuffer f2759b;
    /* renamed from: c */
    private C0992b f2760c;
    /* renamed from: d */
    private int f2761d = 0;

    /* renamed from: a */
    public C0993c m3475a(byte[] bArr) {
        m3462c();
        if (bArr != null) {
            this.f2759b = ByteBuffer.wrap(bArr);
            this.f2759b.rewind();
            this.f2759b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f2759b = null;
            this.f2760c.f2746b = 2;
        }
        return this;
    }

    /* renamed from: a */
    public void m3476a() {
        this.f2759b = null;
        this.f2760c = null;
    }

    /* renamed from: c */
    private void m3462c() {
        this.f2759b = null;
        Arrays.fill(this.f2758a, (byte) 0);
        this.f2760c = new C0992b();
        this.f2761d = 0;
    }

    /* renamed from: b */
    public C0992b m3477b() {
        if (this.f2759b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m3474o()) {
            return this.f2760c;
        } else {
            m3467h();
            if (!m3474o()) {
                m3463d();
                if (this.f2760c.f2747c < 0) {
                    this.f2760c.f2746b = 1;
                }
            }
            return this.f2760c;
        }
    }

    /* renamed from: d */
    private void m3463d() {
        Object obj = null;
        while (obj == null && !m3474o()) {
            int m = m3472m();
            if (m == 33) {
                m = m3472m();
                if (m == 1) {
                    m3470k();
                } else if (m != 249) {
                    switch (m) {
                        case 254:
                            m3470k();
                            break;
                        case 255:
                            m3471l();
                            String str = "";
                            for (m = 0; m < 11; m++) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(str);
                                stringBuilder.append((char) this.f2758a[m]);
                                str = stringBuilder.toString();
                            }
                            if (!str.equals("NETSCAPE2.0")) {
                                m3470k();
                                break;
                            } else {
                                m3466g();
                                break;
                            }
                        default:
                            m3470k();
                            break;
                    }
                } else {
                    this.f2760c.f2748d = new C0991a();
                    m3464e();
                }
            } else if (m == 44) {
                if (this.f2760c.f2748d == null) {
                    this.f2760c.f2748d = new C0991a();
                }
                m3465f();
            } else if (m != 59) {
                this.f2760c.f2746b = 1;
            } else {
                obj = 1;
            }
        }
    }

    /* renamed from: e */
    private void m3464e() {
        m3472m();
        int m = m3472m();
        this.f2760c.f2748d.f2740g = (m & 28) >> 2;
        boolean z = true;
        if (this.f2760c.f2748d.f2740g == 0) {
            this.f2760c.f2748d.f2740g = 1;
        }
        C0991a c0991a = this.f2760c.f2748d;
        if ((m & 1) == 0) {
            z = false;
        }
        c0991a.f2739f = z;
        m = m3473n();
        if (m < 3) {
            m = 10;
        }
        this.f2760c.f2748d.f2742i = m * 10;
        this.f2760c.f2748d.f2741h = m3472m();
        m3472m();
    }

    /* renamed from: f */
    private void m3465f() {
        this.f2760c.f2748d.f2734a = m3473n();
        this.f2760c.f2748d.f2735b = m3473n();
        this.f2760c.f2748d.f2736c = m3473n();
        this.f2760c.f2748d.f2737d = m3473n();
        int m = m3472m();
        boolean z = false;
        Object obj = (m & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? 1 : null;
        int pow = (int) Math.pow(2.0d, (double) ((m & 7) + 1));
        C0991a c0991a = this.f2760c.f2748d;
        if ((m & 64) != 0) {
            z = true;
        }
        c0991a.f2738e = z;
        if (obj != null) {
            this.f2760c.f2748d.f2744k = m3461a(pow);
        } else {
            this.f2760c.f2748d.f2744k = null;
        }
        this.f2760c.f2748d.f2743j = this.f2759b.position();
        m3469j();
        if (!m3474o()) {
            C0992b c0992b = this.f2760c;
            c0992b.f2747c++;
            this.f2760c.f2749e.add(this.f2760c.f2748d);
        }
    }

    /* renamed from: g */
    private void m3466g() {
        do {
            m3471l();
            if (this.f2758a[0] == (byte) 1) {
                this.f2760c.f2757m = (this.f2758a[1] & 255) | ((this.f2758a[2] & 255) << 8);
            }
            if (this.f2761d <= 0) {
                return;
            }
        } while (!m3474o());
    }

    /* renamed from: h */
    private void m3467h() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append((char) m3472m());
            str = stringBuilder.toString();
        }
        if (str.startsWith("GIF")) {
            m3468i();
            if (this.f2760c.f2752h && !m3474o()) {
                this.f2760c.f2745a = m3461a(this.f2760c.f2753i);
                this.f2760c.f2756l = this.f2760c.f2745a[this.f2760c.f2754j];
            }
            return;
        }
        this.f2760c.f2746b = 1;
    }

    /* renamed from: i */
    private void m3468i() {
        this.f2760c.f2750f = m3473n();
        this.f2760c.f2751g = m3473n();
        int m = m3472m();
        this.f2760c.f2752h = (m & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0;
        this.f2760c.f2753i = 2 << (m & 7);
        this.f2760c.f2754j = m3472m();
        this.f2760c.f2755k = m3472m();
    }

    /* renamed from: a */
    private int[] m3461a(int i) {
        int[] iArr;
        byte[] bArr = new byte[(i * 3)];
        try {
            this.f2759b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((((bArr[i3] & 255) << 16) | -16777216) | ((bArr[i4] & 255) << 8)) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException e) {
                    i = e;
                }
            }
        } catch (BufferUnderflowException e2) {
            i = e2;
            iArr = null;
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", i);
            }
            this.f2760c.f2746b = 1;
            return iArr;
        }
        return iArr;
    }

    /* renamed from: j */
    private void m3469j() {
        m3472m();
        m3470k();
    }

    /* renamed from: k */
    private void m3470k() {
        int m;
        do {
            m = m3472m();
            this.f2759b.position(this.f2759b.position() + m);
        } while (m > 0);
    }

    /* renamed from: l */
    private int m3471l() {
        this.f2761d = m3472m();
        int i = 0;
        if (this.f2761d > 0) {
            int i2 = 0;
            while (i < this.f2761d) {
                try {
                    i2 = this.f2761d - i;
                    this.f2759b.get(this.f2758a, i, i2);
                    i += i2;
                } catch (Throwable e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Error Reading Block n: ");
                        stringBuilder.append(i);
                        stringBuilder.append(" count: ");
                        stringBuilder.append(i2);
                        stringBuilder.append(" blockSize: ");
                        stringBuilder.append(this.f2761d);
                        Log.d("GifHeaderParser", stringBuilder.toString(), e);
                    }
                    this.f2760c.f2746b = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: m */
    private int m3472m() {
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
        r0 = r2.f2759b;	 Catch:{ Exception -> 0x0009 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0009 }
        r0 = r0 & 255;
        goto L_0x000f;
    L_0x0009:
        r0 = r2.f2760c;
        r1 = 1;
        r0.f2746b = r1;
        r0 = 0;
    L_0x000f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.c.m():int");
    }

    /* renamed from: n */
    private int m3473n() {
        return this.f2759b.getShort();
    }

    /* renamed from: o */
    private boolean m3474o() {
        return this.f2760c.f2746b != 0;
    }
}
