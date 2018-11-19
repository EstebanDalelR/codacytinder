package com.tinder.settings.data;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApi;
import com.tinder.data.p218g.p219a.C8663a;
import com.tinder.data.p218g.p220b.C8665a;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import com.tinder.domain.fastmatch.model.FastMatchConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.domain.pushnotifications.model.LikesYouNotificationSettingConfig;
import com.tinder.domain.pushnotifications.model.LikesYouPushNotificationSetting;
import com.tinder.domain.pushnotifications.model.PushNotificationSetting;
import com.tinder.domain.pushnotifications.model.PushNotificationType;
import com.tinder.domain.pushnotifications.model.SimplePushNotificationSetting;
import com.tinder.domain.settings.notifications.NotificationSettingsRepository;
import com.tinder.domain.settings.notifications.NotificationSettingsSource;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.p238f.p239a.C9363a;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eH\u0002J\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001e0\u0018H\u0016J\u0016\u0010%\u001a\u00020&2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J\u0016\u0010'\u001a\u00020&2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eH\u0002J\u0016\u0010(\u001a\u00020&2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eH\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0016H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/tinder/settings/data/NotificationSettingsDataRepository;", "Lcom/tinder/domain/settings/notifications/NotificationSettingsRepository;", "notificationSettingsSource", "Lcom/tinder/domain/settings/notifications/NotificationSettingsSource;", "gcmTokenProvider", "Lcom/tinder/data/settings/notifications/GCMTokenProvider;", "tinderApi", "Lcom/tinder/api/TinderApi;", "pushSettingsDomainApiAdapter", "Lcom/tinder/data/settings/adapter/PushSettingsDomainApiAdapter;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "crmAttributesReporter", "Lcom/tinder/meta/analytics/CrmAttributesReporter;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "placesAvailableProvider", "Lcom/tinder/domain/places/provider/PlacesAvailableProvider;", "handleTopPicksNotificationSettingChange", "Lcom/tinder/settings/data/HandleTopPicksNotificationSettingChange;", "(Lcom/tinder/domain/settings/notifications/NotificationSettingsSource;Lcom/tinder/data/settings/notifications/GCMTokenProvider;Lcom/tinder/api/TinderApi;Lcom/tinder/data/settings/adapter/PushSettingsDomainApiAdapter;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/meta/analytics/CrmAttributesReporter;Lcom/tinder/domain/config/TopPicksConfig;Lcom/tinder/domain/places/provider/PlacesAvailableProvider;Lcom/tinder/settings/data/HandleTopPicksNotificationSettingChange;)V", "likesYouNotificationSettingConfig", "Lcom/tinder/domain/pushnotifications/model/LikesYouNotificationSettingConfig;", "filterFastMatchNotification", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "pushNotifications", "filterPlacesNotification", "pushNotificationSettings", "", "filterTopPicksNotification", "isTypeEnabled", "", "pushNotificationType", "Lcom/tinder/domain/pushnotifications/model/PushNotificationType;", "observeNotificationSettings", "saveNotificationSettings", "Lio/reactivex/Completable;", "saveSettingsLocally", "saveSettingsRemotely", "setLikesYouNotificationSettingConfig", "", "config", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.data.c */
public final class C16626c implements NotificationSettingsRepository {
    /* renamed from: a */
    private LikesYouNotificationSettingConfig f51489a = new LikesYouNotificationSettingConfig(DefaultFastMatchValues.INSTANCE.getNOTIFICATION_OPTIONS(), 1);
    /* renamed from: b */
    private final NotificationSettingsSource f51490b;
    /* renamed from: c */
    private final C8665a f51491c;
    /* renamed from: d */
    private final TinderApi f51492d;
    /* renamed from: e */
    private final C8663a f51493e;
    /* renamed from: f */
    private final FastMatchConfigProvider f51494f;
    /* renamed from: g */
    private final C9363a f51495g;
    /* renamed from: h */
    private final TopPicksConfig f51496h;
    /* renamed from: i */
    private final PlacesAvailableProvider f51497i;
    /* renamed from: j */
    private final C16619a f51498j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "pushNotificationSettings", "fastMatchConfig", "Lcom/tinder/domain/fastmatch/model/FastMatchConfig;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.data.c$a */
    static final class C16620a<T1, T2, R> implements BiFunction<Set<PushNotificationSetting>, FastMatchConfig, Set<PushNotificationSetting>> {
        /* renamed from: a */
        final /* synthetic */ C16626c f51481a;

        C16620a(C16626c c16626c) {
            this.f51481a = c16626c;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m62064a((Set) obj, (FastMatchConfig) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final Set<PushNotificationSetting> m62064a(@NotNull Set<PushNotificationSetting> set, @NotNull FastMatchConfig fastMatchConfig) {
            C2668g.b(set, "pushNotificationSettings");
            C2668g.b(fastMatchConfig, "fastMatchConfig");
            if (fastMatchConfig.isEnabled() != null) {
                set.add(new LikesYouPushNotificationSetting(this.f51481a.f51490b.getLikesYouNotificationFrequency(), this.f51481a.f51489a));
            }
            return set;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "placesAvailable", "", "apply", "(Ljava/lang/Boolean;)Ljava/util/Set;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.data.c$b */
    static final class C16621b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ Set f51482a;

        C16621b(Set set) {
            this.f51482a = set;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62065a((Boolean) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Set<PushNotificationSetting> m62065a(@NotNull Boolean bool) {
            C2668g.b(bool, "placesAvailable");
            if (bool.booleanValue() != null) {
                return C19299w.m68845q((Iterable) this.f51482a);
            }
            Collection arrayList = new ArrayList();
            for (Object next : (Iterable) this.f51482a) {
                if ((((PushNotificationSetting) next).getType() != PushNotificationType.PLACES ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            return C19299w.m68845q((List) arrayList);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "it", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.data.c$c */
    static final class C16622c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16622c f51483a = new C16622c();

        C16622c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62066a((Set) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Set<PushNotificationSetting> m62066a(@NotNull Set<PushNotificationSetting> set) {
            C2668g.b(set, "it");
            return C19299w.m68842n(set);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.data.c$d */
    static final class C16623d implements Action {
        /* renamed from: a */
        final /* synthetic */ C16626c f51484a;
        /* renamed from: b */
        final /* synthetic */ Set f51485b;

        C16623d(C16626c c16626c, Set set) {
            this.f51484a = c16626c;
            this.f51485b = set;
        }

        public final void run() {
            for (PushNotificationSetting pushNotificationSetting : this.f51485b) {
                if (pushNotificationSetting instanceof SimplePushNotificationSetting) {
                    SimplePushNotificationSetting simplePushNotificationSetting = (SimplePushNotificationSetting) pushNotificationSetting;
                    if (simplePushNotificationSetting.getEnabled()) {
                        this.f51484a.f51490b.enablePushNotification(simplePushNotificationSetting.getPushNotificationType());
                    } else {
                        this.f51484a.f51490b.disablePushNotification(simplePushNotificationSetting.getPushNotificationType());
                    }
                } else if (pushNotificationSetting instanceof LikesYouPushNotificationSetting) {
                    LikesYouPushNotificationSetting likesYouPushNotificationSetting = (LikesYouPushNotificationSetting) pushNotificationSetting;
                    this.f51484a.f51490b.saveLikesYouNotificationFrequency(likesYouPushNotificationSetting.getFrequency());
                    this.f51484a.f51495g.a(likesYouPushNotificationSetting.getFrequency());
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.data.c$e */
    static final class C16624e implements Action {
        /* renamed from: a */
        final /* synthetic */ C16626c f51486a;

        C16624e(C16626c c16626c) {
            this.f51486a = c16626c;
        }

        public final void run() {
            this.f51486a.f51495g.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "token", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.data.c$f */
    static final class C16625f<T, R> implements Function<String, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C16626c f51487a;
        /* renamed from: b */
        final /* synthetic */ Set f51488b;

        C16625f(C16626c c16626c, Set set) {
            this.f51487a = c16626c;
            this.f51488b = set;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62067a((String) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m62067a(@NotNull String str) {
            C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
            str = this.f51487a.f51492d.updatePushSettings(str, this.f51487a.f51493e.a(this.f51488b));
            C2668g.a(str, "tinderApi\n              …gs)\n                    )");
            return RxJavaInteropExtKt.toV2Completable(str);
        }
    }

    @Inject
    public C16626c(@NotNull NotificationSettingsSource notificationSettingsSource, @NotNull C8665a c8665a, @NotNull TinderApi tinderApi, @NotNull C8663a c8663a, @NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull C9363a c9363a, @NotNull TopPicksConfig topPicksConfig, @NotNull PlacesAvailableProvider placesAvailableProvider, @NotNull C16619a c16619a) {
        C2668g.b(notificationSettingsSource, "notificationSettingsSource");
        C2668g.b(c8665a, "gcmTokenProvider");
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c8663a, "pushSettingsDomainApiAdapter");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        C2668g.b(c9363a, "crmAttributesReporter");
        C2668g.b(topPicksConfig, "topPicksConfig");
        C2668g.b(placesAvailableProvider, "placesAvailableProvider");
        C2668g.b(c16619a, "handleTopPicksNotificationSettingChange");
        this.f51490b = notificationSettingsSource;
        this.f51491c = c8665a;
        this.f51492d = tinderApi;
        this.f51493e = c8663a;
        this.f51494f = fastMatchConfigProvider;
        this.f51495g = c9363a;
        this.f51496h = topPicksConfig;
        this.f51497i = placesAvailableProvider;
        this.f51498j = c16619a;
    }

    public boolean isTypeEnabled(@NotNull PushNotificationType pushNotificationType) {
        C2668g.b(pushNotificationType, "pushNotificationType");
        return this.f51490b.isPushNotificationEnabled(pushNotificationType);
    }

    @NotNull
    public C3960g<Set<PushNotificationSetting>> observeNotificationSettings() {
        PushNotificationType[] values = PushNotificationType.values();
        Collection arrayList = new ArrayList();
        int length = values.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            PushNotificationType pushNotificationType = values[i];
            if (pushNotificationType == PushNotificationType.LIKES_YOU) {
                z = false;
            }
            if (z) {
                arrayList.add(pushNotificationType);
            }
            i++;
        }
        Iterable<PushNotificationType> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (PushNotificationType pushNotificationType2 : iterable) {
            arrayList2.add(new SimplePushNotificationSetting(pushNotificationType2, true, this.f51490b.isPushNotificationEnabled(pushNotificationType2)));
        }
        C16626c c16626c = this;
        C3960g<Set<PushNotificationSetting>> e = C3960g.a(C19299w.m68845q((List) arrayList2)).a(new C16627d(new NotificationSettingsDataRepository$observeNotificationSettings$1(c16626c))).a(new C16627d(new NotificationSettingsDataRepository$observeNotificationSettings$2(c16626c))).a(new C16627d(new NotificationSettingsDataRepository$observeNotificationSettings$3(c16626c))).e(C16622c.f51483a);
        C2668g.a(e, "Single.just(pushNotifica…      .map { it.toSet() }");
        return e;
    }

    @NotNull
    public C3956a saveNotificationSettings(@NotNull Set<? extends PushNotificationSetting> set) {
        C2668g.b(set, "pushNotificationSettings");
        set = m62069a((Set) set).b(m62072b((Set) set)).b(this.f51498j.m62063a((Set) set));
        C2668g.a(set, "saveSettingsRemotely(pus…ushNotificationSettings))");
        return set;
    }

    public void setLikesYouNotificationSettingConfig(@NotNull LikesYouNotificationSettingConfig likesYouNotificationSettingConfig) {
        C2668g.b(likesYouNotificationSettingConfig, "config");
        this.f51489a = likesYouNotificationSettingConfig;
    }

    /* renamed from: a */
    private final C3956a m62069a(Set<? extends PushNotificationSetting> set) {
        set = this.f51491c.a().d(new C16625f(this, set));
        C2668g.a(set, "gcmTokenProvider\n       …mpletable()\n            }");
        return set;
    }

    /* renamed from: b */
    private final C3956a m62072b(Set<? extends PushNotificationSetting> set) {
        set = C3956a.a(new C16623d(this, set)).b(new C16624e(this));
        C2668g.a(set, "Completable.fromAction {…er.sendPendingChanges() }");
        return set;
    }

    /* renamed from: c */
    private final C3960g<Set<PushNotificationSetting>> m62076c(Set<PushNotificationSetting> set) {
        SingleSource a = C3960g.a(set);
        Single a2 = this.f51494f.observe().h().a();
        C2668g.a(a2, "fastMatchConfigProvider.…erve().first().toSingle()");
        set = C3960g.a(a, RxJavaInteropExtKt.toV2Single(a2), new C16620a(this));
        C2668g.a(set, "Single.zip(\n            …onSettings\n            })");
        return set;
    }

    /* renamed from: d */
    private final C3960g<Set<PushNotificationSetting>> m62078d(Set<? extends PushNotificationSetting> set) {
        if (this.f51496h.getPushNotificationEnabled()) {
            set = C3960g.a(C19299w.m68845q(set));
            C2668g.a(set, "Single.just(pushNotifica…nSettings.toMutableSet())");
            return set;
        }
        Collection arrayList = new ArrayList();
        for (Object next : set) {
            if ((((PushNotificationSetting) next).getType() != PushNotificationType.TOP_PICKS ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        set = C3960g.a(C19299w.m68845q((List) arrayList));
        C2668g.a(set, "Single.just(\n           ….toMutableSet()\n        )");
        return set;
    }

    /* renamed from: e */
    private final C3960g<Set<PushNotificationSetting>> m62080e(Set<? extends PushNotificationSetting> set) {
        set = this.f51497i.observePlacesAvailable().b(Boolean.valueOf(false)).e(new C16621b(set));
        C2668g.a(set, "placesAvailableProvider.…          }\n            }");
        return set;
    }
}
