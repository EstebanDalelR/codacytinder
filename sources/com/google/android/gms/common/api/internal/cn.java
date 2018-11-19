package com.google.android.gms.common.api.internal;

import android.support.annotation.MainThread;
import com.google.android.gms.common.C3813b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

final class cn implements Runnable {
    /* renamed from: a */
    final /* synthetic */ cl f7532a;
    /* renamed from: b */
    private final cm f7533b;

    cn(cl clVar, cm cmVar) {
        this.f7532a = clVar;
        this.f7533b = cmVar;
    }

    @MainThread
    public final void run() {
        if (this.f7532a.f11965b) {
            ConnectionResult b = this.f7533b.m9003b();
            if (b.hasResolution()) {
                this.f7532a.a.startActivityForResult(GoogleApiActivity.m8851a(this.f7532a.m8917a(), b.getResolution(), this.f7533b.m9002a(), false), 1);
            } else if (this.f7532a.f11967d.mo2568a(b.getErrorCode())) {
                this.f7532a.f11967d.m14437a(this.f7532a.m8917a(), this.f7532a.a, b.getErrorCode(), 2, this.f7532a);
            } else if (b.getErrorCode() == 18) {
                C3813b.m14424a(this.f7532a.m8917a().getApplicationContext(), new co(this, C3813b.m14422a(this.f7532a.m8917a(), this.f7532a)));
            } else {
                this.f7532a.mo3572a(b, this.f7533b.m9002a());
            }
        }
    }
}
