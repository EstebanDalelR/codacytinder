package com.mapbox.android.core.location;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.C2464a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.C4486f;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.mapbox.android.core.location.d */
class C7073d extends LocationEngine implements ConnectionCallbacks, OnConnectionFailedListener, LocationListener {
    /* renamed from: f */
    private WeakReference<Context> f25682f;
    /* renamed from: g */
    private GoogleApiClient f25683g;
    /* renamed from: h */
    private final Map<LocationEnginePriority, C5764i> f25684h = new GoogleLocationEngine$1(this);

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
    }

    public void onConnectionSuspended(int i) {
    }

    private C7073d(Context context) {
        this.f25682f = new WeakReference(context);
        this.f25683g = new C2464a((Context) this.f25682f.get()).a(this).a(this).a(C4486f.f16730a).b();
    }

    /* renamed from: a */
    static synchronized LocationEngine m30633a(Context context) {
        LocationEngine c7073d;
        synchronized (C7073d.class) {
            c7073d = new C7073d(context.getApplicationContext());
        }
        return c7073d;
    }

    /* renamed from: a */
    public void mo6222a() {
        m30635e();
    }

    /* renamed from: b */
    public void mo6224b() {
        if (this.f25683g != null && this.f25683g.j()) {
            this.f25683g.g();
        }
    }

    public void onConnected(@Nullable Bundle bundle) {
        bundle = this.e.iterator();
        while (bundle.hasNext()) {
            ((LocationEngineListener) bundle.next()).onConnected();
        }
    }

    /* renamed from: c */
    public void mo6225c() {
        LocationRequest create = LocationRequest.create();
        if (this.b != null) {
            create.setInterval((long) this.b.intValue());
        }
        if (this.c != null) {
            create.setFastestInterval((long) this.c.intValue());
        }
        if (this.d != null) {
            create.setSmallestDisplacement(this.d.floatValue());
        }
        m30634a(create);
        if (this.f25683g.j()) {
            C4486f.f16731b.requestLocationUpdates(this.f25683g, create, (LocationListener) this);
        }
    }

    /* renamed from: d */
    public void mo6226d() {
        if (this.f25683g.j()) {
            C4486f.f16731b.removeLocationUpdates(this.f25683g, (LocationListener) this);
        }
    }

    public void onLocationChanged(Location location) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((LocationEngineListener) it.next()).onLocationChanged(location);
        }
    }

    /* renamed from: e */
    private void m30635e() {
        if (this.f25683g == null) {
            return;
        }
        if (this.f25683g.j()) {
            onConnected(null);
        } else {
            this.f25683g.e();
        }
    }

    /* renamed from: a */
    private void m30634a(LocationRequest locationRequest) {
        ((C5764i) this.f25684h.get(this.a)).mo6221a(locationRequest);
    }
}
