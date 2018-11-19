package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/domain/profile/usecase/ObserveDiscoverySettings;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "metaGateway", "Lcom/tinder/domain/meta/gateway/MetaGateway;", "(Lcom/tinder/domain/meta/gateway/MetaGateway;)V", "execute", "Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ObserveDiscoverySettings implements ObservableResultUseCase<DiscoverySettings> {
    private final MetaGateway metaGateway;

    @Inject
    public ObserveDiscoverySettings(@NotNull MetaGateway metaGateway) {
        C2668g.b(metaGateway, "metaGateway");
        this.metaGateway = metaGateway;
    }

    @NotNull
    public C3959e<DiscoverySettings> execute() {
        Observable observeDiscoverySettings = this.metaGateway.observeDiscoverySettings();
        C2668g.a(observeDiscoverySettings, "metaGateway\n            …bserveDiscoverySettings()");
        C3959e<DiscoverySettings> map = RxJavaInteropExtKt.toV2Observable(observeDiscoverySettings).filter(ObserveDiscoverySettings$execute$1.INSTANCE).map(ObserveDiscoverySettings$execute$2.INSTANCE);
        C2668g.a(map, "metaGateway\n            …ional -> optional.get() }");
        return map;
    }
}
