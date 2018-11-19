package com.foursquare.pilgrim;

import android.content.Context;
import android.support.annotation.WorkerThread;
import android.util.Pair;
import com.evernote.android.job.Job;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.JobRequest.C1129a;
import com.evernote.android.job.JobRequest.NetworkType;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.pilgrim.C1991w.C1987a;
import com.foursquare.pilgrim.C1991w.C1988b;
import com.foursquare.pilgrim.C1991w.C1989c;
import com.foursquare.pilgrim.C1991w.C1990d;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.util.List;

/* renamed from: com.foursquare.pilgrim.m */
class C3561m extends Job {

    /* renamed from: com.foursquare.pilgrim.m$1 */
    class C35571 implements C1988b {
        C35571() {
        }

        /* renamed from: a */
        public List<Pair<CurrentPlace, FoursquareLocation>> mo2060a() {
            return C3570x.m13419a();
        }

        /* renamed from: a */
        public void mo2061a(long j) {
            C3570x.m13420a(j);
        }

        /* renamed from: b */
        public void mo2062b() {
            C3570x.m13422b();
        }
    }

    /* renamed from: com.foursquare.pilgrim.m$2 */
    class C35582 implements C1990d {
        /* renamed from: a */
        final /* synthetic */ Context f10656a;

        C35582(Context context) {
            this.f10656a = context;
        }

        /* renamed from: a */
        public List<ai> mo2063a() {
            return bb.m7071a(this.f10656a);
        }
    }

    /* renamed from: com.foursquare.pilgrim.m$3 */
    class C35593 implements C1987a {
        /* renamed from: a */
        final /* synthetic */ Context f10657a;

        C35593(Context context) {
            this.f10657a = context;
        }

        /* renamed from: a */
        public void mo2064a(PilgrimSdkBackfillNotification pilgrimSdkBackfillNotification) {
            PilgrimSdk.get().f5255c.m6997f().handleBackfillNotification(this.f10657a, pilgrimSdkBackfillNotification);
        }
    }

    /* renamed from: com.foursquare.pilgrim.m$4 */
    class C35604 implements C1989c {
        C35604() {
        }

        /* renamed from: a */
        public void mo2065a(LogLevel logLevel, String str) {
            PilgrimSdk.get().log(logLevel, str);
        }
    }

    C3561m() {
    }

    /* renamed from: a */
    static JobRequest m13410a() {
        return new C1129a("EvernoteFailedVisitJob").m3743b((long) an.f5302a).m3740a(NetworkType.CONNECTED).m3742a(true).m3746b(true).m3747b();
    }

    @android.support.annotation.NonNull
    protected com.evernote.android.job.Job.Result onRunJob(@android.support.annotation.NonNull com.evernote.android.job.Job.C1125a r1) {
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
        r0 = this;
        r1 = r0.getContext();	 Catch:{ Exception -> 0x0007 }
        com.foursquare.pilgrim.C3561m.m13411a(r1);	 Catch:{ Exception -> 0x0007 }
    L_0x0007:
        r1 = com.evernote.android.job.Job.Result.SUCCESS;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.m.onRunJob(com.evernote.android.job.Job$a):com.evernote.android.job.Job$Result");
    }

    @WorkerThread
    /* renamed from: a */
    private static void m13411a(Context context) {
        if (!ap.m6951a()) {
            String id;
            boolean isLimitAdTrackingEnabled;
            Info b = al.m6934b(context);
            if (b != null) {
                id = b.getId();
                isLimitAdTrackingEnabled = b.isLimitAdTrackingEnabled();
            } else {
                id = null;
                isLimitAdTrackingEnabled = false;
            }
            new C1991w(id, isLimitAdTrackingEnabled, new C35571(), new C35582(context), PilgrimSdk.get().f5254b, new C35593(context), new C35604(), new RealExceptionReporter()).m7174a();
        }
    }
}
