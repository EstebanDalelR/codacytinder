package com.tinder.passport.p359e;

import com.tinder.passport.p302c.C10039a;
import dagger.internal.Factory;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.passport.e.d */
public final class C13544d implements Factory<C13543a> {
    /* renamed from: a */
    private final Provider<C10039a> f43265a;
    /* renamed from: b */
    private final Provider<C2664c> f43266b;

    public /* synthetic */ Object get() {
        return m52932a();
    }

    /* renamed from: a */
    public C13543a m52932a() {
        return C13544d.m52931a(this.f43265a, this.f43266b);
    }

    /* renamed from: a */
    public static C13543a m52931a(Provider<C10039a> provider, Provider<C2664c> provider2) {
        return new C13543a((C10039a) provider.get(), (C2664c) provider2.get());
    }

    /* renamed from: a */
    public static C13543a m52930a(C10039a c10039a, C2664c c2664c) {
        return new C13543a(c10039a, c2664c);
    }
}
