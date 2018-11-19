package com.mapbox.android.telemetry;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.support.annotation.RequiresApi;
import android.support.v4.content.C0436c;

@RequiresApi(api = 21)
class SchedulerFlusherJobService extends JobService {
    private static final String ON_ERROR_INTENT_EXTRA = "onError";
    private static final String ON_START_INTENT_EXTRA = "onStart";

    SchedulerFlusherJobService() {
    }

    public boolean onStartJob(JobParameters jobParameters) {
        jobParameters = new Intent("com.mapbox.scheduler_flusher");
        jobParameters.putExtra("start_job", ON_START_INTENT_EXTRA);
        C0436c.a(this).a(jobParameters);
        return null;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        jobParameters = new Intent("com.mapbox.scheduler_flusher");
        jobParameters.putExtra("stop_job", ON_ERROR_INTENT_EXTRA);
        C0436c.a(this).a(jobParameters);
        return true;
    }
}
