package com.facebook.ads.internal.p034a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1481b.C1479a;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.ak;
import com.tinder.api.ManagerWebServices;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.d */
class C3250d extends C1348a {
    /* renamed from: d */
    private static final String f9959d = "d";
    /* renamed from: e */
    private final Uri f9960e;
    /* renamed from: f */
    private final Map<String, String> f9961f;

    C3250d(Context context, C1425f c1425f, String str, Uri uri, Map<String, String> map) {
        super(context, c1425f, str);
        this.f9960e = uri;
        this.f9961f = map;
    }

    /* renamed from: a */
    public C1479a mo1717a() {
        return C1479a.OPEN_LINK;
    }

    /* renamed from: b */
    public void mo1718b() {
        m4699a(this.f9961f);
        try {
            C1490h.m5252a(new ak(), this.a, Uri.parse(this.f9960e.getQueryParameter(ManagerWebServices.IG_PARAM_LINK)), this.c);
        } catch (Throwable e) {
            String str = f9959d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to open link url: ");
            stringBuilder.append(this.f9960e.toString());
            Log.d(str, stringBuilder.toString(), e);
        }
    }
}
