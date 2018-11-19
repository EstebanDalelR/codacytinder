package com.tinder.reactions.chat.presenter;

import com.tinder.chat.view.provider.ChatEmptyStateProvider;
import com.tinder.chat.view.provider.ChatNewMessagesProvider;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.managers.bk;
import com.tinder.reactions.analytics.C16272a;
import com.tinder.reactions.analytics.C16274d;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.p385c.C16284c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.chat.presenter.f */
public final class C17956f implements Factory<C14605d> {
    /* renamed from: a */
    private final Provider<String> f55877a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f55878b;
    /* renamed from: c */
    private final Provider<C14641a> f55879c;
    /* renamed from: d */
    private final Provider<ChatNewMessagesProvider> f55880d;
    /* renamed from: e */
    private final Provider<ChatEmptyStateProvider> f55881e;
    /* renamed from: f */
    private final Provider<CheckTutorialViewed> f55882f;
    /* renamed from: g */
    private final Provider<bk> f55883g;
    /* renamed from: h */
    private final Provider<C16284c> f55884h;
    /* renamed from: i */
    private final Provider<C16274d> f55885i;
    /* renamed from: j */
    private final Provider<C16272a> f55886j;

    public /* synthetic */ Object get() {
        return m65285a();
    }

    public C17956f(Provider<String> provider, Provider<AbTestUtility> provider2, Provider<C14641a> provider3, Provider<ChatNewMessagesProvider> provider4, Provider<ChatEmptyStateProvider> provider5, Provider<CheckTutorialViewed> provider6, Provider<bk> provider7, Provider<C16284c> provider8, Provider<C16274d> provider9, Provider<C16272a> provider10) {
        this.f55877a = provider;
        this.f55878b = provider2;
        this.f55879c = provider3;
        this.f55880d = provider4;
        this.f55881e = provider5;
        this.f55882f = provider6;
        this.f55883g = provider7;
        this.f55884h = provider8;
        this.f55885i = provider9;
        this.f55886j = provider10;
    }

    /* renamed from: a */
    public C14605d m65285a() {
        return C17956f.m65283a(this.f55877a, this.f55878b, this.f55879c, this.f55880d, this.f55881e, this.f55882f, this.f55883g, this.f55884h, this.f55885i, this.f55886j);
    }

    /* renamed from: a */
    public static C14605d m65283a(Provider<String> provider, Provider<AbTestUtility> provider2, Provider<C14641a> provider3, Provider<ChatNewMessagesProvider> provider4, Provider<ChatEmptyStateProvider> provider5, Provider<CheckTutorialViewed> provider6, Provider<bk> provider7, Provider<C16284c> provider8, Provider<C16274d> provider9, Provider<C16272a> provider10) {
        return new C14605d((String) provider.get(), (AbTestUtility) provider2.get(), (C14641a) provider3.get(), (ChatNewMessagesProvider) provider4.get(), (ChatEmptyStateProvider) provider5.get(), (CheckTutorialViewed) provider6.get(), (bk) provider7.get(), (C16284c) provider8.get(), (C16274d) provider9.get(), (C16272a) provider10.get());
    }

    /* renamed from: b */
    public static C17956f m65284b(Provider<String> provider, Provider<AbTestUtility> provider2, Provider<C14641a> provider3, Provider<ChatNewMessagesProvider> provider4, Provider<ChatEmptyStateProvider> provider5, Provider<CheckTutorialViewed> provider6, Provider<bk> provider7, Provider<C16284c> provider8, Provider<C16274d> provider9, Provider<C16272a> provider10) {
        return new C17956f(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }
}
