package com.evernote.android.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager.WakeLock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.LruCache;
import android.util.SparseArray;
import com.evernote.android.job.Job.Result;
import com.evernote.android.job.util.C3142c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.evernote.android.job.d */
class C1138d {
    /* renamed from: a */
    private static final C3142c f2988a = new C3142c("JobExecutor");
    /* renamed from: b */
    private static final long f2989b = TimeUnit.MINUTES.toMillis(3);
    /* renamed from: c */
    private final SparseArray<Job> f2990c = new SparseArray();
    /* renamed from: d */
    private final LruCache<Integer, WeakReference<Job>> f2991d = new LruCache(20);
    /* renamed from: e */
    private final SparseArray<Result> f2992e = new SparseArray();
    /* renamed from: f */
    private final Set<JobRequest> f2993f = new HashSet();

    /* renamed from: com.evernote.android.job.d$a */
    private final class C1137a implements Callable<Result> {
        /* renamed from: a */
        final /* synthetic */ C1138d f2985a;
        /* renamed from: b */
        private final Job f2986b;
        /* renamed from: c */
        private final WakeLock f2987c;

        public /* synthetic */ Object call() throws Exception {
            return m3808a();
        }

        private C1137a(C1138d c1138d, Job job) {
            this.f2985a = c1138d;
            this.f2986b = job;
            this.f2987c = C1146h.m3874a(this.f2986b.getContext(), "JobExecutor", C1138d.f2989b);
        }

        /* renamed from: a */
        public Result m3808a() throws Exception {
            try {
                C1146h.m3876a(this.f2986b.getContext(), this.f2987c, C1138d.f2989b);
                Result b = m3807b();
                this.f2985a.m3816a(this.f2986b);
                if (this.f2987c == null || !this.f2987c.isHeld()) {
                    C1138d.f2988a.m12123c("Wake lock was not held after job %s was done. The job took too long to complete. This could have unintended side effects on your app.", this.f2986b);
                }
                C1146h.m3875a(this.f2987c);
                return b;
            } catch (Throwable th) {
                this.f2985a.m3816a(this.f2986b);
                if (this.f2987c == null || !this.f2987c.isHeld()) {
                    C1138d.f2988a.m12123c("Wake lock was not held after job %s was done. The job took too long to complete. This could have unintended side effects on your app.", this.f2986b);
                }
                C1146h.m3875a(this.f2987c);
            }
        }

        /* renamed from: b */
        private Result m3807b() {
            try {
                Result runJob = this.f2986b.runJob();
                C1138d.f2988a.m12116a("Finished %s", this.f2986b);
                m3806a(this.f2986b, runJob);
                return runJob;
            } catch (Throwable th) {
                C1138d.f2988a.m12121b(th, "Crashed %s", this.f2986b);
                return this.f2986b.getResult();
            }
        }

        /* renamed from: a */
        private void m3806a(Job job, Result result) {
            JobRequest f = this.f2986b.getParams().m3695f();
            boolean z = false;
            boolean z2 = true;
            if (!f.m3771i() && Result.RESCHEDULE.equals(result) && !job.isDeleted()) {
                f = f.m3760a(true, true);
                this.f2986b.onReschedule(f.m3765c());
            } else if (!f.m3771i()) {
                z2 = false;
            } else if (Result.SUCCESS.equals(result) == null) {
                z = true;
            }
            if (job.isDeleted() != null) {
                return;
            }
            if (z || z2) {
                f.m3764b(z, z2);
            }
        }
    }

    /* renamed from: a */
    public synchronized Future<Result> m3814a(@NonNull Context context, @NonNull JobRequest jobRequest, @Nullable Job job, @NonNull Bundle bundle) {
        this.f2993f.remove(jobRequest);
        if (job == null) {
            f2988a.m12123c("JobCreator returned null for tag %s", new Object[]{jobRequest.m3766d()});
            return null;
        } else if (job.isFinished()) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Job for tag %s was already run, a creator should always create a new Job instance", new Object[]{jobRequest.m3766d()}));
        } else {
            job.setContext(context).setRequest(jobRequest, bundle);
            f2988a.m12116a("Executing %s, context %s", jobRequest, context.getClass().getSimpleName());
            this.f2990c.put(jobRequest.m3765c(), job);
            return C1133b.m3802h().submit(new C1137a(job));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized com.evernote.android.job.Job m3811a(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f2990c;	 Catch:{ all -> 0x0025 }
        r0 = r0.get(r2);	 Catch:{ all -> 0x0025 }
        r0 = (com.evernote.android.job.Job) r0;	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);
        return r0;
    L_0x000d:
        r0 = r1.f2991d;	 Catch:{ all -> 0x0025 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0025 }
        r2 = r0.get(r2);	 Catch:{ all -> 0x0025 }
        r2 = (java.lang.ref.WeakReference) r2;	 Catch:{ all -> 0x0025 }
        if (r2 == 0) goto L_0x0022;
    L_0x001b:
        r2 = r2.get();	 Catch:{ all -> 0x0025 }
        r2 = (com.evernote.android.job.Job) r2;	 Catch:{ all -> 0x0025 }
        goto L_0x0023;
    L_0x0022:
        r2 = 0;
    L_0x0023:
        monitor-exit(r1);
        return r2;
    L_0x0025:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.d.a(int):com.evernote.android.job.Job");
    }

    /* renamed from: a */
    public synchronized Set<Job> m3812a() {
        return m3813a(null);
    }

    /* renamed from: a */
    public synchronized Set<Job> m3813a(String str) {
        Set<Job> hashSet;
        hashSet = new HashSet();
        for (int i = 0; i < this.f2990c.size(); i++) {
            Job job = (Job) this.f2990c.valueAt(i);
            if (str == null || str.equals(job.getParams().m3691b())) {
                hashSet.add(job);
            }
        }
        for (WeakReference weakReference : this.f2991d.snapshot().values()) {
            job = (Job) weakReference.get();
            if (job != null) {
                if (str == null || str.equals(job.getParams().m3691b())) {
                    hashSet.add(job);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public synchronized void m3817a(@NonNull JobRequest jobRequest) {
        this.f2993f.add(jobRequest);
    }

    /* renamed from: b */
    public synchronized boolean m3818b(JobRequest jobRequest) {
        if (jobRequest != null) {
            if (this.f2993f.contains(jobRequest) != null) {
                jobRequest = true;
            }
        }
        jobRequest = null;
        return jobRequest;
    }

    @VisibleForTesting
    /* renamed from: a */
    synchronized void m3816a(Job job) {
        int a = job.getParams().m3690a();
        this.f2990c.remove(a);
        m3815a(this.f2991d);
        this.f2992e.put(a, job.getResult());
        this.f2991d.put(Integer.valueOf(a), new WeakReference(job));
    }

    @VisibleForTesting
    @SuppressLint({"UseSparseArrays"})
    /* renamed from: a */
    void m3815a(LruCache<Integer, WeakReference<Job>> lruCache) {
        Map hashMap = new HashMap(lruCache.snapshot());
        for (Integer num : hashMap.keySet()) {
            if (hashMap.get(num) == null || ((WeakReference) hashMap.get(num)).get() == null) {
                lruCache.remove(num);
            }
        }
    }
}
