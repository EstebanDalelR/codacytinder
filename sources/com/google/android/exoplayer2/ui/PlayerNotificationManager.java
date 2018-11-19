package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat.Action;
import com.google.android.exoplayer2.Player;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

public class PlayerNotificationManager {

    public interface CustomActionReceiver {
        Map<String, Action> createCustomActions(Context context);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    public interface MediaDescriptionAdapter {
        @Nullable
        PendingIntent createCurrentContentIntent(Player player);

        @Nullable
        String getCurrentContentText(Player player);

        String getCurrentContentTitle(Player player);

        @Nullable
        Bitmap getCurrentLargeIcon(Player player, C2263a c2263a);
    }

    public interface NotificationListener {
        void onNotificationCancelled(int i);

        void onNotificationStarted(int i, Notification notification);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$a */
    public final class C2263a {
    }
}
