package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.concurrent.atomic.AtomicReference;

final class ac implements ConnectionCallbacks {
    /* renamed from: a */
    private /* synthetic */ AtomicReference f11904a;
    /* renamed from: b */
    private /* synthetic */ bp f11905b;
    /* renamed from: c */
    private /* synthetic */ aa f11906c;

    ac(aa aaVar, AtomicReference atomicReference, bp bpVar) {
        this.f11906c = aaVar;
        this.f11904a = atomicReference;
        this.f11905b = bpVar;
    }

    public final void onConnected(Bundle bundle) {
        this.f11906c.m14233a((GoogleApiClient) this.f11904a.get(), this.f11905b, true);
    }

    public final void onConnectionSuspended(int i) {
    }
}
