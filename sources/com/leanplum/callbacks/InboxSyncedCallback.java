package com.leanplum.callbacks;

public abstract class InboxSyncedCallback implements Runnable {
    /* renamed from: a */
    private boolean f21326a;

    public abstract void onForceContentUpdate(boolean z);

    public void setSuccess(boolean z) {
        this.f21326a = z;
    }

    public void run() {
        onForceContentUpdate(this.f21326a);
    }
}
