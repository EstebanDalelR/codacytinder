package com.google.android.gms.internal;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.util.Arrays;

final class abm extends abk {
    /* renamed from: d */
    private final byte[] f22875d;
    /* renamed from: e */
    private final boolean f22876e;
    /* renamed from: f */
    private int f22877f;
    /* renamed from: g */
    private int f22878g;
    /* renamed from: h */
    private int f22879h;
    /* renamed from: i */
    private int f22880i;
    /* renamed from: j */
    private int f22881j;
    /* renamed from: k */
    private int f22882k;

    private abm(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f22882k = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f22875d = bArr;
        this.f22877f = i2 + i;
        this.f22879h = i;
        this.f22880i = this.f22879h;
        this.f22876e = z;
    }

    /* renamed from: o */
    private final long m26987o() throws IOException {
        int i = this.f22879h;
        if (this.f22877f != i) {
            byte[] bArr = this.f22875d;
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.f22879h = i2;
                return (long) b;
            } else if (this.f22877f - i2 >= 9) {
                long j;
                long j2;
                int i3 = i2 + 1;
                i = b ^ (bArr[i2] << 7);
                if (i < 0) {
                    i ^= -128;
                } else {
                    i2 = i3 + 1;
                    i ^= bArr[i3] << 14;
                    if (i >= 0) {
                        j = (long) (i ^ 16256);
                        i = i2;
                        j2 = j;
                        this.f22879h = i;
                        return j2;
                    }
                    i3 = i2 + 1;
                    i ^= bArr[i2] << 21;
                    if (i < 0) {
                        i ^= -2080896;
                    } else {
                        long j3;
                        long j4 = (long) i;
                        i = i3 + 1;
                        long j5 = j4 ^ (((long) bArr[i3]) << 28);
                        if (j5 >= 0) {
                            j3 = 266354560;
                        } else {
                            long j6;
                            int i4 = i + 1;
                            long j7 = j5 ^ (((long) bArr[i]) << 35);
                            if (j7 < 0) {
                                j6 = -34093383808L;
                            } else {
                                i = i4 + 1;
                                j5 = j7 ^ (((long) bArr[i4]) << 42);
                                if (j5 >= 0) {
                                    j3 = 4363953127296L;
                                } else {
                                    i4 = i + 1;
                                    j7 = j5 ^ (((long) bArr[i]) << 49);
                                    if (j7 < 0) {
                                        j6 = -558586000294016L;
                                    } else {
                                        i = i4 + 1;
                                        long j8 = (j7 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                        if (j8 < 0) {
                                            i4 = i + 1;
                                            if (((long) bArr[i]) >= 0) {
                                                i = i4;
                                            }
                                        }
                                        j2 = j8;
                                        this.f22879h = i;
                                        return j2;
                                    }
                                }
                            }
                            j2 = j7 ^ j6;
                            i = i4;
                            this.f22879h = i;
                            return j2;
                        }
                        j2 = j5 ^ j3;
                        this.f22879h = i;
                        return j2;
                    }
                }
                j = (long) i;
                i = i3;
                j2 = j;
                this.f22879h = i;
                return j2;
            }
        }
        return mo4189l();
    }

    /* renamed from: p */
    private final int m26988p() throws IOException {
        int i = this.f22879h;
        if (this.f22877f - i < 4) {
            throw zzfge.m20315a();
        }
        byte[] bArr = this.f22875d;
        this.f22879h = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    /* renamed from: q */
    private final long m26989q() throws IOException {
        int i = this.f22879h;
        if (this.f22877f - i < 8) {
            throw zzfge.m20315a();
        }
        byte[] bArr = this.f22875d;
        this.f22879h = i + 8;
        return (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48)) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* renamed from: r */
    private final void m26990r() {
        this.f22877f += this.f22878g;
        int i = this.f22877f - this.f22880i;
        if (i > this.f22882k) {
            this.f22878g = i - this.f22882k;
            this.f22877f -= this.f22878g;
            return;
        }
        this.f22878g = 0;
    }

    /* renamed from: s */
    private final byte m26991s() throws IOException {
        if (this.f22879h == this.f22877f) {
            throw zzfge.m20315a();
        }
        byte[] bArr = this.f22875d;
        int i = this.f22879h;
        this.f22879h = i + 1;
        return bArr[i];
    }

    /* renamed from: a */
    public final int mo4174a() throws IOException {
        if (mo4190m()) {
            this.f22881j = 0;
            return 0;
        }
        this.f22881j = mo4188k();
        if ((this.f22881j >>> 3) != 0) {
            return this.f22881j;
        }
        throw zzfge.m20318d();
    }

    /* renamed from: a */
    public final <T extends zzffu<T, ?>> T mo4175a(T t, abq abq) throws IOException {
        int k = mo4188k();
        if (this.a >= this.b) {
            throw zzfge.m20321g();
        }
        k = mo4177b(k);
        this.a++;
        t = zzffu.m34104a((zzffu) t, (abk) this, abq);
        mo4176a(0);
        this.a--;
        mo4180c(k);
        return t;
    }

    /* renamed from: a */
    public final void mo4176a(int i) throws zzfge {
        if (this.f22881j != i) {
            throw zzfge.m20319e();
        }
    }

    /* renamed from: b */
    public final int mo4177b(int i) throws zzfge {
        if (i < 0) {
            throw zzfge.m20316b();
        }
        i += mo4191n();
        int i2 = this.f22882k;
        if (i > i2) {
            throw zzfge.m20315a();
        }
        this.f22882k = i;
        m26990r();
        return i2;
    }

    /* renamed from: b */
    public final long mo4178b() throws IOException {
        return m26987o();
    }

    /* renamed from: c */
    public final long mo4179c() throws IOException {
        return m26989q();
    }

    /* renamed from: c */
    public final void mo4180c(int i) {
        this.f22882k = i;
        m26990r();
    }

    /* renamed from: d */
    public final int mo4181d() throws IOException {
        return m26988p();
    }

    /* renamed from: e */
    public final boolean mo4182e() throws IOException {
        return m26987o() != 0;
    }

    /* renamed from: f */
    public final String mo4183f() throws IOException {
        int k = mo4188k();
        if (k > 0 && k <= this.f22877f - this.f22879h) {
            String str = new String(this.f22875d, this.f22879h, k, abx.f15002a);
            this.f22879h += k;
            return str;
        } else if (k == 0) {
            return "";
        } else {
            if (k < 0) {
                throw zzfge.m20316b();
            }
            throw zzfge.m20315a();
        }
    }

    /* renamed from: g */
    public final String mo4184g() throws IOException {
        int k = mo4188k();
        if (k <= 0 || k > this.f22877f - this.f22879h) {
            if (k == 0) {
                return "";
            }
            if (k <= 0) {
                throw zzfge.m20316b();
            }
            throw zzfge.m20315a();
        } else if (adr.m18964a(this.f22875d, this.f22879h, this.f22879h + k)) {
            int i = this.f22879h;
            this.f22879h += k;
            return new String(this.f22875d, i, k, abx.f15002a);
        } else {
            throw zzfge.m20322h();
        }
    }

    /* renamed from: h */
    public final zzfes mo4185h() throws IOException {
        int k = mo4188k();
        if (k > 0 && k <= this.f22877f - this.f22879h) {
            zzfes a = zzfes.m20299a(this.f22875d, this.f22879h, k);
            this.f22879h += k;
            return a;
        } else if (k == 0) {
            return zzfes.f16682a;
        } else {
            byte[] copyOfRange;
            if (k > 0 && k <= this.f22877f - this.f22879h) {
                int i = this.f22879h;
                this.f22879h += k;
                copyOfRange = Arrays.copyOfRange(this.f22875d, i, this.f22879h);
            } else if (k > 0) {
                throw zzfge.m20315a();
            } else if (k == 0) {
                copyOfRange = abx.f15003b;
            } else {
                throw zzfge.m20316b();
            }
            return zzfes.m20302b(copyOfRange);
        }
    }

    /* renamed from: i */
    public final int mo4186i() throws IOException {
        return mo4188k();
    }

    /* renamed from: j */
    public final int mo4187j() throws IOException {
        return mo4188k();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: k */
    public final int mo4188k() throws java.io.IOException {
        /*
        r5 = this;
        r0 = r5.f22879h;
        r1 = r5.f22877f;
        if (r1 == r0) goto L_0x006d;
    L_0x0006:
        r1 = r5.f22875d;
        r2 = r0 + 1;
        r0 = r1[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.f22879h = r2;
        return r0;
    L_0x0011:
        r3 = r5.f22877f;
        r3 = r3 - r2;
        r4 = 9;
        if (r3 < r4) goto L_0x006d;
    L_0x0018:
        r3 = r2 + 1;
        r2 = r1[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0024;
    L_0x0021:
        r0 = r0 ^ -128;
        goto L_0x006a;
    L_0x0024:
        r2 = r3 + 1;
        r3 = r1[r3];
        r3 = r3 << 14;
        r0 = r0 ^ r3;
        if (r0 < 0) goto L_0x0031;
    L_0x002d:
        r0 = r0 ^ 16256;
    L_0x002f:
        r3 = r2;
        goto L_0x006a;
    L_0x0031:
        r3 = r2 + 1;
        r2 = r1[r2];
        r2 = r2 << 21;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x003f;
    L_0x003a:
        r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r1;
        goto L_0x006a;
    L_0x003f:
        r2 = r3 + 1;
        r3 = r1[r3];
        r4 = r3 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r3 >= 0) goto L_0x002f;
    L_0x004c:
        r3 = r2 + 1;
        r2 = r1[r2];
        if (r2 >= 0) goto L_0x006a;
    L_0x0052:
        r2 = r3 + 1;
        r3 = r1[r3];
        if (r3 >= 0) goto L_0x002f;
    L_0x0058:
        r3 = r2 + 1;
        r2 = r1[r2];
        if (r2 >= 0) goto L_0x006a;
    L_0x005e:
        r2 = r3 + 1;
        r3 = r1[r3];
        if (r3 >= 0) goto L_0x002f;
    L_0x0064:
        r3 = r2 + 1;
        r1 = r1[r2];
        if (r1 < 0) goto L_0x006d;
    L_0x006a:
        r5.f22879h = r3;
        return r0;
    L_0x006d:
        r0 = r5.mo4189l();
        r0 = (int) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.abm.k():int");
    }

    /* renamed from: l */
    final long mo4189l() throws IOException {
        long j = 0;
        int i = 0;
        while (i < 64) {
            byte s = m26991s();
            long j2 = j | (((long) (s & 127)) << i);
            if ((s & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                return j2;
            }
            i += 7;
            j = j2;
        }
        throw zzfge.m20317c();
    }

    /* renamed from: m */
    public final boolean mo4190m() throws IOException {
        return this.f22879h == this.f22877f;
    }

    /* renamed from: n */
    public final int mo4191n() {
        return this.f22879h - this.f22880i;
    }
}
