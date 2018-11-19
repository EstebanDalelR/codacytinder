package com.tinder.chat.view.action;

import com.tinder.domain.message.usecase.DeleteFailedMessage;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.action.v */
public final class C12744v implements Factory<C8464u> {
    /* renamed from: a */
    private final Provider<DeleteFailedMessage> f41102a;

    public /* synthetic */ Object get() {
        return m50153a();
    }

    public C12744v(Provider<DeleteFailedMessage> provider) {
        this.f41102a = provider;
    }

    /* renamed from: a */
    public C8464u m50153a() {
        return C12744v.m50151a(this.f41102a);
    }

    /* renamed from: a */
    public static C8464u m50151a(Provider<DeleteFailedMessage> provider) {
        return new C8464u((DeleteFailedMessage) provider.get());
    }

    /* renamed from: b */
    public static C12744v m50152b(Provider<DeleteFailedMessage> provider) {
        return new C12744v(provider);
    }
}
