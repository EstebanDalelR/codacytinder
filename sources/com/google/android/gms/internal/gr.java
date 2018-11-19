package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import java.io.File;
import java.util.Map;

@zzzv
public final class gr {
    /* renamed from: a */
    private static ary f16117a;
    /* renamed from: b */
    private static final Object f16118b = new Object();
    @Deprecated
    /* renamed from: c */
    private static zzajb<Void> f16119c = new gs();

    public gr(Context context) {
        m19829a(context);
    }

    /* renamed from: a */
    private static ary m19829a(Context context) {
        ary a;
        synchronized (f16118b) {
            if (f16117a == null) {
                context = context.getApplicationContext();
                alo.m19337a(context);
                if (((Boolean) aja.m19221f().m19334a(alo.cs)).booleanValue()) {
                    a = gm.m31569a(context);
                } else {
                    a = new ary(new iq(new File(context.getCacheDir(), "volley")), new fx(new mc()));
                    a.m19467a();
                }
                f16117a = a;
            }
            a = f16117a;
        }
        return a;
    }

    /* renamed from: a */
    public final zzakv<String> m19830a(int i, String str, @Nullable Map<String, String> map, @Nullable byte[] bArr) {
        String str2 = str;
        zzakv gyVar = new gy();
        zzx gvVar = new gv(this, str2, gyVar);
        hq hqVar = new hq(null);
        aom gxVar = new gx(this, i, str2, gyVar, gvVar, bArr, map, hqVar);
        if (hq.m19901c()) {
            try {
                hqVar.m19903a(str2, "GET", gxVar.mo6872b(), gxVar.mo6871a());
            } catch (Throwable e) {
                hx.m19916e(e.getMessage());
            }
        }
        f16117a.m19466a(gxVar);
        return gyVar;
    }

    @Deprecated
    /* renamed from: a */
    public final <T> zzakv<T> m19831a(String str, zzajb<T> zzajb) {
        zzakv iwVar = new iw();
        f16117a.m19466a(new gz(str, iwVar));
        return id.m19924a(id.m19923a(iwVar, new gu(this, zzajb), ir.f16196b), Throwable.class, new gt(this, zzajb), ir.f16196b);
    }

    /* renamed from: a */
    public final zzakv<String> m19832a(String str, Map<String, String> map) {
        return m19830a(0, str, map, null);
    }
}
