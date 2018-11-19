package com.tinder.application;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.chat.analytics.C10532i;
import com.tinder.chat.analytics.C12689f;
import com.tinder.chat.analytics.C12708y;
import com.tinder.chat.presenter.C12736q;
import com.tinder.chat.presenter.C8442a;
import com.tinder.chat.view.C10594b;
import com.tinder.chat.view.CensorOverflowMenu;
import com.tinder.domain.match.usecase.MuteMatch_Factory;
import com.tinder.domain.match.usecase.UnMuteMatch_Factory;
import com.tinder.match.analytics.recommend.AddDeeplinkShareIdEvent;
import com.tinder.module.CensorViewComponent;
import com.tinder.overflow.analytics.C13539b;
import com.tinder.profile.p363b.C17751d;
import com.tinder.profile.p363b.C17752f;
import com.tinder.profile.p363b.C17757t;
import dagger.internal.C17281c;
import javax.inject.Provider;

final class a$e implements CensorViewComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33506a;
    /* renamed from: b */
    private MuteMatch_Factory f33507b;
    /* renamed from: c */
    private UnMuteMatch_Factory f33508c;
    /* renamed from: d */
    private C17751d f33509d;
    /* renamed from: e */
    private C17752f f33510e;
    /* renamed from: f */
    private C17757t f33511f;
    /* renamed from: g */
    private C13539b f33512g;
    /* renamed from: h */
    private C12689f f33513h;
    /* renamed from: i */
    private C12708y f33514i;
    /* renamed from: j */
    private Provider<C8442a> f33515j;

    private a$e(C4423a c4423a, a$d a_d) {
        this.f33506a = c4423a;
        m41805a(a_d);
    }

    /* renamed from: a */
    private C10532i m41803a() {
        return new C10532i((C2630h) C4423a.u(this.f33506a).get(), C4423a.ar(this.f33506a));
    }

    /* renamed from: b */
    private AddDeeplinkShareIdEvent m41806b() {
        return new AddDeeplinkShareIdEvent((C2630h) C4423a.u(this.f33506a).get());
    }

    /* renamed from: a */
    private void m41805a(a$d a_d) {
        this.f33507b = MuteMatch_Factory.create(C4423a.as(this.f33506a));
        this.f33508c = UnMuteMatch_Factory.create(C4423a.as(this.f33506a));
        this.f33509d = C17751d.b(C4423a.u(this.f33506a));
        this.f33510e = C17752f.b(C4423a.u(this.f33506a));
        this.f33511f = C17757t.b(C4423a.u(this.f33506a), C4423a.j(this.f33506a));
        this.f33512g = C13539b.m52919b(C4423a.u(this.f33506a));
        this.f33513h = C12689f.m49985b(C4423a.u(this.f33506a), C4423a.at(this.f33506a), C4423a.au(this.f33506a));
        this.f33514i = C12708y.m50020b(C4423a.u(this.f33506a), C4423a.at(this.f33506a));
        this.f33515j = C17281c.a(C12736q.m50113b(C4423a.av(this.f33506a), C4423a.aj(this.f33506a), C4423a.aw(this.f33506a), this.f33507b, this.f33508c, this.f33509d, this.f33510e, C4423a.ax(this.f33506a), this.f33511f, this.f33512g, this.f33513h, this.f33514i));
    }

    public void inject(CensorOverflowMenu censorOverflowMenu) {
        m41804a(censorOverflowMenu);
    }

    /* renamed from: a */
    private CensorOverflowMenu m41804a(CensorOverflowMenu censorOverflowMenu) {
        C10594b.m42705a(censorOverflowMenu, (C8442a) this.f33515j.get());
        C10594b.m42704a(censorOverflowMenu, m41803a());
        C10594b.m42707a(censorOverflowMenu, C4423a.O(this.f33506a));
        C10594b.m42706a(censorOverflowMenu, m41806b());
        return censorOverflowMenu;
    }
}
