package com.tinder.module;

import android.app.NotificationManager;
import com.tinder.managers.ManagerApp;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class db implements Factory<NotificationManager> {
    /* renamed from: a */
    private final bs f42903a;
    /* renamed from: b */
    private final Provider<ManagerApp> f42904b;

    public /* synthetic */ Object get() {
        return m52337a();
    }

    public db(bs bsVar, Provider<ManagerApp> provider) {
        this.f42903a = bsVar;
        this.f42904b = provider;
    }

    /* renamed from: a */
    public NotificationManager m52337a() {
        return m52335a(this.f42903a, this.f42904b);
    }

    /* renamed from: a */
    public static NotificationManager m52335a(bs bsVar, Provider<ManagerApp> provider) {
        return m52334a(bsVar, (ManagerApp) provider.get());
    }

    /* renamed from: b */
    public static db m52336b(bs bsVar, Provider<ManagerApp> provider) {
        return new db(bsVar, provider);
    }

    /* renamed from: a */
    public static NotificationManager m52334a(bs bsVar, ManagerApp managerApp) {
        return (NotificationManager) C15521i.a(bsVar.m40797a(managerApp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
