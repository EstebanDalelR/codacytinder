package com.tinder.usecase;

import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.usecase.k */
public final class C18278k implements Factory<C17225j> {
    /* renamed from: a */
    private final Provider<FirebaseJobDispatcher> f56614a;

    public /* synthetic */ Object get() {
        return m66212a();
    }

    public C18278k(Provider<FirebaseJobDispatcher> provider) {
        this.f56614a = provider;
    }

    /* renamed from: a */
    public C17225j m66212a() {
        return C18278k.m66210a(this.f56614a);
    }

    /* renamed from: a */
    public static C17225j m66210a(Provider<FirebaseJobDispatcher> provider) {
        return new C17225j((FirebaseJobDispatcher) provider.get());
    }

    /* renamed from: b */
    public static C18278k m66211b(Provider<FirebaseJobDispatcher> provider) {
        return new C18278k(provider);
    }
}
