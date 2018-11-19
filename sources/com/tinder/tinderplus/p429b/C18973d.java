package com.tinder.tinderplus.p429b;

import com.tinder.passport.model.PassportLocation;
import com.tinder.tinderplus.target.TinderPlusControlTarget;
import com.tinder.utils.ag;
import rx.functions.Action1;

/* renamed from: com.tinder.tinderplus.b.d */
final /* synthetic */ class C18973d implements Action1 {
    /* renamed from: a */
    private final C18211a f58667a;
    /* renamed from: b */
    private final TinderPlusControlTarget f58668b;
    /* renamed from: c */
    private final PassportLocation f58669c;
    /* renamed from: d */
    private final ag f58670d;

    C18973d(C18211a c18211a, TinderPlusControlTarget tinderPlusControlTarget, PassportLocation passportLocation, ag agVar) {
        this.f58667a = c18211a;
        this.f58668b = tinderPlusControlTarget;
        this.f58669c = passportLocation;
        this.f58670d = agVar;
    }

    public void call(Object obj) {
        this.f58667a.m66025a(this.f58668b, this.f58669c, this.f58670d, (Throwable) obj);
    }
}
