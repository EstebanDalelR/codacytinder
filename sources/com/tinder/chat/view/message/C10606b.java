package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10587l;
import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C8458c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.b */
public final class C10606b implements MembersInjector<C10599a> {
    /* renamed from: a */
    private final Provider<C10588n> f34636a;
    /* renamed from: b */
    private final Provider<C8490z> f34637b;
    /* renamed from: c */
    private final Provider<C8458c> f34638c;
    /* renamed from: d */
    private final Provider<C10587l> f34639d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42796a((C10599a) obj);
    }

    /* renamed from: a */
    public void m42796a(C10599a c10599a) {
        C10606b.m42794a(c10599a, (C10588n) this.f34636a.get());
        C10606b.m42795a(c10599a, (C8490z) this.f34637b.get());
        C10606b.m42792a(c10599a, (C8458c) this.f34638c.get());
        C10606b.m42793a(c10599a, (C10587l) this.f34639d.get());
    }

    /* renamed from: a */
    public static void m42794a(C10599a c10599a, C10588n c10588n) {
        c10599a.f34482a = c10588n;
    }

    /* renamed from: a */
    public static void m42795a(C10599a c10599a, C8490z c8490z) {
        c10599a.f34483b = c8490z;
    }

    /* renamed from: a */
    public static void m42792a(C10599a c10599a, C8458c c8458c) {
        c10599a.f34484c = c8458c;
    }

    /* renamed from: a */
    public static void m42793a(C10599a c10599a, C10587l c10587l) {
        c10599a.f34485d = c10587l;
    }
}
