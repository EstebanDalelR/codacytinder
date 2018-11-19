package com.tinder.pushnotifications.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\u000e"}, d2 = {"Lcom/tinder/pushnotifications/model/DiscountNotification;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "id", "", "message", "title", "icon", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.model.c */
public final class C16252c extends TinderNotification {
    /* renamed from: a */
    public static final C14557a f50629a = new C14557a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/pushnotifications/model/DiscountNotification$Companion;", "", "()V", "TYPE_NAME", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.model.c$a */
    public static final class C14557a {
        private C14557a() {
        }
    }

    public C16252c(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Bitmap bitmap) {
        C2668g.b(str, "id");
        C2668g.b(str2, "message");
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(bitmap, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        super(str, str2, str3, bitmap);
    }

    @NotNull
    /* renamed from: a */
    protected Intent mo11929a(@NotNull Context context) {
        C2668g.b(context, "context");
        context = super.mo11929a(context);
        context.putExtra("tinder_from_push", true);
        context.putExtra("is_discount", true);
        return context;
    }
}
