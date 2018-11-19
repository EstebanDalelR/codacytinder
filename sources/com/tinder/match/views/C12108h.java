package com.tinder.match.views;

import android.content.Context;
import android.content.res.Resources;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0218d;
import android.widget.FrameLayout;
import com.jakewharton.rxbinding.support.design.widget.C5705a;
import com.jakewharton.rxbinding.support.design.widget.TabLayoutSelectionEvent;
import com.jakewharton.rxbinding.support.design.widget.TabLayoutSelectionEvent.Kind;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.R;
import com.tinder.common.view.SafeViewFlipper;
import com.tinder.deadshot.Deadshot;
import com.tinder.match.p290a.C9838a;
import com.tinder.match.presenter.C9870k;
import com.tinder.match.target.MatchTabsTarget;
import com.tinder.match.viewmodel.MatchTabsPage;
import com.tinder.module.MatchesViewComponentProvider;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0014J\b\u0010 \u001a\u00020\u001eH\u0014J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/match/views/MatchTabsView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/match/target/MatchTabsTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "matchTabPages", "", "Lcom/tinder/match/viewmodel/MatchTabsPage;", "[Lcom/tinder/match/viewmodel/MatchTabsPage;", "matchViewFlipper", "Lcom/tinder/common/view/SafeViewFlipper;", "getMatchViewFlipper", "()Lcom/tinder/common/view/SafeViewFlipper;", "matchViewFlipper$delegate", "Lkotlin/Lazy;", "presenter", "Lcom/tinder/match/presenter/MatchTabsPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/match/presenter/MatchTabsPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/match/presenter/MatchTabsPresenter;)V", "tabLayout", "Landroid/support/design/widget/TabLayout;", "getTabLayout", "()Landroid/support/design/widget/TabLayout;", "tabLayout$delegate", "tabLayoutDecorator", "Lcom/tinder/match/decorator/TabLayoutDecorator;", "observeTabSelections", "", "onAttachedToWindow", "onDetachedFromWindow", "selectTab", "tabPosition", "", "setupTabLayout", "showTab", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.views.h */
public final class C12108h extends FrameLayout implements MatchTabsTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f39279a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C12108h.class), "tabLayout", "getTabLayout()Landroid/support/design/widget/TabLayout;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C12108h.class), "matchViewFlipper", "getMatchViewFlipper()Lcom/tinder/common/view/SafeViewFlipper;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C9870k f39280b;
    /* renamed from: c */
    private final C9838a f39281c = new C9838a();
    /* renamed from: d */
    private final Lazy f39282d = C18451c.a(LazyThreadSafetyMode.NONE, new MatchTabsView$$special$$inlined$bindView$1(this, R.id.matches_tab_layout));
    /* renamed from: e */
    private final Lazy f39283e = C18451c.a(LazyThreadSafetyMode.NONE, new MatchTabsView$$special$$inlined$bindView$2(this, R.id.matches_tab_content_flipper));
    /* renamed from: f */
    private final MatchTabsPage[] f39284f = MatchTabsPage.values();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "tabSelectedEvent", "Lcom/jakewharton/rxbinding/support/design/widget/TabLayoutSelectionEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.views.h$a */
    static final class C14078a<T> implements Action1<TabLayoutSelectionEvent> {
        /* renamed from: a */
        final /* synthetic */ C12108h f44597a;

        C14078a(C12108h c12108h) {
            this.f44597a = c12108h;
        }

        public /* synthetic */ void call(Object obj) {
            m53800a((TabLayoutSelectionEvent) obj);
        }

        /* renamed from: a */
        public final void m53800a(TabLayoutSelectionEvent tabLayoutSelectionEvent) {
            C9870k presenter$Tinder_release = this.f44597a.getPresenter$Tinder_release();
            C0218d b = tabLayoutSelectionEvent.b();
            C2668g.a(b, "tabSelectedEvent.tab()");
            int c = b.c();
            Kind a = tabLayoutSelectionEvent.a();
            C2668g.a(a, "tabSelectedEvent.kind()");
            presenter$Tinder_release.m40615a(c, a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.views.h$b */
    static final class C14079b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14079b f44598a = new C14079b();

        C14079b() {
        }

        public /* synthetic */ void call(Object obj) {
            m53801a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53801a(Throwable th) {
            C0001a.c(th, "Error observing tab events", new Object[0]);
        }
    }

    private final SafeViewFlipper getMatchViewFlipper() {
        Lazy lazy = this.f39283e;
        KProperty kProperty = f39279a[1];
        return (SafeViewFlipper) lazy.getValue();
    }

    private final TabLayout getTabLayout() {
        Lazy lazy = this.f39282d;
        KProperty kProperty = f39279a[0];
        return (TabLayout) lazy.getValue();
    }

    public C12108h(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        if (!isInEditMode()) {
            ((MatchesViewComponentProvider) context).provideMatchesViewComponent().inject(this);
        }
        FrameLayout.inflate(context, R.layout.matches_tab_view, this);
        m48242a();
    }

    @NotNull
    public final C9870k getPresenter$Tinder_release() {
        C9870k c9870k = this.f39280b;
        if (c9870k == null) {
            C2668g.b("presenter");
        }
        return c9870k;
    }

    public final void setPresenter$Tinder_release(@NotNull C9870k c9870k) {
        C2668g.b(c9870k, "<set-?>");
        this.f39280b = c9870k;
    }

    /* renamed from: a */
    private final void m48242a() {
        for (MatchTabsPage matchTabsPage : this.f39284f) {
            C0218d a = getTabLayout().a();
            Context context = getContext();
            C2668g.a(context, "context");
            a = a.a(matchTabsPage.toView(context));
            Resources resources = getResources();
            C2668g.a(resources, "resources");
            getTabLayout().a(a.a(matchTabsPage.toHeading(resources)), false);
        }
        this.f39281c.m40519a(getTabLayout());
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9870k c9870k = this.f39280b;
        if (c9870k == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c9870k);
        m48244b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    /* renamed from: b */
    private final void m48244b() {
        C5705a.a(getTabLayout()).j(C5707b.a(this)).a(new C14078a(this), C14079b.f44598a);
    }

    /* renamed from: a */
    private final void m48243a(int i) {
        i = getTabLayout().a(i);
        if (i != 0 && !i.f()) {
            i.e();
        }
    }

    public void showTab(int i) {
        m48243a(i);
        getMatchViewFlipper().setDisplayedChild(i);
    }
}
