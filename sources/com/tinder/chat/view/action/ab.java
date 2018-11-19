package com.tinder.chat.view.action;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ab implements Factory<aa> {
    /* renamed from: a */
    private final Provider<Context> f41086a;

    public /* synthetic */ Object get() {
        return m50129a();
    }

    public ab(Provider<Context> provider) {
        this.f41086a = provider;
    }

    /* renamed from: a */
    public aa m50129a() {
        return m50127a(this.f41086a);
    }

    /* renamed from: a */
    public static aa m50127a(Provider<Context> provider) {
        return new aa((Context) provider.get());
    }

    /* renamed from: b */
    public static ab m50128b(Provider<Context> provider) {
        return new ab(provider);
    }
}
