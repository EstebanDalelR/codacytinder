package com.tinder.toppicks.badge;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/toppicks/badge/TopPicksBadgeSegmentChangeListener;", "Lcom/tinder/discovery/view/DiscoveryTabView$OnSegmentChangedListener;", "topPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "(Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;Lkotlin/jvm/functions/Function0;Lcom/tinder/domain/config/TopPicksConfig;)V", "onSegmentChanged", "", "nextSegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "prevSegment", "onSegmentClicked", "segment", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.badge.a */
public final class C16981a implements OnSegmentChangedListener {
    /* renamed from: a */
    private final TopPicksApplicationRepository f52376a;
    /* renamed from: b */
    private final Function0<DateTime> f52377b;
    /* renamed from: c */
    private final TopPicksConfig f52378c;

    public void onSegmentClicked(@NotNull DiscoverySegment discoverySegment) {
        C2668g.b(discoverySegment, "segment");
    }

    public C16981a(@NotNull TopPicksApplicationRepository topPicksApplicationRepository, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0, @NotNull TopPicksConfig topPicksConfig) {
        C2668g.b(topPicksApplicationRepository, "topPicksApplicationRepository");
        C2668g.b(function0, "dateTimeProvider");
        C2668g.b(topPicksConfig, "topPicksConfig");
        this.f52376a = topPicksApplicationRepository;
        this.f52377b = function0;
        this.f52378c = topPicksConfig;
    }

    public void onSegmentChanged(@NotNull DiscoverySegment discoverySegment, @Nullable DiscoverySegment discoverySegment2) {
        C2668g.b(discoverySegment, "nextSegment");
        if (this.f52378c.isEnabled() != null && discoverySegment == DiscoverySegment.TOP_PICKS) {
            if (((DateTime) this.f52377b.invoke()).d(this.f52376a.getNotificationScheduleTime()) != null) {
                this.f52376a.resetNotificationScheduleTime();
            }
        }
    }
}
