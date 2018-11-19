package com.mapbox.android.telemetry;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.mapbox.android.core.location.LocationEnginePriority;
import com.mapbox.android.core.permissions.C5765a;
import com.mapbox.android.telemetry.Event.Type;
import com.mapbox.android.telemetry.TelemetryEnabler.State;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.C15966s;
import okhttp3.Call;
import okhttp3.Callback;

public class MapboxTelemetry implements EventCallback, FullQueueCallback, ServiceTaskCallback, Callback {
    private static final String EVENTS_USER_AGENT = "MapboxEventsAndroid/";
    private static final String NAVIGATION_UI_USER_AGENT = "mapbox-navigation-ui-android/";
    private static final String NAVIGATION_USER_AGENT = "mapbox-navigation-android/";
    private static final String NON_NULL_APPLICATION_CONTEXT_REQUIRED = "Non-null application context required.";
    private static final int NO_FLAGS = 0;
    private static final String TELEMETRY_USER_AGENT = "MapboxTelemetryAndroid/";
    private static final String UNITY_USER_AGENT = "MapboxEventsUnityAndroid/";
    private static final List<String> VALID_USER_AGENTS = new C57891();
    static Context applicationContext;
    private String accessToken;
    private Clock clock = null;
    private Callback httpCallback;
    private boolean isLocationOpted = false;
    private boolean isServiceBound = false;
    private Intent locationServiceIntent = null;
    private PermissionCheckRunnable permissionCheckRunnable = null;
    private EventsQueue queue;
    private final SchedulerFlusher schedulerFlusher;
    private ServiceConnection serviceConnection = null;
    private TelemetryClient telemetryClient;
    private final TelemetryEnabler telemetryEnabler;
    private CopyOnWriteArraySet<TelemetryListener> telemetryListeners = null;
    private final TelemetryLocationEnabler telemetryLocationEnabler;
    private TelemetryService telemetryService;
    private String userAgent;

    /* renamed from: com.mapbox.android.telemetry.MapboxTelemetry$1 */
    static class C57891 extends ArrayList<String> {
        C57891() {
            add(MapboxTelemetry.EVENTS_USER_AGENT);
            add(MapboxTelemetry.TELEMETRY_USER_AGENT);
            add(MapboxTelemetry.UNITY_USER_AGENT);
            add(MapboxTelemetry.NAVIGATION_USER_AGENT);
            add(MapboxTelemetry.NAVIGATION_UI_USER_AGENT);
        }
    }

    /* renamed from: com.mapbox.android.telemetry.MapboxTelemetry$3 */
    class C57903 implements ServiceConnection {
        C57903() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MapboxTelemetry.this.telemetryService = ((TelemetryBinder) iBinder).obtainService();
            MapboxTelemetry.this.telemetryService.addServiceTask(MapboxTelemetry.this);
            if (MapboxTelemetry.this.telemetryService.obtainBoundInstances() == null) {
                MapboxTelemetry.this.telemetryService.injectEventsQueue(MapboxTelemetry.this.queue);
            }
            MapboxTelemetry.this.telemetryService.bindInstance();
            MapboxTelemetry.this.isServiceBound = true;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            MapboxTelemetry.this.telemetryService = null;
            MapboxTelemetry.this.isServiceBound = false;
        }
    }

    /* renamed from: com.mapbox.android.telemetry.MapboxTelemetry$2 */
    class C70852 implements SchedulerCallback {
        public void onError() {
        }

        C70852() {
        }

        public void onPeriodRaised() {
            MapboxTelemetry.this.flushEnqueuedEvents();
        }
    }

    public MapboxTelemetry(Context context, String str, String str2) {
        initializeContext(context);
        initializeQueue();
        checkRequiredParameters(str, str2);
        this.httpCallback = this;
        this.schedulerFlusher = new SchedulerFlusherFactory(applicationContext, obtainAlarmReceiver()).supply();
        this.serviceConnection = obtainServiceConnection();
        this.telemetryEnabler = new TelemetryEnabler(true);
        this.telemetryLocationEnabler = new TelemetryLocationEnabler(true);
        initializeTelemetryListeners();
        initializeTelemetryLocationState();
    }

    MapboxTelemetry(Context context, String str, String str2, EventsQueue eventsQueue, TelemetryClient telemetryClient, Callback callback, SchedulerFlusher schedulerFlusher, Clock clock, boolean z, TelemetryEnabler telemetryEnabler, TelemetryLocationEnabler telemetryLocationEnabler) {
        initializeContext(context);
        this.queue = eventsQueue;
        checkRequiredParameters(str, str2);
        this.telemetryClient = telemetryClient;
        this.httpCallback = callback;
        this.schedulerFlusher = schedulerFlusher;
        this.clock = clock;
        this.telemetryEnabler = telemetryEnabler;
        this.telemetryLocationEnabler = telemetryLocationEnabler;
        this.isServiceBound = z;
        initializeTelemetryListeners();
    }

    public void onFullQueue(List<Event> list) {
        if (State.ENABLED.equals(this.telemetryEnabler.obtainTelemetryState())) {
            sendEventsIfPossible(list);
        }
    }

    public void onEventReceived(Event event) {
        pushToQueue(event);
    }

    public void onTaskRemoved() {
        flushEnqueuedEvents();
        unregisterTelemetry();
    }

    public void onFailure(Call call, IOException iOException) {
        call = this.telemetryListeners.iterator();
        while (call.hasNext()) {
            ((TelemetryListener) call.next()).onHttpFailure(iOException.getMessage());
        }
    }

    public void onResponse(Call call, C15966s c15966s) {
        c15966s.h().close();
        call = this.telemetryListeners.iterator();
        while (call.hasNext()) {
            ((TelemetryListener) call.next()).onHttpResponse(c15966s.d(), c15966s.c());
        }
    }

    public boolean push(Event event) {
        if (sendEventIfWhitelisted(event)) {
            return true;
        }
        return pushToQueue(event);
    }

    public boolean enable() {
        if (!TelemetryEnabler.isEventsEnabled(applicationContext)) {
            return false;
        }
        startTelemetry();
        return true;
    }

    public boolean disable() {
        if (!TelemetryEnabler.isEventsEnabled(applicationContext)) {
            return false;
        }
        stopTelemetry();
        return true;
    }

    public boolean updateSessionIdRotationInterval(SessionInterval sessionInterval) {
        if (!this.isServiceBound) {
            return null;
        }
        this.telemetryService.updateSessionIdentifier(new SessionIdentifier(sessionInterval.obtainInterval()));
        return true;
    }

    public void updateDebugLoggingEnabled(boolean z) {
        if (this.telemetryClient != null) {
            this.telemetryClient.updateDebugLoggingEnabled(z);
        }
    }

    public void updateUserAgent(String str) {
        if (isUserAgentValid(str)) {
            this.telemetryClient.updateUserAgent(TelemetryUtils.createFullUserAgent(str, applicationContext));
        }
    }

    public void updateLocationPriority(LocationEnginePriority locationEnginePriority) {
        if (this.isServiceBound) {
            this.telemetryService.updateLocationPriority(locationEnginePriority);
        }
    }

    public boolean updateAccessToken(String str) {
        if (!isAccessTokenValid(str) || !updateTelemetryClient(str)) {
            return null;
        }
        this.accessToken = str;
        return true;
    }

    public boolean addTelemetryListener(TelemetryListener telemetryListener) {
        return this.telemetryListeners.add(telemetryListener);
    }

    public boolean removeTelemetryListener(TelemetryListener telemetryListener) {
        return this.telemetryListeners.remove(telemetryListener);
    }

    boolean optLocationIn() {
        startTelemetryService();
        bindTelemetryService();
        return this.isLocationOpted;
    }

    boolean optLocationOut() {
        LocationState obtainTelemetryLocationState = this.telemetryLocationEnabler.obtainTelemetryLocationState();
        if (this.isServiceBound) {
            this.telemetryService.unbindInstance();
            this.telemetryService.removeServiceTask(this);
            if (this.telemetryService.obtainBoundInstances() == 0 && LocationState.ENABLED.equals(obtainTelemetryLocationState)) {
                unbindServiceConnection();
                this.isServiceBound = false;
                stopLocation();
                this.isLocationOpted = false;
            } else {
                unbindServiceConnection();
                this.isServiceBound = false;
            }
        }
        return this.isLocationOpted;
    }

    private void startTelemetryService() {
        if (LocationState.DISABLED.equals(this.telemetryLocationEnabler.obtainTelemetryLocationState()) && checkLocationPermission()) {
            startLocation();
            this.isLocationOpted = true;
        }
    }

    private void bindTelemetryService() {
        applicationContext.bindService(obtainLocationServiceIntent(), this.serviceConnection, 0);
    }

    boolean checkRequiredParameters(String str, String str2) {
        str = areRequiredParametersValid(str, str2);
        if (str != null) {
            initializeTelemetryClient();
            this.queue.setTelemetryInitialized(true);
        }
        return str;
    }

    Intent obtainLocationServiceIntent() {
        if (this.locationServiceIntent == null) {
            this.locationServiceIntent = new Intent(applicationContext, TelemetryService.class);
        }
        return this.locationServiceIntent;
    }

    void injectTelemetryService(TelemetryService telemetryService) {
        this.telemetryService = telemetryService;
    }

    private void initializeContext(Context context) {
        if (applicationContext != null) {
            return;
        }
        if (context == null || context.getApplicationContext() == null) {
            throw new IllegalArgumentException(NON_NULL_APPLICATION_CONTEXT_REQUIRED);
        }
        applicationContext = context.getApplicationContext();
    }

    private void initializeQueue() {
        this.queue = new EventsQueue(new FullQueueFlusher(this));
    }

    private boolean areRequiredParametersValid(String str, String str2) {
        return (isAccessTokenValid(str) == null || isUserAgentValid(str2) == null) ? null : true;
    }

    private boolean isAccessTokenValid(String str) {
        if (TelemetryUtils.isEmpty(str)) {
            return null;
        }
        this.accessToken = str;
        return true;
    }

    private boolean isUserAgentValid(String str) {
        if (!TelemetryUtils.isEmpty(str)) {
            for (String startsWith : VALID_USER_AGENTS) {
                if (str.startsWith(startsWith)) {
                    this.userAgent = str;
                    return true;
                }
            }
        }
        return null;
    }

    private void initializeTelemetryClient() {
        if (this.telemetryClient == null) {
            this.telemetryClient = createTelemetryClient(this.accessToken, this.userAgent);
        }
    }

    private TelemetryClient createTelemetryClient(String str, String str2) {
        this.telemetryClient = new TelemetryClientFactory(str, TelemetryUtils.createFullUserAgent(str2, applicationContext), new Logger()).obtainTelemetryClient(applicationContext);
        return this.telemetryClient;
    }

    private boolean updateTelemetryClient(String str) {
        if (this.telemetryClient == null) {
            return null;
        }
        this.telemetryClient.updateAccessToken(str);
        return true;
    }

    private AlarmReceiver obtainAlarmReceiver() {
        return new AlarmReceiver(new C70852());
    }

    private void flushEnqueuedEvents() {
        List flush = this.queue.flush();
        if ((flush.size() > 0 ? 1 : null) != null) {
            sendEventsIfPossible(flush);
        }
    }

    private void sendEventsIfPossible(List<Event> list) {
        if (isNetworkConnected()) {
            sendEvents(list);
        }
    }

    private boolean isNetworkConnected() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = applicationContext;	 Catch:{ Exception -> 0x0013 }
        r1 = "connectivity";	 Catch:{ Exception -> 0x0013 }
        r0 = r0.getSystemService(r1);	 Catch:{ Exception -> 0x0013 }
        r0 = (android.net.ConnectivityManager) r0;	 Catch:{ Exception -> 0x0013 }
        r0 = r0.getActiveNetworkInfo();	 Catch:{ Exception -> 0x0013 }
        r0 = r0.isConnected();	 Catch:{ Exception -> 0x0013 }
        return r0;
    L_0x0013:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.android.telemetry.MapboxTelemetry.isNetworkConnected():boolean");
    }

    private void sendEvents(List<Event> list) {
        if (checkRequiredParameters(this.accessToken, this.userAgent)) {
            this.telemetryClient.sendEvents(list, this.httpCallback);
        }
    }

    private ServiceConnection obtainServiceConnection() {
        return new C57903();
    }

    private void initializeTelemetryListeners() {
        this.telemetryListeners = new CopyOnWriteArraySet();
    }

    private void initializeTelemetryLocationState() {
        if (!isMyServiceRunning(TelemetryService.class)) {
            this.telemetryLocationEnabler.updateTelemetryLocationState(LocationState.DISABLED);
        }
    }

    private boolean isMyServiceRunning(Class<?> cls) {
        for (RunningServiceInfo runningServiceInfo : ((ActivityManager) applicationContext.getSystemService("activity")).getRunningServices(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return null;
    }

    private boolean pushToQueue(Event event) {
        return State.ENABLED.equals(this.telemetryEnabler.obtainTelemetryState()) ? this.queue.push(event) : null;
    }

    private void unregisterTelemetry() {
        stopAlarm();
        if (isMyServiceRunning(TelemetryService.class)) {
            unbindTelemetryService();
            stopTelemetryService();
        }
    }

    private void stopAlarm() {
        this.schedulerFlusher.unregister();
    }

    private void unbindTelemetryService() {
        if (this.isServiceBound) {
            this.telemetryService.unbindInstance();
            unbindServiceConnection();
        }
    }

    private void stopTelemetryService() {
        LocationState obtainTelemetryLocationState = this.telemetryLocationEnabler.obtainTelemetryLocationState();
        if (this.telemetryService.obtainBoundInstances() == 0 && LocationState.ENABLED.equals(obtainTelemetryLocationState)) {
            stopLocation();
        }
    }

    private boolean sendEventIfWhitelisted(Event event) {
        if (!Type.TURNSTILE.equals(event.obtainType())) {
            return null;
        }
        List arrayList = new ArrayList(1);
        arrayList.add(event);
        sendEventsIfPossible(arrayList);
        return true;
    }

    private boolean startTelemetry() {
        if (!State.ENABLED.equals(this.telemetryEnabler.obtainTelemetryState())) {
            return false;
        }
        startAlarm();
        optLocationIn();
        return true;
    }

    private boolean checkLocationPermission() {
        if (C5765a.m25342a(applicationContext)) {
            return true;
        }
        permissionBackoff();
        return false;
    }

    private void permissionBackoff() {
        obtainPermissionCheckRunnable().run();
    }

    private PermissionCheckRunnable obtainPermissionCheckRunnable() {
        if (this.permissionCheckRunnable == null) {
            this.permissionCheckRunnable = new PermissionCheckRunnable(applicationContext, this);
        }
        return this.permissionCheckRunnable;
    }

    private void startLocation() {
        applicationContext.startService(obtainLocationServiceIntent());
    }

    private void startAlarm() {
        this.schedulerFlusher.register();
        this.schedulerFlusher.schedule(obtainClock().giveMeTheElapsedRealtime());
    }

    private Clock obtainClock() {
        if (this.clock == null) {
            this.clock = new Clock();
        }
        return this.clock;
    }

    private boolean stopTelemetry() {
        if (!State.ENABLED.equals(this.telemetryEnabler.obtainTelemetryState())) {
            return false;
        }
        flushEnqueuedEvents();
        stopAlarm();
        optLocationOut();
        return true;
    }

    private void stopLocation() {
        applicationContext.stopService(obtainLocationServiceIntent());
    }

    private boolean unbindServiceConnection() {
        if (!TelemetryUtils.isServiceRunning(TelemetryService.class)) {
            return false;
        }
        applicationContext.unbindService(this.serviceConnection);
        return true;
    }
}
