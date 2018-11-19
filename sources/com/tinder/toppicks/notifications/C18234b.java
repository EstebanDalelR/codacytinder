package com.tinder.toppicks.notifications;

import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.notifications.b */
public final class C18234b implements Factory<C17037a> {
    /* renamed from: a */
    private final Provider<FirebaseJobDispatcher> f56518a;

    public /* synthetic */ Object get() {
        return m66088a();
    }

    public C18234b(Provider<FirebaseJobDispatcher> provider) {
        this.f56518a = provider;
    }

    /* renamed from: a */
    public C17037a m66088a() {
        return C18234b.m66086a(this.f56518a);
    }

    /* renamed from: a */
    public static C17037a m66086a(Provider<FirebaseJobDispatcher> provider) {
        return new C17037a((FirebaseJobDispatcher) provider.get());
    }

    /* renamed from: b */
    public static C18234b m66087b(Provider<FirebaseJobDispatcher> provider) {
        return new C18234b(provider);
    }
}
