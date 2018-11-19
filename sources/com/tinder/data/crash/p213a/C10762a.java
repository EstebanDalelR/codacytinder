package com.tinder.data.crash.p213a;

import com.tinder.data.crash.p214b.C8638a;
import com.tinder.domain.crash.gateway.CrashTimeStampGateway;
import com.tinder.domain.crash.queue.CrashTimestampsQueue;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/data/crash/gateway/CrashTimeStampStoreGateway;", "Lcom/tinder/domain/crash/gateway/CrashTimeStampGateway;", "crashTimeStampStore", "Lcom/tinder/data/crash/store/CrashTimeStampStore;", "(Lcom/tinder/data/crash/store/CrashTimeStampStore;)V", "clear", "Lrx/Completable;", "getCrashTimestamps", "Lrx/Single;", "Lcom/tinder/domain/crash/queue/CrashTimestampsQueue;", "saveCrashTimestamps", "crashTimeStampQueue", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.crash.a.a */
public final class C10762a implements CrashTimeStampGateway {
    /* renamed from: a */
    private final C8638a f35161a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/crash/queue/CrashTimestampsQueue;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.crash.a.a$b */
    static final class C8637b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10762a f30491a;

        C8637b(C10762a c10762a) {
            this.f30491a = c10762a;
        }

        public /* synthetic */ Object call() {
            return m36791a();
        }

        @NotNull
        /* renamed from: a */
        public final CrashTimestampsQueue m36791a() {
            return this.f30491a.f35161a.m36792a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.crash.a.a$a */
    static final class C13795a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10762a f43799a;

        C13795a(C10762a c10762a) {
            this.f43799a = c10762a;
        }

        public final void call() {
            this.f43799a.f35161a.m36794b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.crash.a.a$c */
    static final class C13796c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10762a f43800a;
        /* renamed from: b */
        final /* synthetic */ CrashTimestampsQueue f43801b;

        C13796c(C10762a c10762a, CrashTimestampsQueue crashTimestampsQueue) {
            this.f43800a = c10762a;
            this.f43801b = crashTimestampsQueue;
        }

        public final void call() {
            this.f43800a.f35161a.m36793a(this.f43801b);
        }
    }

    @Inject
    public C10762a(@NotNull C8638a c8638a) {
        C2668g.b(c8638a, "crashTimeStampStore");
        this.f35161a = c8638a;
    }

    @NotNull
    public Completable saveCrashTimestamps(@NotNull CrashTimestampsQueue crashTimestampsQueue) {
        C2668g.b(crashTimestampsQueue, "crashTimeStampQueue");
        crashTimestampsQueue = Completable.a(new C13796c(this, crashTimestampsQueue));
        C2668g.a(crashTimestampsQueue, "Completable.fromAction {…TimeStampQueue)\n        }");
        return crashTimestampsQueue;
    }

    @NotNull
    public Single<CrashTimestampsQueue> getCrashTimestamps() {
        Single<CrashTimestampsQueue> a = Single.a(new C8637b(this));
        C2668g.a(a, "Single.fromCallable({ cr…readCrashesTimeStamp() })");
        return a;
    }

    @NotNull
    public Completable clear() {
        Completable a = Completable.a(new C13795a(this));
        C2668g.a(a, "Completable.fromAction {…mpStore.clear()\n        }");
        return a;
    }
}
