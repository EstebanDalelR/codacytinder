package com.leanplum.callbacks;

public abstract class RegisterDeviceCallback$EmailCallback implements Runnable {
    /* renamed from: a */
    private String f21327a;

    public abstract void onResponse(String str);

    public void setResponseHandler(String str) {
        this.f21327a = str;
    }

    public void run() {
        onResponse(this.f21327a);
    }
}
