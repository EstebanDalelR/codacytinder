package com.tinder.core.experiment;

import com.tinder.domain.profile.model.ProfileV2Experiment;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/core/experiment/ProfileV2ExperimentImpl;", "Lcom/tinder/domain/profile/model/ProfileV2Experiment;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/core/experiment/AbTestUtility;)V", "isEnabledForRevenue", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.core.experiment.r */
public final class C10710r implements ProfileV2Experiment {
    /* renamed from: a */
    private final AbTestUtility f35069a;

    public C10710r(@NotNull AbTestUtility abTestUtility) {
        C2668g.b(abTestUtility, "abTestUtility");
        this.f35069a = abTestUtility;
    }

    public boolean isEnabledForRevenue() {
        return this.f35069a.profileV2EnabledForRevenue();
    }
}
