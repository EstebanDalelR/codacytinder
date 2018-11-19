package com.tinder.pushnotifications.model;

import android.graphics.Bitmap;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/tinder/pushnotifications/model/BitmojiConnectNotification;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "id", "", "message", "title", "icon", "Landroid/graphics/Bitmap;", "didConnect", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Z)V", "backgroundResource", "", "getBackgroundResource", "()I", "shouldShowIconWhenBackendImageSupplied", "getShouldShowIconWhenBackendImageSupplied", "()Z", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.model.a */
public final class C16250a extends TinderNotification {
    /* renamed from: a */
    public static final C14555a f50625a = new C14555a();
    /* renamed from: c */
    private final int f50626c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/pushnotifications/model/BitmojiConnectNotification$Companion;", "", "()V", "TYPE_NAME", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.model.a$a */
    public static final class C14555a {
        private C14555a() {
        }
    }

    /* renamed from: b */
    public boolean mo11928b() {
        return false;
    }

    public C16250a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Bitmap bitmap, boolean z) {
        C2668g.b(str, "id");
        C2668g.b(str2, "message");
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(bitmap, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        super(str, str2, str3, bitmap);
        this.f50626c = z ? R.drawable.bitmoji_notification_success : R.drawable.bitmoji_notification_failure;
    }

    /* renamed from: a */
    public int mo11927a() {
        return this.f50626c;
    }
}
