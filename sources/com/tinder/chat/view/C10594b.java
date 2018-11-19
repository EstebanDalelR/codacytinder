package com.tinder.chat.view;

import com.tinder.chat.analytics.C10532i;
import com.tinder.chat.presenter.C8442a;
import com.tinder.match.analytics.recommend.AddDeeplinkShareIdEvent;
import com.tinder.profile.p363b.C16093z;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.b */
public final class C10594b implements MembersInjector<CensorOverflowMenu> {
    /* renamed from: a */
    private final Provider<C8442a> f34443a;
    /* renamed from: b */
    private final Provider<C10532i> f34444b;
    /* renamed from: c */
    private final Provider<C16093z> f34445c;
    /* renamed from: d */
    private final Provider<AddDeeplinkShareIdEvent> f34446d;

    public /* synthetic */ void injectMembers(Object obj) {
        m42708a((CensorOverflowMenu) obj);
    }

    /* renamed from: a */
    public void m42708a(CensorOverflowMenu censorOverflowMenu) {
        C10594b.m42705a(censorOverflowMenu, (C8442a) this.f34443a.get());
        C10594b.m42704a(censorOverflowMenu, (C10532i) this.f34444b.get());
        C10594b.m42707a(censorOverflowMenu, (C16093z) this.f34445c.get());
        C10594b.m42706a(censorOverflowMenu, (AddDeeplinkShareIdEvent) this.f34446d.get());
    }

    /* renamed from: a */
    public static void m42705a(CensorOverflowMenu censorOverflowMenu, C8442a c8442a) {
        censorOverflowMenu.f41071a = c8442a;
    }

    /* renamed from: a */
    public static void m42704a(CensorOverflowMenu censorOverflowMenu, C10532i c10532i) {
        censorOverflowMenu.f41072b = c10532i;
    }

    /* renamed from: a */
    public static void m42707a(CensorOverflowMenu censorOverflowMenu, C16093z c16093z) {
        censorOverflowMenu.f41073c = c16093z;
    }

    /* renamed from: a */
    public static void m42706a(CensorOverflowMenu censorOverflowMenu, AddDeeplinkShareIdEvent addDeeplinkShareIdEvent) {
        censorOverflowMenu.f41074d = addDeeplinkShareIdEvent;
    }
}
