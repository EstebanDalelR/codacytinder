package com.mapbox.android.telemetry;

import android.app.AlarmManager;
import android.content.Context;

class SchedulerFlusherFactory {
    static final long FLUSHING_PERIOD_IN_MILLIS = 180000;
    static final String SCHEDULER_FLUSHER_INTENT = "com.mapbox.scheduler_flusher";
    private final AlarmReceiver alarmReceiver;
    private final Context context;

    SchedulerFlusherFactory(Context context, AlarmReceiver alarmReceiver) {
        this.context = context;
        this.alarmReceiver = alarmReceiver;
    }

    SchedulerFlusher supply() {
        return new AlarmSchedulerFlusher(this.context, (AlarmManager) this.context.getSystemService("alarm"), this.alarmReceiver, (int) System.currentTimeMillis());
    }
}
