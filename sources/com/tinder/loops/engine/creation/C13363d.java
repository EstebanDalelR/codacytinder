package com.tinder.loops.engine.creation;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.engine.creation.d */
public final class C13363d implements Factory<C9779c> {
    /* renamed from: a */
    private final Provider<Context> f42371a;

    public /* synthetic */ Object get() {
        return m51693a();
    }

    public C13363d(Provider<Context> provider) {
        this.f42371a = provider;
    }

    /* renamed from: a */
    public C9779c m51693a() {
        return C13363d.m51691a(this.f42371a);
    }

    /* renamed from: a */
    public static C9779c m51691a(Provider<Context> provider) {
        return new C9779c((Context) provider.get());
    }

    /* renamed from: b */
    public static C13363d m51692b(Provider<Context> provider) {
        return new C13363d(provider);
    }
}
