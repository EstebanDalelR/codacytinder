package com.tinder.match.sponsoredmessage;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.MessageRepository;
import com.tinder.sponsoredmessage.AdRequestRule;
import com.tinder.sponsoredmessage.C15034e;
import java8.util.Optional;
import java8.util.function.Function;
import java8.util.function.Supplier;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Single;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/match/sponsoredmessage/MessageAdMinimumIntersticeRequestRule;", "Lcom/tinder/sponsoredmessage/AdRequestRule;", "config", "Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "(Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;Lcom/tinder/domain/match/repository/MatchRepository;Lcom/tinder/domain/message/MessageRepository;)V", "shouldRequestAd", "Lrx/Single;", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.sponsoredmessage.e */
public final class C12087e implements AdRequestRule {
    /* renamed from: a */
    private final C15034e f39239a;
    /* renamed from: b */
    private final MatchRepository f39240b;
    /* renamed from: c */
    private final MessageRepository f39241c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.e$a */
    static final class C13446a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13446a f42638a = new C13446a();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "it", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.match.sponsoredmessage.e$a$1 */
        static final class C120851<T, R> implements Function<T, U> {
            /* renamed from: a */
            public static final C120851 f39237a = new C120851();

            C120851() {
            }

            public /* synthetic */ Object apply(Object obj) {
                return m48193a((Match) obj);
            }

            @NotNull
            /* renamed from: a */
            public final DateTime m48193a(Match match) {
                return match.getLastActivityDate();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "get"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.match.sponsoredmessage.e$a$2 */
        static final class C120862<T> implements Supplier<DateTime> {
            /* renamed from: a */
            public static final C120862 f39238a = new C120862();

            C120862() {
            }

            public /* synthetic */ Object get() {
                return m48194a();
            }

            @NotNull
            /* renamed from: a */
            public final DateTime m48194a() {
                return new DateTime(0);
            }
        }

        C13446a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51945a((Optional) obj);
        }

        /* renamed from: a */
        public final DateTime m51945a(Optional<Match> optional) {
            return (DateTime) optional.a(C120851.f39237a).b(C120862.f39238a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lorg/joda/time/DateTime;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.e$b */
    static final class C13447b<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C12087e f42639a;

        C13447b(C12087e c12087e) {
            this.f42639a = c12087e;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51946a((DateTime) obj);
        }

        /* renamed from: a */
        public final Observable<Long> m51946a(DateTime dateTime) {
            MessageRepository a = this.f42639a.f39241c;
            C2668g.a(dateTime, "it");
            return a.countDistinctMatchesFromMessagesSinceDate(dateTime).h();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.e$c */
    static final class C13448c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C12087e f42640a;

        C13448c(C12087e c12087e) {
            this.f42640a = c12087e;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51947a((Long) obj));
        }

        /* renamed from: a */
        public final boolean m51947a(Long l) {
            return l.longValue() >= ((long) this.f42640a.f39239a.e()) ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.e$e */
    static final class C13449e<T, R> implements Func1<Throwable, Boolean> {
        /* renamed from: a */
        public static final C13449e f42641a = new C13449e();

        C13449e() {
        }

        /* renamed from: a */
        public final boolean m51948a(Throwable th) {
            return true;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51948a((Throwable) obj));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.e$d */
    static final class C14073d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14073d f44587a = new C14073d();

        C14073d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53797a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53797a(Throwable th) {
            C0001a.c(th, "Error evaluating MessageAdMinimumIntersticeRequestRule for Ad Messages", new Object[0]);
        }
    }

    @Inject
    public C12087e(@NotNull C15034e c15034e, @NotNull MatchRepository matchRepository, @NotNull MessageRepository messageRepository) {
        C2668g.b(c15034e, "config");
        C2668g.b(matchRepository, "matchRepository");
        C2668g.b(messageRepository, "messageRepository");
        this.f39239a = c15034e;
        this.f39240b = matchRepository;
        this.f39241c = messageRepository;
    }

    @NotNull
    public Single<Boolean> shouldRequestAd() {
        Single<Boolean> a = this.f39240b.observeLastMessageAdMatch().h().k(C13446a.f42638a).h(new C13447b(this)).k(new C13448c(this)).a(C14073d.f44587a).m(C13449e.f42641a).a();
        C2668g.a(a, "matchRepository\n        …              .toSingle()");
        return a;
    }
}
