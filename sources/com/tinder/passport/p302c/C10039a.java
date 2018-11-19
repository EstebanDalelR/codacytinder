package com.tinder.passport.p302c;

import com.tinder.passport.model.PassportLocation;
import com.tinder.passport.p093d.C3945a;
import javax.inject.Inject;
import rx.Observable;

/* renamed from: com.tinder.passport.c.a */
public class C10039a {
    /* renamed from: a */
    private final C3945a f32933a;

    @Inject
    C10039a(C3945a c3945a) {
        this.f32933a = c3945a;
    }

    /* renamed from: a */
    public Observable<Boolean> m41085a() {
        C3945a c3945a = this.f32933a;
        c3945a.getClass();
        return Observable.a(C10040b.m41088a(c3945a));
    }

    /* renamed from: b */
    public void m41086b() {
        this.f32933a.e();
    }

    /* renamed from: c */
    public PassportLocation m41087c() {
        return this.f32933a.b();
    }
}
