package com.leanplum;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.C2464a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.C4486f;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.Geofence.C4480a;
import com.google.android.gms.location.GeofencingRequest.C4481a;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.leanplum.p069a.ab;
import com.leanplum.p069a.ag;
import com.leanplum.p069a.aj;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.bo;
import com.leanplum.utils.SharedPreferencesUtil;
import com.tinder.api.ManagerWebServices;
import io.fabric.sdk.android.services.events.C15645a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class LocationManagerImplementation implements ConnectionCallbacks, OnConnectionFailedListener, LocationListener, LocationManager {
    private static final double ACCURACY_THRESHOLD_GPS = 100.0d;
    private static final long LOCATION_REQUEST_INTERVAL = 60000;
    private static final long LOCATION_UPDATE_INTERVAL = 7200000;
    private static final String METADATA = "com.google.android.gms.version";
    private static final String PERMISSION = "android.permission.ACCESS_FINE_LOCATION";
    private static LocationManagerImplementation instance;
    private List<Geofence> allGeofences;
    private List<Geofence> backgroundGeofences;
    private GoogleApiClient googleApiClient;
    private boolean isInBackground;
    private boolean isSendingLocation;
    private Map<String, Object> lastKnownState;
    private LeanplumLocationAccuracyType lastLocationSentAccuracyType;
    private Date lastLocationSentDate;
    private Map<String, Object> stateBeforeBackground;
    private List<String> trackedGeofenceIds = new ArrayList();

    private int getStatusForTransitionType(int i) {
        if (i != 1) {
            if (i != 4) {
                return 4;
            }
        }
        return 2;
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
    }

    public void onConnectionSuspended(int i) {
    }

    public static synchronized LocationManager instance() {
        LocationManager locationManager;
        synchronized (LocationManagerImplementation.class) {
            if (instance == null) {
                instance = new LocationManagerImplementation();
            }
            locationManager = instance;
        }
        return locationManager;
    }

    private LocationManagerImplementation() {
        loadLastKnownRegionState();
        this.isInBackground = bo.j();
        this.isSendingLocation = false;
        this.lastLocationSentAccuracyType = LeanplumLocationAccuracyType.IP;
        updateUserLocation();
    }

    public void setRegionsData(Map<String, Object> map, Set<String> set, Set<String> set2) {
        if (bo.i()) {
            this.allGeofences = new ArrayList();
            this.backgroundGeofences = new ArrayList();
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                String str = (String) entry.getKey();
                boolean contains = set.contains(str);
                boolean contains2 = set2.contains(str);
                if (contains || contains2) {
                    Geofence geofenceFromMap = geofenceFromMap((Map) entry.getValue(), str);
                    if (geofenceFromMap != null) {
                        if (contains2) {
                            this.backgroundGeofences.add(geofenceFromMap);
                        }
                        this.allGeofences.add(geofenceFromMap);
                        if (this.lastKnownState.get(geofenceFromMap.getRequestId()) == null) {
                            this.lastKnownState.put(geofenceFromMap.getRequestId(), Integer.valueOf(1));
                        }
                    }
                }
            }
            updateGeofencing();
        }
    }

    public void updateUserLocation() {
        startLocationClient();
        if (this.googleApiClient != null && this.googleApiClient.j()) {
            requestLocation();
        }
    }

    public void updateGeofencing() {
        if (this.allGeofences != null && this.backgroundGeofences != null) {
            startLocationClient();
            if (this.googleApiClient != null && this.googleApiClient.j()) {
                updateTrackedGeofences();
            }
        }
    }

    private void loadLastKnownRegionState() {
        if (this.lastKnownState == null) {
            String string = Leanplum.getContext().getSharedPreferences("__leanplum__location", 0).getString("regionState", null);
            if (string == null) {
                this.lastKnownState = new HashMap();
            } else {
                this.lastKnownState = ab.a(string);
            }
        }
    }

    private void saveLastKnownRegionState() {
        if (this.lastKnownState != null) {
            Editor edit = Leanplum.getContext().getSharedPreferences("__leanplum__location", 0).edit();
            edit.putString("regionState", ab.a(this.lastKnownState));
            SharedPreferencesUtil.commitChanges(edit);
        }
    }

    private Geofence geofenceFromMap(Map<String, Object> map, String str) {
        Number number = (Number) map.get(ManagerWebServices.PARAM_LAT);
        Number number2 = (Number) map.get(ManagerWebServices.PARAM_LON);
        Number number3 = (Number) map.get("radius");
        Number number4 = (Number) map.get("version");
        if (number == null) {
            return null;
        }
        C4480a c4480a = new C4480a();
        double floatValue = (double) number.floatValue();
        double floatValue2 = (double) number2.floatValue();
        c4480a.m20338a(floatValue, floatValue2, number3.floatValue());
        c4480a.m20341a(geofenceID(str, Integer.valueOf(number4.intValue())));
        c4480a.m20339a(3);
        c4480a.m20340a((long) -1);
        return c4480a.m20342a();
    }

    private String geofenceID(String str, Integer num) {
        StringBuilder stringBuilder = new StringBuilder("__leanplum");
        stringBuilder.append(str);
        stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
        stringBuilder.append(num.toString());
        return stringBuilder.toString();
    }

    private void startLocationClient() {
        if (isPermissionGranted()) {
            if (isMetaDataSet()) {
                if (this.googleApiClient == null) {
                    this.googleApiClient = new C2464a(Leanplum.getContext()).a(C4486f.f16730a).a(this).a(this).b();
                }
                if (!(this.googleApiClient.j() || this.googleApiClient.k())) {
                    this.googleApiClient.e();
                }
                return;
            }
        }
        ao.c(new Object[]{"You have to set the application meta data and location permission to use location services."});
    }

    private boolean isPermissionGranted() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = com.leanplum.Leanplum.getContext();
        r1 = 0;
        r2 = "android.permission.ACCESS_FINE_LOCATION";	 Catch:{ RuntimeException -> 0x0010 }
        r0 = r0.checkCallingOrSelfPermission(r2);	 Catch:{ RuntimeException -> 0x0010 }
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        r0 = 1;
        return r0;
    L_0x000f:
        return r1;
    L_0x0010:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.LocationManagerImplementation.isPermissionGranted():boolean");
    }

    private boolean isMetaDataSet() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = com.leanplum.Leanplum.getContext();
        r1 = 0;
        r2 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0026 }
        r0 = r0.getPackageName();	 Catch:{ NameNotFoundException -> 0x0026 }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0026 }
        r0 = r2.getApplicationInfo(r0, r3);	 Catch:{ NameNotFoundException -> 0x0026 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ NameNotFoundException -> 0x0026 }
    L_0x0015:
        r2 = r0.metaData;	 Catch:{ NameNotFoundException -> 0x0026 }
        if (r2 == 0) goto L_0x0025;	 Catch:{ NameNotFoundException -> 0x0026 }
    L_0x0019:
        r0 = r0.metaData;	 Catch:{ NameNotFoundException -> 0x0026 }
        r2 = "com.google.android.gms.version";	 Catch:{ NameNotFoundException -> 0x0026 }
        r0 = r0.get(r2);	 Catch:{ NameNotFoundException -> 0x0026 }
        if (r0 == 0) goto L_0x0025;
    L_0x0023:
        r0 = 1;
        return r0;
    L_0x0025:
        return r1;
    L_0x0026:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.LocationManagerImplementation.isMetaDataSet():boolean");
    }

    private void updateTrackedGeofences() {
        if (!(this.allGeofences == null || this.googleApiClient == null)) {
            if (this.googleApiClient.j()) {
                if (!this.isInBackground && bo.j()) {
                    this.stateBeforeBackground = new HashMap();
                    if (this.lastKnownState != null && this.lastKnownState.size() > 0) {
                        for (Entry entry : this.lastKnownState.entrySet()) {
                            this.stateBeforeBackground.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                List<Geofence> toBeTrackedGeofences = getToBeTrackedGeofences();
                if (this.trackedGeofenceIds.size() > 0) {
                    C4486f.f16732c.removeGeofences(this.googleApiClient, this.trackedGeofenceIds);
                }
                this.trackedGeofenceIds = new ArrayList();
                if (toBeTrackedGeofences != null && toBeTrackedGeofences.size() > 0) {
                    C4486f.f16732c.addGeofences(this.googleApiClient, new C4481a().m20345a((List) toBeTrackedGeofences).m20346a(), getTransitionPendingIntent());
                    for (Geofence geofence : toBeTrackedGeofences) {
                        this.trackedGeofenceIds.add(geofence.getRequestId());
                        if (!(!this.isInBackground || bo.j() || this.stateBeforeBackground == null || this.backgroundGeofences.contains(geofence))) {
                            Number number = (Number) this.stateBeforeBackground.get(geofence.getRequestId());
                            Number number2 = (Number) this.lastKnownState.get(geofence.getRequestId());
                            if (!(number2 == null || number == null)) {
                                if (C3861a.a(number, number2)) {
                                    maybePerformActions(geofence, "enterRegion");
                                }
                                if (C3861a.b(number, number2)) {
                                    maybePerformActions(geofence, "exitRegion");
                                }
                            }
                        }
                    }
                }
                if (this.isInBackground && !bo.j()) {
                    this.stateBeforeBackground = null;
                }
                this.isInBackground = bo.j();
            }
        }
    }

    private List<Geofence> getToBeTrackedGeofences() {
        if (bo.j()) {
            return this.backgroundGeofences;
        }
        return this.allGeofences;
    }

    void updateStatusForGeofences(List<Geofence> list, int i) {
        for (Geofence geofence : list) {
            if (this.trackedGeofenceIds.contains(geofence.getRequestId()) || !geofence.getRequestId().startsWith("__leanplum")) {
                Number number = (Number) this.lastKnownState.get(geofence.getRequestId());
                if (number != null) {
                    if (C3861a.a(number, Integer.valueOf(getStatusForTransitionType(i)))) {
                        maybePerformActions(geofence, "enterRegion");
                    }
                    if (C3861a.b(number, Integer.valueOf(getStatusForTransitionType(i)))) {
                        maybePerformActions(geofence, "exitRegion");
                    }
                }
                this.lastKnownState.put(geofence.getRequestId(), Integer.valueOf(getStatusForTransitionType(i)));
            } else {
                List arrayList = new ArrayList();
                arrayList.add(geofence.getRequestId());
                if (this.googleApiClient != null && this.googleApiClient.j()) {
                    C4486f.f16732c.removeGeofences(this.googleApiClient, arrayList);
                }
            }
        }
        saveLastKnownRegionState();
    }

    private void maybePerformActions(Geofence geofence, String str) {
        geofence = getRegionName(geofence.getRequestId());
        if (geofence != null) {
            ag.a(str, geofence, bo.j() ? 2 : 3, null, null);
        }
    }

    private String getRegionName(String str) {
        return str.startsWith("__leanplum") ? str.substring(10, str.lastIndexOf(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR)) : null;
    }

    private PendingIntent getTransitionPendingIntent() {
        Context context = Leanplum.getContext();
        return PendingIntent.getService(context, 0, new Intent(context, ReceiveTransitionsIntentService.class), 134217728);
    }

    public void onConnected(Bundle bundle) {
        try {
            updateTrackedGeofences();
            requestLocation();
        } catch (Bundle bundle2) {
            bo.a(bundle2);
        }
    }

    public void onLocationChanged(Location location) {
        if (location.hasAccuracy()) {
            LeanplumLocationAccuracyType leanplumLocationAccuracyType = ((double) location.getAccuracy()) >= ACCURACY_THRESHOLD_GPS ? LeanplumLocationAccuracyType.CELL : LeanplumLocationAccuracyType.GPS;
            if (!this.isSendingLocation && needToSendLocation(leanplumLocationAccuracyType)) {
                try {
                    setUserAttributesForLocationUpdate(location, leanplumLocationAccuracyType);
                } catch (Location location2) {
                    bo.a(location2);
                }
            }
            C4486f.f16731b.removeLocationUpdates(this.googleApiClient, (LocationListener) this);
            return;
        }
        ao.a(new Object[]{"Received a location with no accuracy."});
    }

    private void requestLocation() {
        if (Leanplum.isLocationCollectionEnabled() && this.googleApiClient != null) {
            if (this.googleApiClient.j()) {
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.setPriority(100).setInterval(LOCATION_REQUEST_INTERVAL).setFastestInterval(LOCATION_REQUEST_INTERVAL);
                C4486f.f16731b.requestLocationUpdates(this.googleApiClient, locationRequest, (LocationListener) this);
            }
        }
    }

    private boolean needToSendLocation(LeanplumLocationAccuracyType leanplumLocationAccuracyType) {
        if (this.lastLocationSentDate != null && new Date().getTime() - this.lastLocationSentDate.getTime() <= LOCATION_UPDATE_INTERVAL) {
            if (this.lastLocationSentAccuracyType.value() >= leanplumLocationAccuracyType.value()) {
                return null;
            }
        }
        return true;
    }

    private void setUserAttributesForLocationUpdate(Location location, final LeanplumLocationAccuracyType leanplumLocationAccuracyType) {
        this.isSendingLocation = true;
        ag.a(location, leanplumLocationAccuracyType, new aj(this) {
            /* renamed from: b */
            private /* synthetic */ LocationManagerImplementation f25515b;

            /* renamed from: a */
            public final void m30537a(boolean z) {
                this.f25515b.isSendingLocation = false;
                if (z) {
                    this.f25515b.lastLocationSentAccuracyType = leanplumLocationAccuracyType;
                    this.f25515b.lastLocationSentDate = new Date();
                    ao.f(new Object[]{"setUserAttributes with location is successfully called"});
                }
            }
        });
    }
}
