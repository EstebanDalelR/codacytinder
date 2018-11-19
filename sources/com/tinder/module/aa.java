package com.tinder.module;

import android.content.Context;
import com.tinder.analytics.C2634g;
import com.tinder.analytics.C6233k;
import com.tinder.analytics.C7334i;
import com.tinder.analytics.C7335j;
import com.tinder.analytics.CrmEventTracker;
import com.tinder.analytics.ThirdPartyLocationUpdatesListener;
import com.tinder.analytics.attribution.C3916g;
import com.tinder.analytics.attribution.C6209l;
import com.tinder.analytics.fireworks.BatchScheduleStrategy;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.fireworks.C2630h.C2629a;
import com.tinder.analytics.fireworks.C7321b;
import com.tinder.analytics.fireworks.C7322d;
import com.tinder.analytics.fireworks.C7329e;
import com.tinder.analytics.fireworks.C7330k;
import com.tinder.analytics.fireworks.C7331s;
import com.tinder.analytics.fireworks.C7332t;
import com.tinder.analytics.fireworks.FireworksNetworkClient;
import com.tinder.analytics.fireworks.FireworksRepository;
import com.tinder.analytics.fireworks.FireworksSyncListener;
import com.tinder.analytics.fireworks.api.C6224b;
import com.tinder.analytics.fireworks.api.RetrofitFireworksNetworkClient.C6222b;
import com.tinder.analytics.fireworks.data.C6229j;
import com.tinder.analytics.fireworks.data.C7324b;
import com.tinder.analytics.p152a.C7309c;
import com.tinder.analytics.p153b.C6212b;
import com.tinder.analytics.p153b.C7317d;
import com.tinder.analytics.performance.af;
import com.tinder.api.module.OkHttpModule;
import com.tinder.auth.p168c.C10330a;
import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10686e;
import com.tinder.common.navigation.Screen.Matches;
import com.tinder.common.navigation.Screen.Matches.Subscreen;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.injection.qualifiers.FeedRequestFirstItemPosition;
import com.tinder.domain.injection.qualifiers.FeedRequestLastItemPosition;
import com.tinder.feed.p341b.C11695a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.pushnotifications.PushReceiveBugInterceptor;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import java.util.concurrent.CyclicBarrier;
import javax.inject.Named;
import javax.inject.Singleton;
import okhttp3.C17692o.C15961a;
import rx.schedulers.Schedulers;

@Module(includes = {OkHttpModule.class, C6209l.class})
public class aa {
    @Singleton
    @Provides
    /* renamed from: a */
    ManagerAnalytics m40774a(C2630h c2630h, C7309c c7309c) {
        return new ManagerAnalytics(c2630h, c7309c);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    C2634g m40770a(C6233k c6233k) {
        return new C2634g(c6233k);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    C6233k m40771a() {
        return new C6233k();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    C2630h m40768a(C7330k c7330k, FireworksNetworkClient fireworksNetworkClient, BatchScheduleStrategy batchScheduleStrategy, C7322d c7322d, C7317d c7317d, C3916g c3916g, PushReceiveBugInterceptor pushReceiveBugInterceptor, C10330a c10330a, FireworksSyncListener fireworksSyncListener) {
        return new C2629a().a(c7330k).a(fireworksNetworkClient).a(batchScheduleStrategy).a(fireworksSyncListener).a(c7322d).a(c7317d).a(c3916g).a(pushReceiveBugInterceptor).a(c10330a).a();
    }

    @Provides
    /* renamed from: b */
    FireworksSyncListener m40775b() {
        return new C7331s();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    C7322d m40766a(C7329e c7329e, C7321b c7321b) {
        return new C7322d(c7329e, c7321b);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    C6229j m40767a(@ForApplication Context context) {
        return new C6229j(context);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    FireworksRepository m40765a(C6229j c6229j) {
        return new C7324b(c6229j);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    C7330k m40769a(FireworksRepository fireworksRepository) {
        return new C7330k(fireworksRepository, Schedulers.io());
    }

    @Singleton
    @Provides
    /* renamed from: a */
    FireworksNetworkClient m40764a(C15961a c15961a, C6224b c6224b) {
        return new C6222b(c15961a, c6224b.a()).a();
    }

    @Singleton
    @Provides
    /* renamed from: c */
    BatchScheduleStrategy m40777c() {
        return new C7332t(Schedulers.newThread());
    }

    @Singleton
    @Provides
    /* renamed from: a */
    com.tinder.analytics.performance.aa m40772a(C2630h c2630h, AbTestUtility abTestUtility) {
        return new com.tinder.analytics.performance.aa(c2630h, abTestUtility);
    }

    @Singleton
    @Provides
    /* renamed from: b */
    af m40776b(C2630h c2630h, AbTestUtility abTestUtility) {
        return new af(c2630h, abTestUtility);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    CrmEventTracker m40763a(C6212b c6212b) {
        return new C7334i(c6212b);
    }

    @Singleton
    @FeedRequestFirstItemPosition
    @Provides
    /* renamed from: d */
    CyclicBarrier m40778d() {
        return new CyclicBarrier(2);
    }

    @Singleton
    @FeedRequestLastItemPosition
    @Provides
    /* renamed from: e */
    CyclicBarrier m40779e() {
        return new CyclicBarrier(2);
    }

    @Provides
    @Named("FeedScreen")
    /* renamed from: a */
    Screen m40773a(C11695a c11695a) {
        if (c11695a.m47525d() != null) {
            return C10686e.f35027a;
        }
        return new Matches(Subscreen.FEED);
    }

    @Singleton
    @IntoSet
    @Provides
    /* renamed from: f */
    ThirdPartyLocationUpdatesListener m40780f() {
        return new C7335j();
    }
}
