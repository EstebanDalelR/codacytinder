package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10587l;
import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.C8460f;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.f */
public final class C10613f implements MembersInjector<C10612e> {
    /* renamed from: a */
    private final Provider<C10588n> f34713a;
    /* renamed from: b */
    private final Provider<C8490z> f34714b;
    /* renamed from: c */
    private final Provider<C8460f> f34715c;
    /* renamed from: d */
    private final Provider<C10587l> f34716d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42834a((C10612e) obj);
    }

    /* renamed from: a */
    public void m42834a(C10612e c10612e) {
        C10613f.m42832a(c10612e, (C10588n) this.f34713a.get());
        C10613f.m42833a(c10612e, (C8490z) this.f34714b.get());
        C10613f.m42830a(c10612e, (C8460f) this.f34715c.get());
        C10613f.m42831a(c10612e, (C10587l) this.f34716d.get());
    }

    /* renamed from: a */
    public static void m42832a(C10612e c10612e, C10588n c10588n) {
        c10612e.f34702a = c10588n;
    }

    /* renamed from: a */
    public static void m42833a(C10612e c10612e, C8490z c8490z) {
        c10612e.f34703b = c8490z;
    }

    /* renamed from: a */
    public static void m42830a(C10612e c10612e, C8460f c8460f) {
        c10612e.f34704c = c8460f;
    }

    /* renamed from: a */
    public static void m42831a(C10612e c10612e, C10587l c10587l) {
        c10612e.f34705d = c10587l;
    }
}
