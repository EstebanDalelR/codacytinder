package com.google.android.m4b.maps.ay;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.m4b.maps.ay.C6411h.C64101;
import com.google.android.m4b.maps.p101a.C4526l;
import com.google.android.m4b.maps.p101a.C6302d;
import com.google.android.m4b.maps.p102b.C6421a;
import com.google.android.m4b.maps.p102b.C6422c;
import com.google.android.m4b.maps.p102b.C6423f;
import com.google.android.m4b.maps.p102b.C6423f.C4740a;
import java.io.File;

public final class ag {
    /* renamed from: a */
    private static final ag f17318a = new ag();

    private ag() {
    }

    /* renamed from: a */
    public static ag m20942a() {
        return f17318a;
    }

    /* renamed from: a */
    public static C4526l m20941a(Context context, C4740a c4740a, String str, boolean z) {
        if (z) {
            c4740a = new C7440r(context, str);
        } else {
            c4740a = new C6423f(c4740a);
        }
        return new C6411h(new C6422c(new File(context.getCacheDir(), "com.google.android.gms.maps.volley"), 20971520), new C6421a(c4740a), new C64101(((((ActivityManager) context.getSystemService("activity")).getMemoryClass() * 1024) * 1024) / 8), new C6302d(new Handler(Looper.getMainLooper())));
    }
}
