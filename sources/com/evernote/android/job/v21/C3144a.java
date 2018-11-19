package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.evernote.android.job.JobProxy;
import com.evernote.android.job.JobProxy.C1127a;
import com.evernote.android.job.JobProxyIllegalStateException;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.JobRequest.NetworkType;
import com.evernote.android.job.util.C1150e;
import com.evernote.android.job.util.C3142c;
import java.util.List;

@TargetApi(21)
/* renamed from: com.evernote.android.job.v21.a */
public class C3144a implements JobProxy {
    /* renamed from: a */
    protected final Context f9696a;
    /* renamed from: b */
    protected final C3142c f9697b;

    /* renamed from: a */
    protected static String m12140a(int i) {
        return i == 1 ? "success" : "failure";
    }

    public C3144a(Context context) {
        this(context, "JobProxy21");
    }

    protected C3144a(Context context, String str) {
        this.f9696a = context;
        this.f9697b = new C3142c(str);
    }

    public void plantOneOff(JobRequest jobRequest) {
        long a = C1127a.m3699a(jobRequest);
        long a2 = C1127a.m3700a(jobRequest, true);
        int a3 = m12141a(m12143a(mo3692a(jobRequest, true), a, a2).build());
        if (a3 == -123) {
            a3 = m12141a(m12143a(mo3692a(jobRequest, false), a, a2).build());
        }
        this.f9697b.m12120b("Schedule one-off jobInfo %s, %s, start %s, end %s (from now), reschedule count %d", C3144a.m12140a(a3), jobRequest, C1150e.m3891a(a), C1150e.m3891a(a2), Integer.valueOf(C1127a.m3711g(jobRequest)));
    }

    public void plantPeriodic(JobRequest jobRequest) {
        long j = jobRequest.m3772j();
        long k = jobRequest.m3773k();
        int a = m12141a(mo3220b(mo3692a(jobRequest, true), j, k).build());
        if (a == -123) {
            a = m12141a(mo3220b(mo3692a(jobRequest, false), j, k).build());
        }
        this.f9697b.m12120b("Schedule periodic jobInfo %s, %s, interval %s, flex %s", C3144a.m12140a(a), jobRequest, C1150e.m3891a(j), C1150e.m3891a(k));
    }

    public void plantPeriodicFlexSupport(JobRequest jobRequest) {
        long d = C1127a.m3708d(jobRequest);
        long e = C1127a.m3709e(jobRequest);
        int a = m12141a(m12143a(mo3692a(jobRequest, true), d, e).build());
        if (a == -123) {
            a = m12141a(m12143a(mo3692a(jobRequest, false), d, e).build());
        }
        this.f9697b.m12120b("Schedule periodic (flex support) jobInfo %s, %s, start %s, end %s, flex %s", C3144a.m12140a(a), jobRequest, C1150e.m3891a(d), C1150e.m3891a(e), C1150e.m3891a(jobRequest.m3773k()));
    }

    public void cancel(int i) {
        try {
            m12146a().cancel(i);
        } catch (Throwable e) {
            this.f9697b.m12117a(e);
        }
        C1156b.m3947a(this.f9696a, i, null);
    }

    public boolean isPlatformJobScheduled(JobRequest jobRequest) {
        try {
            List<JobInfo> allPendingJobs = m12146a().getAllPendingJobs();
            if (allPendingJobs != null) {
                if (!allPendingJobs.isEmpty()) {
                    for (JobInfo a : allPendingJobs) {
                        if (mo3693a(a, jobRequest)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable e) {
            this.f9697b.m12117a(e);
            return false;
        }
    }

    /* renamed from: a */
    protected boolean mo3693a(@Nullable JobInfo jobInfo, @NonNull JobRequest jobRequest) {
        boolean z = true;
        jobInfo = (jobInfo == null || jobInfo.getId() != jobRequest.m3765c()) ? null : true;
        if (jobInfo == null) {
            return false;
        }
        if (jobRequest.m3754B() != null) {
            if (C1156b.m3949a(this.f9696a, jobRequest.m3765c()) == null) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    protected Builder mo3692a(JobRequest jobRequest, boolean z) {
        Builder requiredNetworkType = new Builder(jobRequest.m3765c(), new ComponentName(this.f9696a, PlatformJobService.class)).setRequiresCharging(jobRequest.m3775m()).setRequiresDeviceIdle(jobRequest.m3776n()).setRequiredNetworkType(mo3219a(jobRequest.m3779q()));
        z = z && !jobRequest.m3754B() && C1150e.m3892a(this.f9696a);
        return mo3691a(jobRequest, requiredNetworkType.setPersisted(z));
    }

    /* renamed from: a */
    protected Builder m12143a(Builder builder, long j, long j2) {
        return builder.setMinimumLatency(j).setOverrideDeadline(j2);
    }

    /* renamed from: b */
    protected Builder mo3220b(Builder builder, long j, long j2) {
        return builder.setPeriodic(j);
    }

    /* renamed from: a */
    protected Builder mo3691a(JobRequest jobRequest, Builder builder) {
        if (jobRequest.m3754B()) {
            C1156b.m3948a(this.f9696a, jobRequest);
        }
        return builder;
    }

    /* renamed from: a */
    protected int mo3219a(@NonNull NetworkType networkType) {
        switch (networkType) {
            case ANY:
                return null;
            case CONNECTED:
                return 1;
            case UNMETERED:
                return 2;
            case NOT_ROAMING:
                return 2;
            case METERED:
                return 1;
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    /* renamed from: a */
    protected final JobScheduler m12146a() {
        return (JobScheduler) this.f9696a.getSystemService("jobscheduler");
    }

    /* renamed from: a */
    protected final int m12141a(JobInfo jobInfo) {
        JobScheduler a = m12146a();
        if (a == null) {
            throw new JobProxyIllegalStateException("JobScheduler is null");
        }
        try {
            return a.schedule(jobInfo);
        } catch (Throwable e) {
            this.f9697b.m12117a(e);
            String message = e.getMessage();
            if (message != null && message.contains("RECEIVE_BOOT_COMPLETED")) {
                return -123;
            }
            if (message == null || !message.contains("No such service ComponentInfo")) {
                throw e;
            }
            throw new JobProxyIllegalStateException(e);
        } catch (Throwable e2) {
            this.f9697b.m12117a(e2);
            throw new JobProxyIllegalStateException(e2);
        }
    }
}
