package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10587l;
import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C8458c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.d */
public final class C10609d implements MembersInjector<C10608c> {
    /* renamed from: a */
    private final Provider<C10588n> f34692a;
    /* renamed from: b */
    private final Provider<C8490z> f34693b;
    /* renamed from: c */
    private final Provider<C8458c> f34694c;
    /* renamed from: d */
    private final Provider<C10587l> f34695d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42826a((C10608c) obj);
    }

    /* renamed from: a */
    public void m42826a(C10608c c10608c) {
        C10609d.m42824a(c10608c, (C10588n) this.f34692a.get());
        C10609d.m42825a(c10608c, (C8490z) this.f34693b.get());
        C10609d.m42822a(c10608c, (C8458c) this.f34694c.get());
        C10609d.m42823a(c10608c, (C10587l) this.f34695d.get());
    }

    /* renamed from: a */
    public static void m42824a(C10608c c10608c, C10588n c10588n) {
        c10608c.f34681a = c10588n;
    }

    /* renamed from: a */
    public static void m42825a(C10608c c10608c, C8490z c8490z) {
        c10608c.f34682b = c8490z;
    }

    /* renamed from: a */
    public static void m42822a(C10608c c10608c, C8458c c8458c) {
        c10608c.f34683c = c8458c;
    }

    /* renamed from: a */
    public static void m42823a(C10608c c10608c, C10587l c10587l) {
        c10608c.f34684d = c10587l;
    }
}
