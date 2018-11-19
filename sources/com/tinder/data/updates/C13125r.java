package com.tinder.data.updates;

import com.tinder.domain.auth.AuthStatusRepository;
import com.tinder.scarlet.Lifecycle;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.updates.r */
public final class C13125r implements Factory<Lifecycle> {
    /* renamed from: a */
    private final Provider<AuthStatusRepository> f41771a;

    public /* synthetic */ Object get() {
        return m51024a();
    }

    public C13125r(Provider<AuthStatusRepository> provider) {
        this.f41771a = provider;
    }

    /* renamed from: a */
    public Lifecycle m51024a() {
        return C13125r.m51022a(this.f41771a);
    }

    /* renamed from: a */
    public static Lifecycle m51022a(Provider<AuthStatusRepository> provider) {
        return C13125r.m51021a((AuthStatusRepository) provider.get());
    }

    /* renamed from: b */
    public static C13125r m51023b(Provider<AuthStatusRepository> provider) {
        return new C13125r(provider);
    }

    /* renamed from: a */
    public static Lifecycle m51021a(AuthStatusRepository authStatusRepository) {
        return (Lifecycle) C15521i.a(C8811p.m37507a(authStatusRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
