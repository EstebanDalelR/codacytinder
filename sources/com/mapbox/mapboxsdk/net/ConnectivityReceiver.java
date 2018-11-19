package com.mapbox.mapboxsdk.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.mapbox.mapboxsdk.Mapbox;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p001a.C0001a;

public class ConnectivityReceiver extends BroadcastReceiver {
    @SuppressLint({"StaticFieldLeak"})
    private static ConnectivityReceiver INSTANCE;
    private int activationCounter;
    private Context context;
    private List<ConnectivityListener> listeners = new CopyOnWriteArrayList();

    public static synchronized ConnectivityReceiver instance(Context context) {
        synchronized (ConnectivityReceiver.class) {
            if (INSTANCE == null) {
                INSTANCE = new ConnectivityReceiver(context.getApplicationContext());
                INSTANCE.addListener(new NativeConnectivityListener());
            }
            context = INSTANCE;
        }
        return context;
    }

    private ConnectivityReceiver(@NonNull Context context) {
        this.context = context;
    }

    @UiThread
    public void activate() {
        if (this.activationCounter == 0) {
            this.context.registerReceiver(INSTANCE, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this.activationCounter++;
    }

    @UiThread
    public void deactivate() {
        this.activationCounter--;
        if (this.activationCounter == 0) {
            this.context.unregisterReceiver(INSTANCE);
        }
    }

    public void onReceive(Context context, Intent intent) {
        C0001a.a("Connected: %s", new Object[]{Boolean.valueOf(isConnected(context))});
        for (ConnectivityListener onNetworkStateChanged : this.listeners) {
            onNetworkStateChanged.onNetworkStateChanged(context);
        }
    }

    public void addListener(@NonNull ConnectivityListener connectivityListener) {
        this.listeners.add(connectivityListener);
    }

    public void removeListener(@NonNull ConnectivityListener connectivityListener) {
        this.listeners.remove(connectivityListener);
    }

    public boolean isConnected(Context context) {
        Boolean isConnected = Mapbox.isConnected();
        if (isConnected != null) {
            return isConnected.booleanValue();
        }
        context = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        context = (context == null || context.isConnected() == null) ? null : true;
        return context;
    }
}
