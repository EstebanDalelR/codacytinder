package com.tinder.feed.view;

import android.arch.lifecycle.LifecycleObserver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.tinder.deadshot.Deadshot;
import com.tinder.feed.presenter.C9471h;
import com.tinder.feed.target.MatchesPageMessagesTabIndicatorTarget;
import com.tinder.feed.view.p250a.C9480c;
import com.tinder.feed.view.p250a.C9481d;
import com.tinder.module.MatchesViewComponentProvider;
import com.tinder.profile.p365d.C14398a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u0013\u001a\u00020\u0016H\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/feed/view/MatchMessagesTabView;", "Landroid/support/v7/widget/AppCompatTextView;", "Lcom/tinder/feed/target/MatchesPageMessagesTabIndicatorTarget;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "presenter", "Lcom/tinder/feed/presenter/MatchMessagesTabPresenter;", "getPresenter", "()Lcom/tinder/feed/presenter/MatchMessagesTabPresenter;", "setPresenter", "(Lcom/tinder/feed/presenter/MatchMessagesTabPresenter;)V", "resourceHolder", "Lcom/tinder/feed/view/extension/UnreadIndicatorConfig;", "getResourceHolder$Tinder_release", "()Lcom/tinder/feed/view/extension/UnreadIndicatorConfig;", "showUnreadIndicator", "", "hideUnreadIndicator", "", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class MatchMessagesTabView extends AppCompatTextView implements LifecycleObserver, MatchesPageMessagesTabIndicatorTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9471h f42062a;
    @NotNull
    /* renamed from: b */
    private final C9481d f42063b;
    /* renamed from: c */
    private boolean f42064c;

    public MatchMessagesTabView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attributeSet");
        super(context, attributeSet);
        Resources resources = getResources();
        C2668g.a(resources, "resources");
        this.f42063b = new C9481d(resources);
        context = C14398a.a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.MatchesViewComponentProvider");
        }
        ((MatchesViewComponentProvider) context).provideMatchesViewComponent().inject(this);
        setPadding(this.f42063b.m39654e(), 0, this.f42063b.m39654e(), 0);
    }

    @NotNull
    public final C9471h getPresenter() {
        C9471h c9471h = this.f42062a;
        if (c9471h == null) {
            C2668g.b("presenter");
        }
        return c9471h;
    }

    public final void setPresenter(@NotNull C9471h c9471h) {
        C2668g.b(c9471h, "<set-?>");
        this.f42062a = c9471h;
    }

    @NotNull
    public final C9481d getResourceHolder$Tinder_release() {
        return this.f42063b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9471h c9471h = this.f42062a;
        if (c9471h == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c9471h);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void showUnreadIndicator() {
        this.f42064c = true;
        invalidate();
    }

    public void hideUnreadIndicator() {
        this.f42064c = false;
        invalidate();
    }

    protected void onDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f42064c) {
            C9480c.m39649a(this, canvas);
        }
    }
}
