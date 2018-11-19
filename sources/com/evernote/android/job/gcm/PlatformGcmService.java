package com.evernote.android.job.gcm;

import android.app.Service;
import com.evernote.android.job.Job.Result;
import com.evernote.android.job.JobProxy.C1127a;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.C3142c;
import com.google.android.gms.gcm.C2546c;
import com.google.android.gms.gcm.GcmTaskService;

public class PlatformGcmService extends GcmTaskService {
    /* renamed from: a */
    private static final C3142c f9684a = new C3142c("PlatformGcmService");

    /* renamed from: a */
    public int mo1535a(C2546c c2546c) {
        C1127a c1127a = new C1127a((Service) this, f9684a, Integer.parseInt(c2546c.m9277a()));
        JobRequest a = c1127a.m3713a(true, true);
        if (a == null) {
            return 2;
        }
        if (Result.SUCCESS.equals(c1127a.m3712a(a, c2546c.m9278b())) != null) {
            return null;
        }
        return 2;
    }

    /* renamed from: a */
    public void mo1536a() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        super.mo1536a();
        r0 = r1.getApplicationContext();	 Catch:{ JobManagerCreateException -> 0x000a }
        com.evernote.android.job.C1139e.m3820a(r0);	 Catch:{ JobManagerCreateException -> 0x000a }
    L_0x000a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.gcm.PlatformGcmService.a():void");
    }
}
