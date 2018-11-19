package com.tinder.fastmatch.newcount;

import com.tinder.domain.fastmatch.RefreshNotifier;
import com.tinder.domain.fastmatch.RefreshNotifier.SourceType;
import com.tinder.domain.fastmatch.newCount.NewCountFetcher;
import com.tinder.domain.fastmatch.newCount.NewCountFetcher.State;
import com.tinder.domain.fastmatch.repository.FastMatchRecsResponseRepository;
import com.tinder.domain.fastmatch.repository.NewCountRepository;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.C2671a;
import rx.Completable;
import rx.Completable.Transformer;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p500e.C19573b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BG\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\rH\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bJ\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/tinder/fastmatch/newcount/NewCountUpdateScheduler;", "", "refreshNotifier", "Lcom/tinder/domain/fastmatch/RefreshNotifier;", "fastMatchRecsResponseRepository", "Lcom/tinder/domain/fastmatch/repository/FastMatchRecsResponseRepository;", "newCountFetcher", "Lcom/tinder/domain/fastmatch/newCount/NewCountFetcher;", "newCountRepository", "Lcom/tinder/domain/fastmatch/repository/NewCountRepository;", "newCountUpdateIntervalProvider", "Lcom/tinder/fastmatch/newcount/NewCountUpdateIntervalProvider;", "ioScheduler", "Lrx/Scheduler;", "rescheduleDelayTimeUnit", "Ljava/util/concurrent/TimeUnit;", "rescheduleDelayScheduler", "(Lcom/tinder/domain/fastmatch/RefreshNotifier;Lcom/tinder/domain/fastmatch/repository/FastMatchRecsResponseRepository;Lcom/tinder/domain/fastmatch/newCount/NewCountFetcher;Lcom/tinder/domain/fastmatch/repository/NewCountRepository;Lcom/tinder/fastmatch/newcount/NewCountUpdateIntervalProvider;Lrx/Scheduler;Ljava/util/concurrent/TimeUnit;Lrx/Scheduler;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "getCompositeSubscription", "()Lrx/subscriptions/CompositeSubscription;", "setCompositeSubscription", "(Lrx/subscriptions/CompositeSubscription;)V", "rescheduleAfterDelay", "Lrx/Completable$Transformer;", "rescheduleDelay", "", "timeUnit", "delayScheduler", "resetDelay", "", "delay", "schedule", "unschedule", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.newcount.e */
public final class C9383e {
    /* renamed from: a */
    private long f31471a = 20000;
    /* renamed from: b */
    private final Transformer f31472b = m39284a(this.f31480j, this.f31481k);
    @NotNull
    /* renamed from: c */
    private C19573b f31473c = new C19573b();
    /* renamed from: d */
    private final RefreshNotifier f31474d;
    /* renamed from: e */
    private final FastMatchRecsResponseRepository f31475e;
    /* renamed from: f */
    private final NewCountFetcher f31476f;
    /* renamed from: g */
    private final NewCountRepository f31477g;
    /* renamed from: h */
    private final C9381b f31478h;
    /* renamed from: i */
    private final C2671a f31479i;
    /* renamed from: j */
    private final TimeUnit f31480j;
    /* renamed from: k */
    private final C2671a f31481k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/domain/fastmatch/newCount/NewCountFetcher$State;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.e$h */
    static final class C13203h<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C9383e f41906a;

        C13203h(C9383e c9383e) {
            this.f41906a = c9383e;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51185a((State) obj);
        }

        /* renamed from: a */
        public final Observable<Object> m51185a(State state) {
            if (state != null) {
                switch (C9384f.f31482a[state.ordinal()]) {
                    case 1:
                    case 2:
                        return Observable.b(this.f41906a.f31471a, this.f41906a.f31480j, this.f41906a.f31481k).h(new Func1<T, Observable<? extends R>>() {
                            public /* synthetic */ Object call(Object obj) {
                                return m51184a((Long) obj);
                            }

                            /* renamed from: a */
                            public final Observable<Object> m51184a(Long l) {
                                return this.f41906a.f31476f.fetchCount().d(new C13932g(new NewCountUpdateScheduler$schedule$timerSubscription$1$1$1(this.f41906a.f31477g))).b().a(this.f41906a.f31472b).e();
                            }
                        });
                    case 3:
                        return Observable.c();
                    default:
                        break;
                }
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "completable", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.e$a */
    static final class C13923a implements Transformer {
        /* renamed from: a */
        final /* synthetic */ C9383e f44046a;
        /* renamed from: b */
        final /* synthetic */ TimeUnit f44047b;
        /* renamed from: c */
        final /* synthetic */ C2671a f44048c;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.fastmatch.newcount.e$a$1 */
        static final class C139221<T> implements Action1<Throwable> {
            /* renamed from: a */
            public static final C139221 f44045a = new C139221();

            C139221() {
            }

            public /* synthetic */ void call(Object obj) {
                m53451a((Throwable) obj);
            }

            /* renamed from: a */
            public final void m53451a(Throwable th) {
                C0001a.c(th, "Fast match Update failed", new Object[0]);
            }
        }

        C13923a(C9383e c9383e, TimeUnit timeUnit, C2671a c2671a) {
            this.f44046a = c9383e;
            this.f44047b = timeUnit;
            this.f44048c = c2671a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m53452a((Completable) obj);
        }

        /* renamed from: a */
        public final Completable m53452a(Completable completable) {
            return completable.c(C139221.f44045a).c().c(new Func1<Observable<? extends Void>, Observable<?>>() {
                public /* synthetic */ Object call(Object obj) {
                    return m51183a((Observable) obj);
                }

                /* renamed from: a */
                public final Observable<? extends Void> m51183a(Observable<? extends Void> observable) {
                    return observable.d(this.f44046a.f31471a, this.f44047b, this.f44048c);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.e$b */
    static final class C13924b<T> implements Action1<Long> {
        /* renamed from: a */
        final /* synthetic */ C9383e f44049a;

        C13924b(C9383e c9383e) {
            this.f44049a = c9383e;
        }

        public /* synthetic */ void call(Object obj) {
            m53453a((Long) obj);
        }

        /* renamed from: a */
        public final void m53453a(Long l) {
            C9383e c9383e = this.f44049a;
            C2668g.a(l, "it");
            c9383e.m39291a(l.longValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.e$c */
    static final class C13925c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13925c f44050a = new C13925c();

        C13925c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53454a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53454a(Throwable th) {
            C0001a.c(th, "New count interval update failed", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/fastmatch/RefreshNotifier$SourceType;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.e$d */
    static final class C13926d<T> implements Action1<SourceType> {
        /* renamed from: a */
        final /* synthetic */ C9383e f44051a;

        C13926d(C9383e c9383e) {
            this.f44051a = c9383e;
        }

        public /* synthetic */ void call(Object obj) {
            m53455a((SourceType) obj);
        }

        /* renamed from: a */
        public final void m53455a(SourceType sourceType) {
            this.f44051a.f31476f.resetState();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.e$e */
    static final class C13927e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13927e f44052a = new C13927e();

        C13927e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53456a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53456a(Throwable th) {
            C0001a.c(th, "Pull to refresh failed", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.e$f */
    static final class C13928f<T> implements Action1<String> {
        /* renamed from: a */
        final /* synthetic */ C9383e f44053a;

        C13928f(C9383e c9383e) {
            this.f44053a = c9383e;
        }

        public /* synthetic */ void call(Object obj) {
            m53457a((String) obj);
        }

        /* renamed from: a */
        public final void m53457a(String str) {
            NewCountFetcher a = this.f44053a.f31476f;
            C2668g.a(str, "it");
            a.initFetch(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.e$g */
    static final class C13929g<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13929g f44054a = new C13929g();

        C13929g() {
        }

        public /* synthetic */ void call(Object obj) {
            m53458a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53458a(Throwable th) {
            C0001a.c(th, "Token update failed", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.e$i */
    static final class C13930i<T> implements Action1<Object> {
        /* renamed from: a */
        public static final C13930i f44055a = new C13930i();

        C13930i() {
        }

        public final void call(Object obj) {
            C0001a.b("Token state updated", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.newcount.e$j */
    static final class C13931j<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13931j f44056a = new C13931j();

        C13931j() {
        }

        public /* synthetic */ void call(Object obj) {
            m53459a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53459a(Throwable th) {
            C0001a.c(th, "Token state failed", new Object[0]);
        }
    }

    public C9383e(@NotNull RefreshNotifier refreshNotifier, @NotNull FastMatchRecsResponseRepository fastMatchRecsResponseRepository, @NotNull NewCountFetcher newCountFetcher, @NotNull NewCountRepository newCountRepository, @NotNull C9381b c9381b, @NotNull C2671a c2671a, @NotNull TimeUnit timeUnit, @NotNull C2671a c2671a2) {
        C2668g.b(refreshNotifier, "refreshNotifier");
        C2668g.b(fastMatchRecsResponseRepository, "fastMatchRecsResponseRepository");
        C2668g.b(newCountFetcher, "newCountFetcher");
        C2668g.b(newCountRepository, "newCountRepository");
        C2668g.b(c9381b, "newCountUpdateIntervalProvider");
        C2668g.b(c2671a, "ioScheduler");
        C2668g.b(timeUnit, "rescheduleDelayTimeUnit");
        C2668g.b(c2671a2, "rescheduleDelayScheduler");
        this.f31474d = refreshNotifier;
        this.f31475e = fastMatchRecsResponseRepository;
        this.f31476f = newCountFetcher;
        this.f31477g = newCountRepository;
        this.f31478h = c9381b;
        this.f31479i = c2671a;
        this.f31480j = timeUnit;
        this.f31481k = c2671a2;
    }

    /* renamed from: a */
    public final void m39291a(long j) {
        if (this.f31471a != j) {
            this.f31471a = j;
            this.f31476f.rescheduleState();
        }
    }

    /* renamed from: a */
    public final void m39290a() {
        if (!this.f31473c.b()) {
            Subscription a = this.f31478h.m39282a().a(new C13924b(this), C13925c.f44050a);
            Subscription a2 = this.f31474d.observeRefresh().a(new C13926d(this), C13927e.f44052a);
            Subscription a3 = this.f31475e.observeToken().a(new C13928f(this), C13929g.f44054a);
            Subscription a4 = this.f31476f.observeState().a(this.f31479i).p(new C13203h(this)).a(C13930i.f44055a, C13931j.f44056a);
            this.f31473c.a(new Subscription[]{a, a2, a3, a4});
        }
    }

    /* renamed from: b */
    public final void m39292b() {
        this.f31473c.a();
    }

    /* renamed from: a */
    private final Transformer m39284a(TimeUnit timeUnit, C2671a c2671a) {
        return new C13923a(this, timeUnit, c2671a);
    }
}
