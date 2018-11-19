package com.tinder.chat.view;

import com.tinder.chat.analytics.C10540v;
import com.tinder.chat.presenter.ag;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ao implements MembersInjector<ChatToolbar> {
    /* renamed from: a */
    private final Provider<ag> f34431a;
    /* renamed from: b */
    private final Provider<C8468c> f34432b;
    /* renamed from: c */
    private final Provider<C10540v> f34433c;

    public /* synthetic */ void injectMembers(Object obj) {
        m42693a((ChatToolbar) obj);
    }

    /* renamed from: a */
    public void m42693a(ChatToolbar chatToolbar) {
        m42691a(chatToolbar, (ag) this.f34431a.get());
        m42692a(chatToolbar, (C8468c) this.f34432b.get());
        m42690a(chatToolbar, (C10540v) this.f34433c.get());
    }

    /* renamed from: a */
    public static void m42691a(ChatToolbar chatToolbar, ag agVar) {
        chatToolbar.f34340a = agVar;
    }

    /* renamed from: a */
    public static void m42692a(ChatToolbar chatToolbar, C8468c c8468c) {
        chatToolbar.f34341b = c8468c;
    }

    /* renamed from: a */
    public static void m42690a(ChatToolbar chatToolbar, C10540v c10540v) {
        chatToolbar.f34342c = c10540v;
    }
}
