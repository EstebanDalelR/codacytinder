package com.tinder.data.profile.adapter;

import com.tinder.data.adapter.C10738l;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.profile.adapter.b */
public final class C13061b implements Factory<C10913a> {
    /* renamed from: a */
    private final Provider<C10738l> f41633a;
    /* renamed from: b */
    private final Provider<Function0<DateTime>> f41634b;

    public /* synthetic */ Object get() {
        return m50847a();
    }

    public C13061b(Provider<C10738l> provider, Provider<Function0<DateTime>> provider2) {
        this.f41633a = provider;
        this.f41634b = provider2;
    }

    /* renamed from: a */
    public C10913a m50847a() {
        return C13061b.m50845a(this.f41633a, this.f41634b);
    }

    /* renamed from: a */
    public static C10913a m50845a(Provider<C10738l> provider, Provider<Function0<DateTime>> provider2) {
        return new C10913a((C10738l) provider.get(), (Function0) provider2.get());
    }

    /* renamed from: b */
    public static C13061b m50846b(Provider<C10738l> provider, Provider<Function0<DateTime>> provider2) {
        return new C13061b(provider, provider2);
    }
}
