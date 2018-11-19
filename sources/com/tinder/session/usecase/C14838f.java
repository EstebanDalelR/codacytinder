package com.tinder.session.usecase;

import com.bumptech.glide.RequestManager;
import com.tinder.analytics.C8000b;
import com.tinder.analytics.attribution.AttributionTracker;
import com.tinder.api.ManagerWebServices;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.auth.UserAttribute;
import com.tinder.domain.profile.model.Products;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.SyncProfileData;
import com.tinder.domain.session.SessionState;
import com.tinder.interactors.C9719k;
import com.tinder.managers.UserMetaManager;
import com.tinder.model.User;
import com.tinder.model.UserMeta;
import com.tinder.purchase.usecase.C16245c;
import com.tinder.screenshot.C16559a;
import com.tinder.screenshot.analytics.C16566d;
import com.tinder.session.analytics.C16579a;
import com.tinder.session.p474a.C16576a;
import com.tinder.utils.C15363n;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\b\u0010\u0010\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\b\u0010)\u001a\u00020\"H\u0002J\u0010\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/tinder/session/usecase/StartSession;", "", "userMetaManager", "Lcom/tinder/managers/UserMetaManager;", "glideRequestManager", "Lcom/bumptech/glide/RequestManager;", "analyticsReporter", "Lcom/tinder/session/usecase/AppSessionAnalyticsReporter;", "profileInteractor", "Lcom/tinder/interactors/ProfileInteractor;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "syncProfileData", "Lcom/tinder/domain/profile/usecase/SyncProfileData;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "loadOffers", "Lcom/tinder/purchase/usecase/LoadOffers;", "attributionTracker", "Lcom/tinder/analytics/attribution/AttributionTracker;", "addUserEvent", "Lcom/tinder/session/analytics/AddUserEvent;", "syncRevenueData", "Lcom/tinder/session/usecase/ForegroundSyncRevenueData;", "sessionStateProvider", "Lcom/tinder/session/provider/SessionStateProvider;", "monitorForScreenshots", "Lcom/tinder/screenshot/MonitorForScreenshots;", "observeScreenshotsForAnalytics", "Lcom/tinder/screenshot/analytics/ObserveScreenshotsForAnalytics;", "addStartSessionEvent", "Lcom/tinder/analytics/AddStartSessionEvent;", "(Lcom/tinder/managers/UserMetaManager;Lcom/bumptech/glide/RequestManager;Lcom/tinder/session/usecase/AppSessionAnalyticsReporter;Lcom/tinder/interactors/ProfileInteractor;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/domain/profile/usecase/SyncProfileData;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/purchase/usecase/LoadOffers;Lcom/tinder/analytics/attribution/AttributionTracker;Lcom/tinder/session/analytics/AddUserEvent;Lcom/tinder/session/usecase/ForegroundSyncRevenueData;Lcom/tinder/session/provider/SessionStateProvider;Lcom/tinder/screenshot/MonitorForScreenshots;Lcom/tinder/screenshot/analytics/ObserveScreenshotsForAnalytics;Lcom/tinder/analytics/AddStartSessionEvent;)V", "execute", "", "userAttribute", "Lcom/tinder/domain/auth/UserAttribute;", "Lio/reactivex/Completable;", "preFetchUserImage", "user", "Lcom/tinder/model/User;", "startMonitoringForScreenshots", "trackUserAttribute", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.session.usecase.f */
public final class C14838f {
    /* renamed from: a */
    private final UserMetaManager f46456a;
    /* renamed from: b */
    private final RequestManager f46457b;
    /* renamed from: c */
    private final C14835a f46458c;
    /* renamed from: d */
    private final C9719k f46459d;
    /* renamed from: e */
    private final AbTestUtility f46460e;
    /* renamed from: f */
    private final SyncProfileData f46461f;
    /* renamed from: g */
    private final LoadProfileOptionData f46462g;
    /* renamed from: h */
    private final C16245c f46463h;
    /* renamed from: i */
    private final AttributionTracker f46464i;
    /* renamed from: j */
    private final C16579a f46465j;
    /* renamed from: k */
    private final C14837d f46466k;
    /* renamed from: l */
    private final C16576a f46467l;
    /* renamed from: m */
    private final C16559a f46468m;
    /* renamed from: n */
    private final C16566d f46469n;
    /* renamed from: o */
    private final C8000b f46470o;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "throwable", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.usecase.f$d */
    static final class C16586d<T, R> implements Function<Throwable, CompletableSource> {
        /* renamed from: a */
        public static final C16586d f51288a = new C16586d();

        C16586d() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62018a((Throwable) obj);
        }

        /* renamed from: a */
        public final C3956a m62018a(@NotNull Throwable th) {
            C2668g.b(th, "throwable");
            C0001a.c(th);
            return C3956a.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.usecase.f$e */
    static final class C16587e implements Action {
        /* renamed from: a */
        public static final C16587e f51289a = new C16587e();

        C16587e() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.usecase.f$f */
    static final class C16588f implements Action {
        /* renamed from: a */
        public static final C16588f f51290a = new C16588f();

        C16588f() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "products", "Lcom/tinder/domain/profile/model/Products;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.usecase.f$g */
    static final class C16589g<T, R> implements Function<Products, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C14838f f51291a;

        C16589g(C14838f c14838f) {
            this.f51291a = c14838f;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62019a((Products) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m62019a(@NotNull Products products) {
            C2668g.b(products, ManagerWebServices.PARAM_PRODUCTS);
            return this.f51291a.f46463h.m61398a(products);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.usecase.f$a */
    static final class C18825a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C14838f f58365a;

        C18825a(C14838f c14838f) {
            this.f58365a = c14838f;
        }

        public final void call() {
            this.f58365a.f46465j.execute();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "userMeta", "Lcom/tinder/model/UserMeta;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.usecase.f$b */
    static final class C18826b<T> implements Action1<UserMeta> {
        /* renamed from: a */
        final /* synthetic */ C14838f f58366a;
        /* renamed from: b */
        final /* synthetic */ UserAttribute f58367b;

        C18826b(C14838f c14838f, UserAttribute userAttribute) {
            this.f58366a = c14838f;
            this.f58367b = userAttribute;
        }

        public /* synthetic */ void call(Object obj) {
            m67277a((UserMeta) obj);
        }

        /* renamed from: a */
        public final void m67277a(UserMeta userMeta) {
            this.f58366a.f46459d.a();
            this.f58366a.f46458c.m56204a();
            this.f58366a.m56216b(this.f58367b);
            C14838f c14838f = this.f58366a;
            C2668g.a(userMeta, "userMeta");
            c14838f.m56211a(userMeta.getUser());
            this.f58366a.f46470o.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.usecase.f$c */
    static final class C18827c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18827c f58368a = new C18827c();

        C18827c() {
        }

        public /* synthetic */ void call(Object obj) {
            m67278a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67278a(Throwable th) {
            C0001a.b(th, "Error retrieving meta after login", new Object[0]);
        }
    }

    @Inject
    public C14838f(@NotNull UserMetaManager userMetaManager, @NotNull RequestManager requestManager, @NotNull C14835a c14835a, @NotNull C9719k c9719k, @NotNull AbTestUtility abTestUtility, @NotNull SyncProfileData syncProfileData, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull C16245c c16245c, @NotNull AttributionTracker attributionTracker, @NotNull C16579a c16579a, @NotNull C14837d c14837d, @NotNull C16576a c16576a, @NotNull C16559a c16559a, @NotNull C16566d c16566d, @NotNull C8000b c8000b) {
        C14838f c14838f = this;
        UserMetaManager userMetaManager2 = userMetaManager;
        RequestManager requestManager2 = requestManager;
        C14835a c14835a2 = c14835a;
        C9719k c9719k2 = c9719k;
        AbTestUtility abTestUtility2 = abTestUtility;
        SyncProfileData syncProfileData2 = syncProfileData;
        LoadProfileOptionData loadProfileOptionData2 = loadProfileOptionData;
        C16245c c16245c2 = c16245c;
        AttributionTracker attributionTracker2 = attributionTracker;
        C16579a c16579a2 = c16579a;
        C14837d c14837d2 = c14837d;
        C16576a c16576a2 = c16576a;
        C16559a c16559a2 = c16559a;
        C16566d c16566d2 = c16566d;
        C8000b c8000b2 = c8000b;
        C2668g.b(userMetaManager2, "userMetaManager");
        C2668g.b(requestManager2, "glideRequestManager");
        C2668g.b(c14835a2, "analyticsReporter");
        C2668g.b(c9719k2, "profileInteractor");
        C2668g.b(abTestUtility2, "abTestUtility");
        C2668g.b(syncProfileData2, "syncProfileData");
        C2668g.b(loadProfileOptionData2, "loadProfileOptionData");
        C2668g.b(c16245c2, "loadOffers");
        C2668g.b(attributionTracker2, "attributionTracker");
        C2668g.b(c16579a2, "addUserEvent");
        C2668g.b(c14837d2, "syncRevenueData");
        C2668g.b(c16576a2, "sessionStateProvider");
        C2668g.b(c16559a2, "monitorForScreenshots");
        C2668g.b(c16566d2, "observeScreenshotsForAnalytics");
        C2668g.b(c8000b2, "addStartSessionEvent");
        this.f46456a = userMetaManager2;
        this.f46457b = requestManager2;
        this.f46458c = c14835a2;
        this.f46459d = c9719k2;
        this.f46460e = abTestUtility2;
        this.f46461f = syncProfileData2;
        this.f46462g = loadProfileOptionData2;
        this.f46463h = c16245c2;
        this.f46464i = attributionTracker2;
        this.f46465j = c16579a2;
        this.f46466k = c14837d2;
        this.f46467l = c16576a2;
        this.f46468m = c16559a2;
        this.f46469n = c16566d2;
        this.f46470o = c8000b2;
    }

    /* renamed from: a */
    public final void m56220a(@NotNull UserAttribute userAttribute) {
        C2668g.b(userAttribute, "userAttribute");
        this.f46456a.loadMetaData().a(Schedulers.io()).c(new C18825a(this)).a(new C18826b(this, userAttribute), (Action1) C18827c.f58368a);
        userAttribute = this.f46461f.execute(SyncProfileData.ALL_PROFILE_OPTIONS_SYNC_REQUEST).a(C16586d.f51288a).b(this.f46466k.m56208a()).b(C15756a.m59010b());
        Action action = C16587e.f51289a;
        Function1 function1 = StartSession$execute$6.f59398a;
        if (function1 != null) {
            function1 = new C16590g(function1);
        }
        userAttribute.a(action, (Consumer) function1);
        userAttribute = m56210a().b(C15756a.m59010b());
        action = C16588f.f51290a;
        function1 = StartSession$execute$8.f59399a;
        if (function1 != null) {
            function1 = new C16590g(function1);
        }
        userAttribute.a(action, (Consumer) function1);
        this.f46467l.m62009a(SessionState.ACTIVE);
        m56215b();
    }

    /* renamed from: a */
    private final C3956a m56210a() {
        if (this.f46460e.profileV2EnabledForRevenue()) {
            C3956a flatMapCompletable = this.f46462g.execute(ProfileOption.Products.INSTANCE).flatMapCompletable(new C16589g(this));
            C2668g.a(flatMapCompletable, "loadProfileOptionData.ex…ffers.execute(products) }");
            return flatMapCompletable;
        }
        flatMapCompletable = C3956a.a();
        C2668g.a(flatMapCompletable, "Completable.complete()");
        return flatMapCompletable;
    }

    /* renamed from: b */
    private final void m56216b(UserAttribute userAttribute) {
        if (userAttribute == UserAttribute.NEW_USER) {
            this.f46464i.trackEvent("Registration", ah.m66884a());
        }
    }

    /* renamed from: a */
    private final void m56211a(User user) {
        if (user != null) {
            user = C15363n.m57672b(user);
            if (user != null) {
                this.f46457b.a(user).c(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
                C0001a.b("User image cached", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    private final void m56215b() {
        this.f46468m.execute();
        this.f46469n.execute();
    }
}
