package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3960g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/domain/profile/usecase/LoadDiscoverySettings;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "metaGateway", "Lcom/tinder/domain/meta/gateway/MetaGateway;", "(Lcom/tinder/domain/meta/gateway/MetaGateway;)V", "execute", "Lio/reactivex/Single;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LoadDiscoverySettings implements SingleResultUseCase<DiscoverySettings> {
    private final MetaGateway metaGateway;

    @Inject
    public LoadDiscoverySettings(@NotNull MetaGateway metaGateway) {
        C2668g.b(metaGateway, "metaGateway");
        this.metaGateway = metaGateway;
    }

    @NotNull
    public C3960g<DiscoverySettings> execute() {
        Observable observeDiscoverySettings = this.metaGateway.observeDiscoverySettings();
        C2668g.a(observeDiscoverySettings, "metaGateway\n            …bserveDiscoverySettings()");
        C3960g<DiscoverySettings> firstOrError = RxJavaInteropExtKt.toV2Observable(observeDiscoverySettings).filter(LoadDiscoverySettings$execute$1.INSTANCE).map(LoadDiscoverySettings$execute$2.INSTANCE).firstOrError();
        C2668g.a(firstOrError, "metaGateway\n            …          .firstOrError()");
        return firstOrError;
    }
}
