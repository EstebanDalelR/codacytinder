package com.tinder.chat.view.action;

import android.content.Context;
import com.tinder.R;
import com.tinder.chat.view.action.FullscreenImageDisplayAction.C8456a;
import com.tinder.common.activity.FullscreenImageActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/chat/view/action/FullscreenFeedImageAction;", "Lcom/tinder/chat/view/action/FullscreenImageDisplayAction;", "activityContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "showImage", "", "payload", "Lcom/tinder/chat/view/action/FullscreenImageDisplayAction$Payload;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.j */
public final class C10585j implements FullscreenImageDisplayAction {
    /* renamed from: a */
    private final Context f34391a;

    public C10585j(@NotNull Context context) {
        C2668g.b(context, "activityContext");
        this.f34391a = context;
    }

    public void showImage(@NotNull C8456a c8456a) {
        C2668g.b(c8456a, "payload");
        if ((C19303i.a(c8456a.m36191a()) ^ 1) != 0) {
            FullscreenImageActivity.f45349a.m36479a(this.f34391a, R.layout.chat_activity_feed_fullscreen_image_error_view, c8456a.m36191a(), c8456a.m36192b(), c8456a.m36193c(), c8456a.m36194d());
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not show fullscreen image for URL: \"");
        stringBuilder.append(c8456a.m36191a());
        stringBuilder.append('\"');
        C0001a.d(stringBuilder.toString(), new Object[0]);
    }
}
