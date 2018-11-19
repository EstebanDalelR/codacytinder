package com.tinder.chat.view.message;

import com.tinder.chat.view.action.ai;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class bf implements MembersInjector<be> {
    /* renamed from: a */
    private final Provider<ai> f34672a;
    /* renamed from: b */
    private final Provider<C8490z> f34673b;

    public /* synthetic */ void injectMembers(Object obj) {
        m42813a((be) obj);
    }

    /* renamed from: a */
    public void m42813a(be beVar) {
        m42811a(beVar, (ai) this.f34672a.get());
        m42812a(beVar, (C8490z) this.f34673b.get());
    }

    /* renamed from: a */
    public static void m42811a(be beVar, ai aiVar) {
        beVar.f34659b = aiVar;
    }

    /* renamed from: a */
    public static void m42812a(be beVar, C8490z c8490z) {
        beVar.f34660c = c8490z;
    }
}
