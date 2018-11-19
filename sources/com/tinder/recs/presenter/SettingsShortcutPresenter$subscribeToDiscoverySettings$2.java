package com.tinder.recs.presenter;

import com.tinder.domain.meta.model.DiscoverySettings;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "apply"}, k = 3, mv = {1, 1, 10})
final class SettingsShortcutPresenter$subscribeToDiscoverySettings$2<T, R> implements Function<DiscoverySettings, CompletableSource> {
    final /* synthetic */ SettingsShortcutPresenter this$0;

    SettingsShortcutPresenter$subscribeToDiscoverySettings$2(SettingsShortcutPresenter settingsShortcutPresenter) {
        this.this$0 = settingsShortcutPresenter;
    }

    @NotNull
    public final C3956a apply(@NotNull DiscoverySettings discoverySettings) {
        C2668g.b(discoverySettings, "it");
        return this.this$0.updateDiscoverySettings.execute(discoverySettings);
    }
}
