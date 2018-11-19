package com.tinder.pushnotifications.model;

import android.graphics.Bitmap;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/tinder/pushnotifications/model/SuperlikeNotification;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "id", "", "msg", "icon", "Landroid/graphics/Bitmap;", "title", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "backgroundResource", "", "getBackgroundResource", "()I", "legacyBackgroundColor", "getLegacyBackgroundColor", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.model.o */
public final class C16264o extends TinderNotification {
    /* renamed from: a */
    public static final C14569a f50663a = new C14569a();
    /* renamed from: c */
    private final int f50664c = R.color.in_app_notification_background_superlike;
    /* renamed from: d */
    private final int f50665d = R.drawable.ian_background_superlike;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/pushnotifications/model/SuperlikeNotification$Companion;", "", "()V", "TYPE_NAME", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.model.o$a */
    public static final class C14569a {
        private C14569a() {
        }
    }

    public C16264o(@NotNull String str, @NotNull String str2, @NotNull Bitmap bitmap, @NotNull String str3) {
        C2668g.b(str, "id");
        C2668g.b(str2, "msg");
        C2668g.b(bitmap, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        super(str, str2, str3, bitmap);
    }

    /* renamed from: e */
    protected int mo11934e() {
        return this.f50664c;
    }

    /* renamed from: a */
    public int mo11927a() {
        return this.f50665d;
    }
}
