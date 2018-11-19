package com.tinder.data.updates;

import com.tinder.domain.updates.PollIntervalRepository;
import com.tinder.domain.updates.UpdateSignalRepository;
import com.tinder.domain.updates.model.PollInterval;
import com.tinder.domain.updates.model.UpdateSignal;
import io.reactivex.C15679f;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/data/updates/PollUpdateSignalRepository;", "Lcom/tinder/domain/updates/UpdateSignalRepository;", "pollIntervalRepository", "Lcom/tinder/domain/updates/PollIntervalRepository;", "rescheduleDelayScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/domain/updates/PollIntervalRepository;Lio/reactivex/Scheduler;)V", "loadUpdateSignal", "Lio/reactivex/Single;", "Lcom/tinder/domain/updates/model/UpdateSignal;", "sinceTimestamp", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.g */
public final class C11052g implements UpdateSignalRepository {
    /* renamed from: a */
    private final PollIntervalRepository f35819a;
    /* renamed from: b */
    private final C15679f f35820b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "pollInterval", "Lcom/tinder/domain/updates/model/PollInterval;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.g$a */
    static final class C11050a<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C11052g f35817a;

        C11050a(C11052g c11052g) {
            this.f35817a = c11052g;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43724a((PollInterval) obj);
        }

        /* renamed from: a */
        public final C3960g<Long> m43724a(@NotNull PollInterval pollInterval) {
            C2668g.b(pollInterval, "pollInterval");
            return C3960g.a(pollInterval.getStandardMillis(), TimeUnit.MILLISECONDS, this.f35817a.f35820b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/updates/model/UpdateSignal;", "it", "", "apply", "(Ljava/lang/Long;)Lcom/tinder/domain/updates/model/UpdateSignal;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.g$b */
    static final class C11051b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11051b f35818a = new C11051b();

        C11051b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43725a((Long) obj);
        }

        @NotNull
        /* renamed from: a */
        public final UpdateSignal m43725a(@NotNull Long l) {
            C2668g.b(l, "it");
            return new UpdateSignal(false);
        }
    }

    public C11052g(@NotNull PollIntervalRepository pollIntervalRepository, @NotNull C15679f c15679f) {
        C2668g.b(pollIntervalRepository, "pollIntervalRepository");
        C2668g.b(c15679f, "rescheduleDelayScheduler");
        this.f35819a = pollIntervalRepository;
        this.f35820b = c15679f;
    }

    @NotNull
    public C3960g<UpdateSignal> loadUpdateSignal(long j) {
        j = this.f35819a.observePollInterval().f().a(new C11050a(this)).e(C11051b.f35818a);
        C2668g.a(j, "pollIntervalRepository.o…al(isFromNudge = false) }");
        return j;
    }
}
