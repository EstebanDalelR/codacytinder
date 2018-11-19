package com.tinder.toppicks.p431b;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/toppicks/config/TopPicksConfigFactory;", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "topPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "(Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;)V", "create", "Lcom/tinder/domain/config/TopPicksConfig;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.b.a */
public final class C15234a {
    /* renamed from: a */
    private final AbTestUtility f47318a;
    /* renamed from: b */
    private final TopPicksApplicationRepository f47319b;

    @Inject
    public C15234a(@NotNull AbTestUtility abTestUtility, @NotNull TopPicksApplicationRepository topPicksApplicationRepository) {
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(topPicksApplicationRepository, "topPicksApplicationRepository");
        this.f47318a = abTestUtility;
        this.f47319b = topPicksApplicationRepository;
    }

    @NotNull
    /* renamed from: a */
    public final TopPicksConfig m57293a() {
        boolean z = this.f47318a.isTopPicksEnabled() && this.f47319b.isTopPicksEnabled();
        String notificationMessage = this.f47319b.getNotificationMessage();
        boolean z2 = z && this.f47319b.areNotificationsAllowed();
        String topPicksNotificationOffset = this.f47318a.getTopPicksNotificationOffset();
        C2668g.a(topPicksNotificationOffset, "abTestUtility.topPicksNotificationOffset");
        return new TopPicksConfig(z, topPicksNotificationOffset, z2, notificationMessage, this.f47318a.getTopPicksTooltipSwipeThreshold());
    }
}
