package com.tinder.module;

import android.arch.lifecycle.LifecycleObserver;
import android.content.Context;
import com.tinder.messageads.UserAgentCache;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.m */
public final class C13492m implements Factory<LifecycleObserver> {
    /* renamed from: a */
    private final C9940d f43057a;
    /* renamed from: b */
    private final Provider<Context> f43058b;
    /* renamed from: c */
    private final Provider<UserAgentCache> f43059c;

    public /* synthetic */ Object get() {
        return m52559a();
    }

    /* renamed from: a */
    public LifecycleObserver m52559a() {
        return C13492m.m52558a(this.f43057a, this.f43058b, this.f43059c);
    }

    /* renamed from: a */
    public static LifecycleObserver m52558a(C9940d c9940d, Provider<Context> provider, Provider<UserAgentCache> provider2) {
        return C13492m.m52557a(c9940d, (Context) provider.get(), (UserAgentCache) provider2.get());
    }

    /* renamed from: a */
    public static LifecycleObserver m52557a(C9940d c9940d, Context context, UserAgentCache userAgentCache) {
        return (LifecycleObserver) C15521i.a(c9940d.m40853a(context, userAgentCache), "Cannot return null from a non-@Nullable @Provides method");
    }
}
