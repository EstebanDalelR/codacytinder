package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import com.evernote.android.job.Job;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.JobRequest.C1129a;
import com.evernote.android.job.util.support.C1152b;

/* renamed from: com.foursquare.pilgrim.l */
final class C3556l extends Job {
    C3556l() {
    }

    @NonNull
    /* renamed from: a */
    static JobRequest m13403a(boolean z, boolean z2, boolean z3) {
        C1152b c1152b = new C1152b();
        c1152b.m3935a(PilgrimBootService.EXTRA_RESTART, z);
        c1152b.m3935a(PilgrimBootService.EXTRA_REGISTER, z2);
        c1152b.m3935a(PilgrimBootService.EXTRA_CLEAR_MOTION_STATE, z3);
        return new C1129a("EvernoteBootReceiverJob").m3741a(c1152b).m3737a().m3747b();
    }

    @android.support.annotation.NonNull
    protected com.evernote.android.job.Job.Result onRunJob(@android.support.annotation.NonNull com.evernote.android.job.Job.C1125a r5) {
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
        r4 = this;
        r0 = com.foursquare.pilgrim.PilgrimSdk.get();
        r1 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.DEBUG;
        r2 = "Running boot in the job service";
        r0.log(r1, r2);
        r0 = r5.m3694e();	 Catch:{ Exception -> 0x0039 }
        r1 = com.foursquare.pilgrim.PilgrimBootService.EXTRA_RESTART;	 Catch:{ Exception -> 0x0039 }
        r2 = 0;	 Catch:{ Exception -> 0x0039 }
        r0 = r0.m3939b(r1, r2);	 Catch:{ Exception -> 0x0039 }
        r1 = r5.m3694e();	 Catch:{ Exception -> 0x0039 }
        r3 = com.foursquare.pilgrim.PilgrimBootService.EXTRA_REGISTER;	 Catch:{ Exception -> 0x0039 }
        r1 = r1.m3939b(r3, r2);	 Catch:{ Exception -> 0x0039 }
        r5 = r5.m3694e();	 Catch:{ Exception -> 0x0039 }
        r3 = com.foursquare.pilgrim.PilgrimBootService.EXTRA_CLEAR_MOTION_STATE;	 Catch:{ Exception -> 0x0039 }
        r5 = r5.m3939b(r3, r2);	 Catch:{ Exception -> 0x0039 }
        r2 = new com.foursquare.pilgrim.at;	 Catch:{ Exception -> 0x0039 }
        r3 = r4.getContext();	 Catch:{ Exception -> 0x0039 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x0039 }
        r2.m6972a(r1, r0, r5);	 Catch:{ Exception -> 0x0039 }
        r5 = com.evernote.android.job.Job.Result.SUCCESS;
        return r5;
    L_0x0039:
        r5 = com.evernote.android.job.Job.Result.RESCHEDULE;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.l.onRunJob(com.evernote.android.job.Job$a):com.evernote.android.job.Job$Result");
    }
}
