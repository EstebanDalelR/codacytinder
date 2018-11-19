package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.C0562m;
import android.util.Log;
import com.firebase.jobdispatcher.C1876b.C1875a;
import com.firebase.jobdispatcher.C1885m.C3493a;
import com.firebase.jobdispatcher.C3491i.C3490a;
import com.firebase.jobdispatcher.C3492k.C1883a;

public class GooglePlayReceiver extends Service implements C1875a {
    /* renamed from: d */
    private static final C1881j f10513d = new C1881j("com.firebase.jobdispatcher.");
    /* renamed from: h */
    private static final C0562m<String, C0562m<String, JobCallback>> f10514h = new C0562m(1);
    @VisibleForTesting
    /* renamed from: a */
    Messenger f10515a;
    @VisibleForTesting
    /* renamed from: b */
    Driver f10516b;
    @VisibleForTesting
    /* renamed from: c */
    ValidationEnforcer f10517c;
    /* renamed from: e */
    private final C1877c f10518e = new C1877c();
    /* renamed from: f */
    private C1876b f10519f;
    /* renamed from: g */
    private int f10520g;

    /* renamed from: a */
    private static void m13221a(JobCallback jobCallback, int i) {
        try {
            jobCallback.jobFinished(i);
        } catch (JobCallback jobCallback2) {
            Log.e("FJD.GooglePlayReceiver", "Encountered error running callback", jobCallback2.getCause());
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            super.onStartCommand(intent, i, i2);
            if (intent == null) {
                Log.w("FJD.GooglePlayReceiver", "Null Intent passed, terminating");
                synchronized (f10514h) {
                    this.f10520g = i2;
                    if (f10514h.isEmpty() != 0) {
                        stopSelf(this.f10520g);
                    }
                }
                return 2;
            }
            String action = intent.getAction();
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                m13229a().m6585a(m13230a(intent));
                synchronized (f10514h) {
                    this.f10520g = i2;
                    if (f10514h.isEmpty() != 0) {
                        stopSelf(this.f10520g);
                    }
                }
                return 2;
            } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action) != null) {
                synchronized (f10514h) {
                    this.f10520g = i2;
                    if (f10514h.isEmpty() != 0) {
                        stopSelf(this.f10520g);
                    }
                }
                return 2;
            } else {
                Log.e("FJD.GooglePlayReceiver", "Unknown action received, terminating");
                synchronized (f10514h) {
                    this.f10520g = i2;
                    if (f10514h.isEmpty() != 0) {
                        stopSelf(this.f10520g);
                    }
                }
                return 2;
            }
        } catch (Throwable th) {
            synchronized (f10514h) {
                this.f10520g = i2;
                if (f10514h.isEmpty() != 0) {
                    stopSelf(this.f10520g);
                }
            }
        }
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        if (intent != null && VERSION.SDK_INT >= 21) {
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction()) != null) {
                return m13226c().getBinder();
            }
        }
        return null;
    }

    /* renamed from: c */
    private synchronized Messenger m13226c() {
        if (this.f10515a == null) {
            this.f10515a = new Messenger(new C1879g(Looper.getMainLooper(), this));
        }
        return this.f10515a;
    }

    /* renamed from: a */
    synchronized C1876b m13229a() {
        if (this.f10519f == null) {
            this.f10519f = new C1876b(this, this);
        }
        return this.f10519f;
    }

    @NonNull
    /* renamed from: d */
    private synchronized Driver m13227d() {
        if (this.f10516b == null) {
            this.f10516b = new C3487d(getApplicationContext());
        }
        return this.f10516b;
    }

    @NonNull
    /* renamed from: e */
    private synchronized ValidationEnforcer m13228e() {
        if (this.f10517c == null) {
            this.f10517c = new ValidationEnforcer(m13227d().getValidator());
        }
        return this.f10517c;
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: a */
    C3492k m13230a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.e("FJD.GooglePlayReceiver", "No data provided, terminating");
            return null;
        }
        intent = this.f10518e.m6591a(extras);
        if (intent != null) {
            return m13231a((JobCallback) intent.first, (Bundle) intent.second);
        }
        Log.i("FJD.GooglePlayReceiver", "no callback found");
        return null;
    }

    @Nullable
    /* renamed from: a */
    C3492k m13231a(JobCallback jobCallback, Bundle bundle) {
        bundle = f10513d.m6610a(bundle);
        if (bundle == null) {
            Log.e("FJD.GooglePlayReceiver", "unable to decode job");
            m13221a(jobCallback, 2);
            return null;
        }
        synchronized (f10514h) {
            C0562m c0562m = (C0562m) f10514h.get(bundle.getService());
            if (c0562m == null) {
                c0562m = new C0562m(1);
                f10514h.put(bundle.getService(), c0562m);
            }
            c0562m.put(bundle.getTag(), jobCallback);
        }
        return bundle;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo1908a(@android.support.annotation.NonNull com.firebase.jobdispatcher.C3492k r6, int r7) {
        /*
        r5 = this;
        r0 = f10514h;
        monitor-enter(r0);
        r1 = f10514h;	 Catch:{ all -> 0x0091 }
        r2 = r6.getService();	 Catch:{ all -> 0x0091 }
        r1 = r1.get(r2);	 Catch:{ all -> 0x0091 }
        r1 = (android.support.v4.util.C0562m) r1;	 Catch:{ all -> 0x0091 }
        if (r1 != 0) goto L_0x0020;
    L_0x0011:
        r6 = f10514h;	 Catch:{ all -> 0x00a0 }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x00a0 }
        if (r6 == 0) goto L_0x001e;
    L_0x0019:
        r6 = r5.f10520g;	 Catch:{ all -> 0x00a0 }
        r5.stopSelf(r6);	 Catch:{ all -> 0x00a0 }
    L_0x001e:
        monitor-exit(r0);	 Catch:{ all -> 0x00a0 }
        return;
    L_0x0020:
        r2 = r6.getTag();	 Catch:{ all -> 0x0091 }
        r2 = r1.remove(r2);	 Catch:{ all -> 0x0091 }
        r2 = (com.firebase.jobdispatcher.JobCallback) r2;	 Catch:{ all -> 0x0091 }
        if (r2 != 0) goto L_0x003b;
    L_0x002c:
        r6 = f10514h;	 Catch:{ all -> 0x00a0 }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x00a0 }
        if (r6 == 0) goto L_0x0039;
    L_0x0034:
        r6 = r5.f10520g;	 Catch:{ all -> 0x00a0 }
        r5.stopSelf(r6);	 Catch:{ all -> 0x00a0 }
    L_0x0039:
        monitor-exit(r0);	 Catch:{ all -> 0x00a0 }
        return;
    L_0x003b:
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0091 }
        if (r1 == 0) goto L_0x004a;
    L_0x0041:
        r1 = f10514h;	 Catch:{ all -> 0x0091 }
        r3 = r6.getService();	 Catch:{ all -> 0x0091 }
        r1.remove(r3);	 Catch:{ all -> 0x0091 }
    L_0x004a:
        r1 = m13224a(r6, r7);	 Catch:{ all -> 0x0091 }
        if (r1 == 0) goto L_0x0054;
    L_0x0050:
        r5.m13223a(r6);	 Catch:{ all -> 0x0091 }
        goto L_0x0082;
    L_0x0054:
        r1 = "FJD.GooglePlayReceiver";
        r3 = 2;
        r1 = android.util.Log.isLoggable(r1, r3);	 Catch:{ all -> 0x0091 }
        if (r1 == 0) goto L_0x007f;
    L_0x005d:
        r1 = "FJD.GooglePlayReceiver";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0091 }
        r3.<init>();	 Catch:{ all -> 0x0091 }
        r4 = "sending jobFinished for ";
        r3.append(r4);	 Catch:{ all -> 0x0091 }
        r6 = r6.getTag();	 Catch:{ all -> 0x0091 }
        r3.append(r6);	 Catch:{ all -> 0x0091 }
        r6 = " = ";
        r3.append(r6);	 Catch:{ all -> 0x0091 }
        r3.append(r7);	 Catch:{ all -> 0x0091 }
        r6 = r3.toString();	 Catch:{ all -> 0x0091 }
        android.util.Log.v(r1, r6);	 Catch:{ all -> 0x0091 }
    L_0x007f:
        m13221a(r2, r7);	 Catch:{ all -> 0x0091 }
    L_0x0082:
        r6 = f10514h;	 Catch:{ all -> 0x00a0 }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x00a0 }
        if (r6 == 0) goto L_0x008f;
    L_0x008a:
        r6 = r5.f10520g;	 Catch:{ all -> 0x00a0 }
        r5.stopSelf(r6);	 Catch:{ all -> 0x00a0 }
    L_0x008f:
        monitor-exit(r0);	 Catch:{ all -> 0x00a0 }
        return;
    L_0x0091:
        r6 = move-exception;
        r7 = f10514h;	 Catch:{ all -> 0x00a0 }
        r7 = r7.isEmpty();	 Catch:{ all -> 0x00a0 }
        if (r7 == 0) goto L_0x009f;
    L_0x009a:
        r7 = r5.f10520g;	 Catch:{ all -> 0x00a0 }
        r5.stopSelf(r7);	 Catch:{ all -> 0x00a0 }
    L_0x009f:
        throw r6;	 Catch:{ all -> 0x00a0 }
    L_0x00a0:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00a0 }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.GooglePlayReceiver.a(com.firebase.jobdispatcher.k, int):void");
    }

    /* renamed from: a */
    private void m13223a(C3492k c3492k) {
        m13227d().schedule(new C3490a(m13228e(), c3492k).m13268a(true).m13270a());
    }

    /* renamed from: a */
    private static boolean m13224a(JobParameters jobParameters, int i) {
        if (!jobParameters.isRecurring() || (jobParameters.getTrigger() instanceof C3493a) == null || i == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static C1881j m13225b() {
        return f10513d;
    }

    /* renamed from: a */
    static void m13222a(C3491i c3491i) {
        synchronized (f10514h) {
            C0562m c0562m = (C0562m) f10514h.get(c3491i.getService());
            if (c0562m == null) {
            } else if (((JobCallback) c0562m.get(c3491i.getTag())) == null) {
            } else {
                C1876b.m6584a(new C1883a().m6627a(c3491i.getTag()).m6631b(c3491i.getService()).m6625a(c3491i.getTrigger()).m6630a(), false);
            }
        }
    }
}
