package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.ar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@zzzv
public final class alq {
    /* renamed from: a */
    private boolean f15477a;
    /* renamed from: b */
    private String f15478b;
    /* renamed from: c */
    private Map<String, String> f15479c;
    /* renamed from: d */
    private Context f15480d = null;
    /* renamed from: e */
    private String f15481e = null;

    public alq(Context context, String str) {
        this.f15480d = context;
        this.f15481e = str;
        this.f15477a = ((Boolean) aja.m19221f().m19334a(alo.f15430H)).booleanValue();
        this.f15478b = (String) aja.m19221f().m19334a(alo.f15431I);
        this.f15479c = new LinkedHashMap();
        this.f15479c.put("s", "gmob_sdk");
        this.f15479c.put("v", "3");
        this.f15479c.put("os", VERSION.RELEASE);
        this.f15479c.put("sdk", VERSION.SDK);
        ar.e();
        this.f15479c.put("device", fk.m19713b());
        this.f15479c.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map map = this.f15479c;
        String str2 = "is_lite_sdk";
        ar.e();
        map.put(str2, fk.m19741m(context) ? "1" : "0");
        Future a = ar.o().m19563a(this.f15480d);
        try {
            a.get();
            this.f15479c.put("network_coarse", Integer.toString(((bb) a.get()).f15858n));
            this.f15479c.put("network_fine", Integer.toString(((bb) a.get()).f15859o));
        } catch (Throwable e) {
            ar.i().m27296a(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* renamed from: a */
    final boolean m19340a() {
        return this.f15477a;
    }

    /* renamed from: b */
    final String m19341b() {
        return this.f15478b;
    }

    /* renamed from: c */
    final Context m19342c() {
        return this.f15480d;
    }

    /* renamed from: d */
    final String m19343d() {
        return this.f15481e;
    }

    /* renamed from: e */
    final Map<String, String> m19344e() {
        return this.f15479c;
    }
}
