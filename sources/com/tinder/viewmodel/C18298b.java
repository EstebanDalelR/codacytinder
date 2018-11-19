package com.tinder.viewmodel;

import android.arch.lifecycle.C0029n;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.tinder.viewmodel.b */
public final class C18298b implements Factory<C17260a> {
    /* renamed from: a */
    private final Provider<Map<Class<? extends C0029n>, Provider<C0029n>>> f56660a;

    public /* synthetic */ Object get() {
        return m66281a();
    }

    public C18298b(Provider<Map<Class<? extends C0029n>, Provider<C0029n>>> provider) {
        this.f56660a = provider;
    }

    /* renamed from: a */
    public C17260a m66281a() {
        return C18298b.m66279a(this.f56660a);
    }

    /* renamed from: a */
    public static C17260a m66279a(Provider<Map<Class<? extends C0029n>, Provider<C0029n>>> provider) {
        return new C17260a((Map) provider.get());
    }

    /* renamed from: b */
    public static C18298b m66280b(Provider<Map<Class<? extends C0029n>, Provider<C0029n>>> provider) {
        return new C18298b(provider);
    }
}
