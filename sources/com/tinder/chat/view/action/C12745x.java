package com.tinder.chat.view.action;

import com.tinder.chat.analytics.C10535m;
import com.tinder.domain.message.usecase.LikeMessage;
import com.tinder.domain.message.usecase.UnLikeMessage;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.action.x */
public final class C12745x implements Factory<C8465w> {
    /* renamed from: a */
    private final Provider<LikeMessage> f41103a;
    /* renamed from: b */
    private final Provider<UnLikeMessage> f41104b;
    /* renamed from: c */
    private final Provider<C10535m> f41105c;

    public /* synthetic */ Object get() {
        return m50156a();
    }

    public C12745x(Provider<LikeMessage> provider, Provider<UnLikeMessage> provider2, Provider<C10535m> provider3) {
        this.f41103a = provider;
        this.f41104b = provider2;
        this.f41105c = provider3;
    }

    /* renamed from: a */
    public C8465w m50156a() {
        return C12745x.m50154a(this.f41103a, this.f41104b, this.f41105c);
    }

    /* renamed from: a */
    public static C8465w m50154a(Provider<LikeMessage> provider, Provider<UnLikeMessage> provider2, Provider<C10535m> provider3) {
        return new C8465w((LikeMessage) provider.get(), (UnLikeMessage) provider2.get(), (C10535m) provider3.get());
    }

    /* renamed from: b */
    public static C12745x m50155b(Provider<LikeMessage> provider, Provider<UnLikeMessage> provider2, Provider<C10535m> provider3) {
        return new C12745x(provider, provider2, provider3);
    }
}
