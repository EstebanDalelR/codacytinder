package com.tinder.messageads.p298e;

import android.location.Location;
import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.core.p201a.C8588a;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.domain.match.usecase.TouchMatch;
import com.tinder.messageads.model.MessageAdTrackingEvent;
import com.tinder.messageads.target.AdMessageChatTarget;
import com.tinder.sponsoredmessage.p414a.C16826b;
import com.tinder.sponsoredmessage.p414a.C16827d;
import com.tinder.sponsoredmessage.p479d.C16844a;
import com.tinder.utils.RxUtils;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import java.util.Arrays;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001BQ\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u000e\u0010\u000e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018J\r\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010\"J\r\u0010#\u001a\u00020\u001fH\u0001¢\u0006\u0002\b$J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0018H\u0002J\r\u0010&\u001a\u00020\u001fH\u0000¢\u0006\u0002\b'J\r\u0010\u0010\u001a\u00020\u001fH\u0001¢\u0006\u0002\b(J\r\u0010)\u001a\u00020\u001fH\u0001¢\u0006\u0002\b*J\f\u0010!\u001a\u00020\u001f*\u00020\u0018H\u0002J\f\u0010+\u001a\u00020\u001f*\u00020\u0018H\u0002J\f\u0010,\u001a\u00020\u001f*\u00020\u0018H\u0002R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/tinder/messageads/presenter/AdMessageChatPresenter;", "", "matchId", "", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "locationProvider", "Lcom/tinder/core/provider/LocationProvider;", "currentUserProvider", "Lcom/tinder/data/user/CurrentUserProvider;", "addAdChatOpenEvent", "Lcom/tinder/sponsoredmessage/analytics/AddAdChatOpenEvent;", "addChatCloseEvent", "Lcom/tinder/sponsoredmessage/analytics/AddAdChatCloseEvent;", "deleteSponsoredMessage", "Lcom/tinder/sponsoredmessage/usecase/DeleteSponsoredMessage;", "touchMatch", "Lcom/tinder/domain/match/usecase/TouchMatch;", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "(Ljava/lang/String;Lcom/tinder/domain/match/usecase/GetMatch;Lcom/tinder/core/provider/LocationProvider;Lcom/tinder/data/user/CurrentUserProvider;Lcom/tinder/sponsoredmessage/analytics/AddAdChatOpenEvent;Lcom/tinder/sponsoredmessage/analytics/AddAdChatCloseEvent;Lcom/tinder/sponsoredmessage/usecase/DeleteSponsoredMessage;Lcom/tinder/domain/match/usecase/TouchMatch;Lcom/tinder/addy/tracker/AdUrlTracker;)V", "matchSubscription", "Lrx/Subscription;", "messageAdMatch", "Lcom/tinder/domain/match/model/MessageAdMatch;", "target", "Lcom/tinder/messageads/target/AdMessageChatTarget;", "getTarget$Tinder_release", "()Lcom/tinder/messageads/target/AdMessageChatTarget;", "setTarget$Tinder_release", "(Lcom/tinder/messageads/target/AdMessageChatTarget;)V", "", "match", "fireChatCloseEvent", "()Lkotlin/Unit;", "loadMatch", "loadMatch$Tinder_release", "parseMessage", "pingClickTrackingUrls", "pingClickTrackingUrls$Tinder_release", "touchMatch$Tinder_release", "unsubscribe", "unsubscribe$Tinder_release", "fireChatOpenEvent", "pingOpenTrackingUrls", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.e.a */
public final class C9908a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public AdMessageChatTarget f32750a;
    /* renamed from: b */
    private Subscription f32751b;
    /* renamed from: c */
    private MessageAdMatch f32752c;
    /* renamed from: d */
    private final String f32753d;
    /* renamed from: e */
    private final GetMatch f32754e;
    /* renamed from: f */
    private final C8588a f32755f;
    /* renamed from: g */
    private final CurrentUserProvider f32756g;
    /* renamed from: h */
    private final C16827d f32757h;
    /* renamed from: i */
    private final C16826b f32758i;
    /* renamed from: j */
    private final C16844a f32759j;
    /* renamed from: k */
    private final TouchMatch f32760k;
    /* renamed from: l */
    private final AdUrlTracker f32761l;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.e.a$f */
    static final class C12123f implements Action {
        /* renamed from: a */
        public static final C12123f f39345a = new C12123f();

        C12123f() {
        }

        public final void run() {
            C0001a.b("Marked Sponsored Message as touched", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.e.a$g */
    static final class C12124g<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12124g f39346a = new C12124g();

        C12124g() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48265a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48265a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/MessageAdMatch;", "it", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.e.a$c */
    static final class C13476c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C9908a f42739a;

        C13476c(C9908a c9908a) {
            this.f42739a = c9908a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m52045a((Optional) obj);
        }

        @NotNull
        /* renamed from: a */
        public final MessageAdMatch m52045a(Optional<Match> optional) {
            C2668g.a(optional, "it");
            if (optional.c()) {
                if (optional.b() instanceof MessageAdMatch) {
                    optional = optional.b();
                    if (optional != null) {
                        return (MessageAdMatch) optional;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.match.model.MessageAdMatch");
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No Sponsored Match found for matchId: ");
            stringBuilder.append(this.f42739a.f32753d);
            throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.e.a$a */
    static final class C14082a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C9908a f44601a;

        C14082a(C9908a c9908a) {
            this.f44601a = c9908a;
        }

        public final void call() {
            this.f44601a.m40732a().showUnMatchSuccessful();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.e.a$b */
    static final class C14083b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C9908a f44602a;
        /* renamed from: b */
        final /* synthetic */ MessageAdMatch f44603b;

        C14083b(C9908a c9908a, MessageAdMatch messageAdMatch) {
            this.f44602a = c9908a;
            this.f44603b = messageAdMatch;
        }

        public /* synthetic */ void call(Object obj) {
            m53804a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53804a(Throwable th) {
            C0001a.c(th, "Failed to delete sponsored match %s", new Object[]{this.f44603b.getId()});
            this.f44602a.m40732a().showUnMatchFailure();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/match/model/MessageAdMatch;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.e.a$d */
    static final class C14084d<T> implements Action1<MessageAdMatch> {
        /* renamed from: a */
        final /* synthetic */ C9908a f44604a;

        C14084d(C9908a c9908a) {
            this.f44604a = c9908a;
        }

        public /* synthetic */ void call(Object obj) {
            m53805a((MessageAdMatch) obj);
        }

        /* renamed from: a */
        public final void m53805a(MessageAdMatch messageAdMatch) {
            Object obj = this.f44604a.f32752c == null ? 1 : null;
            this.f44604a.f32752c = messageAdMatch;
            if (obj != null) {
                C9908a c9908a = this.f44604a;
                C2668g.a(messageAdMatch, "it");
                c9908a.m40725b(messageAdMatch);
                this.f44604a.m40730d(messageAdMatch);
            }
            AdMessageChatTarget a = this.f44604a.m40732a();
            C9908a c9908a2 = this.f44604a;
            C2668g.a(messageAdMatch, "it");
            a.showMessage(c9908a2.m40731e(messageAdMatch));
            this.f44604a.m40732a().showAvatar(messageAdMatch.getLogoUrl());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.e.a$e */
    static final class C14085e<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C9908a f44605a;

        C14085e(C9908a c9908a) {
            this.f44605a = c9908a;
        }

        public /* synthetic */ void call(Object obj) {
            m53806a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53806a(Throwable th) {
            C0001a.c(th, "Unable to load Sponsored Ad match.", new Object[0]);
            this.f44605a.m40732a().showError();
        }
    }

    @Inject
    public C9908a(@NotNull String str, @NotNull GetMatch getMatch, @NotNull C8588a c8588a, @NotNull CurrentUserProvider currentUserProvider, @NotNull C16827d c16827d, @NotNull C16826b c16826b, @NotNull C16844a c16844a, @NotNull TouchMatch touchMatch, @NotNull AdUrlTracker adUrlTracker) {
        C2668g.b(str, "matchId");
        C2668g.b(getMatch, "getMatch");
        C2668g.b(c8588a, "locationProvider");
        C2668g.b(currentUserProvider, "currentUserProvider");
        C2668g.b(c16827d, "addAdChatOpenEvent");
        C2668g.b(c16826b, "addChatCloseEvent");
        C2668g.b(c16844a, "deleteSponsoredMessage");
        C2668g.b(touchMatch, "touchMatch");
        C2668g.b(adUrlTracker, "adUrlTracker");
        this.f32753d = str;
        this.f32754e = getMatch;
        this.f32755f = c8588a;
        this.f32756g = currentUserProvider;
        this.f32757h = c16827d;
        this.f32758i = c16826b;
        this.f32759j = c16844a;
        this.f32760k = touchMatch;
        this.f32761l = adUrlTracker;
    }

    @NotNull
    /* renamed from: a */
    public final AdMessageChatTarget m40732a() {
        AdMessageChatTarget adMessageChatTarget = this.f32750a;
        if (adMessageChatTarget == null) {
            C2668g.b("target");
        }
        return adMessageChatTarget;
    }

    @Take
    /* renamed from: b */
    public final void m40734b() {
        Subscription a = this.f32754e.execute(this.f32753d).a(RxUtils.a()).c(1).k(new C13476c(this)).a(new C14084d(this), new C14085e(this));
        C2668g.a(a, "getMatch.execute(matchId…rror()\n                })");
        this.f32751b = a;
    }

    @Take
    /* renamed from: c */
    public final void m40735c() {
        this.f32760k.execute(this.f32753d).b(C15756a.b()).a(C12123f.f39345a, C12124g.f39346a);
    }

    @Drop
    /* renamed from: d */
    public final void m40736d() {
        Subscription subscription = this.f32751b;
        if (subscription == null) {
            C2668g.b("matchSubscription");
        }
        RxUtils.b(subscription);
    }

    @Nullable
    /* renamed from: e */
    public final C15813i m40737e() {
        MessageAdMatch messageAdMatch = this.f32752c;
        if (messageAdMatch == null) {
            return null;
        }
        m40727c(messageAdMatch);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m40733a(@NotNull MessageAdMatch messageAdMatch) {
        C2668g.b(messageAdMatch, "match");
        this.f32759j.a(messageAdMatch).a(RxUtils.a().b()).a(new C14082a(this), new C14083b(this, messageAdMatch));
    }

    /* renamed from: f */
    public final void m40738f() {
        MessageAdMatch messageAdMatch = this.f32752c;
        if (messageAdMatch != null) {
            this.f32761l.a(messageAdMatch.getId(), MessageAdTrackingEvent.CLICK);
        }
    }

    /* renamed from: b */
    private final void m40725b(@NotNull MessageAdMatch messageAdMatch) {
        this.f32757h.a(messageAdMatch);
    }

    /* renamed from: c */
    private final void m40727c(@NotNull MessageAdMatch messageAdMatch) {
        this.f32758i.a(messageAdMatch);
    }

    /* renamed from: d */
    private final void m40730d(@NotNull MessageAdMatch messageAdMatch) {
        this.f32761l.a(messageAdMatch.getId(), MessageAdTrackingEvent.OPEN);
    }

    /* renamed from: e */
    private final String m40731e(MessageAdMatch messageAdMatch) {
        Object obj = null;
        String a = C19303i.a(messageAdMatch.getBody(), "\n", "<br />", false, 4, null);
        Location a2 = this.f32755f.m36615a();
        String str = "%.2f";
        Object[] objArr = new Object[1];
        objArr[0] = a2 != null ? Double.valueOf(a2.getLatitude()) : null;
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(format, "java.lang.String.format(this, *args)");
        str = "%.2f";
        Object[] objArr2 = new Object[1];
        if (a2 != null) {
            obj = Double.valueOf(a2.getLongitude());
        }
        objArr2[0] = obj;
        String format2 = String.format(str, Arrays.copyOf(objArr2, objArr2.length));
        C2668g.a(format2, "java.lang.String.format(this, *args)");
        ProfileUser profileUser = r0.f32756g.get();
        if (profileUser == null) {
            C2668g.a();
        }
        String id = profileUser.id();
        C2668g.a(id, "currentUserProvider.get()!!.id()");
        id = C19303i.a(C19303i.a(C19303i.a(messageAdMatch.getClickthroughUrl(), "__LAT__", format, false, 4, null), "__LON__", format2, false, 4, null), "__UUID__", id, false, 4, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(a);
        stringBuilder.append(" <a href=\"");
        stringBuilder.append(id);
        stringBuilder.append("\">");
        stringBuilder.append(messageAdMatch.getClickthroughText());
        stringBuilder.append("</a>");
        return stringBuilder.toString();
    }
}
