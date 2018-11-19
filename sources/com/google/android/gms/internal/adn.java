package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import java.io.IOException;
import java.util.Arrays;

public final class adn {
    /* renamed from: a */
    private static final adn f15044a = new adn(0, new int[0], new Object[0], false);
    /* renamed from: b */
    private int f15045b;
    /* renamed from: c */
    private int[] f15046c;
    /* renamed from: d */
    private Object[] f15047d;
    /* renamed from: e */
    private int f15048e;
    /* renamed from: f */
    private boolean f15049f;

    private adn() {
        this(0, new int[8], new Object[8], true);
    }

    private adn(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f15048e = -1;
        this.f15045b = i;
        this.f15046c = iArr;
        this.f15047d = objArr;
        this.f15049f = z;
    }

    /* renamed from: a */
    public static adn m18920a() {
        return f15044a;
    }

    /* renamed from: a */
    static adn m18921a(adn adn, adn adn2) {
        int i = adn.f15045b + adn2.f15045b;
        Object copyOf = Arrays.copyOf(adn.f15046c, i);
        System.arraycopy(adn2.f15046c, 0, copyOf, adn.f15045b, adn2.f15045b);
        Object copyOf2 = Arrays.copyOf(adn.f15047d, i);
        System.arraycopy(adn2.f15047d, 0, copyOf2, adn.f15045b, adn2.f15045b);
        return new adn(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    private void m18922a(int i, Object obj) {
        m18924f();
        if (this.f15045b == this.f15046c.length) {
            int i2 = this.f15045b + (this.f15045b < 4 ? 8 : this.f15045b >> 1);
            this.f15046c = Arrays.copyOf(this.f15046c, i2);
            this.f15047d = Arrays.copyOf(this.f15047d, i2);
        }
        this.f15046c[this.f15045b] = i;
        this.f15047d[this.f15045b] = obj;
        this.f15045b++;
    }

    /* renamed from: b */
    static adn m18923b() {
        return new adn();
    }

    /* renamed from: f */
    private final void m18924f() {
        if (!this.f15049f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    final void m18925a(adw adw) {
        int i;
        if (adw.mo4192a() == C4479g.f16696l) {
            for (i = this.f15045b - 1; i >= 0; i--) {
                adw.mo4193a(this.f15046c[i] >>> 3, this.f15047d[i]);
            }
            return;
        }
        for (i = 0; i < this.f15045b; i++) {
            adw.mo4193a(this.f15046c[i] >>> 3, this.f15047d[i]);
        }
    }

    /* renamed from: a */
    public final void m18926a(zzffg zzffg) throws IOException {
        for (int i = 0; i < this.f15045b; i++) {
            int i2 = this.f15046c[i];
            int i3 = i2 >>> 3;
            i2 &= 7;
            if (i2 != 5) {
                switch (i2) {
                    case 0:
                        zzffg.mo6944a(i3, ((Long) this.f15047d[i]).longValue());
                        break;
                    case 1:
                        zzffg.mo6956b(i3, ((Long) this.f15047d[i]).longValue());
                        break;
                    case 2:
                        zzffg.mo6945a(i3, (zzfes) this.f15047d[i]);
                        break;
                    case 3:
                        zzffg.mo6943a(i3, 3);
                        ((adn) this.f15047d[i]).m18926a(zzffg);
                        zzffg.mo6943a(i3, 4);
                        break;
                    default:
                        throw zzfge.m20320f();
                }
            }
            zzffg.mo6964d(i3, ((Integer) this.f15047d[i]).intValue());
        }
    }

    /* renamed from: a */
    final void m18927a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.f15045b; i2++) {
            acq.m18881a(stringBuilder, i, String.valueOf(this.f15046c[i2] >>> 3), this.f15047d[i2]);
        }
    }

    /* renamed from: a */
    final boolean m18928a(int i, abk abk) throws IOException {
        m18924f();
        int i2 = i >>> 3;
        switch (i & 7) {
            case 0:
                m18922a(i, Long.valueOf(abk.mo4178b()));
                return true;
            case 1:
                m18922a(i, Long.valueOf(abk.mo4179c()));
                return true;
            case 2:
                m18922a(i, abk.mo4185h());
                return true;
            case 3:
                Object adn = new adn();
                int a;
                do {
                    a = abk.mo4174a();
                    if (a != 0) {
                    }
                    abk.mo4176a((i2 << 3) | 4);
                    m18922a(i, adn);
                    return true;
                } while (adn.m18928a(a, abk));
                abk.mo4176a((i2 << 3) | 4);
                m18922a(i, adn);
                return true;
            case 4:
                return false;
            case 5:
                m18922a(i, Integer.valueOf(abk.mo4181d()));
                return true;
            default:
                throw zzfge.m20320f();
        }
    }

    /* renamed from: c */
    public final void m18929c() {
        this.f15049f = false;
    }

    /* renamed from: d */
    public final int m18930d() {
        int i = this.f15048e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.f15045b; i++) {
            i2 += zzffg.m27541d(this.f15046c[i] >>> 3, (zzfes) this.f15047d[i]);
        }
        this.f15048e = i2;
        return i2;
    }

    /* renamed from: e */
    public final int m18931e() {
        int i = this.f15048e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.f15045b; i++) {
            int i3 = this.f15046c[i];
            int i4 = i3 >>> 3;
            i3 &= 7;
            if (i3 != 5) {
                switch (i3) {
                    case 0:
                        i3 = zzffg.m27535c(i4, ((Long) this.f15047d[i]).longValue());
                        break;
                    case 1:
                        i3 = zzffg.m27540d(i4, ((Long) this.f15047d[i]).longValue());
                        break;
                    case 2:
                        i3 = zzffg.m27536c(i4, (zzfes) this.f15047d[i]);
                        break;
                    case 3:
                        i3 = (zzffg.m27545e(i4) << 1) + ((adn) this.f15047d[i]).m18931e();
                        break;
                    default:
                        throw new IllegalStateException(zzfge.m20320f());
                }
            }
            i3 = zzffg.m27549f(i4, ((Integer) this.f15047d[i]).intValue());
            i2 += i3;
        }
        this.f15048e = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof adn)) {
            return false;
        }
        adn adn = (adn) obj;
        if (this.f15045b == adn.f15045b) {
            Object obj2;
            int[] iArr = this.f15046c;
            int[] iArr2 = adn.f15046c;
            int i = this.f15045b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] != iArr2[i2]) {
                    obj2 = null;
                    break;
                }
            }
            obj2 = 1;
            if (obj2 != null) {
                Object[] objArr = this.f15047d;
                Object[] objArr2 = adn.f15047d;
                int i3 = this.f15045b;
                for (i = 0; i < i3; i++) {
                    if (!objArr[i].equals(objArr2[i])) {
                        obj = null;
                        break;
                    }
                }
                obj = 1;
                return obj != null;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15045b + 527) * 31) + Arrays.hashCode(this.f15046c)) * 31) + Arrays.deepHashCode(this.f15047d);
    }
}
