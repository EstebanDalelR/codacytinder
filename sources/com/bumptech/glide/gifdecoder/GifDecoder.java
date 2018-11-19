package com.bumptech.glide.gifdecoder;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class GifDecoder {
    /* renamed from: a */
    private static final String f2716a = "GifDecoder";
    /* renamed from: b */
    private static final Config f2717b = Config.ARGB_8888;
    /* renamed from: c */
    private int[] f2718c;
    /* renamed from: d */
    private final int[] f2719d = new int[256];
    /* renamed from: e */
    private ByteBuffer f2720e;
    /* renamed from: f */
    private final byte[] f2721f = new byte[256];
    /* renamed from: g */
    private short[] f2722g;
    /* renamed from: h */
    private byte[] f2723h;
    /* renamed from: i */
    private byte[] f2724i;
    /* renamed from: j */
    private byte[] f2725j;
    /* renamed from: k */
    private int[] f2726k;
    /* renamed from: l */
    private int f2727l;
    /* renamed from: m */
    private byte[] f2728m;
    /* renamed from: n */
    private C0992b f2729n;
    /* renamed from: o */
    private BitmapProvider f2730o;
    /* renamed from: p */
    private Bitmap f2731p;
    /* renamed from: q */
    private boolean f2732q;
    /* renamed from: r */
    private int f2733r;

    public interface BitmapProvider {
        Bitmap obtain(int i, int i2, Config config);

        void release(Bitmap bitmap);
    }

    public GifDecoder(BitmapProvider bitmapProvider) {
        this.f2730o = bitmapProvider;
        this.f2729n = new C0992b();
    }

    /* renamed from: a */
    public void m3451a() {
        this.f2727l = (this.f2727l + 1) % this.f2729n.f2747c;
    }

    /* renamed from: a */
    public int m3450a(int i) {
        return (i < 0 || i >= this.f2729n.f2747c) ? -1 : ((C0991a) this.f2729n.f2749e.get(i)).f2742i;
    }

    /* renamed from: b */
    public int m3453b() {
        if (this.f2729n.f2747c > 0) {
            if (this.f2727l >= 0) {
                return m3450a(this.f2727l);
            }
        }
        return -1;
    }

    /* renamed from: c */
    public int m3454c() {
        return this.f2729n.f2747c;
    }

    /* renamed from: d */
    public int m3455d() {
        return this.f2727l;
    }

    /* renamed from: e */
    public int m3456e() {
        if (this.f2729n.f2757m == -1) {
            return 1;
        }
        if (this.f2729n.f2757m == 0) {
            return 0;
        }
        return this.f2729n.f2757m + 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: f */
    public synchronized android.graphics.Bitmap m3457f() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f2729n;	 Catch:{ all -> 0x00ca }
        r0 = r0.f2747c;	 Catch:{ all -> 0x00ca }
        r1 = 3;
        r2 = 1;
        if (r0 <= 0) goto L_0x000d;
    L_0x0009:
        r0 = r7.f2727l;	 Catch:{ all -> 0x00ca }
        if (r0 >= 0) goto L_0x003b;
    L_0x000d:
        r0 = f2716a;	 Catch:{ all -> 0x00ca }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00ca }
        if (r0 == 0) goto L_0x0039;
    L_0x0015:
        r0 = f2716a;	 Catch:{ all -> 0x00ca }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ca }
        r3.<init>();	 Catch:{ all -> 0x00ca }
        r4 = "unable to decode frame, frameCount=";
        r3.append(r4);	 Catch:{ all -> 0x00ca }
        r4 = r7.f2729n;	 Catch:{ all -> 0x00ca }
        r4 = r4.f2747c;	 Catch:{ all -> 0x00ca }
        r3.append(r4);	 Catch:{ all -> 0x00ca }
        r4 = " framePointer=";
        r3.append(r4);	 Catch:{ all -> 0x00ca }
        r4 = r7.f2727l;	 Catch:{ all -> 0x00ca }
        r3.append(r4);	 Catch:{ all -> 0x00ca }
        r3 = r3.toString();	 Catch:{ all -> 0x00ca }
        android.util.Log.d(r0, r3);	 Catch:{ all -> 0x00ca }
    L_0x0039:
        r7.f2733r = r2;	 Catch:{ all -> 0x00ca }
    L_0x003b:
        r0 = r7.f2733r;	 Catch:{ all -> 0x00ca }
        r3 = 0;
        if (r0 == r2) goto L_0x00a8;
    L_0x0040:
        r0 = r7.f2733r;	 Catch:{ all -> 0x00ca }
        r4 = 2;
        if (r0 != r4) goto L_0x0046;
    L_0x0045:
        goto L_0x00a8;
    L_0x0046:
        r0 = 0;
        r7.f2733r = r0;	 Catch:{ all -> 0x00ca }
        r4 = r7.f2729n;	 Catch:{ all -> 0x00ca }
        r4 = r4.f2749e;	 Catch:{ all -> 0x00ca }
        r5 = r7.f2727l;	 Catch:{ all -> 0x00ca }
        r4 = r4.get(r5);	 Catch:{ all -> 0x00ca }
        r4 = (com.bumptech.glide.gifdecoder.C0991a) r4;	 Catch:{ all -> 0x00ca }
        r5 = r7.f2727l;	 Catch:{ all -> 0x00ca }
        r5 = r5 - r2;
        if (r5 < 0) goto L_0x0065;
    L_0x005a:
        r6 = r7.f2729n;	 Catch:{ all -> 0x00ca }
        r6 = r6.f2749e;	 Catch:{ all -> 0x00ca }
        r5 = r6.get(r5);	 Catch:{ all -> 0x00ca }
        r5 = (com.bumptech.glide.gifdecoder.C0991a) r5;	 Catch:{ all -> 0x00ca }
        goto L_0x0066;
    L_0x0065:
        r5 = r3;
    L_0x0066:
        r6 = r4.f2744k;	 Catch:{ all -> 0x00ca }
        if (r6 == 0) goto L_0x006d;
    L_0x006a:
        r6 = r4.f2744k;	 Catch:{ all -> 0x00ca }
        goto L_0x0071;
    L_0x006d:
        r6 = r7.f2729n;	 Catch:{ all -> 0x00ca }
        r6 = r6.f2745a;	 Catch:{ all -> 0x00ca }
    L_0x0071:
        r7.f2718c = r6;	 Catch:{ all -> 0x00ca }
        r6 = r7.f2718c;	 Catch:{ all -> 0x00ca }
        if (r6 != 0) goto L_0x008a;
    L_0x0077:
        r0 = f2716a;	 Catch:{ all -> 0x00ca }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00ca }
        if (r0 == 0) goto L_0x0086;
    L_0x007f:
        r0 = f2716a;	 Catch:{ all -> 0x00ca }
        r1 = "No Valid Color Table";
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x00ca }
    L_0x0086:
        r7.f2733r = r2;	 Catch:{ all -> 0x00ca }
        monitor-exit(r7);
        return r3;
    L_0x008a:
        r1 = r4.f2739f;	 Catch:{ all -> 0x00ca }
        if (r1 == 0) goto L_0x00a2;
    L_0x008e:
        r1 = r7.f2718c;	 Catch:{ all -> 0x00ca }
        r2 = r7.f2719d;	 Catch:{ all -> 0x00ca }
        r3 = r7.f2718c;	 Catch:{ all -> 0x00ca }
        r3 = r3.length;	 Catch:{ all -> 0x00ca }
        java.lang.System.arraycopy(r1, r0, r2, r0, r3);	 Catch:{ all -> 0x00ca }
        r1 = r7.f2719d;	 Catch:{ all -> 0x00ca }
        r7.f2718c = r1;	 Catch:{ all -> 0x00ca }
        r1 = r7.f2718c;	 Catch:{ all -> 0x00ca }
        r2 = r4.f2741h;	 Catch:{ all -> 0x00ca }
        r1[r2] = r0;	 Catch:{ all -> 0x00ca }
    L_0x00a2:
        r0 = r7.m3444a(r4, r5);	 Catch:{ all -> 0x00ca }
        monitor-exit(r7);
        return r0;
    L_0x00a8:
        r0 = f2716a;	 Catch:{ all -> 0x00ca }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00ca }
        if (r0 == 0) goto L_0x00c8;
    L_0x00b0:
        r0 = f2716a;	 Catch:{ all -> 0x00ca }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ca }
        r1.<init>();	 Catch:{ all -> 0x00ca }
        r2 = "Unable to decode frame, status=";
        r1.append(r2);	 Catch:{ all -> 0x00ca }
        r2 = r7.f2733r;	 Catch:{ all -> 0x00ca }
        r1.append(r2);	 Catch:{ all -> 0x00ca }
        r1 = r1.toString();	 Catch:{ all -> 0x00ca }
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x00ca }
    L_0x00c8:
        monitor-exit(r7);
        return r3;
    L_0x00ca:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.GifDecoder.f():android.graphics.Bitmap");
    }

    /* renamed from: g */
    public void m3458g() {
        this.f2729n = null;
        this.f2728m = null;
        this.f2725j = null;
        this.f2726k = null;
        if (this.f2731p != null) {
            this.f2730o.release(this.f2731p);
        }
        this.f2731p = null;
        this.f2720e = null;
    }

    /* renamed from: a */
    public void m3452a(C0992b c0992b, byte[] bArr) {
        this.f2729n = c0992b;
        this.f2728m = bArr;
        this.f2733r = 0;
        this.f2727l = -1;
        this.f2720e = ByteBuffer.wrap(bArr);
        this.f2720e.rewind();
        this.f2720e.order(ByteOrder.LITTLE_ENDIAN);
        this.f2732q = false;
        for (C0991a c0991a : c0992b.f2749e) {
            if (c0991a.f2740g == 3) {
                this.f2732q = 1;
                break;
            }
        }
        this.f2725j = new byte[(c0992b.f2750f * c0992b.f2751g)];
        this.f2726k = new int[(c0992b.f2750f * c0992b.f2751g)];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private android.graphics.Bitmap m3444a(com.bumptech.glide.gifdecoder.C0991a r14, com.bumptech.glide.gifdecoder.C0991a r15) {
        /*
        r13 = this;
        r0 = r13.f2729n;
        r0 = r0.f2750f;
        r1 = r13.f2729n;
        r9 = r1.f2751g;
        r10 = r13.f2726k;
        r11 = 0;
        if (r15 != 0) goto L_0x0010;
    L_0x000d:
        java.util.Arrays.fill(r10, r11);
    L_0x0010:
        r12 = 2;
        if (r15 == 0) goto L_0x0060;
    L_0x0013:
        r1 = r15.f2740g;
        if (r1 <= 0) goto L_0x0060;
    L_0x0017:
        r1 = r15.f2740g;
        if (r1 != r12) goto L_0x004b;
    L_0x001b:
        r1 = r14.f2739f;
        if (r1 != 0) goto L_0x002f;
    L_0x001f:
        r1 = r13.f2729n;
        r1 = r1.f2756l;
        r2 = r14.f2744k;
        if (r2 == 0) goto L_0x0030;
    L_0x0027:
        r2 = r13.f2729n;
        r2 = r2.f2754j;
        r3 = r14.f2741h;
        if (r2 != r3) goto L_0x0030;
    L_0x002f:
        r1 = 0;
    L_0x0030:
        r2 = r15.f2735b;
        r2 = r2 * r0;
        r3 = r15.f2734a;
        r2 = r2 + r3;
        r3 = r15.f2737d;
        r3 = r3 * r0;
        r3 = r3 + r2;
    L_0x003c:
        if (r2 >= r3) goto L_0x0060;
    L_0x003e:
        r4 = r15.f2736c;
        r4 = r4 + r2;
        r5 = r2;
    L_0x0042:
        if (r5 >= r4) goto L_0x0049;
    L_0x0044:
        r10[r5] = r1;
        r5 = r5 + 1;
        goto L_0x0042;
    L_0x0049:
        r2 = r2 + r0;
        goto L_0x003c;
    L_0x004b:
        r15 = r15.f2740g;
        r1 = 3;
        if (r15 != r1) goto L_0x0060;
    L_0x0050:
        r15 = r13.f2731p;
        if (r15 == 0) goto L_0x0060;
    L_0x0054:
        r1 = r13.f2731p;
        r3 = 0;
        r5 = 0;
        r6 = 0;
        r2 = r10;
        r4 = r0;
        r7 = r0;
        r8 = r9;
        r1.getPixels(r2, r3, r4, r5, r6, r7, r8);
    L_0x0060:
        r13.m3446a(r14);
        r15 = 8;
        r1 = 1;
        r15 = 0;
        r2 = 1;
        r3 = 8;
    L_0x006a:
        r4 = r14.f2737d;
        if (r11 >= r4) goto L_0x00c8;
    L_0x006e:
        r4 = r14.f2738e;
        if (r4 == 0) goto L_0x0087;
    L_0x0072:
        r4 = r14.f2737d;
        r5 = 4;
        if (r15 < r4) goto L_0x0084;
    L_0x0077:
        r2 = r2 + 1;
        switch(r2) {
            case 2: goto L_0x0083;
            case 3: goto L_0x0080;
            case 4: goto L_0x007d;
            default: goto L_0x007c;
        };
    L_0x007c:
        goto L_0x0084;
    L_0x007d:
        r15 = 1;
        r3 = 2;
        goto L_0x0084;
    L_0x0080:
        r15 = 2;
        r3 = 4;
        goto L_0x0084;
    L_0x0083:
        r15 = 4;
    L_0x0084:
        r4 = r15 + r3;
        goto L_0x0089;
    L_0x0087:
        r4 = r15;
        r15 = r11;
    L_0x0089:
        r5 = r14.f2735b;
        r15 = r15 + r5;
        r5 = r13.f2729n;
        r5 = r5.f2751g;
        if (r15 >= r5) goto L_0x00c4;
    L_0x0092:
        r5 = r13.f2729n;
        r5 = r5.f2750f;
        r15 = r15 * r5;
        r5 = r14.f2734a;
        r5 = r5 + r15;
        r6 = r14.f2736c;
        r6 = r6 + r5;
        r7 = r13.f2729n;
        r7 = r7.f2750f;
        r7 = r7 + r15;
        if (r7 >= r6) goto L_0x00aa;
    L_0x00a5:
        r6 = r13.f2729n;
        r6 = r6.f2750f;
        r6 = r6 + r15;
    L_0x00aa:
        r15 = r14.f2736c;
        r15 = r15 * r11;
    L_0x00ae:
        if (r5 >= r6) goto L_0x00c4;
    L_0x00b0:
        r7 = r13.f2725j;
        r8 = r15 + 1;
        r15 = r7[r15];
        r15 = r15 & 255;
        r7 = r13.f2718c;
        r15 = r7[r15];
        if (r15 == 0) goto L_0x00c0;
    L_0x00be:
        r10[r5] = r15;
    L_0x00c0:
        r5 = r5 + 1;
        r15 = r8;
        goto L_0x00ae;
    L_0x00c4:
        r11 = r11 + 1;
        r15 = r4;
        goto L_0x006a;
    L_0x00c8:
        r15 = r13.f2732q;
        if (r15 == 0) goto L_0x00ea;
    L_0x00cc:
        r15 = r14.f2740g;
        if (r15 == 0) goto L_0x00d4;
    L_0x00d0:
        r14 = r14.f2740g;
        if (r14 != r1) goto L_0x00ea;
    L_0x00d4:
        r14 = r13.f2731p;
        if (r14 != 0) goto L_0x00de;
    L_0x00d8:
        r14 = r13.m3449j();
        r13.f2731p = r14;
    L_0x00de:
        r1 = r13.f2731p;
        r3 = 0;
        r5 = 0;
        r6 = 0;
        r2 = r10;
        r4 = r0;
        r7 = r0;
        r8 = r9;
        r1.setPixels(r2, r3, r4, r5, r6, r7, r8);
    L_0x00ea:
        r14 = r13.m3449j();
        r3 = 0;
        r5 = 0;
        r6 = 0;
        r1 = r14;
        r2 = r10;
        r4 = r0;
        r7 = r0;
        r8 = r9;
        r1.setPixels(r2, r3, r4, r5, r6, r7, r8);
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.GifDecoder.a(com.bumptech.glide.gifdecoder.a, com.bumptech.glide.gifdecoder.a):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private void m3446a(C0991a c0991a) {
        int i;
        int i2;
        GifDecoder gifDecoder = this;
        C0991a c0991a2 = c0991a;
        if (c0991a2 != null) {
            gifDecoder.f2720e.position(c0991a2.f2743j);
        }
        if (c0991a2 == null) {
            i = gifDecoder.f2729n.f2750f * gifDecoder.f2729n.f2751g;
        } else {
            i = c0991a2.f2737d * c0991a2.f2736c;
        }
        if (gifDecoder.f2725j == null || gifDecoder.f2725j.length < i) {
            gifDecoder.f2725j = new byte[i];
        }
        if (gifDecoder.f2722g == null) {
            gifDecoder.f2722g = new short[4096];
        }
        if (gifDecoder.f2723h == null) {
            gifDecoder.f2723h = new byte[4096];
        }
        if (gifDecoder.f2724i == null) {
            gifDecoder.f2724i = new byte[4097];
        }
        int h = m3447h();
        int i3 = 1;
        int i4 = 1 << h;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        h++;
        int i7 = (1 << h) - 1;
        for (i2 = 0; i2 < i4; i2++) {
            gifDecoder.f2722g[i2] = (short) 0;
            gifDecoder.f2723h[i2] = (byte) i2;
        }
        i2 = -1;
        int i8 = h;
        int i9 = i6;
        int i10 = i7;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -1;
        while (i11 < i) {
            int i20;
            int i21 = 3;
            if (i12 == 0) {
                i12 = m3448i();
                if (i12 <= 0) {
                    gifDecoder.f2733r = 3;
                    break;
                }
                i15 = 0;
            }
            i14 += (gifDecoder.f2721f[i15] & 255) << i16;
            i15 += i3;
            i12 += i2;
            int i22 = i16 + 8;
            int i23 = i17;
            i3 = i19;
            i16 = i11;
            i17 = i13;
            i13 = i9;
            i11 = i8;
            while (i22 >= i11) {
                i2 = i14 & i10;
                i14 >>= i11;
                i22 -= i11;
                if (i2 != i4) {
                    if (i2 > i13) {
                        gifDecoder.f2733r = i21;
                    } else if (i2 != i5) {
                        if (i3 == -1) {
                            i9 = i18 + 1;
                            gifDecoder.f2724i[i18] = gifDecoder.f2723h[i2];
                            i3 = i2;
                            i23 = i3;
                            i18 = i9;
                        } else {
                            int i24;
                            int i25;
                            if (i2 >= i13) {
                                i9 = i18 + 1;
                                i24 = h;
                                gifDecoder.f2724i[i18] = (byte) i23;
                                h = i3;
                                i18 = i9;
                            } else {
                                i24 = h;
                                h = i2;
                            }
                            while (h >= i4) {
                                i9 = i18 + 1;
                                i25 = i22;
                                gifDecoder.f2724i[i18] = gifDecoder.f2723h[h];
                                h = gifDecoder.f2722g[h];
                                i18 = i9;
                                i22 = i25;
                            }
                            i25 = i22;
                            h = gifDecoder.f2723h[h] & 255;
                            i21 = i18 + 1;
                            i20 = i4;
                            byte b = (byte) h;
                            gifDecoder.f2724i[i18] = b;
                            if (i13 < 4096) {
                                gifDecoder.f2722g[i13] = (short) i3;
                                gifDecoder.f2723h[i13] = b;
                                i13++;
                                if ((i13 & i10) == 0) {
                                    if (i13 < 4096) {
                                        i11++;
                                        i10 += i13;
                                    }
                                }
                            }
                            i18 = i21;
                            while (i18 > 0) {
                                i18--;
                                i4 = i17 + 1;
                                gifDecoder.f2725j[i17] = gifDecoder.f2724i[i18];
                                i16++;
                                i17 = i4;
                            }
                            i23 = h;
                            i3 = i2;
                            h = i24;
                            i22 = i25;
                            i4 = i20;
                        }
                        i21 = 3;
                    }
                    i19 = i3;
                    i8 = i11;
                    i9 = i13;
                    i11 = i16;
                    i13 = i17;
                    i17 = i23;
                    i3 = 1;
                    i2 = -1;
                    i16 = i22;
                    break;
                }
                i11 = h;
                i13 = i6;
                i10 = i7;
                i3 = -1;
                i2 = -1;
            }
            i20 = i4;
            i19 = i3;
            i8 = i11;
            i9 = i13;
            i11 = i16;
            i13 = i17;
            i3 = 1;
            i17 = i23;
            i16 = i22;
            h = h;
        }
        while (i13 < i) {
            gifDecoder.f2725j[i13] = (byte) 0;
            i13++;
        }
    }

    /* renamed from: h */
    private int m3447h() {
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
        r0 = r1.f2720e;	 Catch:{ Exception -> 0x0009 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0009 }
        r0 = r0 & 255;
        goto L_0x000d;
    L_0x0009:
        r0 = 1;
        r1.f2733r = r0;
        r0 = 0;
    L_0x000d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.GifDecoder.h():int");
    }

    /* renamed from: i */
    private int m3448i() {
        int h = m3447h();
        int i = 0;
        if (h > 0) {
            while (i < h) {
                int i2 = h - i;
                try {
                    this.f2720e.get(this.f2721f, i, i2);
                    i += i2;
                } catch (Throwable e) {
                    Log.w(f2716a, "Error Reading Block", e);
                    this.f2733r = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: j */
    private Bitmap m3449j() {
        Bitmap obtain = this.f2730o.obtain(this.f2729n.f2750f, this.f2729n.f2751g, f2717b);
        if (obtain == null) {
            obtain = Bitmap.createBitmap(this.f2729n.f2750f, this.f2729n.f2751g, f2717b);
        }
        m3445a(obtain);
        return obtain;
    }

    @TargetApi(12)
    /* renamed from: a */
    private static void m3445a(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
    }
}
