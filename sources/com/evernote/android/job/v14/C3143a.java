package com.evernote.android.job.v14;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.evernote.android.job.C1133b;
import com.evernote.android.job.JobProxy;
import com.evernote.android.job.JobProxy.C1127a;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.C1150e;
import com.evernote.android.job.util.C3142c;

/* renamed from: com.evernote.android.job.v14.a */
public class C3143a implements JobProxy {
    /* renamed from: a */
    protected final Context f9693a;
    /* renamed from: b */
    protected final C3142c f9694b;
    /* renamed from: c */
    private AlarmManager f9695c;

    /* renamed from: b */
    protected int m12137b(boolean z) {
        return !z ? 1207959552 : 134217728;
    }

    public C3143a(Context context) {
        this(context, "JobProxy14");
    }

    protected C3143a(Context context, String str) {
        this.f9693a = context;
        this.f9694b = new C3142c(str);
    }

    public void plantOneOff(JobRequest jobRequest) {
        PendingIntent a = m12135a(jobRequest, false);
        AlarmManager a2 = m12132a();
        if (a2 != null) {
            try {
                if (!jobRequest.m3783u()) {
                    mo3217a(jobRequest, a2, a);
                } else if (jobRequest.m3767e() != 1 || jobRequest.m3787y() > 0) {
                    m12138b(jobRequest, a2, a);
                } else {
                    PlatformAlarmService.m12126a(this.f9693a, jobRequest.m3765c(), jobRequest.m3755C());
                }
            } catch (Throwable e) {
                this.f9694b.m12117a(e);
            }
        }
    }

    /* renamed from: a */
    protected void mo3217a(JobRequest jobRequest, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.set(m12130a(false), m12131a(jobRequest), pendingIntent);
        m12129b(jobRequest);
    }

    /* renamed from: b */
    protected void m12138b(JobRequest jobRequest, AlarmManager alarmManager, PendingIntent pendingIntent) {
        long a = m12131a(jobRequest);
        if (VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(m12130a(true), a, pendingIntent);
        } else if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(m12130a(true), a, pendingIntent);
        } else {
            alarmManager.set(m12130a(true), a, pendingIntent);
        }
        m12129b(jobRequest);
    }

    /* renamed from: c */
    protected void mo3218c(JobRequest jobRequest, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.set(1, C1133b.m3801g().currentTimeMillis() + C1127a.m3710f(jobRequest), pendingIntent);
        this.f9694b.m12120b("Scheduled repeating alarm (flex support), %s, interval %s, flex %s", jobRequest, C1150e.m3891a(jobRequest.m3772j()), C1150e.m3891a(jobRequest.m3773k()));
    }

    /* renamed from: a */
    protected long m12131a(JobRequest jobRequest) {
        if (C1133b.m3800f()) {
            return C1133b.m3801g().currentTimeMillis() + C1127a.m3707c(jobRequest);
        }
        return C1133b.m3801g().elapsedRealtime() + C1127a.m3707c(jobRequest);
    }

    /* renamed from: a */
    protected int m12130a(boolean z) {
        if (z) {
            return C1133b.m3800f() ? false : true;
        }
        return C1133b.m3800f() ? true : true;
    }

    /* renamed from: b */
    private void m12129b(JobRequest jobRequest) {
        this.f9694b.m12120b("Scheduled alarm, %s, delay %s (from now), exact %b, reschedule count %d", jobRequest, C1150e.m3891a(C1127a.m3707c(jobRequest)), Boolean.valueOf(jobRequest.m3783u()), Integer.valueOf(C1127a.m3711g(jobRequest)));
    }

    public void plantPeriodic(JobRequest jobRequest) {
        PendingIntent a = m12135a(jobRequest, true);
        AlarmManager a2 = m12132a();
        if (a2 != null) {
            a2.setRepeating(m12130a(true), m12131a(jobRequest), jobRequest.m3772j(), a);
        }
        this.f9694b.m12120b("Scheduled repeating alarm, %s, interval %s", jobRequest, C1150e.m3891a(jobRequest.m3772j()));
    }

    public void plantPeriodicFlexSupport(JobRequest jobRequest) {
        PendingIntent a = m12135a(jobRequest, false);
        AlarmManager a2 = m12132a();
        if (a2 != null) {
            try {
                mo3218c(jobRequest, a2, a);
            } catch (Throwable e) {
                this.f9694b.m12117a(e);
            }
        }
    }

    public void cancel(int i) {
        AlarmManager a = m12132a();
        if (a != null) {
            try {
                a.cancel(m12133a(i, false, null, m12137b(true)));
                a.cancel(m12133a(i, false, null, m12137b(false)));
            } catch (Throwable e) {
                this.f9694b.m12117a(e);
            }
        }
    }

    public boolean isPlatformJobScheduled(JobRequest jobRequest) {
        return m12134a(jobRequest, 536870912) != null ? true : null;
    }

    /* renamed from: a */
    protected PendingIntent m12135a(JobRequest jobRequest, boolean z) {
        return m12134a(jobRequest, m12137b(z));
    }

    /* renamed from: a */
    protected PendingIntent m12134a(JobRequest jobRequest, int i) {
        return m12133a(jobRequest.m3765c(), jobRequest.m3783u(), jobRequest.m3755C(), i);
    }

    /* renamed from: a */
    protected PendingIntent m12133a(int i, boolean z, @Nullable Bundle bundle, int i2) {
        try {
            return PendingIntent.getBroadcast(this.f9693a, i, PlatformAlarmReceiver.m3940a(this.f9693a, i, z, bundle), i2);
        } catch (Throwable e) {
            this.f9694b.m12117a(e);
            return 0;
        }
    }

    @Nullable
    /* renamed from: a */
    protected AlarmManager m12132a() {
        if (this.f9695c == null) {
            this.f9695c = (AlarmManager) this.f9693a.getSystemService("alarm");
        }
        if (this.f9695c == null) {
            this.f9694b.m12124d("AlarmManager is null");
        }
        return this.f9695c;
    }
}
