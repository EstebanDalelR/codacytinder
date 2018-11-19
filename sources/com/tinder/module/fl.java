package com.tinder.module;

import com.tinder.data.updates.C8809l;
import com.tinder.updates.UpdatesScheduler;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class fl implements Factory<UpdatesScheduler> {
    /* renamed from: a */
    private final fj f43032a;
    /* renamed from: b */
    private final Provider<C8809l> f43033b;

    public /* synthetic */ Object get() {
        return m52532a();
    }

    public fl(fj fjVar, Provider<C8809l> provider) {
        this.f43032a = fjVar;
        this.f43033b = provider;
    }

    /* renamed from: a */
    public UpdatesScheduler m52532a() {
        return m52530a(this.f43032a, this.f43033b);
    }

    /* renamed from: a */
    public static UpdatesScheduler m52530a(fj fjVar, Provider<C8809l> provider) {
        return m52529a(fjVar, (C8809l) provider.get());
    }

    /* renamed from: b */
    public static fl m52531b(fj fjVar, Provider<C8809l> provider) {
        return new fl(fjVar, provider);
    }

    /* renamed from: a */
    public static UpdatesScheduler m52529a(fj fjVar, C8809l c8809l) {
        return (UpdatesScheduler) C15521i.a(fjVar.m40902a(c8809l), "Cannot return null from a non-@Nullable @Provides method");
    }
}
