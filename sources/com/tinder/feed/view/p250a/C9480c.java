package com.tinder.feed.view.p250a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.tinder.feed.view.MatchFeedTabView;
import com.tinder.feed.view.MatchMessagesTabView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"drawUnreadIndicator", "", "view", "Landroid/view/View;", "config", "Lcom/tinder/feed/view/extension/UnreadIndicatorConfig;", "canvas", "Landroid/graphics/Canvas;", "Lcom/tinder/feed/view/MatchFeedTabView;", "Lcom/tinder/feed/view/MatchMessagesTabView;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.a.c */
public final class C9480c {
    /* renamed from: a */
    public static final void m39648a(@NotNull MatchFeedTabView matchFeedTabView, @NotNull Canvas canvas) {
        C2668g.b(matchFeedTabView, "$receiver");
        C2668g.b(canvas, "canvas");
        C9480c.m39647a(matchFeedTabView, matchFeedTabView.getResourceHolder$Tinder_release(), canvas);
    }

    /* renamed from: a */
    public static final void m39649a(@NotNull MatchMessagesTabView matchMessagesTabView, @NotNull Canvas canvas) {
        C2668g.b(matchMessagesTabView, "$receiver");
        C2668g.b(canvas, "canvas");
        C9480c.m39647a(matchMessagesTabView, matchMessagesTabView.getResourceHolder$Tinder_release(), canvas);
    }

    /* renamed from: a */
    private static final void m39647a(View view, C9481d c9481d, Canvas canvas) {
        float d = c9481d.m39653d();
        float c = c9481d.m39652c();
        Paint a = c9481d.m39650a();
        c9481d = c9481d.m39651b();
        view = ((float) view.getWidth()) - d;
        canvas.drawCircle(view, d, d, a);
        canvas.drawCircle(view, d, c, c9481d);
    }
}
