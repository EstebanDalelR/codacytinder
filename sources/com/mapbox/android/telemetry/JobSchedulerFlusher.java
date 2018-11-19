package com.mapbox.android.telemetry;

import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.RequiresApi;
import android.support.v4.content.C0436c;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;

class JobSchedulerFlusher implements SchedulerFlusher {
    private static final int SCHEDULER_FLUSHER_JOB_ID = 0;
    static final String START_JOB_INTENT_KEY = "start_job";
    static final String STOP_JOB_INTENT_KEY = "stop_job";
    private final SchedulerCallback callback;
    private final Context context;
    private BroadcastReceiver receiver;

    /* renamed from: com.mapbox.android.telemetry.JobSchedulerFlusher$1 */
    class C57821 extends BroadcastReceiver {
        C57821() {
        }

        public void onReceive(Context context, Intent intent) {
            context = intent.getStringExtra(JobSchedulerFlusher.START_JOB_INTENT_KEY);
            intent = intent.getStringExtra(JobSchedulerFlusher.STOP_JOB_INTENT_KEY);
            if (context != null) {
                JobSchedulerFlusher.this.callback.onPeriodRaised();
            }
            if (intent != null) {
                JobSchedulerFlusher.this.callback.onError();
            }
        }
    }

    JobSchedulerFlusher(Context context, SchedulerCallback schedulerCallback) {
        this.context = context;
        this.callback = schedulerCallback;
    }

    public void register() {
        this.receiver = new C57821();
        C0436c.a(this.context).a(this.receiver, new IntentFilter("com.mapbox.scheduler_flusher"));
    }

    @RequiresApi(api = 21)
    public void schedule(long j) {
        ((JobScheduler) this.context.getSystemService("jobscheduler")).schedule(new Builder(0, new ComponentName(this.context, SchedulerFlusherJobService.class)).setPeriodic(DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS).build());
    }

    public void unregister() {
        C0436c.a(this.context).a(this.receiver);
    }
}
