package com.tinder.pushnotifications.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\u000e"}, d2 = {"Lcom/tinder/pushnotifications/model/PhotoOptimizedNotification;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "id", "", "message", "icon", "Landroid/graphics/Bitmap;", "title", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.model.j */
public final class C16259j extends TinderNotification {
    /* renamed from: a */
    public static final C14564a f50655a = new C14564a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/pushnotifications/model/PhotoOptimizedNotification$Companion;", "", "()V", "TYPE_NAME", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.model.j$a */
    public static final class C14564a {
        private C14564a() {
        }
    }

    public C16259j(@NotNull String str, @NotNull String str2, @NotNull Bitmap bitmap, @NotNull String str3) {
        C2668g.b(str, "id");
        C2668g.b(str2, "message");
        C2668g.b(bitmap, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        super(str, str2, str3, bitmap);
    }

    @NotNull
    /* renamed from: a */
    protected Intent mo11929a(@NotNull Context context) {
        C2668g.b(context, "context");
        context = super.mo11929a(context).putExtra("notificaiton_photo_optimizer_id", "photo_optimized");
        C2668g.a(context, "intent.putExtra(TinderCo…_OPTIMIZER_ID, TYPE_NAME)");
        return context;
    }
}
