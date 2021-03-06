package com.google.android.gms.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.google.android.gms.internal.zzcxs;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzb extends Service {
    private final Object mLock = new Object();
    @VisibleForTesting
    final ExecutorService zzieo = Executors.newSingleThreadExecutor();
    private Binder zziep;
    private int zzieq;
    private int zzier = 0;

    private final void zzh(Intent intent) {
        if (intent != null) {
            zzcxs.completeWakefulIntent(intent);
        }
        synchronized (this.mLock) {
            this.zzier--;
            if (this.zzier == 0) {
                stopSelfResult(this.zzieq);
            }
        }
    }

    public abstract void handleIntent(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.zziep == null) {
            this.zziep = new C2558f(this);
        }
        return this.zziep;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.mLock) {
            this.zzieq = i2;
            this.zzier++;
        }
        if (intent == null) {
            zzh(intent);
            return 2;
        }
        this.zzieo.execute(new C2555c(this, intent, intent));
        return 3;
    }
}
