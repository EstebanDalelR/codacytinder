package com.tinder.domain.loops.usecase;

import com.tinder.domain.common.model.ConnectivityInfo;
import com.tinder.domain.settings.loops.model.AutoPlayVideoSettingsOption;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/tinder/domain/settings/loops/model/AutoPlayVideoSettingsOption;", "Lcom/tinder/domain/common/model/ConnectivityInfo;", "apply"}, k = 3, mv = {1, 1, 10})
final class GetAutoPlayLoopsEnabled$execute$2<T, R> implements Function<T, R> {
    final /* synthetic */ GetAutoPlayLoopsEnabled this$0;

    GetAutoPlayLoopsEnabled$execute$2(GetAutoPlayLoopsEnabled getAutoPlayLoopsEnabled) {
        this.this$0 = getAutoPlayLoopsEnabled;
    }

    public /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(apply((Pair) obj));
    }

    public final boolean apply(@NotNull Pair<? extends AutoPlayVideoSettingsOption, ConnectivityInfo> pair) {
        C2668g.b(pair, "it");
        return this.this$0.mapSettingsOptionWithConnectivityToEnable(pair);
    }
}
