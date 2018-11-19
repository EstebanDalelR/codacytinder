package com.tinder.recs.presenter;

import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.recs.model.AgeConfig;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "it", "apply"}, k = 3, mv = {1, 1, 10})
final class SettingsShortcutPresenter$subscribeToDiscoverySettings$1<T, R> implements Function<T, R> {
    final /* synthetic */ AgeConfig $ageConfig;
    final /* synthetic */ int $distanceInMiles;
    final /* synthetic */ SettingsShortcutPresenter this$0;

    SettingsShortcutPresenter$subscribeToDiscoverySettings$1(SettingsShortcutPresenter settingsShortcutPresenter, AgeConfig ageConfig, int i) {
        this.this$0 = settingsShortcutPresenter;
        this.$ageConfig = ageConfig;
        this.$distanceInMiles = i;
    }

    @NotNull
    public final DiscoverySettings apply(@NotNull DiscoverySettings discoverySettings) {
        C2668g.b(discoverySettings, "it");
        return this.this$0.updateDiscoverySettings(this.$ageConfig, this.$distanceInMiles);
    }
}
