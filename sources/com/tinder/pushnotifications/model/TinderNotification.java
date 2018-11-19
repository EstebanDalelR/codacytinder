package com.tinder.pushnotifications.model;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.CallSuper;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.v4.app.NotificationCompat.C0382c;
import android.support.v4.app.NotificationCompat.C2823b;
import android.support.v4.content.C0432b;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.activities.MainActivity;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.pushnotifications.view.InAppNotificationView;
import com.tinder.pushnotifications.view.InAppNotificationView.Listener;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 @2\u00020\u0001:\u0002@AB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u000e\u00101\u001a\u0002022\u0006\u0010/\u001a\u000200J\u0010\u00103\u001a\u0002042\u0006\u0010/\u001a\u000200H\u0015J\u000e\u00105\u001a\u0002062\u0006\u0010/\u001a\u000200J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u000e\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020\u0018J\u0010\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000f8\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u00020\u000f8\u0014XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#XD¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#XD¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0014\u0010(\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016R\u0016\u0010+\u001a\u00020\u000f8\u0016XD¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0011¨\u0006B"}, d2 = {"Lcom/tinder/pushnotifications/model/TinderNotification;", "", "id", "", "message", "title", "icon", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "backendImage", "getBackendImage", "()Landroid/graphics/Bitmap;", "setBackendImage", "(Landroid/graphics/Bitmap;)V", "backgroundResource", "", "getBackgroundResource", "()I", "bodyTextColor", "getBodyTextColor", "getIcon", "getId", "()Ljava/lang/String;", "inAppNotificationClickListener", "Lcom/tinder/pushnotifications/view/InAppNotificationView$Listener;", "legacyBackgroundColor", "getLegacyBackgroundColor", "getMessage", "priority", "getPriority", "pushId", "getPushId", "setPushId", "(Ljava/lang/String;)V", "shouldShowIconWhenBackendImageSupplied", "", "getShouldShowIconWhenBackendImageSupplied", "()Z", "shouldShowRedDot", "getShouldShowRedDot", "tinderUrl", "getTinderUrl", "getTitle", "titleTextColor", "getTitleTextColor", "getBuilder", "Landroid/support/v4/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "getInAppNotificationLayout", "Lcom/tinder/pushnotifications/view/InAppNotificationView;", "getIntent", "Landroid/content/Intent;", "getToastLayout", "Landroid/view/View;", "sendTrackingEvent", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "setInAppNotificationClickListener", "listener", "shouldSendOnVisibility", "visibility", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "Companion", "NotificationOrigin", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public class TinderNotification {
    /* renamed from: b */
    public static final C14554a f45981b = new C14554a();
    @Nullable
    /* renamed from: a */
    private Bitmap f45982a;
    @Nullable
    /* renamed from: c */
    private String f45983c;
    /* renamed from: d */
    private Listener f45984d;
    @NotNull
    /* renamed from: e */
    private final String f45985e = "tinder://";
    /* renamed from: f */
    private final int f45986f;
    @ColorRes
    /* renamed from: g */
    private final int f45987g = R.color.in_app_notification_background_default;
    @DrawableRes
    /* renamed from: h */
    private final int f45988h = R.drawable.ian_background_general;
    @ColorRes
    /* renamed from: i */
    private final int f45989i = R.color.white;
    @ColorRes
    /* renamed from: j */
    private final int f45990j = R.color.white;
    /* renamed from: k */
    private final boolean f45991k;
    /* renamed from: l */
    private final boolean f45992l = true;
    @NotNull
    /* renamed from: m */
    private final String f45993m;
    @NotNull
    /* renamed from: n */
    private final String f45994n;
    @NotNull
    /* renamed from: o */
    private final String f45995o;
    @Nullable
    /* renamed from: p */
    private final Bitmap f45996p;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/pushnotifications/model/TinderNotification$NotificationOrigin;", "", "(Ljava/lang/String;I)V", "FOREGROUND", "BACKGROUND", "UNDEFINED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum NotificationOrigin {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/pushnotifications/model/TinderNotification$Companion;", "", "()V", "EXTRA_NOTIFICATION_ORIGIN", "", "EXTRA_TINDER_URL", "NOTIFICATION_ID_FIELD", "NOTIFICATION_TITLE", "PARCEL_VERSION", "", "PARCEL_VERSION_FIELD", "TINDER_NOTIFICATION_ID", "TINDER_URL_BASE", "TYPE_NAME", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.model.TinderNotification$a */
    public static final class C14554a {
        private C14554a() {
        }
    }

    /* renamed from: a */
    public void mo11931a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
    }

    public TinderNotification(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Bitmap bitmap) {
        C2668g.b(str, "id");
        C2668g.b(str2, "message");
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        this.f45993m = str;
        this.f45994n = str2;
        this.f45995o = str3;
        this.f45996p = bitmap;
    }

    @NotNull
    /* renamed from: l */
    public final String m55597l() {
        return this.f45993m;
    }

    @NotNull
    /* renamed from: m */
    public final String m55598m() {
        return this.f45994n;
    }

    @NotNull
    /* renamed from: n */
    public final String m55599n() {
        return this.f45995o;
    }

    @Nullable
    /* renamed from: o */
    public final Bitmap m55600o() {
        return this.f45996p;
    }

    /* renamed from: a */
    public final void m55580a(@Nullable Bitmap bitmap) {
        this.f45982a = bitmap;
    }

    @Nullable
    /* renamed from: j */
    public final Bitmap m55595j() {
        return this.f45982a;
    }

    /* renamed from: a */
    public final void m55583a(@Nullable String str) {
        this.f45983c = str;
    }

    @Nullable
    /* renamed from: k */
    public final String m55596k() {
        return this.f45983c;
    }

    @NotNull
    /* renamed from: c */
    public String mo11930c() {
        return this.f45985e;
    }

    /* renamed from: d */
    public int mo11933d() {
        return this.f45986f;
    }

    /* renamed from: e */
    protected int mo11934e() {
        return this.f45987g;
    }

    /* renamed from: a */
    public int mo11927a() {
        return this.f45988h;
    }

    /* renamed from: f */
    public int mo11935f() {
        return this.f45989i;
    }

    /* renamed from: g */
    public int mo11936g() {
        return this.f45990j;
    }

    /* renamed from: h */
    public boolean mo11937h() {
        return this.f45991k;
    }

    /* renamed from: b */
    public boolean mo11928b() {
        return this.f45992l;
    }

    @NotNull
    @CallSuper
    /* renamed from: a */
    protected Intent mo11929a(@NotNull Context context) {
        C2668g.b(context, "context");
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(335577088);
        intent.putExtra("tinder_url", mo11930c());
        intent.putExtra("notification_id", this.f45993m);
        context = intent.putExtra("notification_source", NotificationOrigin.BACKGROUND);
        C2668g.a(context, "putExtra(EXTRA_NOTIFICATION_ORIGIN, BACKGROUND)");
        C2668g.a(context, "with(Intent(context, Mai…IN, BACKGROUND)\n        }");
        return context;
    }

    @NotNull
    /* renamed from: b */
    public C0382c mo11932b(@NotNull Context context) {
        C2668g.b(context, "context");
        context = new C0382c(context).b(6).a(PendingIntent.getActivity(context, UUID.randomUUID().hashCode(), mo11929a(context), 1073741824)).a(this.f45995o).a(new C2823b().a(this.f45994n)).b(this.f45994n).c(this.f45994n).a(true).a(R.drawable.ic_stat_notification).c(mo11933d());
        C2668g.a(context, "NotificationCompat.Build…   .setPriority(priority)");
        return context;
    }

    @NotNull
    /* renamed from: c */
    public final View m55587c(@NotNull Context context) {
        C2668g.b(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.view_toast_custom, null);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        C2668g.a(textView, "textView");
        textView.setText(this.f45994n);
        inflate.findViewById(R.id.toast_layout_root).setBackgroundColor(C0432b.c(context, mo11934e()));
        C2668g.a(inflate, "layout");
        return inflate;
    }

    /* renamed from: a */
    public final void m55582a(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        this.f45984d = listener;
    }

    @NotNull
    /* renamed from: d */
    public final InAppNotificationView m55590d(@NotNull Context context) {
        C2668g.b(context, "context");
        InAppNotificationView inAppNotificationView = new InAppNotificationView(context, this);
        context = this.f45984d;
        if (context != null) {
            inAppNotificationView.setInAppNotificationClickedListener(context);
        }
        return inAppNotificationView;
    }

    /* renamed from: a */
    public boolean mo11938a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
        C2668g.b(appVisibilityTracker$Visibility, "visibility");
        if (appVisibilityTracker$Visibility != AppVisibilityTracker$Visibility.FOREGROUND) {
            if (appVisibilityTracker$Visibility != AppVisibilityTracker$Visibility.BACKGROUND) {
                return null;
            }
        }
        return true;
    }
}
