package org.apache.commons.lang3.time;

import com.facebook.ads.AdError;

public class DateUtils {
    /* renamed from: a */
    private static final int[][] f49742a;

    private enum ModifyType {
        TRUNCATE,
        ROUND,
        CEILING
    }

    static {
        r0 = new int[8][];
        r0[0] = new int[]{14};
        r0[1] = new int[]{13};
        r0[2] = new int[]{12};
        r0[3] = new int[]{11, 10};
        r0[4] = new int[]{5, 5, 9};
        r0[5] = new int[]{2, AdError.NO_FILL_ERROR_CODE};
        r0[6] = new int[]{1};
        r0[7] = new int[]{0};
        f49742a = r0;
    }
}
