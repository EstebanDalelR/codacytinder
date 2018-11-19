package com.tinder.feed.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import com.jakewharton.rxbinding2.p140b.C5716a;
import com.tinder.common.p196h.C8541b;
import com.tinder.feed.view.p250a.C9480c;
import com.tinder.feed.view.p250a.C9481d;
import com.tinder.home.p342a.C11862a;
import com.tinder.module.MatchesViewComponentProvider;
import com.tinder.profile.p365d.C14398a;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/feed/view/MatchFeedTabView;", "Landroid/support/v7/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feedTabBadgeTrigger", "Lcom/tinder/home/feed/FeedTabBadgeTrigger;", "getFeedTabBadgeTrigger", "()Lcom/tinder/home/feed/FeedTabBadgeTrigger;", "setFeedTabBadgeTrigger", "(Lcom/tinder/home/feed/FeedTabBadgeTrigger;)V", "resourceHolder", "Lcom/tinder/feed/view/extension/UnreadIndicatorConfig;", "getResourceHolder$Tinder_release", "()Lcom/tinder/feed/view/extension/UnreadIndicatorConfig;", "showUnreadIndicator", "", "hideBadgeIndicator", "", "observeTriggerEvents", "onAttachedToWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "showBadgeIndicator", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class MatchFeedTabView extends AppCompatTextView {
    @Inject
    @NotNull
    /* renamed from: a */
    public C11862a f42059a;
    @NotNull
    /* renamed from: b */
    private final C9481d f42060b;
    /* renamed from: c */
    private boolean f42061c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.MatchFeedTabView$a */
    static final class C11719a<T> implements Consumer<C15813i> {
        /* renamed from: a */
        final /* synthetic */ MatchFeedTabView f38237a;

        C11719a(MatchFeedTabView matchFeedTabView) {
            this.f38237a = matchFeedTabView;
        }

        public /* synthetic */ void accept(Object obj) {
            m47547a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m47547a(C15813i c15813i) {
            this.f38237a.m51358c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.MatchFeedTabView$b */
    static final class C11720b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11720b f38238a = new C11720b();

        C11720b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47548a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47548a(Throwable th) {
            C0001a.c(th, "Error observing Trigger.onShow()", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.MatchFeedTabView$c */
    static final class C11721c<T> implements Consumer<C15813i> {
        /* renamed from: a */
        final /* synthetic */ MatchFeedTabView f38239a;

        C11721c(MatchFeedTabView matchFeedTabView) {
            this.f38239a = matchFeedTabView;
        }

        public /* synthetic */ void accept(Object obj) {
            m47549a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m47549a(C15813i c15813i) {
            this.f38239a.m51356b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.MatchFeedTabView$d */
    static final class C11722d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11722d f38240a = new C11722d();

        C11722d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47550a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47550a(Throwable th) {
            C0001a.c(th, "Error observing Trigger.onHide()", new Object[0]);
        }
    }

    public MatchFeedTabView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attributeSet");
        super(context, attributeSet);
        Resources resources = getResources();
        C2668g.a(resources, "resources");
        this.f42060b = new C9481d(resources);
        context = C14398a.a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.MatchesViewComponentProvider");
        }
        ((MatchesViewComponentProvider) context).provideMatchesViewComponent().inject(this);
        setPadding(this.f42060b.m39654e(), 0, this.f42060b.m39654e(), 0);
    }

    @NotNull
    public final C11862a getFeedTabBadgeTrigger() {
        C11862a c11862a = this.f42059a;
        if (c11862a == null) {
            C2668g.b("feedTabBadgeTrigger");
        }
        return c11862a;
    }

    public final void setFeedTabBadgeTrigger(@NotNull C11862a c11862a) {
        C2668g.b(c11862a, "<set-?>");
        this.f42059a = c11862a;
    }

    @NotNull
    public final C9481d getResourceHolder$Tinder_release() {
        return this.f42060b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m51354a();
    }

    protected void onDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f42061c) {
            C9480c.m39648a(this, canvas);
        }
    }

    /* renamed from: a */
    private final void m51354a() {
        C11862a c11862a = this.f42059a;
        if (c11862a == null) {
            C2668g.b("feedTabBadgeTrigger");
        }
        View view = this;
        C8541b.m36524a(c11862a).takeUntil(C5716a.a(view)).subscribe(new C11719a(this), C11720b.f38238a);
        c11862a = this.f42059a;
        if (c11862a == null) {
            C2668g.b("feedTabBadgeTrigger");
        }
        C8541b.m36525b(c11862a).takeUntil(C5716a.a(view)).subscribe(new C11721c(this), C11722d.f38240a);
    }

    /* renamed from: b */
    private final void m51356b() {
        this.f42061c = false;
        postInvalidate();
    }

    /* renamed from: c */
    private final void m51358c() {
        this.f42061c = true;
        postInvalidate();
    }
}
