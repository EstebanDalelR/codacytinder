package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.MainThread;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    /* renamed from: a */
    protected final zzcf f7453a;

    protected LifecycleCallback(zzcf zzcf) {
        this.f7453a = zzcf;
    }

    /* renamed from: a */
    protected static zzcf m8916a(ay ayVar) {
        if (ayVar.m8967a()) {
            return bq.m17223a(ayVar.m8970d());
        }
        if (ayVar.m8968b()) {
            return az.m14277a(ayVar.m8969c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static zzcf getChimeraLifecycleFragmentImpl(ay ayVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public final Activity m8917a() {
        return this.f7453a.zzajn();
    }

    @MainThread
    /* renamed from: a */
    public void mo2547a(int i, int i2, Intent intent) {
    }

    @MainThread
    /* renamed from: a */
    public void mo2548a(Bundle bundle) {
    }

    @MainThread
    /* renamed from: a */
    public void mo3573a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @MainThread
    /* renamed from: b */
    public void mo2549b() {
    }

    @MainThread
    /* renamed from: b */
    public void mo2550b(Bundle bundle) {
    }

    @MainThread
    /* renamed from: c */
    public void mo3578c() {
    }

    @MainThread
    /* renamed from: d */
    public void mo2551d() {
    }

    @MainThread
    /* renamed from: e */
    public void m8925e() {
    }
}
