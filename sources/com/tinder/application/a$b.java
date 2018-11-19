package com.tinder.application;

import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.domain.loops.usecase.UpdateAutoPlayLoopsSettingsOption_Factory;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bq;
import com.tinder.managers.bt;
import com.tinder.purchase.register.Register;
import com.tinder.settings.loops.activity.AutoPlayLoopsOptionsActivity;
import com.tinder.settings.loops.activity.C16646b;
import com.tinder.settings.loops.injection.AutoPlayLoopsOptionsActivityComponent;
import com.tinder.settings.loops.p407a.C14883a;
import com.tinder.settings.loops.p407a.C18072b;
import com.tinder.updates.UpdatesScheduler;
import dagger.internal.C17281c;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

final class a$b implements AutoPlayLoopsOptionsActivityComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33450a;
    /* renamed from: b */
    private UpdateAutoPlayLoopsSettingsOption_Factory f33451b;
    /* renamed from: c */
    private Provider<C14883a> f33452c;

    private a$b(C4423a c4423a, a$a a_a) {
        this.f33450a = c4423a;
        m41747a(a_a);
    }

    /* renamed from: a */
    private void m41747a(a$a a_a) {
        this.f33451b = UpdateAutoPlayLoopsSettingsOption_Factory.create(C4423a.dF(this.f33450a));
        this.f33452c = C17281c.a(C18072b.b(C4423a.dF(this.f33450a), this.f33451b));
    }

    public void inject(AutoPlayLoopsOptionsActivity autoPlayLoopsOptionsActivity) {
        m41746a(autoPlayLoopsOptionsActivity);
    }

    /* renamed from: a */
    private AutoPlayLoopsOptionsActivity m41746a(AutoPlayLoopsOptionsActivity autoPlayLoopsOptionsActivity) {
        C10358b.m42176a((ActivityBase) autoPlayLoopsOptionsActivity, (bk) C4423a.j(this.f33450a).get());
        C10358b.m42174a((ActivityBase) autoPlayLoopsOptionsActivity, (C2652a) C4423a.k(this.f33450a).get());
        C10358b.m42173a((ActivityBase) autoPlayLoopsOptionsActivity, (UserMetaManager) C4423a.l(this.f33450a).get());
        C10358b.m42172a((ActivityBase) autoPlayLoopsOptionsActivity, (ManagerFusedLocation) C4423a.m(this.f33450a).get());
        C10358b.m42177a((ActivityBase) autoPlayLoopsOptionsActivity, (bt) C4423a.h(this.f33450a).get());
        C10358b.m42175a((ActivityBase) autoPlayLoopsOptionsActivity, (af) C4423a.n(this.f33450a).get());
        C10358b.m42178a((ActivityBase) autoPlayLoopsOptionsActivity, (C2664c) C4423a.o(this.f33450a).get());
        C10358b.m42171a((ActivityBase) autoPlayLoopsOptionsActivity, (ManagerAnalytics) C4423a.p(this.f33450a).get());
        C10363g.m42184a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, (bk) C4423a.j(this.f33450a).get());
        C10363g.m42183a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, (ManagerProfile) C4423a.v(this.f33450a).get());
        C10363g.m42191a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, (UpdatesScheduler) C4423a.w(this.f33450a).get());
        C10363g.m42182a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, (ManagerDeepLinking) C4423a.x(this.f33450a).get());
        C10363g.m42185a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, (bq) C4423a.y(this.f33450a).get());
        C10363g.m42187a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, C4423a.z(this.f33450a));
        C10363g.m42186a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, C4423a.A(this.f33450a));
        C10363g.m42192a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, (C2664c) C4423a.B(this.f33450a).get());
        C10363g.m42189a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, (Register) C4423a.C(this.f33450a).get());
        C10363g.m42181a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, (C8259d) C4423a.D(this.f33450a).get());
        C10363g.m42188a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, C4423a.E(this.f33450a));
        C10363g.m42190a((ActivitySignedInBase) autoPlayLoopsOptionsActivity, C4423a.F(this.f33450a));
        C16646b.a(autoPlayLoopsOptionsActivity, (C14883a) this.f33452c.get());
        return autoPlayLoopsOptionsActivity;
    }
}
