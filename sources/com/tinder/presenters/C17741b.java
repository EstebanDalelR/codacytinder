package com.tinder.presenters;

import android.support.annotation.NonNull;
import com.tinder.auth.interactor.C10333h;
import com.tinder.targets.AuthVerificationTarget;
import javax.inject.Inject;

/* renamed from: com.tinder.presenters.b */
public class C17741b extends PresenterBase<AuthVerificationTarget> {
    @NonNull
    /* renamed from: a */
    private final C10333h f55208a;

    @Inject
    C17741b(@NonNull C10333h c10333h) {
        this.f55208a = c10333h;
    }

    /* renamed from: b */
    public void m64628b() {
        this.f55208a.i();
    }

    /* renamed from: a */
    public void m64627a(boolean z, boolean z2) {
        if (z || z2) {
            this.f55208a.j();
        }
    }
}
