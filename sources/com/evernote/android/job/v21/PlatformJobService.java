package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.evernote.android.job.C1133b;
import com.evernote.android.job.C1139e;
import com.evernote.android.job.Job;
import com.evernote.android.job.JobProxy.C1127a;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.C3142c;

@TargetApi(21)
public class PlatformJobService extends JobService {
    /* renamed from: a */
    private static final C3142c f3047a = new C3142c("PlatformJobService");

    public boolean onStartJob(final JobParameters jobParameters) {
        final C1127a c1127a = new C1127a((Service) this, f3047a, jobParameters.getJobId());
        final JobRequest a = c1127a.m3713a(true, false);
        if (a == null) {
            return false;
        }
        if (a.m3754B()) {
            if (C1156b.m3950b(this, a)) {
                if (VERSION.SDK_INT >= 26) {
                    f3047a.m12120b("PendingIntent for transient bundle is not null although running on O, using compat mode, request %s", a);
                }
                return false;
            } else if (VERSION.SDK_INT < 26) {
                f3047a.m12120b("PendingIntent for transient job %s expired", a);
                return false;
            }
        }
        c1127a.m3714h(a);
        C1133b.m3802h().execute(new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ PlatformJobService f3046d;

            public void run() {
                try {
                    c1127a.m3712a(a, this.f3046d.m3945a(jobParameters));
                } finally {
                    this.f3046d.jobFinished(jobParameters, false);
                }
            }
        });
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        Job b = C1139e.m3819a().m3833b(jobParameters.getJobId());
        if (b != null) {
            b.cancel();
            f3047a.m12120b("Called onStopJob for %s", b);
        } else {
            f3047a.m12120b("Called onStopJob, job %d not found", Integer.valueOf(jobParameters.getJobId()));
        }
        return false;
    }

    @TargetApi(26)
    /* renamed from: a */
    private Bundle m3945a(JobParameters jobParameters) {
        if (VERSION.SDK_INT >= 26) {
            return jobParameters.getTransientExtras();
        }
        return Bundle.EMPTY;
    }
}
