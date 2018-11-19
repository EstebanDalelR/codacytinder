package com.evernote.android.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.evernote.android.job.JobProxy.C1127a;
import com.evernote.android.job.util.C1149d;
import com.evernote.android.job.util.C1150e;
import com.evernote.android.job.util.C3142c;
import java.util.Set;

/* renamed from: com.evernote.android.job.e */
public final class C1139e {
    /* renamed from: a */
    private static final C3142c f2994a = new C3142c("JobManager");
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: b */
    private static volatile C1139e f2995b;
    /* renamed from: c */
    private final Context f2996c;
    /* renamed from: d */
    private final C1135c f2997d = new C1135c();
    /* renamed from: e */
    private final C1143f f2998e;
    /* renamed from: f */
    private final C1138d f2999f;

    /* renamed from: a */
    public static C1139e m3820a(@NonNull Context context) throws JobManagerCreateException {
        if (f2995b == null) {
            synchronized (C1139e.class) {
                if (f2995b == null) {
                    C1149d.m3889a((Object) context, (Object) "Context cannot be null");
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    JobApi jobApi = JobApi.getDefault(context);
                    if (jobApi != JobApi.V_14 || jobApi.isSupported(context)) {
                        f2995b = new C1139e(context);
                        if (!C1150e.m3894b(context)) {
                            f2994a.m12122c("No wake lock permission");
                        }
                        if (!C1150e.m3892a(context)) {
                            f2994a.m12122c("No boot permission");
                        }
                        C1139e.m3823b(context);
                    } else {
                        throw new JobManagerCreateException("All APIs are disabled, cannot schedule any job");
                    }
                }
            }
        }
        return f2995b;
    }

    /* renamed from: a */
    public static C1139e m3819a() {
        if (f2995b == null) {
            synchronized (C1139e.class) {
                if (f2995b == null) {
                    throw new IllegalStateException("You need to call create() at least once to create the singleton");
                }
            }
        }
        return f2995b;
    }

    private C1139e(Context context) {
        this.f2996c = context;
        this.f2998e = new C1143f(context);
        this.f2999f = new C1138d();
        if (C1133b.m3798d() == null) {
            JobRescheduleService.m12105a(this.f2996c);
        }
    }

    /* renamed from: a */
    public void m3832a(@android.support.annotation.NonNull com.evernote.android.job.JobRequest r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r7 = this;
        r0 = r7.f2997d;
        r0 = r0.m3805a();
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r0 = f2994a;
        r1 = "you haven't registered a JobCreator with addJobCreator(), it's likely that your job never will be executed";
        r0.m12122c(r1);
    L_0x000f:
        r0 = r8.m3786x();
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x001a;
    L_0x0019:
        return;
    L_0x001a:
        r0 = r8.m3782t();
        if (r0 == 0) goto L_0x0027;
    L_0x0020:
        r0 = r8.m3766d();
        r7.m3836c(r0);
    L_0x0027:
        r0 = r7.f2996c;
        r1 = r8.m3765c();
        com.evernote.android.job.JobProxy.C1127a.m3702a(r0, r1);
        r0 = r8.m3785w();
        r1 = r8.m3771i();
        if (r1 == 0) goto L_0x004e;
    L_0x003a:
        r2 = r0.isFlexSupport();
        if (r2 == 0) goto L_0x004e;
    L_0x0040:
        r2 = r8.m3773k();
        r4 = r8.m3772j();
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 >= 0) goto L_0x004e;
    L_0x004c:
        r2 = 1;
        goto L_0x004f;
    L_0x004e:
        r2 = 0;
    L_0x004f:
        r3 = com.evernote.android.job.C1133b.m3801g();
        r3 = r3.currentTimeMillis();
        r8.m3761a(r3);
        r8.m3762a(r2);
        r3 = r7.f2998e;
        r3.m3865a(r8);
        r7.m3821a(r8, r0, r1, r2);	 Catch:{ JobProxyIllegalStateException -> 0x006d, Exception -> 0x0066 }
        return;
    L_0x0066:
        r0 = move-exception;
        r1 = r7.f2998e;
        r1.m3868b(r8);
        throw r0;
    L_0x006d:
        r0.invalidateCachedProxy();	 Catch:{ Exception -> 0x0074 }
        r7.m3821a(r8, r0, r1, r2);	 Catch:{ Exception -> 0x0074 }
        return;
    L_0x0074:
        r3 = move-exception;
        r4 = com.evernote.android.job.JobApi.V_14;
        if (r0 == r4) goto L_0x0098;
    L_0x0079:
        r4 = com.evernote.android.job.JobApi.V_19;
        if (r0 != r4) goto L_0x007e;
    L_0x007d:
        goto L_0x0098;
    L_0x007e:
        r0 = com.evernote.android.job.JobApi.V_19;
        r3 = r7.f2996c;
        r0 = r0.isSupported(r3);
        if (r0 == 0) goto L_0x008b;
    L_0x0088:
        r0 = com.evernote.android.job.JobApi.V_19;
        goto L_0x008d;
    L_0x008b:
        r0 = com.evernote.android.job.JobApi.V_14;
    L_0x008d:
        r7.m3821a(r8, r0, r1, r2);	 Catch:{ Exception -> 0x0091 }
        return;
    L_0x0091:
        r0 = move-exception;
        r1 = r7.f2998e;
        r1.m3868b(r8);
        throw r0;
    L_0x0098:
        r0 = r7.f2998e;
        r0.m3868b(r8);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.e.a(com.evernote.android.job.JobRequest):void");
    }

    /* renamed from: a */
    private void m3821a(JobRequest jobRequest, JobApi jobApi, boolean z, boolean z2) {
        jobApi = m3826a(jobApi);
        if (!z) {
            jobApi.plantOneOff(jobRequest);
        } else if (z2) {
            jobApi.plantPeriodicFlexSupport(jobRequest);
        } else {
            jobApi.plantPeriodic(jobRequest);
        }
    }

    /* renamed from: a */
    public JobRequest m3827a(int i) {
        JobRequest a = m3828a(i, false);
        if (a == 0 || !a.m3754B() || a.m3785w().getProxy(this.f2996c).isPlatformJobScheduled(a)) {
            return a;
        }
        m3837c().m3868b(a);
        return 0;
    }

    /* renamed from: a */
    JobRequest m3828a(int i, boolean z) {
        i = this.f2998e.m3863a(i);
        return (z || i == 0 || !i.m3788z()) ? i : 0;
    }

    /* renamed from: a */
    public Set<JobRequest> m3829a(@NonNull String str) {
        return m3830a(str, false, true);
    }

    /* renamed from: a */
    Set<JobRequest> m3830a(@Nullable String str, boolean z, boolean z2) {
        str = this.f2998e.m3864a(str, z);
        if (z2) {
            z = str.iterator();
            while (z.hasNext()) {
                JobRequest jobRequest = (JobRequest) z.next();
                if (jobRequest.m3754B() && !jobRequest.m3785w().getProxy(this.f2996c).isPlatformJobScheduled(jobRequest)) {
                    this.f2998e.m3868b(jobRequest);
                    z.remove();
                }
            }
        }
        return str;
    }

    /* renamed from: b */
    public Job m3833b(int i) {
        return this.f2999f.m3811a(i);
    }

    @NonNull
    /* renamed from: b */
    public Set<Job> m3834b() {
        return this.f2999f.m3812a();
    }

    @NonNull
    /* renamed from: b */
    public Set<Job> m3835b(@NonNull String str) {
        return this.f2999f.m3813a(str);
    }

    /* renamed from: c */
    public boolean m3838c(int i) {
        boolean b = m3824b(m3828a(i, true)) | m3822a(m3833b(i));
        C1127a.m3702a(this.f2996c, i);
        return b;
    }

    /* renamed from: c */
    public int m3836c(@NonNull String str) {
        return m3825d(str);
    }

    /* renamed from: b */
    private boolean m3824b(@Nullable JobRequest jobRequest) {
        if (jobRequest == null) {
            return false;
        }
        f2994a.m12116a("Found pending job %s, canceling", jobRequest);
        m3826a(jobRequest.m3785w()).cancel(jobRequest.m3765c());
        m3837c().m3868b(jobRequest);
        jobRequest.m3761a(0);
        return true;
    }

    /* renamed from: a */
    private boolean m3822a(@Nullable Job job) {
        if (job == null || job.isFinished() || job.isCanceled()) {
            return false;
        }
        f2994a.m12116a("Cancel running %s", job);
        job.cancel(true);
        return true;
    }

    /* renamed from: d */
    private synchronized int m3825d(@Nullable String str) {
        int i;
        i = 0;
        for (JobRequest b : m3830a(str, true, false)) {
            if (m3824b(b)) {
                i++;
            }
        }
        for (Job a : TextUtils.isEmpty(str) ? m3834b() : m3835b(str)) {
            if (m3822a(a)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public void m3831a(JobCreator jobCreator) {
        this.f2997d.m3804a(jobCreator);
    }

    /* renamed from: c */
    C1143f m3837c() {
        return this.f2998e;
    }

    /* renamed from: d */
    C1138d m3839d() {
        return this.f2999f;
    }

    /* renamed from: e */
    C1135c m3840e() {
        return this.f2997d;
    }

    /* renamed from: f */
    Context m3841f() {
        return this.f2996c;
    }

    /* renamed from: a */
    JobProxy m3826a(JobApi jobApi) {
        return jobApi.getProxy(this.f2996c);
    }

    /* renamed from: b */
    private static void m3823b(@android.support.annotation.NonNull android.content.Context r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = r4.getPackageName();
        r1 = new android.content.Intent;
        r2 = "com.evernote.android.job.ADD_JOB_CREATOR";
        r1.<init>(r2);
        r1.setPackage(r0);
        r2 = r4.getPackageManager();	 Catch:{ Exception -> 0x0018 }
        r3 = 0;	 Catch:{ Exception -> 0x0018 }
        r1 = r2.queryBroadcastReceivers(r1, r3);	 Catch:{ Exception -> 0x0018 }
        goto L_0x001c;
    L_0x0018:
        r1 = java.util.Collections.emptyList();
    L_0x001c:
        r1 = r1.iterator();
    L_0x0020:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0057;
    L_0x0026:
        r2 = r1.next();
        r2 = (android.content.pm.ResolveInfo) r2;
        r2 = r2.activityInfo;
        if (r2 == 0) goto L_0x0020;
    L_0x0030:
        r3 = r2.exported;
        if (r3 != 0) goto L_0x0020;
    L_0x0034:
        r3 = r2.packageName;
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0020;
    L_0x003c:
        r3 = r2.name;
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 == 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0020;
    L_0x0045:
        r2 = r2.name;	 Catch:{ Exception -> 0x0020 }
        r2 = java.lang.Class.forName(r2);	 Catch:{ Exception -> 0x0020 }
        r2 = r2.newInstance();	 Catch:{ Exception -> 0x0020 }
        r2 = (com.evernote.android.job.JobCreator.AddJobCreatorReceiver) r2;	 Catch:{ Exception -> 0x0020 }
        r3 = f2995b;	 Catch:{ Exception -> 0x0020 }
        r2.m3696a(r4, r3);	 Catch:{ Exception -> 0x0020 }
        goto L_0x0020;
    L_0x0057:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.e.b(android.content.Context):void");
    }
}
