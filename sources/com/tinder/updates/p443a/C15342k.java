package com.tinder.updates.p443a;

import com.tinder.api.keepalive.KeepAliveScarletApi;
import com.tinder.domain.updates.UpdatesStatusProvider;
import com.tinder.domain.updates.UpdatesStatusProvider.Status;
import com.tinder.scarlet.C14797g;
import com.tinder.scarlet.C14797g.C16515a;
import com.tinder.updates.p443a.C17204a.C15334b;
import io.reactivex.C3957b;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/updates/analytics/WebSocketUpdatesAnalyticsEventDispatcher;", "", "keepAliveScarletApi", "Lcom/tinder/api/keepalive/KeepAliveScarletApi;", "updatesStatusProvider", "Lcom/tinder/domain/updates/UpdatesStatusProvider;", "addUpdatesReceivedEvent", "Lcom/tinder/updates/analytics/AddUpdatesReceivedEvent;", "(Lcom/tinder/api/keepalive/KeepAliveScarletApi;Lcom/tinder/domain/updates/UpdatesStatusProvider;Lcom/tinder/updates/analytics/AddUpdatesReceivedEvent;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "handleUpdate", "", "updateStatus", "Lcom/tinder/domain/updates/UpdatesStatusProvider$Status;", "start", "stop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.updates.a.k */
public final class C15342k {
    /* renamed from: a */
    private final C17356a f47572a = new C17356a();
    /* renamed from: b */
    private final KeepAliveScarletApi f47573b;
    /* renamed from: c */
    private final UpdatesStatusProvider f47574c;
    /* renamed from: d */
    private final C17204a f47575d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u0018\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0003\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00042\u000b\u0010\u0005\u001a\u0007H\u0002¢\u0006\u0002\b\u00032\u000b\u0010\u0006\u001a\u0007H\u0004¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "T", "Lio/reactivex/annotations/NonNull;", "U", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "io/reactivex/rxkotlin/FlowablesKt$withLatestFrom$2"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.k$a */
    public static final class C17215a<T1, T2, R> implements BiFunction<Status, C14797g, Pair<? extends Status, ? extends C14797g>> {
        /* renamed from: a */
        public static final C17215a f52790a = new C17215a();

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m63105a(obj, obj2);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<Status, C14797g> m63105a(Status status, C14797g c14797g) {
            return new Pair(status, c14797g);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/tinder/domain/updates/UpdatesStatusProvider$Status;", "kotlin.jvm.PlatformType", "Lcom/tinder/scarlet/State;", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.k$b */
    static final class C17216b<T> implements Consumer<Pair<? extends Status, ? extends C14797g>> {
        /* renamed from: a */
        final /* synthetic */ C15342k f52791a;

        C17216b(C15342k c15342k) {
            this.f52791a = c15342k;
        }

        public /* synthetic */ void accept(Object obj) {
            m63106a((Pair) obj);
        }

        /* renamed from: a */
        public final void m63106a(Pair<Status, ? extends C14797g> pair) {
            Status status = (Status) pair.m59805c();
            if ((((C14797g) pair.m59806d()) instanceof C16515a) != null) {
                pair = this.f52791a;
                C2668g.a(status, "updateStatus");
                pair.m57547a(status);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.k$c */
    static final class C17217c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17217c f52792a = new C17217c();

        C17217c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m63107a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63107a(Throwable th) {
            C0001a.c(th, "Cannot observe updates status: stream is terminated", new Object[0]);
        }
    }

    @Inject
    public C15342k(@NotNull KeepAliveScarletApi keepAliveScarletApi, @NotNull UpdatesStatusProvider updatesStatusProvider, @NotNull C17204a c17204a) {
        C2668g.b(keepAliveScarletApi, "keepAliveScarletApi");
        C2668g.b(updatesStatusProvider, "updatesStatusProvider");
        C2668g.b(c17204a, "addUpdatesReceivedEvent");
        this.f47573b = keepAliveScarletApi;
        this.f47574c = updatesStatusProvider;
        this.f47575d = c17204a;
    }

    /* renamed from: a */
    public final void m57549a() {
        C3957b j = this.f47574c.observeUpdatesStatus().j();
        C2668g.a(j, "updatesStatusProvider.ob…  .onBackpressureLatest()");
        j = j.a(this.f47573b.observeState(), C17215a.f52790a);
        C2668g.a(j, "withLatestFrom(other, Bi…on{ t, u -> Pair(t,u)  })");
        this.f47572a.add(j.a(new C17216b(this), C17217c.f52792a));
    }

    /* renamed from: a */
    private final void m57547a(Status status) {
        this.f47575d.m63090a(new C15334b(status.isInitiatedByNudge(), status.getHasData()));
    }
}
