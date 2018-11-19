package com.facebook.ads.internal.p047k;

import android.content.Context;
import com.facebook.ads.internal.C1418g;
import java.util.Random;

/* renamed from: com.facebook.ads.internal.k.af */
public class af {
    /* renamed from: a */
    private static String m5177a() {
        return ah.m5182a(Thread.currentThread().getStackTrace());
    }

    /* renamed from: a */
    public static String m5178a(Context context) {
        return af.m5179a(context, C1418g.m4942m(context));
    }

    /* renamed from: a */
    static String m5179a(Context context, int i) {
        String str = null;
        if (i <= 0) {
            return null;
        }
        if (new Random().nextFloat() < 1.0f / ((float) i)) {
            str = af.m5177a();
        }
        return str;
    }
}
