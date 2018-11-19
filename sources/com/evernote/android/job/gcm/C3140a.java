package com.evernote.android.job.gcm;

import android.content.Context;
import android.support.annotation.NonNull;
import com.evernote.android.job.JobProxy;
import com.evernote.android.job.JobProxy.C1127a;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.JobRequest.NetworkType;
import com.evernote.android.job.util.C1150e;
import com.evernote.android.job.util.C3142c;
import com.google.android.gms.gcm.C2544a;
import com.google.android.gms.gcm.OneoffTask.C3844a;
import com.google.android.gms.gcm.PeriodicTask.C3845a;
import com.google.android.gms.gcm.Task.C2543a;

/* renamed from: com.evernote.android.job.gcm.a */
public class C3140a implements JobProxy {
    /* renamed from: a */
    private static final C3142c f9685a = new C3142c("JobProxyGcm");
    /* renamed from: b */
    private final Context f9686b;
    /* renamed from: c */
    private final C2544a f9687c;

    public boolean isPlatformJobScheduled(JobRequest jobRequest) {
        return true;
    }

    public C3140a(Context context) {
        this.f9686b = context;
        this.f9687c = C2544a.m9265a(context);
    }

    public void plantOneOff(JobRequest jobRequest) {
        long a = C1127a.m3699a(jobRequest) / 1000;
        this.f9687c.m9270a(((C3844a) m12111a(new C3844a(), jobRequest)).m14471a(a, Math.max(C1127a.m3706b(jobRequest) / 1000, a + 1)).m14478b());
        f9685a.m12120b("Scheduled OneoffTask, %s, start %s, end %s (from now), reschedule count %d", jobRequest, C1150e.m3891a(r0), C1150e.m3891a(r6), Integer.valueOf(C1127a.m3711g(jobRequest)));
    }

    public void plantPeriodic(JobRequest jobRequest) {
        this.f9687c.m9270a(((C3845a) m12111a(new C3845a(), jobRequest)).m14490a(jobRequest.m3772j() / 1000).m14496b(jobRequest.m3773k() / 1000).m14498b());
        f9685a.m12120b("Scheduled PeriodicTask, %s, interval %s, flex %s", jobRequest, C1150e.m3891a(jobRequest.m3772j()), C1150e.m3891a(jobRequest.m3773k()));
    }

    public void plantPeriodicFlexSupport(JobRequest jobRequest) {
        f9685a.m12122c("plantPeriodicFlexSupport called although flex is supported");
        this.f9687c.m9270a(((C3844a) m12111a(new C3844a(), jobRequest)).m14471a(C1127a.m3708d(jobRequest) / 1000, C1127a.m3709e(jobRequest) / 1000).m14478b());
        f9685a.m12120b("Scheduled periodic (flex support), %s, start %s, end %s, flex %s", jobRequest, C1150e.m3891a(r0), C1150e.m3891a(r2), C1150e.m3891a(jobRequest.m3773k()));
    }

    public void cancel(int i) {
        this.f9687c.m9271a(m12112a(i), PlatformGcmService.class);
    }

    /* renamed from: a */
    protected <T extends C2543a> T m12111a(T t, JobRequest jobRequest) {
        t.mo2603b(m12113a(jobRequest)).mo2602b(PlatformGcmService.class).mo2605e(true).mo2600b(m12110a(jobRequest.m3779q())).mo2604d(C1150e.m3892a(this.f9686b)).mo2606f(jobRequest.m3775m()).mo2601b(jobRequest.m3755C());
        return t;
    }

    /* renamed from: a */
    protected String m12113a(JobRequest jobRequest) {
        return m12112a(jobRequest.m3765c());
    }

    /* renamed from: a */
    protected String m12112a(int i) {
        return String.valueOf(i);
    }

    /* renamed from: a */
    protected int m12110a(@NonNull NetworkType networkType) {
        switch (networkType) {
            case ANY:
                return 2;
            case CONNECTED:
                return null;
            case UNMETERED:
                return 1;
            case NOT_ROAMING:
                return 1;
            default:
                throw new IllegalStateException("not implemented");
        }
    }
}
