package com.facebook.ads.internal.view.component.p055a;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.graphics.C0443a;
import android.view.View;
import com.facebook.ads.internal.adapters.C1359i;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C1604d.C1603a;
import com.facebook.ads.internal.view.component.C4189a;
import com.facebook.ads.internal.view.p052c.p053b.C3363q;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.facebook.ads.internal.view.component.a.c */
public class C1594c {
    /* renamed from: a */
    private static final int f4415a = an.f4089a.heightPixels;
    /* renamed from: b */
    private static final int f4416b = an.f4089a.widthPixels;

    /* renamed from: a */
    private static int m5455a(int i) {
        return (f4415a - i) - ((an.m5202a(16) + (C4189a.f13371a * 2)) + (C3367d.a * 2));
    }

    /* renamed from: a */
    public static C1593b m5456a(Context context, C1425f c1425f, C1603a c1603a, View view, C1359i c1359i, C1359i c1359i2, int i, int i2, int i3, int i4) {
        return C1594c.m5457a(context, c1425f, c1603a, view, c1359i, c1359i2, i, i2, i3, i4, null, null);
    }

    /* renamed from: a */
    public static C1593b m5457a(Context context, C1425f c1425f, C1603a c1603a, View view, C1359i c1359i, C1359i c1359i2, int i, int i2, int i3, int i4, @Nullable C3363q c3363q, @Nullable View view2) {
        int i5 = i2;
        View view3 = c3363q;
        C1359i c1359i3 = i5 == 1 ? c1359i : c1359i2;
        int i6 = i;
        boolean a = C1594c.m5460a(i5, i3, i4, i6);
        if (view3 != null) {
            view3.setProgressBarColor(C0443a.m1688c(c1359i3.m4753a(a), ProfileEditingConfig.DEFAULT_MAX_LENGTH));
        }
        if (a) {
            return new C3366a(context, c1425f, c1603a, view, view3, view2, i6, c1359i3, i5 == 2);
        }
        return new C3367d(context, c1425f, c1603a, view, view3, view2, C1594c.m5458a(i3, i4), c1359i3);
    }

    /* renamed from: a */
    private static boolean m5458a(int i, int i2) {
        return ((double) C1594c.m5462c(i, i2)) < 0.9d;
    }

    /* renamed from: a */
    private static boolean m5459a(int i, int i2, int i3) {
        return C1594c.m5455a(i3) < C1594c.m5461b(i, i2);
    }

    /* renamed from: a */
    private static boolean m5460a(int i, int i2, int i3, int i4) {
        if (i != 2) {
            if (!C1594c.m5459a(i2, i3, i4)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m5461b(int i, int i2) {
        return (int) (((float) (f4416b - (C3367d.a * 2))) / C1594c.m5462c(i, i2));
    }

    /* renamed from: c */
    private static float m5462c(int i, int i2) {
        return i2 > 0 ? ((float) i) / ((float) i2) : -1.0f;
    }
}
