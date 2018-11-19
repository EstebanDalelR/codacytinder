package com.google.android.m4b.maps.bp;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.as.C4666a;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.bo.C6521j;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.aj.C4836a;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bl;
import com.google.android.m4b.maps.bq.C4868i;
import com.google.android.m4b.maps.bw.C4972d;
import com.google.android.m4b.maps.cm.C5227b;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.Inflater;

/* renamed from: com.google.android.m4b.maps.bp.b */
public final class C7465b implements C6521j {
    /* renamed from: a */
    private final ba f27379a;
    /* renamed from: b */
    private final int f27380b;
    /* renamed from: c */
    private final long f27381c;
    /* renamed from: d */
    private final C4859c[] f27382d;

    /* renamed from: b */
    public final long mo7074b() {
        return -1;
    }

    /* renamed from: b */
    public final boolean mo5097b(C4712d c4712d) {
        return false;
    }

    /* renamed from: c */
    public final void mo5098c(C4712d c4712d) {
    }

    /* renamed from: i */
    public final int mo5102i() {
        return -1;
    }

    /* renamed from: j */
    public final boolean mo5103j() {
        return false;
    }

    private C7465b(ba baVar, C4662a c4662a, long j) {
        this.f27379a = baVar;
        this.f27380b = c4662a.m20835d(1);
        this.f27381c = j;
        this.f27382d = new C4859c[c4662a.m20846k(2)];
        m32270a(c4662a, m32272a(c4662a));
        m32273b(c4662a);
    }

    /* renamed from: a */
    public static C7465b m32269a(ba baVar, byte[] bArr, int i, long j) {
        int a = C7465b.m32268a(bArr, i);
        i += 10;
        byte[] bArr2 = new byte[32];
        C4868i.m21806a(baVar.m21620c(), baVar.m21621d(), baVar.m21619b(), a, bArr2);
        C4868i c4868i = new C4868i();
        c4868i.m21811b(bArr2, 256);
        c4868i.m21810a(bArr, i, bArr.length - i);
        a = bArr.length - i;
        Inflater inflater = new Inflater(true);
        try {
            bArr = C4972d.m22242a(bArr, i, a);
            i = bArr.m22240a();
            int b = bArr.m22241b();
            C4662a c4662a = new C4662a(C5227b.f19463a);
            c4662a.m20811a(new ByteArrayInputStream(i), b);
            bArr = new C7465b(baVar, c4662a, j);
            inflater.end();
            return bArr;
        } catch (ba baVar2) {
            throw new IOException(baVar2.getMessage());
        } catch (Throwable th) {
            inflater.end();
        }
    }

    /* renamed from: a */
    public static int m32268a(byte[] bArr, int i) {
        C4666a c4666a = new C4666a(bArr);
        c4666a.skipBytes(i);
        bArr = c4666a.readInt();
        if (bArr != 1162889042) {
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("FORMAT_MAGIC expected. Found: ");
            stringBuilder.append(bArr);
            throw new IOException(stringBuilder.toString());
        }
        bArr = c4666a.readUnsignedShort();
        if (bArr == 1) {
            return c4666a.readInt();
        }
        String valueOf = String.valueOf("Version mismatch: 1 expected, ");
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 17);
        stringBuilder2.append(valueOf);
        stringBuilder2.append(bArr);
        stringBuilder2.append(" found");
        throw new IOException(stringBuilder2.toString());
    }

    /* renamed from: a */
    private af[] m32272a(C4662a c4662a) {
        af[] afVarArr = new af[this.f27382d.length];
        int k = c4662a.m20846k(4);
        for (int i = 0; i < k; i++) {
            C4662a c = c4662a.m20833c(4, i);
            af a = af.m21456a(c.m20835d(1), c.m20835d(2));
            int[] a2 = C7465b.m32271a(c.m20834c(3));
            for (int i2 : a2) {
                afVarArr[i2] = a;
            }
        }
        return afVarArr;
    }

    /* renamed from: a */
    private void m32270a(C4662a c4662a, af[] afVarArr) {
        C7465b c7465b = this;
        C4662a c4662a2 = c4662a;
        boolean z = false;
        int i = 0;
        while (i < c7465b.f27382d.length / 2) {
            int i2;
            int i3;
            C4860d[] c4860dArr;
            DataInput dataInputStream;
            int a;
            int i4 = i * 2;
            int i5 = i4 + 1;
            C4662a c = c4662a2.m20833c(2, i4);
            int a2 = C4665c.m20853a(c, 2);
            C4662a c2 = c4662a2.m20833c(2, i5);
            int a3 = C4665c.m20853a(c2, 2);
            int i6 = 3;
            C4662a c3 = c4662a2.m20833c(3, i);
            byte[] c4 = c3.m20845j(1) ? c3.m20834c(1) : null;
            int a4 = C4665c.m20854a(c3, 2, (int) z);
            int a5 = C4665c.m20854a(c3, 3, (int) z);
            int k = c.m20846k(3);
            if (a5 == 1) {
                z = true;
            }
            if (k > 0) {
                C4860d[] c4860dArr2 = new C4860d[k];
                i2 = 0;
                while (i2 < k) {
                    i3 = a5;
                    c3 = c4662a2.m20833c(5, c.m20826b(i6, i2));
                    int i7 = k;
                    c4860dArr2[i2] = new C4860d(c3.m20843h(1).intern(), c3.m20845j(2) ? c3.m20843h(2).intern() : null, z);
                    i2++;
                    a5 = i3;
                    k = i7;
                    c4662a2 = c4662a;
                    i6 = 3;
                }
                i3 = a5;
                c4860dArr = c4860dArr2;
            } else {
                i3 = a5;
                c4860dArr = new C4860d[]{C4859c.f17844a};
            }
            af afVar = afVarArr[i5];
            af afVar2 = afVarArr[i4];
            if (c4 != null) {
                dataInputStream = new DataInputStream(new ByteArrayInputStream(c4));
                a = bl.m21698a(dataInputStream);
            } else {
                a = 0;
                dataInputStream = null;
            }
            C4836a c4836a = new C4836a(a + 2);
            if (afVar != null) {
                c4836a.m21514a(afVar);
            }
            i2 = 0;
            int i8 = 0;
            for (a5 = 0; a5 < a; a5++) {
                i2 += bl.m21700b(dataInputStream);
                i8 += bl.m21700b(dataInputStream);
                c4836a.m21514a(af.m21471c(i2, i8));
            }
            if (afVar2 != null) {
                c4836a.m21514a(afVar2);
            }
            aj c5 = c4836a.m21516c();
            if (afVar == null && afVar2 == null) {
                String valueOf = String.valueOf("Both polyline endpoints are missing for segment: ");
                String valueOf2 = String.valueOf(c7465b.f27382d[i4]);
                String valueOf3 = String.valueOf(c7465b.f27379a);
                StringBuilder stringBuilder = new StringBuilder(((String.valueOf(valueOf).length() + 10) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(valueOf2);
                stringBuilder.append(" in tile: ");
                stringBuilder.append(valueOf3);
                throw new IOException(stringBuilder.toString());
            }
            int i9;
            int i10;
            int i11;
            if (afVar == null) {
                i9 = 0;
                i10 = 2;
                i11 = 5;
            } else if (afVar2 == null) {
                i9 = 0;
                i10 = 1;
                i11 = 6;
            } else {
                i9 = 0;
                i10 = 0;
                i11 = 4;
            }
            k = (C4665c.m20854a(c, 4, i9) & 1) != 0 ? i10 | 8 : i10;
            int i12 = (C4665c.m20854a(c2, 4, i9) & 1) != 0 ? i11 | 8 : i11;
            int i13 = i3;
            c7465b.f27382d[i4] = new C4859c(C4859c.m21792a(c7465b.f27379a, i4), c4860dArr, c5, k, a2, i13, a4);
            c7465b.f27382d[i5] = new C4859c(C4859c.m21792a(c7465b.f27379a, i5), c4860dArr, c5, i12, a3, i13, a4);
            if (c5.m21528b() < 2) {
                valueOf = String.valueOf("Segment polyline had fewer than two points for segment: ");
                valueOf2 = String.valueOf(c7465b.f27382d[i4]);
                valueOf3 = String.valueOf(c7465b.f27379a);
                stringBuilder = new StringBuilder(((String.valueOf(valueOf).length() + 10) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(valueOf2);
                stringBuilder.append(" in tile: ");
                stringBuilder.append(valueOf3);
                throw new IOException(stringBuilder.toString());
            }
            i++;
            c4662a2 = c4662a;
            z = false;
        }
    }

    /* renamed from: b */
    private void m32273b(C4662a c4662a) {
        C7465b c7465b = this;
        C4662a c4662a2 = c4662a;
        int i = 4;
        int k = c4662a2.m20846k(4);
        af afVar = new af();
        afVar = new af();
        int i2 = 0;
        while (i2 < k) {
            C4662a c = c4662a2.m20833c(i, i2);
            int[] a = C7465b.m32271a(c.m20834c(3));
            int[] a2 = C7465b.m32271a(c.m20834c(i));
            Object obj = new C4858a[a.length];
            int i3 = 0;
            int i4;
            for (int i5 = 0; i5 < a.length; i5 = i4 + 1) {
                C4859c c4859c = c7465b.f27382d[a[i5]];
                i4 = i5;
                i5 = 0;
                int i6 = 0;
                while (i5 < a.length) {
                    if (i3 >= a2.length) {
                        i5 = a.length;
                        i4 = i5;
                    } else {
                        int i7 = a2[i3];
                        if (i7 != 0) {
                            int i8 = i6 + 1;
                            obj[i6] = new C4858a(c7465b.f27382d[a[i5] ^ 1], i7);
                            i6 = i8;
                        }
                    }
                    i5++;
                    i3++;
                }
                C4858a[] c4858aArr = new C4858a[i6];
                System.arraycopy(obj, 0, c4858aArr, 0, c4858aArr.length);
                c4859c.m21795a(c4858aArr);
            }
            i2++;
            i = 4;
        }
    }

    /* renamed from: a */
    private static int[] m32271a(byte[] bArr) {
        DataInput dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        bArr = bl.m21698a(dataInputStream);
        int[] iArr = new int[bArr];
        for (int i = 0; i < bArr; i++) {
            iArr[i] = bl.m21698a(dataInputStream);
        }
        return iArr;
    }

    /* renamed from: a */
    public final boolean mo5096a(C4712d c4712d) {
        return (this.f27381c < 0 || C4712d.m20957c() <= this.f27381c) ? null : true;
    }

    /* renamed from: d */
    public final ba mo5099d() {
        return this.f27379a;
    }

    /* renamed from: e */
    public final int mo5100e() {
        return this.f27380b;
    }

    /* renamed from: h */
    public final bg mo5101h() {
        return bg.f17753i;
    }

    /* renamed from: a */
    public final long mo7073a() {
        return this.f27381c;
    }
}
