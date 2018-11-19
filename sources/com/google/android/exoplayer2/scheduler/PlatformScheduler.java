package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.util.C2314v;

@TargetApi(21)
public final class PlatformScheduler implements Scheduler {
    /* renamed from: a */
    private final int f11338a;
    /* renamed from: b */
    private final ComponentName f11339b;
    /* renamed from: c */
    private final JobScheduler f11340c;

    public static final class PlatformSchedulerService extends JobService {
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }

        public boolean onStartJob(JobParameters jobParameters) {
            PlatformScheduler.m13860b("PlatformSchedulerService started");
            PersistableBundle extras = jobParameters.getExtras();
            if (new Requirements(extras.getInt("requirements")).m7815a((Context) this)) {
                PlatformScheduler.m13860b("Requirements are met");
                jobParameters = extras.getString("service_action");
                String string = extras.getString("service_package");
                Intent intent = new Intent(jobParameters).setPackage(string);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Starting service action: ");
                stringBuilder.append(jobParameters);
                stringBuilder.append(" package: ");
                stringBuilder.append(string);
                PlatformScheduler.m13860b(stringBuilder.toString());
                C2314v.m8464a((Context) this, intent);
            } else {
                PlatformScheduler.m13860b("Requirements are not met");
                jobFinished(jobParameters, true);
            }
            return null;
        }
    }

    /* renamed from: b */
    private static void m13860b(String str) {
    }

    public boolean schedule(Requirements requirements, String str, String str2) {
        requirements = this.f11340c.schedule(m13858a(this.f11338a, this.f11339b, requirements, str2, str));
        str = new StringBuilder();
        str.append("Scheduling job: ");
        str.append(this.f11338a);
        str.append(" result: ");
        str.append(requirements);
        m13860b(str.toString());
        return requirements == 1 ? true : null;
    }

    public boolean cancel() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Canceling job: ");
        stringBuilder.append(this.f11338a);
        m13860b(stringBuilder.toString());
        this.f11340c.cancel(this.f11338a);
        return true;
    }

    /* renamed from: a */
    private static JobInfo m13858a(int i, ComponentName componentName, Requirements requirements, String str, String str2) {
        Builder builder = new Builder(i, componentName);
        switch (requirements.m7814a()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                if (C2314v.f6956a >= 24) {
                    i = 3;
                    break;
                }
                throw new UnsupportedOperationException();
            case 4:
                if (C2314v.f6956a >= 26) {
                    i = 4;
                    break;
                }
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
        builder.setRequiredNetworkType(i);
        builder.setRequiresDeviceIdle(requirements.m7817c());
        builder.setRequiresCharging(requirements.m7816b());
        builder.setPersisted(true);
        i = new PersistableBundle();
        i.putString("service_action", str);
        i.putString("service_package", str2);
        i.putInt("requirements", requirements.m7818d());
        builder.setExtras(i);
        return builder.build();
    }
}
