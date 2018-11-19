package com.bumptech.glide.manager;

import com.bumptech.glide.p026d.C0987h;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.a */
class C3111a implements Lifecycle {
    /* renamed from: a */
    private final Set<LifecycleListener> f9627a = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: b */
    private boolean f9628b;
    /* renamed from: c */
    private boolean f9629c;

    C3111a() {
    }

    public void addListener(LifecycleListener lifecycleListener) {
        this.f9627a.add(lifecycleListener);
        if (this.f9629c) {
            lifecycleListener.onDestroy();
        } else if (this.f9628b) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    /* renamed from: a */
    void m12073a() {
        this.f9628b = true;
        for (LifecycleListener onStart : C0987h.m3409a(this.f9627a)) {
            onStart.onStart();
        }
    }

    /* renamed from: b */
    void m12074b() {
        this.f9628b = false;
        for (LifecycleListener onStop : C0987h.m3409a(this.f9627a)) {
            onStop.onStop();
        }
    }

    /* renamed from: c */
    void m12075c() {
        this.f9629c = true;
        for (LifecycleListener onDestroy : C0987h.m3409a(this.f9627a)) {
            onDestroy.onDestroy();
        }
    }
}
