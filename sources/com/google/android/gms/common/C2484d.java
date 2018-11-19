package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.ad;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.d */
public final class C2484d implements ServiceConnection {
    /* renamed from: a */
    private boolean f7545a = false;
    /* renamed from: b */
    private final BlockingQueue<IBinder> f7546b = new LinkedBlockingQueue();

    /* renamed from: a */
    public final IBinder m9016a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        ad.m9057c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f7545a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f7545a = true;
        IBinder iBinder = (IBinder) this.f7546b.poll(10000, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7546b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
