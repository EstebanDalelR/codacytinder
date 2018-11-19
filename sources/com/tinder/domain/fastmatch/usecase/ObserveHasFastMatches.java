package com.tinder.domain.fastmatch.usecase;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/fastmatch/usecase/ObserveHasFastMatches;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "(Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;)V", "execute", "Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ObserveHasFastMatches implements ObservableResultUseCase<Boolean> {
    private final FastMatchConfigProvider fastMatchConfigProvider;
    private final FastMatchStatusProvider fastMatchStatusProvider;

    @Inject
    public ObserveHasFastMatches(@NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull FastMatchStatusProvider fastMatchStatusProvider) {
        C2668g.b(fastMatchConfigProvider, "fastMatchConfigProvider");
        C2668g.b(fastMatchStatusProvider, "fastMatchStatusProvider");
        this.fastMatchConfigProvider = fastMatchConfigProvider;
        this.fastMatchStatusProvider = fastMatchStatusProvider;
    }

    @NotNull
    public C3959e<Boolean> execute() {
        C3959e<Boolean> combineLatest = C3959e.combineLatest(RxJavaInteropExtKt.toV2Observable(this.fastMatchConfigProvider.observe()), this.fastMatchStatusProvider.observe(), ObserveHasFastMatches$execute$1.INSTANCE);
        C2668g.a(combineLatest, "Observable.combineLatest…0\n            }\n        )");
        return combineLatest;
    }
}
