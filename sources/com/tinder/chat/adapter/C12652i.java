package com.tinder.chat.adapter;

import com.tinder.typingindicator.p434a.C15313c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.adapter.i */
public final class C12652i implements Factory<C13661h> {
    /* renamed from: a */
    private final Provider<C15313c> f40789a;

    public /* synthetic */ Object get() {
        return m49924a();
    }

    public C12652i(Provider<C15313c> provider) {
        this.f40789a = provider;
    }

    /* renamed from: a */
    public C13661h m49924a() {
        return C12652i.m49922a(this.f40789a);
    }

    /* renamed from: a */
    public static C13661h m49922a(Provider<C15313c> provider) {
        return new C13661h((C15313c) provider.get());
    }

    /* renamed from: b */
    public static C12652i m49923b(Provider<C15313c> provider) {
        return new C12652i(provider);
    }
}
