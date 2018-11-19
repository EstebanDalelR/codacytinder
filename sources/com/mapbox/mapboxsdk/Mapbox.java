package com.mapbox.mapboxsdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.text.TextUtils;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.exceptions.MapboxConfigurationException;
import com.mapbox.mapboxsdk.maps.Telemetry;
import com.mapbox.mapboxsdk.net.ConnectivityReceiver;

@UiThread
public final class Mapbox {
    @SuppressLint({"StaticFieldLeak"})
    private static Mapbox INSTANCE;
    private String accessToken;
    private Boolean connected;
    private Context context;

    @UiThread
    public static synchronized Mapbox getInstance(@NonNull Context context, @NonNull String str) {
        synchronized (Mapbox.class) {
            if (INSTANCE == null) {
                context = context.getApplicationContext();
                INSTANCE = new Mapbox(context, str);
                Telemetry.initialize();
                ConnectivityReceiver.instance(context);
            }
            context = INSTANCE;
        }
        return context;
    }

    Mapbox(@NonNull Context context, @NonNull String str) {
        this.context = context;
        this.accessToken = str;
    }

    public static String getAccessToken() {
        validateMapbox();
        validateAccessToken();
        return INSTANCE.accessToken;
    }

    private static void validateMapbox() throws MapboxConfigurationException {
        if (INSTANCE == null) {
            throw new MapboxConfigurationException();
        }
    }

    private static void validateAccessToken() throws MapboxConfigurationException {
        String str = INSTANCE.accessToken;
        if (!TextUtils.isEmpty(str)) {
            if (str.toLowerCase(MapboxConstants.MAPBOX_LOCALE).startsWith("pk.") || str.toLowerCase(MapboxConstants.MAPBOX_LOCALE).startsWith("sk.")) {
                return;
            }
        }
        throw new MapboxConfigurationException();
    }

    public static Context getApplicationContext() {
        return INSTANCE.context;
    }

    public static synchronized void setConnected(Boolean bool) {
        synchronized (Mapbox.class) {
            INSTANCE.connected = bool;
        }
    }

    public static synchronized Boolean isConnected() {
        synchronized (Mapbox.class) {
            if (INSTANCE.connected != null) {
                Boolean bool = INSTANCE.connected;
                return bool;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) INSTANCE.context.getSystemService("connectivity")).getActiveNetworkInfo();
            boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            bool = Boolean.valueOf(z);
            return bool;
        }
    }
}
