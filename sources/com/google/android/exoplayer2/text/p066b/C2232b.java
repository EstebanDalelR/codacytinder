package com.google.android.exoplayer2.text.p066b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region.Op;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.C2301j;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.b.b */
final class C2232b {
    /* renamed from: a */
    private static final byte[] f6550a = new byte[]{(byte) 0, (byte) 7, (byte) 8, (byte) 15};
    /* renamed from: b */
    private static final byte[] f6551b = new byte[]{(byte) 0, (byte) 119, (byte) -120, (byte) -1};
    /* renamed from: c */
    private static final byte[] f6552c = new byte[]{(byte) 0, (byte) 17, (byte) 34, (byte) 51, (byte) 68, (byte) 85, (byte) 102, (byte) 119, (byte) -120, (byte) -103, (byte) -86, (byte) -69, (byte) -52, (byte) -35, (byte) -18, (byte) -1};
    /* renamed from: d */
    private final Paint f6553d = new Paint();
    /* renamed from: e */
    private final Paint f6554e;
    /* renamed from: f */
    private final Canvas f6555f;
    /* renamed from: g */
    private final C2225b f6556g;
    /* renamed from: h */
    private final C2224a f6557h;
    /* renamed from: i */
    private final C2231h f6558i;
    /* renamed from: j */
    private Bitmap f6559j;

    /* renamed from: com.google.android.exoplayer2.text.b.b$a */
    private static final class C2224a {
        /* renamed from: a */
        public final int f6504a;
        /* renamed from: b */
        public final int[] f6505b;
        /* renamed from: c */
        public final int[] f6506c;
        /* renamed from: d */
        public final int[] f6507d;

        public C2224a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f6504a = i;
            this.f6505b = iArr;
            this.f6506c = iArr2;
            this.f6507d = iArr3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$b */
    private static final class C2225b {
        /* renamed from: a */
        public final int f6508a;
        /* renamed from: b */
        public final int f6509b;
        /* renamed from: c */
        public final int f6510c;
        /* renamed from: d */
        public final int f6511d;
        /* renamed from: e */
        public final int f6512e;
        /* renamed from: f */
        public final int f6513f;

        public C2225b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f6508a = i;
            this.f6509b = i2;
            this.f6510c = i3;
            this.f6511d = i4;
            this.f6512e = i5;
            this.f6513f = i6;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$c */
    private static final class C2226c {
        /* renamed from: a */
        public final int f6514a;
        /* renamed from: b */
        public final boolean f6515b;
        /* renamed from: c */
        public final byte[] f6516c;
        /* renamed from: d */
        public final byte[] f6517d;

        public C2226c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f6514a = i;
            this.f6515b = z;
            this.f6516c = bArr;
            this.f6517d = bArr2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$d */
    private static final class C2227d {
        /* renamed from: a */
        public final int f6518a;
        /* renamed from: b */
        public final int f6519b;
        /* renamed from: c */
        public final int f6520c;
        /* renamed from: d */
        public final SparseArray<C2228e> f6521d;

        public C2227d(int i, int i2, int i3, SparseArray<C2228e> sparseArray) {
            this.f6518a = i;
            this.f6519b = i2;
            this.f6520c = i3;
            this.f6521d = sparseArray;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$e */
    private static final class C2228e {
        /* renamed from: a */
        public final int f6522a;
        /* renamed from: b */
        public final int f6523b;

        public C2228e(int i, int i2) {
            this.f6522a = i;
            this.f6523b = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$f */
    private static final class C2229f {
        /* renamed from: a */
        public final int f6524a;
        /* renamed from: b */
        public final boolean f6525b;
        /* renamed from: c */
        public final int f6526c;
        /* renamed from: d */
        public final int f6527d;
        /* renamed from: e */
        public final int f6528e;
        /* renamed from: f */
        public final int f6529f;
        /* renamed from: g */
        public final int f6530g;
        /* renamed from: h */
        public final int f6531h;
        /* renamed from: i */
        public final int f6532i;
        /* renamed from: j */
        public final int f6533j;
        /* renamed from: k */
        public final SparseArray<C2230g> f6534k;

        public C2229f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C2230g> sparseArray) {
            this.f6524a = i;
            this.f6525b = z;
            this.f6526c = i2;
            this.f6527d = i3;
            this.f6528e = i4;
            this.f6529f = i5;
            this.f6530g = i6;
            this.f6531h = i7;
            this.f6532i = i8;
            this.f6533j = i9;
            this.f6534k = sparseArray;
        }

        /* renamed from: a */
        public void m7959a(C2229f c2229f) {
            if (c2229f != null) {
                c2229f = c2229f.f6534k;
                for (int i = 0; i < c2229f.size(); i++) {
                    this.f6534k.put(c2229f.keyAt(i), c2229f.valueAt(i));
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$g */
    private static final class C2230g {
        /* renamed from: a */
        public final int f6535a;
        /* renamed from: b */
        public final int f6536b;
        /* renamed from: c */
        public final int f6537c;
        /* renamed from: d */
        public final int f6538d;
        /* renamed from: e */
        public final int f6539e;
        /* renamed from: f */
        public final int f6540f;

        public C2230g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f6535a = i;
            this.f6536b = i2;
            this.f6537c = i3;
            this.f6538d = i4;
            this.f6539e = i5;
            this.f6540f = i6;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$h */
    private static final class C2231h {
        /* renamed from: a */
        public final int f6541a;
        /* renamed from: b */
        public final int f6542b;
        /* renamed from: c */
        public final SparseArray<C2229f> f6543c = new SparseArray();
        /* renamed from: d */
        public final SparseArray<C2224a> f6544d = new SparseArray();
        /* renamed from: e */
        public final SparseArray<C2226c> f6545e = new SparseArray();
        /* renamed from: f */
        public final SparseArray<C2224a> f6546f = new SparseArray();
        /* renamed from: g */
        public final SparseArray<C2226c> f6547g = new SparseArray();
        /* renamed from: h */
        public C2225b f6548h;
        /* renamed from: i */
        public C2227d f6549i;

        public C2231h(int i, int i2) {
            this.f6541a = i;
            this.f6542b = i2;
        }

        /* renamed from: a */
        public void m7960a() {
            this.f6543c.clear();
            this.f6544d.clear();
            this.f6545e.clear();
            this.f6546f.clear();
            this.f6547g.clear();
            this.f6548h = null;
            this.f6549i = null;
        }
    }

    /* renamed from: a */
    private static int m7961a(int i, int i2, int i3, int i4) {
        return (((i << 24) | (i2 << 16)) | (i3 << 8)) | i4;
    }

    public C2232b(int i, int i2) {
        this.f6553d.setStyle(Style.FILL_AND_STROKE);
        this.f6553d.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.f6553d.setPathEffect(null);
        this.f6554e = new Paint();
        this.f6554e.setStyle(Style.FILL);
        this.f6554e.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        this.f6554e.setPathEffect(null);
        this.f6555f = new Canvas();
        this.f6556g = new C2225b(719, 575, 0, 719, 0, 575);
        this.f6557h = new C2224a(0, C2232b.m7972b(), C2232b.m7975c(), C2232b.m7976d());
        this.f6558i = new C2231h(i, i2);
    }

    /* renamed from: a */
    public void m7978a() {
        this.f6558i.m7960a();
    }

    /* renamed from: a */
    public List<Cue> m7977a(byte[] bArr, int i) {
        C2232b c2232b = this;
        C2301j c2301j = new C2301j(bArr, i);
        while (c2301j.m8363a() >= 48 && c2301j.m8373c(8) == 15) {
            C2232b.m7966a(c2301j, c2232b.f6558i);
        }
        if (c2232b.f6558i.f6549i == null) {
            return Collections.emptyList();
        }
        C2225b c2225b = c2232b.f6558i.f6548h != null ? c2232b.f6558i.f6548h : c2232b.f6556g;
        if (!(c2232b.f6559j != null && c2225b.f6508a + 1 == c2232b.f6559j.getWidth() && c2225b.f6509b + 1 == c2232b.f6559j.getHeight())) {
            c2232b.f6559j = Bitmap.createBitmap(c2225b.f6508a + 1, c2225b.f6509b + 1, Config.ARGB_8888);
            c2232b.f6555f.setBitmap(c2232b.f6559j);
        }
        List<Cue> arrayList = new ArrayList();
        SparseArray sparseArray = c2232b.f6558i.f6549i.f6521d;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            C2228e c2228e = (C2228e) sparseArray.valueAt(i2);
            C2229f c2229f = (C2229f) c2232b.f6558i.f6543c.get(sparseArray.keyAt(i2));
            int i3 = c2228e.f6522a + c2225b.f6510c;
            int i4 = c2228e.f6523b + c2225b.f6512e;
            float f = (float) i3;
            float f2 = (float) i4;
            float f3 = f2;
            float f4 = f;
            c2232b.f6555f.clipRect(f, f2, (float) Math.min(c2229f.f6526c + i3, c2225b.f6511d), (float) Math.min(c2229f.f6527d + i4, c2225b.f6513f), Op.REPLACE);
            C2224a c2224a = (C2224a) c2232b.f6558i.f6544d.get(c2229f.f6530g);
            if (c2224a == null) {
                c2224a = (C2224a) c2232b.f6558i.f6546f.get(c2229f.f6530g);
                if (c2224a == null) {
                    c2224a = c2232b.f6557h;
                }
            }
            SparseArray sparseArray2 = c2229f.f6534k;
            int i5 = 0;
            while (i5 < sparseArray2.size()) {
                int i6;
                SparseArray sparseArray3;
                int keyAt = sparseArray2.keyAt(i5);
                C2230g c2230g = (C2230g) sparseArray2.valueAt(i5);
                C2226c c2226c = (C2226c) c2232b.f6558i.f6545e.get(keyAt);
                C2226c c2226c2 = c2226c == null ? (C2226c) c2232b.f6558i.f6547g.get(keyAt) : c2226c;
                if (c2226c2 != null) {
                    i6 = i5;
                    sparseArray3 = sparseArray2;
                    C2232b.m7965a(c2226c2, c2224a, c2229f.f6529f, c2230g.f6537c + i3, i4 + c2230g.f6538d, c2226c2.f6515b ? null : c2232b.f6553d, c2232b.f6555f);
                } else {
                    i6 = i5;
                    sparseArray3 = sparseArray2;
                }
                i5 = i6 + 1;
                sparseArray2 = sparseArray3;
            }
            if (c2229f.f6525b) {
                int i7;
                if (c2229f.f6529f == 3) {
                    i7 = c2224a.f6507d[c2229f.f6531h];
                } else if (c2229f.f6529f == 2) {
                    i7 = c2224a.f6506c[c2229f.f6532i];
                } else {
                    i7 = c2224a.f6505b[c2229f.f6533j];
                }
                c2232b.f6554e.setColor(i7);
                c2232b.f6555f.drawRect(f4, f3, (float) (c2229f.f6526c + i3), (float) (c2229f.f6527d + i4), c2232b.f6554e);
            }
            arrayList.add(new Cue(Bitmap.createBitmap(c2232b.f6559j, i3, i4, c2229f.f6526c, c2229f.f6527d), f4 / ((float) c2225b.f6508a), 0, f3 / ((float) c2225b.f6509b), 0, ((float) c2229f.f6526c) / ((float) c2225b.f6508a), ((float) c2229f.f6527d) / ((float) c2225b.f6509b)));
            c2232b.f6555f.drawColor(0, Mode.CLEAR);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m7966a(C2301j c2301j, C2231h c2231h) {
        int c = c2301j.m8373c(8);
        int c2 = c2301j.m8373c(16);
        int c3 = c2301j.m8373c(16);
        int c4 = c2301j.m8372c() + c3;
        if (c3 * 8 > c2301j.m8363a()) {
            Log.w("DvbParser", "Data field length exceeds limit");
            c2301j.m8370b(c2301j.m8363a());
            return;
        }
        C2227d c2227d;
        switch (c) {
            case 16:
                if (c2 == c2231h.f6541a) {
                    c2227d = c2231h.f6549i;
                    C2227d a = C2232b.m7964a(c2301j, c3);
                    if (a.f6520c == 0) {
                        if (!(c2227d == null || c2227d.f6519b == a.f6519b)) {
                            c2231h.f6549i = a;
                            break;
                        }
                    }
                    c2231h.f6549i = a;
                    c2231h.f6543c.clear();
                    c2231h.f6544d.clear();
                    c2231h.f6545e.clear();
                    break;
                }
                break;
            case 17:
                c2227d = c2231h.f6549i;
                if (c2 == c2231h.f6541a && c2227d != null) {
                    C2229f b = C2232b.m7971b(c2301j, c3);
                    if (c2227d.f6520c == 0) {
                        b.m7959a((C2229f) c2231h.f6543c.get(b.f6524a));
                    }
                    c2231h.f6543c.put(b.f6524a, b);
                    break;
                }
            case 18:
                C2224a c5;
                if (c2 != c2231h.f6541a) {
                    if (c2 == c2231h.f6542b) {
                        c5 = C2232b.m7974c(c2301j, c3);
                        c2231h.f6546f.put(c5.f6504a, c5);
                        break;
                    }
                }
                c5 = C2232b.m7974c(c2301j, c3);
                c2231h.f6544d.put(c5.f6504a, c5);
                break;
                break;
            case 19:
                C2226c b2;
                if (c2 != c2231h.f6541a) {
                    if (c2 == c2231h.f6542b) {
                        b2 = C2232b.m7970b(c2301j);
                        c2231h.f6547g.put(b2.f6514a, b2);
                        break;
                    }
                }
                b2 = C2232b.m7970b(c2301j);
                c2231h.f6545e.put(b2.f6514a, b2);
                break;
                break;
            case 20:
                if (c2 == c2231h.f6541a) {
                    c2231h.f6548h = C2232b.m7963a(c2301j);
                    break;
                }
                break;
            default:
                break;
        }
        c2301j.m8375d(c4 - c2301j.m8372c());
    }

    /* renamed from: a */
    private static C2225b m7963a(C2301j c2301j) {
        int c;
        int c2;
        int i;
        int i2;
        c2301j.m8370b(4);
        boolean e = c2301j.m8376e();
        c2301j.m8370b(3);
        int c3 = c2301j.m8373c(16);
        int c4 = c2301j.m8373c(16);
        if (e) {
            int c5 = c2301j.m8373c(16);
            int c6 = c2301j.m8373c(16);
            c = c2301j.m8373c(16);
            c2 = c2301j.m8373c(16);
            i = c6;
            i2 = c;
            c = c5;
        } else {
            i = c3;
            c2 = c4;
            c = 0;
            i2 = 0;
        }
        return new C2225b(c3, c4, c, i, i2, c2);
    }

    /* renamed from: a */
    private static C2227d m7964a(C2301j c2301j, int i) {
        int c = c2301j.m8373c(8);
        int c2 = c2301j.m8373c(4);
        int c3 = c2301j.m8373c(2);
        c2301j.m8370b(2);
        i -= 2;
        SparseArray sparseArray = new SparseArray();
        while (i > 0) {
            int c4 = c2301j.m8373c(8);
            c2301j.m8370b(8);
            i -= 6;
            sparseArray.put(c4, new C2228e(c2301j.m8373c(16), c2301j.m8373c(16)));
        }
        return new C2227d(c, c2, c3, sparseArray);
    }

    /* renamed from: b */
    private static C2229f m7971b(C2301j c2301j, int i) {
        C2301j c2301j2 = c2301j;
        int c = c2301j2.m8373c(8);
        c2301j2.m8370b(4);
        boolean e = c2301j.m8376e();
        c2301j2.m8370b(3);
        int i2 = 16;
        int c2 = c2301j2.m8373c(16);
        int c3 = c2301j2.m8373c(16);
        int c4 = c2301j2.m8373c(3);
        int c5 = c2301j2.m8373c(3);
        int i3 = 2;
        c2301j2.m8370b(2);
        int c6 = c2301j2.m8373c(8);
        int c7 = c2301j2.m8373c(8);
        int c8 = c2301j2.m8373c(4);
        int c9 = c2301j2.m8373c(2);
        c2301j2.m8370b(2);
        int i4 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int i5;
            int i6;
            int c10 = c2301j2.m8373c(i2);
            i2 = c2301j2.m8373c(i3);
            int c11 = c2301j2.m8373c(i3);
            int c12 = c2301j2.m8373c(12);
            int i7 = c9;
            c2301j2.m8370b(4);
            int c13 = c2301j2.m8373c(12);
            i4 -= 6;
            if (i2 != 1) {
                if (i2 != 2) {
                    i5 = 0;
                    i6 = 0;
                    sparseArray.put(c10, new C2230g(i2, c11, c12, c13, i5, i6));
                    c9 = i7;
                    i3 = 2;
                    i2 = 16;
                }
            }
            i4 -= 2;
            i5 = c2301j2.m8373c(8);
            i6 = c2301j2.m8373c(8);
            sparseArray.put(c10, new C2230g(i2, c11, c12, c13, i5, i6));
            c9 = i7;
            i3 = 2;
            i2 = 16;
        }
        return new C2229f(c, e, c2, c3, c4, c5, c6, c7, c8, c9, sparseArray);
    }

    /* renamed from: c */
    private static C2224a m7974c(C2301j c2301j, int i) {
        C2301j c2301j2 = c2301j;
        int i2 = 8;
        int c = c2301j2.m8373c(8);
        c2301j2.m8370b(8);
        int i3 = 2;
        int i4 = i - 2;
        int[] b = C2232b.m7972b();
        int[] c2 = C2232b.m7975c();
        int[] d = C2232b.m7976d();
        while (i4 > 0) {
            int c3;
            int c4;
            int c5;
            int c6 = c2301j2.m8373c(i2);
            int c7 = c2301j2.m8373c(i2);
            i4 -= 2;
            int[] iArr = (c7 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? b : (c7 & 64) != 0 ? c2 : d;
            if ((c7 & 1) != 0) {
                c7 = c2301j2.m8373c(i2);
                c3 = c2301j2.m8373c(i2);
                c4 = c2301j2.m8373c(i2);
                c5 = c2301j2.m8373c(i2);
                i4 -= 4;
            } else {
                c4 = c2301j2.m8373c(4) << 4;
                i4 -= 2;
                c5 = c2301j2.m8373c(i3) << 6;
                c7 = c2301j2.m8373c(6) << i3;
                c3 = c2301j2.m8373c(4) << 4;
            }
            if (c7 == 0) {
                c3 = 0;
                c4 = 0;
                c5 = 255;
            }
            int i5 = i4;
            double d2 = (double) c7;
            int i6 = c;
            double d3 = (double) (c3 - 128);
            double d4 = (double) (c4 - 128);
            iArr[c6] = C2232b.m7961a((byte) (255 - (c5 & 255)), C2314v.m8456a((int) (d2 + (1.402d * d3)), 0, 255), C2314v.m8456a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), C2314v.m8456a((int) (d2 + (d4 * 1.772d)), 0, 255));
            i4 = i5;
            c = i6;
            i2 = 8;
            i3 = 2;
        }
        return new C2224a(c, b, c2, d);
    }

    /* renamed from: b */
    private static C2226c m7970b(C2301j c2301j) {
        byte[] bArr;
        int c = c2301j.m8373c(16);
        c2301j.m8370b(4);
        int c2 = c2301j.m8373c(2);
        boolean e = c2301j.m8376e();
        c2301j.m8370b(1);
        byte[] bArr2 = null;
        if (c2 == 1) {
            c2301j.m8370b(c2301j.m8373c(8) * 16);
        } else if (c2 == 0) {
            c2 = c2301j.m8373c(16);
            int c3 = c2301j.m8373c(16);
            if (c2 > 0) {
                bArr2 = new byte[c2];
                c2301j.m8371b(bArr2, 0, c2);
            }
            if (c3 > 0) {
                bArr = new byte[c3];
                c2301j.m8371b(bArr, 0, c3);
                return new C2226c(c, e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C2226c(c, e, bArr2, bArr);
    }

    /* renamed from: b */
    private static int[] m7972b() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: c */
    private static int[] m7975c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                iArr[i] = C2232b.m7961a(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = C2232b.m7961a(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: d */
    private static int[] m7976d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = 255;
            int i3;
            int i4;
            if (i < 8) {
                i3 = (i & 1) != 0 ? 255 : 0;
                i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = C2232b.m7961a(63, i3, i4, i2);
            } else {
                i3 = i & 136;
                i4 = 170;
                int i5 = 85;
                int i6;
                if (i3 == 0) {
                    i6 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    i3 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i5 = 0;
                    }
                    if ((i & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i] = C2232b.m7961a(255, i6, i3, i5 + i4);
                } else if (i3 != 8) {
                    i4 = 43;
                    if (i3 == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                        i6 = (((i & 1) != 0 ? 43 : 0) + 127) + ((i & 16) != 0 ? 85 : 0);
                        i3 = (((i & 2) != 0 ? 43 : 0) + 127) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i4 = 0;
                        }
                        i4 += 127;
                        if ((i & 64) == 0) {
                            i5 = 0;
                        }
                        iArr[i] = C2232b.m7961a(255, i6, i3, i4 + i5);
                    } else if (i3 == 136) {
                        i6 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        i3 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i4 = 0;
                        }
                        if ((i & 64) == 0) {
                            i5 = 0;
                        }
                        iArr[i] = C2232b.m7961a(255, i6, i3, i4 + i5);
                    }
                } else {
                    i6 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    i2 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i5 = 0;
                    }
                    if ((i & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i] = C2232b.m7961a(127, i6, i2, i5 + i4);
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    private static void m7965a(C2226c c2226c, C2224a c2224a, int i, int i2, int i3, Paint paint, Canvas canvas) {
        if (i == 3) {
            c2224a = c2224a.f6507d;
        } else if (i == 2) {
            c2224a = c2224a.f6506c;
        } else {
            c2224a = c2224a.f6505b;
        }
        int[] iArr = c2224a;
        int i4 = i;
        int i5 = i2;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        C2232b.m7967a(c2226c.f6516c, iArr, i4, i5, i3, paint2, canvas2);
        C2232b.m7967a(c2226c.f6517d, iArr, i4, i5, i3 + 1, paint2, canvas2);
    }

    /* renamed from: a */
    private static void m7967a(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int i4 = i;
        C2301j c2301j = new C2301j(bArr);
        int i5 = i2;
        int i6 = i3;
        byte[] bArr2 = null;
        byte[] bArr3 = bArr2;
        while (c2301j.m8363a() != 0) {
            int c = c2301j.m8373c(8);
            if (c != 240) {
                int a;
                byte[] bArr4;
                switch (c) {
                    case 16:
                        byte[] bArr5;
                        if (i4 != 3) {
                            if (i4 != 2) {
                                bArr5 = null;
                                a = C2232b.m7962a(c2301j, iArr, bArr5, i5, i6, paint, canvas);
                                c2301j.m8377f();
                                break;
                            }
                            bArr4 = bArr3 == null ? f6550a : bArr3;
                        } else {
                            bArr4 = bArr2 == null ? f6551b : bArr2;
                        }
                        bArr5 = bArr4;
                        a = C2232b.m7962a(c2301j, iArr, bArr5, i5, i6, paint, canvas);
                        c2301j.m8377f();
                    case 17:
                        a = C2232b.m7969b(c2301j, iArr, i4 == 3 ? f6552c : null, i5, i6, paint, canvas);
                        c2301j.m8377f();
                        break;
                    case 18:
                        a = C2232b.m7973c(c2301j, iArr, null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (c) {
                            case 32:
                                bArr3 = C2232b.m7968a(4, 4, c2301j);
                                continue;
                            case 33:
                                bArr4 = C2232b.m7968a(4, 8, c2301j);
                                break;
                            case 34:
                                bArr4 = C2232b.m7968a(16, 8, c2301j);
                                break;
                            default:
                                continue;
                                continue;
                        }
                        bArr2 = bArr4;
                        break;
                }
                i5 = a;
            } else {
                i6 += 2;
                i5 = i2;
            }
        }
    }

    /* renamed from: a */
    private static int m7962a(C2301j c2301j, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        C2301j c2301j2 = c2301j;
        int i3 = i2;
        Paint paint2 = paint;
        int i4 = i;
        Object obj = null;
        while (true) {
            Object obj2;
            int i5;
            int i6;
            Canvas canvas2;
            int c = c2301j2.m8373c(2);
            if (c != 0) {
                obj2 = obj;
                i5 = c;
            } else {
                if (!c2301j2.m8376e()) {
                    if (!c2301j2.m8376e()) {
                        switch (c2301j2.m8373c(2)) {
                            case 0:
                                i5 = 0;
                                i6 = 0;
                                obj2 = 1;
                                break;
                            case 1:
                                obj2 = obj;
                                i5 = 0;
                                i6 = 2;
                                break;
                            case 2:
                                c = c2301j2.m8373c(4) + 12;
                                i5 = c2301j2.m8373c(2);
                                break;
                            case 3:
                                c = c2301j2.m8373c(8) + 29;
                                i5 = c2301j2.m8373c(2);
                                break;
                            default:
                                obj2 = obj;
                                i5 = 0;
                                i6 = 0;
                                break;
                        }
                    }
                    obj2 = obj;
                    i5 = 0;
                } else {
                    c = 3 + c2301j2.m8373c(3);
                    i5 = c2301j2.m8373c(2);
                }
                obj2 = obj;
                i6 = c;
                if (!(i6 == 0 || paint2 == null)) {
                    if (bArr != null) {
                        i5 = bArr[i5];
                    }
                    paint2.setColor(iArr[i5]);
                    canvas2 = canvas;
                    canvas2.drawRect((float) i4, (float) i3, (float) (i4 + i6), (float) (i3 + 1), paint2);
                }
                i4 += i6;
                if (obj2 != null) {
                    return i4;
                }
                obj = obj2;
            }
            i6 = 1;
            if (bArr != null) {
                i5 = bArr[i5];
            }
            paint2.setColor(iArr[i5]);
            canvas2 = canvas;
            canvas2.drawRect((float) i4, (float) i3, (float) (i4 + i6), (float) (i3 + 1), paint2);
            i4 += i6;
            if (obj2 != null) {
                return i4;
            }
            obj = obj2;
        }
    }

    /* renamed from: b */
    private static int m7969b(C2301j c2301j, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        C2301j c2301j2 = c2301j;
        int i3 = i2;
        Paint paint2 = paint;
        int i4 = i;
        Object obj = null;
        while (true) {
            Object obj2;
            int i5;
            int i6;
            Canvas canvas2;
            int c = c2301j2.m8373c(4);
            if (c != 0) {
                obj2 = obj;
                i5 = c;
            } else {
                if (c2301j2.m8376e()) {
                    if (c2301j2.m8376e()) {
                        switch (c2301j2.m8373c(2)) {
                            case 0:
                                obj2 = obj;
                                i5 = 0;
                                break;
                            case 1:
                                obj2 = obj;
                                i5 = 0;
                                i6 = 2;
                                break;
                            case 2:
                                c = c2301j2.m8373c(4) + 9;
                                i5 = c2301j2.m8373c(4);
                                break;
                            case 3:
                                c = c2301j2.m8373c(8) + 25;
                                i5 = c2301j2.m8373c(4);
                                break;
                            default:
                                obj2 = obj;
                                i5 = 0;
                                i6 = 0;
                                break;
                        }
                    }
                    c = c2301j2.m8373c(2) + 4;
                    i5 = c2301j2.m8373c(4);
                    obj2 = obj;
                    i6 = c;
                } else {
                    i5 = c2301j2.m8373c(3);
                    if (i5 != 0) {
                        obj2 = obj;
                        i6 = i5 + 2;
                        i5 = 0;
                    } else {
                        i5 = 0;
                        i6 = 0;
                        obj2 = 1;
                    }
                }
                if (!(i6 == 0 || paint2 == null)) {
                    if (bArr != null) {
                        i5 = bArr[i5];
                    }
                    paint2.setColor(iArr[i5]);
                    canvas2 = canvas;
                    canvas2.drawRect((float) i4, (float) i3, (float) (i4 + i6), (float) (i3 + 1), paint2);
                }
                i4 += i6;
                if (obj2 != null) {
                    return i4;
                }
                obj = obj2;
            }
            i6 = 1;
            if (bArr != null) {
                i5 = bArr[i5];
            }
            paint2.setColor(iArr[i5]);
            canvas2 = canvas;
            canvas2.drawRect((float) i4, (float) i3, (float) (i4 + i6), (float) (i3 + 1), paint2);
            i4 += i6;
            if (obj2 != null) {
                return i4;
            }
            obj = obj2;
        }
    }

    /* renamed from: c */
    private static int m7973c(C2301j c2301j, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        C2301j c2301j2 = c2301j;
        int i3 = i2;
        Paint paint2 = paint;
        int i4 = i;
        Object obj = null;
        while (true) {
            Object obj2;
            int i5;
            int i6;
            int c = c2301j2.m8373c(8);
            if (c != 0) {
                obj2 = obj;
                i5 = c;
                i6 = 1;
            } else if (c2301j2.m8376e()) {
                c = c2301j2.m8373c(7);
                i5 = c2301j2.m8373c(8);
                obj2 = obj;
                i6 = c;
            } else {
                i5 = c2301j2.m8373c(7);
                if (i5 != 0) {
                    obj2 = obj;
                    i6 = i5;
                    i5 = 0;
                } else {
                    i5 = 0;
                    i6 = 0;
                    obj2 = 1;
                }
            }
            if (!(i6 == 0 || paint2 == null)) {
                if (bArr != null) {
                    i5 = bArr[i5];
                }
                paint2.setColor(iArr[i5]);
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) i4, (float) i3, (float) (i4 + i6), (float) (i3 + 1), paint2);
            }
            i4 += i6;
            if (obj2 != null) {
                return i4;
            }
            obj = obj2;
        }
    }

    /* renamed from: a */
    private static byte[] m7968a(int i, int i2, C2301j c2301j) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c2301j.m8373c(i2);
        }
        return bArr;
    }
}
