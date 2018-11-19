package com.tinder.reactions.drawer.p391b;

import com.tinder.reactions.analytics.C16276g;
import com.tinder.reactions.analytics.C16276g.C14582a;
import com.tinder.reactions.analytics.model.GestureDrawerInteractMethod;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/reactions/drawer/presenter/DrawerPresenter;", "", "matchId", "", "grandGestureCloseEventDispatcher", "Lcom/tinder/reactions/analytics/GrandGestureCloseEventDispatcher;", "(Ljava/lang/String;Lcom/tinder/reactions/analytics/GrandGestureCloseEventDispatcher;)V", "handleTapCloseClicked", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.b.a */
public final class C14624a {
    /* renamed from: a */
    private final String f46129a;
    /* renamed from: b */
    private final C16276g f46130b;

    @Inject
    public C14624a(@NotNull String str, @NotNull C16276g c16276g) {
        C2668g.b(str, "matchId");
        C2668g.b(c16276g, "grandGestureCloseEventDispatcher");
        this.f46129a = str;
        this.f46130b = c16276g;
    }

    /* renamed from: a */
    public final void m55788a() {
        this.f46130b.m61459a(new C14582a(this.f46129a, GestureDrawerInteractMethod.TAP));
    }
}
