package com.tinder.auth.repository;

import com.google.android.gms.iid.C2553a;
import com.tinder.domain.auth.UniqueIdFactory;
import javax.inject.Inject;

/* renamed from: com.tinder.auth.repository.n */
public class C10351n implements UniqueIdFactory {
    /* renamed from: a */
    private final C2553a f33780a;

    @Inject
    C10351n(C2553a c2553a) {
        this.f33780a = c2553a;
    }

    public String getInstanceId() {
        return this.f33780a.a();
    }
}
