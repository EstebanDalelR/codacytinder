package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.model.settings.WebProfileSettings;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "webProfileSettings", "Lcom/tinder/domain/profile/model/settings/WebProfileSettings;", "apply"}, k = 3, mv = {1, 1, 10})
final class UpdateWebProfileUsername$execute$1<T, R> implements Function<WebProfileSettings, CompletableSource> {
    final /* synthetic */ String $request;
    final /* synthetic */ UpdateWebProfileUsername this$0;

    UpdateWebProfileUsername$execute$1(UpdateWebProfileUsername updateWebProfileUsername, String str) {
        this.this$0 = updateWebProfileUsername;
        this.$request = str;
    }

    public final CompletableSource apply(@NotNull WebProfileSettings webProfileSettings) {
        C2668g.b(webProfileSettings, "webProfileSettings");
        if (webProfileSettings.getUsername() == null) {
            return this.this$0.repository.createUsername(this.$request);
        }
        return this.this$0.repository.updateUsername(this.$request);
    }
}
