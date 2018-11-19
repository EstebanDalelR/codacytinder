package com.leanplum.callbacks;

public abstract class StartCallback implements Runnable {
    /* renamed from: a */
    private boolean f8126a;

    public abstract void onResponse(boolean z);

    public void setSuccess(boolean z) {
        this.f8126a = z;
    }

    public void run() {
        onResponse(this.f8126a);
    }
}
