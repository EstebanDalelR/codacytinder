package com.tinder.pushnotifications.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.app.NotificationCompat.C0382c;
import com.tinder.R;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.etl.event.sq;
import com.tinder.model.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\n\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/tinder/pushnotifications/model/MatchNotification;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "id", "", "message", "title", "icon", "Landroid/graphics/Bitmap;", "matchId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "backgroundResource", "", "getBackgroundResource", "()I", "legacyBackgroundColor", "getLegacyBackgroundColor", "priority", "getPriority", "tinderUrl", "getTinderUrl", "()Ljava/lang/String;", "getBuilder", "Landroid/support/v4/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "sendTrackingEvent", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.model.g */
public final class C16256g extends TinderNotification {
    /* renamed from: a */
    public static final C14561a f50637a = new C14561a();
    @NotNull
    /* renamed from: c */
    private final String f50638c;
    /* renamed from: d */
    private final int f50639d = 1;
    /* renamed from: e */
    private final int f50640e = R.color.in_app_notification_background_match;
    /* renamed from: f */
    private final int f50641f = R.drawable.ian_background_match;
    /* renamed from: g */
    private final String f50642g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/pushnotifications/model/MatchNotification$Companion;", "", "()V", "TYPE_NAME", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.model.g$a */
    public static final class C14561a {
        private C14561a() {
        }
    }

    public C16256g(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Bitmap bitmap, @NotNull String str4) {
        C2668g.b(str, "id");
        C2668g.b(str2, "message");
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(bitmap, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        C2668g.b(str4, "matchId");
        super(str, str2, str3, bitmap);
        this.f50642g = str4;
        str = new StringBuilder();
        str.append("tinder://chat/");
        str.append(this.f50642g);
        this.f50638c = str.toString();
    }

    @NotNull
    /* renamed from: c */
    public String mo11930c() {
        return this.f50638c;
    }

    /* renamed from: d */
    public int mo11933d() {
        return this.f50639d;
    }

    /* renamed from: e */
    protected int mo11934e() {
        return this.f50640e;
    }

    /* renamed from: a */
    public int mo11927a() {
        return this.f50641f;
    }

    /* renamed from: a */
    public void mo11931a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        c2630h.a(sq.a().a(this.f50642g).a());
    }

    @NotNull
    /* renamed from: b */
    public C0382c mo11932b(@NotNull Context context) {
        C2668g.b(context, "context");
        context = super.mo11932b(context);
        Bitmap j = m55595j();
        if (j == null) {
            j = m55600o();
        }
        context = context.a(j);
        C2668g.a(context, "super.getBuilder(context…con(backendImage ?: icon)");
        return context;
    }
}
