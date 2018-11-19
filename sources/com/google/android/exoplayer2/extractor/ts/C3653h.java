package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2300i;
import com.google.android.exoplayer2.util.C2300i.C2298a;
import com.google.android.exoplayer2.util.C2300i.C2299b;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2303l;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.h */
public final class C3653h implements ElementaryStreamReader {
    /* renamed from: a */
    private final C2114q f11235a;
    /* renamed from: b */
    private final boolean f11236b;
    /* renamed from: c */
    private final boolean f11237c;
    /* renamed from: d */
    private final C2112m f11238d = new C2112m(true, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: e */
    private final C2112m f11239e = new C2112m(true, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: f */
    private final C2112m f11240f = new C2112m(true, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: g */
    private long f11241g;
    /* renamed from: h */
    private final boolean[] f11242h = new boolean[3];
    /* renamed from: i */
    private String f11243i;
    /* renamed from: j */
    private TrackOutput f11244j;
    /* renamed from: k */
    private C2110a f11245k;
    /* renamed from: l */
    private boolean f11246l;
    /* renamed from: m */
    private long f11247m;
    /* renamed from: n */
    private final C2302k f11248n = new C2302k();

    /* renamed from: com.google.android.exoplayer2.extractor.ts.h$a */
    private static final class C2110a {
        /* renamed from: a */
        private final TrackOutput f5997a;
        /* renamed from: b */
        private final boolean f5998b;
        /* renamed from: c */
        private final boolean f5999c;
        /* renamed from: d */
        private final SparseArray<C2299b> f6000d = new SparseArray();
        /* renamed from: e */
        private final SparseArray<C2298a> f6001e = new SparseArray();
        /* renamed from: f */
        private final C2303l f6002f = new C2303l(this.f6003g, 0, 0);
        /* renamed from: g */
        private byte[] f6003g = new byte[ProfileEditingConfig.DEFAULT_MAX_LENGTH];
        /* renamed from: h */
        private int f6004h;
        /* renamed from: i */
        private int f6005i;
        /* renamed from: j */
        private long f6006j;
        /* renamed from: k */
        private boolean f6007k;
        /* renamed from: l */
        private long f6008l;
        /* renamed from: m */
        private C2109a f6009m = new C2109a();
        /* renamed from: n */
        private C2109a f6010n = new C2109a();
        /* renamed from: o */
        private boolean f6011o;
        /* renamed from: p */
        private long f6012p;
        /* renamed from: q */
        private long f6013q;
        /* renamed from: r */
        private boolean f6014r;

        /* renamed from: com.google.android.exoplayer2.extractor.ts.h$a$a */
        private static final class C2109a {
            /* renamed from: a */
            private boolean f5981a;
            /* renamed from: b */
            private boolean f5982b;
            /* renamed from: c */
            private C2299b f5983c;
            /* renamed from: d */
            private int f5984d;
            /* renamed from: e */
            private int f5985e;
            /* renamed from: f */
            private int f5986f;
            /* renamed from: g */
            private int f5987g;
            /* renamed from: h */
            private boolean f5988h;
            /* renamed from: i */
            private boolean f5989i;
            /* renamed from: j */
            private boolean f5990j;
            /* renamed from: k */
            private boolean f5991k;
            /* renamed from: l */
            private int f5992l;
            /* renamed from: m */
            private int f5993m;
            /* renamed from: n */
            private int f5994n;
            /* renamed from: o */
            private int f5995o;
            /* renamed from: p */
            private int f5996p;

            private C2109a() {
            }

            /* renamed from: a */
            public void m7542a() {
                this.f5982b = false;
                this.f5981a = false;
            }

            /* renamed from: a */
            public void m7543a(int i) {
                this.f5985e = i;
                this.f5982b = true;
            }

            /* renamed from: a */
            public void m7544a(C2299b c2299b, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f5983c = c2299b;
                this.f5984d = i;
                this.f5985e = i2;
                this.f5986f = i3;
                this.f5987g = i4;
                this.f5988h = z;
                this.f5989i = z2;
                this.f5990j = z3;
                this.f5991k = z4;
                this.f5992l = i5;
                this.f5993m = i6;
                this.f5994n = i7;
                this.f5995o = i8;
                this.f5996p = i9;
                this.f5981a = true;
                this.f5982b = true;
            }

            /* renamed from: b */
            public boolean m7545b() {
                return this.f5982b && (this.f5985e == 7 || this.f5985e == 2);
            }

            /* renamed from: a */
            private boolean m7540a(C2109a c2109a) {
                if (this.f5981a) {
                    if (!c2109a.f5981a || this.f5986f != c2109a.f5986f || this.f5987g != c2109a.f5987g || this.f5988h != c2109a.f5988h) {
                        return true;
                    }
                    if (this.f5989i && c2109a.f5989i && this.f5990j != c2109a.f5990j) {
                        return true;
                    }
                    if (this.f5984d != c2109a.f5984d && (this.f5984d == 0 || c2109a.f5984d == 0)) {
                        return true;
                    }
                    if (this.f5983c.f6918h == 0 && c2109a.f5983c.f6918h == 0 && (this.f5993m != c2109a.f5993m || this.f5994n != c2109a.f5994n)) {
                        return true;
                    }
                    if ((this.f5983c.f6918h == 1 && c2109a.f5983c.f6918h == 1 && (this.f5995o != c2109a.f5995o || this.f5996p != c2109a.f5996p)) || this.f5991k != c2109a.f5991k) {
                        return true;
                    }
                    if (this.f5991k && c2109a.f5991k && this.f5992l != c2109a.f5992l) {
                        return true;
                    }
                }
                return false;
            }
        }

        public C2110a(TrackOutput trackOutput, boolean z, boolean z2) {
            this.f5997a = trackOutput;
            this.f5998b = z;
            this.f5999c = z2;
            m7553b();
        }

        /* renamed from: a */
        public boolean m7552a() {
            return this.f5999c;
        }

        /* renamed from: a */
        public void m7550a(C2299b c2299b) {
            this.f6000d.append(c2299b.f6911a, c2299b);
        }

        /* renamed from: a */
        public void m7549a(C2298a c2298a) {
            this.f6001e.append(c2298a.f6908a, c2298a);
        }

        /* renamed from: b */
        public void m7553b() {
            this.f6007k = false;
            this.f6011o = false;
            this.f6010n.m7542a();
        }

        /* renamed from: a */
        public void m7548a(long j, int i, long j2) {
            this.f6005i = i;
            this.f6008l = j2;
            this.f6006j = j;
            if (this.f5998b == null || this.f6005i != 1) {
                if (this.f5999c == null) {
                    return;
                }
                if (!(this.f6005i == 5 || this.f6005i == 1 || this.f6005i == 2)) {
                    return;
                }
            }
            j = this.f6009m;
            this.f6009m = this.f6010n;
            this.f6010n = j;
            this.f6010n.m7542a();
            this.f6004h = 0;
            this.f6007k = true;
        }

        /* renamed from: a */
        public void m7551a(byte[] bArr, int i, int i2) {
            int i3 = i;
            if (this.f6007k) {
                int i4 = i2 - i3;
                if (r0.f6003g.length < r0.f6004h + i4) {
                    r0.f6003g = Arrays.copyOf(r0.f6003g, (r0.f6004h + i4) * 2);
                }
                System.arraycopy(bArr, i3, r0.f6003g, r0.f6004h, i4);
                r0.f6004h += i4;
                r0.f6002f.m8420a(r0.f6003g, 0, r0.f6004h);
                if (r0.f6002f.m8422b(8)) {
                    r0.f6002f.m8418a();
                    int c = r0.f6002f.m8423c(2);
                    r0.f6002f.m8419a(5);
                    if (r0.f6002f.m8424c()) {
                        r0.f6002f.m8425d();
                        if (r0.f6002f.m8424c()) {
                            int d = r0.f6002f.m8425d();
                            if (!r0.f5999c) {
                                r0.f6007k = false;
                                r0.f6010n.m7543a(d);
                            } else if (r0.f6002f.m8424c()) {
                                int d2 = r0.f6002f.m8425d();
                                if (r0.f6001e.indexOfKey(d2) < 0) {
                                    r0.f6007k = false;
                                    return;
                                }
                                C2298a c2298a = (C2298a) r0.f6001e.get(d2);
                                C2299b c2299b = (C2299b) r0.f6000d.get(c2298a.f6909b);
                                if (c2299b.f6915e) {
                                    if (r0.f6002f.m8422b(2)) {
                                        r0.f6002f.m8419a(2);
                                    } else {
                                        return;
                                    }
                                }
                                if (r0.f6002f.m8422b(c2299b.f6917g)) {
                                    boolean z;
                                    boolean b;
                                    boolean z2;
                                    boolean z3;
                                    int i5;
                                    int i6;
                                    int e;
                                    int i7;
                                    int i8;
                                    int c2 = r0.f6002f.m8423c(c2299b.f6917g);
                                    if (c2299b.f6916f) {
                                        z = false;
                                    } else if (r0.f6002f.m8422b(1)) {
                                        boolean b2 = r0.f6002f.m8421b();
                                        if (!b2) {
                                            z = b2;
                                        } else if (r0.f6002f.m8422b(1)) {
                                            z = b2;
                                            b = r0.f6002f.m8421b();
                                            z2 = true;
                                            z3 = r0.f6005i != 5;
                                            if (z3) {
                                                i5 = 0;
                                            } else if (!r0.f6002f.m8424c()) {
                                                i5 = r0.f6002f.m8425d();
                                            } else {
                                                return;
                                            }
                                            if (c2299b.f6918h != 0) {
                                                if (!r0.f6002f.m8422b(c2299b.f6919i)) {
                                                    i4 = r0.f6002f.m8423c(c2299b.f6919i);
                                                    if (c2298a.f6910c || z) {
                                                        i6 = i4;
                                                    } else if (r0.f6002f.m8424c()) {
                                                        e = r0.f6002f.m8426e();
                                                        i6 = i4;
                                                        i7 = 0;
                                                        i8 = 0;
                                                        r0.f6010n.m7544a(c2299b, c, d, c2, d2, z, z2, b, z3, i5, i6, e, i7, i8);
                                                        r0.f6007k = false;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                return;
                                            } else if (c2299b.f6918h == 1 || c2299b.f6920j) {
                                                i6 = 0;
                                            } else if (r0.f6002f.m8424c()) {
                                                i4 = r0.f6002f.m8426e();
                                                if (!c2298a.f6910c || z) {
                                                    i7 = i4;
                                                    i6 = 0;
                                                    e = 0;
                                                    i8 = 0;
                                                    r0.f6010n.m7544a(c2299b, c, d, c2, d2, z, z2, b, z3, i5, i6, e, i7, i8);
                                                    r0.f6007k = false;
                                                } else if (r0.f6002f.m8424c()) {
                                                    i8 = r0.f6002f.m8426e();
                                                    i7 = i4;
                                                    i6 = 0;
                                                    e = 0;
                                                    r0.f6010n.m7544a(c2299b, c, d, c2, d2, z, z2, b, z3, i5, i6, e, i7, i8);
                                                    r0.f6007k = false;
                                                } else {
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                            e = 0;
                                            i7 = 0;
                                            i8 = 0;
                                            r0.f6010n.m7544a(c2299b, c, d, c2, d2, z, z2, b, z3, i5, i6, e, i7, i8);
                                            r0.f6007k = false;
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                    z2 = false;
                                    b = false;
                                    if (r0.f6005i != 5) {
                                    }
                                    if (z3) {
                                        i5 = 0;
                                    } else if (!r0.f6002f.m8424c()) {
                                        i5 = r0.f6002f.m8425d();
                                    } else {
                                        return;
                                    }
                                    if (c2299b.f6918h != 0) {
                                        if (c2299b.f6918h == 1) {
                                        }
                                        i6 = 0;
                                    } else if (!r0.f6002f.m8422b(c2299b.f6919i)) {
                                        i4 = r0.f6002f.m8423c(c2299b.f6919i);
                                        if (c2298a.f6910c) {
                                        }
                                        i6 = i4;
                                    } else {
                                        return;
                                    }
                                    e = 0;
                                    i7 = 0;
                                    i8 = 0;
                                    r0.f6010n.m7544a(c2299b, c, d, c2, d2, z, z2, b, z3, i5, i6, e, i7, i8);
                                    r0.f6007k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void m7547a(long j, int i) {
            int i2 = 0;
            if (this.f6005i == 9 || (this.f5999c && this.f6010n.m7540a(this.f6009m))) {
                if (this.f6011o) {
                    m7546a(i + ((int) (j - this.f6006j)));
                }
                this.f6012p = this.f6006j;
                this.f6013q = this.f6008l;
                this.f6014r = false;
                this.f6011o = true;
            }
            j = this.f6014r;
            if (this.f6005i == 5 || (this.f5998b && this.f6005i == 1 && this.f6010n.m7545b())) {
                i2 = 1;
            }
            this.f6014r = j | i2;
        }

        /* renamed from: a */
        private void m7546a(int i) {
            this.f5997a.sampleMetadata(this.f6013q, this.f6014r, (int) (this.f6006j - this.f6012p), i, null);
        }
    }

    public void packetFinished() {
    }

    public C3653h(C2114q c2114q, boolean z, boolean z2) {
        this.f11235a = c2114q;
        this.f11236b = z;
        this.f11237c = z2;
    }

    public void seek() {
        C2300i.m8356a(this.f11242h);
        this.f11238d.m7559a();
        this.f11239e.m7559a();
        this.f11240f.m7559a();
        this.f11245k.m7553b();
        this.f11241g = 0;
    }

    public void createTracks(ExtractorOutput extractorOutput, C2106c c2106c) {
        c2106c.m7534a();
        this.f11243i = c2106c.m7536c();
        this.f11244j = extractorOutput.track(c2106c.m7535b(), 2);
        this.f11245k = new C2110a(this.f11244j, this.f11236b, this.f11237c);
        this.f11235a.m7569a(extractorOutput, c2106c);
    }

    public void packetStarted(long j, boolean z) {
        this.f11247m = j;
    }

    public void consume(C2302k c2302k) {
        int d = c2302k.m8389d();
        int c = c2302k.m8387c();
        byte[] bArr = c2302k.f6929a;
        this.f11241g += (long) c2302k.m8385b();
        this.f11244j.sampleData(c2302k, c2302k.m8385b());
        while (true) {
            int a = C2300i.m8352a(bArr, d, c, this.f11242h);
            if (a == c) {
                m13799a(bArr, d, c);
                return;
            }
            int b = C2300i.m8358b(bArr, a);
            int i = a - d;
            if (i > 0) {
                m13799a(bArr, d, a);
            }
            int i2 = c - a;
            long j = this.f11241g - ((long) i2);
            m13797a(j, i2, i < 0 ? -i : 0, this.f11247m);
            m13798a(j, b, this.f11247m);
            d = a + 3;
        }
    }

    /* renamed from: a */
    private void m13798a(long j, int i, long j2) {
        if (!this.f11246l || this.f11245k.m7552a()) {
            this.f11238d.m7560a(i);
            this.f11239e.m7560a(i);
        }
        this.f11240f.m7560a(i);
        this.f11245k.m7548a(j, i, j2);
    }

    /* renamed from: a */
    private void m13799a(byte[] bArr, int i, int i2) {
        if (!this.f11246l || this.f11245k.m7552a()) {
            this.f11238d.m7561a(bArr, i, i2);
            this.f11239e.m7561a(bArr, i, i2);
        }
        this.f11240f.m7561a(bArr, i, i2);
        this.f11245k.m7551a(bArr, i, i2);
    }

    /* renamed from: a */
    private void m13797a(long j, int i, int i2, long j2) {
        int i3 = i2;
        if (!this.f11246l || r0.f11245k.m7552a()) {
            r0.f11238d.m7563b(i3);
            r0.f11239e.m7563b(i3);
            if (r0.f11246l) {
                if (r0.f11238d.m7562b()) {
                    r0.f11245k.m7550a(C2300i.m8353a(r0.f11238d.f6028a, 3, r0.f11238d.f6029b));
                    r0.f11238d.m7559a();
                } else if (r0.f11239e.m7562b()) {
                    r0.f11245k.m7549a(C2300i.m8359b(r0.f11239e.f6028a, 3, r0.f11239e.f6029b));
                    r0.f11239e.m7559a();
                }
            } else if (r0.f11238d.m7562b() && r0.f11239e.m7562b()) {
                List arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(r0.f11238d.f6028a, r0.f11238d.f6029b));
                arrayList.add(Arrays.copyOf(r0.f11239e.f6028a, r0.f11239e.f6029b));
                C2299b a = C2300i.m8353a(r0.f11238d.f6028a, 3, r0.f11238d.f6029b);
                C2298a b = C2300i.m8359b(r0.f11239e.f6028a, 3, r0.f11239e.f6029b);
                r0.f11244j.format(Format.createVideoSampleFormat(r0.f11243i, "video/avc", null, -1, -1, a.f6912b, a.f6913c, -1.0f, arrayList, -1, a.f6914d, null));
                r0.f11246l = true;
                r0.f11245k.m7550a(a);
                r0.f11245k.m7549a(b);
                r0.f11238d.m7559a();
                r0.f11239e.m7559a();
            }
        }
        if (r0.f11240f.m7563b(i2)) {
            r0.f11248n.m8383a(r0.f11240f.f6028a, C2300i.m8351a(r0.f11240f.f6028a, r0.f11240f.f6029b));
            r0.f11248n.m8388c(4);
            r0.f11235a.m7568a(j2, r0.f11248n);
        }
        r0.f11245k.m7547a(j, i);
    }
}
