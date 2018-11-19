package com.facebook.ads.internal.p036c;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.ads.internal.p043j.p045b.C1461f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.internal.c.d */
public class C1383d {
    /* renamed from: a */
    private static final String f3744a = "d";
    /* renamed from: b */
    private static C1383d f3745b;
    /* renamed from: c */
    private final Future<C1461f> f3746c;

    private C1383d(final Context context) {
        this.f3746c = Executors.newSingleThreadExecutor().submit(new Callable<C1461f>(this) {
            /* renamed from: b */
            final /* synthetic */ C1383d f3743b;

            /* renamed from: a */
            public C1461f m4816a() {
                return new C1461f(context);
            }

            public /* synthetic */ Object call() {
                return m4816a();
            }
        });
    }

    /* renamed from: a */
    public static C1383d m4817a(Context context) {
        if (f3745b == null) {
            context = context.getApplicationContext();
            synchronized (context) {
                if (f3745b == null) {
                    f3745b = new C1383d(context);
                }
            }
        }
        return f3745b;
    }

    @Nullable
    /* renamed from: a */
    private C1461f m4818a() {
        try {
            return (C1461f) this.f3746c.get(500, TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            Log.e(f3744a, "Timed out waiting for cache server.", e);
            return null;
        }
    }

    /* renamed from: a */
    public void m4819a(String str) {
        C1461f a = m4818a();
        if (a != null) {
            a.m5111a(str);
        }
    }

    @Nullable
    /* renamed from: b */
    public String m4820b(String str) {
        C1461f a = m4818a();
        return a == null ? null : a.m5112b(str);
    }
}
