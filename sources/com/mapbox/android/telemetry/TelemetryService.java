package com.mapbox.android.telemetry;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import com.mapbox.android.core.location.C5761f;
import com.mapbox.android.core.location.LocationEngine;
import com.mapbox.android.core.location.LocationEngineListener;
import com.mapbox.android.core.location.LocationEnginePriority;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class TelemetryService extends Service implements LocationEngineListener, EventCallback, TelemetryCallback {
    public static final String IS_LOCATION_ENABLER_FROM_PREFERENCES = "isLocationEnablerFromPreferences";
    private int boundInstances = 0;
    private boolean isLocationEnablerFromPreferences = true;
    private boolean isLocationReceiverRegistered = false;
    private boolean isTelemetryReceiverRegistered = false;
    private LocationEngine locationEngine = null;
    private LocationEnginePriority locationPriority = LocationEnginePriority.NO_POWER;
    private LocationReceiver locationReceiver = null;
    private EventsQueue queue = null;
    private CopyOnWriteArraySet<ServiceTaskCallback> serviceTaskCallbacks = null;
    private TelemetryLocationEnabler telemetryLocationEnabler;
    private TelemetryReceiver telemetryReceiver = null;

    class TelemetryBinder extends Binder {
        TelemetryBinder() {
        }

        TelemetryService obtainService() {
            return TelemetryService.this;
        }
    }

    public void onCreate() {
        super.onCreate();
        createLocationReceiver();
        createTelemetryReceiver();
        createServiceTaskCallbacks();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        checkApplicationContext();
        enableTelemetryLocationState(intent);
        return 3;
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return new TelemetryBinder();
    }

    public void onDestroy() {
        unregisterLocationReceiver();
        unregisterTelemetryReceiver();
        disableTelemetryLocationState();
        super.onDestroy();
    }

    public void onTaskRemoved(Intent intent) {
        Iterator it = this.serviceTaskCallbacks.iterator();
        while (it.hasNext()) {
            ((ServiceTaskCallback) it.next()).onTaskRemoved();
        }
        super.onTaskRemoved(intent);
    }

    public void onBackground() {
        System.out.println("TelemetryService#onBackground: Shutting down location receiver...");
        unregisterLocationReceiver();
    }

    public void onForeground() {
        System.out.println("TelemetryService#onForeground: Restarting location receiver...");
        registerLocationReceiver();
    }

    public void onConnected() {
        this.locationEngine.mo6225c();
    }

    public void onLocationChanged(Location location) {
        checkApplicationContext();
        C0436c.a(this).a(LocationReceiver.supplyIntent(location));
    }

    public void onEventReceived(Event event) {
        if (this.queue != null) {
            this.queue.push(event);
        }
    }

    public void updateSessionIdentifier(SessionIdentifier sessionIdentifier) {
        this.locationReceiver.updateSessionIdentifier(sessionIdentifier);
    }

    public void updateLocationPriority(LocationEnginePriority locationEnginePriority) {
        this.locationPriority = locationEnginePriority;
        if (this.locationEngine != null) {
            disconnectLocationEngine();
            setupLocationEngine();
            activateLocationEngine();
        }
    }

    void bindInstance() {
        this.boundInstances++;
    }

    void unbindInstance() {
        this.boundInstances--;
    }

    int obtainBoundInstances() {
        return this.boundInstances;
    }

    boolean addServiceTask(ServiceTaskCallback serviceTaskCallback) {
        return this.serviceTaskCallbacks.add(serviceTaskCallback);
    }

    boolean removeServiceTask(ServiceTaskCallback serviceTaskCallback) {
        return this.serviceTaskCallbacks.remove(serviceTaskCallback);
    }

    void injectEventsQueue(EventsQueue eventsQueue) {
        this.queue = eventsQueue;
    }

    boolean isLocationReceiverRegistered() {
        return this.isLocationReceiverRegistered;
    }

    boolean isTelemetryReceiverRegistered() {
        return this.isTelemetryReceiverRegistered;
    }

    private void createLocationReceiver() {
        this.locationReceiver = new LocationReceiver(this);
        registerLocationReceiver();
    }

    private void registerLocationReceiver() {
        connectLocationEngine();
        C0436c.a(getApplicationContext()).a(this.locationReceiver, new IntentFilter("com.mapbox.location_receiver"));
        this.isLocationReceiverRegistered = true;
    }

    private void connectLocationEngine() {
        obtainLocationEngine();
        setupLocationEngine();
        activateLocationEngine();
    }

    private void obtainLocationEngine() {
        this.locationEngine = new C5761f(this).m25337a();
    }

    private void setupLocationEngine() {
        this.locationEngine.mo6223a(this.locationPriority);
        this.locationEngine.m25327a((LocationEngineListener) this);
    }

    private void activateLocationEngine() {
        this.locationEngine.mo6222a();
    }

    private void createTelemetryReceiver() {
        this.telemetryReceiver = new TelemetryReceiver(this);
        registerTelemetryReceiver();
    }

    private void registerTelemetryReceiver() {
        C0436c.a(getApplicationContext()).a(this.telemetryReceiver, new IntentFilter("com.mapbox.telemetry_receiver"));
        this.isTelemetryReceiverRegistered = true;
    }

    private void createServiceTaskCallbacks() {
        this.serviceTaskCallbacks = new CopyOnWriteArraySet();
    }

    private void enableTelemetryLocationState(Intent intent) {
        this.isLocationEnablerFromPreferences = intent.getBooleanExtra(IS_LOCATION_ENABLER_FROM_PREFERENCES, true);
        if (this.isLocationEnablerFromPreferences != null) {
            this.telemetryLocationEnabler = new TelemetryLocationEnabler(true);
            this.telemetryLocationEnabler.updateTelemetryLocationState(LocationState.ENABLED);
        }
    }

    private void unregisterLocationReceiver() {
        disconnectLocationEngine();
        C0436c.a(getApplicationContext()).a(this.locationReceiver);
        this.isLocationReceiverRegistered = false;
    }

    private void disconnectLocationEngine() {
        removeLocationUpdates();
        deactivateLocationEngine();
    }

    private void removeLocationUpdates() {
        this.locationEngine.mo6226d();
        this.locationEngine.m25330b(this);
    }

    private void deactivateLocationEngine() {
        this.locationEngine.mo6224b();
    }

    private void unregisterTelemetryReceiver() {
        C0436c.a(getApplicationContext()).a(this.telemetryReceiver);
        this.isTelemetryReceiverRegistered = false;
    }

    private void disableTelemetryLocationState() {
        if (this.isLocationEnablerFromPreferences) {
            this.telemetryLocationEnabler.updateTelemetryLocationState(LocationState.DISABLED);
        }
    }

    private void checkApplicationContext() {
        if (MapboxTelemetry.applicationContext == null) {
            MapboxTelemetry.applicationContext = getApplicationContext();
        }
    }
}
