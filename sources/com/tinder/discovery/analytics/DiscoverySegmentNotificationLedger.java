package com.tinder.discovery.analytics;

import com.tinder.discovery.analytics.model.NotificationType;
import com.tinder.discovery.model.DiscoverySegment;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lcom/tinder/discovery/analytics/DiscoverySegmentNotificationLedger;", "", "addNotificationForSegment", "", "segment", "Lcom/tinder/discovery/model/DiscoverySegment;", "notificationType", "Lcom/tinder/discovery/analytics/model/NotificationType;", "clearNotificationsForSegment", "getNotificationsForSegment", "", "getSegmentsWithNotification", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
public interface DiscoverySegmentNotificationLedger {
    void addNotificationForSegment(@NotNull DiscoverySegment discoverySegment, @NotNull NotificationType notificationType);

    void clearNotificationsForSegment(@NotNull DiscoverySegment discoverySegment);

    @NotNull
    List<NotificationType> getNotificationsForSegment(@NotNull DiscoverySegment discoverySegment);

    @NotNull
    Set<DiscoverySegment> getSegmentsWithNotification(@NotNull NotificationType notificationType);
}
