package com.tinder.typingindicator.worker;

import com.tinder.common.reactivex.p197b.C8551a;
import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import com.tinder.domain.injection.qualifiers.CurrentDateTimeMillis;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.typingindicator.TypingIndicatorConfig;
import com.tinder.domain.typingindicator.TypingIndicatorConfig.Config;
import com.tinder.domain.typingindicator.TypingIndicatorConfig.NoConfig;
import com.tinder.typingindicator.model.TypingIndicator;
import com.tinder.typingindicator.model.TypingType.C17161a;
import com.tinder.typingindicator.p437d.C15317a;
import com.tinder.typingindicator.repository.C17168c;
import com.tinder.typingindicator.usecase.C17172a;
import com.tinder.typingindicator.usecase.C17172a.C15328a;
import io.reactivex.C15679f;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.disposables.C15676b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u001a\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\u001a0 H\u0002J\b\u0010!\u001a\u00020\u0013H\u0017J\b\u0010\"\u001a\u00020\u0013H\u0017J*\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/tinder/typingindicator/worker/TypingIndicatorEnabledWorker;", "Lcom/tinder/typingindicator/worker/TypingIndicatorWorker;", "typingIndicatorRepository", "Lcom/tinder/typingindicator/repository/TypingIndicatorDataRepository;", "typingIndicatorsScheduler", "Lio/reactivex/Scheduler;", "timeToLiveScheduler", "addChatTypingEvent", "Lcom/tinder/typingindicator/usecase/AddChatTypingEvent;", "currentDateTimeMillis", "Lkotlin/Function0;", "", "(Lcom/tinder/typingindicator/repository/TypingIndicatorDataRepository;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lcom/tinder/typingindicator/usecase/AddChatTypingEvent;Lkotlin/jvm/functions/Function0;)V", "disposableMap", "Lcom/tinder/common/reactivex/disposables/DisposableMap;", "", "typingIndicatorsDisposable", "Lio/reactivex/disposables/Disposable;", "addChatTypingReceiveEvent", "", "receivedTypingIndicator", "Lcom/tinder/typingindicator/model/TypingIndicator;", "deactivateUponExpiration", "Lio/reactivex/Flowable;", "typingIndicator", "timeToLive", "Lkotlin/Pair;", "Ljava/util/concurrent/TimeUnit;", "deactivateUponExpirationOrInterruption", "deactivateUponInterruption", "handleRepositoryUpdatesForTypingIndicator", "loadTypingIndicatorConfigTtl", "Lio/reactivex/Single;", "start", "stop", "typingIndicatorLifespan", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.worker.e */
public final class C17203e implements TypingIndicatorWorker {
    /* renamed from: a */
    private Disposable f52768a = C15676b.m58842b();
    /* renamed from: b */
    private final C8551a<String> f52769b = new C8551a();
    /* renamed from: c */
    private final C17168c f52770c;
    /* renamed from: d */
    private final C15679f f52771d;
    /* renamed from: e */
    private final C15679f f52772e;
    /* renamed from: f */
    private final C17172a f52773f;
    /* renamed from: g */
    private final Function0<Long> f52774g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/typingindicator/model/TypingIndicator;", "error", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.worker.e$a */
    static final class C17194a<T, R> implements Function<Throwable, TypingIndicator> {
        /* renamed from: a */
        final /* synthetic */ TypingIndicator f52757a;
        /* renamed from: b */
        final /* synthetic */ Pair f52758b;

        C17194a(TypingIndicator typingIndicator, Pair pair) {
            this.f52757a = typingIndicator;
            this.f52758b = pair;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m63069a((Throwable) obj);
        }

        @NotNull
        /* renamed from: a */
        public final TypingIndicator m63069a(@NotNull Throwable th) {
            C2668g.b(th, "error");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error deactivating typing indicator ");
            stringBuilder.append(this.f52757a);
            stringBuilder.append(" with ttl ");
            stringBuilder.append(this.f52758b);
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
            return C15317a.m57497b(this.f52757a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/typingindicator/model/TypingIndicator;", "it", "", "apply", "(Lkotlin/Unit;)Lcom/tinder/typingindicator/model/TypingIndicator;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.worker.e$b */
    static final class C17195b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ TypingIndicator f52759a;

        C17195b(TypingIndicator typingIndicator) {
            this.f52759a = typingIndicator;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m63070a((C15813i) obj);
        }

        @NotNull
        /* renamed from: a */
        public final TypingIndicator m63070a(@NotNull C15813i c15813i) {
            C2668g.b(c15813i, "it");
            return C15317a.m57497b(this.f52759a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/tinder/typingindicator/model/TypingIndicator;", "it", "Lkotlin/Pair;", "", "Ljava/util/concurrent/TimeUnit;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.worker.e$c */
    static final class C17196c<T, R> implements Function<T, Publisher<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C17203e f52760a;
        /* renamed from: b */
        final /* synthetic */ TypingIndicator f52761b;

        C17196c(C17203e c17203e, TypingIndicator typingIndicator) {
            this.f52760a = c17203e;
            this.f52761b = typingIndicator;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m63071a((Pair) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3957b<TypingIndicator> m63071a(@NotNull Pair<Long, ? extends TimeUnit> pair) {
            C2668g.b(pair, "it");
            this.f52760a.m63085b(this.f52761b);
            return this.f52760a.m63079a(this.f52761b, (Pair) pair);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/typingindicator/model/TypingIndicator;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.worker.e$d */
    static final class C17197d<T> implements Consumer<TypingIndicator> {
        /* renamed from: a */
        final /* synthetic */ C17203e f52762a;

        C17197d(C17203e c17203e) {
            this.f52762a = c17203e;
        }

        public /* synthetic */ void accept(Object obj) {
            m63072a((TypingIndicator) obj);
        }

        /* renamed from: a */
        public final void m63072a(TypingIndicator typingIndicator) {
            C17168c a = this.f52762a.f52770c;
            C2668g.a(typingIndicator, "it");
            a.m63041a(typingIndicator);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.worker.e$e */
    static final class C17198e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ TypingIndicator f52763a;

        C17198e(TypingIndicator typingIndicator) {
            this.f52763a = typingIndicator;
        }

        public /* synthetic */ void accept(Object obj) {
            m63073a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63073a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error while managing typing indicator lifespan for ");
            stringBuilder.append(this.f52763a);
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig$NoConfig;", "it", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.worker.e$f */
    static final class C17199f<T, R> implements Function<Throwable, TypingIndicatorConfig> {
        /* renamed from: a */
        public static final C17199f f52764a = new C17199f();

        C17199f() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m63074a((Throwable) obj);
        }

        @NotNull
        /* renamed from: a */
        public final NoConfig m63074a(@NotNull Throwable th) {
            C2668g.b(th, "it");
            C0001a.c(th, "Error observing TypingIndicatorConfig. Will emit NoConfig.", new Object[0]);
            return NoConfig.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Ljava/util/concurrent/TimeUnit;", "it", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig$Config;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.worker.e$g */
    static final class C17200g<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17200g f52765a = new C17200g();

        C17200g() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m63075a((Config) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<Long, TimeUnit> m63075a(@NotNull Config config) {
            C2668g.b(config, "it");
            return C15811g.m59834a(Long.valueOf(config.getTimeToLive()), TimeUnit.MILLISECONDS);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/typingindicator/model/TypingIndicator;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.worker.e$h */
    static final class C17201h<T> implements Consumer<TypingIndicator> {
        /* renamed from: a */
        final /* synthetic */ C17203e f52766a;

        C17201h(C17203e c17203e) {
            this.f52766a = c17203e;
        }

        public /* synthetic */ void accept(Object obj) {
            m63076a((TypingIndicator) obj);
        }

        /* renamed from: a */
        public final void m63076a(TypingIndicator typingIndicator) {
            C17203e c17203e = this.f52766a;
            C2668g.a(typingIndicator, "it");
            c17203e.m63082a(typingIndicator);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.worker.e$i */
    static final class C17202i<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17202i f52767a = new C17202i();

        C17202i() {
        }

        public /* synthetic */ void accept(Object obj) {
            m63077a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63077a(Throwable th) {
            C0001a.c(th, "Stream terminated. Error observing typing indicators from api client.", new Object[0]);
        }
    }

    @Inject
    public C17203e(@NotNull C17168c c17168c, @NotNull @IoScheduler C15679f c15679f, @NotNull @ComputationScheduler C15679f c15679f2, @NotNull C17172a c17172a, @NotNull @CurrentDateTimeMillis Function0<Long> function0) {
        C2668g.b(c17168c, "typingIndicatorRepository");
        C2668g.b(c15679f, "typingIndicatorsScheduler");
        C2668g.b(c15679f2, "timeToLiveScheduler");
        C2668g.b(c17172a, "addChatTypingEvent");
        C2668g.b(function0, "currentDateTimeMillis");
        this.f52770c = c17168c;
        this.f52771d = c15679f;
        this.f52772e = c15679f2;
        this.f52773f = c17172a;
        this.f52774g = function0;
    }

    public synchronized void start() {
        Disposable disposable = this.f52768a;
        C2668g.a(disposable, "typingIndicatorsDisposable");
        if (disposable.isDisposed()) {
            this.f52768a = this.f52770c.m63039a().b(this.f52771d).a(new C17201h(this), C17202i.f52767a);
        } else {
            C0001a.b(new IllegalStateException("TypingIndicatorEnabledWorker is already running."));
        }
    }

    public synchronized void stop() {
        this.f52768a.dispose();
    }

    /* renamed from: a */
    private final void m63082a(TypingIndicator typingIndicator) {
        Disposable a = m63081a().b(new C17196c(this, typingIndicator)).a(new C17197d(this), new C17198e(typingIndicator));
        C8551a c8551a = this.f52769b;
        typingIndicator = typingIndicator.m57503a();
        C2668g.a(a, "it");
        c8551a.a(typingIndicator, a);
    }

    /* renamed from: a */
    private final C3960g<Pair<Long, TimeUnit>> m63081a() {
        C3960g<Pair<Long, TimeUnit>> e = this.f52770c.observeConfig().g(C17199f.f52764a).b(Config.class).e(1).n().e(C17200g.f52765a);
        C2668g.a(e, "typingIndicatorRepositor…o TimeUnit.MILLISECONDS }");
        return e;
    }

    /* renamed from: b */
    private final void m63085b(TypingIndicator typingIndicator) {
        this.f52773f.m63047a(new C15328a(typingIndicator.m57503a(), new C17161a(((Number) this.f52774g.invoke()).longValue() - typingIndicator.m57505c().getMillis())));
    }

    /* renamed from: a */
    private final C3957b<TypingIndicator> m63079a(TypingIndicator typingIndicator, Pair<Long, ? extends TimeUnit> pair) {
        typingIndicator = C3957b.a(C3957b.a(typingIndicator), m63084b(typingIndicator, (Pair) pair));
        C2668g.a(typingIndicator, "Flowable.concat(\n       …or, timeToLive)\n        )");
        return typingIndicator;
    }

    /* renamed from: b */
    private final C3957b<TypingIndicator> m63084b(TypingIndicator typingIndicator, Pair<Long, ? extends TimeUnit> pair) {
        typingIndicator = C3957b.a(new Publisher[]{m63088c(typingIndicator, pair), m63087c(typingIndicator)}).g(new C17194a(typingIndicator, pair));
        C2668g.a(typingIndicator, "Flowable.ambArray(\n     …asInterrupted()\n        }");
        return typingIndicator;
    }

    /* renamed from: c */
    private final C3957b<TypingIndicator> m63088c(TypingIndicator typingIndicator, Pair<Long, ? extends TimeUnit> pair) {
        typingIndicator = C3957b.a(C15317a.m57496a(typingIndicator)).c(((Number) pair.m59805c()).longValue(), (TimeUnit) pair.m59806d(), this.f52772e);
        C2668g.a(typingIndicator, "Flowable.just(typingIndi…nit, timeToLiveScheduler)");
        return typingIndicator;
    }

    /* renamed from: c */
    private final C3957b<TypingIndicator> m63087c(TypingIndicator typingIndicator) {
        typingIndicator = this.f52770c.m63040a(typingIndicator.m57503a()).e(1).f(new C17195b(typingIndicator));
        C2668g.a(typingIndicator, "typingIndicatorRepositor…dicator.asInterrupted() }");
        return typingIndicator;
    }
}
