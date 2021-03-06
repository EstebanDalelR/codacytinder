package com.crashlytics.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

class DevicePowerStateListener {
    private static final IntentFilter FILTER_BATTERY_CHANGED = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static final IntentFilter FILTER_POWER_CONNECTED = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
    private static final IntentFilter FILTER_POWER_DISCONNECTED = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    private final Context context;
    private boolean isPowerConnected;
    private final BroadcastReceiver powerConnectedReceiver = new C11121();
    private final BroadcastReceiver powerDisconnectedReceiver = new C11132();
    private final AtomicBoolean receiversRegistered = new AtomicBoolean(false);

    /* renamed from: com.crashlytics.android.core.DevicePowerStateListener$1 */
    class C11121 extends BroadcastReceiver {
        C11121() {
        }

        public void onReceive(Context context, Intent intent) {
            DevicePowerStateListener.this.isPowerConnected = true;
        }
    }

    /* renamed from: com.crashlytics.android.core.DevicePowerStateListener$2 */
    class C11132 extends BroadcastReceiver {
        C11132() {
        }

        public void onReceive(Context context, Intent intent) {
            DevicePowerStateListener.this.isPowerConnected = null;
        }
    }

    public DevicePowerStateListener(Context context) {
        this.context = context;
    }

    public void initialize() {
        boolean z = true;
        if (!this.receiversRegistered.getAndSet(true)) {
            Intent registerReceiver = this.context.registerReceiver(null, FILTER_BATTERY_CHANGED);
            int i = -1;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("status", -1);
            }
            if (i != 2) {
                if (i != 5) {
                    z = false;
                }
            }
            this.isPowerConnected = z;
            this.context.registerReceiver(this.powerConnectedReceiver, FILTER_POWER_CONNECTED);
            this.context.registerReceiver(this.powerDisconnectedReceiver, FILTER_POWER_DISCONNECTED);
        }
    }

    public boolean isPowerConnected() {
        return this.isPowerConnected;
    }

    public void dispose() {
        if (this.receiversRegistered.getAndSet(false)) {
            this.context.unregisterReceiver(this.powerConnectedReceiver);
            this.context.unregisterReceiver(this.powerDisconnectedReceiver);
        }
    }
}
