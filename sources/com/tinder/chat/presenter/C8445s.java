package com.tinder.chat.presenter;

import com.tinder.analytics.chat.Origin;
import com.tinder.bitmoji.C10376d;
import com.tinder.chat.analytics.C10532i;
import com.tinder.chat.analytics.C10532i.C8429a;
import com.tinder.chat.analytics.C10534l;
import com.tinder.chat.analytics.C10534l.C8431a;
import com.tinder.chat.analytics.C10539u;
import com.tinder.chat.analytics.C10539u.C8436a;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.Screen.C10684c;
import com.tinder.common.provider.C8550g;
import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.pushnotifications.model.C16257h;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.screenshot.analytics.C16562a;
import com.tinder.screenshot.analytics.C16562a.C14824a;
import com.tinder.screenshotty.C14830c;
import com.tinder.screenshotty.p401a.C14826a;
import com.tinder.screenshotty.p401a.C14826a.C16570a;
import io.reactivex.C15679f;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java8.util.Optional;
import java8.util.function.Predicate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bk\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020(H\u0002J\u0006\u0010)\u001a\u00020(J\u000e\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020#J\u000e\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020(R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/tinder/chat/presenter/ChatActivityPresenter;", "", "chatOpenEventDispatcher", "Lcom/tinder/chat/analytics/ChatOpenEventDispatcher;", "chatEndEventDispatcher", "Lcom/tinder/chat/analytics/ChatEndEventDispatcher;", "chatCloseClientDispatcher", "Lcom/tinder/chat/analytics/ChatClientUnifiedEventDispatcher;", "matchId", "", "appRatingRepository", "Lcom/tinder/domain/apprating/AppRatingRepository;", "todayDateProvider", "Lcom/tinder/common/provider/TodayDateProvider;", "currentScreenNotifier", "Lcom/tinder/common/navigation/CurrentScreenNotifier;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "screenshotty", "Lcom/tinder/screenshotty/Screenshotty;", "addAppScreenshotEvent", "Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent;", "checkBitmojiConnected", "Lcom/tinder/bitmoji/CheckBitmojiConnected;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/chat/analytics/ChatOpenEventDispatcher;Lcom/tinder/chat/analytics/ChatEndEventDispatcher;Lcom/tinder/chat/analytics/ChatClientUnifiedEventDispatcher;Ljava/lang/String;Lcom/tinder/domain/apprating/AppRatingRepository;Lcom/tinder/common/provider/TodayDateProvider;Lcom/tinder/common/navigation/CurrentScreenNotifier;Lcom/tinder/domain/match/usecase/GetMatch;Lcom/tinder/screenshotty/Screenshotty;Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent;Lcom/tinder/bitmoji/CheckBitmojiConnected;Lio/reactivex/Scheduler;)V", "chatStartTime", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getNotificationPredicate", "Ljava8/util/function/Predicate;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "isValidTimestamp", "", "chatOpenStartTime", "chatEndTime", "chatDurationMs", "observeScreenshotForAnalytics", "", "onChatCloseClientUnifiedEvent", "onChatEnd", "hasUnSentMessage", "onChatOpen", "origin", "Lcom/tinder/analytics/chat/Origin;", "saveReadNewMessage", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.presenter.s */
public final class C8445s {
    /* renamed from: a */
    private long f30029a;
    /* renamed from: b */
    private final C17356a f30030b = new C17356a();
    /* renamed from: c */
    private final C10539u f30031c;
    /* renamed from: d */
    private final C10534l f30032d;
    /* renamed from: e */
    private final C10532i f30033e;
    /* renamed from: f */
    private final String f30034f;
    /* renamed from: g */
    private final AppRatingRepository f30035g;
    /* renamed from: h */
    private final C8550g f30036h;
    /* renamed from: i */
    private final CurrentScreenNotifier f30037i;
    /* renamed from: j */
    private final GetMatch f30038j;
    /* renamed from: k */
    private final C14830c f30039k;
    /* renamed from: l */
    private final C16562a f30040l;
    /* renamed from: m */
    private final C10376d f30041m;
    /* renamed from: n */
    private final C15679f f30042n;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/pushnotifications/model/TinderNotification;", "kotlin.jvm.PlatformType", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.s$a */
    static final class C10554a<T> implements Predicate<TinderNotification> {
        /* renamed from: a */
        final /* synthetic */ C8445s f34307a;

        C10554a(C8445s c8445s) {
            this.f34307a = c8445s;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m42641a((TinderNotification) obj);
        }

        /* renamed from: a */
        public final boolean m42641a(TinderNotification tinderNotification) {
            if (tinderNotification instanceof C16257h) {
                return true ^ C2668g.a(((C16257h) tinderNotification).i(), this.f34307a.f30034f);
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent$Request;", "screenshot", "Lcom/tinder/screenshotty/model/Screenshot;", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.s$b */
    static final class C10555b<T1, T2, R> implements BiFunction<C14826a, Optional<Match>, C14824a> {
        /* renamed from: a */
        public static final C10555b f34308a = new C10555b();

        C10555b() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m42642a((C14826a) obj, (Optional) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final C14824a m42642a(@NotNull C14826a c14826a, @NotNull Optional<Match> optional) {
            C2668g.b(c14826a, "screenshot");
            C2668g.b(optional, "optionalMatch");
            if (optional.c()) {
                Match match = (Match) optional.b();
                if (match instanceof CoreMatch) {
                    optional = ((CoreMatch) match).getPerson().id();
                } else if (match instanceof PlacesMatch) {
                    optional = ((PlacesMatch) match).getPerson().id();
                }
                return new C14824a(C10684c.f35025a, null, optional, c14826a instanceof C16570a);
            }
            optional = null;
            return new C14824a(C10684c.f35025a, null, optional, c14826a instanceof C16570a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "request", "Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent$Request;", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.s$c */
    static final class C10556c<T> implements Consumer<C14824a> {
        /* renamed from: a */
        final /* synthetic */ C8445s f34309a;

        C10556c(C8445s c8445s) {
            this.f34309a = c8445s;
        }

        public /* synthetic */ void accept(Object obj) {
            m42643a((C14824a) obj);
        }

        /* renamed from: a */
        public final void m42643a(@NotNull C14824a c14824a) {
            C2668g.b(c14824a, "request");
            this.f34309a.f30040l.a(c14824a);
        }
    }

    /* renamed from: a */
    private final boolean m36116a(long j, long j2, long j3) {
        return j > 0 && j2 > 0 && j3 >= 0;
    }

    @Inject
    public C8445s(@NotNull C10539u c10539u, @NotNull C10534l c10534l, @NotNull C10532i c10532i, @NotNull String str, @NotNull AppRatingRepository appRatingRepository, @NotNull C8550g c8550g, @NotNull CurrentScreenNotifier currentScreenNotifier, @NotNull GetMatch getMatch, @NotNull C14830c c14830c, @NotNull C16562a c16562a, @NotNull C10376d c10376d, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.b(c10539u, "chatOpenEventDispatcher");
        C2668g.b(c10534l, "chatEndEventDispatcher");
        C2668g.b(c10532i, "chatCloseClientDispatcher");
        C2668g.b(str, "matchId");
        C2668g.b(appRatingRepository, "appRatingRepository");
        C2668g.b(c8550g, "todayDateProvider");
        C2668g.b(currentScreenNotifier, "currentScreenNotifier");
        C2668g.b(getMatch, "getMatch");
        C2668g.b(c14830c, "screenshotty");
        C2668g.b(c16562a, "addAppScreenshotEvent");
        C2668g.b(c10376d, "checkBitmojiConnected");
        C2668g.b(c15679f, "ioScheduler");
        this.f30031c = c10539u;
        this.f30032d = c10534l;
        this.f30033e = c10532i;
        this.f30034f = str;
        this.f30035g = appRatingRepository;
        this.f30036h = c8550g;
        this.f30037i = currentScreenNotifier;
        this.f30038j = getMatch;
        this.f30039k = c14830c;
        this.f30040l = c16562a;
        this.f30041m = c10376d;
        this.f30042n = c15679f;
    }

    /* renamed from: a */
    public final void m36120a(@NotNull Origin origin) {
        C2668g.b(origin, "origin");
        DateTime b = this.f30036h.m36535b();
        C2668g.a(b, "todayDateProvider.dateTime");
        this.f30029a = b.getMillis();
        this.f30037i.notify(C10684c.f35025a);
        m36118d();
        this.f30031c.m42630a(new C8436a(this.f30034f, origin, this.f30041m.m42204a().booleanValue()));
    }

    /* renamed from: a */
    public final void m36121a(boolean z) {
        DateTime b = this.f30036h.m36535b();
        C2668g.a(b, "todayDateProvider.dateTime");
        long millis = b.getMillis();
        long millis2 = new Duration(this.f30029a, millis).getMillis();
        if (m36116a(this.f30029a, millis, millis2)) {
            this.f30032d.m42620a(new C8431a(this.f30034f, millis2, z));
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Have invalid timestamps for ChatEndEvent: ");
            stringBuilder.append("ChatStartTime is ");
            stringBuilder.append(this.f30029a);
            stringBuilder.append(", ");
            stringBuilder.append("ChatEndTime is ");
            stringBuilder.append(millis);
            C0001a.c((Throwable) new IllegalStateException(stringBuilder.toString()));
        }
        this.f30030b.a();
    }

    /* renamed from: a */
    public final void m36119a() {
        if (this.f30035g.readNewChatMessageRead()) {
            this.f30035g.writeChatActivityPaused(true);
        }
    }

    /* renamed from: b */
    public final void m36122b() {
        this.f30033e.m42616a(new C8429a("chat_close", this.f30034f));
    }

    @NotNull
    /* renamed from: c */
    public final Predicate<TinderNotification> m36123c() {
        return new C10554a(this);
    }

    /* renamed from: d */
    private final void m36118d() {
        C17356a c17356a = this.f30030b;
        C3959e subscribeOn = this.f30039k.c().withLatestFrom(RxJavaInteropExtKt.toV2Observable(this.f30038j.execute(this.f30034f)), C10555b.f34308a).subscribeOn(this.f30042n);
        Consumer c10556c = new C10556c(this);
        Function1 function1 = ChatActivityPresenter$observeScreenshotForAnalytics$3.f45121a;
        if (function1 != null) {
            function1 = new C10557t(function1);
        }
        c17356a.add(subscribeOn.subscribe(c10556c, (Consumer) function1));
    }
}
