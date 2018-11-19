package com.tinder.profile.presenter;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.overflow.analytics.C12239a;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.profile.p363b.C16081p;
import com.tinder.profile.p363b.ao;
import com.tinder.recs.analytics.AddRecsProfileCloseEvent;
import com.tinder.recs.analytics.AddRecsProfileOpenEvent;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bt implements Factory<bp> {
    /* renamed from: a */
    private final Provider<C14418b> f55432a;
    /* renamed from: b */
    private final Provider<ao> f55433b;
    /* renamed from: c */
    private final Provider<C16081p> f55434c;
    /* renamed from: d */
    private final Provider<AddRecsProfileOpenEvent> f55435d;
    /* renamed from: e */
    private final Provider<AddRecsProfileCloseEvent> f55436e;
    /* renamed from: f */
    private final Provider<C2630h> f55437f;
    /* renamed from: g */
    private final Provider<AbTestUtility> f55438g;
    /* renamed from: h */
    private final Provider<C12239a> f55439h;

    public /* synthetic */ Object get() {
        return m64955a();
    }

    public bt(Provider<C14418b> provider, Provider<ao> provider2, Provider<C16081p> provider3, Provider<AddRecsProfileOpenEvent> provider4, Provider<AddRecsProfileCloseEvent> provider5, Provider<C2630h> provider6, Provider<AbTestUtility> provider7, Provider<C12239a> provider8) {
        this.f55432a = provider;
        this.f55433b = provider2;
        this.f55434c = provider3;
        this.f55435d = provider4;
        this.f55436e = provider5;
        this.f55437f = provider6;
        this.f55438g = provider7;
        this.f55439h = provider8;
    }

    /* renamed from: a */
    public bp m64955a() {
        return m64953a(this.f55432a, this.f55433b, this.f55434c, this.f55435d, this.f55436e, this.f55437f, this.f55438g, this.f55439h);
    }

    /* renamed from: a */
    public static bp m64953a(Provider<C14418b> provider, Provider<ao> provider2, Provider<C16081p> provider3, Provider<AddRecsProfileOpenEvent> provider4, Provider<AddRecsProfileCloseEvent> provider5, Provider<C2630h> provider6, Provider<AbTestUtility> provider7, Provider<C12239a> provider8) {
        return new bp((C14418b) provider.get(), (ao) provider2.get(), (C16081p) provider3.get(), (AddRecsProfileOpenEvent) provider4.get(), (AddRecsProfileCloseEvent) provider5.get(), (C2630h) provider6.get(), (AbTestUtility) provider7.get(), (C12239a) provider8.get());
    }

    /* renamed from: b */
    public static bt m64954b(Provider<C14418b> provider, Provider<ao> provider2, Provider<C16081p> provider3, Provider<AddRecsProfileOpenEvent> provider4, Provider<AddRecsProfileCloseEvent> provider5, Provider<C2630h> provider6, Provider<AbTestUtility> provider7, Provider<C12239a> provider8) {
        return new bt(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }
}
