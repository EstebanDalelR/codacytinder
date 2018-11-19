package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.p068a.C2336a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@zzzv
public final class ain {
    /* renamed from: a */
    public static final ain f15308a = new ain();

    protected ain() {
    }

    /* renamed from: a */
    public static zzjj m19196a(Context context, ake ake) {
        Context context2;
        List list;
        String a;
        ake ake2 = ake;
        Date a2 = ake.m19226a();
        long time = a2 != null ? a2.getTime() : -1;
        String b = ake.m19228b();
        int c = ake.m19229c();
        Collection d = ake.m19230d();
        if (d.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(d));
            context2 = context;
        }
        boolean a3 = ake2.m19227a(context2);
        int l = ake.m19238l();
        Location e = ake.m19231e();
        Bundle a4 = ake2.m19225a(AdMobAdapter.class);
        boolean f = ake.m19232f();
        String g = ake.m19233g();
        C2336a i = ake.m19235i();
        zzmn zzmn = i != null ? new zzmn(i) : null;
        context2 = context.getApplicationContext();
        if (context2 != null) {
            String packageName = context2.getPackageName();
            aja.m19216a();
            a = hn.m19865a(Thread.currentThread().getStackTrace(), packageName);
        } else {
            a = null;
        }
        return new zzjj(7, time, a4, c, list, a3, l, f, g, zzmn, e, b, ake.m19237k(), ake.m19239m(), Collections.unmodifiableList(new ArrayList(ake.m19240n())), ake.m19234h(), a, ake.m19241o());
    }
}
