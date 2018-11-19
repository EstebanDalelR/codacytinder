package com.tinder.application;

import com.squareup.p070a.C2599b;
import com.tinder.api.module.LegacyNetworkModule;
import com.tinder.app.dagger.module.p161c.C8246a;
import com.tinder.app.dagger.module.p162d.C8247a;
import com.tinder.app.dagger.module.toppicks.TopPicksTinderApplicationModule;
import com.tinder.auth.C8266a;
import com.tinder.core.experiment.C2644k;
import com.tinder.crashindicator.p202a.C8600a;
import com.tinder.data.C8611a;
import com.tinder.data.boost.C8622c;
import com.tinder.data.crash.module.C8639a;
import com.tinder.data.feed.C8654e;
import com.tinder.data.loops.p223a.C8671a;
import com.tinder.data.p206a.p207a.C8610a;
import com.tinder.data.p210b.C8619c;
import com.tinder.data.p211c.p212a.C8635a;
import com.tinder.data.p216f.C8647a;
import com.tinder.domain.injection.modules.CommonDomainModule;
import com.tinder.domain.injection.modules.RxSchedulersModule;
import com.tinder.feed.p248c.C9460a;
import com.tinder.injection.p261a.C9707a;
import com.tinder.managers.ManagerApp;
import com.tinder.match.p292c.C9850a;
import com.tinder.module.C9939a;
import com.tinder.module.C9940d;
import com.tinder.module.FastMatchModule;
import com.tinder.module.TinderComponent;
import com.tinder.module.aa;
import com.tinder.module.at;
import com.tinder.module.au;
import com.tinder.module.bd;
import com.tinder.module.be;
import com.tinder.module.bg;
import com.tinder.module.ec;
import com.tinder.module.et;
import com.tinder.module.eu;
import com.tinder.module.ev;
import com.tinder.module.ew;
import com.tinder.module.ez;
import com.tinder.module.fb;
import com.tinder.module.fj;
import com.tinder.places.injection.C10212a;
import com.tinder.places.p310d.C10206a;
import com.tinder.purchase.PurchaseModule;
import com.tinder.recs.module.RecsModule;
import com.tinder.typingindicator.p438e.p439a.C15318a;
import com.tinder.typingindicator.p438e.p439a.C15319b;
import com.tinder.video.injection.p448a.C15414a;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {C9940d.class, C9939a.class, aa.class, at.class, C8266a.class, au.class, C8622c.class, bd.class, be.class, bg.class, C8654e.class, LegacyNetworkModule.class, C9707a.class, ec.class, C9850a.class, RecsModule.class, C8256b.class, ez.class, fb.class, fj.class, CommonDomainModule.class, com.tinder.data.message.be.class, RxSchedulersModule.class, FastMatchModule.class, C8610a.class, C8639a.class, C8600a.class, C8647a.class, ew.class, C10206a.class, C10212a.class, C15414a.class, et.class, C8247a.class, PurchaseModule.class, ev.class, TopPicksTinderApplicationModule.class, C8246a.class, C8619c.class, C8671a.class, eu.class, C8635a.class, C15319b.class, C9460a.class, C15318a.class, C8611a.class})
public interface ApplicationComponent extends TinderComponent {

    @dagger.Component.Builder
    public interface Builder {
        @BindsInstance
        Builder application(ManagerApp managerApp);

        ApplicationComponent build();

        @BindsInstance
        Builder leanplumAbTestVariables(C2644k c2644k);

        @BindsInstance
        Builder refWatcher(C2599b c2599b);
    }
}
