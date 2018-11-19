package com.google.android.m4b.maps.bn;

import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.bo.C4856x;
import com.google.android.m4b.maps.bo.C4857y;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bw.C4970c;
import com.google.android.m4b.maps.de.ad;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.google.android.m4b.maps.bn.b */
public final class C4832b {
    /* renamed from: a */
    private static final int f17628a = (31 - Integer.numberOfLeadingZeros(256));
    /* renamed from: b */
    private static byte[] f17629b = new byte[]{(byte) 76, (byte) 84, (byte) 73, (byte) 80, (byte) 10};
    /* renamed from: c */
    private C4662a f17630c;
    /* renamed from: d */
    private C4662a f17631d;
    /* renamed from: e */
    private C4662a f17632e;
    /* renamed from: f */
    private C4662a f17633f;

    /* renamed from: a */
    public final byte[] m21415a(byte[] bArr) {
        Object obj;
        IOException iOException;
        byte[] bArr2 = f17629b;
        int i;
        if (bArr.length >= bArr2.length + 0) {
            i = 0;
            while (i < bArr2.length) {
                if (bArr[i + 0] == bArr2[i]) {
                    i++;
                }
            }
            obj = 1;
            if (obj != null) {
                return bArr;
            }
            try {
                Object obj2 = new byte[4];
                System.arraycopy(bArr, 5, obj2, 0, 4);
                int i2 = ((((obj2[0] & 255) << 24) | ((obj2[1] & 255) << 16)) | ((obj2[2] & 255) << 8)) | (obj2[3] & 255);
                i = Math.abs(i2);
                InputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 9, i);
                InputStream gZIPInputStream = i2 >= 0 ? new GZIPInputStream(byteArrayInputStream) : byteArrayInputStream;
                this.f17630c = new C4662a(ad.f19855a);
                this.f17630c.m20818a(gZIPInputStream);
                gZIPInputStream.close();
                this.f17631d = null;
                i += 9;
                obj = new byte[(bArr.length - i)];
                try {
                    System.arraycopy(bArr, i, obj, 0, obj.length);
                    return obj;
                } catch (byte[] bArr3) {
                    Object obj3 = obj;
                    iOException = bArr3;
                    bArr3 = obj3;
                    iOException.printStackTrace();
                    return bArr3;
                }
            } catch (IOException e) {
                iOException = e;
                iOException.printStackTrace();
                return bArr3;
            }
        }
        obj = null;
        if (obj != null) {
            return bArr3;
        }
        Object obj22 = new byte[4];
        System.arraycopy(bArr3, 5, obj22, 0, 4);
        int i22 = ((((obj22[0] & 255) << 24) | ((obj22[1] & 255) << 16)) | ((obj22[2] & 255) << 8)) | (obj22[3] & 255);
        i = Math.abs(i22);
        InputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr3, 9, i);
        if (i22 >= 0) {
        }
        this.f17630c = new C4662a(ad.f19855a);
        this.f17630c.m20818a(gZIPInputStream);
        gZIPInputStream.close();
        this.f17631d = null;
        i += 9;
        obj = new byte[(bArr3.length - i)];
        System.arraycopy(bArr3, i, obj, 0, obj.length);
        return obj;
    }

    /* renamed from: e */
    private C4662a m21414e() {
        if (this.f17631d == null && this.f17630c != null && this.f17630c.m20845j(4)) {
            this.f17631d = this.f17630c.m20842g(4);
        }
        return this.f17631d;
    }

    /* renamed from: a */
    public final String[] m21416a() {
        C4662a e = m21414e();
        int i = 0;
        if (e == null) {
            return new String[0];
        }
        int k = e.m20846k(1);
        String[] strArr = new String[k];
        while (i < k) {
            strArr[i] = e.m20836d(1, i);
            i++;
        }
        return strArr;
    }

    /* renamed from: b */
    public final String[] m21417b() {
        C4662a e = m21414e();
        int i = 0;
        if (e == null) {
            return new String[0];
        }
        int k = e.m20846k(2);
        String[] strArr = new String[k];
        while (i < k) {
            strArr[i] = e.m20836d(2, i);
            i++;
        }
        return strArr;
    }

    /* renamed from: c */
    public final int m21418c() {
        C4662a e = m21414e();
        if (e == null || !e.m20845j(3)) {
            return -1;
        }
        int d = e.m20835d(3);
        if (d == 0) {
            return -1;
        }
        return d;
    }

    /* renamed from: a */
    private static int m21413a(int i, int i2) {
        return i << ((30 - i2) - f17628a);
    }

    /* renamed from: d */
    public final List<C4856x> m21419d() {
        if (this.f17632e == null && r0.f17630c != null && r0.f17630c.m20845j(5)) {
            r0.f17632e = r0.f17630c.m20842g(5);
        }
        C4662a c4662a = r0.f17632e;
        if (c4662a == null) {
            return new ArrayList();
        }
        int i;
        int i2 = 1;
        if (r0.f17633f == null && r0.f17630c != null && r0.f17630c.m20845j(1)) {
            r0.f17633f = r0.f17630c.m20842g(1);
        }
        int a = C4665c.m20853a(r0.f17633f, 4);
        List<C4662a> arrayList = new ArrayList();
        int k = r0.f17630c.m20846k(3);
        int i3 = 0;
        for (i = 0; i < k; i++) {
            arrayList.add(r0.f17630c.m20833c(3, i));
        }
        List<C4856x> arrayList2 = new ArrayList();
        i = c4662a.m20846k(1);
        for (int i4 = 0; i4 < i; i4++) {
            C4662a c = c4662a.m20833c(i2, i4);
            List arrayList3 = new ArrayList();
            Map b = ax.m20623b();
            for (C4662a c4662a2 : arrayList) {
                C4662a c4662a22;
                af a2;
                al a3;
                String h = c4662a22.m20833c(2, i3).m20843h(2);
                if (c4662a22.m20835d(i2) == 0) {
                    c4662a22 = c4662a22.m20842g(3);
                    a2 = C4970c.m22238a(c4662a22.m20842g(31));
                    af afVar = new af(C4832b.m21413a(C4665c.m20853a(c4662a22, 32), a) / 2, C4832b.m21413a(C4665c.m20853a(c4662a22, 33), a) / 2);
                    a3 = al.m32203a(a2.m21489e(afVar), a2.m21491f(afVar));
                } else {
                    a2 = null;
                    a3 = null;
                }
                b.put(h, new C4857y(h, a2, a3));
                i2 = 1;
                i3 = 0;
            }
            if (c != null) {
                i2 = 1;
                int k2 = c.m20846k(1);
                for (i3 = 0; i3 < k2; i3++) {
                    String h2 = c.m20833c(1, i3).m20843h(1);
                    Object obj = (C4857y) b.get(h2);
                    if (obj == null) {
                        obj = new C4857y(h2, null, null);
                    }
                    arrayList3.add(obj);
                }
            } else {
                i2 = 1;
            }
            byte[] bArr = null;
            if (c != null) {
                byte[] bArr2;
                h = c.m20843h(2);
                if (h == null) {
                    i3 = 0;
                    bArr2 = new byte[0];
                } else {
                    i3 = 0;
                    bArr2 = h.getBytes();
                }
                bArr = bArr2;
            } else {
                i3 = 0;
            }
            arrayList2.add(new C4856x(arrayList3, bArr));
        }
        return arrayList2;
    }
}
