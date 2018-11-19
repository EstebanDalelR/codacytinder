package com.tinder.toppicks;

import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksSession;
import com.tinder.domain.toppicks.usecase.ResetTopPickSession;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.RecsExpired;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.C15756a;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/toppicks/TopPicksRefreshTimer;", "", "scheduler", "Lio/reactivex/Scheduler;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "resetTopPickSession", "Lcom/tinder/domain/toppicks/usecase/ResetTopPickSession;", "observeTopPickssession", "Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksSession;", "(Lio/reactivex/Scheduler;Lkotlin/jvm/functions/Function0;Lcom/tinder/domain/toppicks/usecase/ResetTopPickSession;Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksSession;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "cancel", "", "start", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.i */
public final class C15272i {
    /* renamed from: a */
    private Disposable f47397a;
    /* renamed from: b */
    private final C15679f f47398b;
    /* renamed from: c */
    private final Function0<DateTime> f47399c;
    /* renamed from: d */
    private final ResetTopPickSession f47400d;
    /* renamed from: e */
    private final ObserveTopPicksSession f47401e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.i$a */
    static final class C17030a<T, R> implements Function<TopPicksSession, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C15272i f52475a;

        C17030a(C15272i c15272i) {
            this.f52475a = c15272i;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62823a((TopPicksSession) obj);
        }

        /* renamed from: a */
        public final C3956a m62823a(@NotNull TopPicksSession topPicksSession) {
            C2668g.b(topPicksSession, "it");
            return C3959e.timer(topPicksSession.getRefreshTime().getMillis() - ((DateTime) this.f52475a.f47399c.invoke()).getMillis(), TimeUnit.MILLISECONDS, this.f52475a.f47398b).doOnNext(new Consumer<Long>() {
                public /* synthetic */ void accept(Object obj) {
                    m62822a((Long) obj);
                }

                /* renamed from: a */
                public final void m62822a(Long l) {
                    this.f52475a.f47400d.execute(RecsExpired.INSTANCE);
                }
            }).ignoreElements();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.i$b */
    static final class C17031b implements Action {
        /* renamed from: a */
        public static final C17031b f52476a = new C17031b();

        C17031b() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.i$c */
    static final class C17032c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17032c f52477a = new C17032c();

        C17032c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62824a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62824a(Throwable th) {
            C0001a.c(th, "Error scheduling timer", new Object[0]);
        }
    }

    @Inject
    public C15272i(@NotNull @ComputationScheduler C15679f c15679f, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0, @NotNull ResetTopPickSession resetTopPickSession, @NotNull ObserveTopPicksSession observeTopPicksSession) {
        C2668g.b(c15679f, "scheduler");
        C2668g.b(function0, "dateTimeProvider");
        C2668g.b(resetTopPickSession, "resetTopPickSession");
        C2668g.b(observeTopPicksSession, "observeTopPickssession");
        this.f47398b = c15679f;
        this.f47399c = function0;
        this.f47400d = resetTopPickSession;
        this.f47401e = observeTopPicksSession;
    }

    /* renamed from: a */
    public final void m57380a() {
        this.f47397a = this.f47401e.execute().e().e(new C17030a(this)).b(C15756a.m59010b()).a(C17031b.f52476a, C17032c.f52477a);
    }

    /* renamed from: b */
    public final void m57381b() {
        Disposable disposable = this.f47397a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f47397a = (Disposable) null;
    }
}
