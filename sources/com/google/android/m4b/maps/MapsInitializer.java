package com.google.android.m4b.maps;

import android.content.Context;
import com.google.android.m4b.maps.model.BitmapDescriptorFactory;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p124x.C5537e;
import com.google.android.m4b.maps.p124x.an;

public final class MapsInitializer {
    /* renamed from: a */
    private static boolean f16763a = false;

    /* renamed from: a */
    public static synchronized int m20402a(Context context) {
        synchronized (MapsInitializer.class) {
            C5462v.m23768a((Object) context, (Object) "Context is null");
            if (f16763a) {
                return 0;
            }
            try {
                m20403a(an.m24121a(context));
                f16763a = true;
                return 0;
            } catch (Context context2) {
                return context2.f20335a;
            }
        }
    }

    /* renamed from: a */
    public static void m20403a(C5537e c5537e) {
        try {
            CameraUpdateFactory.m20387a(c5537e.mo7247a());
            BitmapDescriptorFactory.m23846a(c5537e.mo7251b());
        } catch (C5537e c5537e2) {
            throw new RuntimeRemoteException(c5537e2);
        }
    }

    private MapsInitializer() {
    }
}
