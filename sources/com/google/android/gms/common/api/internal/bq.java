package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.C2880a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class bq extends Fragment implements zzcf {
    /* renamed from: a */
    private static WeakHashMap<FragmentActivity, WeakReference<bq>> f13975a = new WeakHashMap();
    /* renamed from: b */
    private Map<String, LifecycleCallback> f13976b = new C2880a();
    /* renamed from: c */
    private int f13977c = 0;
    /* renamed from: d */
    private Bundle f13978d;

    /* renamed from: a */
    public static bq m17223a(FragmentActivity fragmentActivity) {
        bq bqVar;
        WeakReference weakReference = (WeakReference) f13975a.get(fragmentActivity);
        if (weakReference != null) {
            bqVar = (bq) weakReference.get();
            if (bqVar != null) {
                return bqVar;
            }
        }
        try {
            bqVar = (bq) fragmentActivity.getSupportFragmentManager().mo428a("SupportLifecycleFragmentImpl");
            if (bqVar == null || bqVar.isRemoving()) {
                bqVar = new bq();
                fragmentActivity.getSupportFragmentManager().mo429a().mo405a((Fragment) bqVar, "SupportLifecycleFragmentImpl").mo412d();
            }
            f13975a.put(fragmentActivity, new WeakReference(bqVar));
            return bqVar;
        } catch (Throwable e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f13976b.values()) {
            a.mo3573a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f13976b.values()) {
            a.mo2547a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13977c = 1;
        this.f13978d = bundle;
        for (Entry entry : this.f13976b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo2548a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f13977c = 5;
        for (LifecycleCallback e : this.f13976b.values()) {
            e.m8925e();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f13977c = 3;
        for (LifecycleCallback c : this.f13976b.values()) {
            c.mo3578c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f13976b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo2550b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f13977c = 2;
        for (LifecycleCallback b : this.f13976b.values()) {
            b.mo2549b();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f13977c = 4;
        for (LifecycleCallback d : this.f13976b.values()) {
            d.mo2551d();
        }
    }

    public final <T extends LifecycleCallback> T zza(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f13976b.get(str));
    }

    public final void zza(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (this.f13976b.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 59);
            stringBuilder.append("LifecycleCallback with tag ");
            stringBuilder.append(str);
            stringBuilder.append(" already added to this fragment.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f13976b.put(str, lifecycleCallback);
        if (this.f13977c > 0) {
            new Handler(Looper.getMainLooper()).post(new br(this, lifecycleCallback, str));
        }
    }

    public final /* synthetic */ Activity zzajn() {
        return getActivity();
    }
}
