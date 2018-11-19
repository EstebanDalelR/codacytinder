package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.util.C2880a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class az extends Fragment implements zzcf {
    /* renamed from: a */
    private static WeakHashMap<Activity, WeakReference<az>> f11922a = new WeakHashMap();
    /* renamed from: b */
    private Map<String, LifecycleCallback> f11923b = new C2880a();
    /* renamed from: c */
    private int f11924c = 0;
    /* renamed from: d */
    private Bundle f11925d;

    /* renamed from: a */
    public static az m14277a(Activity activity) {
        az azVar;
        WeakReference weakReference = (WeakReference) f11922a.get(activity);
        if (weakReference != null) {
            azVar = (az) weakReference.get();
            if (azVar != null) {
                return azVar;
            }
        }
        try {
            azVar = (az) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (azVar == null || azVar.isRemoving()) {
                azVar = new az();
                activity.getFragmentManager().beginTransaction().add(azVar, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f11922a.put(activity, new WeakReference(azVar));
            return azVar;
        } catch (Throwable e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f11923b.values()) {
            a.mo3573a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f11923b.values()) {
            a.mo2547a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11924c = 1;
        this.f11925d = bundle;
        for (Entry entry : this.f11923b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo2548a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f11924c = 5;
        for (LifecycleCallback e : this.f11923b.values()) {
            e.m8925e();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f11924c = 3;
        for (LifecycleCallback c : this.f11923b.values()) {
            c.mo3578c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f11923b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo2550b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f11924c = 2;
        for (LifecycleCallback b : this.f11923b.values()) {
            b.mo2549b();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f11924c = 4;
        for (LifecycleCallback d : this.f11923b.values()) {
            d.mo2551d();
        }
    }

    public final <T extends LifecycleCallback> T zza(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f11923b.get(str));
    }

    public final void zza(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (this.f11923b.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 59);
            stringBuilder.append("LifecycleCallback with tag ");
            stringBuilder.append(str);
            stringBuilder.append(" already added to this fragment.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f11923b.put(str, lifecycleCallback);
        if (this.f11924c > 0) {
            new Handler(Looper.getMainLooper()).post(new ba(this, lifecycleCallback, str));
        }
    }

    public final Activity zzajn() {
        return getActivity();
    }
}
