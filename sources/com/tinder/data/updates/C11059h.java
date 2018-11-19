package com.tinder.data.updates;

import com.tinder.api.keepalive.KeepAliveScarletApi;
import com.tinder.domain.updates.PollIntervalRepository;
import com.tinder.domain.updates.UpdateSignalRepository;
import com.tinder.domain.updates.model.PollInterval;
import com.tinder.domain.updates.model.UpdateSignal;
import com.tinder.proto.keepalive.KeepAliveNudge.Nudge;
import io.reactivex.C15679f;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/data/updates/PushUpdateSignalRepository;", "Lcom/tinder/domain/updates/UpdateSignalRepository;", "keepAliveScarletApi", "Lcom/tinder/api/keepalive/KeepAliveScarletApi;", "pollIntervalRepository", "Lcom/tinder/domain/updates/PollIntervalRepository;", "missedNudgesTracker", "Lcom/tinder/data/updates/MissedNudgesTracker;", "timerScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/api/keepalive/KeepAliveScarletApi;Lcom/tinder/domain/updates/PollIntervalRepository;Lcom/tinder/data/updates/MissedNudgesTracker;Lio/reactivex/Scheduler;)V", "hasMissedNudges", "Lio/reactivex/Single;", "", "sinceTimestamp", "", "loadUpdateSignal", "Lcom/tinder/domain/updates/model/UpdateSignal;", "observeFirstUpdateSignal", "observeUpdateSignalsFromNudges", "Lio/reactivex/Flowable;", "observeUpdateSignalsFromPolls", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.h */
public final class C11059h implements UpdateSignalRepository {
    /* renamed from: a */
    private final KeepAliveScarletApi f35827a;
    /* renamed from: b */
    private final PollIntervalRepository f35828b;
    /* renamed from: c */
    private final C8803e f35829c;
    /* renamed from: d */
    private final C15679f f35830d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.h$a */
    static final class C8804a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C11059h f30892a;
        /* renamed from: b */
        final /* synthetic */ long f30893b;

        C8804a(C11059h c11059h, long j) {
            this.f30892a = c11059h;
            this.f30893b = j;
        }

        public /* synthetic */ Object call() {
            return Boolean.valueOf(m37487a());
        }

        /* renamed from: a */
        public final boolean m37487a() {
            return this.f30892a.f35829c.m37486a(this.f30893b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/updates/model/UpdateSignal;", "kotlin.jvm.PlatformType", "hasMissedNudges", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Single;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.h$b */
    static final class C11053b<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C11059h f35821a;

        C11053b(C11059h c11059h) {
            this.f35821a = c11059h;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43727a((Boolean) obj);
        }

        /* renamed from: a */
        public final C3960g<UpdateSignal> m43727a(@NotNull Boolean bool) {
            C2668g.b(bool, "hasMissedNudges");
            if (bool.booleanValue() != null) {
                return C3960g.a(new UpdateSignal(true));
            }
            return this.f35821a.m43733a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.h$c */
    static final class C11054c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11054c f35822a = new C11054c();

        C11054c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m43728a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m43728a(Throwable th) {
            C0001a.c(th, "Failed to observe update signal", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/updates/model/UpdateSignal;", "it", "Lcom/tinder/proto/keepalive/KeepAliveNudge$Nudge;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.h$d */
    static final class C11055d<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11055d f35823a = new C11055d();

        C11055d() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43729a((Nudge) obj);
        }

        @NotNull
        /* renamed from: a */
        public final UpdateSignal m43729a(@NotNull Nudge nudge) {
            C2668g.b(nudge, "it");
            return new UpdateSignal(true);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/updates/model/PollInterval;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.h$e */
    static final class C11056e<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11056e f35824a = new C11056e();

        C11056e() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(m43730a((PollInterval) obj));
        }

        /* renamed from: a */
        public final long m43730a(@NotNull PollInterval pollInterval) {
            C2668g.b(pollInterval, "it");
            return pollInterval.getPersistentMillis();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Long;)Lio/reactivex/Flowable;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.h$f */
    static final class C11057f<T, R> implements Function<T, Publisher<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C11059h f35825a;

        C11057f(C11059h c11059h) {
            this.f35825a = c11059h;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43731a((Long) obj);
        }

        /* renamed from: a */
        public final C3957b<Long> m43731a(@NotNull Long l) {
            C2668g.b(l, "it");
            return C3957b.a(l.longValue(), TimeUnit.MILLISECONDS, this.f35825a.f35830d);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/updates/model/UpdateSignal;", "it", "", "apply", "(Ljava/lang/Long;)Lcom/tinder/domain/updates/model/UpdateSignal;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.h$g */
    static final class C11058g<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11058g f35826a = new C11058g();

        C11058g() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43732a((Long) obj);
        }

        @NotNull
        /* renamed from: a */
        public final UpdateSignal m43732a(@NotNull Long l) {
            C2668g.b(l, "it");
            return new UpdateSignal(false);
        }
    }

    public C11059h(@NotNull KeepAliveScarletApi keepAliveScarletApi, @NotNull PollIntervalRepository pollIntervalRepository, @NotNull C8803e c8803e, @NotNull C15679f c15679f) {
        C2668g.b(keepAliveScarletApi, "keepAliveScarletApi");
        C2668g.b(pollIntervalRepository, "pollIntervalRepository");
        C2668g.b(c8803e, "missedNudgesTracker");
        C2668g.b(c15679f, "timerScheduler");
        this.f35827a = keepAliveScarletApi;
        this.f35828b = pollIntervalRepository;
        this.f35829c = c8803e;
        this.f35830d = c15679f;
    }

    @NotNull
    public C3960g<UpdateSignal> loadUpdateSignal(long j) {
        j = m43734a(j).a(new C11053b(this)).c(C11054c.f35822a);
        C2668g.a(j, "hasMissedNudges(sinceTim…observe update signal\") }");
        return j;
    }

    /* renamed from: a */
    private final C3960g<Boolean> m43734a(long j) {
        j = C3960g.c(new C8804a(this, j));
        C2668g.a(j, "Single.fromCallable { mi…dNudges(sinceTimestamp) }");
        return j;
    }

    /* renamed from: a */
    private final C3960g<UpdateSignal> m43733a() {
        C3960g<UpdateSignal> b = C3957b.b(m43737b(), m43738c()).b(new UpdateSignal(false));
        C2668g.a(b, "Flowable.merge(\n        …nal(isFromNudge = false))");
        return b;
    }

    /* renamed from: b */
    private final C3957b<UpdateSignal> m43737b() {
        C3957b<UpdateSignal> f = this.f35827a.observeNudge().f(C11055d.f35823a);
        C2668g.a(f, "keepAliveScarletApi.obse…nal(isFromNudge = true) }");
        return f;
    }

    /* renamed from: c */
    private final C3957b<UpdateSignal> m43738c() {
        C3957b<UpdateSignal> f = this.f35828b.observePollInterval().f(C11056e.f35824a).b(new C11057f(this)).f(C11058g.f35826a);
        C2668g.a(f, "pollIntervalRepository.o…al(isFromNudge = false) }");
        return f;
    }
}
