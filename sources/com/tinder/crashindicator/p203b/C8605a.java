package com.tinder.crashindicator.p203b;

import com.tinder.apprating.enums.AppRatingMode;
import com.tinder.apprating.p166e.C10315c;
import com.tinder.apprating.p166e.C10315c.C8265a;
import com.tinder.crashindicator.analytics.C10711a;
import com.tinder.crashindicator.analytics.C10711a.C8601a;
import com.tinder.crashindicator.analytics.C10712b;
import com.tinder.crashindicator.analytics.C10712b.C8603a;
import com.tinder.crashindicator.analytics.FeedbackAction;
import com.tinder.crashindicator.analytics.FeedbackSource;
import com.tinder.crashindicator.analytics.FeedbackType;
import com.tinder.crashindicator.p321c.C10714b;
import com.tinder.crashindicator.target.AppCrashTarget;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BA\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\b\u0010!\u001a\u00020\"H\u0002J\b\u0010\u0006\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\"J\u0018\u0010'\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0002J\u0006\u0010*\u001a\u00020\"J\u0006\u0010+\u001a\u00020\"J\u000e\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0013J\u000e\u0010.\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010/\u001a\u00020\"H\u0007J\b\u00100\u001a\u00020\"H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/tinder/crashindicator/presenter/AppCrashPresenter;", "", "sendFeedback", "Lcom/tinder/apprating/usecase/SendFeedback;", "computationScheduler", "Lrx/Scheduler;", "clearCrashStoreTimeStamp", "Lcom/tinder/crashindicator/usecase/ClearCrashStoreTimeStamp;", "feedbackAppEventDispatcher", "Lcom/tinder/crashindicator/analytics/FeedbackAppEventDispatcher;", "feedbackSessionEventDispatcher", "Lcom/tinder/crashindicator/analytics/FeedbackSessionEventDispatcher;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/apprating/usecase/SendFeedback;Lrx/Scheduler;Lcom/tinder/crashindicator/usecase/ClearCrashStoreTimeStamp;Lcom/tinder/crashindicator/analytics/FeedbackAppEventDispatcher;Lcom/tinder/crashindicator/analytics/FeedbackSessionEventDispatcher;Lkotlin/jvm/functions/Function0;)V", "clearCrashStoreTimeStampSubscription", "Lrx/Subscription;", "feedbackText", "", "hasClicked", "", "mode", "Lcom/tinder/apprating/enums/AppRatingMode;", "sendFeedbackSubscription", "startSessionDateTime", "target", "Lcom/tinder/crashindicator/target/AppCrashTarget;", "getTarget$Tinder_release", "()Lcom/tinder/crashindicator/target/AppCrashTarget;", "setTarget$Tinder_release", "(Lcom/tinder/crashindicator/target/AppCrashTarget;)V", "thankYouDialogDismissSubscription", "autoDismissThankYouDialog", "", "continueSwipingClicked", "feedbackAction", "Lcom/tinder/crashindicator/analytics/FeedbackAction;", "dialogDismissedEvent", "fireFeedbackAppEvent", "feedbackType", "Lcom/tinder/crashindicator/analytics/FeedbackType;", "fireFeedbackSessionEvent", "handleSendFeedbackButtonClicked", "observeTextChanges", "messageText", "onSendFeedback", "subscribe", "unsubscribe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.crashindicator.b.a */
public final class C8605a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public AppCrashTarget f30448a;
    /* renamed from: b */
    private Subscription f30449b;
    /* renamed from: c */
    private Subscription f30450c;
    /* renamed from: d */
    private Subscription f30451d;
    /* renamed from: e */
    private AppRatingMode f30452e = AppRatingMode.CRASH;
    /* renamed from: f */
    private String f30453f = "";
    /* renamed from: g */
    private DateTime f30454g;
    /* renamed from: h */
    private boolean f30455h;
    /* renamed from: i */
    private final C10315c f30456i;
    /* renamed from: j */
    private final C2671a f30457j;
    /* renamed from: k */
    private final C10714b f30458k;
    /* renamed from: l */
    private final C10711a f30459l;
    /* renamed from: m */
    private final C10712b f30460m;
    /* renamed from: n */
    private final Function0<DateTime> f30461n;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.b.a$a */
    static final class C13784a<T> implements Action1<Long> {
        /* renamed from: a */
        final /* synthetic */ C8605a f43779a;

        C13784a(C8605a c8605a) {
            this.f43779a = c8605a;
        }

        public /* synthetic */ void call(Object obj) {
            m53355a((Long) obj);
        }

        /* renamed from: a */
        public final void m53355a(Long l) {
            this.f43779a.m36717a().closeDialog();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.b.a$b */
    static final class C13785b implements Action0 {
        /* renamed from: a */
        public static final C13785b f43780a = new C13785b();

        C13785b() {
        }

        public final void call() {
            C0001a.b("Success deleting crash time stamps", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.b.a$c */
    static final class C13786c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13786c f43781a = new C13786c();

        C13786c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53356a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53356a(Throwable th) {
            C0001a.c(th, "Failed to delete crash time stamps", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.b.a$d */
    static final class C13787d implements Action0 {
        /* renamed from: a */
        final /* synthetic */ String f43782a;

        C13787d(String str) {
            this.f43782a = str;
        }

        public final void call() {
            C0001a.b("App crash message sent: %s", new Object[]{this.f43782a});
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.b.a$e */
    static final class C13788e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13788e f43783a = new C13788e();

        C13788e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53357a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53357a(Throwable th) {
            C0001a.e("Error sending feedback from AppRating dialog", new Object[0]);
        }
    }

    @Inject
    public C8605a(@NotNull C10315c c10315c, @NotNull @ComputationScheduler C2671a c2671a, @NotNull C10714b c10714b, @NotNull C10711a c10711a, @NotNull C10712b c10712b, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(c10315c, "sendFeedback");
        C2668g.b(c2671a, "computationScheduler");
        C2668g.b(c10714b, "clearCrashStoreTimeStamp");
        C2668g.b(c10711a, "feedbackAppEventDispatcher");
        C2668g.b(c10712b, "feedbackSessionEventDispatcher");
        C2668g.b(function0, "dateTimeProvider");
        this.f30456i = c10315c;
        this.f30457j = c2671a;
        this.f30458k = c10714b;
        this.f30459l = c10711a;
        this.f30460m = c10712b;
        this.f30461n = function0;
    }

    @NotNull
    /* renamed from: a */
    public final AppCrashTarget m36717a() {
        AppCrashTarget appCrashTarget = this.f30448a;
        if (appCrashTarget == null) {
            C2668g.b("target");
        }
        return appCrashTarget;
    }

    @Take
    /* renamed from: b */
    public final void m36720b() {
        m36716h();
        this.f30454g = (DateTime) this.f30461n.invoke();
    }

    @Drop
    /* renamed from: c */
    public final void m36722c() {
        RxUtils.b(this.f30449b);
        RxUtils.b(this.f30450c);
        RxUtils.b(this.f30451d);
    }

    /* renamed from: d */
    public final void m36723d() {
        AppCrashTarget appCrashTarget = this.f30448a;
        if (appCrashTarget == null) {
            C2668g.b("target");
        }
        appCrashTarget.showFeedbackView();
        m36714a(FeedbackAction.OPEN_FEEDBACK, FeedbackType.CRASH);
        this.f30452e = AppRatingMode.FEEDBACK;
    }

    /* renamed from: a */
    public final void m36718a(@NotNull FeedbackAction feedbackAction) {
        C2668g.b(feedbackAction, "feedbackAction");
        AppCrashTarget appCrashTarget = this.f30448a;
        if (appCrashTarget == null) {
            C2668g.b("target");
        }
        appCrashTarget.closeDialog();
        this.f30455h = true;
        if (this.f30452e == AppRatingMode.CRASH) {
            m36714a(feedbackAction, FeedbackType.CRASH);
        } else if (this.f30452e == AppRatingMode.FEEDBACK) {
            m36714a(feedbackAction, FeedbackType.FEEDBACK);
        }
    }

    /* renamed from: e */
    public final void m36724e() {
        if (!this.f30455h) {
            m36714a(FeedbackAction.BACKGROUND, FeedbackType.CRASH);
        }
    }

    /* renamed from: a */
    public final void m36719a(@NotNull String str) {
        C2668g.b(str, "feedbackText");
        AppCrashTarget appCrashTarget = this.f30448a;
        if (appCrashTarget == null) {
            C2668g.b("target");
        }
        appCrashTarget.showThankYouView();
        m36715g();
        m36714a(FeedbackAction.SEND_FEEDBACK, FeedbackType.FEEDBACK);
        RxUtils.b(this.f30449b);
        this.f30449b = this.f30456i.m42095a(new C8265a(0, str)).b(Schedulers.io()).a(new C13787d(str), (Action1) C13788e.f43783a);
        this.f30452e = AppRatingMode.THANK_YOU;
    }

    /* renamed from: b */
    public final void m36721b(@NotNull String str) {
        C2668g.b(str, "messageText");
        this.f30453f = str;
    }

    /* renamed from: f */
    public final void m36725f() {
        DateTime dateTime = this.f30454g;
        if (dateTime == null) {
            C2668g.b("startSessionDateTime");
        }
        Duration toDuration = new Interval(dateTime, (ReadableInstant) this.f30461n.invoke()).toDuration();
        C2668g.a(toDuration, "interval.toDuration()");
        this.f30460m.m43049a(new C8603a(FeedbackSource.CRASH.getAnalyticsValue(), FeedbackType.CRASH.getAnalyticsValue(), toDuration.getMillis()));
    }

    /* renamed from: a */
    private final void m36714a(FeedbackAction feedbackAction, FeedbackType feedbackType) {
        this.f30459l.m43046a(new C8601a(FeedbackSource.CRASH.getAnalyticsValue(), feedbackAction.getAnalyticsValue(), feedbackType.getAnalyticsValue(), this.f30453f, -1, this.f30452e));
    }

    /* renamed from: g */
    private final void m36715g() {
        RxUtils.b(this.f30450c);
        this.f30450c = Observable.b(4, TimeUnit.SECONDS, this.f30457j).a(C19397a.a()).d(new C13784a(this));
    }

    /* renamed from: h */
    private final void m36716h() {
        this.f30451d = this.f30458k.execute().b(Schedulers.io()).a(C13785b.f43780a, C13786c.f43781a);
    }
}
