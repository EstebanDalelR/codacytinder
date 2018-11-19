package io.fabric.sdk.android.services.common;

import android.os.Process;

/* renamed from: io.fabric.sdk.android.services.common.g */
public abstract class C15623g implements Runnable {
    protected abstract void onRun();

    public final void run() {
        Process.setThreadPriority(10);
        onRun();
    }
}
