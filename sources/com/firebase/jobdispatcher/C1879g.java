package com.firebase.jobdispatcher;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

@TargetApi(21)
/* renamed from: com.firebase.jobdispatcher.g */
class C1879g extends Handler {
    /* renamed from: a */
    private final GooglePlayReceiver f5112a;

    public C1879g(Looper looper, GooglePlayReceiver googlePlayReceiver) {
        super(looper);
        this.f5112a = googlePlayReceiver;
    }

    public void handleMessage(android.os.Message r4) {
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
        r3 = this;
        if (r4 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r3.f5112a;
        r0 = r0.getApplicationContext();
        r1 = "appops";
        r0 = r0.getSystemService(r1);
        r0 = (android.app.AppOpsManager) r0;
        r1 = r4.sendingUid;	 Catch:{ SecurityException -> 0x003f }
        r2 = "com.google.android.gms";	 Catch:{ SecurityException -> 0x003f }
        r0.checkPackage(r1, r2);	 Catch:{ SecurityException -> 0x003f }
        r0 = r4.what;
        r1 = 4;
        if (r0 == r1) goto L_0x003e;
    L_0x001d:
        switch(r0) {
            case 1: goto L_0x003b;
            case 2: goto L_0x0037;
            default: goto L_0x0020;
        };
    L_0x0020:
        r0 = "FJD.GooglePlayReceiver";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unrecognized message received: ";
        r1.append(r2);
        r1.append(r4);
        r4 = r1.toString();
        android.util.Log.e(r0, r4);
        goto L_0x003e;
    L_0x0037:
        r3.m6602b(r4);
        goto L_0x003e;
    L_0x003b:
        r3.m6601a(r4);
    L_0x003e:
        return;
    L_0x003f:
        r4 = "FJD.GooglePlayReceiver";
        r0 = "Message was not sent from GCM.";
        android.util.Log.e(r4, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.g.handleMessage(android.os.Message):void");
    }

    /* renamed from: a */
    private void m6601a(Message message) {
        Bundle data = message.getData();
        message = message.replyTo;
        String string = data.getString("tag");
        if (message != null) {
            if (string != null) {
                this.f5112a.m13229a().m6585a(this.f5112a.m13231a(new C3489h(message, string), data));
                return;
            }
        }
        if (Log.isLoggable("FJD.GooglePlayReceiver", 3) != null) {
            Log.d("FJD.GooglePlayReceiver", "Invalid start execution message.");
        }
    }

    /* renamed from: b */
    private void m6602b(Message message) {
        message = GooglePlayReceiver.m13225b().m6611b(message.getData());
        if (message == null) {
            if (Log.isLoggable("FJD.GooglePlayReceiver", 3) != null) {
                Log.d("FJD.GooglePlayReceiver", "Invalid stop execution message.");
            }
            return;
        }
        C1876b.m6584a(message.m6630a(), true);
    }
}
