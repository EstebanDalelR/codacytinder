package com.evernote.android.job.p032c;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.JobRequest.NetworkType;
import com.evernote.android.job.p031b.C4119a;

@TargetApi(26)
/* renamed from: com.evernote.android.job.c.a */
public class C4333a extends C4119a {

    /* renamed from: com.evernote.android.job.c.a$1 */
    static /* synthetic */ class C11341 {
        /* renamed from: a */
        static final /* synthetic */ int[] f2982a = new int[NetworkType.values().length];

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
            f2982a = r0;
            r0 = f2982a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.evernote.android.job.JobRequest.NetworkType.METERED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.c.a.1.<clinit>():void");
        }
    }

    public C4333a(Context context) {
        super(context, "JobProxy26");
    }

    /* renamed from: a */
    protected Builder mo3691a(JobRequest jobRequest, Builder builder) {
        return builder.setTransientExtras(jobRequest.m3755C());
    }

    /* renamed from: a */
    protected boolean mo3693a(@Nullable JobInfo jobInfo, @NonNull JobRequest jobRequest) {
        return (jobInfo == null || jobInfo.getId() != jobRequest.m3765c()) ? null : true;
    }

    /* renamed from: a */
    protected Builder mo3692a(JobRequest jobRequest, boolean z) {
        return super.mo3692a(jobRequest, z).setRequiresBatteryNotLow(jobRequest.m3777o()).setRequiresStorageNotLow(jobRequest.m3778p());
    }

    /* renamed from: a */
    protected int mo3219a(@NonNull NetworkType networkType) {
        return C11341.f2982a[networkType.ordinal()] != 1 ? super.mo3219a(networkType) : 4;
    }
}
