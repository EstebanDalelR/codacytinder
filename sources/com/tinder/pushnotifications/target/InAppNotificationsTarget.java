package com.tinder.pushnotifications.target;

import com.tinder.pushnotifications.model.TinderNotification;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/tinder/pushnotifications/target/InAppNotificationsTarget;", "", "hideInAppNotification", "", "showInAppNotification", "notification", "Lcom/tinder/pushnotifications/model/TinderNotification;", "stopAnimationsAndRemoveView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface InAppNotificationsTarget {
    void hideInAppNotification();

    void showInAppNotification(@NotNull TinderNotification tinderNotification);

    void stopAnimationsAndRemoveView();
}
