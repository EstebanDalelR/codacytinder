package com.tinder.profile.module;

import android.arch.lifecycle.Lifecycle;
import android.support.v7.app.AppCompatActivity;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.module.b */
public final class C17762b implements Factory<Lifecycle> {
    /* renamed from: a */
    private final C14421a f55421a;
    /* renamed from: b */
    private final Provider<AppCompatActivity> f55422b;

    public /* synthetic */ Object get() {
        return m64936a();
    }

    /* renamed from: a */
    public Lifecycle m64936a() {
        return C17762b.m64935a(this.f55421a, this.f55422b);
    }

    /* renamed from: a */
    public static Lifecycle m64935a(C14421a c14421a, Provider<AppCompatActivity> provider) {
        return C17762b.m64934a(c14421a, (AppCompatActivity) provider.get());
    }

    /* renamed from: a */
    public static Lifecycle m64934a(C14421a c14421a, AppCompatActivity appCompatActivity) {
        return (Lifecycle) C15521i.m58001a(c14421a.m54969a(appCompatActivity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
