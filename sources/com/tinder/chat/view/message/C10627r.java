package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10587l;
import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C8458c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.r */
public final class C10627r implements MembersInjector<C10626q> {
    /* renamed from: a */
    private final Provider<C10588n> f34807a;
    /* renamed from: b */
    private final Provider<C8490z> f34808b;
    /* renamed from: c */
    private final Provider<C8458c> f34809c;
    /* renamed from: d */
    private final Provider<C10587l> f34810d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42876a((C10626q) obj);
    }

    /* renamed from: a */
    public void m42876a(C10626q c10626q) {
        C10627r.m42874a(c10626q, (C10588n) this.f34807a.get());
        C10627r.m42875a(c10626q, (C8490z) this.f34808b.get());
        C10627r.m42872a(c10626q, (C8458c) this.f34809c.get());
        C10627r.m42873a(c10626q, (C10587l) this.f34810d.get());
    }

    /* renamed from: a */
    public static void m42874a(C10626q c10626q, C10588n c10588n) {
        c10626q.f34796a = c10588n;
    }

    /* renamed from: a */
    public static void m42875a(C10626q c10626q, C8490z c8490z) {
        c10626q.f34797b = c8490z;
    }

    /* renamed from: a */
    public static void m42872a(C10626q c10626q, C8458c c8458c) {
        c10626q.f34798c = c8458c;
    }

    /* renamed from: a */
    public static void m42873a(C10626q c10626q, C10587l c10587l) {
        c10626q.f34799d = c10587l;
    }
}
