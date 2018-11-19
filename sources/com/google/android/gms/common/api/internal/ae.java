package com.google.android.gms.common.api.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.C2457v;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

final class ae implements ResultCallback<Status> {
    /* renamed from: a */
    private /* synthetic */ bp f11908a;
    /* renamed from: b */
    private /* synthetic */ boolean f11909b;
    /* renamed from: c */
    private /* synthetic */ GoogleApiClient f11910c;
    /* renamed from: d */
    private /* synthetic */ aa f11911d;

    ae(aa aaVar, bp bpVar, boolean z, GoogleApiClient googleApiClient) {
        this.f11911d = aaVar;
        this.f11908a = bpVar;
        this.f11909b = z;
        this.f11910c = googleApiClient;
    }

    public final /* synthetic */ void onResult(@NonNull Result result) {
        result = (Status) result;
        C2457v.m8829a(this.f11911d.f11888k).m8838c();
        if (result.isSuccess() && this.f11911d.mo2509j()) {
            this.f11911d.mo2507h();
        }
        this.f11908a.m14223a(result);
        if (this.f11909b) {
            this.f11910c.mo2506g();
        }
    }
}
