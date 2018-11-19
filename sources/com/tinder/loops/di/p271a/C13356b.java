package com.tinder.loops.di.p271a;

import android.arch.lifecycle.ViewModelProvider;
import com.tinder.viewmodel.C17260a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.di.a.b */
public final class C13356b implements Factory<ViewModelProvider.Factory> {
    /* renamed from: a */
    private final C9767a f42361a;
    /* renamed from: b */
    private final Provider<C17260a> f42362b;

    public /* synthetic */ Object get() {
        return m51670a();
    }

    public C13356b(C9767a c9767a, Provider<C17260a> provider) {
        this.f42361a = c9767a;
        this.f42362b = provider;
    }

    /* renamed from: a */
    public ViewModelProvider.Factory m51670a() {
        return C13356b.m51668a(this.f42361a, this.f42362b);
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m51668a(C9767a c9767a, Provider<C17260a> provider) {
        return C13356b.m51667a(c9767a, (C17260a) provider.get());
    }

    /* renamed from: b */
    public static C13356b m51669b(C9767a c9767a, Provider<C17260a> provider) {
        return new C13356b(c9767a, provider);
    }

    /* renamed from: a */
    public static ViewModelProvider.Factory m51667a(C9767a c9767a, C17260a c17260a) {
        return (ViewModelProvider.Factory) C15521i.a(c9767a.m40308a(c17260a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
