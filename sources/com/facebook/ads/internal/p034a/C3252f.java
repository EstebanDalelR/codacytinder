package com.facebook.ads.internal.p034a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1481b.C1479a;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.ak;

/* renamed from: com.facebook.ads.internal.a.f */
public class C3252f extends C1348a {
    /* renamed from: d */
    private static final String f9965d = "f";
    /* renamed from: e */
    private final Uri f9966e;

    public C3252f(Context context, C1425f c1425f, String str, Uri uri) {
        super(context, c1425f, str);
        this.f9966e = uri;
    }

    /* renamed from: a */
    public C1479a mo1717a() {
        return C1479a.OPEN_LINK;
    }

    /* renamed from: b */
    public void mo1718b() {
        try {
            Log.w("REDIRECTACTION: ", this.f9966e.toString());
            C1490h.m5252a(new ak(), this.a, this.f9966e, this.c);
        } catch (Throwable e) {
            String str = f9965d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to open link url: ");
            stringBuilder.append(this.f9966e.toString());
            Log.d(str, stringBuilder.toString(), e);
        }
    }
}
