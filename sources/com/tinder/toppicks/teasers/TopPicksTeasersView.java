package com.tinder.toppicks.teasers;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ViewAnimator;
import com.tinder.base.view.IdViewAnimator;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.OnPreSwipeListener;
import com.tinder.domain.toppicks.model.TopPickTeaser;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.legacy.LegacyPaywallLauncher;
import com.tinder.paywall.legacy.LegacyPaywallLauncher.C10062a;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.toppicks.C15235b.C15229e;
import com.tinder.toppicks.C15235b.C15230f;
import com.tinder.toppicks.di.TopPicksInjector$Factory;
import com.tinder.toppicks.error.TopPicksErrorView;
import com.tinder.toppicks.p482c.C16988a;
import com.tinder.utils.C15365p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\"2\u0010\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0%H\u0016J\b\u0010'\u001a\u00020\"H\u0014J\b\u0010(\u001a\u00020\"H\u0014J\b\u0010)\u001a\u00020\"H\u0007J\b\u0010*\u001a\u00020\"H\u0007J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0016J\u001e\u0010.\u001a\u00020\"2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000%2\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\"H\u0016J\u0012\u00104\u001a\b\u0012\u0004\u0012\u0002050%*\u00020\nH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00067"}, d2 = {"Lcom/tinder/toppicks/teasers/TopPicksTeasersView;", "Lcom/tinder/base/view/IdViewAnimator;", "Lcom/tinder/toppicks/teasers/TopPickTeasersGridTarget;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardGrid", "Lcom/tinder/toppicks/teasers/TeasersCardGridLayout;", "errorView", "Lcom/tinder/toppicks/error/TopPicksErrorView;", "getTinderGold", "Landroid/view/View;", "legacyPaywallLauncher", "Lcom/tinder/paywall/legacy/LegacyPaywallLauncher;", "getLegacyPaywallLauncher", "()Lcom/tinder/paywall/legacy/LegacyPaywallLauncher;", "setLegacyPaywallLauncher", "(Lcom/tinder/paywall/legacy/LegacyPaywallLauncher;)V", "lifecycle", "Landroid/arch/lifecycle/Lifecycle;", "getLifecycle", "()Landroid/arch/lifecycle/Lifecycle;", "setLifecycle", "(Landroid/arch/lifecycle/Lifecycle;)V", "presenter", "Lcom/tinder/toppicks/teasers/TopPicksTeasersPresenter;", "getPresenter", "()Lcom/tinder/toppicks/teasers/TopPicksTeasersPresenter;", "setPresenter", "(Lcom/tinder/toppicks/teasers/TopPicksTeasersPresenter;)V", "clearTeasers", "", "insertCards", "cards", "", "Lcom/tinder/cardstack/model/Card;", "onAttachedToWindow", "onDetachedFromWindow", "onPause", "onResume", "showPage", "page", "Lcom/tinder/toppicks/teasers/TopPicksTeasersView$Page;", "showPaywall", "imageUrls", "", "source", "Lcom/tinder/paywall/legacy/GoldPaywallSource;", "syncTeasers", "getTeasers", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "Page", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksTeasersView extends IdViewAnimator implements LifecycleObserver, TopPickTeasersGridTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C15299c f12523a;
    @Inject
    @NotNull
    /* renamed from: b */
    public LegacyPaywallLauncher f12524b;
    @Inject
    @NotNull
    /* renamed from: c */
    public Lifecycle f12525c;
    /* renamed from: d */
    private final View f12526d;
    /* renamed from: e */
    private final TeasersCardGridLayout f12527e;
    /* renamed from: f */
    private final TopPicksErrorView f12528f;

    public /* synthetic */ TopPicksTeasersView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksTeasersView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        ((TopPicksInjector$Factory) context).provideTopPicksInjector().inject(this);
        ViewAnimator.inflate(context, C15230f.view_top_pick_teasers, this);
        Object findViewById = findViewById(C15229e.top_picks_teasers_grid);
        C2668g.m10305a(findViewById, "findViewById(R.id.top_picks_teasers_grid)");
        this.f12527e = (TeasersCardGridLayout) findViewById;
        findViewById = findViewById(C15229e.get_tinder_gold);
        C2668g.m10305a(findViewById, "findViewById(R.id.get_tinder_gold)");
        this.f12526d = findViewById;
        findViewById = findViewById(C15229e.top_picks_teaser_error_view);
        C2668g.m10305a(findViewById, "findViewById(R.id.top_picks_teaser_error_view)");
        this.f12528f = (TopPicksErrorView) findViewById;
        setInAnimation(context, 17432576);
        setOutAnimation(context, 17432577);
        this.f12527e.setOnPreSwipeListener((OnPreSwipeListener) new TopPicksTeasersView$1(this));
        this.f12527e.addOnScrollListener(new C16988a((Function0) new TopPicksTeasersView$bottomPaywallListener$1(this)));
        this.f12527e.setOnCardClickedListener((Function1) new TopPicksTeasersView$2(this));
        this.f12526d.setOnClickListener((OnClickListener) new TopPicksTeasersView$3(this));
        this.f12528f.setOnTryAgainClickListener((Function1) new TopPicksTeasersView$4(this));
    }

    @NotNull
    public final C15299c getPresenter() {
        C15299c c15299c = this.f12523a;
        if (c15299c == null) {
            C2668g.m10310b("presenter");
        }
        return c15299c;
    }

    public final void setPresenter(@NotNull C15299c c15299c) {
        C2668g.m10309b(c15299c, "<set-?>");
        this.f12523a = c15299c;
    }

    @NotNull
    public final LegacyPaywallLauncher getLegacyPaywallLauncher() {
        LegacyPaywallLauncher legacyPaywallLauncher = this.f12524b;
        if (legacyPaywallLauncher == null) {
            C2668g.m10310b("legacyPaywallLauncher");
        }
        return legacyPaywallLauncher;
    }

    public final void setLegacyPaywallLauncher(@NotNull LegacyPaywallLauncher legacyPaywallLauncher) {
        C2668g.m10309b(legacyPaywallLauncher, "<set-?>");
        this.f12524b = legacyPaywallLauncher;
    }

    @NotNull
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.f12525c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        return lifecycle;
    }

    public final void setLifecycle(@NotNull Lifecycle lifecycle) {
        C2668g.m10309b(lifecycle, "<set-?>");
        this.f12525c = lifecycle;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Lifecycle lifecycle = this.f12525c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo36a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Lifecycle lifecycle = this.f12525c;
        if (lifecycle == null) {
            C2668g.m10310b("lifecycle");
        }
        lifecycle.mo37b(this);
        C15299c c15299c = this.f12523a;
        if (c15299c == null) {
            C2668g.m10310b("presenter");
        }
        c15299c.a();
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        C15299c c15299c = this.f12523a;
        if (c15299c == null) {
            C2668g.m10310b("presenter");
        }
        c15299c.a(this);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        C15299c c15299c = this.f12523a;
        if (c15299c == null) {
            C2668g.m10310b("presenter");
        }
        c15299c.a();
    }

    public void insertCards(@NotNull List<? extends C8395a<?>> list) {
        C2668g.m10309b(list, "cards");
        this.f12527e.a(list);
    }

    public void clearTeasers() {
        this.f12527e.e();
    }

    public void showPaywall(@NotNull List<String> list, @NotNull GoldPaywallSource goldPaywallSource) {
        C2668g.m10309b(list, "imageUrls");
        C2668g.m10309b(goldPaywallSource, "source");
        LegacyPaywallLauncher legacyPaywallLauncher = this.f12524b;
        if (legacyPaywallLauncher == null) {
            C2668g.m10310b("legacyPaywallLauncher");
        }
        PaywallTypeSource paywallTypeSource = goldPaywallSource;
        Object context = getContext();
        C2668g.m10305a(context, "context");
        goldPaywallSource = C15365p.b(context);
        if (goldPaywallSource == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        C10062a.a(legacyPaywallLauncher, paywallTypeSource, (Activity) goldPaywallSource, null, null, null, null, list, 60, null);
    }

    /* renamed from: a */
    private final List<TopPickTeaser> m15130a(@NotNull TeasersCardGridLayout teasersCardGridLayout) {
        Object adapter = teasersCardGridLayout.getAdapter();
        C2668g.m10305a(adapter, "this.adapter");
        Iterable b = C19068g.b(0, adapter.getItemCount());
        Collection arrayList = new ArrayList(C19301m.a(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Object a = teasersCardGridLayout.getAdapter().a(((ab) it).b());
            C2668g.m10305a(a, "this.adapter[it]");
            arrayList.add(a.getItem());
        }
        Collection collection = (Collection) new ArrayList();
        for (Object next : (List) arrayList) {
            if (next instanceof TopPickTeaser) {
                collection.add(next);
            }
        }
        return C19301m.l((List) collection);
    }

    public void syncTeasers() {
        C15299c c15299c = this.f12523a;
        if (c15299c == null) {
            C2668g.m10310b("presenter");
        }
        c15299c.b();
    }

    public void showPage(@NotNull TopPicksTeasersView$Page topPicksTeasersView$Page) {
        C2668g.m10309b(topPicksTeasersView$Page, "page");
        setDisplayedChildId(topPicksTeasersView$Page.getId());
    }
}
