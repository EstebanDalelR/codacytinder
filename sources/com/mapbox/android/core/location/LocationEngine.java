package com.mapbox.android.core.location;

import android.support.annotation.RequiresPermission;
import com.facebook.ads.AdError;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class LocationEngine {
    /* renamed from: a */
    protected LocationEnginePriority f21504a;
    /* renamed from: b */
    protected Integer f21505b = Integer.valueOf(AdError.NETWORK_ERROR_CODE);
    /* renamed from: c */
    protected Integer f21506c = Integer.valueOf(AdError.NETWORK_ERROR_CODE);
    /* renamed from: d */
    protected Float f21507d = Float.valueOf(3.0f);
    /* renamed from: e */
    protected CopyOnWriteArrayList<LocationEngineListener> f21508e = new CopyOnWriteArrayList();

    public enum Type {
        GOOGLE_PLAY_SERVICES,
        ANDROID,
        MOCK
    }

    /* renamed from: a */
    public abstract void mo6222a();

    /* renamed from: b */
    public abstract void mo6224b();

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    /* renamed from: c */
    public abstract void mo6225c();

    /* renamed from: d */
    public abstract void mo6226d();

    /* renamed from: a */
    public void mo6223a(LocationEnginePriority locationEnginePriority) {
        this.f21504a = locationEnginePriority;
    }

    /* renamed from: a */
    public void m25327a(LocationEngineListener locationEngineListener) {
        if (!this.f21508e.contains(locationEngineListener)) {
            this.f21508e.add(locationEngineListener);
        }
    }

    /* renamed from: b */
    public boolean m25330b(LocationEngineListener locationEngineListener) {
        return this.f21508e.remove(locationEngineListener);
    }
}
