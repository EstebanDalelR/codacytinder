package com.tinder.data.adapter;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class am implements Factory<al> {
    /* renamed from: a */
    private final Provider<an> f41258a;

    public /* synthetic */ Object get() {
        return m50383a();
    }

    public am(Provider<an> provider) {
        this.f41258a = provider;
    }

    /* renamed from: a */
    public al m50383a() {
        return m50381a(this.f41258a);
    }

    /* renamed from: a */
    public static al m50381a(Provider<an> provider) {
        return new al((an) provider.get());
    }

    /* renamed from: b */
    public static am m50382b(Provider<an> provider) {
        return new am(provider);
    }
}
