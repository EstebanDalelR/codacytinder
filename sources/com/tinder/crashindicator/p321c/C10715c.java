package com.tinder.crashindicator.p321c;

import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.crash.gateway.CrashTimeStampGateway;
import com.tinder.domain.crash.queue.CrashTimestampsQueue;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/crashindicator/usecase/SaveCrashTimeStamp;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "", "crashTimeStampGateway", "Lcom/tinder/domain/crash/gateway/CrashTimeStampGateway;", "(Lcom/tinder/domain/crash/gateway/CrashTimeStampGateway;)V", "dequeuePreviousCrashes", "", "crashQueue", "Lcom/tinder/domain/crash/queue/CrashTimestampsQueue;", "execute", "crashTimeStamp", "writeCrashTimeStampToStore", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.crashindicator.c.c */
public final class C10715c implements VoidUseCase<Long> {
    /* renamed from: a */
    private final CrashTimeStampGateway f35076a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "crashQueue", "Lcom/tinder/domain/crash/queue/CrashTimestampsQueue;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.c.c$a */
    static final class C13789a<T> implements Action1<CrashTimestampsQueue> {
        /* renamed from: a */
        final /* synthetic */ C10715c f43784a;
        /* renamed from: b */
        final /* synthetic */ long f43785b;

        C13789a(C10715c c10715c, long j) {
            this.f43784a = c10715c;
            this.f43785b = j;
        }

        public /* synthetic */ void call(Object obj) {
            m53358a((CrashTimestampsQueue) obj);
        }

        /* renamed from: a */
        public final void m53358a(CrashTimestampsQueue crashTimestampsQueue) {
            C10715c c10715c;
            if (crashTimestampsQueue.getSize() >= 2) {
                c10715c = this.f43784a;
                C2668g.a(crashTimestampsQueue, "crashQueue");
                c10715c.m43056b(crashTimestampsQueue);
            }
            crashTimestampsQueue.enqueue(this.f43785b);
            c10715c = this.f43784a;
            C2668g.a(crashTimestampsQueue, "crashQueue");
            c10715c.m43054a(crashTimestampsQueue);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.c.c$b */
    static final class C13790b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13790b f43786a = new C13790b();

        C13790b() {
        }

        public /* synthetic */ void call(Object obj) {
            m53359a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53359a(Throwable th) {
            C0001a.b(th, "Error reading crash timestamp from crash store", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.c.c$c */
    static final class C13791c implements Action0 {
        /* renamed from: a */
        public static final C13791c f43787a = new C13791c();

        C13791c() {
        }

        public final void call() {
            C0001a.b("Successfully saved timestamps to crash store", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.c.c$d */
    static final class C13792d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13792d f43788a = new C13792d();

        C13792d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53360a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53360a(Throwable th) {
            C0001a.b(th, "Error saving timestamp to crash store", new Object[0]);
        }
    }

    @Inject
    public C10715c(@NotNull CrashTimeStampGateway crashTimeStampGateway) {
        C2668g.b(crashTimeStampGateway, "crashTimeStampGateway");
        this.f35076a = crashTimeStampGateway;
    }

    public /* synthetic */ void execute(Object obj) {
        m43057a(((Number) obj).longValue());
    }

    /* renamed from: a */
    public void m43057a(long j) {
        this.f35076a.getCrashTimestamps().b(Schedulers.io()).a(new C13789a(this, j), (Action1) C13790b.f43786a);
    }

    /* renamed from: a */
    private final void m43054a(CrashTimestampsQueue crashTimestampsQueue) {
        this.f35076a.saveCrashTimestamps(crashTimestampsQueue).b(Schedulers.io()).a(C13791c.f43787a, C13792d.f43788a);
    }

    /* renamed from: b */
    private final void m43056b(CrashTimestampsQueue crashTimestampsQueue) {
        while (crashTimestampsQueue.getSize() > 1) {
            crashTimestampsQueue.dequeue();
        }
    }
}
