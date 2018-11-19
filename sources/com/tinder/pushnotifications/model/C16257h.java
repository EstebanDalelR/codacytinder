package com.tinder.pushnotifications.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.app.NotificationCompat.C0382c;
import com.tinder.R;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.etl.event.sr;
import com.tinder.model.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016R\u0014\u0010\n\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u0017XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0017XD¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\r¨\u0006)"}, d2 = {"Lcom/tinder/pushnotifications/model/MessageNotification;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "id", "", "message", "icon", "Landroid/graphics/Bitmap;", "title", "matchId", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V", "backgroundResource", "", "getBackgroundResource", "()I", "bodyTextColor", "getBodyTextColor", "legacyBackgroundColor", "getLegacyBackgroundColor", "getMatchId", "()Ljava/lang/String;", "priority", "getPriority", "shouldShowIconWhenBackendImageSupplied", "", "getShouldShowIconWhenBackendImageSupplied", "()Z", "shouldShowRedDot", "getShouldShowRedDot", "tinderUrl", "getTinderUrl", "titleTextColor", "getTitleTextColor", "getBuilder", "Landroid/support/v4/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "sendTrackingEvent", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.model.h */
public final class C16257h extends TinderNotification {
    /* renamed from: a */
    public static final C14562a f50643a = new C14562a();
    @NotNull
    /* renamed from: c */
    private final String f50644c;
    /* renamed from: d */
    private final int f50645d = 1;
    /* renamed from: e */
    private final int f50646e = R.color.in_app_notification_background_message;
    /* renamed from: f */
    private final int f50647f = R.drawable.ian_background_message;
    /* renamed from: g */
    private final int f50648g = R.color.ian_text_message_title;
    /* renamed from: h */
    private final int f50649h = R.color.ian_text_message_body;
    /* renamed from: i */
    private final boolean f50650i = true;
    /* renamed from: j */
    private final boolean f50651j;
    @NotNull
    /* renamed from: k */
    private final String f50652k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/pushnotifications/model/MessageNotification$Companion;", "", "()V", "TYPE_NAME", "", "TYPE_NAME_GESTURE", "TYPE_NAME_LEGACY", "TYPE_NAME_MESSAGE_BITMOJI", "TYPE_NAME_MESSAGE_LIKE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.model.h$a */
    public static final class C14562a {
        private C14562a() {
        }
    }

    @NotNull
    /* renamed from: i */
    public final String m61432i() {
        return this.f50652k;
    }

    public C16257h(@NotNull String str, @NotNull String str2, @NotNull Bitmap bitmap, @NotNull String str3, @NotNull String str4) {
        C2668g.b(str, "id");
        C2668g.b(str2, "message");
        C2668g.b(bitmap, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(str4, "matchId");
        super(str, str2, str3, bitmap);
        this.f50652k = str4;
        str = new StringBuilder();
        str.append("tinder://chat/");
        str.append(this.f50652k);
        this.f50644c = str.toString();
    }

    @NotNull
    /* renamed from: c */
    public String mo11930c() {
        return this.f50644c;
    }

    /* renamed from: d */
    public int mo11933d() {
        return this.f50645d;
    }

    /* renamed from: e */
    protected int mo11934e() {
        return this.f50646e;
    }

    /* renamed from: a */
    public int mo11927a() {
        return this.f50647f;
    }

    /* renamed from: f */
    public int mo11935f() {
        return this.f50648g;
    }

    /* renamed from: g */
    public int mo11936g() {
        return this.f50649h;
    }

    /* renamed from: h */
    public boolean mo11937h() {
        return this.f50650i;
    }

    /* renamed from: b */
    public boolean mo11928b() {
        return this.f50651j;
    }

    /* renamed from: a */
    public void mo11931a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        c2630h.a(sr.a().a(this.f50652k).a());
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
