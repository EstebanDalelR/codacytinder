package com.tinder.module;

import android.content.SharedPreferences;
import com.tinder.messageads.UserAgentCache;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.l */
public final class C13491l implements Factory<UserAgentCache> {
    /* renamed from: a */
    private final C9940d f43055a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f43056b;

    public /* synthetic */ Object get() {
        return m52556a();
    }

    public C13491l(C9940d c9940d, Provider<SharedPreferences> provider) {
        this.f43055a = c9940d;
        this.f43056b = provider;
    }

    /* renamed from: a */
    public UserAgentCache m52556a() {
        return C13491l.m52554a(this.f43055a, this.f43056b);
    }

    /* renamed from: a */
    public static UserAgentCache m52554a(C9940d c9940d, Provider<SharedPreferences> provider) {
        return C13491l.m52553a(c9940d, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C13491l m52555b(C9940d c9940d, Provider<SharedPreferences> provider) {
        return new C13491l(c9940d, provider);
    }

    /* renamed from: a */
    public static UserAgentCache m52553a(C9940d c9940d, SharedPreferences sharedPreferences) {
        return (UserAgentCache) C15521i.a(c9940d.m40861a(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
