package com.foursquare.pilgrim;

import java.util.ArrayList;
import java.util.List;

final class aa {
    /* renamed from: a */
    static final List<Integer> f5269a = new ArrayList();
    /* renamed from: b */
    static final List<Integer> f5270b = new ArrayList();

    static {
        int[] iArr = new int[]{9, 10, 11, 14, 15, 16, 17, 18};
        int[] iArr2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 21, 22, 23};
        int i = 0;
        while (i < 7) {
            for (int i2 : iArr2) {
                f5270b.add(Integer.valueOf((i * 24) + i2));
            }
            if (i > 0 && i < 6) {
                for (int i22 : iArr) {
                    f5269a.add(Integer.valueOf((i * 24) + i22));
                }
            }
            i++;
        }
    }
}
