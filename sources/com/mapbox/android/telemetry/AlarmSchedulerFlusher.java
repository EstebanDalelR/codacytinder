package com.mapbox.android.telemetry;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;

class AlarmSchedulerFlusher implements SchedulerFlusher {
    private final Context context;
    private final AlarmManager manager;
    private PendingIntent pendingIntent;
    private final AlarmReceiver receiver;
    private final int requestCode;

    AlarmSchedulerFlusher(Context context, AlarmManager alarmManager, AlarmReceiver alarmReceiver, int i) {
        this.context = context;
        this.manager = alarmManager;
        this.receiver = alarmReceiver;
        this.requestCode = i;
    }

    public void register() {
        this.pendingIntent = PendingIntent.getBroadcast(this.context, this.requestCode, this.receiver.supplyIntent(this.requestCode), 268435456);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.mapbox.scheduler_flusher");
        stringBuilder.append(Integer.toString(this.requestCode));
        this.context.registerReceiver(this.receiver, new IntentFilter(stringBuilder.toString()));
    }

    public void schedule(long j) {
        this.manager.setInexactRepeating(3, j + DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS, DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS, this.pendingIntent);
    }

    public void unregister() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.manager;
        r1 = r2.pendingIntent;
        r0.cancel(r1);
        r0 = r2.context;	 Catch:{ IllegalArgumentException -> 0x000e }
        r1 = r2.receiver;	 Catch:{ IllegalArgumentException -> 0x000e }
        r0.unregisterReceiver(r1);	 Catch:{ IllegalArgumentException -> 0x000e }
    L_0x000e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.android.telemetry.AlarmSchedulerFlusher.unregister():void");
    }

    PendingIntent obtainPendingIntent() {
        return this.pendingIntent;
    }
}
