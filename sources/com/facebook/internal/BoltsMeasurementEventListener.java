package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.C0436c;
import com.facebook.appevents.AppEventsLogger;

public class BoltsMeasurementEventListener extends BroadcastReceiver {
    /* renamed from: a */
    private static BoltsMeasurementEventListener f4618a;
    /* renamed from: b */
    private Context f4619b;

    private BoltsMeasurementEventListener(Context context) {
        this.f4619b = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m5707a() {
        C0436c.m1648a(this.f4619b).m1652a(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    /* renamed from: b */
    private void m5708b() {
        C0436c.m1648a(this.f4619b).m1651a((BroadcastReceiver) this);
    }

    /* renamed from: a */
    public static BoltsMeasurementEventListener m5706a(Context context) {
        if (f4618a != null) {
            return f4618a;
        }
        f4618a = new BoltsMeasurementEventListener(context);
        f4618a.m5707a();
        return f4618a;
    }

    protected void finalize() throws Throwable {
        try {
            m5708b();
        } finally {
            super.finalize();
        }
    }

    public void onReceive(Context context, Intent intent) {
        context = AppEventsLogger.newLogger(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bf_");
        stringBuilder.append(intent.getStringExtra("event_name"));
        String stringBuilder2 = stringBuilder.toString();
        intent = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : intent.keySet()) {
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) intent.get(str));
        }
        context.m5536a(stringBuilder2, bundle);
    }
}
