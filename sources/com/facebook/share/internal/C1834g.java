package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.C1697a;

/* renamed from: com.facebook.share.internal.g */
public abstract class C1834g {
    /* renamed from: a */
    private FacebookCallback f5021a;

    /* renamed from: a */
    public abstract void mo1894a(C1697a c1697a, Bundle bundle);

    public C1834g(FacebookCallback facebookCallback) {
        this.f5021a = facebookCallback;
    }

    /* renamed from: a */
    public void mo1893a(C1697a c1697a) {
        if (this.f5021a != null) {
            this.f5021a.onCancel();
        }
    }

    /* renamed from: a */
    public void mo1895a(C1697a c1697a, FacebookException facebookException) {
        if (this.f5021a != null) {
            this.f5021a.onError(facebookException);
        }
    }
}
