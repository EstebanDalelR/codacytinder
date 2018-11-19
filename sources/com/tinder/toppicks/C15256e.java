package com.tinder.toppicks;

import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.C18432c;
import io.reactivex.subjects.C19040a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/toppicks/TopPicksExpirationTimeSynchronizer;", "", "currentDateTimeMills", "Lkotlin/Function0;", "", "timeSyncDelayCalculator", "Lcom/tinder/toppicks/TopPicksTimeSyncDelayCalculator;", "(Lkotlin/jvm/functions/Function0;Lcom/tinder/toppicks/TopPicksTimeSyncDelayCalculator;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "subject", "Lio/reactivex/subjects/Subject;", "cancel", "", "observe", "Lio/reactivex/Observable;", "start", "expirationTimeInMills", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.e */
public final class C15256e {
    /* renamed from: a */
    private final C18432c<Long> f47362a;
    /* renamed from: b */
    private Disposable f47363b;
    /* renamed from: c */
    private final Function0<Long> f47364c;
    /* renamed from: d */
    private final C15275j f47365d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "apply", "(Ljava/lang/Long;)J"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.e$a */
    static final class C17011a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C15256e f52434a;

        C17011a(C15256e c15256e) {
            this.f52434a = c15256e;
        }

        public /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(m62790a((Long) obj));
        }

        /* renamed from: a */
        public final long m62790a(@NotNull Long l) {
            C2668g.b(l, "it");
            return ((Number) this.f52434a.f47364c.invoke()).longValue();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.e$b */
    static final class C17012b<T> implements Consumer<Long> {
        /* renamed from: a */
        final /* synthetic */ C15256e f52435a;

        C17012b(C15256e c15256e) {
            this.f52435a = c15256e;
        }

        public /* synthetic */ void accept(Object obj) {
            m62791a((Long) obj);
        }

        /* renamed from: a */
        public final void m62791a(Long l) {
            this.f52435a.f47362a.onNext(l);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.e$c */
    static final class C17013c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17013c f52436a = new C17013c();

        C17013c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62792a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62792a(Throwable th) {
            C0001a.c(th, "Error when observing expiry time interval", new Object[0]);
        }
    }

    public C15256e(@NotNull Function0<Long> function0, @NotNull C15275j c15275j) {
        C2668g.b(function0, "currentDateTimeMills");
        C2668g.b(c15275j, "timeSyncDelayCalculator");
        this.f47364c = function0;
        this.f47365d = c15275j;
        function0 = C19040a.m67695a(this.f47364c.invoke()).m66611d();
        C2668g.a(function0, "BehaviorSubject.createDe…meMills()).toSerialized()");
        this.f47362a = function0;
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<Long> m57345a() {
        C3959e<Long> hide = this.f47362a.hide();
        C2668g.a(hide, "subject.hide()");
        return hide;
    }

    /* renamed from: a */
    public final void m57346a(long j) {
        m57347b();
        this.f47363b = C3959e.interval(this.f47365d.m57384a(((Number) this.f47364c.invoke()).longValue(), j), 60, TimeUnit.SECONDS).map(new C17011a(this)).startWith(this.f47364c.invoke()).subscribe(new C17012b(this), C17013c.f52436a);
    }

    /* renamed from: b */
    public final void m57347b() {
        Disposable disposable = this.f47363b;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f47363b = (Disposable) null;
    }
}
