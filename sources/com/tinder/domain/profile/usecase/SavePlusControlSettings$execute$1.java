package com.tinder.domain.profile.usecase;

import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.profile.model.PlusControlUpdateRequest;
import com.tinder.domain.profile.model.ProfileUpdateRequest;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "savedPlusControlSettings", "Lcom/tinder/domain/meta/model/PlusControlSettings;", "apply"}, k = 3, mv = {1, 1, 10})
final class SavePlusControlSettings$execute$1<T, R> implements Function<PlusControlSettings, CompletableSource> {
    final /* synthetic */ PlusControlSettings $request;
    final /* synthetic */ SavePlusControlSettings this$0;

    SavePlusControlSettings$execute$1(SavePlusControlSettings savePlusControlSettings, PlusControlSettings plusControlSettings) {
        this.this$0 = savePlusControlSettings;
        this.$request = plusControlSettings;
    }

    public final CompletableSource apply(@NotNull PlusControlSettings plusControlSettings) {
        C2668g.b(plusControlSettings, "savedPlusControlSettings");
        if (C2668g.a(this.$request, plusControlSettings) != null) {
            return C3956a.a();
        }
        return this.this$0.profileRemoteRepository.update((ProfileUpdateRequest) new PlusControlUpdateRequest(this.$request));
    }
}
