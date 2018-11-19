package com.evernote.android.job;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.evernote.android.job.JobRequest.NetworkType;
import com.evernote.android.job.util.C1148b;
import com.evernote.android.job.util.C3142c;
import com.evernote.android.job.util.support.C1152b;
import java.lang.ref.WeakReference;

public abstract class Job {
    private static final C3142c CAT = new C3142c("Job");
    private Context mApplicationContext;
    private boolean mCanceled;
    private WeakReference<Context> mContextReference;
    private boolean mDeleted;
    private long mFinishedTimeStamp = -1;
    private C1125a mParams;
    private Result mResult = Result.FAILURE;

    public enum Result {
        SUCCESS,
        FAILURE,
        RESCHEDULE
    }

    /* renamed from: com.evernote.android.job.Job$a */
    public static final class C1125a {
        /* renamed from: a */
        private final JobRequest f2924a;
        /* renamed from: b */
        private C1152b f2925b;
        /* renamed from: c */
        private Bundle f2926c;

        private C1125a(@NonNull JobRequest jobRequest, @NonNull Bundle bundle) {
            this.f2924a = jobRequest;
            this.f2926c = bundle;
        }

        /* renamed from: a */
        public int m3690a() {
            return this.f2924a.m3765c();
        }

        /* renamed from: b */
        public String m3691b() {
            return this.f2924a.m3766d();
        }

        /* renamed from: c */
        public boolean m3692c() {
            return this.f2924a.m3771i();
        }

        /* renamed from: d */
        public int m3693d() {
            return this.f2924a.m3787y();
        }

        @NonNull
        /* renamed from: e */
        public C1152b m3694e() {
            if (this.f2925b == null) {
                this.f2925b = this.f2924a.m3781s();
                if (this.f2925b == null) {
                    this.f2925b = new C1152b();
                }
            }
            return this.f2925b;
        }

        /* renamed from: f */
        JobRequest m3695f() {
            return this.f2924a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    return this.f2924a.equals(((C1125a) obj).f2924a);
                }
            }
            return null;
        }

        public int hashCode() {
            return this.f2924a.hashCode();
        }
    }

    @WorkerThread
    protected void onReschedule(int i) {
    }

    @WorkerThread
    @NonNull
    protected abstract Result onRunJob(@NonNull C1125a c1125a);

    final Result runJob() {
        try {
            Result result;
            if (!(this instanceof DailyJob)) {
                if (!meetsRequirements()) {
                    this.mResult = getParams().m3692c() ? Result.FAILURE : Result.RESCHEDULE;
                    result = this.mResult;
                    return result;
                }
            }
            this.mResult = onRunJob(getParams());
            result = this.mResult;
            return result;
        } finally {
            this.mFinishedTimeStamp = System.currentTimeMillis();
        }
    }

    boolean meetsRequirements() {
        if (!getParams().m3695f().m3774l()) {
            return true;
        }
        if (!isRequirementChargingMet()) {
            CAT.m12122c("Job requires charging, reschedule");
            return false;
        } else if (!isRequirementDeviceIdleMet()) {
            CAT.m12122c("Job requires device to be idle, reschedule");
            return false;
        } else if (isRequirementNetworkTypeMet()) {
            return true;
        } else {
            CAT.m12123c("Job requires network to be %s, but was %s", getParams().m3695f().m3779q(), C1148b.m3883c(getContext()));
            return false;
        }
    }

    protected boolean isRequirementChargingMet() {
        if (getParams().m3695f().m3775m()) {
            if (!C1148b.m3880a(getContext()).m3878a()) {
                return false;
            }
        }
        return true;
    }

    protected boolean isRequirementDeviceIdleMet() {
        if (getParams().m3695f().m3776n()) {
            if (!C1148b.m3882b(getContext())) {
                return false;
            }
        }
        return true;
    }

    protected boolean isRequirementBatteryNotLowMet() {
        if (getParams().m3695f().m3777o()) {
            if (C1148b.m3880a(getContext()).m3879b()) {
                return false;
            }
        }
        return true;
    }

    protected boolean isRequirementStorageNotLowMet() {
        if (getParams().m3695f().m3778p()) {
            if (C1148b.m3881a()) {
                return false;
            }
        }
        return true;
    }

    protected boolean isRequirementNetworkTypeMet() {
        NetworkType q = getParams().m3695f().m3779q();
        boolean z = true;
        if (q == NetworkType.ANY) {
            return true;
        }
        NetworkType c = C1148b.m3883c(getContext());
        switch (q) {
            case CONNECTED:
                if (c == NetworkType.ANY) {
                    z = false;
                }
                return z;
            case NOT_ROAMING:
                if (!(c == NetworkType.NOT_ROAMING || c == NetworkType.UNMETERED)) {
                    if (c != NetworkType.METERED) {
                        z = false;
                    }
                }
                return z;
            case UNMETERED:
                if (c != NetworkType.UNMETERED) {
                    z = false;
                }
                return z;
            case METERED:
                if (c != NetworkType.CONNECTED) {
                    if (c != NetworkType.NOT_ROAMING) {
                        z = false;
                    }
                }
                return z;
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    final Job setRequest(JobRequest jobRequest, @NonNull Bundle bundle) {
        this.mParams = new C1125a(jobRequest, bundle);
        return this;
    }

    @NonNull
    protected final C1125a getParams() {
        return this.mParams;
    }

    final Job setContext(Context context) {
        this.mContextReference = new WeakReference(context);
        this.mApplicationContext = context.getApplicationContext();
        return this;
    }

    @NonNull
    protected final Context getContext() {
        Context context = (Context) this.mContextReference.get();
        return context == null ? this.mApplicationContext : context;
    }

    public final void cancel() {
        cancel(false);
    }

    final void cancel(boolean z) {
        if (!isFinished()) {
            this.mCanceled = true;
            this.mDeleted = z;
        }
    }

    protected final boolean isCanceled() {
        return this.mCanceled;
    }

    public final boolean isFinished() {
        return this.mFinishedTimeStamp > 0;
    }

    final long getFinishedTimeStamp() {
        return this.mFinishedTimeStamp;
    }

    final Result getResult() {
        return this.mResult;
    }

    final boolean isDeleted() {
        return this.mDeleted;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return this.mParams.equals(((Job) obj).mParams);
            }
        }
        return null;
    }

    public int hashCode() {
        return this.mParams.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("job{id=");
        stringBuilder.append(this.mParams.m3690a());
        stringBuilder.append(", finished=");
        stringBuilder.append(isFinished());
        stringBuilder.append(", result=");
        stringBuilder.append(this.mResult);
        stringBuilder.append(", canceled=");
        stringBuilder.append(this.mCanceled);
        stringBuilder.append(", periodic=");
        stringBuilder.append(this.mParams.m3692c());
        stringBuilder.append(", class=");
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(", tag=");
        stringBuilder.append(this.mParams.m3691b());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
