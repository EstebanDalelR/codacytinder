package com.leanplum.callbacks;

public abstract class RegisterDeviceFinishedCallback implements Runnable {
    /* renamed from: a */
    private boolean f8125a;

    public abstract void onResponse(boolean z);

    public void setSuccess(boolean z) {
        this.f8125a = z;
    }

    public void run() {
        onResponse(this.f8125a);
    }
}
