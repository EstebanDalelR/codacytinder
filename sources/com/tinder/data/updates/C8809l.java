package com.tinder.data.updates;

import com.tinder.domain.updates.UpdateSignalRepository;
import com.tinder.domain.updates.model.UpdateSignal;
import io.reactivex.C15679f;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0007R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/data/updates/SyncUpdatesScheduler;", "", "syncUpdates", "Lcom/tinder/data/updates/SyncUpdates;", "syncUpdatesRetryTransformer", "Lcom/tinder/data/updates/SyncUpdatesRetryTransformer;", "scheduler", "Lio/reactivex/Scheduler;", "updateSignalRepository", "Lcom/tinder/domain/updates/UpdateSignalRepository;", "(Lcom/tinder/data/updates/SyncUpdates;Lcom/tinder/data/updates/SyncUpdatesRetryTransformer;Lio/reactivex/Scheduler;Lcom/tinder/domain/updates/UpdateSignalRepository;)V", "scheduleDisposable", "Lio/reactivex/disposables/Disposable;", "updateSignalTimestampRecorder", "Lcom/tinder/data/updates/TimestampRecorder;", "loadInitialUpdateSignal", "Lio/reactivex/Single;", "Lcom/tinder/domain/updates/model/UpdateSignal;", "loadNextUpdateSignal", "schedule", "", "updateSignal", "unschedule", "Companion", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.l */
public final class C8809l {
    /* renamed from: a */
    public static final C8807a f30897a = new C8807a();
    /* renamed from: h */
    private static final UpdateSignal f30898h = new UpdateSignal(false);
    /* renamed from: b */
    private final C8810o f30899b = new C8810o(this.f30903f);
    /* renamed from: c */
    private Disposable f30900c;
    /* renamed from: d */
    private final C8805i f30901d;
    /* renamed from: e */
    private final C11062k f30902e;
    /* renamed from: f */
    private final C15679f f30903f;
    /* renamed from: g */
    private final UpdateSignalRepository f30904g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/data/updates/SyncUpdatesScheduler$Companion;", "", "()V", "INITIAL_UPDATE_SIGNAL", "Lcom/tinder/domain/updates/model/UpdateSignal;", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.l$a */
    public static final class C8807a {
        private C8807a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/updates/model/UpdateSignal;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.l$c */
    static final class C8808c<V> implements Callable<SingleSource<? extends T>> {
        /* renamed from: a */
        final /* synthetic */ C8809l f30896a;

        C8808c(C8809l c8809l) {
            this.f30896a = c8809l;
        }

        public /* synthetic */ Object call() {
            return m37492a();
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<UpdateSignal> m37492a() {
            return this.f30896a.f30904g.loadUpdateSignal(this.f30896a.f30899b.m37501a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/updates/model/UpdateSignal;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.l$b */
    static final class C11063b<T> implements Consumer<UpdateSignal> {
        /* renamed from: a */
        final /* synthetic */ C8809l f35836a;

        C11063b(C8809l c8809l) {
            this.f35836a = c8809l;
        }

        public /* synthetic */ void accept(Object obj) {
            m43740a((UpdateSignal) obj);
        }

        /* renamed from: a */
        public final void m43740a(UpdateSignal updateSignal) {
            this.f35836a.f30899b.m37502b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/updates/model/UpdateSignal;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.l$d */
    static final class C11064d<T> implements Consumer<UpdateSignal> {
        /* renamed from: a */
        final /* synthetic */ C8809l f35837a;

        C11064d(C8809l c8809l) {
            this.f35837a = c8809l;
        }

        public /* synthetic */ void accept(Object obj) {
            m43741a((UpdateSignal) obj);
        }

        /* renamed from: a */
        public final void m43741a(UpdateSignal updateSignal) {
            this.f35837a.f30899b.m37502b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/updates/model/UpdateSignal;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.l$e */
    static final class C11065e<T> implements Consumer<UpdateSignal> {
        /* renamed from: a */
        public static final C11065e f35838a = new C11065e();

        C11065e() {
        }

        /* renamed from: a */
        public final void m43742a(UpdateSignal updateSignal) {
        }

        public /* synthetic */ void accept(Object obj) {
            m43742a((UpdateSignal) obj);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.l$f */
    static final class C11066f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11066f f35839a = new C11066f();

        C11066f() {
        }

        public /* synthetic */ void accept(Object obj) {
            m43743a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m43743a(Throwable th) {
            C0001a.c(th, "Cannot observe UpdateSignal. Stream is terminated", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.l$g */
    static final class C11067g<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11067g f35840a = new C11067g();

        C11067g() {
        }

        public /* synthetic */ void accept(Object obj) {
            m43744a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m43744a(Throwable th) {
            C0001a.c(th, "Updates syncUpdates failed", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.l$h */
    static final class C11068h implements Action {
        /* renamed from: a */
        public static final C11068h f35841a = new C11068h();

        C11068h() {
        }

        public final void run() {
            C0001a.b("Updates syncUpdates completed", new Object[0]);
        }
    }

    public C8809l(@NotNull C8805i c8805i, @NotNull C11062k c11062k, @NotNull C15679f c15679f, @NotNull UpdateSignalRepository updateSignalRepository) {
        C2668g.b(c8805i, "syncUpdates");
        C2668g.b(c11062k, "syncUpdatesRetryTransformer");
        C2668g.b(c15679f, "scheduler");
        C2668g.b(updateSignalRepository, "updateSignalRepository");
        this.f30901d = c8805i;
        this.f30902e = c11062k;
        this.f30903f = c15679f;
        this.f30904g = updateSignalRepository;
    }

    /* renamed from: a */
    public final synchronized void m37499a() {
        if ((this.f30900c == null ? 1 : null) == null) {
            throw new IllegalStateException("Schedule has already begun".toString());
        }
        this.f30900c = m37497c().a(new C11069m(new SyncUpdatesScheduler$schedule$2(this))).d().b(m37498d().a(new C11069m(new SyncUpdatesScheduler$schedule$3(this))).b()).a(C11065e.f35838a, C11066f.f35839a);
    }

    /* renamed from: b */
    public final synchronized void m37500b() {
        Disposable disposable = this.f30900c;
        if (disposable == null) {
            throw new IllegalStateException("There is nothing to unschedule".toString());
        }
        disposable.dispose();
        this.f30900c = (Disposable) null;
    }

    /* renamed from: c */
    private final C3960g<UpdateSignal> m37497c() {
        C3960g<UpdateSignal> b = C3960g.a(f30898h).b(this.f30903f).b(new C11063b(this));
        C2668g.a(b, "Single.just(INITIAL_UPDA…estampRecorder.record() }");
        return b;
    }

    /* renamed from: d */
    private final C3960g<UpdateSignal> m37498d() {
        C3960g<UpdateSignal> b = C3960g.a(new C8808c(this)).a(this.f30903f).b(new C11064d(this));
        C2668g.a(b, "Single.defer {\n         …estampRecorder.record() }");
        return b;
    }

    /* renamed from: a */
    private final C3960g<UpdateSignal> m37495a(UpdateSignal updateSignal) {
        updateSignal = this.f30901d.m37491a(updateSignal).a(C11067g.f35840a).b(C11068h.f35841a).a(this.f30902e).c().a(updateSignal);
        C2668g.a(updateSignal, "syncUpdates.sync(updateS…ngleDefault(updateSignal)");
        return updateSignal;
    }
}
