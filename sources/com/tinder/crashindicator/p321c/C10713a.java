package com.tinder.crashindicator.p321c;

import com.tinder.domain.common.usecase.SingleResultUseCase;
import com.tinder.domain.crash.gateway.CrashTimeStampGateway;
import com.tinder.domain.crash.queue.CrashTimestampsQueue;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.ReadableInstant;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/crashindicator/usecase/CheckShowAppCrashDialog;", "Lcom/tinder/domain/common/usecase/SingleResultUseCase;", "", "crashTimeStampGateway", "Lcom/tinder/domain/crash/gateway/CrashTimeStampGateway;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/domain/crash/gateway/CrashTimeStampGateway;Lkotlin/jvm/functions/Function0;)V", "TIME_RANGE_FOR_CONSECUTIVE_CRASHES", "", "checkCanShowCrashesDialog", "crashes", "Lcom/tinder/domain/crash/queue/CrashTimestampsQueue;", "checkCrashTimeStampWithinRange", "timeStamp", "execute", "Lrx/Single;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.crashindicator.c.a */
public final class C10713a implements SingleResultUseCase<Boolean> {
    /* renamed from: a */
    private final long f35072a = TimeUnit.MINUTES.toSeconds(10);
    /* renamed from: b */
    private final CrashTimeStampGateway f35073b;
    /* renamed from: c */
    private final Function0<DateTime> f35074c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "crashes", "Lcom/tinder/domain/crash/queue/CrashTimestampsQueue;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.c.a$a */
    static final class C12819a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10713a f41227a;

        C12819a(C10713a c10713a) {
            this.f41227a = c10713a;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50340a((CrashTimestampsQueue) obj));
        }

        /* renamed from: a */
        public final boolean m50340a(CrashTimestampsQueue crashTimestampsQueue) {
            C10713a c10713a = this.f41227a;
            C2668g.a(crashTimestampsQueue, "crashes");
            return c10713a.m43052a(crashTimestampsQueue);
        }
    }

    @Inject
    public C10713a(@NotNull CrashTimeStampGateway crashTimeStampGateway, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(crashTimeStampGateway, "crashTimeStampGateway");
        C2668g.b(function0, "dateTimeProvider");
        this.f35073b = crashTimeStampGateway;
        this.f35074c = function0;
    }

    @NotNull
    public Single<Boolean> execute() {
        Single<Boolean> d = this.f35073b.getCrashTimestamps().d(new C12819a(this));
        C2668g.a(d, "crashTimeStampGateway\n  …CrashesDialog(crashes) })");
        return d;
    }

    /* renamed from: a */
    private final boolean m43052a(CrashTimestampsQueue crashTimestampsQueue) {
        if (crashTimestampsQueue.getSize() < 2) {
            return null;
        }
        return m43050a(crashTimestampsQueue.dequeue()) & m43050a(crashTimestampsQueue.dequeue());
    }

    /* renamed from: a */
    private final boolean m43050a(long j) {
        j = new Interval(new DateTime(j), (ReadableInstant) this.f35074c.invoke()).toDuration();
        C2668g.a(j, "interval.toDuration()");
        return j.b() < this.f35072a ? 1 : 0;
    }
}
