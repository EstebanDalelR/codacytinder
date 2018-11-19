package com.tinder.recs.usecase;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import com.tinder.managers.ManagerProfile;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/recs/usecase/UpdateDiscoverySettings;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "managerProfile", "Lcom/tinder/managers/ManagerProfile;", "(Lcom/tinder/managers/ManagerProfile;)V", "execute", "Lio/reactivex/Completable;", "request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class UpdateDiscoverySettings implements CompletableUseCase<DiscoverySettings> {
    private final ManagerProfile managerProfile;

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[GenderFilter.values().length];

        static {
            $EnumSwitchMapping$0[GenderFilter.MALE.ordinal()] = 1;
            $EnumSwitchMapping$0[GenderFilter.FEMALE.ordinal()] = 2;
            $EnumSwitchMapping$0[GenderFilter.BOTH.ordinal()] = 3;
        }
    }

    @Inject
    public UpdateDiscoverySettings(@NotNull ManagerProfile managerProfile) {
        C2668g.b(managerProfile, "managerProfile");
        this.managerProfile = managerProfile;
    }

    @NotNull
    public C3956a execute(@NotNull DiscoverySettings discoverySettings) {
        C2668g.b(discoverySettings, "request");
        discoverySettings = C3956a.a(new UpdateDiscoverySettings$execute$1(this, discoverySettings));
        C2668g.a(discoverySettings, "Completable.create { emi…             })\n        }");
        return discoverySettings;
    }
}
