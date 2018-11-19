package com.leanplum.callbacks;

public abstract class RegisterDeviceCallback implements Runnable {
    /* renamed from: a */
    private RegisterDeviceCallback$EmailCallback f8124a;

    public abstract void onResponse(RegisterDeviceCallback$EmailCallback registerDeviceCallback$EmailCallback);

    public void setResponseHandler(RegisterDeviceCallback$EmailCallback registerDeviceCallback$EmailCallback) {
        this.f8124a = registerDeviceCallback$EmailCallback;
    }

    public void run() {
        onResponse(this.f8124a);
    }
}
