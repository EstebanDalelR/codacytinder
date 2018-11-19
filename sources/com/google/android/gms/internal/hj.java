package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@zzzv
public final class hj {
    /* renamed from: a */
    private final BroadcastReceiver f16141a = new hk(this);
    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f16142b = new WeakHashMap();
    /* renamed from: c */
    private boolean f16143c = false;
    /* renamed from: d */
    private boolean f16144d;
    /* renamed from: e */
    private Context f16145e;

    /* renamed from: a */
    private final synchronized void m19847a(Context context, Intent intent) {
        for (Entry entry : this.f16142b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                ((BroadcastReceiver) entry.getKey()).onReceive(context, intent);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m19849a(Context context) {
        if (!this.f16143c) {
            this.f16145e = context.getApplicationContext();
            if (this.f16145e == null) {
                this.f16145e = context;
            }
            alo.m19337a(this.f16145e);
            this.f16144d = ((Boolean) aja.m19221f().m19334a(alo.bT)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f16145e.registerReceiver(this.f16141a, intentFilter);
            this.f16143c = true;
        }
    }

    /* renamed from: a */
    public final synchronized void m19850a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f16144d) {
            this.f16142b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: a */
    public final synchronized void m19851a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f16144d) {
            this.f16142b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
