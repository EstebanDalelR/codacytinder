package com.mapbox.android.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

class AlarmReceiver extends BroadcastReceiver {
    private static final String ALARM_FIRED_INTENT_KEY = "alarm_fired";
    private static final String ON_ALARM_INTENT_EXTRA = "onAlarm";
    private final SchedulerCallback callback;

    AlarmReceiver(@NonNull SchedulerCallback schedulerCallback) {
        this.callback = schedulerCallback;
    }

    public void onReceive(Context context, Intent intent) {
        if (ON_ALARM_INTENT_EXTRA.equals(intent.getStringExtra(ALARM_FIRED_INTENT_KEY)) != null) {
            this.callback.onPeriodRaised();
        }
    }

    Intent supplyIntent(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.mapbox.scheduler_flusher");
        stringBuilder.append(Integer.toString(i));
        Intent intent = new Intent(stringBuilder.toString());
        intent.putExtra(ALARM_FIRED_INTENT_KEY, ON_ALARM_INTENT_EXTRA);
        return intent;
    }
}
