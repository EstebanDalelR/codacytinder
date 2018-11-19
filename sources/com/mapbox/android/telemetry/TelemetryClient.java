package com.mapbox.android.telemetry;

import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.C15958m;
import okhttp3.C15963q.C15962a;
import okhttp3.C15964r;
import okhttp3.Callback;
import okhttp3.HttpUrl;

class TelemetryClient {
    private static final String ACCESS_TOKEN_QUERY_PARAMETER = "access_token";
    private static final String EVENTS_ENDPOINT = "/events/v2";
    private static final String EXTRA_DEBUGGING_LOG = "Sending POST to %s with %d event(s) (user agent: %s) with payload: %s";
    private static final C15958m JSON = C15958m.a("application/json; charset=utf-8");
    private static final String LOG_TAG = "TelemetryClient";
    private static final String USER_AGENT_REQUEST_HEADER = "User-Agent";
    private String accessToken = null;
    private final Logger logger;
    private TelemetryClientSettings setting;
    private String userAgent = null;

    TelemetryClient(String str, String str2, TelemetryClientSettings telemetryClientSettings, Logger logger) {
        this.accessToken = str;
        this.userAgent = str2;
        this.setting = telemetryClientSettings;
        this.logger = logger;
    }

    void updateAccessToken(String str) {
        this.accessToken = str;
    }

    void updateUserAgent(String str) {
        this.userAgent = str;
    }

    void sendEvents(List<Event> list, Callback callback) {
        List arrayList = new ArrayList();
        arrayList.addAll(list);
        sendBatch(arrayList, callback);
    }

    void updateDebugLoggingEnabled(boolean z) {
        this.setting = this.setting.toBuilder().debugLoggingEnabled(z).build();
    }

    String obtainAccessToken() {
        return this.accessToken;
    }

    TelemetryClientSettings obtainSetting() {
        return this.setting;
    }

    private void sendBatch(List<Event> list, Callback callback) {
        C15964r create = C15964r.create(JSON, configureGsonBuilder().create().toJson((Object) list));
        HttpUrl c = this.setting.getBaseUrl().e(EVENTS_ENDPOINT).a("access_token", this.accessToken).c();
        if (isExtraDebuggingNeeded()) {
            this.logger.debug(LOG_TAG, String.format(Locale.US, EXTRA_DEBUGGING_LOG, new Object[]{c, Integer.valueOf(list.size()), this.userAgent, r0}));
        }
        this.setting.getClient().newCall(new C15962a().a(c).a("User-Agent", this.userAgent).a(create).d()).enqueue(callback);
    }

    private boolean isExtraDebuggingNeeded() {
        if (!this.setting.isDebugLoggingEnabled()) {
            if (!this.setting.getEnvironment().equals(Environment.STAGING)) {
                return false;
            }
        }
        return true;
    }

    private GsonBuilder configureGsonBuilder() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(NavigationArriveEvent.class, new ArriveEventSerializer());
        gsonBuilder.registerTypeAdapter(NavigationDepartEvent.class, new DepartEventSerializer());
        gsonBuilder.registerTypeAdapter(NavigationCancelEvent.class, new CancelEventSerializer());
        gsonBuilder.registerTypeAdapter(NavigationFeedbackEvent.class, new FeedbackEventSerializer());
        gsonBuilder.registerTypeAdapter(NavigationRerouteEvent.class, new RerouteEventSerializer());
        gsonBuilder.registerTypeAdapter(NavigationFasterRouteEvent.class, new FasterRouteEventSerializer());
        return gsonBuilder;
    }
}
