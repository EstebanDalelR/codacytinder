package com.tinder.module;

import android.app.Application;
import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ej implements Factory<FirebaseJobDispatcher> {
    /* renamed from: a */
    private final ec f42969a;
    /* renamed from: b */
    private final Provider<Application> f42970b;

    public /* synthetic */ Object get() {
        return m52463a();
    }

    public ej(ec ecVar, Provider<Application> provider) {
        this.f42969a = ecVar;
        this.f42970b = provider;
    }

    /* renamed from: a */
    public FirebaseJobDispatcher m52463a() {
        return m52461a(this.f42969a, this.f42970b);
    }

    /* renamed from: a */
    public static FirebaseJobDispatcher m52461a(ec ecVar, Provider<Application> provider) {
        return m52460a(ecVar, (Application) provider.get());
    }

    /* renamed from: b */
    public static ej m52462b(ec ecVar, Provider<Application> provider) {
        return new ej(ecVar, provider);
    }

    /* renamed from: a */
    public static FirebaseJobDispatcher m52460a(ec ecVar, Application application) {
        return (FirebaseJobDispatcher) C15521i.a(ecVar.m40880a(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}
