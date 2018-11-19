package com.google.android.gms.internal;

import android.content.DialogInterface.OnClickListener;

final class atp implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ String f15715a;
    /* renamed from: b */
    private /* synthetic */ String f15716b;
    /* renamed from: c */
    private /* synthetic */ ato f15717c;

    atp(ato ato, String str, String str2) {
        this.f15717c = ato;
        this.f15715a = str;
        this.f15716b = str2;
    }

    public final void onClick(android.content.DialogInterface r3, int r4) {
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
        r2 = this;
        r3 = r2.f15717c;
        r3 = r3.f23149b;
        r4 = "download";
        r3 = r3.getSystemService(r4);
        r3 = (android.app.DownloadManager) r3;
        r4 = r2.f15715a;	 Catch:{ IllegalStateException -> 0x002b }
        r0 = r2.f15716b;	 Catch:{ IllegalStateException -> 0x002b }
        r1 = new android.app.DownloadManager$Request;	 Catch:{ IllegalStateException -> 0x002b }
        r4 = android.net.Uri.parse(r4);	 Catch:{ IllegalStateException -> 0x002b }
        r1.<init>(r4);	 Catch:{ IllegalStateException -> 0x002b }
        r4 = android.os.Environment.DIRECTORY_PICTURES;	 Catch:{ IllegalStateException -> 0x002b }
        r1.setDestinationInExternalPublicDir(r4, r0);	 Catch:{ IllegalStateException -> 0x002b }
        r4 = com.google.android.gms.ads.internal.ar.g();	 Catch:{ IllegalStateException -> 0x002b }
        r4.mo4620a(r1);	 Catch:{ IllegalStateException -> 0x002b }
        r3.enqueue(r1);	 Catch:{ IllegalStateException -> 0x002b }
        return;
    L_0x002b:
        r3 = r2.f15717c;
        r4 = "Could not store picture.";
        r3.m19488a(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atp.onClick(android.content.DialogInterface, int):void");
    }
}
