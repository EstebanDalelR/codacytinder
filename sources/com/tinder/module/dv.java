package com.tinder.module;

import com.tinder.domain.meta.usecase.FetchMeta;
import com.tinder.managers.UserMetaManager;
import com.tinder.p238f.p243e.C9368a;
import com.tinder.p238f.p336c.C11600a;
import com.tinder.p238f.p337d.C11601a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dv implements Factory<UserMetaManager> {
    /* renamed from: a */
    private final bs f42945a;
    /* renamed from: b */
    private final Provider<FetchMeta> f42946b;
    /* renamed from: c */
    private final Provider<C11601a> f42947c;
    /* renamed from: d */
    private final Provider<C11600a> f42948d;
    /* renamed from: e */
    private final Provider<C9368a> f42949e;

    public /* synthetic */ Object get() {
        return m52417a();
    }

    public dv(bs bsVar, Provider<FetchMeta> provider, Provider<C11601a> provider2, Provider<C11600a> provider3, Provider<C9368a> provider4) {
        this.f42945a = bsVar;
        this.f42946b = provider;
        this.f42947c = provider2;
        this.f42948d = provider3;
        this.f42949e = provider4;
    }

    /* renamed from: a */
    public UserMetaManager m52417a() {
        return m52415a(this.f42945a, this.f42946b, this.f42947c, this.f42948d, this.f42949e);
    }

    /* renamed from: a */
    public static UserMetaManager m52415a(bs bsVar, Provider<FetchMeta> provider, Provider<C11601a> provider2, Provider<C11600a> provider3, Provider<C9368a> provider4) {
        return m52414a(bsVar, (FetchMeta) provider.get(), (C11601a) provider2.get(), (C11600a) provider3.get(), (C9368a) provider4.get());
    }

    /* renamed from: b */
    public static dv m52416b(bs bsVar, Provider<FetchMeta> provider, Provider<C11601a> provider2, Provider<C11600a> provider3, Provider<C9368a> provider4) {
        return new dv(bsVar, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static UserMetaManager m52414a(bs bsVar, FetchMeta fetchMeta, C11601a c11601a, C11600a c11600a, C9368a c9368a) {
        return (UserMetaManager) C15521i.a(bsVar.m40817a(fetchMeta, c11601a, c11600a, c9368a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
