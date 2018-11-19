package com.tinder.domain.experiments;

import com.tinder.common.logger.Logger;
import com.tinder.common.reactivex.schedulers.Schedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/domain/experiments/BucketsWorker;", "", "fetchBuckets", "Lcom/tinder/domain/experiments/FetchBuckets;", "logger", "Lcom/tinder/common/logger/Logger;", "schedulers", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "(Lcom/tinder/domain/experiments/FetchBuckets;Lcom/tinder/common/logger/Logger;Lcom/tinder/common/reactivex/schedulers/Schedulers;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "start", "", "stop", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class BucketsWorker {
    private Disposable disposable;
    private final FetchBuckets fetchBuckets;
    private final Logger logger;
    private final Schedulers schedulers;

    @Inject
    public BucketsWorker(@NotNull FetchBuckets fetchBuckets, @NotNull Logger logger, @NotNull Schedulers schedulers) {
        C2668g.m10309b(fetchBuckets, "fetchBuckets");
        C2668g.m10309b(logger, "logger");
        C2668g.m10309b(schedulers, "schedulers");
        this.fetchBuckets = fetchBuckets;
        this.logger = logger;
        this.schedulers = schedulers;
    }

    public final void start() {
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.disposable = this.fetchBuckets.invoke().m15294b(this.schedulers.io()).m15288a((Action) new BucketsWorker$start$1(this), (Consumer) new BucketsWorker$start$2(this));
    }

    public final void stop() {
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
