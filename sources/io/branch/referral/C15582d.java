package io.branch.referral;

import android.os.AsyncTask;

/* renamed from: io.branch.referral.d */
public abstract class C15582d<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    /* renamed from: a */
    public android.os.AsyncTask<Params, Progress, Result> m58328a(Params... r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x0012;
    L_0x0006:
        r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR;	 Catch:{ Throwable -> 0x000d }
        r0 = r2.executeOnExecutor(r0, r3);	 Catch:{ Throwable -> 0x000d }
        return r0;
    L_0x000d:
        r3 = r2.execute(r3);
        return r3;
    L_0x0012:
        r3 = r2.execute(r3);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.d.a(java.lang.Object[]):android.os.AsyncTask<Params, Progress, Result>");
    }
}
