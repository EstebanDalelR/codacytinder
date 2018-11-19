package com.google.android.gms.internal;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

final class ms extends mo {
    /* renamed from: a */
    private /* synthetic */ mr f28801a;

    ms(mr mrVar) {
        this.f28801a = mrVar;
    }

    public final void zza(Status status, Credential credential) {
        this.f28801a.a(new mp(status, credential));
    }

    public final void zze(Status status) {
        this.f28801a.a(mp.m31613a(status));
    }
}
