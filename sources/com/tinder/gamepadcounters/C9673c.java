package com.tinder.gamepadcounters;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.boost.p178a.C10400d;
import com.tinder.common.provider.C8550g;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.utils.RxUtils;
import io.reactivex.BackpressureStrategy;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001aJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012J\u0018\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0013H\u0002J\u0006\u0010%\u001a\u00020\u001aJ\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/tinder/gamepadcounters/GamepadCounterSessionController;", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "boostInteractor", "Lcom/tinder/boost/interactor/BoostInteractor;", "superlikeStatusProvider", "Lcom/tinder/superlike/provider/SuperlikeStatusProvider;", "dateTimeProvider", "Lcom/tinder/common/provider/TodayDateProvider;", "appVisibilityTracker", "Lcom/tinder/app/AppVisibilityTracker;", "(Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/boost/interactor/BoostInteractor;Lcom/tinder/superlike/provider/SuperlikeStatusProvider;Lcom/tinder/common/provider/TodayDateProvider;Lcom/tinder/app/AppVisibilityTracker;)V", "session", "Lcom/tinder/gamepadcounters/GamepadCounterSession;", "visibilitySubscription", "Lrx/Subscription;", "boostCountObservable", "Lrx/Observable;", "", "hasEnoughTimeElapsed", "", "hasSeenCounterForSource", "source", "Lcom/tinder/gamepadcounters/Source;", "notifyAppHasEnteredBackground", "", "notifyAppHasEnteredForeground", "notifyFastMatchCounterSeen", "notifyGamepadCounterSeen", "observeFastMatchCounterInfo", "Lcom/tinder/gamepadcounters/GamePadButtonCounterInfo;", "observeGamepadCounterInfo", "shouldShowBoostCount", "count", "shouldShowCount", "shouldShowSuperLikeCount", "startObservingVisibility", "superLikeCountObservable", "textForCount", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.gamepadcounters.c */
public final class C9673c {
    /* renamed from: a */
    private C9672b f32234a = new C9672b(false, false, null, 7, null);
    /* renamed from: b */
    private Subscription f32235b;
    /* renamed from: c */
    private final AbTestUtility f32236c;
    /* renamed from: d */
    private final C10400d f32237d;
    /* renamed from: e */
    private final C15082f f32238e;
    /* renamed from: f */
    private final C8550g f32239f;
    /* renamed from: g */
    private final AppVisibilityTracker f32240g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/boost/model/BoostStatus;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepadcounters.c$a */
    static final class C13312a<T, R> implements Func1<BoostStatus, Boolean> {
        /* renamed from: a */
        public static final C13312a f42256a = new C13312a();

        C13312a() {
        }

        /* renamed from: a */
        public final boolean m51546a(BoostStatus boostStatus) {
            return boostStatus != null;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51546a((BoostStatus) obj));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "boostStatus", "Lcom/tinder/domain/boost/model/BoostStatus;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepadcounters.c$b */
    static final class C13313b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13313b f42257a = new C13313b();

        C13313b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Integer.valueOf(m51547a((BoostStatus) obj));
        }

        /* renamed from: a */
        public final int m51547a(BoostStatus boostStatus) {
            C2668g.a(boostStatus, "boostStatus");
            return boostStatus.getRemaining();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/gamepadcounters/GamePadButtonCounterInfo;", "remaining", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Integer;)Lcom/tinder/gamepadcounters/GamePadButtonCounterInfo;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepadcounters.c$c */
    static final class C13314c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C9673c f42258a;

        C13314c(C9673c c9673c) {
            this.f42258a = c9673c;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51548a((Integer) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C9671a m51548a(Integer num) {
            C9673c c9673c = this.f42258a;
            C2668g.a(num, "remaining");
            return new C9671a(null, c9673c.m40105b(num.intValue()), false, this.f42258a.m40102a((int) num.intValue(), Source.FASTMATCH), 5, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/gamepadcounters/GamePadButtonCounterInfo;", "superLikeCount", "", "kotlin.jvm.PlatformType", "boostCount", "call", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/tinder/gamepadcounters/GamePadButtonCounterInfo;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepadcounters.c$d */
    static final class C13315d<T1, T2, R> implements Func2<T1, T2, R> {
        /* renamed from: a */
        final /* synthetic */ C9673c f42259a;

        C13315d(C9673c c9673c) {
            this.f42259a = c9673c;
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m51549a((Integer) obj, (Integer) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final C9671a m51549a(Integer num, Integer num2) {
            C9673c c9673c = this.f42259a;
            C2668g.a(num, "superLikeCount");
            String a = c9673c.m40105b(num.intValue());
            C9673c c9673c2 = this.f42259a;
            C2668g.a(num2, "boostCount");
            return new C9671a(a, c9673c2.m40105b(num2.intValue()), this.f42259a.m40101a(num.intValue()), this.f42259a.m40102a((int) num2.intValue(), Source.GAMEPAD));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/superlike/SuperlikeStatus;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepadcounters.c$g */
    static final class C13316g<T, R> implements Func1<SuperlikeStatus, Boolean> {
        /* renamed from: a */
        public static final C13316g f42260a = new C13316g();

        C13316g() {
        }

        /* renamed from: a */
        public final boolean m51550a(SuperlikeStatus superlikeStatus) {
            return superlikeStatus != null;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51550a((SuperlikeStatus) obj));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "superLikeStatus", "Lcom/tinder/domain/superlike/SuperlikeStatus;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepadcounters.c$h */
    static final class C13317h<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13317h f42261a = new C13317h();

        C13317h() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Integer.valueOf(m51551a((SuperlikeStatus) obj));
        }

        /* renamed from: a */
        public final int m51551a(SuperlikeStatus superlikeStatus) {
            return superlikeStatus.remainingCount();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "visibility", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepadcounters.c$e */
    static final class C14031e<T> implements Action1<AppVisibilityTracker$Visibility> {
        /* renamed from: a */
        final /* synthetic */ C9673c f44454a;

        C14031e(C9673c c9673c) {
            this.f44454a = c9673c;
        }

        public /* synthetic */ void call(Object obj) {
            m53700a((AppVisibilityTracker$Visibility) obj);
        }

        /* renamed from: a */
        public final void m53700a(AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
            if (appVisibilityTracker$Visibility != null) {
                switch (C9674d.f32241a[appVisibilityTracker$Visibility.ordinal()]) {
                    case 1:
                        this.f44454a.m40112i();
                        return;
                    case 2:
                        this.f44454a.m40111h();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gamepadcounters.c$f */
    static final class C14032f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14032f f44455a = new C14032f();

        C14032f() {
        }

        public /* synthetic */ void call(Object obj) {
            m53701a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53701a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error subscribing to App lifecycle changes: ");
            stringBuilder.append(th.getMessage());
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C9673c(@NotNull AbTestUtility abTestUtility, @NotNull C10400d c10400d, @NotNull C15082f c15082f, @NotNull C8550g c8550g, @NotNull AppVisibilityTracker appVisibilityTracker) {
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c10400d, "boostInteractor");
        C2668g.b(c15082f, "superlikeStatusProvider");
        C2668g.b(c8550g, "dateTimeProvider");
        C2668g.b(appVisibilityTracker, "appVisibilityTracker");
        this.f32236c = abTestUtility;
        this.f32237d = c10400d;
        this.f32238e = c15082f;
        this.f32239f = c8550g;
        this.f32240g = appVisibilityTracker;
    }

    /* renamed from: a */
    public final void m40114a() {
        if (!RxUtils.a(this.f32235b)) {
            this.f32235b = RxJavaInteropExtKt.toV1Observable(this.f32240g.trackVisibility(), BackpressureStrategy.LATEST).b(Schedulers.io()).g().a(new C14031e(this), C14032f.f44455a);
        }
    }

    /* renamed from: b */
    public final void m40115b() {
        this.f32234a = C9672b.m40094a(this.f32234a, true, false, null, 6, null);
    }

    /* renamed from: c */
    public final void m40116c() {
        this.f32234a = C9672b.m40094a(this.f32234a, false, true, null, 5, null);
    }

    @NotNull
    /* renamed from: d */
    public final Observable<C9671a> m40117d() {
        Observable<C9671a> a = Observable.a(m40110g(), m40109f(), new C13315d(this));
        C2668g.a(a, "Observable.combineLatest…     )\n                })");
        return a;
    }

    @NotNull
    /* renamed from: e */
    public final Observable<C9671a> m40118e() {
        Observable<C9671a> k = m40109f().k(new C13314c(this));
        C2668g.a(k, "boostCountObservable()\n …      )\n                }");
        return k;
    }

    /* renamed from: f */
    private final Observable<Integer> m40109f() {
        Observable<Integer> k = this.f32237d.m42283f().f(C13312a.f42256a).k(C13313b.f42257a);
        C2668g.a(k, "boostInteractor.observeC…> boostStatus.remaining }");
        return k;
    }

    /* renamed from: g */
    private final Observable<Integer> m40110g() {
        Observable<Integer> k = this.f32238e.e().f(C13316g.f42260a).k(C13317h.f42261a);
        C2668g.a(k, "superlikeStatusProvider.…Status.remainingCount() }");
        return k;
    }

    /* renamed from: a */
    private final boolean m40101a(int i) {
        return m40107b(i, Source.GAMEPAD);
    }

    /* renamed from: a */
    private final boolean m40102a(int i, Source source) {
        return m40107b(i, source) != 0 && this.f32237d.isUserBoosting() == 0;
    }

    /* renamed from: b */
    private final boolean m40107b(int i, Source source) {
        return this.f32236c.isGamepadCounterEnabled() && m40103a(source) == null && i > 0;
    }

    /* renamed from: a */
    private final boolean m40103a(Source source) {
        switch (C9674d.f32242b[source.ordinal()]) {
            case 1:
                return this.f32234a.m40096a();
            case 2:
                return this.f32234a.m40097b();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    private final String m40105b(int i) {
        if (i > 99) {
            return "99+";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    /* renamed from: h */
    private final void m40111h() {
        this.f32234a = C9672b.m40094a(this.f32234a, false, false, this.f32239f.m36535b(), 3, null);
    }

    /* renamed from: i */
    private final void m40112i() {
        C9672b a;
        if (m40113j()) {
            C9672b c9672b = new C9672b(false, false, null, 7, null);
        } else {
            a = C9672b.m40094a(this.f32234a, false, false, null, 3, null);
        }
        this.f32234a = a;
    }

    /* renamed from: j */
    private final boolean m40113j() {
        DateTime c = this.f32234a.m40098c();
        boolean z = false;
        if (c == null) {
            return false;
        }
        Minutes a = Minutes.a(c, this.f32239f.m36535b());
        C2668g.a(a, "Minutes.minutesBetween(i…ateTimeProvider.dateTime)");
        if (a.b() >= 20) {
            z = true;
        }
        return z;
    }
}
