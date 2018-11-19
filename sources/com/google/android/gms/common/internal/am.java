package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.support.annotation.BinderThread;
import com.google.android.gms.common.ConnectionResult;

abstract class am extends ao<Boolean> {
    /* renamed from: a */
    private int f12052a;
    /* renamed from: b */
    private Bundle f12053b;
    /* renamed from: c */
    private /* synthetic */ al f12054c;

    @BinderThread
    protected am(al alVar, int i, Bundle bundle) {
        this.f12054c = alVar;
        super(alVar, Boolean.valueOf(true));
        this.f12052a = i;
        this.f12053b = bundle;
    }

    /* renamed from: a */
    protected abstract void mo3581a(ConnectionResult connectionResult);

    /* renamed from: a */
    protected final /* synthetic */ void mo2577a(Object obj) {
        PendingIntent pendingIntent = null;
        if (((Boolean) obj) == null) {
            this.f12054c.m9065a(1, null);
            return;
        }
        int i = this.f12052a;
        if (i == 0) {
            if (!mo3582a()) {
                this.f12054c.m9065a(1, null);
                mo3581a(new ConnectionResult(8, null));
            }
        } else if (i != 10) {
            this.f12054c.m9065a(1, null);
            if (this.f12053b != null) {
                pendingIntent = (PendingIntent) this.f12053b.getParcelable("pendingIntent");
            }
            mo3581a(new ConnectionResult(this.f12052a, pendingIntent));
        } else {
            this.f12054c.m9065a(1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
    }

    /* renamed from: a */
    protected abstract boolean mo3582a();
}
