package com.tinder.toppicks.notifications;

import android.graphics.Bitmap;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.model.analytics.AnalyticsConstants;
import com.tinder.pushnotifications.model.TinderNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/tinder/toppicks/notifications/TopPicksDiscoveryNotification;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "id", "", "message", "title", "icon", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "backgroundResource", "", "getBackgroundResource", "()I", "shouldSendOnVisibility", "", "visibility", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.notifications.l */
public final class C17051l extends TinderNotification {
    /* renamed from: a */
    public static final C15283a f52518a = new C15283a();
    /* renamed from: c */
    private final int f52519c = R.drawable.top_picks_discovery_notification;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/toppicks/notifications/TopPicksDiscoveryNotification$Companion;", "", "()V", "TYPE_NAME", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.l$a */
    public static final class C15283a {
        private C15283a() {
        }
    }

    public C17051l(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Bitmap bitmap) {
        C2668g.b(str, "id");
        C2668g.b(str2, "message");
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(bitmap, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        super(str, str2, str3, bitmap);
    }

    /* renamed from: a */
    public int mo11927a() {
        return this.f52519c;
    }

    /* renamed from: a */
    public boolean mo11938a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
        C2668g.b(appVisibilityTracker$Visibility, "visibility");
        return appVisibilityTracker$Visibility == AppVisibilityTracker$Visibility.FOREGROUND ? true : null;
    }
}
