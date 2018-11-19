package com.mapbox.android.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

class EventReceiver extends BroadcastReceiver {
    private static final String EVENT_INTENT_KEY = "event";
    private static final String EVENT_RECEIVED_INTENT_KEY = "event_received";
    static final String EVENT_RECEIVER_INTENT = "com.mapbox.event_receiver";
    private static final String ON_EVENT_INTENT_EXTRA = "onEvent";
    private EventCallback callback = null;

    EventReceiver(@NonNull EventCallback eventCallback) {
        this.callback = eventCallback;
    }

    public void onReceive(Context context, Intent intent) {
        if (ON_EVENT_INTENT_EXTRA.equals(intent.getStringExtra(EVENT_RECEIVED_INTENT_KEY)) != null) {
            this.callback.onEventReceived((Event) intent.getExtras().getParcelable(EVENT_INTENT_KEY));
        }
    }

    static Intent supplyIntent(Event event) {
        Intent intent = new Intent(EVENT_RECEIVER_INTENT);
        intent.putExtra(EVENT_RECEIVED_INTENT_KEY, ON_EVENT_INTENT_EXTRA);
        intent.putExtra(EVENT_INTENT_KEY, event);
        return intent;
    }
}
