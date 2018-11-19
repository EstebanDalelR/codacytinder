package com.firebase.jobdispatcher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.util.C0562m;
import android.util.Log;
import com.firebase.jobdispatcher.IJobCallback.C3483a;

/* renamed from: com.firebase.jobdispatcher.b */
class C1876b {
    /* renamed from: a */
    private static final C0562m<String, C1884l> f5106a = new C0562m();
    /* renamed from: b */
    private final IJobCallback f5107b = new C42281(this);
    /* renamed from: c */
    private final Context f5108c;
    /* renamed from: d */
    private final C1875a f5109d;

    /* renamed from: com.firebase.jobdispatcher.b$a */
    interface C1875a {
        /* renamed from: a */
        void mo1908a(@NonNull C3492k c3492k, int i);
    }

    /* renamed from: com.firebase.jobdispatcher.b$1 */
    class C42281 extends C3483a {
        /* renamed from: a */
        final /* synthetic */ C1876b f13508a;

        C42281(C1876b c1876b) {
            this.f13508a = c1876b;
        }

        public void jobFinished(Bundle bundle, int i) {
            bundle = GooglePlayReceiver.m13225b().m6611b(bundle);
            if (bundle == null) {
                Log.wtf("FJD.ExternalReceiver", "jobFinished: unknown invocation provided");
            } else {
                this.f13508a.m6583a((C3492k) bundle.m6630a(), i);
            }
        }
    }

    C1876b(Context context, C1875a c1875a) {
        this.f5108c = context;
        this.f5109d = c1875a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    void m6585a(com.firebase.jobdispatcher.C3492k r6) {
        /*
        r5 = this;
        if (r6 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = f5106a;
        monitor-enter(r0);
        r1 = f5106a;	 Catch:{ all -> 0x006c }
        r2 = r6.getService();	 Catch:{ all -> 0x006c }
        r1 = r1.get(r2);	 Catch:{ all -> 0x006c }
        r1 = (com.firebase.jobdispatcher.C1884l) r1;	 Catch:{ all -> 0x006c }
        if (r1 == 0) goto L_0x0028;
    L_0x0014:
        r2 = r1.m6637a();	 Catch:{ all -> 0x006c }
        if (r2 != 0) goto L_0x0028;
    L_0x001a:
        r2 = r1.m6641c(r6);	 Catch:{ all -> 0x006c }
        if (r2 == 0) goto L_0x003a;
    L_0x0020:
        r2 = r1.m6638b();	 Catch:{ all -> 0x006c }
        if (r2 != 0) goto L_0x003a;
    L_0x0026:
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        return;
    L_0x0028:
        r1 = new com.firebase.jobdispatcher.l;	 Catch:{ all -> 0x006c }
        r2 = r5.f5107b;	 Catch:{ all -> 0x006c }
        r3 = r5.f5108c;	 Catch:{ all -> 0x006c }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x006c }
        r2 = f5106a;	 Catch:{ all -> 0x006c }
        r3 = r6.getService();	 Catch:{ all -> 0x006c }
        r2.put(r3, r1);	 Catch:{ all -> 0x006c }
    L_0x003a:
        r2 = r1.m6639b(r6);	 Catch:{ all -> 0x006c }
        if (r2 != 0) goto L_0x006a;
    L_0x0040:
        r2 = r5.f5108c;	 Catch:{ all -> 0x006c }
        r3 = r5.m6581a(r6);	 Catch:{ all -> 0x006c }
        r4 = 1;
        r2 = r2.bindService(r3, r1, r4);	 Catch:{ all -> 0x006c }
        if (r2 != 0) goto L_0x006a;
    L_0x004d:
        r2 = "FJD.ExternalReceiver";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x006c }
        r3.<init>();	 Catch:{ all -> 0x006c }
        r4 = "Unable to bind to ";
        r3.append(r4);	 Catch:{ all -> 0x006c }
        r6 = r6.getService();	 Catch:{ all -> 0x006c }
        r3.append(r6);	 Catch:{ all -> 0x006c }
        r6 = r3.toString();	 Catch:{ all -> 0x006c }
        android.util.Log.e(r2, r6);	 Catch:{ all -> 0x006c }
        r1.m6640c();	 Catch:{ all -> 0x006c }
    L_0x006a:
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        return;
    L_0x006c:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.k):void");
    }

    @NonNull
    /* renamed from: a */
    private Intent m6581a(JobParameters jobParameters) {
        Intent intent = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
        intent.setClassName(this.f5108c, jobParameters.getService());
        return intent;
    }

    /* renamed from: a */
    static void m6584a(C3492k c3492k, boolean z) {
        synchronized (f5106a) {
            C1884l c1884l = (C1884l) f5106a.get(c3492k.getService());
            if (c1884l != null) {
                c1884l.m6636a(c3492k, z);
                if (c1884l.m6637a()) {
                    f5106a.remove(c3492k.getService());
                }
            }
        }
    }

    /* renamed from: a */
    private void m6583a(C3492k c3492k, int i) {
        synchronized (f5106a) {
            C1884l c1884l = (C1884l) f5106a.get(c3492k.getService());
            if (c1884l != null) {
                c1884l.m6635a(c3492k);
                if (c1884l.m6637a()) {
                    f5106a.remove(c3492k.getService());
                }
            }
        }
        this.f5109d.mo1908a(c3492k, i);
    }
}
