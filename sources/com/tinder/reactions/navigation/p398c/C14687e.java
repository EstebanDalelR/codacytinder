package com.tinder.reactions.navigation.p398c;

import com.tinder.reactions.analytics.C16279k;
import com.tinder.reactions.analytics.C16279k.C14585a;
import com.tinder.reactions.analytics.GestureShowPreviewFrom;
import com.tinder.reactions.gestures.p395c.C16347e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/reactions/navigation/presenter/GestureNavigationPresenter;", "", "gesturePositionProvider", "Lcom/tinder/reactions/gestures/provider/GesturePositionProvider;", "grandGestureShowPreviewEventDispatcher", "Lcom/tinder/reactions/analytics/GrandGestureShowPreviewEventDispatcher;", "matchId", "", "(Lcom/tinder/reactions/gestures/provider/GesturePositionProvider;Lcom/tinder/reactions/analytics/GrandGestureShowPreviewEventDispatcher;Ljava/lang/String;)V", "onGestureSelected", "", "currentPosition", "", "from", "Lcom/tinder/reactions/analytics/GestureShowPreviewFrom;", "onGestureSelectedTabClicked", "currentIndex", "onGestureSelectedViewPagerSwipe", "onGestureTabSwipe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.navigation.c.e */
public final class C14687e {
    /* renamed from: a */
    private final C16347e f46270a;
    /* renamed from: b */
    private final C16279k f46271b;
    /* renamed from: c */
    private final String f46272c;

    @Inject
    public C14687e(@NotNull C16347e c16347e, @NotNull C16279k c16279k, @NotNull String str) {
        C2668g.b(c16347e, "gesturePositionProvider");
        C2668g.b(c16279k, "grandGestureShowPreviewEventDispatcher");
        C2668g.b(str, "matchId");
        this.f46270a = c16347e;
        this.f46271b = c16279k;
        this.f46272c = str;
    }

    /* renamed from: a */
    public final void m55943a(int i) {
        m55942a(i, GestureShowPreviewFrom.TAP_ICON);
    }

    /* renamed from: b */
    public final void m55944b(int i) {
        m55942a(i, GestureShowPreviewFrom.SWIPE_ICON);
    }

    /* renamed from: c */
    public final void m55945c(int i) {
        m55942a(i, GestureShowPreviewFrom.SWIPE_FILTER);
    }

    /* renamed from: a */
    private final void m55942a(int i, GestureShowPreviewFrom gestureShowPreviewFrom) {
        this.f46270a.m61663b(i);
        this.f46271b.m61467a(new C14585a(this.f46272c, gestureShowPreviewFrom, true));
    }
}
