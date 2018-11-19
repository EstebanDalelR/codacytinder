package com.evernote.android.job.p099a;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.evernote.android.job.JobProxy.C1127a;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.C1150e;
import com.evernote.android.job.v14.C3143a;

@TargetApi(19)
/* renamed from: com.evernote.android.job.a.a */
public class C4118a extends C3143a {
    public C4118a(Context context) {
        super(context, "JobProxy19");
    }

    /* renamed from: a */
    protected void mo3217a(JobRequest jobRequest, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.setWindow(1, System.currentTimeMillis() + C1127a.m3699a(jobRequest), C1127a.m3706b(jobRequest) - C1127a.m3699a(jobRequest), pendingIntent);
        this.b.m12120b("Schedule alarm, %s, start %s, end %s", jobRequest, C1150e.m3891a(C1127a.m3699a(jobRequest)), C1150e.m3891a(C1127a.m3706b(jobRequest)));
    }

    /* renamed from: c */
    protected void mo3218c(JobRequest jobRequest, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.setWindow(1, System.currentTimeMillis() + C1127a.m3708d(jobRequest), C1127a.m3709e(jobRequest) - C1127a.m3708d(jobRequest), pendingIntent);
        this.b.m12120b("Scheduled repeating alarm (flex support), %s, start %s, end %s, flex %s", jobRequest, C1150e.m3891a(C1127a.m3708d(jobRequest)), C1150e.m3891a(C1127a.m3709e(jobRequest)), C1150e.m3891a(jobRequest.m3773k()));
    }
}
