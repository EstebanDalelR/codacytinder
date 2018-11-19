package com.tinder.pushnotifications.model;

import android.graphics.Bitmap;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.etl.event.sp;
import com.tinder.model.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/tinder/pushnotifications/model/MarketNotification;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "id", "", "msg", "title", "icon", "Landroid/graphics/Bitmap;", "campaignId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "getCampaignId", "()Ljava/lang/String;", "sendTrackingEvent", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.model.f */
public final class C16255f extends TinderNotification {
    /* renamed from: a */
    public static final C14560a f50635a = new C14560a();
    @NotNull
    /* renamed from: c */
    private final String f50636c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/pushnotifications/model/MarketNotification$Companion;", "", "()V", "TYPE_NAME", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.model.f$a */
    public static final class C14560a {
        private C14560a() {
        }
    }

    public C16255f(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Bitmap bitmap, @NotNull String str4) {
        C2668g.b(str, "id");
        C2668g.b(str2, "msg");
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(bitmap, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        C2668g.b(str4, "campaignId");
        super(str, str2, str3, bitmap);
        this.f50636c = str4;
    }

    /* renamed from: a */
    public void mo11931a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        c2630h.a(sp.a().a(this.f50636c).a());
    }
}
