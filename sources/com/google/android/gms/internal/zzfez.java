package com.google.android.gms.internal;

import java.io.IOException;

class zzfez extends zzfey {
    /* renamed from: b */
    protected final byte[] f27068b;

    zzfez(byte[] bArr) {
        this.f27068b = bArr;
    }

    /* renamed from: a */
    public byte mo6929a(int i) {
        return this.f27068b[i];
    }

    /* renamed from: a */
    public int mo6930a() {
        return this.f27068b.length;
    }

    /* renamed from: a */
    protected final int mo6931a(int i, int i2, int i3) {
        return abx.m18855a(i, this.f27068b, mo7504f() + i2, i3);
    }

    /* renamed from: a */
    public final zzfes mo6932a(int i, int i2) {
        i2 = zzfes.m20300b(i, i2, mo6930a());
        return i2 == 0 ? zzfes.f16682a : new zzfev(this.f27068b, mo7504f() + i, i2);
    }

    /* renamed from: a */
    final void mo6933a(abe abe) throws IOException {
        abe.mo6953a(this.f27068b, mo7504f(), mo6930a());
    }

    /* renamed from: a */
    protected void mo6934a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f27068b, i, bArr, i2, i3);
    }

    /* renamed from: a */
    final boolean mo6935a(zzfes zzfes, int i, int i2) {
        if (i2 > zzfes.mo6930a()) {
            i = mo6930a();
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i3 = i + i2;
        int a;
        if (i3 > zzfes.mo6930a()) {
            a = zzfes.mo6930a();
            StringBuilder stringBuilder2 = new StringBuilder(59);
            stringBuilder2.append("Ran off end of other: ");
            stringBuilder2.append(i);
            stringBuilder2.append(", ");
            stringBuilder2.append(i2);
            stringBuilder2.append(", ");
            stringBuilder2.append(a);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else if (!(zzfes instanceof zzfez)) {
            return zzfes.mo6932a(i, i3).equals(mo6932a(0, i2));
        } else {
            zzfez zzfez = (zzfez) zzfes;
            byte[] bArr = this.f27068b;
            byte[] bArr2 = zzfez.f27068b;
            int f = mo7504f() + i2;
            i2 = mo7504f();
            a = zzfez.mo7504f() + i;
            while (i2 < f) {
                if (bArr[i2] != bArr2[a]) {
                    return false;
                }
                i2++;
                a++;
            }
            return true;
        }
    }

    /* renamed from: d */
    public final abk mo6936d() {
        return abk.m18817a(this.f27068b, mo7504f(), mo6930a(), true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfes) || mo6930a() != ((zzfes) obj).mo6930a()) {
            return false;
        }
        if (mo6930a() == 0) {
            return true;
        }
        if (!(obj instanceof zzfez)) {
            return obj.equals(this);
        }
        zzfez zzfez = (zzfez) obj;
        int e = m20313e();
        int e2 = zzfez.m20313e();
        return (e == 0 || e2 == 0 || e == e2) ? mo6935a(zzfez, 0, mo6930a()) : false;
    }

    /* renamed from: f */
    protected int mo7504f() {
        return 0;
    }
}
