package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fe;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.sv;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzzv;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.f */
public final class C3736f implements zzcr, Runnable {
    /* renamed from: a */
    private final List<Object[]> f11778a;
    /* renamed from: b */
    private final AtomicReference<zzcr> f11779b;
    /* renamed from: c */
    private Context f11780c;
    /* renamed from: d */
    private zzakd f11781d;
    /* renamed from: e */
    private CountDownLatch f11782e;

    private C3736f(Context context, zzakd zzakd) {
        this.f11778a = new Vector();
        this.f11779b = new AtomicReference();
        this.f11782e = new CountDownLatch(1);
        this.f11780c = context;
        this.f11781d = zzakd;
        aja.a();
        if (hn.b()) {
            fe.a(this);
        } else {
            run();
        }
    }

    public C3736f(as asVar) {
        this(asVar.f7163c, asVar.f7165e);
    }

    /* renamed from: a */
    private static Context m14173a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    private final boolean m14174a() {
        try {
            this.f11782e.await();
            return true;
        } catch (Throwable e) {
            ec.c("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* renamed from: b */
    private final void m14175b() {
        if (!this.f11778a.isEmpty()) {
            for (Object[] objArr : this.f11778a) {
                if (objArr.length == 1) {
                    ((zzcr) this.f11779b.get()).zza((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((zzcr) this.f11779b.get()).zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f11778a.clear();
        }
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.f11781d.zzdel;
            if (!((Boolean) aja.f().a(alo.az)).booleanValue() && z2) {
                z = true;
            }
            this.f11779b.set(sv.a(this.f11781d.zzcv, C3736f.m14173a(this.f11780c), z));
        } finally {
            this.f11782e.countDown();
            this.f11780c = null;
            this.f11781d = null;
        }
    }

    public final String zza(Context context) {
        if (m14174a()) {
            zzcr zzcr = (zzcr) this.f11779b.get();
            if (zzcr != null) {
                m14175b();
                return zzcr.zza(C3736f.m14173a(context));
            }
        }
        return "";
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        if (m14174a()) {
            zzcr zzcr = (zzcr) this.f11779b.get();
            if (zzcr != null) {
                m14175b();
                return zzcr.zza(C3736f.m14173a(context), str, view, activity);
            }
        }
        return "";
    }

    public final void zza(int i, int i2, int i3) {
        zzcr zzcr = (zzcr) this.f11779b.get();
        if (zzcr != null) {
            m14175b();
            zzcr.zza(i, i2, i3);
            return;
        }
        this.f11778a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void zza(MotionEvent motionEvent) {
        zzcr zzcr = (zzcr) this.f11779b.get();
        if (zzcr != null) {
            m14175b();
            zzcr.zza(motionEvent);
            return;
        }
        this.f11778a.add(new Object[]{motionEvent});
    }

    public final void zzb(View view) {
        zzcr zzcr = (zzcr) this.f11779b.get();
        if (zzcr != null) {
            zzcr.zzb(view);
        }
    }
}
