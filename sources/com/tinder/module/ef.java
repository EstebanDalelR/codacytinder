package com.tinder.module;

import android.media.AudioManager;
import com.tinder.managers.ManagerApp;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ef implements Factory<AudioManager> {
    /* renamed from: a */
    private final ec f42963a;
    /* renamed from: b */
    private final Provider<ManagerApp> f42964b;

    public /* synthetic */ Object get() {
        return m52448a();
    }

    public ef(ec ecVar, Provider<ManagerApp> provider) {
        this.f42963a = ecVar;
        this.f42964b = provider;
    }

    /* renamed from: a */
    public AudioManager m52448a() {
        return m52446a(this.f42963a, this.f42964b);
    }

    /* renamed from: a */
    public static AudioManager m52446a(ec ecVar, Provider<ManagerApp> provider) {
        return m52445a(ecVar, (ManagerApp) provider.get());
    }

    /* renamed from: b */
    public static ef m52447b(ec ecVar, Provider<ManagerApp> provider) {
        return new ef(ecVar, provider);
    }

    /* renamed from: a */
    public static AudioManager m52445a(ec ecVar, ManagerApp managerApp) {
        return (AudioManager) C15521i.a(ecVar.m40890c(managerApp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
