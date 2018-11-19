package com.tinder.domain.loops.usecase;

import com.tinder.domain.common.model.ConnectivityInfo;
import com.tinder.domain.settings.loops.model.AutoPlayVideoSettingsOption;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/tinder/domain/settings/loops/model/AutoPlayVideoSettingsOption;", "Lcom/tinder/domain/common/model/ConnectivityInfo;", "options", "connectivityInfo", "apply"}, k = 3, mv = {1, 1, 10})
final class GetAutoPlayLoopsEnabled$execute$1<T1, T2, R> implements BiFunction<AutoPlayVideoSettingsOption, ConnectivityInfo, Pair<? extends AutoPlayVideoSettingsOption, ? extends ConnectivityInfo>> {
    public static final GetAutoPlayLoopsEnabled$execute$1 INSTANCE = new GetAutoPlayLoopsEnabled$execute$1();

    GetAutoPlayLoopsEnabled$execute$1() {
    }

    @NotNull
    public final Pair<AutoPlayVideoSettingsOption, ConnectivityInfo> apply(@NotNull AutoPlayVideoSettingsOption autoPlayVideoSettingsOption, @NotNull ConnectivityInfo connectivityInfo) {
        C2668g.b(autoPlayVideoSettingsOption, "options");
        C2668g.b(connectivityInfo, "connectivityInfo");
        return new Pair(autoPlayVideoSettingsOption, connectivityInfo);
    }
}
