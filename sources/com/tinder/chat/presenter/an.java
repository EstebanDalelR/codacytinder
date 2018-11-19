package com.tinder.chat.presenter;

import com.tinder.chat.target.EmptyChatViewTarget;
import com.tinder.chat.view.model.ChatScreenState;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.domain.match.model.visitor.MatchAvatarUrlsVisitor;
import com.tinder.domain.match.model.visitor.MatchNameVisitor;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.match.qualifiers.PhotoQualityXL;
import com.tinder.utils.RxUtils;
import java.util.List;
import java8.util.Optional;
import java8.util.function.Supplier;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BG\b\u0001\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\r\u0010\u001e\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\r\u0010$\u001a\u00020\u001aH\u0001¢\u0006\u0002\b%R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/chat/presenter/EmptyChatViewPresenter;", "", "chatScreenStateSupplier", "Ljava8/util/function/Supplier;", "Lrx/Observable;", "Lcom/tinder/chat/view/model/ChatScreenState;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "matchNameVisitor", "Lcom/tinder/domain/match/model/visitor/MatchNameVisitor;", "matchAvatarUrlsVisitor", "Lcom/tinder/domain/match/model/visitor/MatchAvatarUrlsVisitor;", "matchId", "", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "(Ljava8/util/function/Supplier;Lcom/tinder/domain/match/usecase/GetMatch;Lcom/tinder/domain/match/model/visitor/MatchNameVisitor;Lcom/tinder/domain/match/model/visitor/MatchAvatarUrlsVisitor;Ljava/lang/String;Lcom/tinder/domain/config/TopPicksConfig;)V", "subscription", "Lrx/Subscription;", "target", "Lcom/tinder/chat/target/EmptyChatViewTarget;", "getTarget$Tinder_release", "()Lcom/tinder/chat/target/EmptyChatViewTarget;", "setTarget$Tinder_release", "(Lcom/tinder/chat/target/EmptyChatViewTarget;)V", "bindMatch", "", "match", "Lcom/tinder/domain/match/model/Match;", "handleMatchAttribution", "observeChatScreenState", "observeChatScreenState$Tinder_release", "setupAvatar", "setupSuggestionMessage", "setupTimestamp", "setupTitle", "unsubscribe", "unsubscribe$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class an {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public EmptyChatViewTarget f30013a;
    /* renamed from: b */
    private Subscription f30014b;
    /* renamed from: c */
    private final Supplier<Observable<ChatScreenState>> f30015c;
    /* renamed from: d */
    private final GetMatch f30016d;
    /* renamed from: e */
    private final MatchNameVisitor f30017e;
    /* renamed from: f */
    private final MatchAvatarUrlsVisitor f30018f;
    /* renamed from: g */
    private final String f30019g;
    /* renamed from: h */
    private final TopPicksConfig f30020h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chatScreenState", "Lcom/tinder/chat/view/model/ChatScreenState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.an$a */
    static final class C12733a<T, R> implements Func1<ChatScreenState, Boolean> {
        /* renamed from: a */
        public static final C12733a f41055a = new C12733a();

        C12733a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50109a((ChatScreenState) obj));
        }

        /* renamed from: a */
        public final boolean m50109a(ChatScreenState chatScreenState) {
            return chatScreenState == ChatScreenState.EMPTY_SCREEN ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lrx/Observable;", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "it", "Lcom/tinder/chat/view/model/ChatScreenState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.an$b */
    static final class C12734b<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ an f41056a;

        C12734b(an anVar) {
            this.f41056a = anVar;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50110a((ChatScreenState) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Observable<Optional<Match>> m50110a(ChatScreenState chatScreenState) {
            return this.f41056a.f30016d.execute(this.f41056a.f30019g);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.an$c */
    static final class C12735c<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C12735c f41057a = new C12735c();

        C12735c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50111a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m50111a(Optional<Match> optional) {
            C2668g.a(optional, "matchOptional");
            return optional.c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.an$d */
    static final class C13716d<T> implements Action1<Optional<Match>> {
        /* renamed from: a */
        final /* synthetic */ an f43581a;

        C13716d(an anVar) {
            this.f43581a = anVar;
        }

        public /* synthetic */ void call(Object obj) {
            m53255a((Optional) obj);
        }

        /* renamed from: a */
        public final void m53255a(Optional<Match> optional) {
            an anVar = this.f43581a;
            optional = optional.b();
            C2668g.a(optional, "matchOptional.get()");
            anVar.m36097a((Match) optional);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.an$e */
    static final class C13717e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13717e f43582a = new C13717e();

        C13717e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53256a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53256a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fetch match failed: ");
            stringBuilder.append(th);
            C0001a.e(stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public an(@NotNull Supplier<Observable<ChatScreenState>> supplier, @NotNull GetMatch getMatch, @NotNull MatchNameVisitor matchNameVisitor, @PhotoQualityXL @NotNull MatchAvatarUrlsVisitor matchAvatarUrlsVisitor, @NotNull String str, @NotNull TopPicksConfig topPicksConfig) {
        C2668g.b(supplier, "chatScreenStateSupplier");
        C2668g.b(getMatch, "getMatch");
        C2668g.b(matchNameVisitor, "matchNameVisitor");
        C2668g.b(matchAvatarUrlsVisitor, "matchAvatarUrlsVisitor");
        C2668g.b(str, "matchId");
        C2668g.b(topPicksConfig, "topPicksConfig");
        this.f30015c = supplier;
        this.f30016d = getMatch;
        this.f30017e = matchNameVisitor;
        this.f30018f = matchAvatarUrlsVisitor;
        this.f30019g = str;
        this.f30020h = topPicksConfig;
    }

    @Take
    /* renamed from: a */
    public final void m36104a() {
        Subscription a = ((Observable) this.f30015c.get()).f(C12733a.f41055a).h(new C12734b(this)).f(C12735c.f41057a).a(RxUtils.a()).a(new C13716d(this), C13717e.f43582a);
        C2668g.a(a, "chatScreenStateSupplier.…h failed: $throwable\") })");
        this.f30014b = a;
    }

    @Drop
    /* renamed from: b */
    public final void m36105b() {
        Subscription subscription = this.f30014b;
        if (subscription == null) {
            C2668g.b("subscription");
        }
        if (!subscription.isUnsubscribed()) {
            subscription = this.f30014b;
            if (subscription == null) {
                C2668g.b("subscription");
            }
            subscription.unsubscribe();
        }
    }

    /* renamed from: a */
    private final void m36097a(Match match) {
        m36099b(match);
        m36101c(match);
        m36102d(match);
        m36100c();
        m36103e(match);
    }

    /* renamed from: b */
    private final void m36099b(Match match) {
        if (match instanceof CoreMatch) {
            EmptyChatViewTarget emptyChatViewTarget = this.f30013a;
            if (emptyChatViewTarget == null) {
                C2668g.b("target");
            }
            match = match.accept(this.f30017e);
            C2668g.a(match, "match.accept(matchNameVisitor)");
            emptyChatViewTarget.showCoreMatchTitle((String) match);
        }
    }

    /* renamed from: c */
    private final void m36101c(Match match) {
        EmptyChatViewTarget emptyChatViewTarget = this.f30013a;
        if (emptyChatViewTarget == null) {
            C2668g.b("target");
        }
        emptyChatViewTarget.showTimestamp(match.getCreationDate().getMillis());
    }

    /* renamed from: d */
    private final void m36102d(Match match) {
        EmptyChatViewTarget emptyChatViewTarget = this.f30013a;
        if (emptyChatViewTarget == null) {
            C2668g.b("target");
        }
        Object accept = match.accept(this.f30018f);
        C2668g.a(accept, "match.accept(matchAvatarUrlsVisitor)");
        emptyChatViewTarget.showAvatar(match, (List) accept);
    }

    /* renamed from: c */
    private final void m36100c() {
        EmptyChatViewTarget emptyChatViewTarget = this.f30013a;
        if (emptyChatViewTarget == null) {
            C2668g.b("target");
        }
        emptyChatViewTarget.showSuggestionMessage();
    }

    /* renamed from: e */
    private final void m36103e(Match match) {
        EmptyChatViewTarget emptyChatViewTarget;
        switch (ao.f30021a[match.getAttribution().ordinal()]) {
            case 1:
                emptyChatViewTarget = this.f30013a;
                if (emptyChatViewTarget == null) {
                    C2668g.b("target");
                }
                match = match.accept(this.f30017e);
                C2668g.a(match, "match.accept(matchNameVisitor)");
                emptyChatViewTarget.showMatchFromBoost((String) match);
                return;
            case 2:
                emptyChatViewTarget = this.f30013a;
                if (emptyChatViewTarget == null) {
                    C2668g.b("target");
                }
                match = match.accept(this.f30017e);
                C2668g.a(match, "match.accept(matchNameVisitor)");
                emptyChatViewTarget.showISuperLikeThem((String) match);
                return;
            case 3:
                emptyChatViewTarget = this.f30013a;
                if (emptyChatViewTarget == null) {
                    C2668g.b("target");
                }
                match = match.accept(this.f30017e);
                C2668g.a(match, "match.accept(matchNameVisitor)");
                emptyChatViewTarget.showTheySuperLikeMe((String) match);
                return;
            case 4:
            case 6:
                return;
            case 5:
                emptyChatViewTarget = this.f30013a;
                if (emptyChatViewTarget == null) {
                    C2668g.b("target");
                }
                match = match.accept(this.f30017e);
                C2668g.a(match, "match.accept(matchNameVisitor)");
                emptyChatViewTarget.showMatchFromFastMatch((String) match);
                return;
            case 7:
                if (this.f30020h.isEnabled()) {
                    emptyChatViewTarget = this.f30013a;
                    if (emptyChatViewTarget == null) {
                        C2668g.b("target");
                    }
                    match = match.accept(this.f30017e);
                    C2668g.a(match, "match.accept(matchNameVisitor)");
                    emptyChatViewTarget.showMatchFromTopPicks((String) match);
                    return;
                }
                return;
            case 8:
                if (!(match instanceof PlacesMatch)) {
                    match = null;
                }
                PlacesMatch placesMatch = (PlacesMatch) match;
                if (placesMatch != null) {
                    emptyChatViewTarget = this.f30013a;
                    if (emptyChatViewTarget == null) {
                        C2668g.b("target");
                    }
                    emptyChatViewTarget.showMatchFromPlaces(placesMatch.getPlace().getName());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
