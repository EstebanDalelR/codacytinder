package com.tinder.pushnotifications.model;

import android.graphics.Bitmap;
import com.tinder.model.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tinder/pushnotifications/model/RemoveNotification;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "id", "", "removeIds", "", "icon", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;[Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getRemoveIds", "()[Ljava/lang/String;", "[Ljava/lang/String;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.model.l */
public final class C16261l extends TinderNotification {
    /* renamed from: a */
    public static final C14566a f50658a = new C14566a();
    @NotNull
    /* renamed from: c */
    private final String[] f50659c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/pushnotifications/model/RemoveNotification$Companion;", "", "()V", "TYPE_NAME", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.model.l$a */
    public static final class C14566a {
        private C14566a() {
        }
    }

    @NotNull
    /* renamed from: i */
    public final String[] m61437i() {
        return this.f50659c;
    }

    public C16261l(@NotNull String str, @NotNull String[] strArr, @NotNull Bitmap bitmap) {
        C2668g.b(str, "id");
        C2668g.b(strArr, "removeIds");
        C2668g.b(bitmap, AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        super(str, "unused", "unused", bitmap);
        this.f50659c = strArr;
    }
}
