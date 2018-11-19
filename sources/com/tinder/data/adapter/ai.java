package com.tinder.data.adapter;

import com.tinder.data.adapter.ah.C10733a;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ai implements Factory<C10733a> {
    /* renamed from: a */
    private final Provider<C10738l> f41248a;
    /* renamed from: b */
    private final Provider<C3925u> f41249b;
    /* renamed from: c */
    private final Provider<C10735f> f41250c;
    /* renamed from: d */
    private final Provider<C10746z> f41251d;
    /* renamed from: e */
    private final Provider<aj> f41252e;
    /* renamed from: f */
    private final Provider<al> f41253f;
    /* renamed from: g */
    private final Provider<an> f41254g;
    /* renamed from: h */
    private final Provider<C10742q> f41255h;
    /* renamed from: i */
    private final Provider<C10737j> f41256i;
    /* renamed from: j */
    private final Provider<C10743s> f41257j;

    public /* synthetic */ Object get() {
        return m50380a();
    }

    public ai(Provider<C10738l> provider, Provider<C3925u> provider2, Provider<C10735f> provider3, Provider<C10746z> provider4, Provider<aj> provider5, Provider<al> provider6, Provider<an> provider7, Provider<C10742q> provider8, Provider<C10737j> provider9, Provider<C10743s> provider10) {
        this.f41248a = provider;
        this.f41249b = provider2;
        this.f41250c = provider3;
        this.f41251d = provider4;
        this.f41252e = provider5;
        this.f41253f = provider6;
        this.f41254g = provider7;
        this.f41255h = provider8;
        this.f41256i = provider9;
        this.f41257j = provider10;
    }

    /* renamed from: a */
    public C10733a m50380a() {
        return m50378a(this.f41248a, this.f41249b, this.f41250c, this.f41251d, this.f41252e, this.f41253f, this.f41254g, this.f41255h, this.f41256i, this.f41257j);
    }

    /* renamed from: a */
    public static C10733a m50378a(Provider<C10738l> provider, Provider<C3925u> provider2, Provider<C10735f> provider3, Provider<C10746z> provider4, Provider<aj> provider5, Provider<al> provider6, Provider<an> provider7, Provider<C10742q> provider8, Provider<C10737j> provider9, Provider<C10743s> provider10) {
        return new C10733a((C10738l) provider.get(), (C3925u) provider2.get(), (C10735f) provider3.get(), (C10746z) provider4.get(), (aj) provider5.get(), (al) provider6.get(), (an) provider7.get(), (C10742q) provider8.get(), (C10737j) provider9.get(), (C10743s) provider10.get());
    }

    /* renamed from: b */
    public static ai m50379b(Provider<C10738l> provider, Provider<C3925u> provider2, Provider<C10735f> provider3, Provider<C10746z> provider4, Provider<aj> provider5, Provider<al> provider6, Provider<an> provider7, Provider<C10742q> provider8, Provider<C10737j> provider9, Provider<C10743s> provider10) {
        return new ai(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }
}
