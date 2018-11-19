package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C2526k;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cj implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    /* renamed from: a */
    private static final cj f7525a = new cj();
    /* renamed from: b */
    private final AtomicBoolean f7526b = new AtomicBoolean();
    /* renamed from: c */
    private final AtomicBoolean f7527c = new AtomicBoolean();
    /* renamed from: d */
    private final ArrayList<zzl> f7528d = new ArrayList();
    /* renamed from: e */
    private boolean f7529e = false;

    private cj() {
    }

    /* renamed from: a */
    public static cj m8997a() {
        return f7525a;
    }

    /* renamed from: a */
    public static void m8998a(Application application) {
        synchronized (f7525a) {
            if (!f7525a.f7529e) {
                application.registerActivityLifecycleCallbacks(f7525a);
                application.registerComponentCallbacks(f7525a);
                f7525a.f7529e = true;
            }
        }
    }

    /* renamed from: b */
    private final void m8999b(boolean z) {
        synchronized (f7525a) {
            ArrayList arrayList = this.f7528d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((zzl) obj).zzbf(z);
            }
        }
    }

    /* renamed from: a */
    public final void m9000a(zzl zzl) {
        synchronized (f7525a) {
            this.f7528d.add(zzl);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public final boolean m9001a(boolean z) {
        if (!this.f7527c.get()) {
            if (!C2526k.m9211b()) {
                return true;
            }
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f7527c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f7526b.set(true);
            }
        }
        return this.f7526b.get();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f7526b.compareAndSet(true, false);
        this.f7527c.set(true);
        if (compareAndSet) {
            m8999b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f7526b.compareAndSet(true, false);
        this.f7527c.set(true);
        if (compareAndSet) {
            m8999b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f7526b.compareAndSet(false, true)) {
            this.f7527c.set(true);
            m8999b(true);
        }
    }
}
