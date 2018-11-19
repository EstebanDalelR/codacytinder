package com.tinder.managers;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.C2464a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.C4486f;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest.C4482a;
import com.google.android.gms.location.LocationSettingsResult;
import com.tinder.R;
import com.tinder.events.EventLocationSet;
import com.tinder.module.Default;
import com.tinder.module.ForApplication;
import com.tinder.utils.ad;
import com.tinder.utils.at;
import de.greenrobot.event.C2664c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ManagerFusedLocation implements ConnectionCallbacks, OnConnectionFailedListener, LocationListener {
    /* renamed from: a */
    private final List<ListenerLocationChanged> f12392a = new ArrayList();
    /* renamed from: b */
    private Context f12393b;
    /* renamed from: c */
    private int f12394c = 0;
    /* renamed from: d */
    private GoogleApiClient f12395d;
    /* renamed from: e */
    private WeakReference<Activity> f12396e;
    /* renamed from: f */
    private boolean f12397f = false;
    /* renamed from: g */
    private bk f12398g;
    /* renamed from: h */
    private C2664c f12399h;
    @Nullable
    /* renamed from: i */
    private Location f12400i = null;
    /* renamed from: j */
    private int f12401j = 0;
    /* renamed from: k */
    private boolean f12402k = false;
    /* renamed from: l */
    private bt f12403l;

    public interface ListenerLocationChanged {
        void onLocationChanged(Location location);
    }

    @Inject
    public ManagerFusedLocation(@ForApplication Context context, bk bkVar, @Default C2664c c2664c, bt btVar) {
        ad.m10189a();
        this.f12393b = context;
        this.f12398g = bkVar;
        this.f12399h = c2664c;
        this.f12403l = btVar;
    }

    /* renamed from: k */
    private void m14887k() {
        if (this.f12395d == null) {
            ad.m10190a("Setting up a new google location client.");
            this.f12395d = new C2464a(this.f12393b).m8854a(C4486f.f16730a).m8857a((ConnectionCallbacks) this).m8858a((OnConnectionFailedListener) this).m8860b();
        } else {
            ad.m10190a("Google location client already existed, not recreating it.");
        }
        m14890a();
    }

    /* renamed from: a */
    public void m14890a() {
        if (this.f12395d == null || this.f12395d.mo2510k() || this.f12395d.mo2509j()) {
            ad.m10190a("Not connect()ing to google location client, already connected or connecting.");
            return;
        }
        ad.m10190a("Connect()ing to google location client");
        this.f12395d.mo2504e();
    }

    /* renamed from: a */
    public boolean m14895a(Activity activity) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Updating current location using activity ");
        stringBuilder.append(activity.getClass().getSimpleName());
        ad.m10190a(stringBuilder.toString());
        this.f12396e = new WeakReference(activity);
        if (this.f12395d != null) {
            ad.m10190a("location googleapiclient not null");
            if (this.f12395d.mo2509j() != null) {
                ad.m10190a("location google api client connected");
                activity = C4486f.f16731b.getLastLocation(this.f12395d);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("location ");
                stringBuilder2.append(activity);
                ad.m10190a(stringBuilder2.toString());
                if (activity != null) {
                    int i = SystemClock.elapsedRealtimeNanos() - activity.getElapsedRealtimeNanos() > 300000000000L ? 0 : 1;
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("last known location is too old to use? ");
                    stringBuilder3.append(i ^ 1);
                    ad.m10190a(stringBuilder3.toString());
                    if (i != 0) {
                        ad.m10199d("Shortcutting by using old last known location, since it's not THAT old.");
                        onLocationChanged(activity);
                        return true;
                    }
                }
            }
            ad.m10197c("location googleapiclient not connected but setup, trying to connect");
            if (this.f12397f == null) {
                m14890a();
            }
        } else {
            ad.m10190a("location googleapiclient null, call connection to location services");
            if (this.f12397f == null) {
                m14887k();
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m14891a(double d, double d2) {
        this.f12398g.m14953a(d);
        this.f12398g.m14961b(d2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lat: ");
        stringBuilder.append(d);
        stringBuilder.append(" long: ");
        stringBuilder.append(d2);
        d = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("location **************_________ Storing ");
        stringBuilder2.append(d);
        stringBuilder2.append(" _________**************");
        ad.m10190a(stringBuilder2.toString());
    }

    /* renamed from: b */
    public boolean m14897b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("location lat: ");
        stringBuilder.append(m14899d());
        stringBuilder.append(" lon: ");
        stringBuilder.append(m14900e());
        ad.m10190a(stringBuilder.toString());
        return (m14899d() == -100000.0d || m14900e() == -100000.0d) ? false : true;
    }

    @Nullable
    /* renamed from: c */
    public Location m14898c() {
        return this.f12400i;
    }

    /* renamed from: d */
    public double m14899d() {
        return this.f12400i == null ? -100000.0d : this.f12400i.getLatitude();
    }

    /* renamed from: e */
    public double m14900e() {
        return this.f12400i == null ? -100000.0d : this.f12400i.getLongitude();
    }

    public void onLocationChanged(@NonNull Location location) {
        ad.m10189a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("location onLocation: ");
        stringBuilder.append(location);
        ad.m10190a(stringBuilder.toString());
        Bundle extras = location.getExtras();
        boolean z = false;
        if (extras != null && extras.getBoolean("mockLocation", false)) {
            z = true;
        }
        if (!z) {
            z = location.isFromMockProvider();
        }
        if (z) {
            ad.m10197c("Cannot use Tinder with a fake mock location.");
            C4486f.f16731b.flushLocations(this.f12395d);
            return;
        }
        m14885a(location);
        for (ListenerLocationChanged onLocationChanged : this.f12392a) {
            onLocationChanged.onLocationChanged(location);
        }
    }

    /* renamed from: a */
    public void m14892a(Activity activity, ListenerLocationChanged listenerLocationChanged) {
        this.f12392a.add(listenerLocationChanged);
        this.f12394c += 1;
        listenerLocationChanged = new StringBuilder();
        listenerLocationChanged.append("location numGpsUsers: ");
        listenerLocationChanged.append(this.f12394c);
        ad.m10190a(listenerLocationChanged.toString());
        if (this.f12394c == 1) {
            m14886c(activity);
        }
    }

    /* renamed from: a */
    public void m14894a(ListenerLocationChanged listenerLocationChanged) {
        ad.m10189a();
        if (this.f12394c == 0 && this.f12403l.b()) {
            ad.m10197c("Attempting to remove a location listener, but none are registered! Check your code!");
            return;
        }
        this.f12394c--;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("location numGpsUsers: ");
        stringBuilder.append(this.f12394c);
        ad.m10190a(stringBuilder.toString());
        if (this.f12394c == 0) {
            m14888l();
        }
        for (int i = 0; i < this.f12392a.size(); i++) {
            if (this.f12392a.get(i) == listenerLocationChanged) {
                this.f12392a.remove(i);
                return;
            }
        }
    }

    /* renamed from: b */
    public void m14896b(Activity activity) {
        this.f12401j++;
        this.f12397f = false;
        if (this.f12396e == null || this.f12396e.get() == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Location activity reference dead, settting to ");
            stringBuilder.append(activity.getClass());
            ad.m10190a(stringBuilder.toString());
            this.f12396e = new WeakReference(activity);
        }
        activity = new StringBuilder();
        activity.append("location googleApiClient connect, active activities: ");
        activity.append(this.f12401j);
        ad.m10190a(activity.toString());
        m14887k();
    }

    /* renamed from: f */
    public void m14901f() {
        ad.m10189a();
        this.f12397f = true;
        if (this.f12395d != null) {
            this.f12395d.mo2506g();
        }
    }

    /* renamed from: g */
    public void m14902g() {
        this.f12401j--;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Got activity stop for location, remaining activities: ");
        stringBuilder.append(this.f12401j);
        ad.m10190a(stringBuilder.toString());
        if (this.f12395d != null && this.f12401j == 0) {
            ad.m10190a("location googleApiClient disconnect");
            this.f12395d.mo2506g();
        }
    }

    /* renamed from: h */
    public void m14903h() {
        if (this.f12392a != null) {
            for (int i = 0; i < this.f12392a.size(); i++) {
                this.f12392a.remove(i);
            }
        }
        this.f12394c = 0;
        m14888l();
    }

    /* renamed from: l */
    private void m14888l() {
        ad.m10190a("*** STOPPING GPS ***");
        if (this.f12395d != null && this.f12395d.mo2509j()) {
            C4486f.f16731b.removeLocationUpdates(this.f12395d, this);
        }
    }

    /* renamed from: c */
    private void m14886c(Activity activity) {
        ad.m10190a("*** STARTING GPS ***");
        m14895a(activity);
    }

    public void onConnected(Bundle bundle) {
        ad.m10189a();
        m14904i();
    }

    /* renamed from: m */
    private boolean m14889m() {
        return this.f12395d != null && this.f12395d.mo2509j();
    }

    /* renamed from: i */
    public void m14904i() {
        if (m14889m()) {
            m14885a(C4486f.f16731b.getLastLocation(this.f12395d));
            LocationRequest create = LocationRequest.create();
            create.setPriority(102);
            create.setInterval(60000);
            create.setFastestInterval(30000);
            create.setSmallestDisplacement(1609.0f);
            C4486f.f16733d.checkLocationSettings(this.f12395d, new C4482a().a(true).a(create).a()).mo2487a(new ab(this, create));
            return;
        }
        ad.m10197c("Failed to create and requests location updates, client is null or not connected");
    }

    /* renamed from: a */
    final /* synthetic */ void m14893a(LocationRequest locationRequest, LocationSettingsResult locationSettingsResult) {
        if (m14889m()) {
            locationSettingsResult = locationSettingsResult.getStatus();
            int statusCode = locationSettingsResult.getStatusCode();
            if (statusCode == 0) {
                ad.m10199d("Location ask successful. Requesting updates!");
                C4486f.f16731b.requestLocationUpdates(this.f12395d, locationRequest, this);
            } else if (statusCode == 6) {
                ad.m10199d("Location ask resolution needed!");
                try {
                    if (this.f12396e == null) {
                        ad.m10197c("Cannot attempt to fix locations settings without an activity.");
                        return;
                    }
                    Activity activity = (Activity) this.f12396e.get();
                    if (activity != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Resolution result will go to ");
                        stringBuilder.append(activity.getClass());
                        ad.m10190a(stringBuilder.toString());
                        locationSettingsResult.startResolutionForResult(activity, 10000);
                    } else {
                        ad.m10197c("No activity in weak ref to get location resolution result from");
                    }
                } catch (Throwable e) {
                    ad.m10193a("Failed to send intent to activity about location settings update", e);
                }
            } else if (statusCode == 8502) {
                ad.m10197c("Could not change settings for locations, user perma-denied us?");
                if (this.f12396e.get() != null) {
                    at.a((Activity) this.f12396e.get(), R.string.location_perma_disabled);
                }
            }
            return;
        }
        ad.m10197c("Google API client is null or not connected, unable to continue.");
        if (this.f12401j > null) {
            m14887k();
        }
    }

    public void onConnectionSuspended(int i) {
        ad.m10189a();
    }

    public void onConnectionFailed(@android.support.annotation.NonNull com.google.android.gms.common.ConnectionResult r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r5 = this;
        com.tinder.utils.ad.m10189a();
        r0 = r5.f12402k;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        goto L_0x0061;
    L_0x0008:
        r0 = r6.hasResolution();
        r1 = 9000; // 0x2328 float:1.2612E-41 double:4.4466E-320;
        r2 = 1;
        r3 = 0;
        if (r0 == 0) goto L_0x0036;
    L_0x0012:
        r5.f12402k = r2;	 Catch:{ SendIntentException -> 0x0032 }
        r0 = r5.f12396e;	 Catch:{ SendIntentException -> 0x0032 }
        r0 = com.tinder.utils.C15374w.a(r0);	 Catch:{ SendIntentException -> 0x0032 }
        if (r0 == 0) goto L_0x002c;	 Catch:{ SendIntentException -> 0x0032 }
    L_0x001c:
        r0 = r5.f12396e;	 Catch:{ SendIntentException -> 0x0032 }
        r0 = r0.get();	 Catch:{ SendIntentException -> 0x0032 }
        r0 = (android.app.Activity) r0;	 Catch:{ SendIntentException -> 0x0032 }
        r2 = r0.isFinishing();	 Catch:{ SendIntentException -> 0x0032 }
        if (r2 == 0) goto L_0x002b;	 Catch:{ SendIntentException -> 0x0032 }
    L_0x002a:
        goto L_0x002c;	 Catch:{ SendIntentException -> 0x0032 }
    L_0x002b:
        r3 = r0;	 Catch:{ SendIntentException -> 0x0032 }
    L_0x002c:
        if (r3 == 0) goto L_0x0061;	 Catch:{ SendIntentException -> 0x0032 }
    L_0x002e:
        r6.startResolutionForResult(r3, r1);	 Catch:{ SendIntentException -> 0x0032 }
        goto L_0x0061;
    L_0x0032:
        r5.m14890a();
        goto L_0x0061;
    L_0x0036:
        r0 = r5.f12396e;
        r0 = com.tinder.utils.C15374w.a(r0);
        if (r0 == 0) goto L_0x004e;
    L_0x003e:
        r0 = r5.f12396e;
        r0 = r0.get();
        r0 = (android.app.Activity) r0;
        r4 = r0.isFinishing();
        if (r4 == 0) goto L_0x004d;
    L_0x004c:
        goto L_0x004e;
    L_0x004d:
        r3 = r0;
    L_0x004e:
        if (r3 == 0) goto L_0x0061;
    L_0x0050:
        r0 = com.google.android.gms.common.C3813b.m14425a();
        r6 = r6.getErrorCode();
        r6 = r0.m14431a(r3, r6, r1);
        r6.show();
        r5.f12402k = r2;
    L_0x0061:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.managers.ManagerFusedLocation.onConnectionFailed(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: j */
    public void m14905j() {
        this.f12402k = false;
    }

    /* renamed from: a */
    private void m14885a(@Nullable Location location) {
        if (location != null && location.getLatitude() != -100000.0d && location.getLongitude() != -100000.0d) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("latitude: ");
            stringBuilder.append(location.getLatitude());
            ad.m10190a(stringBuilder.toString());
            boolean z = this.f12400i == null;
            this.f12400i = location;
            this.f12399h.m10260d(new EventLocationSet(location, z));
        }
    }
}
