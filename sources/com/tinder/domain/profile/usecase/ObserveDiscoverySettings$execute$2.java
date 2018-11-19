package com.tinder.domain.profile.usecase;

import com.tinder.domain.meta.model.DiscoverySettings;
import io.reactivex.functions.Function;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "kotlin.jvm.PlatformType", "optional", "Ljava8/util/Optional;", "apply"}, k = 3, mv = {1, 1, 10})
final class ObserveDiscoverySettings$execute$2<T, R> implements Function<T, R> {
    public static final ObserveDiscoverySettings$execute$2 INSTANCE = new ObserveDiscoverySettings$execute$2();

    ObserveDiscoverySettings$execute$2() {
    }

    public final DiscoverySettings apply(@NotNull Optional<DiscoverySettings> optional) {
        C2668g.b(optional, "optional");
        return (DiscoverySettings) optional.b();
    }
}
