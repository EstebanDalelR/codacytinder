package com.tinder.chat.view.action;

import android.content.Context;
import com.tinder.activities.ActivityGiphy;
import com.tinder.chat.analytics.aj;
import com.tinder.chat.analytics.aj.C8420a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/chat/view/action/FullscreenGifAction;", "Lcom/tinder/chat/view/action/FullscreenGifDisplayAction;", "activityContext", "Landroid/content/Context;", "chatTapMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher;", "(Landroid/content/Context;Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher;)V", "showGif", "", "gifUrl", "", "matchId", "messageType", "", "contentId", "messageIndex", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.k */
public final class C10586k implements FullscreenGifDisplayAction {
    /* renamed from: a */
    private final Context f34392a;
    /* renamed from: b */
    private final aj f34393b;

    public C10586k(@NotNull Context context, @NotNull aj ajVar) {
        C2668g.b(context, "activityContext");
        C2668g.b(ajVar, "chatTapMessageEventDispatcher");
        this.f34392a = context;
        this.f34393b = ajVar;
    }

    public void showGif(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, int i2) {
        String str4 = str;
        C2668g.b(str4, "gifUrl");
        String str5 = str2;
        C2668g.b(str5, "matchId");
        String str6 = str3;
        C2668g.b(str6, "contentId");
        this.f34393b.m42573a(new C8420a(str5, i, null, str6, i2, null, null, null, 228, null));
        this.f34392a.startActivity(ActivityGiphy.a(this.f34392a, str4));
    }
}
