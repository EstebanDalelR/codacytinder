package com.tinder.auth.interactor;

import com.tinder.managers.C2652a;
import com.tinder.typingindicator.worker.TypingIndicatorWorker;
import com.tinder.updates.UpdatesScheduler;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.interactor.n */
public final class C12585n implements Factory<C8280l> {
    /* renamed from: a */
    private final Provider<C2652a> f40657a;
    /* renamed from: b */
    private final Provider<C10333h> f40658b;
    /* renamed from: c */
    private final Provider<UpdatesScheduler> f40659c;
    /* renamed from: d */
    private final Provider<TypingIndicatorWorker> f40660d;

    public /* synthetic */ Object get() {
        return m49738a();
    }

    public C12585n(Provider<C2652a> provider, Provider<C10333h> provider2, Provider<UpdatesScheduler> provider3, Provider<TypingIndicatorWorker> provider4) {
        this.f40657a = provider;
        this.f40658b = provider2;
        this.f40659c = provider3;
        this.f40660d = provider4;
    }

    /* renamed from: a */
    public C8280l m49738a() {
        return C12585n.m49736a(this.f40657a, this.f40658b, this.f40659c, this.f40660d);
    }

    /* renamed from: a */
    public static C8280l m49736a(Provider<C2652a> provider, Provider<C10333h> provider2, Provider<UpdatesScheduler> provider3, Provider<TypingIndicatorWorker> provider4) {
        return new C8280l((C2652a) provider.get(), (C10333h) provider2.get(), (UpdatesScheduler) provider3.get(), (TypingIndicatorWorker) provider4.get());
    }

    /* renamed from: b */
    public static C12585n m49737b(Provider<C2652a> provider, Provider<C10333h> provider2, Provider<UpdatesScheduler> provider3, Provider<TypingIndicatorWorker> provider4) {
        return new C12585n(provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static C8280l m49735a(C2652a c2652a, C10333h c10333h, UpdatesScheduler updatesScheduler, TypingIndicatorWorker typingIndicatorWorker) {
        return new C8280l(c2652a, c10333h, updatesScheduler, typingIndicatorWorker);
    }
}
