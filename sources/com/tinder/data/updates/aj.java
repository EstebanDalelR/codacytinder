package com.tinder.data.updates;

import com.tinder.data.adapter.C10738l;
import com.tinder.data.message.C10839m;
import com.tinder.domain.message.usecase.InsertMessages;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class aj implements Factory<ai> {
    /* renamed from: a */
    private final Provider<C10738l> f41763a;
    /* renamed from: b */
    private final Provider<C10839m> f41764b;
    /* renamed from: c */
    private final Provider<InsertMessages> f41765c;

    public /* synthetic */ Object get() {
        return m51007a();
    }

    public aj(Provider<C10738l> provider, Provider<C10839m> provider2, Provider<InsertMessages> provider3) {
        this.f41763a = provider;
        this.f41764b = provider2;
        this.f41765c = provider3;
    }

    /* renamed from: a */
    public ai m51007a() {
        return m51005a(this.f41763a, this.f41764b, this.f41765c);
    }

    /* renamed from: a */
    public static ai m51005a(Provider<C10738l> provider, Provider<C10839m> provider2, Provider<InsertMessages> provider3) {
        return new ai((C10738l) provider.get(), (C10839m) provider2.get(), (InsertMessages) provider3.get());
    }

    /* renamed from: b */
    public static aj m51006b(Provider<C10738l> provider, Provider<C10839m> provider2, Provider<InsertMessages> provider3) {
        return new aj(provider, provider2, provider3);
    }
}
