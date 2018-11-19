package com.tinder.settings.p404b;

import com.firebase.jobdispatcher.C1886n;
import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.firebase.jobdispatcher.RetryStrategy;
import com.tinder.analytics.C2634g;
import com.tinder.api.TinderApi;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.settings.AccountSettings;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.SetDiscoverability;
import com.tinder.managers.bk;
import com.tinder.pushnotifications.usecase.C14575d;
import com.tinder.settings.jobs.ReactivateAccountJob;
import io.reactivex.C3960g;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.Seconds;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012H\u0002J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0010\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0012\u0010\u001a\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u001a\u0010\u001b\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/tinder/settings/interactors/PauseAccount;", "", "setDiscoverability", "Lcom/tinder/domain/profile/usecase/SetDiscoverability;", "pauseNotifications", "Lcom/tinder/pushnotifications/usecase/PauseNotifications;", "preferencesManager", "Lcom/tinder/managers/ManagerSharedPreferences;", "crmUserAttributeTracker", "Lcom/tinder/analytics/CrmUserAttributeTracker;", "tinderApi", "Lcom/tinder/api/TinderApi;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "firebaseJobDispatcher", "Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;", "(Lcom/tinder/domain/profile/usecase/SetDiscoverability;Lcom/tinder/pushnotifications/usecase/PauseNotifications;Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/analytics/CrmUserAttributeTracker;Lcom/tinder/api/TinderApi;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;)V", "clearScheduledReactivation", "Lrx/Completable;", "kotlin.jvm.PlatformType", "isUserPaused", "Lio/reactivex/Single;", "", "pause", "timeUntilReset", "Lorg/joda/time/Period;", "scheduleReactivateJob", "setCrmAttribute", "pausing", "unPause", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.b.a */
public final class C14864a {
    /* renamed from: a */
    private final SetDiscoverability f46533a;
    /* renamed from: b */
    private final C14575d f46534b;
    /* renamed from: c */
    private final bk f46535c;
    /* renamed from: d */
    private final C2634g f46536d;
    /* renamed from: e */
    private final TinderApi f46537e;
    /* renamed from: f */
    private final LoadProfileOptionData f46538f;
    /* renamed from: g */
    private final FirebaseJobDispatcher f46539g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/settings/AccountSettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.b.a$b */
    static final class C16615b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16615b f51472a = new C16615b();

        C16615b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m62059a((AccountSettings) obj));
        }

        /* renamed from: a */
        public final boolean m62059a(@NotNull AccountSettings accountSettings) {
            C2668g.b(accountSettings, "it");
            return accountSettings.getDeactivated();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.b.a$a */
    static final class C18829a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C14864a f58375a;

        C18829a(C14864a c14864a) {
            this.f58375a = c14864a;
        }

        public final void call() {
            this.f58375a.f46539g.a("reactivate-job");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.b.a$c */
    static final class C18830c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C14864a f58376a;

        C18830c(C14864a c14864a) {
            this.f58376a = c14864a;
        }

        public final void call() {
            this.f58376a.f46535c.J(true);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.b.a$d */
    static final class C18831d implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C14864a f58377a;
        /* renamed from: b */
        final /* synthetic */ Period f58378b;

        C18831d(C14864a c14864a, Period period) {
            this.f58377a = c14864a;
            this.f58378b = period;
        }

        public final void call() {
            Seconds a = Seconds.a(LocalDateTime.a(), LocalDateTime.a().a(this.f58378b));
            C2668g.a(a, "Seconds.secondsBetween(L…ateTime.now(), startTime)");
            int b = a.b();
            this.f58377a.f46539g.b(this.f58377a.f46539g.a().a(ReactivateAccountJob.class).a("reactivate-job").a(new int[]{2}).a(RetryStrategy.f5100a).a(2).a(C1886n.a(b, b + 21600)).a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.b.a$e */
    static final class C18832e implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C14864a f58379a;
        /* renamed from: b */
        final /* synthetic */ boolean f58380b;
        /* renamed from: c */
        final /* synthetic */ Period f58381c;

        C18832e(C14864a c14864a, boolean z, Period period) {
            this.f58379a = c14864a;
            this.f58380b = z;
            this.f58381c = period;
        }

        public final void call() {
            int i = 1;
            if (this.f58380b) {
                Period period = this.f58381c;
                if (!C2668g.a(period, Period.c(1))) {
                    i = C2668g.a(period, Period.b(1)) ? 2 : C2668g.a(period, Period.a(1)) ? 3 : 4;
                }
            } else {
                i = 0;
            }
            this.f58379a.f46536d.i(i);
            this.f58379a.f46536d.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.b.a$f */
    static final class C18833f implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C14864a f58382a;

        C18833f(C14864a c14864a) {
            this.f58382a = c14864a;
        }

        public final void call() {
            this.f58382a.f46535c.J(false);
        }
    }

    @Inject
    public C14864a(@NotNull SetDiscoverability setDiscoverability, @NotNull C14575d c14575d, @NotNull bk bkVar, @NotNull C2634g c2634g, @NotNull TinderApi tinderApi, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull FirebaseJobDispatcher firebaseJobDispatcher) {
        C2668g.b(setDiscoverability, "setDiscoverability");
        C2668g.b(c14575d, "pauseNotifications");
        C2668g.b(bkVar, "preferencesManager");
        C2668g.b(c2634g, "crmUserAttributeTracker");
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(firebaseJobDispatcher, "firebaseJobDispatcher");
        this.f46533a = setDiscoverability;
        this.f46534b = c14575d;
        this.f46535c = bkVar;
        this.f46536d = c2634g;
        this.f46537e = tinderApi;
        this.f46538f = loadProfileOptionData;
        this.f46539g = firebaseJobDispatcher;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m56284a(@Nullable Period period) {
        period = this.f46533a.execute(Boolean.valueOf(false)).a(Schedulers.io()).b(this.f46534b.m55610a()).b(m56278a(period, true)).b(this.f46537e.pauseAccount(true)).b(m56280b(period)).b(new C18830c(this));
        C2668g.a(period, "setDiscoverability.execu….isAccountPaused = true }");
        return period;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m56283a() {
        Completable b = this.f46533a.execute(Boolean.valueOf(true)).a(Schedulers.io()).b(this.f46534b.m55611b()).b(m56278a(null, false)).b(this.f46537e.pauseAccount(false)).b(m56282c()).b(new C18833f(this));
        C2668g.a(b, "setDiscoverability.execu…isAccountPaused = false }");
        return b;
    }

    @NotNull
    /* renamed from: b */
    public final C3960g<Boolean> m56285b() {
        C3960g<Boolean> firstOrError = this.f46538f.execute(ProfileOption.AccountSettings.INSTANCE).map(C16615b.f51472a).firstOrError();
        C2668g.a(firstOrError, "loadProfileOptionData.ex…          .firstOrError()");
        return firstOrError;
    }

    /* renamed from: a */
    private final Completable m56278a(Period period, boolean z) {
        period = Completable.a(new C18832e(this, z, period));
        C2668g.a(period, "Completable.fromAction {…ingAttributes()\n        }");
        return period;
    }

    /* renamed from: b */
    private final Completable m56280b(Period period) {
        if (period == null) {
            period = Completable.a();
            C2668g.a(period, "Completable.complete()");
            return period;
        }
        period = Completable.a(new C18831d(this, period));
        C2668g.a(period, "Completable.fromAction {…stSchedule(job)\n        }");
        return period;
    }

    /* renamed from: c */
    private final Completable m56282c() {
        return Completable.a(new C18829a(this));
    }
}
