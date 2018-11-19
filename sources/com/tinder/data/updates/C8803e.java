package com.tinder.data.updates;

import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import com.tinder.proto.keepalive.KeepAliveNudge.Nudge;
import io.reactivex.C15679f;
import io.reactivex.C3957b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/data/updates/MissedNudgesTracker;", "", "timeRecorderScheduler", "Lio/reactivex/Scheduler;", "(Lio/reactivex/Scheduler;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "nudgeTimestampRecorder", "Lcom/tinder/data/updates/TimestampRecorder;", "hasMissedNudges", "", "sinceTimestamp", "", "startTracking", "", "nudgeFlowable", "Lio/reactivex/Flowable;", "Lcom/tinder/proto/keepalive/KeepAliveNudge$Nudge;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.e */
public final class C8803e {
    /* renamed from: a */
    private final C8810o f30890a;
    /* renamed from: b */
    private Disposable f30891b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/proto/keepalive/KeepAliveNudge$Nudge;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.e$a */
    static final class C11048a<T> implements Consumer<Nudge> {
        /* renamed from: a */
        final /* synthetic */ C8803e f35815a;

        C11048a(C8803e c8803e) {
            this.f35815a = c8803e;
        }

        public /* synthetic */ void accept(Object obj) {
            m43722a((Nudge) obj);
        }

        /* renamed from: a */
        public final void m43722a(Nudge nudge) {
            this.f35815a.f30890a.m37502b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.e$b */
    static final class C11049b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11049b f35816a = new C11049b();

        C11049b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m43723a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m43723a(Throwable th) {
            C0001a.c(th, "Cannot observe nudge. Stream is terminated", new Object[0]);
        }
    }

    @Inject
    public C8803e(@NotNull @ComputationScheduler C15679f c15679f) {
        C2668g.b(c15679f, "timeRecorderScheduler");
        this.f30890a = new C8810o(c15679f);
    }

    /* renamed from: a */
    public final synchronized void m37485a(@NotNull C3957b<Nudge> c3957b) {
        C2668g.b(c3957b, "nudgeFlowable");
        if ((this.f30891b == null ? 1 : null) == null) {
            throw new IllegalStateException("Is already started".toString());
        }
        this.f30891b = c3957b.a(new C11048a(this), C11049b.f35816a);
    }

    /* renamed from: a */
    public final boolean m37486a(long j) {
        return this.f30890a.m37501a() > j ? 1 : 0;
    }
}
