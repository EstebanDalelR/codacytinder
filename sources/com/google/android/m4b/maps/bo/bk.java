package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.de.ad;

public final class bk {
    /* renamed from: a */
    public static long m21696a(int i, int i2, int i3) {
        int i4 = i3 * 2;
        int i5 = i2;
        long j = 0;
        i2 = i;
        for (i = 0; i < i4; i += 2) {
            int i6 = i2 & 1;
            int i7 = i5 & 1;
            long j2 = (i6 == 0 && i7 == 0) ? j | (0 << i) : (i6 == 0 && i7 == 1) ? j | (1 << i) : (i6 == 1 && i7 == 1) ? j | (2 << i) : j | (3 << i);
            j = j2;
            i2 >>= 1;
            i5 >>= 1;
        }
        if (i2 == 0 && i5 == 0) {
            if (i4 <= 62) {
                return j | (1 << i4);
            }
        }
        throw new IllegalArgumentException(String.format("Invalid map tile proto X = %d, Y = %d, zoom = %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i3)}));
    }

    /* renamed from: a */
    public static C4662a m21697a(long j) {
        long j2 = j;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (j2 > 1) {
            switch ((int) (j2 & 3)) {
                case 0:
                    break;
                case 1:
                    i |= i2;
                    break;
                case 2:
                    i3 |= i2;
                    i |= i2;
                    break;
                case 3:
                    i3 |= i2;
                    break;
                default:
                    break;
            }
            j2 >>= 2;
            i2 <<= 1;
            i4++;
        }
        if (j2 != 1) {
            String str = "Invalid TUVW ";
            j = String.valueOf(Long.toBinaryString(j));
            throw new IllegalArgumentException(j.length() != 0 ? str.concat(j) : new String(str));
        }
        j = new C4662a(ad.f19861g);
        j.m20841f(2, i3);
        j.m20841f(3, i);
        j.m20841f(4, i4);
        return j;
    }
}
