package com.tinder.module;

import com.tinder.core.experiment.C8597m;
import com.tinder.domain.updates.UpdateSignalRepository;
import com.tinder.updates.p443a.C15341i;
import com.tinder.updates.p443a.C15342k;
import dagger.Lazy;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class fk implements Factory<UpdateSignalRepository> {
    /* renamed from: a */
    private final fj f43026a;
    /* renamed from: b */
    private final Provider<UpdateSignalRepository> f43027b;
    /* renamed from: c */
    private final Provider<UpdateSignalRepository> f43028c;
    /* renamed from: d */
    private final Provider<C15341i> f43029d;
    /* renamed from: e */
    private final Provider<C15342k> f43030e;
    /* renamed from: f */
    private final Provider<C8597m> f43031f;

    public /* synthetic */ Object get() {
        return m52528a();
    }

    public fk(fj fjVar, Provider<UpdateSignalRepository> provider, Provider<UpdateSignalRepository> provider2, Provider<C15341i> provider3, Provider<C15342k> provider4, Provider<C8597m> provider5) {
        this.f43026a = fjVar;
        this.f43027b = provider;
        this.f43028c = provider2;
        this.f43029d = provider3;
        this.f43030e = provider4;
        this.f43031f = provider5;
    }

    /* renamed from: a */
    public UpdateSignalRepository m52528a() {
        return m52526a(this.f43026a, this.f43027b, this.f43028c, this.f43029d, this.f43030e, this.f43031f);
    }

    /* renamed from: a */
    public static UpdateSignalRepository m52526a(fj fjVar, Provider<UpdateSignalRepository> provider, Provider<UpdateSignalRepository> provider2, Provider<C15341i> provider3, Provider<C15342k> provider4, Provider<C8597m> provider5) {
        return m52525a(fjVar, C17281c.b(provider), C17281c.b(provider2), C17281c.b(provider3), C17281c.b(provider4), (C8597m) provider5.get());
    }

    /* renamed from: b */
    public static fk m52527b(fj fjVar, Provider<UpdateSignalRepository> provider, Provider<UpdateSignalRepository> provider2, Provider<C15341i> provider3, Provider<C15342k> provider4, Provider<C8597m> provider5) {
        return new fk(fjVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static UpdateSignalRepository m52525a(fj fjVar, Lazy<UpdateSignalRepository> lazy, Lazy<UpdateSignalRepository> lazy2, Lazy<C15341i> lazy3, Lazy<C15342k> lazy4, C8597m c8597m) {
        return (UpdateSignalRepository) C15521i.a(fjVar.m40901a(lazy, lazy2, lazy3, lazy4, c8597m), "Cannot return null from a non-@Nullable @Provides method");
    }
}
