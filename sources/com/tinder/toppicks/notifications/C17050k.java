package com.tinder.toppicks.notifications;

import android.graphics.Bitmap;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.settings.PushSettingsKt;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.etl.event.su;
import com.tinder.model.analytics.AnalyticsConstants;
import com.tinder.pushnotifications.model.TinderNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\t\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/toppicks/notifications/TopPicksDailyNotification;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "id", "", "message", "title", "icon", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "tinderUrl", "getTinderUrl", "()Ljava/lang/String;", "sendTrackingEvent", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "shouldSendOnVisibility", "", "visibility", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.notifications.k */
public final class C17050k extends TinderNotification {
    /* renamed from: a */
    public static final C15282a f52516a = new C15282a();
    @NotNull
    /* renamed from: c */
    private final String f52517c = "tinder://top-picks";

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/toppicks/notifications/TopPicksDailyNotification$Companion;", "", "()V", "TYPE_NAME", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.k$a */
    public static final class C15282a {
        private C15282a() {
        }
    }

    public C17050k(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Bitmap bitmap) {
        C2668g.b(str, "id");
        C2668g.b(str2, "message");
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(bitmap, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        super(str, str2, str3, bitmap);
    }

    @NotNull
    /* renamed from: c */
    public String mo11930c() {
        return this.f52517c;
    }

    /* renamed from: a */
    public boolean mo11938a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
        C2668g.b(appVisibilityTracker$Visibility, "visibility");
        return appVisibilityTracker$Visibility == AppVisibilityTracker$Visibility.BACKGROUND ? true : null;
    }

    /* renamed from: a */
    public void mo11931a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        c2630h.a(su.a().b(PushSettingsKt.KEY_TOP_PICKS_DAILY).a());
    }
}
