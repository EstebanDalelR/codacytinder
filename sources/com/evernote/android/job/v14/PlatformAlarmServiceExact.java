package com.evernote.android.job.v14;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import com.evernote.android.job.C1133b;
import com.evernote.android.job.JobProxy.C1127a;
import com.evernote.android.job.util.C3142c;
import java.util.HashSet;
import java.util.Set;

public final class PlatformAlarmServiceExact extends Service {
    /* renamed from: a */
    private static final C3142c f3039a = new C3142c("PlatformAlarmServiceExact");
    /* renamed from: b */
    private final Object f3040b = new Object();
    /* renamed from: c */
    private volatile Set<Integer> f3041c;
    /* renamed from: d */
    private volatile int f3042d;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: a */
    public static Intent m3941a(Context context, int i, @Nullable Bundle bundle) {
        Intent intent = new Intent(context, PlatformAlarmServiceExact.class);
        intent.putExtra("EXTRA_JOB_ID", i);
        if (bundle != null) {
            intent.putExtra("EXTRA_TRANSIENT_EXTRAS", bundle);
        }
        return intent;
    }

    public void onCreate() {
        super.onCreate();
        this.f3041c = new HashSet();
    }

    public int onStartCommand(@Nullable final Intent intent, int i, final int i2) {
        synchronized (this.f3040b) {
            this.f3041c.add(Integer.valueOf(i2));
            this.f3042d = i2;
        }
        C1133b.m3802h().execute(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ PlatformAlarmServiceExact f3038c;

            public void run() {
                try {
                    PlatformAlarmService.m12127a(intent, this.f3038c, PlatformAlarmServiceExact.f3039a);
                } finally {
                    C1127a.m3704a(intent);
                    this.f3038c.m3943a(i2);
                }
            }
        });
        return 2;
    }

    public void onDestroy() {
        synchronized (this.f3040b) {
            this.f3041c = null;
            this.f3042d = 0;
        }
    }

    /* renamed from: a */
    private void m3943a(int i) {
        synchronized (this.f3040b) {
            Set set = this.f3041c;
            if (set != null) {
                set.remove(Integer.valueOf(i));
                if (set.isEmpty() != 0) {
                    stopSelfResult(this.f3042d);
                }
            }
        }
    }
}
