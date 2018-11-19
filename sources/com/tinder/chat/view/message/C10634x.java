package com.tinder.chat.view.message;

import com.tinder.chat.view.action.C10591r;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.message.x */
public final class C10634x implements MembersInjector<C10633w> {
    /* renamed from: a */
    private final Provider<C10591r> f34840a;
    /* renamed from: b */
    private final Provider<C8490z> f34841b;

    public /* synthetic */ void injectMembers(Object obj) {
        m42893a((C10633w) obj);
    }

    /* renamed from: a */
    public void m42893a(C10633w c10633w) {
        C10634x.m42891a(c10633w, (C10591r) this.f34840a.get());
        C10634x.m42892a(c10633w, (C8490z) this.f34841b.get());
    }

    /* renamed from: a */
    public static void m42891a(C10633w c10633w, C10591r c10591r) {
        c10633w.f34831b = c10591r;
    }

    /* renamed from: a */
    public static void m42892a(C10633w c10633w, C8490z c8490z) {
        c10633w.f34832c = c8490z;
    }
}
