package com.tinder.data.meta.p226a;

import com.tinder.data.adapter.C10735f;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.C10746z;
import com.tinder.data.adapter.C3925u;
import com.tinder.data.adapter.aj;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.meta.a.d */
public final class C12966d implements Factory<C10844c> {
    /* renamed from: a */
    private final Provider<C10735f> f41524a;
    /* renamed from: b */
    private final Provider<C10738l> f41525b;
    /* renamed from: c */
    private final Provider<C10746z> f41526c;
    /* renamed from: d */
    private final Provider<C3925u> f41527d;
    /* renamed from: e */
    private final Provider<aj> f41528e;

    public /* synthetic */ Object get() {
        return m50706a();
    }

    public C12966d(Provider<C10735f> provider, Provider<C10738l> provider2, Provider<C10746z> provider3, Provider<C3925u> provider4, Provider<aj> provider5) {
        this.f41524a = provider;
        this.f41525b = provider2;
        this.f41526c = provider3;
        this.f41527d = provider4;
        this.f41528e = provider5;
    }

    /* renamed from: a */
    public C10844c m50706a() {
        return C12966d.m50704a(this.f41524a, this.f41525b, this.f41526c, this.f41527d, this.f41528e);
    }

    /* renamed from: a */
    public static C10844c m50704a(Provider<C10735f> provider, Provider<C10738l> provider2, Provider<C10746z> provider3, Provider<C3925u> provider4, Provider<aj> provider5) {
        return new C10844c((C10735f) provider.get(), (C10738l) provider2.get(), (C10746z) provider3.get(), (C3925u) provider4.get(), (aj) provider5.get());
    }

    /* renamed from: b */
    public static C12966d m50705b(Provider<C10735f> provider, Provider<C10738l> provider2, Provider<C10746z> provider3, Provider<C3925u> provider4, Provider<aj> provider5) {
        return new C12966d(provider, provider2, provider3, provider4, provider5);
    }
}
