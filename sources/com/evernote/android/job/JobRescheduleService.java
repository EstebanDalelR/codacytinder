package com.evernote.android.job;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.JobIntentService;
import com.evernote.android.job.util.C3142c;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;

public final class JobRescheduleService extends JobIntentService {
    @VisibleForTesting
    /* renamed from: j */
    static CountDownLatch f9682j;
    /* renamed from: k */
    private static final C3142c f9683k = new C3142c("JobRescheduleService", false);

    /* renamed from: a */
    static void m12105a(Context context) {
        try {
            JobIntentService.m1387a(context, JobRescheduleService.class, 2147480000, new Intent());
            f9682j = new CountDownLatch(1);
        } catch (Throwable e) {
            f9683k.m12117a(e);
        }
    }

    /* renamed from: a */
    protected void mo1534a(@android.support.annotation.NonNull android.content.Intent r7) {
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
        r6 = this;
        r7 = f9683k;	 Catch:{ all -> 0x004b }
        r0 = "Reschedule service started";	 Catch:{ all -> 0x004b }
        r7.m12119b(r0);	 Catch:{ all -> 0x004b }
        r0 = com.evernote.android.job.C1133b.m3797c();	 Catch:{ all -> 0x004b }
        android.os.SystemClock.sleep(r0);	 Catch:{ all -> 0x004b }
        r7 = com.evernote.android.job.C1139e.m3820a(r6);	 Catch:{ JobManagerCreateException -> 0x0041 }
        r0 = 0;
        r1 = 1;
        r0 = r7.m3830a(r0, r1, r1);	 Catch:{ all -> 0x004b }
        r7 = r6.m12106a(r7, r0);	 Catch:{ all -> 0x004b }
        r2 = f9683k;	 Catch:{ all -> 0x004b }
        r3 = "Reschedule %d jobs of %d jobs";	 Catch:{ all -> 0x004b }
        r4 = 2;	 Catch:{ all -> 0x004b }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x004b }
        r5 = 0;	 Catch:{ all -> 0x004b }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x004b }
        r4[r5] = r7;	 Catch:{ all -> 0x004b }
        r7 = r0.size();	 Catch:{ all -> 0x004b }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x004b }
        r4[r1] = r7;	 Catch:{ all -> 0x004b }
        r2.m12120b(r3, r4);	 Catch:{ all -> 0x004b }
        r7 = f9682j;
        if (r7 == 0) goto L_0x0040;
    L_0x003b:
        r7 = f9682j;
        r7.countDown();
    L_0x0040:
        return;
    L_0x0041:
        r7 = f9682j;
        if (r7 == 0) goto L_0x004a;
    L_0x0045:
        r7 = f9682j;
        r7.countDown();
    L_0x004a:
        return;
    L_0x004b:
        r7 = move-exception;
        r0 = f9682j;
        if (r0 == 0) goto L_0x0055;
    L_0x0050:
        r0 = f9682j;
        r0.countDown();
    L_0x0055:
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.JobRescheduleService.a(android.content.Intent):void");
    }

    /* renamed from: a */
    int m12106a(C1139e c1139e, Collection<JobRequest> collection) {
        int i = 0;
        Object obj = null;
        for (JobRequest jobRequest : collection) {
            int isPlatformJobScheduled = jobRequest.m3788z() ? c1139e.m3833b(jobRequest.m3765c()) == null ? 1 : 0 : c1139e.m3826a(jobRequest.m3785w()).isPlatformJobScheduled(jobRequest) ^ 1;
            if (isPlatformJobScheduled != 0) {
                try {
                    jobRequest.m3757E().m3747b().m3756D();
                } catch (Throwable e) {
                    if (obj == null) {
                        f9683k.m12117a(e);
                        obj = 1;
                    }
                }
                i++;
            }
        }
        return i;
    }
}
