package com.tinder.chat.view;

import com.tinder.chat.analytics.C10540v;
import com.tinder.chat.presenter.an;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class as implements MembersInjector<EmptyChatViewContainer> {
    /* renamed from: a */
    private final Provider<an> f34440a;
    /* renamed from: b */
    private final Provider<C8468c> f34441b;
    /* renamed from: c */
    private final Provider<C10540v> f34442c;

    public /* synthetic */ void injectMembers(Object obj) {
        m42703a((EmptyChatViewContainer) obj);
    }

    /* renamed from: a */
    public void m42703a(EmptyChatViewContainer emptyChatViewContainer) {
        m42701a(emptyChatViewContainer, (an) this.f34440a.get());
        m42702a(emptyChatViewContainer, (C8468c) this.f34441b.get());
        m42700a(emptyChatViewContainer, (C10540v) this.f34442c.get());
    }

    /* renamed from: a */
    public static void m42701a(EmptyChatViewContainer emptyChatViewContainer, an anVar) {
        emptyChatViewContainer.f34348a = anVar;
    }

    /* renamed from: a */
    public static void m42702a(EmptyChatViewContainer emptyChatViewContainer, C8468c c8468c) {
        emptyChatViewContainer.f34349b = c8468c;
    }

    /* renamed from: a */
    public static void m42700a(EmptyChatViewContainer emptyChatViewContainer, C10540v c10540v) {
        emptyChatViewContainer.f34350c = c10540v;
    }
}
