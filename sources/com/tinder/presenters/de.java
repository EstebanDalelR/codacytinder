package com.tinder.presenters;

import com.tinder.analytics.experiment.C6220a;
import com.tinder.auth.interactor.AddSmsValidateEvent;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C10336s;
import com.tinder.auth.interactor.C8276b;
import com.tinder.auth.interactor.C8277d;
import com.tinder.auth.interactor.C8279j;
import com.tinder.auth.interactor.C8280l;
import com.tinder.auth.interactor.C8281o;
import com.tinder.auth.interactor.C8283q;
import com.tinder.auth.p167b.C8272a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.interactors.C9713a;
import com.tinder.managers.C2652a;
import com.tinder.session.usecase.C14838f;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class de implements Factory<bw> {
    /* renamed from: a */
    private final Provider<C9713a> f55251a;
    /* renamed from: b */
    private final Provider<C10333h> f55252b;
    /* renamed from: c */
    private final Provider<C8276b> f55253c;
    /* renamed from: d */
    private final Provider<C8281o> f55254d;
    /* renamed from: e */
    private final Provider<C8283q> f55255e;
    /* renamed from: f */
    private final Provider<AbTestUtility> f55256f;
    /* renamed from: g */
    private final Provider<C8279j> f55257g;
    /* renamed from: h */
    private final Provider<C8277d> f55258h;
    /* renamed from: i */
    private final Provider<C10336s> f55259i;
    /* renamed from: j */
    private final Provider<C2652a> f55260j;
    /* renamed from: k */
    private final Provider<AddSmsValidateEvent> f55261k;
    /* renamed from: l */
    private final Provider<C8280l> f55262l;
    /* renamed from: m */
    private final Provider<C14838f> f55263m;
    /* renamed from: n */
    private final Provider<C8272a> f55264n;
    /* renamed from: o */
    private final Provider<C6220a> f55265o;

    public /* synthetic */ Object get() {
        return m64756a();
    }

    public de(Provider<C9713a> provider, Provider<C10333h> provider2, Provider<C8276b> provider3, Provider<C8281o> provider4, Provider<C8283q> provider5, Provider<AbTestUtility> provider6, Provider<C8279j> provider7, Provider<C8277d> provider8, Provider<C10336s> provider9, Provider<C2652a> provider10, Provider<AddSmsValidateEvent> provider11, Provider<C8280l> provider12, Provider<C14838f> provider13, Provider<C8272a> provider14, Provider<C6220a> provider15) {
        this.f55251a = provider;
        this.f55252b = provider2;
        this.f55253c = provider3;
        this.f55254d = provider4;
        this.f55255e = provider5;
        this.f55256f = provider6;
        this.f55257g = provider7;
        this.f55258h = provider8;
        this.f55259i = provider9;
        this.f55260j = provider10;
        this.f55261k = provider11;
        this.f55262l = provider12;
        this.f55263m = provider13;
        this.f55264n = provider14;
        this.f55265o = provider15;
    }

    /* renamed from: a */
    public bw m64756a() {
        return m64754a(this.f55251a, this.f55252b, this.f55253c, this.f55254d, this.f55255e, this.f55256f, this.f55257g, this.f55258h, this.f55259i, this.f55260j, this.f55261k, this.f55262l, this.f55263m, this.f55264n, this.f55265o);
    }

    /* renamed from: a */
    public static bw m64754a(Provider<C9713a> provider, Provider<C10333h> provider2, Provider<C8276b> provider3, Provider<C8281o> provider4, Provider<C8283q> provider5, Provider<AbTestUtility> provider6, Provider<C8279j> provider7, Provider<C8277d> provider8, Provider<C10336s> provider9, Provider<C2652a> provider10, Provider<AddSmsValidateEvent> provider11, Provider<C8280l> provider12, Provider<C14838f> provider13, Provider<C8272a> provider14, Provider<C6220a> provider15) {
        return new bw((C9713a) provider.get(), (C10333h) provider2.get(), (C8276b) provider3.get(), (C8281o) provider4.get(), (C8283q) provider5.get(), (AbTestUtility) provider6.get(), (C8279j) provider7.get(), (C8277d) provider8.get(), (C10336s) provider9.get(), (C2652a) provider10.get(), (AddSmsValidateEvent) provider11.get(), (C8280l) provider12.get(), (C14838f) provider13.get(), (C8272a) provider14.get(), (C6220a) provider15.get());
    }

    /* renamed from: b */
    public static de m64755b(Provider<C9713a> provider, Provider<C10333h> provider2, Provider<C8276b> provider3, Provider<C8281o> provider4, Provider<C8283q> provider5, Provider<AbTestUtility> provider6, Provider<C8279j> provider7, Provider<C8277d> provider8, Provider<C10336s> provider9, Provider<C2652a> provider10, Provider<AddSmsValidateEvent> provider11, Provider<C8280l> provider12, Provider<C14838f> provider13, Provider<C8272a> provider14, Provider<C6220a> provider15) {
        return new de(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }
}
