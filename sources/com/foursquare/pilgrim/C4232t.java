package com.foursquare.pilgrim;

import android.support.annotation.WorkerThread;
import com.evernote.android.job.DailyJob;
import com.evernote.android.job.JobRequest.C1129a;
import com.foursquare.api.types.NotificationConfig;
import com.foursquare.api.types.PilgrimConfig;
import com.foursquare.internal.network.C1928e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.foursquare.pilgrim.t */
final class C4232t extends DailyJob {
    /* renamed from: a */
    private static final long f13528a = TimeUnit.HOURS.toMillis(3);
    /* renamed from: b */
    private static final int f13529b = ((int) TimeUnit.HOURS.toMillis(4));

    C4232t() {
    }

    /* renamed from: a */
    static int m16806a() {
        long a = (long) af.m6905a(0, f13529b);
        return DailyJob.schedule(new C1129a("EvernoteStillSailingDailyJob"), a, a + f13528a);
    }

    @android.support.annotation.NonNull
    protected com.evernote.android.job.DailyJob.DailyJobResult onRunDailyJob(@android.support.annotation.NonNull com.evernote.android.job.Job.C1125a r3) {
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
        r2 = this;
        r3 = com.foursquare.pilgrim.ax.m7003a();
        r3 = r3.m7047q();
        if (r3 != 0) goto L_0x000d;
    L_0x000a:
        r3 = com.evernote.android.job.DailyJob.DailyJobResult.SUCCESS;
        return r3;
    L_0x000d:
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0017 }
        com.foursquare.pilgrim.bh.m7121c(r0);	 Catch:{ Exception -> 0x0017 }
        r2.m16807b();	 Catch:{ Exception -> 0x0017 }
    L_0x0017:
        r3 = com.evernote.android.job.DailyJob.DailyJobResult.SUCCESS;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.t.onRunDailyJob(com.evernote.android.job.Job$a):com.evernote.android.job.DailyJob$DailyJobResult");
    }

    @WorkerThread
    /* renamed from: b */
    private void m16807b() {
        C3549d c3549d = (C3549d) C1928e.m6757a().m6763b(bf.m7089a().m7102e()).m6774c();
        if (c3549d != null) {
            PilgrimConfig c = c3549d.m13377c();
            if (c != null && ax.m7003a().m7027a(getContext(), c)) {
                aj.m6922a(getContext());
            }
            NotificationConfig d = c3549d.m13378d();
            if (d != null) {
                ag.m6911a(getContext()).m6913a(getContext(), d);
            }
        }
    }
}
