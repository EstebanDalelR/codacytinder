package com.evernote.android.job.p031b;

import android.annotation.TargetApi;
import android.app.job.JobInfo.Builder;
import android.content.Context;
import android.support.annotation.NonNull;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.JobRequest.NetworkType;
import com.evernote.android.job.v21.C3144a;

@TargetApi(24)
/* renamed from: com.evernote.android.job.b.a */
public class C4119a extends C3144a {

    /* renamed from: com.evernote.android.job.b.a$1 */
    static /* synthetic */ class C11321 {
        /* renamed from: a */
        static final /* synthetic */ int[] f2970a = new int[NetworkType.values().length];

        static {
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
            r0 = com.evernote.android.job.JobRequest.NetworkType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f2970a = r0;
            r0 = f2970a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.evernote.android.job.JobRequest.NetworkType.NOT_ROAMING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.b.a.1.<clinit>():void");
        }
    }

    public C4119a(Context context) {
        this(context, "JobProxy24");
    }

    public C4119a(Context context, String str) {
        super(context, str);
    }

    public void plantPeriodicFlexSupport(JobRequest jobRequest) {
        this.b.m12122c("plantPeriodicFlexSupport called although flex is supported");
        super.plantPeriodicFlexSupport(jobRequest);
    }

    public boolean isPlatformJobScheduled(JobRequest jobRequest) {
        try {
            return mo3693a(m12146a().getPendingJob(jobRequest.m3765c()), jobRequest);
        } catch (Throwable e) {
            this.b.m12117a(e);
            return null;
        }
    }

    /* renamed from: b */
    protected Builder mo3220b(Builder builder, long j, long j2) {
        return builder.setPeriodic(j, j2);
    }

    /* renamed from: a */
    protected int mo3219a(@NonNull NetworkType networkType) {
        return C11321.f2970a[networkType.ordinal()] != 1 ? super.mo3219a(networkType) : 3;
    }
}
