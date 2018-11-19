package com.tinder.pushnotifications.model;

import android.graphics.Bitmap;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/tinder/pushnotifications/model/PlacesNotification;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "id", "", "message", "icon", "Landroid/graphics/Bitmap;", "title", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "tinderUrl", "getTinderUrl", "()Ljava/lang/String;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.model.k */
public final class C16260k extends TinderNotification {
    /* renamed from: a */
    public static final C14565a f50656a = new C14565a();
    @NotNull
    /* renamed from: c */
    private final String f50657c = "tinder://places";

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/pushnotifications/model/PlacesNotification$Companion;", "", "()V", "TYPE_NAME", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.model.k$a */
    public static final class C14565a {
        private C14565a() {
        }
    }

    public C16260k(@NotNull String str, @NotNull String str2, @NotNull Bitmap bitmap, @NotNull String str3) {
        C2668g.b(str, "id");
        C2668g.b(str2, "message");
        C2668g.b(bitmap, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        super(str, str2, str3, bitmap);
    }

    @NotNull
    /* renamed from: c */
    public String mo11930c() {
        return this.f50657c;
    }
}
