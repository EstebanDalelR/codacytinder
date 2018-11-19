package com.tinder.toppicks.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.widget.ViewAnimator;
import com.tinder.R;
import com.tinder.base.view.IdViewAnimator;
import com.tinder.common.view.Container;
import com.tinder.deadshot.Deadshot;
import com.tinder.paywall.legacy.LegacyPaywallLauncher;
import com.tinder.paywall.legacy.LegacyPaywallLauncher.C10062a;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.toppicks.TopPicksComponentProvider;
import com.tinder.toppicks.counter.TopPicksBottomCounterView;
import com.tinder.toppicks.error.TopPicksErrorView;
import com.tinder.toppicks.exhausted.C15264a;
import com.tinder.toppicks.presenter.C15284a;
import com.tinder.utils.C15365p;
import com.tinder.utils.at;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00019B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010#\u001a\u00020$H\u0016J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020$H\u0016J\b\u0010,\u001a\u00020$H\u0014J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020$H\u0014J\b\u00100\u001a\u00020$H\u0007J\b\u00101\u001a\u00020$H\u0007J\b\u00102\u001a\u00020$H\u0016J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020$H\u0016J\u0010\u00107\u001a\u00020$2\u0006\u0010)\u001a\u00020*H\u0016J\b\u00108\u001a\u00020$H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006:"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksGoldView;", "Lcom/tinder/base/view/IdViewAnimator;", "Lcom/tinder/common/view/Container;", "Lcom/tinder/toppicks/view/TopPicksGoldTarget;", "Lcom/tinder/paywall/legacy/PaywallFlowSuccessListener;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bottomCounterView", "Lcom/tinder/toppicks/counter/TopPicksBottomCounterView;", "errorView", "Lcom/tinder/toppicks/error/TopPicksErrorView;", "gridView", "Lcom/tinder/toppicks/view/TopPicksGridRecsView;", "legacyPaywallLauncher", "Lcom/tinder/paywall/legacy/LegacyPaywallLauncher;", "getLegacyPaywallLauncher", "()Lcom/tinder/paywall/legacy/LegacyPaywallLauncher;", "setLegacyPaywallLauncher", "(Lcom/tinder/paywall/legacy/LegacyPaywallLauncher;)V", "lifecycle", "Landroid/arch/lifecycle/Lifecycle;", "getLifecycle", "()Landroid/arch/lifecycle/Lifecycle;", "setLifecycle", "(Landroid/arch/lifecycle/Lifecycle;)V", "presenter", "Lcom/tinder/toppicks/presenter/TopPicksGoldPresenter;", "getPresenter", "()Lcom/tinder/toppicks/presenter/TopPicksGoldPresenter;", "setPresenter", "(Lcom/tinder/toppicks/presenter/TopPicksGoldPresenter;)V", "dismissBottomBar", "", "getTeasers", "", "Lcom/tinder/toppicks/exhausted/TopPickTeaserExhaustedViewModel;", "handlePaywallCallBack", "source", "Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "handleSuccess", "onAttachedToWindow", "onBackPressed", "", "onDetachedFromWindow", "onPause", "onResume", "showBottomBar", "showPage", "page", "Lcom/tinder/toppicks/view/TopPicksGoldView$Page;", "showPaginatedError", "showPaywall", "showTutorial", "Page", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@SuppressLint({"ClickableViewAccessibility"})
public final class TopPicksGoldView extends IdViewAnimator implements LifecycleObserver, Container, PaywallFlowSuccessListener, TopPicksGoldTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public LegacyPaywallLauncher f12529a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C15284a f12530b;
    @Inject
    @NotNull
    /* renamed from: c */
    public Lifecycle f12531c;
    /* renamed from: d */
    private final TopPicksGridRecsView f12532d;
    /* renamed from: e */
    private final TopPicksBottomCounterView f12533e;
    /* renamed from: f */
    private final TopPicksErrorView f12534f;

    public /* synthetic */ TopPicksGoldView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksGoldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        ViewAnimator.inflate(context, R.layout.top_picks_gold_view, this);
        attributeSet = C15365p.b(context);
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.toppicks.TopPicksComponentProvider");
        }
        ((TopPicksComponentProvider) attributeSet).provideTopPicksComponent().inject(this);
        setInAnimation(context, 17432576);
        setOutAnimation(context, 17432577);
        Object findViewById = findViewById(R.id.recs_grid_view);
        C2668g.m10305a(findViewById, "findViewById(R.id.recs_grid_view)");
        this.f12532d = (TopPicksGridRecsView) findViewById;
        findViewById = findViewById(R.id.bottom_counter_view);
        C2668g.m10305a(findViewById, "findViewById(R.id.bottom_counter_view)");
        this.f12533e = (TopPicksBottomCounterView) findViewById;
        findViewById = findViewById(R.id.top_picks_gold_error_view);
        C2668g.m10305a(findViewById, "findViewById(R.id.top_picks_gold_error_view)");
        this.f12534f = (TopPicksErrorView) findViewById;
        TopPicksGoldView topPicksGoldView = this;
        this.f12532d.setPaywallCallBack((Function1) new TopPicksGoldView$1(topPicksGoldView));
        this.f12533e.setPaywallCallBack((Function1) new TopPicksGoldView$2(topPicksGoldView));
        View view = (View) this.f12533e;
        if (ViewCompat.m2234z(view) == null || view.isLayoutRequested() != null) {
            view.addOnLayoutChangeListener((OnLayoutChangeListener) new TopPicksGoldView$a(this));
        } else {
            this.f12532d.setBottomPaddingForList(view.getHeight());
        }
        this.f12533e.setOnTouchListener((OnTouchListener) TopPicksGoldView$3.f47480a);
        this.f12534f.setOnTryAgainClickListener((Function1) new TopPicksGoldView$5(this));
    }

    @NotNull
    public final LegacyPaywallLauncher getLegacyPaywallLauncher() {
        LegacyPaywallLauncher legacyPaywallLauncher = this.f12529a;
        if (legacyPaywallLauncher == null) {
            C2668g.m10310b("legacyPaywallLauncher");
        }
        return legacyPaywallLauncher;
    }

    public final void setLegacyPaywallLauncher(@NotNull LegacyPaywallLauncher legacyPaywallLauncher) {
        C2668g.m10309b(legacyPaywallLauncher, "<set-?>");
        this.f12529a = legacyPaywallLauncher;
    }

    @NotNull
    public final C15284a getPresenter() {
        C15284a c15284a = this.f12530b;
        if (c15284a == null) {
            C2668g.m10310b("presenter");
        }
        return c15284a;
    }

    public final void setPresenter(@NotNull C15284a c15284a) {
        C2668g.m10309b(c15284a, "<set-?>");
        this.f12530b = c15284a;
    }

    @NotNull
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f12531c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        return lifecycle;
    }

    public final void setLifecycle(@NotNull Lifecycle lifecycle) {
        C2668g.m10309b(lifecycle, "<set-?>");
        this.f12531c = lifecycle;
    }

    public void showBottomBar() {
        this.f12533e.setVisibility(0);
    }

    public void dismissBottomBar() {
        this.f12533e.setVisibility(8);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Lifecycle lifecycle = this.f12531c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo36a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Lifecycle lifecycle = this.f12531c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo37b(this);
        Deadshot.drop(this);
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        C15284a c15284a = this.f12530b;
        if (c15284a == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, c15284a);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        Deadshot.drop(this);
    }

    public boolean onBackPressed() {
        return this.f12532d.onBackPressed();
    }

    @NotNull
    public final List<C15264a> getTeasers() {
        return this.f12532d.getTeasers();
    }

    /* renamed from: a */
    private final void m15133a(TopPicksPaywallSource topPicksPaywallSource) {
        C15284a c15284a = this.f12530b;
        if (c15284a == null) {
            C2668g.m10310b("presenter");
        }
        c15284a.a(topPicksPaywallSource);
    }

    public void showPaywall(@NotNull TopPicksPaywallSource topPicksPaywallSource) {
        C2668g.m10309b(topPicksPaywallSource, "source");
        LegacyPaywallLauncher legacyPaywallLauncher = this.f12529a;
        if (legacyPaywallLauncher == null) {
            C2668g.m10310b("legacyPaywallLauncher");
        }
        PaywallTypeSource paywallTypeSource = topPicksPaywallSource;
        Object context = getContext();
        C2668g.m10305a(context, "context");
        topPicksPaywallSource = C15365p.b(context);
        if (topPicksPaywallSource == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        C10062a.a(legacyPaywallLauncher, paywallTypeSource, (Activity) topPicksPaywallSource, (Function0) new TopPicksGoldView$showPaywall$2(this), (Function0) new TopPicksGoldView$showPaywall$3(this), (Function0) new TopPicksGoldView$showPaywall$1(this), null, null, 96, null);
    }

    public void handleSuccess() {
        this.f12532d.mo3605c();
    }

    public void showPage(@NotNull TopPicksGoldView$Page topPicksGoldView$Page) {
        C2668g.m10309b(topPicksGoldView$Page, "page");
        setDisplayedChildId(topPicksGoldView$Page.getId());
    }

    public void showPaginatedError() {
        at.f47621a.a(this, R.string.oops);
    }

    public void showTutorial() {
        this.f12532d.showTutorial();
    }
}
