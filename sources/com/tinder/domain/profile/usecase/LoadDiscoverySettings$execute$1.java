package com.tinder.domain.profile.usecase;

import com.tinder.domain.meta.model.DiscoverySettings;
import io.reactivex.functions.Predicate;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "optional", "Ljava8/util/Optional;", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "kotlin.jvm.PlatformType", "test"}, k = 3, mv = {1, 1, 10})
final class LoadDiscoverySettings$execute$1<T> implements Predicate<Optional<DiscoverySettings>> {
    public static final LoadDiscoverySettings$execute$1 INSTANCE = new LoadDiscoverySettings$execute$1();

    LoadDiscoverySettings$execute$1() {
    }

    public final boolean test(@NotNull Optional<DiscoverySettings> optional) {
        C2668g.b(optional, "optional");
        return optional.c();
    }
}
