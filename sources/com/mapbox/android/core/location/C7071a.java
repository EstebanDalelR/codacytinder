package com.mapbox.android.core.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.mapbox.android.core.permissions.C5765a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.mapbox.android.core.location.a */
class C7071a extends LocationEngine implements LocationListener {
    /* renamed from: f */
    private WeakReference<Context> f25678f;
    /* renamed from: g */
    private LocationManager f25679g;
    /* renamed from: h */
    private String f25680h = null;
    /* renamed from: i */
    private final Map<LocationEnginePriority, C5763h> f25681i = new AndroidLocationEngine$1(this);

    /* renamed from: b */
    public void mo6224b() {
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    private C7071a(Context context) {
        this.f25678f = new WeakReference(context);
        this.f25679g = (LocationManager) ((Context) this.f25678f.get()).getSystemService("location");
        this.f25680h = "passive";
    }

    /* renamed from: a */
    static synchronized LocationEngine m30623a(Context context) {
        LocationEngine c7071a;
        synchronized (C7071a.class) {
            c7071a = new C7071a(context.getApplicationContext());
        }
        return c7071a;
    }

    /* renamed from: a */
    public void mo6222a() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((LocationEngineListener) it.next()).onConnected();
        }
    }

    /* renamed from: c */
    public void mo6225c() {
        if (!TextUtils.isEmpty(this.f25680h)) {
            this.f25679g.requestLocationUpdates(this.f25680h, (long) this.c.intValue(), this.d.floatValue(), this);
        }
    }

    /* renamed from: a */
    public void mo6223a(LocationEnginePriority locationEnginePriority) {
        super.mo6223a(locationEnginePriority);
        m30625e();
    }

    /* renamed from: d */
    public void mo6226d() {
        if (C5765a.m25342a((Context) this.f25678f.get())) {
            this.f25679g.removeUpdates(this);
        }
    }

    public void onLocationChanged(Location location) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((LocationEngineListener) it.next()).onLocationChanged(location);
        }
    }

    /* renamed from: e */
    private void m30625e() {
        ((C5763h) this.f25681i.get(this.a)).mo6220a();
    }
}
