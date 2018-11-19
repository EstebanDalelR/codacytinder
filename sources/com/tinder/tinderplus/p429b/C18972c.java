package com.tinder.tinderplus.p429b;

import android.util.Pair;
import com.tinder.passport.model.PassportLocation;
import com.tinder.tinderplus.target.TinderPlusControlTarget;
import com.tinder.utils.ag;
import rx.functions.Action1;

/* renamed from: com.tinder.tinderplus.b.c */
final /* synthetic */ class C18972c implements Action1 {
    /* renamed from: a */
    private final C18211a f58663a;
    /* renamed from: b */
    private final TinderPlusControlTarget f58664b;
    /* renamed from: c */
    private final PassportLocation f58665c;
    /* renamed from: d */
    private final ag f58666d;

    C18972c(C18211a c18211a, TinderPlusControlTarget tinderPlusControlTarget, PassportLocation passportLocation, ag agVar) {
        this.f58663a = c18211a;
        this.f58664b = tinderPlusControlTarget;
        this.f58665c = passportLocation;
        this.f58666d = agVar;
    }

    public void call(Object obj) {
        this.f58663a.m66024a(this.f58664b, this.f58665c, this.f58666d, (Pair) obj);
    }
}
