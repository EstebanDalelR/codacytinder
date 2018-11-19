package com.tinder.data.updates;

import com.tinder.data.message.C10838k;
import com.tinder.domain.message.usecase.InsertMessageLikes;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ah implements Factory<af> {
    /* renamed from: a */
    private final Provider<C10838k> f41761a;
    /* renamed from: b */
    private final Provider<InsertMessageLikes> f41762b;

    public /* synthetic */ Object get() {
        return m51004a();
    }

    public ah(Provider<C10838k> provider, Provider<InsertMessageLikes> provider2) {
        this.f41761a = provider;
        this.f41762b = provider2;
    }

    /* renamed from: a */
    public af m51004a() {
        return m51002a(this.f41761a, this.f41762b);
    }

    /* renamed from: a */
    public static af m51002a(Provider<C10838k> provider, Provider<InsertMessageLikes> provider2) {
        return new af((C10838k) provider.get(), (InsertMessageLikes) provider2.get());
    }

    /* renamed from: b */
    public static ah m51003b(Provider<C10838k> provider, Provider<InsertMessageLikes> provider2) {
        return new ah(provider, provider2);
    }
}
