package com.tinder.auth.accountkit;

import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKitError;
import com.tinder.presenters.PresenterBase;
import javax.inject.Inject;

/* renamed from: com.tinder.auth.accountkit.c */
class C12564c extends PresenterBase<C8270e> {
    /* renamed from: a */
    private final C8271f f40607a;

    @Inject
    C12564c(C8271f c8271f) {
        this.f40607a = c8271f;
    }

    /* renamed from: a */
    void m49672a(@Nullable AccountKitError accountKitError) {
        C8270e c8270e = (C8270e) H();
        if (this.f40607a.m35317a(accountKitError)) {
            c8270e.mo9215b();
            return;
        }
        Object obj;
        if (accountKitError != null) {
            if (accountKitError.getUserFacingMessage() != null) {
                obj = null;
                if (obj == null) {
                    c8270e.mo9216c();
                } else {
                    c8270e.mo9214a(accountKitError.getUserFacingMessage(), accountKitError.getDetailErrorCode());
                }
            }
        }
        obj = 1;
        if (obj == null) {
            c8270e.mo9214a(accountKitError.getUserFacingMessage(), accountKitError.getDetailErrorCode());
        } else {
            c8270e.mo9216c();
        }
    }
}
