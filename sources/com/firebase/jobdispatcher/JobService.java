package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.C0562m;
import android.util.Log;
import com.firebase.jobdispatcher.IRemoteJobService.C3485a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

public abstract class JobService extends Service {
    /* renamed from: a */
    private static final Handler f5094a = new Handler(Looper.getMainLooper());
    /* renamed from: b */
    private final C0562m<String, C1873a> f5095b = new C0562m(1);
    /* renamed from: c */
    private final C3485a f5096c = new C42271(this);

    @Retention(RetentionPolicy.SOURCE)
    public @interface JobResult {
    }

    /* renamed from: com.firebase.jobdispatcher.JobService$a */
    private static final class C1873a {
        /* renamed from: a */
        final JobParameters f5092a;
        /* renamed from: b */
        final IJobCallback f5093b;

        private C1873a(JobParameters jobParameters, IJobCallback iJobCallback) {
            this.f5092a = jobParameters;
            this.f5093b = iJobCallback;
        }

        /* renamed from: a */
        void m6568a(int i) {
            try {
                this.f5093b.jobFinished(GooglePlayReceiver.m13225b().m6609a(this.f5092a, new Bundle()), i);
            } catch (int i2) {
                Log.e("FJD.JobService", "Failed to send result to driver", i2);
            }
        }
    }

    /* renamed from: com.firebase.jobdispatcher.JobService$1 */
    class C42271 extends C3485a {
        /* renamed from: a */
        final /* synthetic */ JobService f13507a;

        C42271(JobService jobService) {
            this.f13507a = jobService;
        }

        public void start(Bundle bundle, IJobCallback iJobCallback) {
            bundle = GooglePlayReceiver.m13225b().m6611b(bundle);
            if (bundle == null) {
                Log.wtf("FJD.JobService", "start: unknown invocation provided");
            } else {
                this.f13507a.m6570a(bundle.m6630a(), iJobCallback);
            }
        }

        public void stop(Bundle bundle, boolean z) {
            bundle = GooglePlayReceiver.m13225b().m6611b(bundle);
            if (bundle == null) {
                Log.wtf("FJD.JobService", "stop: unknown invocation provided");
            } else {
                this.f13507a.m6571a(bundle.m6630a(), z);
            }
        }
    }

    @MainThread
    /* renamed from: a */
    public abstract boolean m6572a(JobParameters jobParameters);

    @MainThread
    /* renamed from: b */
    public abstract boolean m6574b(JobParameters jobParameters);

    public final void onStart(Intent intent, int i) {
    }

    /* renamed from: a */
    void m6570a(final JobParameters jobParameters, IJobCallback iJobCallback) {
        synchronized (this.f5095b) {
            if (this.f5095b.containsKey(jobParameters.getTag())) {
                Log.w("FJD.JobService", String.format(Locale.US, "Job with tag = %s was already running.", new Object[]{jobParameters.getTag()}));
                return;
            }
            this.f5095b.put(jobParameters.getTag(), new C1873a(jobParameters, iJobCallback));
            f5094a.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ JobService f5087b;

                public void run() {
                    synchronized (this.f5087b.f5095b) {
                        if (!this.f5087b.m6572a(jobParameters)) {
                            C1873a c1873a = (C1873a) this.f5087b.f5095b.remove(jobParameters.getTag());
                            if (c1873a != null) {
                                c1873a.m6568a(0);
                            }
                        }
                    }
                }
            });
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    void m6571a(final com.firebase.jobdispatcher.JobParameters r5, final boolean r6) {
        /*
        r4 = this;
        r0 = r4.f5095b;
        monitor-enter(r0);
        r1 = r4.f5095b;	 Catch:{ all -> 0x002f }
        r2 = r5.getTag();	 Catch:{ all -> 0x002f }
        r1 = r1.remove(r2);	 Catch:{ all -> 0x002f }
        r1 = (com.firebase.jobdispatcher.JobService.C1873a) r1;	 Catch:{ all -> 0x002f }
        if (r1 != 0) goto L_0x0023;
    L_0x0011:
        r5 = "FJD.JobService";
        r6 = 3;
        r5 = android.util.Log.isLoggable(r5, r6);	 Catch:{ all -> 0x002f }
        if (r5 == 0) goto L_0x0021;
    L_0x001a:
        r5 = "FJD.JobService";
        r6 = "Provided job has already been executed.";
        android.util.Log.d(r5, r6);	 Catch:{ all -> 0x002f }
    L_0x0021:
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return;
    L_0x0023:
        r2 = f5094a;	 Catch:{ all -> 0x002f }
        r3 = new com.firebase.jobdispatcher.JobService$3;	 Catch:{ all -> 0x002f }
        r3.<init>(r4, r5, r6, r1);	 Catch:{ all -> 0x002f }
        r2.post(r3);	 Catch:{ all -> 0x002f }
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return;
    L_0x002f:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.JobService.a(com.firebase.jobdispatcher.JobParameters, boolean):void");
    }

    /* renamed from: b */
    public final void m6573b(@NonNull JobParameters jobParameters, boolean z) {
        if (jobParameters == null) {
            Log.e("FJD.JobService", "jobFinished called with a null JobParameters");
            return;
        }
        synchronized (this.f5095b) {
            C1873a c1873a = (C1873a) this.f5095b.remove(jobParameters.getTag());
            if (c1873a != null) {
                c1873a.m6568a(z);
            }
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        stopSelf(i2);
        return 2;
    }

    @Nullable
    public final IBinder onBind(Intent intent) {
        return this.f5096c;
    }

    @MainThread
    public final boolean onUnbind(Intent intent) {
        synchronized (this.f5095b) {
            for (int size = this.f5095b.size() - 1; size >= 0; size--) {
                C1873a c1873a = (C1873a) this.f5095b.remove(this.f5095b.m2075b(size));
                if (c1873a != null) {
                    c1873a.m6568a(m6574b(c1873a.f5092a) ? 1 : 2);
                }
            }
        }
        return super.onUnbind(intent);
    }

    public final void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }
}
