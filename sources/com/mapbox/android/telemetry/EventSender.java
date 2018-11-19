package com.mapbox.android.telemetry;

import android.content.Context;
import android.support.v4.content.C0436c;

class EventSender {
    private final Context context;

    EventSender(Context context) {
        this.context = context;
    }

    boolean send(Event event) {
        return C0436c.a(this.context).a(EventReceiver.supplyIntent(event));
    }
}
