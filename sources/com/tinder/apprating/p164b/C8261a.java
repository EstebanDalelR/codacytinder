package com.tinder.apprating.p164b;

import com.tinder.apprating.enums.AppRatingMode;
import com.tinder.apprating.p166e.C10313a;
import com.tinder.apprating.p166e.C10315c;
import com.tinder.apprating.p166e.C10315c.C8265a;
import com.tinder.apprating.target.AppRatingTarget;
import com.tinder.crashindicator.analytics.C10711a;
import com.tinder.crashindicator.analytics.C10711a.C8601a;
import com.tinder.crashindicator.analytics.C10712b;
import com.tinder.crashindicator.analytics.C10712b.C8603a;
import com.tinder.crashindicator.analytics.FeedbackAction;
import com.tinder.crashindicator.analytics.FeedbackSource;
import com.tinder.crashindicator.analytics.FeedbackType;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.utils.RxUtils;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.ReadableInstant;
import p000a.p001a.C0001a;
import rx.C2671a;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001BI\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020$H\u0002J\u000e\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020(J\u0010\u0010)\u001a\u00020$2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020$H\u0002J\u000e\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u0019J\b\u0010-\u001a\u00020$H\u0007J\u0010\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u000200H\u0002J\u000e\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020\u0015J\u0006\u00103\u001a\u00020$J\u000e\u00104\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u00105\u001a\u00020$H\u0002J\b\u00106\u001a\u00020\u0015H\u0002J \u00107\u001a\u00020$2\u0006\u00108\u001a\u0002002\u0006\u00109\u001a\u0002002\u0006\u0010:\u001a\u000200H\u0002J\b\u0010;\u001a\u00020$H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/tinder/apprating/presenter/AppRatingPresenter;", "", "sendFeedback", "Lcom/tinder/apprating/usecase/SendFeedback;", "computationScheduler", "Lrx/Scheduler;", "appRatingRepository", "Lcom/tinder/domain/apprating/AppRatingRepository;", "feedbackAppEventDispatcher", "Lcom/tinder/crashindicator/analytics/FeedbackAppEventDispatcher;", "feedbackSessionEventDispatcher", "Lcom/tinder/crashindicator/analytics/FeedbackSessionEventDispatcher;", "checkAppRatingMode", "Lcom/tinder/apprating/usecase/CheckAppRatingMode;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/apprating/usecase/SendFeedback;Lrx/Scheduler;Lcom/tinder/domain/apprating/AppRatingRepository;Lcom/tinder/crashindicator/analytics/FeedbackAppEventDispatcher;Lcom/tinder/crashindicator/analytics/FeedbackSessionEventDispatcher;Lcom/tinder/apprating/usecase/CheckAppRatingMode;Lkotlin/jvm/functions/Function0;)V", "checkModeSubscription", "Lrx/Subscription;", "feedbackText", "", "mode", "Lcom/tinder/apprating/enums/AppRatingMode;", "ratingUserSelected", "", "sendFeedbackSubscription", "startSessionDateTime", "target", "Lcom/tinder/apprating/target/AppRatingTarget;", "getTarget$Tinder_release", "()Lcom/tinder/apprating/target/AppRatingTarget;", "setTarget$Tinder_release", "(Lcom/tinder/apprating/target/AppRatingTarget;)V", "thankYouDialogDismissSubscription", "autoDismissThankYouDialog", "", "checkShowDialogMode", "continueSwipingClicked", "feedbackAction", "Lcom/tinder/crashindicator/analytics/FeedbackAction;", "fireFeedbackAppEvent", "fireFeedbackSessionEvent", "handleRatingSelected", "rating", "initialize", "markFirstRunFromGooglePlay", "firstRun", "", "observeFeedbackText", "messageText", "onReviewButtonClicked", "onSendFeedback", "resetTrigger", "sourceForEvent", "toggleRatingState", "wasPreviouslyRated", "feedbackDismissed", "ratingDismissed", "unsubscribe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.apprating.b.a */
public final class C8261a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public AppRatingTarget f29495a;
    /* renamed from: b */
    private DateTime f29496b;
    /* renamed from: c */
    private int f29497c;
    /* renamed from: d */
    private String f29498d = "";
    /* renamed from: e */
    private Subscription f29499e;
    /* renamed from: f */
    private Subscription f29500f;
    /* renamed from: g */
    private Subscription f29501g;
    /* renamed from: h */
    private AppRatingMode f29502h = AppRatingMode.RATE;
    /* renamed from: i */
    private final C10315c f29503i;
    /* renamed from: j */
    private final C2671a f29504j;
    /* renamed from: k */
    private final AppRatingRepository f29505k;
    /* renamed from: l */
    private final C10711a f29506l;
    /* renamed from: m */
    private final C10712b f29507m;
    /* renamed from: n */
    private final C10313a f29508n;
    /* renamed from: o */
    private final Function0<DateTime> f29509o;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.apprating.b.a$a */
    static final class C13606a<T> implements Action1<Long> {
        /* renamed from: a */
        final /* synthetic */ C8261a f43370a;

        C13606a(C8261a c8261a) {
            this.f43370a = c8261a;
        }

        public /* synthetic */ void call(Object obj) {
            m53085a((Long) obj);
        }

        /* renamed from: a */
        public final void m53085a(Long l) {
            this.f43370a.m35272a().closeDialog();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "mode", "Lcom/tinder/apprating/enums/AppRatingMode;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.apprating.b.a$b */
    static final class C13607b<T> implements Action1<AppRatingMode> {
        /* renamed from: a */
        final /* synthetic */ C8261a f43371a;

        C13607b(C8261a c8261a) {
            this.f43371a = c8261a;
        }

        public /* synthetic */ void call(Object obj) {
            m53086a((AppRatingMode) obj);
        }

        /* renamed from: a */
        public final void m53086a(AppRatingMode appRatingMode) {
            if (appRatingMode != null) {
                switch (C8262b.f29510a[appRatingMode.ordinal()]) {
                    case 1:
                        this.f43371a.m35272a().setUpRatingBar();
                        break;
                    case 2:
                        this.f43371a.m35272a().showFeedbackView();
                        break;
                    case 3:
                        this.f43371a.m35272a().showThankYouView();
                        break;
                    default:
                        break;
                }
            }
            this.f43371a.m35272a().setUpRatingBar();
            C8261a c8261a = this.f43371a;
            C2668g.a(appRatingMode, "mode");
            c8261a.f29502h = appRatingMode;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.apprating.b.a$c */
    static final class C13608c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ String f43372a;

        C13608c(String str) {
            this.f43372a = str;
        }

        public final void call() {
            C0001a.b("App rating message sent: %s", new Object[]{this.f43372a});
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.apprating.b.a$d */
    static final class C13609d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13609d f43373a = new C13609d();

        C13609d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53087a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53087a(Throwable th) {
            C0001a.e("Error sending feedback from AppRating dialog", new Object[0]);
        }
    }

    @Inject
    public C8261a(@NotNull C10315c c10315c, @NotNull @ComputationScheduler C2671a c2671a, @NotNull AppRatingRepository appRatingRepository, @NotNull C10711a c10711a, @NotNull C10712b c10712b, @NotNull C10313a c10313a, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(c10315c, "sendFeedback");
        C2668g.b(c2671a, "computationScheduler");
        C2668g.b(appRatingRepository, "appRatingRepository");
        C2668g.b(c10711a, "feedbackAppEventDispatcher");
        C2668g.b(c10712b, "feedbackSessionEventDispatcher");
        C2668g.b(c10313a, "checkAppRatingMode");
        C2668g.b(function0, "dateTimeProvider");
        this.f29503i = c10315c;
        this.f29504j = c2671a;
        this.f29505k = appRatingRepository;
        this.f29506l = c10711a;
        this.f29507m = c10712b;
        this.f29508n = c10313a;
        this.f29509o = function0;
    }

    @NotNull
    /* renamed from: a */
    public final AppRatingTarget m35272a() {
        AppRatingTarget appRatingTarget = this.f29495a;
        if (appRatingTarget == null) {
            C2668g.b("target");
        }
        return appRatingTarget;
    }

    @Take
    /* renamed from: b */
    public final void m35276b() {
        m35271i();
        this.f29496b = (DateTime) this.f29509o.invoke();
    }

    @Drop
    /* renamed from: c */
    public final void m35278c() {
        if (((this.f29502h == AppRatingMode.THANK_YOU ? 1 : 0) & this.f29505k.readIsFirstTimeAfterGooglePlayReview()) != 0) {
            m35265a(false);
        } else {
            m35269g();
            m35268f();
        }
        RxUtils.b(this.f29499e);
        RxUtils.b(this.f29500f);
        RxUtils.b(this.f29501g);
    }

    /* renamed from: a */
    public final void m35274a(@NotNull FeedbackAction feedbackAction) {
        C2668g.b(feedbackAction, "feedbackAction");
        if (this.f29502h == AppRatingMode.FEEDBACK) {
            m35266a(false, true, false);
        } else {
            m35266a(false, false, true);
        }
        m35267b(feedbackAction);
        feedbackAction = this.f29495a;
        if (feedbackAction == null) {
            C2668g.b("target");
        }
        feedbackAction.closeDialog();
    }

    /* renamed from: a */
    public final void m35275a(@NotNull String str) {
        C2668g.b(str, "messageText");
        this.f29498d = str;
    }

    /* renamed from: b */
    public final void m35277b(@NotNull String str) {
        C2668g.b(str, "feedbackText");
        m35267b(FeedbackAction.SEND_FEEDBACK);
        m35266a(true, false, false);
        AppRatingTarget appRatingTarget = this.f29495a;
        if (appRatingTarget == null) {
            C2668g.b("target");
        }
        appRatingTarget.showThankYouView();
        m35279d();
        RxUtils.b(this.f29499e);
        this.f29499e = this.f29503i.m42095a(new C8265a(this.f29497c, str)).b(Schedulers.io()).a(new C13608c(str), (Action1) C13609d.f43373a);
    }

    /* renamed from: a */
    public final void m35273a(int i) {
        this.f29497c = i;
        m35267b(FeedbackAction.SELECT_STARS);
        if (i == 0) {
            this.f29502h = AppRatingMode.RATE;
            i = this.f29495a;
            if (i == 0) {
                C2668g.b("target");
            }
            i.showInitialRatingView();
            return;
        }
        if (1 <= i) {
            if (3 >= i) {
                this.f29502h = AppRatingMode.FEEDBACK;
                i = this.f29495a;
                if (i == 0) {
                    C2668g.b("target");
                }
                i.showFeedbackView();
                return;
            }
        }
        this.f29502h = AppRatingMode.RATE;
        i = this.f29495a;
        if (i == 0) {
            C2668g.b("target");
        }
        i.showReviewButton();
    }

    /* renamed from: d */
    public final void m35279d() {
        RxUtils.b(this.f29500f);
        this.f29500f = Observable.b(4, TimeUnit.SECONDS, this.f29504j).a(C19397a.a()).d(new C13606a(this));
    }

    /* renamed from: e */
    public final void m35280e() {
        m35267b(FeedbackAction.REVIEW);
        m35266a(true, false, false);
        m35265a(true);
        AppRatingTarget appRatingTarget = this.f29495a;
        if (appRatingTarget == null) {
            C2668g.b("target");
        }
        appRatingTarget.closeDialog();
    }

    /* renamed from: a */
    private final void m35265a(boolean z) {
        this.f29505k.writeIsFirstTimeAfterGooglePlayReview(z);
    }

    /* renamed from: a */
    private final void m35266a(boolean z, boolean z2, boolean z3) {
        this.f29505k.writeIsAppRatedBefore(z);
        this.f29505k.writeFeedbackDismissed(z2);
        this.f29505k.writeRatingDismissed(z3);
    }

    /* renamed from: f */
    private final void m35268f() {
        this.f29505k.writeItsANewMatchDialogSeen(false);
        this.f29505k.writeNewChatMessageRead(false);
        this.f29505k.writeChatActivityPaused(false);
    }

    /* renamed from: g */
    private final void m35269g() {
        DateTime dateTime = this.f29496b;
        if (dateTime == null) {
            C2668g.b("startSessionDateTime");
        }
        Duration toDuration = new Interval(dateTime, (ReadableInstant) this.f29509o.invoke()).toDuration();
        C2668g.a(toDuration, "interval.toDuration()");
        this.f29507m.m43049a(new C8603a(m35270h(), FeedbackType.STARS.getAnalyticsValue(), toDuration.getMillis()));
    }

    /* renamed from: b */
    private final void m35267b(FeedbackAction feedbackAction) {
        this.f29506l.m43046a(new C8601a(m35270h(), feedbackAction.getAnalyticsValue(), FeedbackType.STARS.getAnalyticsValue(), this.f29498d, this.f29497c, this.f29502h));
    }

    /* renamed from: h */
    private final String m35270h() {
        String str = "";
        if (this.f29505k.readItsANewMatchDialogSeen()) {
            return FeedbackSource.NEW_MATCH.getAnalyticsValue();
        }
        return this.f29505k.readNewChatMessageRead() ? FeedbackSource.NEW_MESSAGE.getAnalyticsValue() : str;
    }

    /* renamed from: i */
    private final void m35271i() {
        RxUtils.b(this.f29501g);
        this.f29501g = this.f29508n.execute().b(Schedulers.io()).a(C19397a.a()).b(new C13607b(this));
    }
}
