package com.tinder.domain.loops.usecase;

import com.tinder.domain.common.model.ConnectivityInfo;
import com.tinder.domain.common.model.ConnectivityStatus;
import com.tinder.domain.connectivity.ConnectivityRepository;
import com.tinder.domain.settings.loops.model.AutoPlayVideoSettingsOption;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u001c\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/domain/loops/usecase/GetAutoPlayLoopsEnabled;", "Lcom/tinder/domain/loops/usecase/GetAutoPlayLoopsEnabledStatus;", "settingsRepository", "Lcom/tinder/domain/settings/loops/repository/AutoPlayVideoSettingsRepository;", "connectivityRepository", "Lcom/tinder/domain/connectivity/ConnectivityRepository;", "(Lcom/tinder/domain/settings/loops/repository/AutoPlayVideoSettingsRepository;Lcom/tinder/domain/connectivity/ConnectivityRepository;)V", "execute", "Lio/reactivex/Observable;", "", "mapSettingsOptionWithConnectivityToEnable", "pair", "Lkotlin/Pair;", "Lcom/tinder/domain/settings/loops/model/AutoPlayVideoSettingsOption;", "Lcom/tinder/domain/common/model/ConnectivityInfo;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class GetAutoPlayLoopsEnabled implements GetAutoPlayLoopsEnabledStatus {
    private final ConnectivityRepository connectivityRepository;
    private final AutoPlayVideoSettingsRepository settingsRepository;

    @Inject
    public GetAutoPlayLoopsEnabled(@NotNull AutoPlayVideoSettingsRepository autoPlayVideoSettingsRepository, @NotNull ConnectivityRepository connectivityRepository) {
        C2668g.b(autoPlayVideoSettingsRepository, "settingsRepository");
        C2668g.b(connectivityRepository, "connectivityRepository");
        this.settingsRepository = autoPlayVideoSettingsRepository;
        this.connectivityRepository = connectivityRepository;
    }

    @NotNull
    public C3959e<Boolean> execute() {
        C3959e<Boolean> distinctUntilChanged = C3959e.combineLatest(this.settingsRepository.observe(), this.connectivityRepository.observe(), GetAutoPlayLoopsEnabled$execute$1.INSTANCE).map(new GetAutoPlayLoopsEnabled$execute$2(this)).distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "Observable.combineLatest…  .distinctUntilChanged()");
        return distinctUntilChanged;
    }

    private final boolean mapSettingsOptionWithConnectivityToEnable(Pair<? extends AutoPlayVideoSettingsOption, ConnectivityInfo> pair) {
        AutoPlayVideoSettingsOption autoPlayVideoSettingsOption = (AutoPlayVideoSettingsOption) pair.a();
        pair = ((ConnectivityInfo) pair.b()).getConnectivityStatus();
        switch (autoPlayVideoSettingsOption) {
            case ON_WIFI_AND_MOBILE_DATA:
                if (!(pair == ConnectivityStatus.WIFI || pair == ConnectivityStatus.MOBILE)) {
                    return false;
                }
            case ON_NEVER_AUTOPLAY:
                return false;
            case ON_WIFI_ONLY:
                if (pair == ConnectivityStatus.WIFI) {
                    break;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }
}
