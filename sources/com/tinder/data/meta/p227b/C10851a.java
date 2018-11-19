package com.tinder.data.meta.p227b;

import android.support.annotation.Nullable;
import com.tinder.api.TinderUserApi;
import com.tinder.api.model.common.User;
import com.tinder.api.model.meta.Meta;
import com.tinder.api.model.meta.Meta.Globals;
import com.tinder.api.model.meta.Meta.PlacesConfig;
import com.tinder.api.model.profile.Purchase;
import com.tinder.data.meta.p226a.C10845e;
import com.tinder.data.meta.p226a.C10846g;
import com.tinder.data.meta.p226a.C10847i;
import com.tinder.data.meta.p226a.C10849m;
import com.tinder.data.meta.p226a.C10850p;
import com.tinder.data.meta.store.MetaStore;
import com.tinder.data.p222i.C8669a;
import com.tinder.data.p222i.p354a.C12902a;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.injection.qualifiers.UtcOffsetMins;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.model.Configuration;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.LegacyMetaContainer;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.meta.model.ProfileSettings;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.pushnotifications.model.LikesYouNotificationSettingConfig;
import com.tinder.domain.settings.notifications.NotificationSettingsRepository;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.domain.toppicks.repo.TopPicksSettingRepository;
import com.tinder.domain.typingindicator.TypingIndicatorConfig;
import com.tinder.intropricing.domain.repo.IntroPricingApplicationRepository;
import hu.akarnokd.rxjava.interop.C15551e;
import java.util.Collections;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.functions.Function0;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.subjects.C19785a;
import rx.subjects.PublishSubject;

@Singleton
/* renamed from: com.tinder.data.meta.b.a */
public class C10851a implements MetaGateway {
    /* renamed from: a */
    private final TinderUserApi f35472a;
    /* renamed from: b */
    private final MetaStore f35473b;
    /* renamed from: c */
    private final C10845e f35474c;
    /* renamed from: d */
    private final C10846g f35475d;
    /* renamed from: e */
    private final C10847i f35476e;
    /* renamed from: f */
    private final FastMatchConfigProvider f35477f;
    /* renamed from: g */
    private final IntroPricingApplicationRepository f35478g;
    /* renamed from: h */
    private final C10849m f35479h;
    /* renamed from: i */
    private final SubscriptionProvider f35480i;
    @UtcOffsetMins
    /* renamed from: j */
    private final Function0<Integer> f35481j;
    /* renamed from: k */
    private final NotificationSettingsRepository f35482k;
    /* renamed from: l */
    private final C10850p f35483l;
    /* renamed from: m */
    private final TopPicksApplicationRepository f35484m;
    /* renamed from: n */
    private final TopPicksSettingRepository f35485n;
    /* renamed from: o */
    private final C8669a f35486o;
    /* renamed from: p */
    private final PlacesAvailableProvider f35487p;
    /* renamed from: q */
    private final C12902a f35488q;
    /* renamed from: r */
    private final PublishSubject<LegacyMetaContainer> f35489r = PublishSubject.w();
    /* renamed from: s */
    private final C19785a<CurrentUser> f35490s = C19785a.w();
    /* renamed from: t */
    private final C19785a<Optional<DiscoverySettings>> f35491t = C19785a.f(Optional.a());
    /* renamed from: u */
    private Optional<String> f35492u = Optional.a();

    /* renamed from: b */
    final /* synthetic */ Completable m43351b(Meta meta) {
        return m43336c(meta);
    }

    @Inject
    C10851a(TinderUserApi tinderUserApi, MetaStore metaStore, C10845e c10845e, C10846g c10846g, C10847i c10847i, FastMatchConfigProvider fastMatchConfigProvider, IntroPricingApplicationRepository introPricingApplicationRepository, C10849m c10849m, SubscriptionProvider subscriptionProvider, @UtcOffsetMins Function0<Integer> function0, NotificationSettingsRepository notificationSettingsRepository, C10850p c10850p, TopPicksApplicationRepository topPicksApplicationRepository, C8669a c8669a, PlacesAvailableProvider placesAvailableProvider, C12902a c12902a, TopPicksSettingRepository topPicksSettingRepository) {
        this.f35472a = tinderUserApi;
        this.f35473b = metaStore;
        this.f35474c = c10845e;
        this.f35475d = c10846g;
        this.f35476e = c10847i;
        this.f35477f = fastMatchConfigProvider;
        this.f35478g = introPricingApplicationRepository;
        this.f35479h = c10849m;
        this.f35480i = subscriptionProvider;
        this.f35481j = function0;
        this.f35482k = notificationSettingsRepository;
        this.f35484m = topPicksApplicationRepository;
        this.f35483l = c10850p;
        this.f35486o = c8669a;
        this.f35487p = placesAvailableProvider;
        this.f35488q = c12902a;
        this.f35485n = topPicksSettingRepository;
    }

    public Completable fetchMeta() {
        return this.f35472a.getMeta(((Integer) this.f35481j.invoke()).intValue()).b(new C13847b(this)).i(new C12973c(this)).b();
    }

    /* renamed from: a */
    final /* synthetic */ void m43349a(Meta meta) {
        if (!(meta.user() == null || meta.user().id() == null)) {
            m43332a(meta.user().id());
        }
        this.f35489r.onNext(new LegacyMetaContainer(meta));
    }

    public synchronized Optional<String> getUserId() {
        return this.f35492u;
    }

    public Observable<CurrentUser> observeCurrentUser() {
        if (this.f35490s.x() && this.f35490s.A() != CurrentUser.CURRENT_GUEST_USER) {
            return this.f35490s.e();
        }
        MetaStore metaStore = this.f35473b;
        metaStore.getClass();
        return Single.a(C8701m.m37163a(metaStore)).b(new C12980n(this));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m43346a(CurrentUser currentUser) {
        if (currentUser != null) {
            this.f35490s.onNext(currentUser);
            if (!this.f35492u.c()) {
                m43332a(currentUser.id());
            }
        }
        return this.f35490s.e();
    }

    public Observable<LegacyMetaContainer> observeMeta() {
        return this.f35489r.e();
    }

    public Observable<Configuration> observeConfiguration() {
        return Observable.c();
    }

    public Observable<ProfileSettings> observeProfileSettings() {
        return Observable.c();
    }

    public Observable<Optional<DiscoverySettings>> observeDiscoverySettings() {
        if (this.f35491t.x() && ((Optional) this.f35491t.A()).c()) {
            return this.f35491t.e();
        }
        DiscoverySettings discoverySettings = this.f35473b.getDiscoverySettings();
        if (discoverySettings != null) {
            this.f35491t.onNext(Optional.a(discoverySettings));
        }
        return this.f35491t.e();
    }

    public Completable updateDiscoverySettings(DiscoverySettings discoverySettings) {
        return Completable.a(new C13851o(this, discoverySettings));
    }

    /* renamed from: a */
    final /* synthetic */ void m43350a(DiscoverySettings discoverySettings) {
        this.f35473b.saveDiscoverySettings(discoverySettings);
        this.f35491t.onNext(Optional.a(discoverySettings));
    }

    @Deprecated
    public Observable<PlusControlSettings> observeTinderPlusSettings() {
        return Observable.c();
    }

    public Observable<Subscription> observeSubscription() {
        return this.f35480i.observe();
    }

    public Completable clear() {
        return Completable.a(new C13852p(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m43347a() {
        this.f35473b.clear();
        this.f35490s.onNext(CurrentUser.CURRENT_GUEST_USER);
        m43339d(Collections.emptyList());
        this.f35492u = Optional.a();
        this.f35491t.onNext(Optional.a());
    }

    /* renamed from: a */
    private synchronized void m43332a(String str) {
        this.f35492u = Optional.a(str);
    }

    /* renamed from: c */
    private Completable m43336c(Meta meta) {
        return Completable.b(new Completable[]{m43335c(meta.user()), m43341f(meta.globals()), m43338d(meta.globals()), m43340e(meta.globals()), m43339d(meta.purchases()), m43337d(meta.user()), m43342g(meta.globals()), m43331a(meta.places())});
    }

    /* renamed from: c */
    private Completable m43335c(User user) {
        return Completable.a(new C13853q(this, user));
    }

    /* renamed from: b */
    final /* synthetic */ void m43352b(User user) {
        user = this.f35474c.m43316a(user);
        this.f35473b.saveCurrentUser(user);
        this.f35490s.onNext(user);
    }

    /* renamed from: d */
    private Completable m43338d(@Nullable Globals globals) {
        return Completable.a(new C13854r(this, globals));
    }

    /* renamed from: c */
    final /* synthetic */ void m43356c(@Nullable Globals globals) {
        if (globals != null) {
            globals = this.f35483l.m43328a(globals);
            this.f35484m.setTopPicksEnabled(globals.isEnabled());
            this.f35484m.setNotificationMessage(globals.getNotificationMessage());
            this.f35484m.setAreNotificationsAllowed(globals.getAreNotificationsAllowed());
            this.f35485n.set(globals);
        }
    }

    /* renamed from: e */
    private Completable m43340e(@Nullable Globals globals) {
        return Completable.a(new C13855s(this, globals));
    }

    /* renamed from: b */
    final /* synthetic */ void m43353b(@Nullable Globals globals) {
        if (globals != null) {
            this.f35478g.setIntroPricingEnabled(globals.isIntroPricingEnabled());
        }
    }

    /* renamed from: f */
    private Completable m43341f(@Nullable Globals globals) {
        return Completable.a(new C13856t(this, globals));
    }

    /* renamed from: a */
    final /* synthetic */ void m43348a(@Nullable Globals globals) {
        if (globals != null) {
            globals = this.f35476e.m43321a(globals);
            this.f35482k.setLikesYouNotificationSettingConfig(new LikesYouNotificationSettingConfig(globals.getPushNotificationFrequencyOptions(), globals.getPushNotificationFrequencyDefault()));
            this.f35477f.updateWithSettings(globals);
        }
    }

    /* renamed from: d */
    private Completable m43339d(@Nullable List<Purchase> list) {
        return Single.a(list).d(C12974d.f41538a).c(new C12975e(this));
    }

    /* renamed from: c */
    static final /* synthetic */ List m43334c(List list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    final /* synthetic */ Completable m43345a(List list) {
        return Completable.a(new C13850l(this, list));
    }

    /* renamed from: b */
    final /* synthetic */ void m43355b(List list) {
        this.f35480i.update(this.f35479h.m43327b(list));
    }

    /* renamed from: d */
    private Completable m43337d(User user) {
        return Completable.a(new C12976f(this, user));
    }

    /* renamed from: a */
    final /* synthetic */ Completable m43343a(User user) {
        user = this.f35475d.m43319a(user);
        if (user != null) {
            return updateDiscoverySettings(user);
        }
        return Completable.a();
    }

    /* renamed from: g */
    private Completable m43342g(@Nullable Globals globals) {
        if (globals == null) {
            return Completable.a();
        }
        globals = Single.a(globals);
        C12902a c12902a = this.f35488q;
        c12902a.getClass();
        return globals.d(C12977g.m50725a(c12902a)).c(C13848h.f43910a).e(C12978i.f41543a).c(new C12979j(this));
    }

    /* renamed from: a */
    final /* synthetic */ Completable m43344a(TypingIndicatorConfig typingIndicatorConfig) {
        return Completable.a(new C13849k(this, typingIndicatorConfig));
    }

    /* renamed from: b */
    final /* synthetic */ void m43354b(TypingIndicatorConfig typingIndicatorConfig) {
        this.f35486o.m36941a(typingIndicatorConfig);
    }

    /* renamed from: a */
    private Completable m43331a(PlacesConfig placesConfig) {
        if (placesConfig == null || placesConfig.isAvailable() == null) {
            return Completable.a();
        }
        return C15551e.a(this.f35487p.setPlacesAvailable(placesConfig.isAvailable().booleanValue()));
    }
}
