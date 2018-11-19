package com.tinder.profiletab.p369c;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.profile.usecase.LoadDiscoverySettings;
import com.tinder.domain.settings.loops.model.AutoPlayVideoSettingsOption;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.etl.event.zw;
import io.reactivex.C3960g;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;
import rx.functions.Func1;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/profiletab/usecase/AddUserInteractionSettingsEvent;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "loadDiscoverySettings", "Lcom/tinder/domain/profile/usecase/LoadDiscoverySettings;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "topPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "autoPlaySettingsRepository", "Lcom/tinder/domain/settings/loops/repository/AutoPlayVideoSettingsRepository;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/profile/usecase/LoadDiscoverySettings;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;Lcom/tinder/domain/settings/loops/repository/AutoPlayVideoSettingsRepository;)V", "buildEvent", "Lcom/tinder/etl/event/UserInteractionSettingsEvent;", "discoverySettings", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "videoSettingsOption", "Lcom/tinder/domain/settings/loops/model/AutoPlayVideoSettingsOption;", "createEvent", "Lrx/Single;", "execute", "Lrx/Completable;", "resolveAutoPlaySettings", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profiletab.c.a */
public final class C16173a implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final C2630h f50366a;
    /* renamed from: b */
    private final LoadDiscoverySettings f50367b;
    /* renamed from: c */
    private final FastMatchConfigProvider f50368c;
    /* renamed from: d */
    private final TopPicksApplicationRepository f50369d;
    /* renamed from: e */
    private final AutoPlayVideoSettingsRepository f50370e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/UserInteractionSettingsEvent;", "discoverySettings", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "kotlin.jvm.PlatformType", "videoSettingsOption", "Lcom/tinder/domain/settings/loops/model/AutoPlayVideoSettingsOption;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.c.a$a */
    static final class C17777a<T1, T2, R> implements Func2<T1, T2, R> {
        /* renamed from: a */
        final /* synthetic */ C16173a f55472a;

        C17777a(C16173a c16173a) {
            this.f55472a = c16173a;
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m64971a((DiscoverySettings) obj, (AutoPlayVideoSettingsOption) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final zw m64971a(DiscoverySettings discoverySettings, AutoPlayVideoSettingsOption autoPlayVideoSettingsOption) {
            C16173a c16173a = this.f55472a;
            C2668g.a(discoverySettings, "discoverySettings");
            C2668g.a(autoPlayVideoSettingsOption, "videoSettingsOption");
            return c16173a.m61101a(discoverySettings, autoPlayVideoSettingsOption);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/etl/event/UserInteractionSettingsEvent;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.c.a$b */
    static final class C17778b<T, R> implements Func1<zw, Completable> {
        /* renamed from: a */
        final /* synthetic */ C16173a f55473a;

        C17778b(C16173a c16173a) {
            this.f55473a = c16173a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m64972a((zw) obj);
        }

        /* renamed from: a */
        public final Completable m64972a(final zw zwVar) {
            return Completable.a(new Callable<Object>() {
                public /* synthetic */ Object call() {
                    m55195a();
                    return C15813i.f49016a;
                }

                /* renamed from: a */
                public final void m55195a() {
                    this.f55473a.f50366a.a(zwVar);
                }
            });
        }
    }

    @Inject
    public C16173a(@NotNull C2630h c2630h, @NotNull LoadDiscoverySettings loadDiscoverySettings, @NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull TopPicksApplicationRepository topPicksApplicationRepository, @NotNull AutoPlayVideoSettingsRepository autoPlayVideoSettingsRepository) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(loadDiscoverySettings, "loadDiscoverySettings");
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        C2668g.b(topPicksApplicationRepository, "topPicksApplicationRepository");
        C2668g.b(autoPlayVideoSettingsRepository, "autoPlaySettingsRepository");
        this.f50366a = c2630h;
        this.f50367b = loadDiscoverySettings;
        this.f50368c = fastMatchConfigProvider;
        this.f50369d = topPicksApplicationRepository;
        this.f50370e = autoPlayVideoSettingsRepository;
    }

    @NotNull
    public Completable execute() {
        Completable c = m61103a().c(new C17778b(this));
        C2668g.a(c, "createEvent()\n          …Event(it) }\n            }");
        return c;
    }

    /* renamed from: a */
    private final Single<zw> m61103a() {
        Single<zw> a = Single.a(RxJavaInteropExtKt.toV1Single(this.f50367b.execute()), m61104b(), new C17777a(this));
        C2668g.a(a, "Single.zip(loadDiscovery…ngsOption)\n            })");
        return a;
    }

    /* renamed from: b */
    private final Single<AutoPlayVideoSettingsOption> m61104b() {
        C3960g first = this.f50370e.observe().first(AutoPlayVideoSettingsOption.ON_WIFI_AND_MOBILE_DATA);
        C2668g.a(first, "autoPlaySettingsReposito….ON_WIFI_AND_MOBILE_DATA)");
        return RxJavaInteropExtKt.toV1Single(first);
    }

    /* renamed from: a */
    private final zw m61101a(DiscoverySettings discoverySettings, AutoPlayVideoSettingsOption autoPlayVideoSettingsOption) {
        discoverySettings = zw.a().e(Integer.valueOf(discoverySettings.minAgeFilter())).d(Integer.valueOf(discoverySettings.maxAgeFilter())).a(Boolean.valueOf(discoverySettings.isDiscoverable())).b(Boolean.valueOf(this.f50369d.isDailyPushEnabled())).c(Integer.valueOf(this.f50368c.get().getCurrentPushNotificationFrequency())).g(Integer.valueOf(discoverySettings.distanceFilter())).a(Integer.valueOf(autoPlayVideoSettingsOption.getAutoPlayLoopMappedValue())).a();
        C2668g.a(discoverySettings, "builder\n            .min…lue)\n            .build()");
        return discoverySettings;
    }
}
