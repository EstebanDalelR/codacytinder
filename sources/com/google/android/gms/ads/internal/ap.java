package com.google.android.gms.ads.internal;

import android.os.AsyncTask;

final class ap extends AsyncTask<Void, Void, String> {
    /* renamed from: a */
    private /* synthetic */ al f7108a;

    private ap(al alVar) {
        this.f7108a = alVar;
    }

    /* renamed from: a */
    private final java.lang.String m8634a(java.lang.Void... r5) {
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
        r4 = this;
        r5 = r4.f7108a;	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        r0 = r4.f7108a;	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        r0 = r0.f13849c;	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        r1 = com.google.android.gms.internal.alo.cj;	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        r2 = com.google.android.gms.internal.aja.f();	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        r1 = r2.a(r1);	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        r1 = (java.lang.Long) r1;	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        r1 = r1.longValue();	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        r0 = r0.get(r1, r3);	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        r0 = (com.google.android.gms.internal.tb) r0;	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        r5.f13854h = r0;	 Catch:{ InterruptedException -> 0x002a, InterruptedException -> 0x002a, TimeoutException -> 0x0024 }
        goto L_0x0030;
    L_0x0024:
        r5 = "Timed out waiting for ad data";
        com.google.android.gms.internal.ec.e(r5);
        goto L_0x0030;
    L_0x002a:
        r5 = move-exception;
        r0 = "Failed to load ad data";
        com.google.android.gms.internal.ec.c(r0, r5);
    L_0x0030:
        r5 = r4.f7108a;
        r5 = r5.m17116a();
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ap.a(java.lang.Void[]):java.lang.String");
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m8634a((Void[]) objArr);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f7108a.f13852f != null && str != null) {
            this.f7108a.f13852f.loadUrl(str);
        }
    }
}
