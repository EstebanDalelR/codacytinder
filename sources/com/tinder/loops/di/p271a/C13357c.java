package com.tinder.loops.di.p271a;

import android.content.Context;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.di.a.c */
public final class C13357c implements Factory<Context> {
    /* renamed from: a */
    private final C9767a f42363a;
    /* renamed from: b */
    private final Provider<Context> f42364b;

    public /* synthetic */ Object get() {
        return m51674a();
    }

    public C13357c(C9767a c9767a, Provider<Context> provider) {
        this.f42363a = c9767a;
        this.f42364b = provider;
    }

    /* renamed from: a */
    public Context m51674a() {
        return C13357c.m51672a(this.f42363a, this.f42364b);
    }

    /* renamed from: a */
    public static Context m51672a(C9767a c9767a, Provider<Context> provider) {
        return C13357c.m51671a(c9767a, (Context) provider.get());
    }

    /* renamed from: b */
    public static C13357c m51673b(C9767a c9767a, Provider<Context> provider) {
        return new C13357c(c9767a, provider);
    }

    /* renamed from: a */
    public static Context m51671a(C9767a c9767a, Context context) {
        return (Context) C15521i.a(c9767a.m40309a(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
