package com.tinder.data.updates;

import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import com.tinder.domain.updates.PollIntervalRepository;
import com.tinder.domain.updates.model.PollInterval;
import io.reactivex.C3957b;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/updates/DefaultPollIntervalRepository;", "Lcom/tinder/domain/updates/PollIntervalRepository;", "()V", "processor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/tinder/domain/updates/model/PollInterval;", "kotlin.jvm.PlatformType", "observePollInterval", "Lio/reactivex/Flowable;", "updatePollInterval", "", "pollInterval", "Companion", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.a */
public final class C11036a implements PollIntervalRepository {
    /* renamed from: a */
    public static final C8800a f35794a = new C8800a();
    /* renamed from: c */
    private static final PollInterval f35795c = new PollInterval(30000, DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    /* renamed from: b */
    private final C18430a<PollInterval> f35796b = BehaviorProcessor.d(f35795c).u();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/data/updates/DefaultPollIntervalRepository$Companion;", "", "()V", "DEFAULT_POLL_INTERVAL", "Lcom/tinder/domain/updates/model/PollInterval;", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.a$a */
    public static final class C8800a {
        private C8800a() {
        }
    }

    @NotNull
    public C3957b<PollInterval> observePollInterval() {
        C3957b<PollInterval> g = this.f35796b.g();
        C2668g.a(g, "processor.hide()");
        return g;
    }

    public void updatePollInterval(@NotNull PollInterval pollInterval) {
        C2668g.b(pollInterval, "pollInterval");
        this.f35796b.onNext(pollInterval);
    }
}
