package com.tinder.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import java.util.List;

public class ReportNotification {
    private static final String VALUE_NOTIFICATION_BANNED = "banned";
    private static final String VALUE_NOTIFICATION_PHOTO_REMOVED = "photoremoval";
    private static final String VALUE_NOTIFICATION_WARNING = "warning";
    public List<Integer> reasons;
    public boolean showReport;
    public int tier;
    public String type;

    public enum NotificationType {
        WARNING,
        BANNED,
        PHOTO_REMOVAL
    }

    @NonNull
    public NotificationType getNotificationtype() {
        if (!TextUtils.isEmpty(this.type)) {
            if (this.type.toLowerCase().equals(VALUE_NOTIFICATION_WARNING)) {
                return NotificationType.WARNING;
            }
            if (this.type.toLowerCase().equals("banned")) {
                return NotificationType.BANNED;
            }
            if (this.type.toLowerCase().equals(VALUE_NOTIFICATION_PHOTO_REMOVED)) {
                return NotificationType.PHOTO_REMOVAL;
            }
        }
        return NotificationType.WARNING;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("type:[");
        stringBuilder.append(this.type);
        stringBuilder.append("]tier:[");
        stringBuilder.append(this.tier);
        stringBuilder.append("]reasons[");
        stringBuilder.append(this.reasons);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
