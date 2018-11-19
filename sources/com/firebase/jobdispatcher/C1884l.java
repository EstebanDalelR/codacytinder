package com.firebase.jobdispatcher;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.firebase.jobdispatcher.IRemoteJobService.C3485a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

@VisibleForTesting
/* renamed from: com.firebase.jobdispatcher.l */
class C1884l implements ServiceConnection {
    /* renamed from: a */
    private final Map<C3492k, Boolean> f5124a = new HashMap();
    /* renamed from: b */
    private final IJobCallback f5125b;
    /* renamed from: c */
    private final Context f5126c;
    /* renamed from: d */
    private boolean f5127d = false;
    /* renamed from: e */
    private IRemoteJobService f5128e;

    C1884l(IJobCallback iJobCallback, Context context) {
        this.f5125b = iJobCallback;
        this.f5126c = context;
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (m6637a() != null) {
            Log.w("FJD.ExternalReceiver", "Connection have been used already.");
            return;
        }
        this.f5128e = C3485a.m13234a(iBinder);
        ComponentName<C3492k> hashSet = new HashSet();
        for (Entry entry : this.f5124a.entrySet()) {
            if (Boolean.FALSE.equals(entry.getValue())) {
                try {
                    this.f5128e.start(C1884l.m6633a((JobParameters) entry.getKey()), this.f5125b);
                    hashSet.add(entry.getKey());
                } catch (ComponentName componentName2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to start job ");
                    stringBuilder.append(entry.getKey());
                    Log.e("FJD.ExternalReceiver", stringBuilder.toString(), componentName2);
                    m6640c();
                    return;
                }
            }
        }
        for (C3492k put : hashSet) {
            this.f5124a.put(put, Boolean.valueOf(true));
        }
    }

    public synchronized void onServiceDisconnected(ComponentName componentName) {
        m6640c();
    }

    /* renamed from: a */
    synchronized boolean m6637a() {
        return this.f5127d;
    }

    /* renamed from: b */
    synchronized boolean m6638b() {
        return this.f5128e != null;
    }

    /* renamed from: a */
    synchronized void m6636a(C3492k c3492k, boolean z) {
        if (m6637a()) {
            Log.w("FJD.ExternalReceiver", "Can't send stop request because service was unbound.");
        } else {
            if (Boolean.TRUE.equals(this.f5124a.remove(c3492k)) && m6638b()) {
                m6634a(z, c3492k);
            }
            if (!(z || this.f5124a.isEmpty() == null)) {
                m6640c();
            }
        }
    }

    /* renamed from: a */
    private synchronized void m6634a(boolean z, C3492k c3492k) {
        try {
            this.f5128e.stop(C1884l.m6633a((JobParameters) c3492k), z);
        } catch (boolean z2) {
            Log.e("FJD.ExternalReceiver", "Failed to stop a job", z2);
            m6640c();
        }
        return;
    }

    /* renamed from: c */
    synchronized void m6640c() {
        if (!m6637a()) {
            this.f5128e = null;
            this.f5127d = true;
            try {
                this.f5126c.unbindService(this);
            } catch (IllegalArgumentException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error unbinding service: ");
                stringBuilder.append(e.getMessage());
                Log.w("FJD.ExternalReceiver", stringBuilder.toString());
            }
        }
        return;
    }

    /* renamed from: a */
    synchronized void m6635a(C3492k c3492k) {
        this.f5124a.remove(c3492k);
        if (this.f5124a.isEmpty() != null) {
            m6640c();
        }
    }

    /* renamed from: b */
    synchronized boolean m6639b(C3492k c3492k) {
        boolean b;
        b = m6638b();
        if (b) {
            if (Boolean.TRUE.equals((Boolean) this.f5124a.get(c3492k))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Received an execution request for already running job ");
                stringBuilder.append(c3492k);
                Log.w("FJD.ExternalReceiver", stringBuilder.toString());
                m6634a(false, c3492k);
            }
            try {
                this.f5128e.start(C1884l.m6633a((JobParameters) c3492k), this.f5125b);
            } catch (Throwable e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to start the job ");
                stringBuilder.append(c3492k);
                Log.e("FJD.ExternalReceiver", stringBuilder.toString(), e);
                m6640c();
                return false;
            }
        }
        this.f5124a.put(c3492k, Boolean.valueOf(b));
        return b;
    }

    /* renamed from: a */
    private static Bundle m6633a(JobParameters jobParameters) {
        return GooglePlayReceiver.m13225b().m6609a(jobParameters, new Bundle());
    }

    @VisibleForTesting
    /* renamed from: c */
    synchronized boolean m6641c(C3492k c3492k) {
        return this.f5124a.containsKey(c3492k);
    }
}
