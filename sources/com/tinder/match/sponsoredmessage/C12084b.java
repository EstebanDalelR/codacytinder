package com.tinder.match.sponsoredmessage;

import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.sponsoredmessage.AdRequestRule;
import com.tinder.sponsoredmessage.C15034e;
import java8.util.Optional;
import java8.util.function.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/match/sponsoredmessage/MessageAdCadenceRequestRule;", "Lcom/tinder/sponsoredmessage/AdRequestRule;", "config", "Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;Lcom/tinder/domain/match/repository/MatchRepository;Lkotlin/jvm/functions/Function0;)V", "shouldRequestAd", "Lrx/Single;", "", "shouldRequestRule", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.sponsoredmessage.b */
public final class C12084b implements AdRequestRule {
    /* renamed from: a */
    private final C15034e f39234a;
    /* renamed from: b */
    private final MatchRepository f39235b;
    /* renamed from: c */
    private final Function0<DateTime> f39236c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "match", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.b$b */
    static final class C12083b<T, R> implements Function<T, U> {
        /* renamed from: a */
        final /* synthetic */ C12084b f39233a;

        C12083b(C12084b c12084b) {
            this.f39233a = c12084b;
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m48188a((Match) obj));
        }

        /* renamed from: a */
        public final boolean m48188a(Match match) {
            return ((DateTime) this.f39233a.f39236c.invoke()).getMillis() - match.getCreationDate().getMillis() >= this.f39233a.f39234a.d() ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.b$a */
    static final class C13443a<T, R> implements Func1<Throwable, Boolean> {
        /* renamed from: a */
        public static final C13443a f42633a = new C13443a();

        C13443a() {
        }

        /* renamed from: a */
        public final boolean m51941a(Throwable th) {
            return true;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51941a((Throwable) obj));
        }
    }

    @Inject
    public C12084b(@NotNull C15034e c15034e, @NotNull MatchRepository matchRepository, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(c15034e, "config");
        C2668g.b(matchRepository, "matchRepository");
        C2668g.b(function0, "dateTimeProvider");
        this.f39234a = c15034e;
        this.f39235b = matchRepository;
        this.f39236c = function0;
    }

    @NotNull
    public Single<Boolean> shouldRequestAd() {
        Single<Boolean> a = this.f39235b.observeLastMessageAdMatch().h().k(new C13444c(new MessageAdCadenceRequestRule$shouldRequestAd$1(this))).m(C13443a.f42633a).a();
        C2668g.a(a, "matchRepository.observeL…              .toSingle()");
        return a;
    }

    /* renamed from: a */
    private final boolean m48191a(Optional<Match> optional) {
        optional = optional.a(new C12083b(this)).c(Boolean.valueOf(true));
        C2668g.a(optional, "matchOptional.map { matc…is\n        }.orElse(true)");
        return ((Boolean) optional).booleanValue();
    }
}
