package com.tinder.interactors;

import com.google.android.gms.gcm.C2544a;
import com.google.android.gms.gcm.PeriodicTask;
import javax.inject.Inject;

/* renamed from: com.tinder.interactors.i */
public class C9718i {
    /* renamed from: a */
    private final PeriodicTask f32314a;
    /* renamed from: b */
    private final C2544a f32315b;

    @Inject
    public C9718i(PeriodicTask periodicTask, C2544a c2544a) {
        this.f32314a = periodicTask;
        this.f32315b = c2544a;
    }

    /* renamed from: a */
    public void m40215a() {
        this.f32315b.a(this.f32314a);
    }
}
