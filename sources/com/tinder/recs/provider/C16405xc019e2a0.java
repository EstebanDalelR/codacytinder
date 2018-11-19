package com.tinder.recs.provider;

import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.recs.model.RecsDecoratedLoadingStatusInfo;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/recs/model/RecsDecoratedLoadingStatusInfo;", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "discoverySettings", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "apply"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.provider.RecsDecoratedLoadingStatusProvider$subscribedToLoadingStatusDiscoverySettings$1 */
final class C16405xc019e2a0<T1, T2, R> implements BiFunction<CurrentUser, DiscoverySettings, RecsDecoratedLoadingStatusInfo> {
    final /* synthetic */ RecsDecoratedLoadingStatusProvider this$0;

    C16405xc019e2a0(RecsDecoratedLoadingStatusProvider recsDecoratedLoadingStatusProvider) {
        this.this$0 = recsDecoratedLoadingStatusProvider;
    }

    @NotNull
    public final RecsDecoratedLoadingStatusInfo apply(@NotNull CurrentUser currentUser, @NotNull DiscoverySettings discoverySettings) {
        C2668g.b(currentUser, "currentUser");
        C2668g.b(discoverySettings, "discoverySettings");
        return this.this$0.createRecsDecoratedLoadingStatusInfo(currentUser, discoverySettings);
    }
}
