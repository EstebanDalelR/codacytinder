package com.evernote.android.job;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.evernote.android.job.Job.Result;
import com.evernote.android.job.util.C1150e;
import com.evernote.android.job.util.C3142c;
import com.google.android.exoplayer2.Format;
import java.util.Locale;

public interface JobProxy {

    /* renamed from: com.evernote.android.job.JobProxy$a */
    public static final class C1127a {
        /* renamed from: a */
        private static final Object f2928a = new Object();
        /* renamed from: b */
        private final Context f2929b;
        /* renamed from: c */
        private final int f2930c;
        /* renamed from: d */
        private final C3142c f2931d;
        /* renamed from: e */
        private final C1139e f2932e;

        /* renamed from: a */
        private static long m3698a(long j, boolean z) {
            return z ? j : Format.OFFSET_SAMPLE_RELATIVE;
        }

        /* renamed from: a */
        private static long m3697a(long j, long j2) {
            long j3 = j + j2;
            int i = 0;
            int i2 = (j ^ j2) < 0 ? 1 : 0;
            if ((j ^ j3) >= 0) {
                i = 1;
            }
            return C1127a.m3698a(j3, i2 | i);
        }

        /* renamed from: b */
        private static long m3705b(long j, long j2) {
            int numberOfLeadingZeros = ((Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ -1)) + Long.numberOfLeadingZeros(j2)) + Long.numberOfLeadingZeros(j2 ^ -1);
            if (numberOfLeadingZeros > 65) {
                return j * j2;
            }
            boolean z = false;
            long a = C1127a.m3698a(C1127a.m3698a(j * j2, numberOfLeadingZeros >= 64), (j >= 0 ? 1 : 0) | (j2 != Long.MIN_VALUE ? 1 : 0));
            if (j == 0 || a / j == j2) {
                z = true;
            }
            return C1127a.m3698a(a, z);
        }

        /* renamed from: a */
        public static long m3699a(JobRequest jobRequest) {
            if (jobRequest.m3787y() > 0) {
                return jobRequest.m3784v();
            }
            return jobRequest.m3767e();
        }

        /* renamed from: b */
        public static long m3706b(JobRequest jobRequest) {
            return C1127a.m3700a(jobRequest, false);
        }

        /* renamed from: a */
        public static long m3700a(JobRequest jobRequest, boolean z) {
            long v;
            if (jobRequest.m3787y() > 0) {
                v = jobRequest.m3784v();
            } else {
                v = jobRequest.m3768f();
            }
            return (z && jobRequest.m3774l() && jobRequest.m3780r() != null) ? C1127a.m3705b(v, 100) : v;
        }

        /* renamed from: c */
        public static long m3707c(JobRequest jobRequest) {
            return C1127a.m3697a(C1127a.m3699a(jobRequest), (C1127a.m3706b(jobRequest) - C1127a.m3699a(jobRequest)) / 2);
        }

        /* renamed from: d */
        public static long m3708d(JobRequest jobRequest) {
            return Math.max(1, jobRequest.m3772j() - jobRequest.m3773k());
        }

        /* renamed from: e */
        public static long m3709e(JobRequest jobRequest) {
            return jobRequest.m3772j();
        }

        /* renamed from: f */
        public static long m3710f(JobRequest jobRequest) {
            return C1127a.m3697a(C1127a.m3708d(jobRequest), (C1127a.m3709e(jobRequest) - C1127a.m3708d(jobRequest)) / 2);
        }

        /* renamed from: g */
        public static int m3711g(JobRequest jobRequest) {
            return jobRequest.m3787y();
        }

        public C1127a(@NonNull Service service, C3142c c3142c, int i) {
            this((Context) service, c3142c, i);
        }

        C1127a(@NonNull Context context, C3142c c3142c, int i) {
            this.f2929b = context;
            this.f2930c = i;
            this.f2931d = c3142c;
            try {
                context = C1139e.m3820a(context);
            } catch (Throwable e) {
                this.f2931d.m12117a(e);
                context = null;
            }
            this.f2932e = context;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public com.evernote.android.job.JobRequest m3713a(boolean r17, boolean r18) {
            /*
            r16 = this;
            r1 = r16;
            r2 = f2928a;
            monitor-enter(r2);
            r3 = r1.f2932e;	 Catch:{ all -> 0x00ea }
            r4 = 0;
            if (r3 != 0) goto L_0x000c;
        L_0x000a:
            monitor-exit(r2);	 Catch:{ all -> 0x00ea }
            return r4;
        L_0x000c:
            r3 = r1.f2932e;	 Catch:{ all -> 0x00ea }
            r5 = r1.f2930c;	 Catch:{ all -> 0x00ea }
            r6 = 1;
            r3 = r3.m3828a(r5, r6);	 Catch:{ all -> 0x00ea }
            r5 = r1.f2932e;	 Catch:{ all -> 0x00ea }
            r7 = r1.f2930c;	 Catch:{ all -> 0x00ea }
            r5 = r5.m3833b(r7);	 Catch:{ all -> 0x00ea }
            r7 = 0;
            if (r3 == 0) goto L_0x0028;
        L_0x0020:
            r8 = r3.m3771i();	 Catch:{ all -> 0x00ea }
            if (r8 == 0) goto L_0x0028;
        L_0x0026:
            r8 = 1;
            goto L_0x0029;
        L_0x0028:
            r8 = 0;
        L_0x0029:
            r9 = 2;
            if (r5 == 0) goto L_0x0047;
        L_0x002c:
            r10 = r5.isFinished();	 Catch:{ all -> 0x00ea }
            if (r10 != 0) goto L_0x0047;
        L_0x0032:
            r5 = r1.f2931d;	 Catch:{ all -> 0x00ea }
            r8 = "Job %d is already running, %s";
            r9 = new java.lang.Object[r9];	 Catch:{ all -> 0x00ea }
            r10 = r1.f2930c;	 Catch:{ all -> 0x00ea }
            r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x00ea }
            r9[r7] = r10;	 Catch:{ all -> 0x00ea }
            r9[r6] = r3;	 Catch:{ all -> 0x00ea }
            r5.m12120b(r8, r9);	 Catch:{ all -> 0x00ea }
            monitor-exit(r2);	 Catch:{ all -> 0x00ea }
            return r4;
        L_0x0047:
            if (r5 == 0) goto L_0x0063;
        L_0x0049:
            if (r8 != 0) goto L_0x0063;
        L_0x004b:
            r5 = r1.f2931d;	 Catch:{ all -> 0x00ea }
            r8 = "Job %d already finished, %s";
            r9 = new java.lang.Object[r9];	 Catch:{ all -> 0x00ea }
            r10 = r1.f2930c;	 Catch:{ all -> 0x00ea }
            r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x00ea }
            r9[r7] = r10;	 Catch:{ all -> 0x00ea }
            r9[r6] = r3;	 Catch:{ all -> 0x00ea }
            r5.m12120b(r8, r9);	 Catch:{ all -> 0x00ea }
            r16.m3703a(r17);	 Catch:{ all -> 0x00ea }
            monitor-exit(r2);	 Catch:{ all -> 0x00ea }
            return r4;
        L_0x0063:
            if (r5 == 0) goto L_0x008b;
        L_0x0065:
            r10 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00ea }
            r12 = r5.getFinishedTimeStamp();	 Catch:{ all -> 0x00ea }
            r5 = 0;
            r14 = r10 - r12;
            r10 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
            r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1));
            if (r5 >= 0) goto L_0x008b;
        L_0x0076:
            r5 = r1.f2931d;	 Catch:{ all -> 0x00ea }
            r8 = "Job %d is periodic and just finished, %s";
            r9 = new java.lang.Object[r9];	 Catch:{ all -> 0x00ea }
            r10 = r1.f2930c;	 Catch:{ all -> 0x00ea }
            r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x00ea }
            r9[r7] = r10;	 Catch:{ all -> 0x00ea }
            r9[r6] = r3;	 Catch:{ all -> 0x00ea }
            r5.m12120b(r8, r9);	 Catch:{ all -> 0x00ea }
            monitor-exit(r2);	 Catch:{ all -> 0x00ea }
            return r4;
        L_0x008b:
            if (r3 == 0) goto L_0x00a8;
        L_0x008d:
            r5 = r3.m3788z();	 Catch:{ all -> 0x00ea }
            if (r5 == 0) goto L_0x00a8;
        L_0x0093:
            r5 = r1.f2931d;	 Catch:{ all -> 0x00ea }
            r8 = "Request %d already started, %s";
            r9 = new java.lang.Object[r9];	 Catch:{ all -> 0x00ea }
            r10 = r1.f2930c;	 Catch:{ all -> 0x00ea }
            r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x00ea }
            r9[r7] = r10;	 Catch:{ all -> 0x00ea }
            r9[r6] = r3;	 Catch:{ all -> 0x00ea }
            r5.m12120b(r8, r9);	 Catch:{ all -> 0x00ea }
            monitor-exit(r2);	 Catch:{ all -> 0x00ea }
            return r4;
        L_0x00a8:
            if (r3 == 0) goto L_0x00cb;
        L_0x00aa:
            r5 = r1.f2932e;	 Catch:{ all -> 0x00ea }
            r5 = r5.m3839d();	 Catch:{ all -> 0x00ea }
            r5 = r5.m3818b(r3);	 Catch:{ all -> 0x00ea }
            if (r5 == 0) goto L_0x00cb;
        L_0x00b6:
            r5 = r1.f2931d;	 Catch:{ all -> 0x00ea }
            r8 = "Request %d is in the queue to start, %s";
            r9 = new java.lang.Object[r9];	 Catch:{ all -> 0x00ea }
            r10 = r1.f2930c;	 Catch:{ all -> 0x00ea }
            r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x00ea }
            r9[r7] = r10;	 Catch:{ all -> 0x00ea }
            r9[r6] = r3;	 Catch:{ all -> 0x00ea }
            r5.m12120b(r8, r9);	 Catch:{ all -> 0x00ea }
            monitor-exit(r2);	 Catch:{ all -> 0x00ea }
            return r4;
        L_0x00cb:
            if (r3 != 0) goto L_0x00e3;
        L_0x00cd:
            r3 = r1.f2931d;	 Catch:{ all -> 0x00ea }
            r5 = "Request for ID %d was null";
            r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x00ea }
            r8 = r1.f2930c;	 Catch:{ all -> 0x00ea }
            r8 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x00ea }
            r6[r7] = r8;	 Catch:{ all -> 0x00ea }
            r3.m12120b(r5, r6);	 Catch:{ all -> 0x00ea }
            r16.m3703a(r17);	 Catch:{ all -> 0x00ea }
            monitor-exit(r2);	 Catch:{ all -> 0x00ea }
            return r4;
        L_0x00e3:
            if (r18 == 0) goto L_0x00e8;
        L_0x00e5:
            r1.m3714h(r3);	 Catch:{ all -> 0x00ea }
        L_0x00e8:
            monitor-exit(r2);	 Catch:{ all -> 0x00ea }
            return r3;
        L_0x00ea:
            r0 = move-exception;
            r3 = r0;
            monitor-exit(r2);	 Catch:{ all -> 0x00ea }
            throw r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.JobProxy.a.a(boolean, boolean):com.evernote.android.job.JobRequest");
        }

        /* renamed from: h */
        public void m3714h(@NonNull JobRequest jobRequest) {
            this.f2932e.m3839d().m3817a(jobRequest);
        }

        @NonNull
        /* renamed from: a */
        public Result m3712a(@NonNull JobRequest jobRequest, @Nullable Bundle bundle) {
            String format;
            Throwable e;
            long currentTimeMillis = System.currentTimeMillis() - jobRequest.m3786x();
            if (jobRequest.m3771i()) {
                format = String.format(Locale.US, "interval %s, flex %s", new Object[]{C1150e.m3891a(jobRequest.m3772j()), C1150e.m3891a(jobRequest.m3773k())});
            } else if (jobRequest.m3785w().supportsExecutionWindow()) {
                format = String.format(Locale.US, "start %s, end %s", new Object[]{C1150e.m3891a(C1127a.m3699a(jobRequest)), C1150e.m3891a(C1127a.m3706b(jobRequest))});
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("delay ");
                stringBuilder.append(C1150e.m3891a(C1127a.m3707c(jobRequest)));
                format = stringBuilder.toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f2931d.m12122c("Running JobRequest on a main thread, this could cause stutter or ANR in your app.");
            }
            this.f2931d.m12120b("Run job, %s, waited %s, %s", jobRequest, C1150e.m3891a(currentTimeMillis), format);
            C1138d d = this.f2932e.m3839d();
            Job job = null;
            try {
                Job a = this.f2932e.m3840e().m3803a(jobRequest.m3766d());
                try {
                    if (!jobRequest.m3771i()) {
                        jobRequest.m3763b(true);
                    }
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    bundle = d.m3814a(this.f2929b, jobRequest, a, bundle);
                    if (bundle == null) {
                        bundle = Result.FAILURE;
                        if (!jobRequest.m3771i()) {
                            this.f2932e.m3837c().m3868b(jobRequest);
                        } else if (jobRequest.m3753A() && (a == null || !a.isDeleted())) {
                            this.f2932e.m3837c().m3868b(jobRequest);
                            jobRequest.m3760a(false, false);
                        }
                        return bundle;
                    }
                    this.f2931d.m12120b("Finished job, %s %s", jobRequest, (Result) bundle.get());
                    if (!jobRequest.m3771i()) {
                        this.f2932e.m3837c().m3868b(jobRequest);
                    } else if (jobRequest.m3753A() && (a == null || !a.isDeleted())) {
                        this.f2932e.m3837c().m3868b(jobRequest);
                        jobRequest.m3760a(false, false);
                    }
                    return r12;
                } catch (InterruptedException e2) {
                    e = e2;
                    job = a;
                    try {
                        this.f2931d.m12117a(e);
                        if (job != null) {
                            job.cancel();
                            this.f2931d.m12125d("Canceled %s", jobRequest);
                        }
                        bundle = Result.FAILURE;
                        if (jobRequest.m3771i()) {
                            this.f2932e.m3837c().m3868b(jobRequest);
                            jobRequest.m3760a(false, false);
                        } else {
                            this.f2932e.m3837c().m3868b(jobRequest);
                        }
                        return bundle;
                    } catch (Throwable th) {
                        bundle = th;
                        a = job;
                        if (jobRequest.m3771i()) {
                            this.f2932e.m3837c().m3868b(jobRequest);
                        } else if (jobRequest.m3753A() && (r5 == null || !r5.isDeleted())) {
                            this.f2932e.m3837c().m3868b(jobRequest);
                            jobRequest.m3760a(false, false);
                        }
                        throw bundle;
                    }
                } catch (Throwable th2) {
                    bundle = th2;
                    if (jobRequest.m3771i()) {
                        this.f2932e.m3837c().m3868b(jobRequest);
                        jobRequest.m3760a(false, false);
                    } else {
                        this.f2932e.m3837c().m3868b(jobRequest);
                    }
                    throw bundle;
                }
            } catch (InterruptedException e3) {
                e = e3;
                this.f2931d.m12117a(e);
                if (job != null) {
                    job.cancel();
                    this.f2931d.m12125d("Canceled %s", jobRequest);
                }
                bundle = Result.FAILURE;
                if (jobRequest.m3771i()) {
                    this.f2932e.m3837c().m3868b(jobRequest);
                    jobRequest.m3760a(false, false);
                } else {
                    this.f2932e.m3837c().m3868b(jobRequest);
                }
                return bundle;
            }
        }

        /* renamed from: a */
        private void m3703a(boolean z) {
            if (z) {
                C1127a.m3702a(this.f2929b, this.f2930c);
            }
        }

        /* renamed from: a */
        static void m3702a(android.content.Context r5, int r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = com.evernote.android.job.JobApi.values();
            r1 = r0.length;
            r2 = 0;
        L_0x0006:
            if (r2 >= r1) goto L_0x001a;
        L_0x0008:
            r3 = r0[r2];
            r4 = r3.isSupported(r5);
            if (r4 == 0) goto L_0x0017;
        L_0x0010:
            r3 = r3.getProxy(r5);	 Catch:{ Exception -> 0x0017 }
            r3.cancel(r6);	 Catch:{ Exception -> 0x0017 }
        L_0x0017:
            r2 = r2 + 1;
            goto L_0x0006;
        L_0x001a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.JobProxy.a.a(android.content.Context, int):void");
        }

        /* renamed from: a */
        public static ComponentName m3701a(Context context, Intent intent) {
            return C1146h.m3873a(context, intent);
        }

        /* renamed from: a */
        public static boolean m3704a(Intent intent) {
            return C1146h.m3877a(intent);
        }
    }

    void cancel(int i);

    boolean isPlatformJobScheduled(JobRequest jobRequest);

    void plantOneOff(JobRequest jobRequest);

    void plantPeriodic(JobRequest jobRequest);

    void plantPeriodicFlexSupport(JobRequest jobRequest);
}
